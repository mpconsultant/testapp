/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngdemo.rest;

/**
 *
 * @author Malaya
 */
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class StringWrapper {
    public StringWrapper (){}

    List<String> Dlist=new ArrayList<String>();

    public void Dadd(String s){ 
        Dlist.add(s);
    }
    
    
    @XmlValue    
    public List<String> getData() { return Dlist; }
}