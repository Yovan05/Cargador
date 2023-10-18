
package mx.itson.cargador.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexi
 */
public class Post {
    
    private int id;
    private User author;
    private String comment;
    private int like;
    private int dontLike;
    private String date;
    private List<String> category;
    private List<Replay> replays = new ArrayList<>();

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
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * @return the category
     */
    public List<String> getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(List<String> category) {
        this.category = category;
    }

    /**
     * @return the replays
     */
    public List<Replay> getReplays() {
        return replays;
    }

    /**
     * @param replays the replays to set
     */
    public void setReplays(List<Replay> replays) {
        this.replays = replays;
    }
    
    /**
     * print the post 
     */
    public void post(){
        
        String category = "";
        System.out.println(this.author.getName());
        System.out.println("Category: ");
        for(String c : this.category){
            category += c+"  ";
        }
        System.out.println(category);
        System.out.println(this.comment);
        System.out.println("\t\t\t\t"+this.date);
        System.out.println(this.like+" Likes   "+this.dontLike+" dislike");
        if(!(this.replays.isEmpty())){
            for(Replay r : this.replays ){
                r.replay();                
            }
        }
    }    
    
    
}
