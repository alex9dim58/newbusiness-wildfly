package de.dansys.playground.docker.ejb;

import de.dansys.playground.docker.utils.Pair;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Named("messageBean")
@ViewScoped
public class MessageBean implements Serializable
{

    private static final long serialVersionUID = -5462443505981830153L;
    private List<Pair> pairs = new LinkedList<>();
    private final DateFormat formator  = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");	
	
//    public MessageBean()
//    {
//    	
//    }
    
    public List<Pair> getPairs() {
        return pairs;
    }

    /**
     * @param pairs the pairs to set
     */
    public void setPairs(List<Pair> pairs) {
        this.pairs = pairs;
    }
     
    public void addPair(String second)
    {
        Pair pair = new Pair();
        pair.setFirst(formator.format(new Date()));
        pair.setSecond(second);
        int configuredLineNumber = 10000;
    	if(configuredLineNumber == pairs.size())
    	{
            pairs.remove(pairs.size()-1);
    	}
        pairs.add(0,pair);
    }

    public void addPair(Pair pair)
    {
        pairs.add(0,pair);
    }

}
