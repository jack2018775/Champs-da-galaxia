package galaxia.champs.game;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GameContainer extends JFrame {

    private static final long serialVersionUID = 1L;

    private JMenuBar menuBar;
    private JMenu mnMissao;
    private JMenu mnVida;
    private JMenu mnPontuacao;
    private JMenu mnNaoAbatido;
    private JMenu mnTempo;

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

        // START MENU
        iniciarMenuInfo();
    }

    public void iniciarMenuInfo() {
        // MENU BAR
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // MISSÃO
        mnMissao = new JMenu("Missão: " + contMissao);
        mnMissao.setEnabled(true);
        mnMissao.setHorizontalTextPosition(SwingConstants.CENTER);
        mnMissao.setHorizontalAlignment(SwingConstants.CENTER);
        mnMissao.setVerticalAlignment(SwingConstants.BOTTOM);
        mnMissao.setVerticalTextPosition(SwingConstants.BOTTOM);
        mnMissao.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
        menuBar.add(mnMissao);

        // VIDA
        mnVida = new JMenu(" x " + contVida);
        mnVida.setEnabled(true);
        mnVida.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
        menuBar.add(mnVida);

        // PONTUAÇÃO
        mnPontuacao = new JMenu("x" + contPontos);
        mnPontuacao.setEnabled(true);
        mnPontuacao.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
        menuBar.add(mnPontuacao);

        // NÃO ABATIDOS
        mnNaoAbatido = new JMenu("Não Abatidos: " + naoAbatidos);
        mnNaoAbatido.setEnabled(true);
        mnNaoAbatido.setHorizontalTextPosition(SwingConstants.CENTER);
        mnNaoAbatido.setHorizontalAlignment(SwingConstants.CENTER);
        mnNaoAbatido.setVerticalAlignment(SwingConstants.BOTTOM);
        mnNaoAbatido.setVerticalTextPosition(SwingConstants.BOTTOM);
        mnNaoAbatido.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
        menuBar.add(mnNaoAbatido);

        // TEMPORALIZADOR (TEMPO DO JOGO)
        mnTempo = new JMenu("Tempo: " + t.minutos + ":" + t.segundos);
        mnTempo.setEnabled(true);
        mnTempo.setHorizontalTextPosition(SwingConstants.CENTER);
        mnTempo.setHorizontalAlignment(SwingConstants.CENTER);
        mnTempo.setVerticalAlignment(SwingConstants.BOTTOM);
        mnTempo.setVerticalTextPosition(SwingConstants.BOTTOM);
        mnTempo.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
        menuBar.add(mnTempo);
    }
}
