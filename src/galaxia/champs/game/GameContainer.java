package galaxia.champs.game;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameContainer extends JFrame {

    private static final long serialVersionUID = 1L;

    private Timer timer;
    private Timer novosIni;
    private Timer novaVida;

    /**
     * ===========================================================MAIN
     */
    public static void main(String args[]) {
        new GameContainer();
    }

    /**
     * ===============================================================
     * ============================================CONSTRUTOR DA CLASS
     * ===============================================================
     */
    protected GameContainer() {
        // TITULO DO JOGO
        setTitle("Champs da Galáxia");

        // SAIR JOGO
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DIMENÇÃO DA JANELA
        setSize(600, 600);

        setLocationRelativeTo(null);

        // NÃO MAXIMIZA JANELA
        setResizable(false);

        // JANELA VISIVEL
        setVisible(true);

        // CONTROLA O TEMPO PARA CRIAR INIMIGOS
        novosIni = new Timer(900, new novoInimigo());
        novosIni.start();

        // CONTROLA O TEMPO PARA CRIAR ADD VIDA
        novaVida = new Timer(900, new novaVida());
        novaVida.start();

        // CONTROLA O TEMPO (VELOCIDADE) JOGO
        timer = new Timer(5, new Listener());
        timer.start();
    }

    private class novoInimigo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Lógica para criar novos inimigos
        }
    }

    private class novaVida implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Lógica para criar nova vida
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Lógica do jogo
        }
    }
}
