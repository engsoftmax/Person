package Human;

import java.time.LocalDate;

import javax.swing.*;

public class TelaImprime extends JFrame {
    private JLabel dadosLabel;

    public TelaImprime(Pessoa pessoa) {
        setTitle("Dados da Pessoa");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dadosLabel = new JLabel();
        add(dadosLabel);

        String dadosPessoa = pessoa.formatarDados();
        dadosLabel.setText(dadosPessoa);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Pessoa pessoa = new Pessoa("Maximiliano", LocalDate.of(1990, 5, 15), 1.77);
            TelaImprime frame = new TelaImprime(pessoa);
            frame.setVisible(true);
        });
    }

	public JLabel getDadosLabel() {
		return dadosLabel;
	}

	public void setDadosLabel(JLabel dadosLabel) {
		this.dadosLabel = dadosLabel;
	}
}
