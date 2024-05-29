package galaxia.champs.game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Explosao {
    private int cont;
    private int x, y;
    private Image imagem;

    public Explosao(int x, int y) {
        ImageIcon referencia = new ImageIcon("res/explosao/explosao.png");
        imagem = referencia.getImage();

        this.x = x;
        this.y = y;
        this.cont = 0;
    }

    public void incrementarCont() {
        cont++;
    }

    public int getCont() {
        return cont;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }
}
