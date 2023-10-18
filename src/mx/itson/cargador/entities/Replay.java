
package mx.itson.cargador.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexi
 */
public class Replay {
    
    private int id;
    private User author;
    private String description;
    private int like;
    private int dontLike;
    private List<Comment> comments = new ArrayList<>();
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
        return description;
    }

    /**
     * @param description the descripcion to set
     */
    public void setDescripcion(String description) {
        this.description = description;
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
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<Comment> comments) {
        this.comments = comments;
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
     * print the replay
     */
    public void replay(){
        System.out.println("|");
        System.out.println("|");
        System.out.println(this.author.getName());
        System.out.println(this.description);
        System.out.println("\t\t\t\t"+this.date);
        System.out.println(this.like+" Likes   "+this.dontLike+" dislike");
        if(!(this.comments.isEmpty())){
            for(Comment c : this.comments ){
                c.comment();
            }
        }else{
            System.out.println("---------------------------------------");
        }
    }
    
}
