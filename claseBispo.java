package br.com.afsj.model;

public class Bispo extends Peca {

	@Override
	public boolean mover(int x, int y) {
		if (posX == -1 && posY == -1) {
			posX = x;
			posY = y;
			return true;
		}

		int sinalX, sinalY;

		if (x > posX)
			sinalX = -1;
		else if (x < posX)
			sinalX = 1;
		else
			return false;
		
		if(y>posY)
			sinalY = -1;
		else if (y<posY)
			sinalY = 1;
		else
			return false;
		
		int aX = x;
		int aY = y;
		
		do{
			aX = aX + sinalX;
			aY = aY + sinalY;
		
			if(aX == posX && aY == posY){
				posX = x;
				posY = y;
				return true;
			}
		}while((aX>0 && aX<8) && (aY>0 && aY<8));
		
		return false;
	}

}
