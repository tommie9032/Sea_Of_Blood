package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Obj_key extends SuperObject{
    public Obj_key(){
        name="Key";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/object/key.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
