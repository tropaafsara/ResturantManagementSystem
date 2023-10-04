/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Jononi Computer
 */
public class User {
      private int tableno,tableid,chair;
    private String status, floor;
public User(int tableid, int tableno, int chair, String floor, String status)
    {
        this.tableno=tableno;
        this.tableid=tableid;
        this.chair=chair;
        this.floor=floor;
        this.status=status;
        
      
    }

   
    public int gettableid(){
        return tableid;
    }
    public int gettableno(){
        return tableno;
    }
    public int getchair(){
        return chair;
    }
    public String getfloor(){
        return floor;
    }
    public String getstatus(){
        return status;
    }
    
}
