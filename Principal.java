

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class Principal {

    public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Meu Planner");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTabbedPane tabbedPane = new JTabbedPane();

            // Adiciona gasto universitário como uma aba 
            GastoUniversitarioGUI gastoUniversitario = new GastoUniversitarioGUI();
            tabbedPane.addTab("Gastos Mensais", null, gastoUniversitario);
            
            // Adiciona lista de tarefas como uma aba 
            ListaTarefasGUI listaTarefa = new ListaTarefasGUI();
            tabbedPane.addTab("Lsita de Tarefas", null, listaTarefa) ;
            
            // Adiciona Cadernos como uma aba 
            CadernoGUI cadernos = new CadernoGUI();
            tabbedPane.addTab("Cadernos", null, cadernos);
            
             frame.setContentPane(tabbedPane);

            frame.setSize(500, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

    }
}
