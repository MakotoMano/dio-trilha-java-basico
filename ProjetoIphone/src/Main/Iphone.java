package Main;

import Apps.AparelhoTelefonico;
import Apps.ReprodutorMusical;
import Apps.NavegadorInternet;

//Classe iPhone que implementa todas as interfaces
	public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	// Implementação dos métodos de ReprodutorMusical
		@Override
		 public void tocar() {
		     System.out.println("Tocando música...");
		 }

		 @Override
		 public void pausar() {
		     System.out.println("Música pausada.");
		 }

		 @Override
		 public void selecionarMusica(String musica) {
		     System.out.println("Música selecionada: " + musica);
		 }
		
		 // Implementação dos métodos de AparelhoTelefonico
		 @Override
		 public void ligar(String numero) {
		     System.out.println("Ligando para " + numero + "...");
		 }
		
		 @Override
		 public void atender() {
		     System.out.println("Atendendo chamada...");
		 }
		
		 @Override
		 public void iniciarCorreioVoz() {
		     System.out.println("Iniciando correio de voz...");
		 }
		
		 // Implementação dos métodos de NavegadorInternet
		 @Override
		 public void exibirPagina(String url) {
		     System.out.println("Exibindo página: " + url);
		 }
		
		 @Override
		 public void adicionarNovaAba() {
		     System.out.println("Nova aba adicionada.");
		 }
		
		 @Override
		 public void atualizarPagina() {
		     System.out.println("Página atualizada.");
		 }
		
			 public static void main(String[] args) {
			     Iphone meuIphone = new Iphone();
			     
			     // Teste do ReprodutorMusical
			     meuIphone.tocar();
			     meuIphone.selecionarMusica("Imagine - John Lennon");
			     meuIphone.pausar();
			     
			     // Teste do AparelhoTelefonico
			     meuIphone.ligar("123456789");
			     meuIphone.atender();
			     meuIphone.iniciarCorreioVoz();
			     
			     // Teste do NavegadorInternet
			     meuIphone.exibirPagina("www.example.com");
			     meuIphone.adicionarNovaAba();
			     meuIphone.atualizarPagina();
			 }
		}