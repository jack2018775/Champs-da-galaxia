package galaxia.champs.game;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameContainer extends JFrame {

    private static final long serialVersionUID = 1L;

    private Timer timer;
    private Timer novosIni;
    private Timer novaVida;
    private List<Inimigo> inimigos;
    private List<Tiro1> tiros;
    private List<AddVida> addVida;
    private List<Timer> tempos;
    private List<Explosao> explosoes;

    private int contPontos = 0;
    private int contVida = 3;

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

        // LISTA INIMIGOS
        inimigos = new ArrayList<Inimigo>();

        // INICIALIZA INIMIGOS
        inicializaInimigos();

        // LISTA TIRO1
        tiros = new ArrayList<Tiro1>();

        // LISTA DE VIDAS
        addVida = new ArrayList<AddVida>();

        // LISTA TEMPO (EXPLOSÃO)
        tempos = new ArrayList<Timer>();

        // LISTA EXPLOSÕES
        explosoes = new ArrayList<Explosao>();

        // CONTROLA O TEMPO PARA CRIAR INIMIGIOS
        novosIni = new Timer(900, new novoInimigo());
        novosIni.start();

        // CONTROLA O TEMPO PARA CRIAR ADD VIDA
        novaVida = new Timer(900, new novaVida());
        novaVida.start();

        // CONTROLA O TEMPO (VELOCIDADE) JOGO
        timer = new Timer(5, new Listener());
        timer.start();
    }

    private void inicializaInimigos() {
        for (int i = 0; i < inimigos.size(); i++) {
            inimigos.remove(i);
            i--;
        }
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

	}
}
