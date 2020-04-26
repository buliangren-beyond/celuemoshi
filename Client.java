package celue;
//策略模式
public class Client {
	public static void main(String args[]) {
	Chef c = new Chef();
	CutFruit cf = new Knife();
	c.setcutmethod(cf);
	c.cutfruit("苹果");
	}
}
