/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.dansys.playground.docker.web;

import de.dansys.playground.docker.ejb.ManagedBeanFactory;
import de.dansys.playground.docker.ejb.MessageBean;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.IOException;
import java.io.Serializable;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


/**
 *
 * @author alexdim
 */
@Named("pressButtonAction")
@ViewScoped
public class PressButtonAction implements Serializable
{
    private static final Logger logger = LoggerFactory.getLogger("de.dansys.playground.neugeschaeft.web.PressButtonAction"); 
    private final MessageBean messageBean; 
    
    public PressButtonAction() throws IOException
    {
        messageBean =  ManagedBeanFactory.getMessageBean();        
    }
    
    public void errorButtonAction()
    {
       logger.error("Error message");
        createMessage("Error message");
    }
    public void debugButtonAction()
    {
        logger.debug("Debug message");
        createMessage("Debug message");
    }
    public void infoButtonAction()
    {
        logger.info("Info message");
        createMessage("Info message");
    }
    public void warningButtonAction()
    {
        logger.warn("Warning message");
        createMessage("Warning message");
    }
    
    protected void createMessage(String message)
    {
        messageBean.addPair(message);
        FacesMessage msg = new FacesMessage(message);
        FacesContext.getCurrentInstance().addMessage(null, msg);         
    }    
}
