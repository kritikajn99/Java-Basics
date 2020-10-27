import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("deprecation")
public class Applet1 extends Applet {

	public void init() 
	{
		setBackground(Color.cyan);
		Label l1=new Label("This reppresents a LABEL");
		add(l1);
		TextField t1=new TextField(20);
		add(t1);
		
		Checkbox c1=new Checkbox("RED");
		add(c1);
		Checkbox c2=new Checkbox("BLUE");
		add(c2);
		Checkbox c3=new Checkbox("GREEN");
		add(c3);
		Checkbox c4=new Checkbox("YELLOW");
		add(c4);
	}
}
/*<applet code="Applet1.class" width=400 height=400>
</applet>*/