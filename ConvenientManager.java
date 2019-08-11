import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ConvenientManager implements ActionListener{
	
	JButton control_panel,firewall_e,firewall_d,chrome,firefox,c,f,g,h,vmware,regedit,ip,hotspot;
	JFrame fr;
	public void setup(){
		fr = new JFrame("Convenient Manager");
		fr.setVisible(true);
		fr.setSize(400,400);
		GridLayout gl = new GridLayout(6,2);
		fr.setLayout(gl);
		control_panel = new JButton("Control Panel");
		firewall_e = new JButton("Firewall Enable");
		firewall_d = new JButton("Firewall Disable");
		chrome = new JButton("Chrome");
		firefox =new JButton("Firefox");
		c = new JButton("Local Disk C");
		f = new JButton("Local Disk F");
		g = new JButton("Local Disk G");
		h = new JButton("Local Disk H");
		vmware = new JButton("VmWare");
		regedit = new JButton("Registry Editor");
		ip = new JButton("IP Address");
		//hotspot = new JButton("Create Hotspot");
	}
	
	public void addToFrame(){
		fr.add(control_panel);
		fr.add(vmware);
		fr.add(firewall_e);
		fr.add(firewall_d);
		fr.add(chrome);
		fr.add(firefox);
		fr.add(c);
		fr.add(g);
		fr.add(h);
		fr.add(f);
		fr.add(regedit);
		fr.add(ip);
	}
	
	public void addListeners(){
		control_panel.addActionListener(this);
		firewall_e.addActionListener(this);
		firewall_d.addActionListener(this);
		chrome.addActionListener(this);
		firefox.addActionListener(this);
		c.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		f.addActionListener(this);
		vmware.addActionListener(this);
		regedit.addActionListener(this);
		ip.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==control_panel){
			try{
			String[] command = {"cmd.exe", "/C" , "Start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\control_panel.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==firewall_e){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\firewall_enable.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==firewall_d){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\firewall_disable.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==chrome){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\chrome.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==firefox){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\firefox.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==c){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\local_c.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==g){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\local_g.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==f){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\local_f.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==h){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\local_h.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==vmware){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\vmware.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==regedit){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\Convenient Manager\\regedit.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
		if(e.getSource()==ip){
			try{
			String[] command = {"cmd.exe", "/C" , "start", "C:\\Users\\hp\\Desktop\\ConvenientManager\\ip.bat"};
			Process p = Runtime.getRuntime().exec(command);
			}
			catch(Exception ee){
			System.out.println(ee);
			}
		}
	}
	public static void main(String args[]){
		ConvenientManager cmObj = new ConvenientManager();
		cmObj.setup();
		cmObj.addToFrame();
		cmObj.addListeners();
	}
}