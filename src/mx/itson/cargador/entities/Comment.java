/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cargador.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexi
 */
public class Comment {
    
    
    private int id;
    private User author;
    private String descripcion;
    private int like;
    private int dontLike;
    private List<Replay> replays = new ArrayList<>();
    private String date;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the author
     */
    public User getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(User author) {
        this.author = author;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the like
     */
    public int getLike() {
        return like;
    }

    /**
     * @param like the like to set
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * @return the dontLike
     */
    public int getDontLike() {
        return dontLike;
    }

    /**
     * @param dontLike the dontLike to set
     */
    public void setDontLike(int dontLike) {
        this.dontLike = dontLike;
    }

    /**
     * @return the comments
     */
    public List<Replay> getReplays() {
        return replays;
    }

    /**
     * @param replays the comments to set
     */
    public void setReplays(List<Replay> replays) {
        this.replays = replays;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * print the comment
     */
    public void comment(){
        System.out.println("|");
        System.out.println("|");
        System.out.println(this.author.getName());
        System.out.println(this.descripcion);
        System.out.println("\t\t\t\t"+this.date);
        System.out.println(this.like+" Likes   "+this.dontLike+" dislike");
        if(!(this.replays.isEmpty())){
            for(Replay r : this.replays ){
                r.replay();                
            }
        }else{
            System.out.println("---------------------------------------");
        }
        
    }
    
}
