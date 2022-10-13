import java.awt.*;

class MenuExample{
	
	MenuExample(){
	Frame f = new Frame("Menu and MenuItem Example");
	MenuBar mb = new MenuBar();
	f.setMenuBar(mb);
	
	Menu fi = new Menu("File");
	mb.add(fi);
	MenuItem N = new MenuItem("New");
	MenuItem O = new MenuItem("Open");
	MenuItem S = new MenuItem("Save");
	fi.add(N);
	fi.add(O);
	fi.add(S);
	
	Menu ed = new Menu("Edit");
	mb.add(ed);
	MenuItem cut = new MenuItem("Cut");
	MenuItem copy = new MenuItem("Copy");
	MenuItem paste = new MenuItem("Paste");
	ed.add(cut);
	ed.add(copy);
	ed.add(paste);
	
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
}

public static void main(String args[]){
	new MenuExample();
}
}