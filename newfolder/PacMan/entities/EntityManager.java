
package PacMan.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import PacMan.Handler;
import PacMan.entities.creature.Beast;
import PacMan.entities.creature.BeastUp;
import PacMan.entities.creature.Player;
import PacMan.entities.statics.Food;

public class EntityManager {
    
    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<>();

        if( handler.getGame().getWorldNumber() == 1 ){
            EntitiesOfWorld1();
        }
        else if(handler.getGame().getWorldNumber() == 2){
            EntitiesOfWorld2();
        }
        else {
            EntitiesOfWorld3();
        }
        
        
        addEntity(player);
    }
    
    
    public void tick()
    {
        for(int i = 0 ; i < entities.size() ; i++){
            Entity e = entities.get(i);
            e.tick();
            if(!e.isActive())
                entities.remove(e);
        }
    }
    
    public void render(Graphics g)
    {
        for(Entity e : entities){
            e.render(g);
        }
    }

    public void addEntity(Entity e)
    {
        entities.add(e);
    }
    
    
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    
    private void EntitiesOfWorld1(){
        
        
        //foodworld1
            addEntity(new Food(handler, 64, 128));
//        addEntity(new Food(handler, 110 , 128));
//        addEntity(new Food(handler, 164 , 128 ));
//        addEntity(new Food(handler, 228 , 128 ));
//        addEntity(new Food(handler, 292 , 128 ));
//        addEntity(new Food(handler, 356 , 128 ));
//        addEntity(new Food(handler, 420 , 128 ));
//        addEntity(new Food(handler, 484 , 128 ));
//        addEntity(new Food(handler, 548 , 128 ));
//        addEntity(new Food(handler, 612 , 128 ));
//        addEntity(new Food(handler, 676 , 128 ));
//        addEntity(new Food(handler, 740 , 128 ));
//        addEntity(new Food(handler, 804 , 128 ));
//        addEntity(new Food(handler, 868 , 128 ));
//        addEntity(new Food(handler, 932 , 128 ));
//        addEntity(new Food(handler, 996 , 128 ));
//        addEntity(new Food(handler, 1064 , 128 ));
//        addEntity(new Food(handler, 1128 , 128 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 384));
//        addEntity(new Food(handler, 128 , 384));
//        addEntity(new Food(handler, 256 , 384 ));
//        addEntity(new Food(handler, 320 , 384 ));
//        addEntity(new Food(handler, 448 , 384 ));
//        addEntity(new Food(handler, 512 , 384 ));
//        addEntity(new Food(handler, 576 , 384 ));
//        addEntity(new Food(handler, 640 , 384 ));
//        addEntity(new Food(handler, 704 , 384 ));
//        addEntity(new Food(handler, 768 , 384 ));
//        addEntity(new Food(handler, 832 , 384 ));
//        addEntity(new Food(handler, 964 , 384 ));
//        addEntity(new Food(handler, 1096 , 384 ));
//        addEntity(new Food(handler, 1150 , 384 ));
//        
//        
//        addEntity(new Food(handler, 64, 448));
//        addEntity(new Food(handler, 128 , 448));
//        addEntity(new Food(handler, 256 , 448 ));
//        addEntity(new Food(handler, 320 , 448 ));
//        addEntity(new Food(handler, 448 , 448 ));
//        addEntity(new Food(handler, 512 , 448 ));
//        addEntity(new Food(handler, 576 , 448 ));
//        addEntity(new Food(handler, 640 , 448 ));
//        addEntity(new Food(handler, 704 , 448 ));
//        addEntity(new Food(handler, 768 , 448 ));
//        addEntity(new Food(handler, 832 , 448 ));
//        addEntity(new Food(handler, 964 , 448 ));
//        addEntity(new Food(handler, 1096 , 448 ));
//        addEntity(new Food(handler, 1150 , 448 ));
//        
//        
//        addEntity(new Food(handler, 64, 704));
//        addEntity(new Food(handler, 128 , 704));
//        addEntity(new Food(handler, 256 , 704 ));
//        addEntity(new Food(handler, 320 , 704 ));
//        addEntity(new Food(handler, 448 , 704 ));
//        addEntity(new Food(handler, 512 , 704 ));
//        addEntity(new Food(handler, 576 , 704 ));
//        addEntity(new Food(handler, 640 , 704 ));
//        addEntity(new Food(handler, 704 , 704 ));
//        addEntity(new Food(handler, 768 , 704 ));
//        addEntity(new Food(handler, 832 , 704 ));
//        addEntity(new Food(handler, 964 , 704 ));
//        addEntity(new Food(handler, 1096 , 704 ));
//        addEntity(new Food(handler, 1150 , 704 ));
//        
//        
//        addEntity(new Food(handler, 64, 768));
//        addEntity(new Food(handler, 128 , 768));
//        addEntity(new Food(handler, 256 , 768 ));
//        addEntity(new Food(handler, 320 , 768 ));
//        addEntity(new Food(handler, 448 , 768 ));
//        addEntity(new Food(handler, 512 , 768 ));
//        addEntity(new Food(handler, 576 , 768 ));
//        addEntity(new Food(handler, 640 , 768 ));
//        addEntity(new Food(handler, 704 , 768 ));
//        addEntity(new Food(handler, 768 , 768 ));
//        addEntity(new Food(handler, 832 , 768 ));
//        addEntity(new Food(handler, 964 , 768 ));
//        addEntity(new Food(handler, 1096 , 768 ));
//        addEntity(new Food(handler, 1150 , 768 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 832));
//        addEntity(new Food(handler, 128 , 832));
//        addEntity(new Food(handler, 256 , 832 ));
//        addEntity(new Food(handler, 320 , 832 ));
//        addEntity(new Food(handler, 448 , 832 ));
//        addEntity(new Food(handler, 512 , 832 ));
//        addEntity(new Food(handler, 576 , 832 ));
//        addEntity(new Food(handler, 640 , 832 ));
//        addEntity(new Food(handler, 704 , 832 ));
//        addEntity(new Food(handler, 768 , 832 ));
//        addEntity(new Food(handler, 832 , 832 ));
//        addEntity(new Food(handler, 964 , 832 ));
//        addEntity(new Food(handler, 1096 , 832 ));
//        addEntity(new Food(handler, 1150 , 832 ));
//        
//        
//        addEntity(new Food(handler, 64, 1096));
//        addEntity(new Food(handler, 128 , 1096));
//        addEntity(new Food(handler, 192 , 1096));
//        addEntity(new Food(handler, 256 , 1096 ));
//        addEntity(new Food(handler, 320 , 1096 ));
//        addEntity(new Food(handler, 384 , 1096));
//        addEntity(new Food(handler, 448 , 1096 ));
//        addEntity(new Food(handler, 512 , 1096 ));
//        addEntity(new Food(handler, 576 , 1096 ));
//        addEntity(new Food(handler, 640 , 1096 ));
//        addEntity(new Food(handler, 704 , 1096 ));
//        addEntity(new Food(handler, 768 , 1096 ));
//        addEntity(new Food(handler, 832 , 1096 ));
//        addEntity(new Food(handler, 896 , 1096));
//        addEntity(new Food(handler, 964 , 1096 ));
//        addEntity(new Food(handler, 1028 , 1096));
//        addEntity(new Food(handler, 1096 , 1096 ));
//        addEntity(new Food(handler, 1150 , 1096 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 1150));
//        addEntity(new Food(handler, 128 , 1150));
//        addEntity(new Food(handler, 192 , 1150));
//        addEntity(new Food(handler, 256 , 1150 ));
//        addEntity(new Food(handler, 320 , 1150 ));
//        addEntity(new Food(handler, 384 , 1150));
//        addEntity(new Food(handler, 448 , 1150 ));
//        addEntity(new Food(handler, 512 , 1150 ));
//        addEntity(new Food(handler, 576 , 1150 ));
//        addEntity(new Food(handler, 640 , 1150 ));
//        addEntity(new Food(handler, 704 , 1150 ));
//        addEntity(new Food(handler, 768 , 1150 ));
//        addEntity(new Food(handler, 832 , 1150 ));
//        addEntity(new Food(handler, 896 , 1150));
//        addEntity(new Food(handler, 964 , 1150 ));
//        addEntity(new Food(handler, 1028 , 1150));
//        addEntity(new Food(handler, 1096 , 1150 ));
//        addEntity(new Food(handler, 1150 , 1150 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 512));
//        addEntity(new Food(handler, 128 , 512));
//        addEntity(new Food(handler, 192 , 512));
//        addEntity(new Food(handler, 256 , 512 ));
//        addEntity(new Food(handler, 320 , 512 ));
//        addEntity(new Food(handler, 448 , 512 ));
//        addEntity(new Food(handler, 512 , 512 ));
//        addEntity(new Food(handler, 576 , 512 ));
//        addEntity(new Food(handler, 640 , 512 ));
//        addEntity(new Food(handler, 704 , 512 ));
//        addEntity(new Food(handler, 768 , 512 ));
//        addEntity(new Food(handler, 832 , 512 ));
//        addEntity(new Food(handler, 964 , 512 ));
//        addEntity(new Food(handler, 1032 , 512));
//        addEntity(new Food(handler, 1096 , 512 ));
//        addEntity(new Food(handler, 1150 , 512 ));
//        
//        addEntity(new Food(handler, 64, 256));
//        addEntity(new Food(handler, 128 , 256));
//        addEntity(new Food(handler, 292 , 256 ));
//        addEntity(new Food(handler, 356 , 256 ));
//        addEntity(new Food(handler, 420 , 256 ));
//        addEntity(new Food(handler, 484 , 256 ));
//        addEntity(new Food(handler, 548 , 256 ));
//        addEntity(new Food(handler, 612 , 256 ));
//        addEntity(new Food(handler, 676 , 256 ));
//        addEntity(new Food(handler, 740 , 256 ));
//        addEntity(new Food(handler, 804 , 256 ));
//        addEntity(new Food(handler, 868 , 256 ));
//        addEntity(new Food(handler, 932 , 256 ));
//        addEntity(new Food(handler, 1096 , 256 ));
//        addEntity(new Food(handler, 1150 , 256 ));
//        
//        
//        addEntity(new Food(handler, 64, 576));
//        addEntity(new Food(handler, 110 , 576));
//        addEntity(new Food(handler, 164 , 576 ));
//        addEntity(new Food(handler, 228 , 576 ));
//        addEntity(new Food(handler, 292 , 576 ));
//        addEntity(new Food(handler, 356 , 576 ));
//        addEntity(new Food(handler, 420 , 576 ));
//        addEntity(new Food(handler, 484 , 576 ));
//        addEntity(new Food(handler, 548 , 576 ));
//        addEntity(new Food(handler, 740 , 576 ));
//        addEntity(new Food(handler, 804 , 576 ));
//        addEntity(new Food(handler, 868 , 576 ));
//        addEntity(new Food(handler, 932 , 576 ));
//        addEntity(new Food(handler, 996 , 576 ));
//        addEntity(new Food(handler, 1064 , 576 ));
//        addEntity(new Food(handler, 1128 , 576 ));
//        
//        
//        addEntity(new Food(handler, 64, 640));
//        addEntity(new Food(handler, 110 , 640));
//        addEntity(new Food(handler, 164 , 640 ));
//        addEntity(new Food(handler, 228 , 640 ));
//        addEntity(new Food(handler, 292 , 640 ));
//        addEntity(new Food(handler, 356 , 640 ));
//        addEntity(new Food(handler, 420 , 640 ));
//        addEntity(new Food(handler, 484 , 640 ));
//        addEntity(new Food(handler, 548 , 640 ));
//        addEntity(new Food(handler, 740 , 640 ));
//        addEntity(new Food(handler, 804 , 640 ));
//        addEntity(new Food(handler, 868 , 640 ));
//        addEntity(new Food(handler, 932 , 640 ));
//        addEntity(new Food(handler, 996 , 640 ));
//        addEntity(new Food(handler, 1064 , 640 ));
//        addEntity(new Food(handler, 1128 , 640 ));
//        
//        
//        addEntity(new Food(handler, 292 , 960 ));
//        addEntity(new Food(handler, 356 , 960 ));
//        addEntity(new Food(handler, 420 , 960 ));
//        addEntity(new Food(handler, 484 , 960 ));
//        addEntity(new Food(handler, 548 , 960 ));
//        addEntity(new Food(handler, 612 , 960 ));
//        addEntity(new Food(handler, 676 , 960 ));
//        addEntity(new Food(handler, 740 , 960 ));
//        addEntity(new Food(handler, 804 , 960 ));
//        addEntity(new Food(handler, 868 , 960 ));
//        addEntity(new Food(handler, 932 , 960 ));
        
    
        
        
        

        
        
        
        
        
//        besrtworld 1
    addEntity(new Beast(handler, 64 , 64 ));
        addEntity(new Beast(handler, 256, 256 ));
        addEntity(new Beast(handler, 64, 600));
        addEntity(new Beast(handler, 256, 960));
        addEntity(new Beast(handler, 960, 1152));
        addEntity(new BeastUp(handler , 64 , 164 ));
        addEntity(new BeastUp(handler , 640 , 64 ));
        addEntity(new BeastUp(handler , 320 , 320 ));
        addEntity(new BeastUp(handler , 960 , 320 ));
        addEntity(new BeastUp(handler , 1152 , 384 ));
        
    }
    
    
    private void EntitiesOfWorld2(){
        
        
        //Food 
        
        
        addEntity(new Food(handler, 64, 64));
//        addEntity(new Food(handler, 110 , 64));
//        addEntity(new Food(handler, 164 , 64 ));
//        addEntity(new Food(handler, 228 , 64 ));
//        addEntity(new Food(handler, 292 , 64 ));
//        addEntity(new Food(handler, 356 , 64 ));
//        addEntity(new Food(handler, 420 , 64 ));
//        addEntity(new Food(handler, 484 , 64 ));
//        addEntity(new Food(handler, 548 , 64 ));
//        addEntity(new Food(handler, 612 , 64 ));
//        addEntity(new Food(handler, 676 , 64 ));
//        addEntity(new Food(handler, 740 , 64 ));
//        addEntity(new Food(handler, 804 , 64 ));
//        addEntity(new Food(handler, 868 , 64 ));
//        addEntity(new Food(handler, 932 , 64 ));
//        addEntity(new Food(handler, 996 , 64 ));
//        addEntity(new Food(handler, 1064 , 64 ));
//        addEntity(new Food(handler, 1128 , 64 ));
//        
//        
//        addEntity(new Food(handler, 64, 128));
//        addEntity(new Food(handler, 110 , 128));
//        addEntity(new Food(handler, 164 , 128 ));
//        addEntity(new Food(handler, 228 , 128 ));
//        addEntity(new Food(handler, 292 , 128 ));
//        addEntity(new Food(handler, 356 , 128 ));
//        addEntity(new Food(handler, 420 , 128 ));
//        addEntity(new Food(handler, 484 , 128 ));
//        addEntity(new Food(handler, 548 , 128 ));
//        addEntity(new Food(handler, 612 , 128 ));
//        addEntity(new Food(handler, 676 , 128 ));
//        addEntity(new Food(handler, 740 , 128 ));
//        addEntity(new Food(handler, 804 , 128 ));
//        addEntity(new Food(handler, 868 , 128 ));
//        addEntity(new Food(handler, 932 , 128 ));
//        addEntity(new Food(handler, 996 , 128 ));
//        addEntity(new Food(handler, 1064 , 128 ));
//        addEntity(new Food(handler, 1128 , 128 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 384));
//        addEntity(new Food(handler, 128 , 384));
//        addEntity(new Food(handler, 256 , 384 ));
//        addEntity(new Food(handler, 320 , 384 ));
//        addEntity(new Food(handler, 448 , 384 ));
//        addEntity(new Food(handler, 512 , 384 ));
//        addEntity(new Food(handler, 576 , 384 ));
//        addEntity(new Food(handler, 640 , 384 ));
//        addEntity(new Food(handler, 704 , 384 ));
//        addEntity(new Food(handler, 768 , 384 ));
//        addEntity(new Food(handler, 964 , 384 ));
//        addEntity(new Food(handler, 1096 , 384 ));
//        addEntity(new Food(handler, 1150 , 384 ));
//        
//        
//        addEntity(new Food(handler, 64, 448));
//        addEntity(new Food(handler, 128 , 448));
//        addEntity(new Food(handler, 256 , 448 ));
//        addEntity(new Food(handler, 320 , 448 ));
//        addEntity(new Food(handler, 448 , 448 ));
//        addEntity(new Food(handler, 512 , 448 ));
//        addEntity(new Food(handler, 576 , 448 ));
//        addEntity(new Food(handler, 640 , 448 ));
//        addEntity(new Food(handler, 704 , 448 ));
//        addEntity(new Food(handler, 768 , 448 ));
//        addEntity(new Food(handler, 832 , 448 ));
//        addEntity(new Food(handler, 964 , 448 ));
//        addEntity(new Food(handler, 1096 , 448 ));
//        addEntity(new Food(handler, 1150 , 448 ));
//        
//        
//        addEntity(new Food(handler, 64, 704));
//        addEntity(new Food(handler, 128 , 704));
//        addEntity(new Food(handler, 256 , 704 ));
//        addEntity(new Food(handler, 320 , 704 ));
//        addEntity(new Food(handler, 448 , 704 ));
//        addEntity(new Food(handler, 512 , 704 ));
//        addEntity(new Food(handler, 576 , 704 ));
//        addEntity(new Food(handler, 640 , 704 ));
//        addEntity(new Food(handler, 704 , 704 ));
//        addEntity(new Food(handler, 768 , 704 ));
//        addEntity(new Food(handler, 832 , 704 ));
//        addEntity(new Food(handler, 964 , 704 ));
//        addEntity(new Food(handler, 1096 , 704 ));
//        addEntity(new Food(handler, 1150 , 704 ));
//        
//        
//        addEntity(new Food(handler, 64, 768));
//        addEntity(new Food(handler, 128 , 768));
//        addEntity(new Food(handler, 256 , 768 ));
//        addEntity(new Food(handler, 640 , 768 ));
//        addEntity(new Food(handler, 964 , 768 ));
//        addEntity(new Food(handler, 1096 , 768 ));
//        addEntity(new Food(handler, 1150 , 768 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 832));
//        addEntity(new Food(handler, 128 , 832));
//        addEntity(new Food(handler, 256 , 832 ));
//        addEntity(new Food(handler, 320 , 832 ));
//        addEntity(new Food(handler, 448 , 832 ));
//        addEntity(new Food(handler, 512 , 832 ));
//        addEntity(new Food(handler, 576 , 832 ));
//        addEntity(new Food(handler, 640 , 832 ));
//        addEntity(new Food(handler, 704 , 832 ));
//        addEntity(new Food(handler, 768 , 832 ));
//        addEntity(new Food(handler, 964 , 832 ));
//        addEntity(new Food(handler, 1096 , 832 ));
//        addEntity(new Food(handler, 1150 , 832 ));
//        
//        
//        addEntity(new Food(handler, 64, 1150));
//        addEntity(new Food(handler, 128 , 1150));
//        addEntity(new Food(handler, 192 , 1150));
//        addEntity(new Food(handler, 256 , 1150 ));
//        addEntity(new Food(handler, 320 , 1150 ));
//        addEntity(new Food(handler, 384 , 1150));
//        addEntity(new Food(handler, 448 , 1150 ));
//        addEntity(new Food(handler, 512 , 1150 ));
//        addEntity(new Food(handler, 576 , 1150 ));
//        addEntity(new Food(handler, 640 , 1150 ));
//        addEntity(new Food(handler, 704 , 1150 ));
//        addEntity(new Food(handler, 768 , 1150 ));
//        addEntity(new Food(handler, 832 , 1150 ));
//        addEntity(new Food(handler, 896 , 1150));
//        addEntity(new Food(handler, 964 , 1150 ));
//        addEntity(new Food(handler, 1028 , 1150));
//        addEntity(new Food(handler, 1096 , 1150 ));
//        addEntity(new Food(handler, 1150 , 1150 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 1214));
//        addEntity(new Food(handler, 128 , 1214));
//        addEntity(new Food(handler, 192 , 1214));
//        addEntity(new Food(handler, 256 , 1214 ));
//        addEntity(new Food(handler, 320 , 1214 ));
//        addEntity(new Food(handler, 384 , 1214));
//        addEntity(new Food(handler, 448 , 1214 ));
//        addEntity(new Food(handler, 512 , 1214 ));
//        addEntity(new Food(handler, 576 , 1214 ));
//        addEntity(new Food(handler, 640 , 1214 ));
//        addEntity(new Food(handler, 704 , 1214 ));
//        addEntity(new Food(handler, 768 , 1214 ));
//        addEntity(new Food(handler, 832 , 1214 ));
//        addEntity(new Food(handler, 896 , 1214));
//        addEntity(new Food(handler, 964 , 1214 ));
//        addEntity(new Food(handler, 1028 , 1214));
//        addEntity(new Food(handler, 1096 , 1214 ));
//        addEntity(new Food(handler, 1150 , 1214 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 512));
//        addEntity(new Food(handler, 128 , 512));
//        addEntity(new Food(handler, 256 , 512 ));
//        addEntity(new Food(handler, 640 , 512 ));
//        addEntity(new Food(handler, 964 , 512 ));
//        addEntity(new Food(handler, 1096 , 512 ));
//        addEntity(new Food(handler, 1150 , 512 ));
//        
//        addEntity(new Food(handler, 64, 256));
//        addEntity(new Food(handler, 128 , 256));
//        addEntity(new Food(handler, 484 , 256 ));
//        addEntity(new Food(handler, 548 , 256 ));
//        addEntity(new Food(handler, 612 , 256 ));
//        addEntity(new Food(handler, 676 , 256 ));
//        addEntity(new Food(handler, 740 , 256 ));
//        addEntity(new Food(handler, 932 , 256 ));
//        addEntity(new Food(handler, 1096 , 256 ));
//        addEntity(new Food(handler, 1150 , 256 ));
//        
//        
//        addEntity(new Food(handler, 64, 576));
//        addEntity(new Food(handler, 110 , 576));
//        addEntity(new Food(handler, 292 , 576 ));
//        addEntity(new Food(handler, 356 , 576 ));
//        addEntity(new Food(handler, 420 , 576 ));
//        addEntity(new Food(handler, 484 , 576 ));
//        addEntity(new Food(handler, 548 , 576 ));
//        addEntity(new Food(handler, 740 , 576 ));
//        addEntity(new Food(handler, 804 , 576 ));
//        addEntity(new Food(handler, 868 , 576 ));
//        addEntity(new Food(handler, 932 , 576 ));
//        addEntity(new Food(handler, 1128 , 576 ));
//        
//        
//        addEntity(new Food(handler, 64, 640));
//        addEntity(new Food(handler, 110 , 640));
//        addEntity(new Food(handler, 292 , 640 ));
//        addEntity(new Food(handler, 356 , 640 ));
//        addEntity(new Food(handler, 420 , 640 ));
//        addEntity(new Food(handler, 484 , 640 ));
//        addEntity(new Food(handler, 548 , 640 ));
//        addEntity(new Food(handler, 740 , 640 ));
//        addEntity(new Food(handler, 804 , 640 ));
//        addEntity(new Food(handler, 868 , 640 ));
//        addEntity(new Food(handler, 932 , 640 ));
//        addEntity(new Food(handler, 996 , 640 ));
//        addEntity(new Food(handler, 1064 , 640 ));
//        addEntity(new Food(handler, 1128 , 640 ));
//        
//        
//        addEntity(new Food(handler, 292 , 960 ));
//        addEntity(new Food(handler, 484 , 960 ));
//        addEntity(new Food(handler, 548 , 960 ));
//        addEntity(new Food(handler, 612 , 960 ));
//        addEntity(new Food(handler, 676 , 960 ));
//        addEntity(new Food(handler, 740 , 960 ));
//        addEntity(new Food(handler, 932 , 960 ));
        
        
        
        
        
        //Beasts
        
        
        addEntity(new Beast(handler, 64 , 64 ));
        addEntity(new Beast(handler, 420, 320 ));
        addEntity(new Beast(handler, 64, 640));
        addEntity(new Beast(handler, 420, 896));
        addEntity(new Beast(handler, 960, 1152));
        addEntity(new BeastUp(handler , 64 , 164 ));
        addEntity(new BeastUp(handler , 640 , 64 ));
        addEntity(new BeastUp(handler , 256 , 320 ));
        addEntity(new BeastUp(handler , 960 , 320 ));
        addEntity(new BeastUp(handler , 1152 , 384 ));
        
    }

    private void EntitiesOfWorld3() {
        //Food 
        
        
        addEntity(new Food(handler, 64, 64));
//        addEntity(new Food(handler, 110 , 64));
//        addEntity(new Food(handler, 164 , 64 ));
//        addEntity(new Food(handler, 228 , 64 ));
//        addEntity(new Food(handler, 292 , 64 ));
//        addEntity(new Food(handler, 356 , 64 ));
//        addEntity(new Food(handler, 420 , 64 ));
//        addEntity(new Food(handler, 484 , 64 ));
//        addEntity(new Food(handler, 548 , 64 ));
//        addEntity(new Food(handler, 612 , 64 ));
//        addEntity(new Food(handler, 676 , 64 ));
//        addEntity(new Food(handler, 740 , 64 ));
//        addEntity(new Food(handler, 804 , 64 ));
//        addEntity(new Food(handler, 868 , 64 ));
//        addEntity(new Food(handler, 932 , 64 ));
//        addEntity(new Food(handler, 996 , 64 ));
//        addEntity(new Food(handler, 1064 , 64 ));
//        addEntity(new Food(handler, 1128 , 64 ));
//        addEntity(new Food(handler, 1192 , 64 ));
//        addEntity(new Food(handler, 1256 , 64 ));
//        addEntity(new Food(handler, 1320 , 64 ));
//        addEntity(new Food(handler, 1384 , 64 ));
//        addEntity(new Food(handler, 1448 , 64 ));
//        addEntity(new Food(handler, 1512 , 64 ));
//        addEntity(new Food(handler, 1576 , 64 ));
//        addEntity(new Food(handler, 1640 , 64 ));
//        addEntity(new Food(handler, 1704 , 64 ));
//        addEntity(new Food(handler, 1788 , 64 ));
//        
//        addEntity(new Food(handler, 64 , 128 ));
//        addEntity(new Food(handler, 834 , 128 ));
//        addEntity(new Food(handler, 898 , 128 ));
//        addEntity(new Food(handler, 962 , 128 ));
//        addEntity(new Food(handler, 1036, 128 ));
//        addEntity(new Food(handler, 1788, 128 ));
//        
//        
//        addEntity(new Food(handler, 64 , 192 ));
//        addEntity(new Food(handler, 184 , 192 ));
//        addEntity(new Food(handler, 228 , 192 ));
//        addEntity(new Food(handler, 292 , 192 ));
//        addEntity(new Food(handler, 356 , 192 ));
//        addEntity(new Food(handler, 420 , 192 ));
//        addEntity(new Food(handler, 484 , 192 ));
//        addEntity(new Food(handler, 548 , 192 ));
//        addEntity(new Food(handler, 612 , 192 ));
//        addEntity(new Food(handler, 676 , 192));
//        addEntity(new Food(handler, 740 , 192 ));
//        addEntity(new Food(handler, 804 , 192 ));
//        addEntity(new Food(handler, 868 , 192 ));
//        addEntity(new Food(handler, 932 , 192 ));
//        addEntity(new Food(handler, 996 , 192 ));
//        addEntity(new Food(handler, 1064 , 192 ));
//        addEntity(new Food(handler, 1128 , 192 ));
//        addEntity(new Food(handler, 1192 , 192 ));
//        addEntity(new Food(handler, 1256 , 192 ));
//        addEntity(new Food(handler, 1320 , 192 ));
//        addEntity(new Food(handler, 1384 , 192 ));
//        addEntity(new Food(handler, 1448 , 192 ));
//        addEntity(new Food(handler, 1512 , 192 ));
//        addEntity(new Food(handler, 1576 , 192 ));
//        addEntity(new Food(handler, 1630 , 192 ));
//        addEntity(new Food(handler, 1680 , 192 ));
//        addEntity(new Food(handler, 1788 , 192 ));
//        
//        addEntity(new Food(handler, 64 , 256 ));
//        addEntity(new Food(handler, 184 , 256 ));
//        addEntity(new Food(handler, 238 , 256 ));
//        addEntity(new Food(handler, 292 , 256 ));
//        addEntity(new Food(handler, 356 , 256 ));
//        addEntity(new Food(handler, 420 , 256 ));
//        addEntity(new Food(handler, 484 , 256 ));
//        addEntity(new Food(handler, 548 , 256 ));
//        addEntity(new Food(handler, 612 , 256 ));
//        addEntity(new Food(handler, 676 , 256));
//        addEntity(new Food(handler, 740 , 256 ));
//        addEntity(new Food(handler, 804 , 256 ));
//        addEntity(new Food(handler, 868 , 256 ));
//        addEntity(new Food(handler, 932 , 256 ));
//        addEntity(new Food(handler, 996 , 256 ));
//        addEntity(new Food(handler, 1064 , 256 ));
//        addEntity(new Food(handler, 1128 , 256 ));
//        addEntity(new Food(handler, 1192 , 256 ));
//        addEntity(new Food(handler, 1256 , 256 ));
//        addEntity(new Food(handler, 1320 , 256 ));
//        addEntity(new Food(handler, 1384 , 256 ));
//        addEntity(new Food(handler, 1448 , 256 ));
//        addEntity(new Food(handler, 1512 , 256 ));
//        addEntity(new Food(handler, 1576 , 256 ));
//        addEntity(new Food(handler, 1630 , 256 ));
//        addEntity(new Food(handler, 1680 , 256 ));
//        addEntity(new Food(handler, 1788 , 256 ));
//        
//        
//        addEntity(new Food(handler, 64 , 320 ));
//        addEntity(new Food(handler, 184 , 320 ));
//        addEntity(new Food(handler, 238 , 320 ));
//        addEntity(new Food(handler, 1630 , 320 ));
//        addEntity(new Food(handler, 1680 , 320 ));
//        addEntity(new Food(handler, 1788 , 320 ));
//        
//        
//        addEntity(new Food(handler, 64 , 384 ));
//        addEntity(new Food(handler, 184 , 384 ));
//        addEntity(new Food(handler, 238 , 384 ));
//        addEntity(new Food(handler, 420 , 384 ));
//        addEntity(new Food(handler, 484 , 384 ));
//        addEntity(new Food(handler, 548 , 384 ));
//        addEntity(new Food(handler, 612 , 384 ));
//        addEntity(new Food(handler, 676 , 384));
//        addEntity(new Food(handler, 740 , 384 ));
//        addEntity(new Food(handler, 804 , 384 ));
//        addEntity(new Food(handler, 868 , 384 ));
//        addEntity(new Food(handler, 932 , 384 ));
//        addEntity(new Food(handler, 996 , 384 ));
//        addEntity(new Food(handler, 1064 , 384 ));
//        addEntity(new Food(handler, 1128 , 384 ));
//        addEntity(new Food(handler, 1192 , 384 ));
//        addEntity(new Food(handler, 1256 , 384 ));
//        addEntity(new Food(handler, 1320 , 384 ));
//        addEntity(new Food(handler, 1384 , 384 ));
//        addEntity(new Food(handler, 1448 , 384 ));
//        addEntity(new Food(handler, 1630 , 384 ));
//        addEntity(new Food(handler, 1680 , 384 ));
//        addEntity(new Food(handler, 1788 , 384 ));
//        
//        
//        addEntity(new Food(handler, 64 , 448 ));
//        addEntity(new Food(handler, 128 , 448 ));
//        addEntity(new Food(handler, 184 , 448 ));
//        addEntity(new Food(handler, 238 , 448 ));
//        addEntity(new Food(handler, 390 , 448 ));
//        addEntity(new Food(handler, 704 , 448 ));
//        addEntity(new Food(handler, 768 , 448 ));
//        addEntity(new Food(handler, 1088 , 448 ));
//        addEntity(new Food(handler, 1152 , 448 ));
//        addEntity(new Food(handler, 1468 , 448 ));
//        addEntity(new Food(handler, 1630 , 448 ));
//        addEntity(new Food(handler, 1680 , 448 ));
//        addEntity(new Food(handler, 1734 , 448 ));
//        addEntity(new Food(handler, 1788 , 448 ));
//        
//        
//        addEntity(new Food(handler, 64 , 512 ));
//        addEntity(new Food(handler, 184 , 512 ));
//        addEntity(new Food(handler, 238 , 512 ));
//        addEntity(new Food(handler, 390 , 512 ));
//        addEntity(new Food(handler, 704 , 512 ));
//        addEntity(new Food(handler, 768 , 512 ));
//        addEntity(new Food(handler, 1088 , 512 ));
//        addEntity(new Food(handler, 1152 , 512 ));
//        addEntity(new Food(handler, 1468 , 512 ));
//        addEntity(new Food(handler, 1630 , 512 ));
//        addEntity(new Food(handler, 1680 , 512 ));
//        addEntity(new Food(handler, 1788 , 512 ));
//        
//        
//        addEntity(new Food(handler, 64 , 576 ));
//        addEntity(new Food(handler, 184 , 576 ));
//        addEntity(new Food(handler, 238 , 576 ));
//        addEntity(new Food(handler, 390 , 576 ));
//        addEntity(new Food(handler, 704 , 576 ));
//        addEntity(new Food(handler, 768 , 576 ));
//        addEntity(new Food(handler, 1088 , 576 ));
//        addEntity(new Food(handler, 1152 , 576 ));
//        addEntity(new Food(handler, 1468 , 576 ));
//        addEntity(new Food(handler, 1630 , 576 ));
//        addEntity(new Food(handler, 1680 , 576 ));
//        addEntity(new Food(handler, 1788 , 576 ));
//        
//        
//        addEntity(new Food(handler, 64 , 640 ));
//        addEntity(new Food(handler, 184 , 640 ));
//        addEntity(new Food(handler, 238 , 640 ));
//        addEntity(new Food(handler, 390 , 640 ));
//        addEntity(new Food(handler, 704 , 640 ));
//        addEntity(new Food(handler, 768 , 640 ));
//        addEntity(new Food(handler, 1088 , 640 ));
//        addEntity(new Food(handler, 1152 , 640 ));
//        addEntity(new Food(handler, 1468 , 640 ));
//        addEntity(new Food(handler, 1630 , 640 ));
//        addEntity(new Food(handler, 1680 , 640 ));
//        addEntity(new Food(handler, 1788 , 640));
//        
//        
//        addEntity(new Food(handler, 64 , 704 ));
//        addEntity(new Food(handler, 184 , 704 ));
//        addEntity(new Food(handler, 238 , 704 ));
//        addEntity(new Food(handler, 390 , 704 ));
//        addEntity(new Food(handler, 704 , 704 ));
//        addEntity(new Food(handler, 768 , 704 ));
//        addEntity(new Food(handler, 1088 , 704 ));
//        addEntity(new Food(handler, 1152 , 704 ));
//        addEntity(new Food(handler, 1468 , 704 ));
//        addEntity(new Food(handler, 1630 , 704 ));
//        addEntity(new Food(handler, 1680 , 704 ));
//        addEntity(new Food(handler, 1788 , 704));
//        
//        
//        addEntity(new Food(handler, 64 , 768 ));
//        addEntity(new Food(handler, 184 , 768 ));
//        addEntity(new Food(handler, 238 , 768 ));
//        addEntity(new Food(handler, 390 , 768 ));
//        addEntity(new Food(handler, 1468 , 768 ));
//        addEntity(new Food(handler, 1630 , 768 ));
//        addEntity(new Food(handler, 1680 , 768 ));
//        addEntity(new Food(handler, 1788 , 768));
//        
//        
//        addEntity(new Food(handler, 64, 832));
//        addEntity(new Food(handler, 184 , 832 ));
//        addEntity(new Food(handler, 238 , 832 ));
//        addEntity(new Food(handler, 292 , 832 ));
//        addEntity(new Food(handler, 356 , 832 ));
//        addEntity(new Food(handler, 420 , 832 ));
//        addEntity(new Food(handler, 484 , 832 ));
//        addEntity(new Food(handler, 548 , 832 ));
//        addEntity(new Food(handler, 612 , 832 ));
//        addEntity(new Food(handler, 676 , 832 ));
//        addEntity(new Food(handler, 740 , 832 ));
//        addEntity(new Food(handler, 804 , 832 ));
//        addEntity(new Food(handler, 868 , 832 ));
//        addEntity(new Food(handler, 932 , 832 ));
//        addEntity(new Food(handler, 996 , 832 ));
//        addEntity(new Food(handler, 1064 , 832));
//        addEntity(new Food(handler, 1128 , 832 ));
//        addEntity(new Food(handler, 1192 , 832 ));
//        addEntity(new Food(handler, 1256 , 832 ));
//        addEntity(new Food(handler, 1320 , 832 ));
//        addEntity(new Food(handler, 1384 , 832 ));
//        addEntity(new Food(handler, 1448 , 832 ));
//        addEntity(new Food(handler, 1512 , 832));
//        addEntity(new Food(handler, 1576 , 832 ));
//        addEntity(new Food(handler, 1630 , 832 ));
//        addEntity(new Food(handler, 1680 , 832 ));
//        addEntity(new Food(handler, 1788 , 832 ));
//        
//        addEntity(new Food(handler, 64, 896));
//        addEntity(new Food(handler, 184 , 896 ));
//        addEntity(new Food(handler, 238 , 896 ));
//        addEntity(new Food(handler, 292 , 896 ));
//        addEntity(new Food(handler, 356 , 896 ));
//        addEntity(new Food(handler, 420 , 896 ));
//        addEntity(new Food(handler, 484 , 896 ));
//        addEntity(new Food(handler, 548 , 896 ));
//        addEntity(new Food(handler, 612 , 896 ));
//        addEntity(new Food(handler, 676 , 896 ));
//        addEntity(new Food(handler, 740 , 896 ));
//        addEntity(new Food(handler, 804 , 896 ));
//        addEntity(new Food(handler, 868 , 896 ));
//        addEntity(new Food(handler, 932 , 896 ));
//        addEntity(new Food(handler, 996 , 896));
//        addEntity(new Food(handler, 1064 , 896));
//        addEntity(new Food(handler, 1128 , 896 ));
//        addEntity(new Food(handler, 1192 , 896 ));
//        addEntity(new Food(handler, 1256 , 896 ));
//        addEntity(new Food(handler, 1320 , 896 ));
//        addEntity(new Food(handler, 1384 , 896 ));
//        addEntity(new Food(handler, 1448 , 896 ));
//        addEntity(new Food(handler, 1512 , 896));
//        addEntity(new Food(handler, 1576 , 896 ));
//        addEntity(new Food(handler, 1630 , 896 ));
//        addEntity(new Food(handler, 1680 , 896 ));
//        addEntity(new Food(handler, 1788 , 896 ));
//        
//        
//        addEntity(new Food(handler, 64, 960));
//        addEntity(new Food(handler, 184 , 960 ));
//        addEntity(new Food(handler, 238 , 960 ));
//        addEntity(new Food(handler, 292 , 960 ));
//        addEntity(new Food(handler, 356 , 960 ));
//        addEntity(new Food(handler, 420 , 960 ));
//        addEntity(new Food(handler, 484 , 960 ));
//        addEntity(new Food(handler, 548 , 960 ));
//        addEntity(new Food(handler, 612 , 960 ));
//        addEntity(new Food(handler, 676 , 960 ));
//        addEntity(new Food(handler, 740 , 960 ));
//        addEntity(new Food(handler, 804 , 960 ));
//        addEntity(new Food(handler, 868 , 960 ));
//        addEntity(new Food(handler, 932 , 960 ));
//        addEntity(new Food(handler, 996 , 960));
//        addEntity(new Food(handler, 1064 , 960));
//        addEntity(new Food(handler, 1128 , 960 ));
//        addEntity(new Food(handler, 1192 , 960 ));
//        addEntity(new Food(handler, 1256 , 960 ));
//        addEntity(new Food(handler, 1320 , 960 ));
//        addEntity(new Food(handler, 1384 , 960 ));
//        addEntity(new Food(handler, 1448 , 960 ));
//        addEntity(new Food(handler, 1512 , 960));
//        addEntity(new Food(handler, 1576 , 960 ));
//        addEntity(new Food(handler, 1630 , 960 ));
//        addEntity(new Food(handler, 1680 , 960 ));
//        addEntity(new Food(handler, 1788 , 960 ));
//        
//        
//        addEntity(new Food(handler, 64, 1024));
//        addEntity(new Food(handler, 184 , 1024 ));
//        addEntity(new Food(handler, 238 , 1024 ));
//        addEntity(new Food(handler, 292 , 1024 ));
//        addEntity(new Food(handler, 356 , 1024 ));
//        addEntity(new Food(handler, 420 , 1024 ));
//        addEntity(new Food(handler, 484 , 1024 ));
//        addEntity(new Food(handler, 548 , 1024 ));
//        addEntity(new Food(handler, 612 , 1024 ));
//        addEntity(new Food(handler, 676 , 1024 ));
//        addEntity(new Food(handler, 740 , 1024 ));
//        addEntity(new Food(handler, 804 , 1024 ));
//        addEntity(new Food(handler, 868 , 1024 ));
//        addEntity(new Food(handler, 932 , 1024 ));
//        addEntity(new Food(handler, 996 , 1024));
//        addEntity(new Food(handler, 1064 , 1024));
//        addEntity(new Food(handler, 1128 , 1024 ));
//        addEntity(new Food(handler, 1192 , 1024 ));
//        addEntity(new Food(handler, 1256 , 1024 ));
//        addEntity(new Food(handler, 1320 , 1024 ));
//        addEntity(new Food(handler, 1384 , 1024 ));
//        addEntity(new Food(handler, 1448 , 1024 ));
//        addEntity(new Food(handler, 1512 , 1024));
//        addEntity(new Food(handler, 1576 , 1024 ));
//        addEntity(new Food(handler, 1630 , 1024 ));
//        addEntity(new Food(handler, 1680 , 1024 ));
//        addEntity(new Food(handler, 1788 , 1024 ));
//        
//        
//        addEntity(new Food(handler, 64 ,1088 ));
//        addEntity(new Food(handler, 184 , 1088 ));
//        addEntity(new Food(handler, 238 , 1088 ));
//        addEntity(new Food(handler, 390 , 1088 ));
//        addEntity(new Food(handler, 512 , 1088 ));
//        addEntity(new Food(handler, 576 , 1088 ));
//        addEntity(new Food(handler, 896 , 1088 ));
//        addEntity(new Food(handler, 960 , 1088 ));
//        addEntity(new Food(handler, 1280 , 1088 ));
//        addEntity(new Food(handler, 1354 , 1088 ));
//        addEntity(new Food(handler, 1468 , 1088 ));
//        addEntity(new Food(handler, 1630 , 1088 ));
//        addEntity(new Food(handler, 1680 , 1088 ));
//        addEntity(new Food(handler, 1788 , 1088));
//        
//        
//        addEntity(new Food(handler, 64 ,1152 ));
//        addEntity(new Food(handler, 184 , 1152 ));
//        addEntity(new Food(handler, 238 , 1152 ));
//        addEntity(new Food(handler, 390 , 1152 ));
//        addEntity(new Food(handler, 512 , 1152 ));
//        addEntity(new Food(handler, 576 , 1152 ));
//        addEntity(new Food(handler, 896 , 1152 ));
//        addEntity(new Food(handler, 960 , 1152 ));
//        addEntity(new Food(handler, 1280 , 1152 ));
//        addEntity(new Food(handler, 1354 , 1152 ));
//        addEntity(new Food(handler, 1468 , 1152 ));
//        addEntity(new Food(handler, 1630 , 1152 ));
//        addEntity(new Food(handler, 1680 , 1152 ));
//        addEntity(new Food(handler, 1788 , 1152 ));
//        
//        
//        addEntity(new Food(handler, 64 ,1216 ));
//        addEntity(new Food(handler, 184 , 1216 ));
//        addEntity(new Food(handler, 238 , 1216 ));
//        addEntity(new Food(handler, 390 , 1216 ));
//        addEntity(new Food(handler, 512 , 1216 ));
//        addEntity(new Food(handler, 576 , 1216 ));
//        addEntity(new Food(handler, 896 , 1216 ));
//        addEntity(new Food(handler, 960 , 1216 ));
//        addEntity(new Food(handler, 1280 , 1216 ));
//        addEntity(new Food(handler, 1354 , 1216 ));
//        addEntity(new Food(handler, 1468 , 1216 ));
//        addEntity(new Food(handler, 1630 , 1216 ));
//        addEntity(new Food(handler, 1680 , 1216 ));
//        addEntity(new Food(handler, 1788 , 1216 ));
//        
//        addEntity(new Food(handler, 64 ,1280 ));
//        addEntity(new Food(handler, 184 , 1280 ));
//        addEntity(new Food(handler, 238 , 1280 ));
//        addEntity(new Food(handler, 390 , 1280 ));
//        addEntity(new Food(handler, 512 , 1280 ));
//        addEntity(new Food(handler, 576 , 1280 ));
//        addEntity(new Food(handler, 896 , 1280 ));
//        addEntity(new Food(handler, 960 , 1280 ));
//        addEntity(new Food(handler, 1280 , 1280 ));
//        addEntity(new Food(handler, 1354 , 1280 ));
//        addEntity(new Food(handler, 1468 , 1280 ));
//        addEntity(new Food(handler, 1630 , 1280 ));
//        addEntity(new Food(handler, 1680 , 1280 ));
//        addEntity(new Food(handler, 1788 , 1280 ));
//        
//        
//        addEntity(new Food(handler, 64 ,1344 ));
//        addEntity(new Food(handler, 184 , 1344 ));
//        addEntity(new Food(handler, 238 , 1344 ));
//        addEntity(new Food(handler, 390 , 1344 ));
//        addEntity(new Food(handler, 512 , 1344 ));
//        addEntity(new Food(handler, 576 , 1344 ));
//        addEntity(new Food(handler, 896 , 1344 ));
//        addEntity(new Food(handler, 960 , 1344 ));
//        addEntity(new Food(handler, 1280 , 1344 ));
//        addEntity(new Food(handler, 1354 , 1344 ));
//        addEntity(new Food(handler, 1468 , 1344 ));
//        addEntity(new Food(handler, 1630 , 1344 ));
//        addEntity(new Food(handler, 1680 , 1344 ));
//        addEntity(new Food(handler, 1788 , 1344 ));
//        
//        
//         addEntity(new Food(handler, 64 , 1408 ));
//        addEntity(new Food(handler, 184 , 1408 ));
//        addEntity(new Food(handler, 238 , 1408 ));
//        addEntity(new Food(handler, 390 , 1408 ));
//        addEntity(new Food(handler, 1468 , 1408 ));
//        addEntity(new Food(handler, 1630 , 1408 ));
//        addEntity(new Food(handler, 1680 , 1408 ));
//        addEntity(new Food(handler, 1788 , 1408 ));
//        
//        
//        addEntity(new Food(handler, 64 , 1472 ));
//        addEntity(new Food(handler, 184 , 1472 ));
//        addEntity(new Food(handler, 238 , 1472 ));
//        addEntity(new Food(handler, 420 , 1472 ));
//        addEntity(new Food(handler, 484 , 1472 ));
//        addEntity(new Food(handler, 548 , 1472 ));
//        addEntity(new Food(handler, 612 , 1472 ));
//        addEntity(new Food(handler, 676 , 1472));
//        addEntity(new Food(handler, 740 , 1472 ));
//        addEntity(new Food(handler, 804 , 1472 ));
//        addEntity(new Food(handler, 868 , 1472 ));
//        addEntity(new Food(handler, 932 , 1472 ));
//        addEntity(new Food(handler, 996 , 1472 ));
//        addEntity(new Food(handler, 1064 , 1472 ));
//        addEntity(new Food(handler, 1128 , 1472 ));
//        addEntity(new Food(handler, 1192 , 1472 ));
//        addEntity(new Food(handler, 1256 , 1472 ));
//        addEntity(new Food(handler, 1320 , 1472 ));
//        addEntity(new Food(handler, 1384 , 1472 ));
//        addEntity(new Food(handler, 1448 , 1472 ));
//        addEntity(new Food(handler, 1630 , 1472 ));
//        addEntity(new Food(handler, 1680 , 1472 ));
//        addEntity(new Food(handler, 1788 , 1472 ));
//        
//        
//        addEntity(new Food(handler, 64 , 1536 ));
//        addEntity(new Food(handler, 184 , 1536 ));
//        addEntity(new Food(handler, 238 , 1536 ));
//        addEntity(new Food(handler, 1630 , 1536 ));
//        addEntity(new Food(handler, 1680 , 1536 ));
//        addEntity(new Food(handler, 1788 , 1536 ));
//        
//        
//        addEntity(new Food(handler, 64 , 1600 ));
//        addEntity(new Food(handler, 184 , 1600 ));
//        addEntity(new Food(handler, 238 , 1600 ));
//        addEntity(new Food(handler, 292 , 1600 ));
//        addEntity(new Food(handler, 356 , 1600 ));
//        addEntity(new Food(handler, 420 , 1600 ));
//        addEntity(new Food(handler, 484 , 1600 ));
//        addEntity(new Food(handler, 548 , 1600 ));
//        addEntity(new Food(handler, 612 , 1600 ));
//        addEntity(new Food(handler, 676 , 1600));
//        addEntity(new Food(handler, 740 , 1600 ));
//        addEntity(new Food(handler, 804 , 1600 ));
//        addEntity(new Food(handler, 868 , 1600 ));
//        addEntity(new Food(handler, 932 , 1600 ));
//        addEntity(new Food(handler, 996 , 1600 ));
//        addEntity(new Food(handler, 1064 , 1600 ));
//        addEntity(new Food(handler, 1128 , 1600 ));
//        addEntity(new Food(handler, 1192 , 1600 ));
//        addEntity(new Food(handler, 1256 , 1600 ));
//        addEntity(new Food(handler, 1320 , 1600 ));
//        addEntity(new Food(handler, 1384 , 1600 ));
//        addEntity(new Food(handler, 1448 , 1600));
//        addEntity(new Food(handler, 1512 , 1600 ));
//        addEntity(new Food(handler, 1576 , 1600 ));
//        addEntity(new Food(handler, 1630 , 1600 ));
//        addEntity(new Food(handler, 1680 , 1600 ));
//        addEntity(new Food(handler, 1788 , 1600 ));
//        
//        
//        addEntity(new Food(handler, 64 , 1664 ));
//        addEntity(new Food(handler, 184 , 1664 ));
//        addEntity(new Food(handler, 238 , 1664 ));
//        addEntity(new Food(handler, 292 , 1664 ));
//        addEntity(new Food(handler, 356 , 1664 ));
//        addEntity(new Food(handler, 420 , 1664 ));
//        addEntity(new Food(handler, 484 , 1664 ));
//        addEntity(new Food(handler, 548 , 1664 ));
//        addEntity(new Food(handler, 612 , 1664 ));
//        addEntity(new Food(handler, 676 , 1664));
//        addEntity(new Food(handler, 740 , 1664 ));
//        addEntity(new Food(handler, 804 , 1664 ));
//        addEntity(new Food(handler, 868 , 1664 ));
//        addEntity(new Food(handler, 932 , 1664 ));
//        addEntity(new Food(handler, 996 , 1664 ));
//        addEntity(new Food(handler, 1064 , 1664 ));
//        addEntity(new Food(handler, 1128 , 1664 ));
//        addEntity(new Food(handler, 1192 , 1664 ));
//        addEntity(new Food(handler, 1256 , 1664 ));
//        addEntity(new Food(handler, 1320 , 1664 ));
//        addEntity(new Food(handler, 1384 , 1664 ));
//        addEntity(new Food(handler, 1448 , 1664 ));
//        addEntity(new Food(handler, 1512 , 1664 ));
//        addEntity(new Food(handler, 1576 , 1664 ));
//        addEntity(new Food(handler, 1630 , 1664 ));
//        addEntity(new Food(handler, 1680 , 1664 ));
//        addEntity(new Food(handler, 1788 , 1664 ));
//        
//        addEntity(new Food(handler, 64 , 1728 ));
//        addEntity(new Food(handler, 834 , 1728 ));
//        addEntity(new Food(handler, 898 , 1728 ));
//        addEntity(new Food(handler, 962 , 1728 ));
//        addEntity(new Food(handler, 1036, 1728 ));
//        addEntity(new Food(handler, 1788, 1728 ));
//        
//        
//        addEntity(new Food(handler, 64, 1792));
//        addEntity(new Food(handler, 110 , 1792));
//        addEntity(new Food(handler, 164 , 1792 ));
//        addEntity(new Food(handler, 228 , 1792 ));
//        addEntity(new Food(handler, 292 , 1792 ));
//        addEntity(new Food(handler, 356 , 1792 ));
//        addEntity(new Food(handler, 420 , 1792 ));
//        addEntity(new Food(handler, 484 , 1792 ));
//        addEntity(new Food(handler, 548 , 1792 ));
//        addEntity(new Food(handler, 612 , 1792 ));
//        addEntity(new Food(handler, 676 , 1792 ));
//        addEntity(new Food(handler, 740 , 1792 ));
//        addEntity(new Food(handler, 804 , 1792 ));
//        addEntity(new Food(handler, 868 , 1792 ));
//        addEntity(new Food(handler, 932 , 1792 ));
//        addEntity(new Food(handler, 996 , 1792 ));
//        addEntity(new Food(handler, 1064 , 1792 ));
//        addEntity(new Food(handler, 1128 , 1792 ));
//        addEntity(new Food(handler, 1192 , 1792 ));
//        addEntity(new Food(handler, 1256 , 1792 ));
//        addEntity(new Food(handler, 1320 , 1792 ));
//        addEntity(new Food(handler, 1384 , 1792 ));
//        addEntity(new Food(handler, 1448 , 1792 ));
//        addEntity(new Food(handler, 1512 , 1792 ));
//        addEntity(new Food(handler, 1576 , 1792 ));
//        addEntity(new Food(handler, 1640 , 1792 ));
//        addEntity(new Food(handler, 1704 , 1792 ));
//        addEntity(new Food(handler, 1788 , 1792));
        
    
        
        
        

        
        
        
        
        
        //Beasts
        
        
        addEntity(new Beast(handler, 1792 , 64 ));
        addEntity(new Beast(handler, 192, 192 ));
        addEntity(new Beast(handler, 1600, 256));
        addEntity(new Beast(handler, 1408, 384));
        addEntity(new Beast(handler, 384, 832));
        addEntity(new Beast(handler , 1664 , 896 ));
        addEntity(new Beast(handler , 1024 , 1024 ));
       addEntity(new Beast(handler , 384 , 1472 ));
        addEntity(new Beast(handler , 1600 , 1600 ));
        addEntity(new Beast(handler , 192 , 1664 ));
        addEntity(new Beast(handler , 64 , 1792 ));
        addEntity(new BeastUp(handler , 64 , 1792 ));
        addEntity(new BeastUp(handler , 192 , 1600 ));
        addEntity(new BeastUp(handler , 384 , 384 ));
        addEntity(new BeastUp(handler , 1600 , 384 ));
        addEntity(new BeastUp(handler , 1472 , 1408 ));
        addEntity(new BeastUp(handler , 1792 , 64 ));
        
    }
    

