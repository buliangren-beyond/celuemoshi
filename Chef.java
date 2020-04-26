package celue;

public class Chef {
	private CutFruit cutmethod;
	public void setcutmethod(CutFruit cutmethod) {
		this.cutmethod=cutmethod;
	}
	public void cutfruit(String fruitname) {
		cutmethod.CutStrategy(fruitname);
	}
}
