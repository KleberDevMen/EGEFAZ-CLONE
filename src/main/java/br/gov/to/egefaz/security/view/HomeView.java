/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.to.egefaz.security.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author 06250631127
 */
@Named @RequestScoped
public class HomeView {
    
    public String deslogar() {
        return "login_1.?faces-redirect=true";
    }
    
}