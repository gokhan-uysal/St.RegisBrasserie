package Foods;

import javax.swing.ImageIcon;

public abstract class BaseDrinks extends BaseFoods{
	
	
	public BaseDrinks(String name, int stockCount, ImageIcon img) {
		super(name, stockCount, img);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStock() {
		// TODO Auto-generated method stub
		super.addStock();
	}

	@Override
	public void removeStock() {
		// TODO Auto-generated method stub
		super.removeStock();
	}

	@Override
	public boolean checkStock() {
		// TODO Auto-generated method stub
		return super.checkStock();
	}
	
	
}