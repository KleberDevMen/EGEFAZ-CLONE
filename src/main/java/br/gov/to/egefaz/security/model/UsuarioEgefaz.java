package br.gov.to.egefaz.security.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.gov.to.egefaz.security.domain.Escolaridade;
import br.gov.to.egefaz.security.domain.Sexo;
import br.gov.to.egefaz.security.domain.TipoUsuario;

@Entity
@NamedQueries({
    @NamedQuery(name = "UsuarioEgefaz.findByUsrCpf", query = "SELECT u FROM UsuarioEgefaz u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "UsuarioEgefaz.findByUsrCpfSenha", query = "select u from UsuarioEgefaz u where u.cpf = :cpf and u.senha = :senha")
})
public class UsuarioEgefaz implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private String cidade;

    //USUARIO
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;
    private Escolaridade escolaridade;
    private String celular;
    private String appMensagem;
    private String numeroAppMsg;
    @Lob
	private byte[] foto;
    private Boolean status;
    private Boolean permissaoAcesso;

    //USUARIO EXTERNO
    private String emailPessoal;
    private String senha;

    //ATRIBUTOS COMUNS AO VINCULO FUNCIONAL (CIDADAO E SERVIDOR)
    private String municipio;
    private String telefone;

    //ATRIBUTOS ESPECIFICOS - VINCULO FUNCIONAL CIDADAO
    private String empresaEmpregadora;
    private String funcaoNaEmpresa;

    //ATRIBUTOS ESPECIFICOS - VINCULO FUNCIONAL SERVIDOR
    private String orgao;
    private String lotacao;
    private String emailInstitucional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioEgefaz)) {
            return false;
        }
        UsuarioEgefaz other = (UsuarioEgefaz) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    



	@Override
	public String toString() {
		return "UsuarioEgefaz [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", cpf=" + cpf
				+ ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", tipoUsuario=" + tipoUsuario
				+ ", escolaridade=" + escolaridade + ", celular=" + celular + ", appMensagem=" + appMensagem
				+ ", numeroAppMsg=" + numeroAppMsg + ", status=" + status + ", permissaoAcesso=" + permissaoAcesso
				+ ", emailPessoal=" + emailPessoal + ", senha=" + senha + ", municipio=" + municipio + ", telefone="
				+ telefone + ", empresaEmpregadora=" + empresaEmpregadora + ", funcaoNaEmpresa=" + funcaoNaEmpresa
				+ ", orgao=" + orgao + ", lotacao=" + lotacao + ", emailInstitucional=" + emailInstitucional + "]";
	}
	

	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonLocked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAppMensagem() {
        return appMensagem;
    }

    public void setAppMensagem(String appMensagem) {
        this.appMensagem = appMensagem;
    }

    public String getNumeroAppMsg() {
        return numeroAppMsg;
    }

    public void setNumeroAppMsg(String numeroAppMsg) {
        this.numeroAppMsg = numeroAppMsg;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getPermissaoAcesso() {
        return permissaoAcesso;
    }

    public void setPermissaoAcesso(Boolean permissaoAcesso) {
        this.permissaoAcesso = permissaoAcesso;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmpresaEmpregadora() {
        return empresaEmpregadora;
    }

    public void setEmpresaEmpregadora(String empresaEmpregadora) {
        this.empresaEmpregadora = empresaEmpregadora;
    }

    public String getFuncaoNaEmpresa() {
        return funcaoNaEmpresa;
    }

    public void setFuncaoNaEmpresa(String funcaoNaEmpresa) {
        this.funcaoNaEmpresa = funcaoNaEmpresa;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

    
}
