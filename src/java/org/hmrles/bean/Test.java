/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hmrles.bean;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author HMrles
 */

@RequestScoped
public class Test {
    
    
     public String  businesslogic(@NotEmpty String nombre,
             @NotEmpty @Size(min = 5) String password,
             @NotNull @Past Date dob,
             @NotEmpty @Email String email) {
         
         
         //Hacer algo de logica
         
         return null;
         
    }
    
}