//    besrtworld 1
//    addEntity(new Beast(handler, 64 , 64 ));
////        addEntity(new Beast(handler, 256, 256 ));
////        addEntity(new Beast(handler, 64, 600));
////        addEntity(new Beast(handler, 256, 960));
////        addEntity(new Beast(handler, 960, 1152));
////        addEntity(new BeastUp(handler , 64 , 164 ));
////        addEntity(new BeastUp(handler , 640 , 64 ));
////        addEntity(new BeastUp(handler , 320 , 320 ));
////        addEntity(new BeastUp(handler , 960 , 320 ));
////        addEntity(new BeastUp(handler , 1152 , 384 ));
    
    //foodworld1
    //        addEntity(new Food(handler, 64, 128));
//        addEntity(new Food(handler, 110 , 128));
//        addEntity(new Food(handler, 164 , 128 ));
//        addEntity(new Food(handler, 228 , 128 ));
//        addEntity(new Food(handler, 292 , 128 ));
//        addEntity(new Food(handler, 356 , 128 ));
//        addEntity(new Food(handler, 420 , 128 ));
//        addEntity(new Food(handler, 484 , 128 ));
//        addEntity(new Food(handler, 548 , 128 ));
//        addEntity(new Food(handler, 612 , 128 ));
//        addEntity(new Food(handler, 676 , 128 ));
//        addEntity(new Food(handler, 740 , 128 ));
//        addEntity(new Food(handler, 804 , 128 ));
//        addEntity(new Food(handler, 868 , 128 ));
//        addEntity(new Food(handler, 932 , 128 ));
//        addEntity(new Food(handler, 996 , 128 ));
//        addEntity(new Food(handler, 1064 , 128 ));
//        addEntity(new Food(handler, 1128 , 128 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 384));
//        addEntity(new Food(handler, 128 , 384));
//        addEntity(new Food(handler, 256 , 384 ));
//        addEntity(new Food(handler, 320 , 384 ));
//        addEntity(new Food(handler, 448 , 384 ));
//        addEntity(new Food(handler, 512 , 384 ));
//        addEntity(new Food(handler, 576 , 384 ));
//        addEntity(new Food(handler, 640 , 384 ));
//        addEntity(new Food(handler, 704 , 384 ));
//        addEntity(new Food(handler, 768 , 384 ));
//        addEntity(new Food(handler, 832 , 384 ));
//        addEntity(new Food(handler, 964 , 384 ));
//        addEntity(new Food(handler, 1096 , 384 ));
//        addEntity(new Food(handler, 1150 , 384 ));
//        
//        
//        addEntity(new Food(handler, 64, 448));
//        addEntity(new Food(handler, 128 , 448));
//        addEntity(new Food(handler, 256 , 448 ));
//        addEntity(new Food(handler, 320 , 448 ));
//        addEntity(new Food(handler, 448 , 448 ));
//        addEntity(new Food(handler, 512 , 448 ));
//        addEntity(new Food(handler, 576 , 448 ));
//        addEntity(new Food(handler, 640 , 448 ));
//        addEntity(new Food(handler, 704 , 448 ));
//        addEntity(new Food(handler, 768 , 448 ));
//        addEntity(new Food(handler, 832 , 448 ));
//        addEntity(new Food(handler, 964 , 448 ));
//        addEntity(new Food(handler, 1096 , 448 ));
//        addEntity(new Food(handler, 1150 , 448 ));
//        
//        
//        addEntity(new Food(handler, 64, 704));
//        addEntity(new Food(handler, 128 , 704));
//        addEntity(new Food(handler, 256 , 704 ));
//        addEntity(new Food(handler, 320 , 704 ));
//        addEntity(new Food(handler, 448 , 704 ));
//        addEntity(new Food(handler, 512 , 704 ));
//        addEntity(new Food(handler, 576 , 704 ));
//        addEntity(new Food(handler, 640 , 704 ));
//        addEntity(new Food(handler, 704 , 704 ));
//        addEntity(new Food(handler, 768 , 704 ));
//        addEntity(new Food(handler, 832 , 704 ));
//        addEntity(new Food(handler, 964 , 704 ));
//        addEntity(new Food(handler, 1096 , 704 ));
//        addEntity(new Food(handler, 1150 , 704 ));
//        
//        
//        addEntity(new Food(handler, 64, 768));
//        addEntity(new Food(handler, 128 , 768));
//        addEntity(new Food(handler, 256 , 768 ));
//        addEntity(new Food(handler, 320 , 768 ));
//        addEntity(new Food(handler, 448 , 768 ));
//        addEntity(new Food(handler, 512 , 768 ));
//        addEntity(new Food(handler, 576 , 768 ));
//        addEntity(new Food(handler, 640 , 768 ));
//        addEntity(new Food(handler, 704 , 768 ));
//        addEntity(new Food(handler, 768 , 768 ));
//        addEntity(new Food(handler, 832 , 768 ));
//        addEntity(new Food(handler, 964 , 768 ));
//        addEntity(new Food(handler, 1096 , 768 ));
//        addEntity(new Food(handler, 1150 , 768 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 832));
//        addEntity(new Food(handler, 128 , 832));
//        addEntity(new Food(handler, 256 , 832 ));
//        addEntity(new Food(handler, 320 , 832 ));
//        addEntity(new Food(handler, 448 , 832 ));
//        addEntity(new Food(handler, 512 , 832 ));
//        addEntity(new Food(handler, 576 , 832 ));
//        addEntity(new Food(handler, 640 , 832 ));
//        addEntity(new Food(handler, 704 , 832 ));
//        addEntity(new Food(handler, 768 , 832 ));
//        addEntity(new Food(handler, 832 , 832 ));
//        addEntity(new Food(handler, 964 , 832 ));
//        addEntity(new Food(handler, 1096 , 832 ));
//        addEntity(new Food(handler, 1150 , 832 ));
//        
//        
//        addEntity(new Food(handler, 64, 1096));
//        addEntity(new Food(handler, 128 , 1096));
//        addEntity(new Food(handler, 192 , 1096));
//        addEntity(new Food(handler, 256 , 1096 ));
//        addEntity(new Food(handler, 320 , 1096 ));
//        addEntity(new Food(handler, 384 , 1096));
//        addEntity(new Food(handler, 448 , 1096 ));
//        addEntity(new Food(handler, 512 , 1096 ));
//        addEntity(new Food(handler, 576 , 1096 ));
//        addEntity(new Food(handler, 640 , 1096 ));
//        addEntity(new Food(handler, 704 , 1096 ));
//        addEntity(new Food(handler, 768 , 1096 ));
//        addEntity(new Food(handler, 832 , 1096 ));
//        addEntity(new Food(handler, 896 , 1096));
//        addEntity(new Food(handler, 964 , 1096 ));
//        addEntity(new Food(handler, 1028 , 1096));
//        addEntity(new Food(handler, 1096 , 1096 ));
//        addEntity(new Food(handler, 1150 , 1096 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 1150));
//        addEntity(new Food(handler, 128 , 1150));
//        addEntity(new Food(handler, 192 , 1150));
//        addEntity(new Food(handler, 256 , 1150 ));
//        addEntity(new Food(handler, 320 , 1150 ));
//        addEntity(new Food(handler, 384 , 1150));
//        addEntity(new Food(handler, 448 , 1150 ));
//        addEntity(new Food(handler, 512 , 1150 ));
//        addEntity(new Food(handler, 576 , 1150 ));
//        addEntity(new Food(handler, 640 , 1150 ));
//        addEntity(new Food(handler, 704 , 1150 ));
//        addEntity(new Food(handler, 768 , 1150 ));
//        addEntity(new Food(handler, 832 , 1150 ));
//        addEntity(new Food(handler, 896 , 1150));
//        addEntity(new Food(handler, 964 , 1150 ));
//        addEntity(new Food(handler, 1028 , 1150));
//        addEntity(new Food(handler, 1096 , 1150 ));
//        addEntity(new Food(handler, 1150 , 1150 ));
//        
//        
//        
//        addEntity(new Food(handler, 64, 512));
//        addEntity(new Food(handler, 128 , 512));
//        addEntity(new Food(handler, 192 , 512));
//        addEntity(new Food(handler, 256 , 512 ));
//        addEntity(new Food(handler, 320 , 512 ));
//        addEntity(new Food(handler, 448 , 512 ));
//        addEntity(new Food(handler, 512 , 512 ));
//        addEntity(new Food(handler, 576 , 512 ));
//        addEntity(new Food(handler, 640 , 512 ));
//        addEntity(new Food(handler, 704 , 512 ));
//        addEntity(new Food(handler, 768 , 512 ));
//        addEntity(new Food(handler, 832 , 512 ));
//        addEntity(new Food(handler, 964 , 512 ));
//        addEntity(new Food(handler, 1032 , 512));
//        addEntity(new Food(handler, 1096 , 512 ));
//        addEntity(new Food(handler, 1150 , 512 ));
//        
//        addEntity(new Food(handler, 64, 256));
//        addEntity(new Food(handler, 128 , 256));
//        addEntity(new Food(handler, 292 , 256 ));
//        addEntity(new Food(handler, 356 , 256 ));
//        addEntity(new Food(handler, 420 , 256 ));
//        addEntity(new Food(handler, 484 , 256 ));
//        addEntity(new Food(handler, 548 , 256 ));
//        addEntity(new Food(handler, 612 , 256 ));
//        addEntity(new Food(handler, 676 , 256 ));
//        addEntity(new Food(handler, 740 , 256 ));
//        addEntity(new Food(handler, 804 , 256 ));
//        addEntity(new Food(handler, 868 , 256 ));
//        addEntity(new Food(handler, 932 , 256 ));
//        addEntity(new Food(handler, 1096 , 256 ));
//        addEntity(new Food(handler, 1150 , 256 ));
//        
//        
//        addEntity(new Food(handler, 64, 576));
//        addEntity(new Food(handler, 110 , 576));
//        addEntity(new Food(handler, 164 , 576 ));
//        addEntity(new Food(handler, 228 , 576 ));
//        addEntity(new Food(handler, 292 , 576 ));
//        addEntity(new Food(handler, 356 , 576 ));
//        addEntity(new Food(handler, 420 , 576 ));
//        addEntity(new Food(handler, 484 , 576 ));
//        addEntity(new Food(handler, 548 , 576 ));
//        addEntity(new Food(handler, 740 , 576 ));
//        addEntity(new Food(handler, 804 , 576 ));
//        addEntity(new Food(handler, 868 , 576 ));
//        addEntity(new Food(handler, 932 , 576 ));
//        addEntity(new Food(handler, 996 , 576 ));
//        addEntity(new Food(handler, 1064 , 576 ));
//        addEntity(new Food(handler, 1128 , 576 ));
//        
//        
//        addEntity(new Food(handler, 64, 640));
//        addEntity(new Food(handler, 110 , 640));
//        addEntity(new Food(handler, 164 , 640 ));
//        addEntity(new Food(handler, 228 , 640 ));
//        addEntity(new Food(handler, 292 , 640 ));
//        addEntity(new Food(handler, 356 , 640 ));
//        addEntity(new Food(handler, 420 , 640 ));
//        addEntity(new Food(handler, 484 , 640 ));
//        addEntity(new Food(handler, 548 , 640 ));
//        addEntity(new Food(handler, 740 , 640 ));
//        addEntity(new Food(handler, 804 , 640 ));
//        addEntity(new Food(handler, 868 , 640 ));
//        addEntity(new Food(handler, 932 , 640 ));
//        addEntity(new Food(handler, 996 , 640 ));
//        addEntity(new Food(handler, 1064 , 640 ));
//        addEntity(new Food(handler, 1128 , 640 ));
//        
//        
//        addEntity(new Food(handler, 292 , 960 ));
//        addEntity(new Food(handler, 356 , 960 ));
//        addEntity(new Food(handler, 420 , 960 ));
//        addEntity(new Food(handler, 484 , 960 ));
//        addEntity(new Food(handler, 548 , 960 ));
//        addEntity(new Food(handler, 612 , 960 ));
//        addEntity(new Food(handler, 676 , 960 ));
//        addEntity(new Food(handler, 740 , 960 ));
//        addEntity(new Food(handler, 804 , 960 ));
//        addEntity(new Food(handler, 868 , 960 ));
//        addEntity(new Food(handler, 932 , 960 ));
    
    
}
