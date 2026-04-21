import javax.swing.*

class Conversao (var listaMoedas: Array<String>){

    fun menu() {
        listaMoedas = arrayOf("Dólar", "Euro", "Iene", "Libra")

        while (true) {
            val opcao = JOptionPane.showOptionDialog(
                null, "Selecione a moeda para conversão:",
                "Lista de Moedas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, listaMoedas, listaMoedas[0]
            )

            try {
                when (opcao) {
                    0 -> {
                        val valorDolar = JOptionPane.showInputDialog(null, "Digite o valor da cotação do Dólar(U$) em Real(R$): ").toDouble()
                        val converterValor = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido: ").toDouble()
                        JOptionPane.showMessageDialog(null, "O valor em Dólar(U$) é de " + Dolar(valorDolar).converter(converterValor))
                    }
                    1 -> {
                        val valorEuro = JOptionPane.showInputDialog(null, "Digite o valor da cotação do Euro(€) em Real(R$): ").toDouble()
                        val converterValor = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido: ").toDouble()
                        JOptionPane.showMessageDialog(null, "O valor em Euro(€) é de " + Euro(valorEuro).converter(converterValor))
                    }
                    2 -> {
                        val valorIene = JOptionPane.showInputDialog(null, "Digite o valor da cotação do Iene(¥) em Real(R$): ").toDouble()
                        val converterValor = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido: ").toDouble()
                        JOptionPane.showMessageDialog(null, "O valor em Iene(¥) é de " + Iene(valorIene).converter(converterValor))
                    }
                    3 -> {
                        val valorLibra = JOptionPane.showInputDialog(null, "Digite o valor da cotação da Libra(£) em Real(R$): ").toDouble()
                        val converterValor = JOptionPane.showInputDialog(null, "Digite o valor a ser convertido: ").toDouble()
                        JOptionPane.showMessageDialog(null, "O valor em Libra(£) é de " + Libra(valorLibra).converter(converterValor))
                    }
                    else -> {
                        JOptionPane.showMessageDialog(null, "Obrigado por usar o programa!")
                        break
                    }
                }
            } catch (_: Exception) {
                throw Exception("Conversão não suportada.")
            }
        }
    }

    abstract class Moeda(var taxa: Double) {
        abstract fun converter(valorEmReal: Double): Double
    }

    class Dolar(taxa: Double) : Moeda(taxa) {
        override fun converter(valorEmReal: Double): Double {
            return valorEmReal / taxa
        }
    }

    class Euro(taxa: Double) : Moeda(taxa) {
        override fun converter(valorEmReal: Double) = valorEmReal / taxa
    }

    class Iene(taxa: Double) : Moeda(taxa) {
        override fun converter(valorEmReal: Double) = valorEmReal / taxa
    }

    class Libra(taxa: Double) : Moeda(taxa) {
        override fun converter(valorEmReal: Double) = valorEmReal / taxa
    }
}
