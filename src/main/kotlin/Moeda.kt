import javax.swing.*

class Moeda (
    var taxaDolar: Double,
    var taxaEuro: Double, var taxaIene: Double,
    var taxaLibra: Double, var listaMoedas: Array<String>){


    fun valorDolar(): Double {
        taxaDolar = JOptionPane.showInputDialog(null, "Informe a cotação atual do Dólar(U$) em Real(R$): ").toDouble()
        return taxaDolar
    }

    fun valorEuro(): Double {
        taxaEuro = JOptionPane.showInputDialog(null, "Informe a cotação atual do Euro(€) em Real(R$): ").toDouble()
        return taxaEuro
    }

    fun valorIene(): Double {
        taxaIene = JOptionPane.showInputDialog(null, "Informe a cotação atual do Iene(¥) em Real(R$): ").toDouble()
        return taxaIene
    }

    fun valorLibra(): Double {
        taxaLibra = JOptionPane.showInputDialog(null, "Informe a cotação atual do Dólar(U$) em Real(R$): ").toDouble()
        return taxaLibra
    }

    fun menu() {
        listaMoedas = arrayOf("Dólar", "Euro", "Iene", "Libra")

        while (true) {
            val opcao = JOptionPane.showOptionDialog(
                null, "Selecione a moeda para conversão " +
                        "(Por padrão, a moeda convertida será o Dólar(U$): ",
                "Lista de Moedas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, listaMoedas, listaMoedas[0]
            )

            try {
                when (opcao) {
                    0 -> valorDolar()
                    1 -> valorEuro()
                    2 -> valorIene()
                    3 -> valorLibra()
                    else -> break
                }
            } catch (_: Exception) {
                throw Exception("Conversão não suportada.")
            }
        }
    }
}