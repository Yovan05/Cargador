/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.cargador.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.cargador.entities.Comment;
import mx.itson.cargador.entities.Post;
import mx.itson.cargador.entities.Replay;
import mx.itson.cargador.entities.User;

/**
 *
 * @author alexi
 */
public class Mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        User u1 = new User();
        u1.setAdmin(false);
        u1.setAge(18);
        u1.setEmail("yovanr129@gmail.com");
        u1.setName("Yovan Alexis");
        u1.setPassword("jajdgsjh");
        u1.setPhoneNumber("6221576585");
        
        User u2 = new User();
        u2.setAdmin(false);
        u2.setAge(20);
        u2.setEmail("gabrielgamer@gmail.com");
        u2.setName("Gabriel Maldonado");
        u2.setPassword("asjdljld");
        u2.setPhoneNumber("6221644957");
        
        User u3 = new User();
        u3.setAdmin(false);
        u3.setAge(34);
        u3.setEmail("lucy@gmail.com");
        u3.setName("Jose Reyez");
        u3.setPassword("jidsdsd");
        u3.setPhoneNumber("6221234567");
        
        User u4 = new User();
        u4.setAdmin(false);
        u4.setAge(31);
        u4.setEmail("laurav@gmail.com");
        u4.setName("Laura Valdez");
        u4.setPassword("kajsdkkug");
        u4.setPhoneNumber("6229876543");
        
        List<String> category1 = new ArrayList<>();
        category1.add("School");
        
        
        
        Comment c1 = new Comment();
        c1.setAuthor(u3);
        c1.setDescripcion("Yo creo que si te deberias de dar de baja");
        c1.setDate("17/10/2023");
        c1.setDontLike(0);
        c1.setLike(0);
        
        
        List<Comment> comments = new ArrayList<>();
        comments.add(c1);
        
        Replay r1 = new Replay();
        r1.setAuthor(u1);
        r1.setDescripcion("Probablemente, no creo poder pasar educacion fisica :C");
        r1.setDontLike(0);
        r1.setLike(3);
        r1.setDate("17/10/2023");
        r1.setComments(comments);
        
        Replay r2 = new Replay();
        r2.setAuthor(u2);
        r2.setDate("17/10/2023");
        r2.setDescripcion("Yo no creo, me va muy bien en educacion fisica");
        r2.setDontLike(2);
        r2.setLike(0);
        
        
        List<Replay> replays1 = new ArrayList<>();
        replays1.add(r1);
        replays1.add(r2);
        
        
        
        
        Post p1 = new Post();
        p1.setAuthor(u4);
        p1.setComment("Ya es temporada de bajas, ¿Se daran de baja?");
        p1.setCategory(category1);
        p1.setDate("17/10/2023");
        p1.setDontLike(2);
        p1.setLike(1);
        p1.setReplays(replays1);
        
        
        
        
       p1.post();
        
        
        
        
        
        
        
    }
    
}
