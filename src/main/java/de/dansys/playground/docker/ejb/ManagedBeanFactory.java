package de.dansys.playground.docker.ejb;

import jakarta.faces.context.FacesContext;

public class ManagedBeanFactory
{
    private ManagedBeanFactory(){}

    public static MessageBean getMessageBean()
    {
        FacesContext context = FacesContext.getCurrentInstance();
        MessageBean bean = (MessageBean) context.getApplication().evaluateExpressionGet(context,"#{messageBean}", MessageBean.class);                                   
        if(bean == null)
                bean = new MessageBean ();

        return bean;
    }  
}
       
                