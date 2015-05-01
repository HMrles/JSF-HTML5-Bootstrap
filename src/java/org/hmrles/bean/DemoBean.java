
package org.hmrles.bean;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author HMrles
 */

@Named
@SessionScoped
public class DemoBean implements Serializable{
    @Inject Test test;
    
    
    @NotEmpty(message = "El nombre no puede ser vacio")
    private String nombre;
    
    @NotEmpty(message = "El password no puede ser vacio")
    @Size(min = 5,message = "Minimo 5 Caracteres")
    private String password;
    
    @NotNull (message = "La fecha de nacimiento no puede ser vacio")
    @Past
    private Date dob;
    
    @NotEmpty (message = "El email no puede ser vacio")
    @Email
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public String submit(){
        try{
        
       // test.businesslogic(nombre,password,dob,email);
        }catch(ConstraintViolationException ex){
           //
            
            return null;
        }
        return "show";
    }

   
    
    
}
