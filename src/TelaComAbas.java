/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Rogério de Lima
 */
import javax.swing.*;

public class TelaComAbas extends JFrame {

    public TelaComAbas() {
        setTitle("Exemplo JTabbedPane");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando o TabbedPane
        JTabbedPane abas = new JTabbedPane();

        // Aba 1
        JPanel painel1 = new JPanel();
        painel1.add(new JLabel("Conteúdo da Aba 1"));
        
        abas.addTab("Aba 1", painel1);

        // Aba 2
        JPanel painel2 = new JPanel();
        painel2.add(new JButton("Botão na Aba 2"));
        abas.addTab("Aba 2", painel2);

        // Aba 3
        JPanel painel3 = new JPanel();
        painel3.add(new JTextField("Campo na Aba 3"));
        abas.addTab("Aba 3", painel3);
        
        JPanel painel4 = new JPanel();
        painel4.add(new JTextField("Campo na Aba 4"));
        abas.addTab("Aba 4", painel4);

        // Adiciona no JFrame
        add(abas);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaComAbas();
        });
    }
}
