protected static Bispo bispoPreto1 = new Bispo();
	protected static IBispo iBispoPreto1 = new IBispo(bispoPreto1);
	
	protected static Bispo bispoBranco1 = new Bispo();
	protected static IBispo iBispoBranco1 = new IBispo(bispoBranco1);


		bispoBranco1.setCor(Xadrez.corBRANCA);
		bispoBranco1.mover(2,7);
		iBispoBranco1.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
		iBispoBranco1.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco1.mover(2,7);
		TELA.getContentPane().add(iBispoBranco1.getImagem());

		bispoPreto1.setCor(Xadrez.corPRETA);
		bispoPreto1.mover(2, 0);
		iBispoPreto1.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto1.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto1.mover(2, 0);
		TELA.getContentPane().add(iBispoPreto1.getImagem());
		