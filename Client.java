package celue;
//����ģʽ
public class Client {
	public static void main(String args[]) {
	Chef c = new Chef();
	CutFruit cf = new Knife();
	c.setcutmethod(cf);
	c.cutfruit("ƻ��");
	}
}
