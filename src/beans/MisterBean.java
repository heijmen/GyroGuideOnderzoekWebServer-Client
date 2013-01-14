package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean (name = "misterBean")
@ApplicationScoped
public class MisterBean {
	
	private Server server;
	private int gyroRightPower = 255;
	private int gyroLeftPower = 255;
	private int gyroPowerSnelheid = 255;
	private int gyroStartupRelatieveSnelheid = 255;
	private int gyroWiggleAantal = 5;
	private int gyroWiggleIntensity = 100;
	private int gyroBubbleRechtsDuur =  5;
	private int gyroBubbleRechtsIntensity = 255;
	private int gyroBubbleRechtsHoogtepunt = 10;
	private int gyroBubbleLinksDuur = 5;
	private int gyroBubbleLinksIntensity = 255;
	private int gyroBubbleLinksHoogtepunt = 10;
	
	public MisterBean() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				setServer(new Server());
			}
		});
		thread.start();
	}

	public void sendGyroRightCommand(ActionEvent event) {
		Message m = new Message(0, new int[] {gyroRightPower});
		System.out.println(m);
		Server.sendMessage(m);
	}
	
	public void sendGyroLeftCommand(ActionEvent event) {
		Message m = new Message(1, new int[] {gyroLeftPower});
		server.sendMessage(m);
	}
	
	public void sendGyroPowerCommand(ActionEvent event) {
		Message m = new Message(2, new int[] {gyroPowerSnelheid});
		server.sendMessage(m);
	}
	
	public void sendGyroStartupCommand(ActionEvent event) {
		Message m = new Message(3, new int[] {gyroStartupRelatieveSnelheid});
		server.sendMessage(m);
	}
	public void sendGyroShutdownCommand(ActionEvent event) {
		Message m = new Message(4, new int[] {});
		server.sendMessage(m);
	}
	
	public void sendWiggleCommand(ActionEvent event) {
		Message m = new Message(5, new int[] {gyroWiggleAantal, gyroWiggleIntensity});
		server.sendMessage(m);
	}
	
	public void sendBubbleRechtsCommand(ActionEvent event) {
		Message m = new Message(14, new int[] {gyroBubbleRechtsDuur, gyroBubbleRechtsIntensity, gyroBubbleRechtsHoogtepunt});
		server.sendMessage(m);
	}
	public void sendBubbleLinksCommand(ActionEvent event) {
		Message m = new Message(15, new int[] {gyroBubbleLinksDuur, gyroBubbleLinksIntensity, gyroBubbleLinksHoogtepunt});
		server.sendMessage(m);
	}
	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	public int getGyroRightPower() {
		return gyroRightPower;
	}

	public void setGyroRightPower(int gyroRightPower) {
		this.gyroRightPower = gyroRightPower;
	}

	public int getGyroLeftPower() {
		return gyroLeftPower;
	}

	public void setGyroLeftPower(int gyroLeftPower) {
		this.gyroLeftPower = gyroLeftPower;
	}

	public int getGyroPowerSnelheid() {
		return gyroPowerSnelheid;
	}

	public void setGyroPowerSnelheid(int gyroPowerSnelheid) {
		this.gyroPowerSnelheid = gyroPowerSnelheid;
	}

	public int getGyroWiggleAantal() {
		return gyroWiggleAantal;
	}

	public void setGyroWiggleAantal(int gyroWiggleAantal) {
		this.gyroWiggleAantal = gyroWiggleAantal;
	}

	public int getGyroWiggleIntensity() {
		return gyroWiggleIntensity;
	}

	public void setGyroWiggleIntensity(int gyroWiggleIntensity) {
		this.gyroWiggleIntensity = gyroWiggleIntensity;
	}

	public int getGyroBubbleRechtsDuur() {
		return gyroBubbleRechtsDuur;
	}

	public void setGyroBubbleRechtsDuur(int gyroBubbleRechtsDuur) {
		this.gyroBubbleRechtsDuur = gyroBubbleRechtsDuur;
	}

	public int getGyroBubbleRechtsIntensity() {
		return gyroBubbleRechtsIntensity;
	}

	public void setGyroBubbleRechtsIntensity(int gyroBubbleRechtsIntensity) {
		this.gyroBubbleRechtsIntensity = gyroBubbleRechtsIntensity;
	}

	public int getGyroBubbleRechtsHoogtepunt() {
		return gyroBubbleRechtsHoogtepunt;
	}

	public void setGyroBubbleRechtsHoogtepunt(int gyroBubbleRechtsHoogtepunt) {
		this.gyroBubbleRechtsHoogtepunt = gyroBubbleRechtsHoogtepunt;
	}

	public int getGyroBubbleLinksDuur() {
		return gyroBubbleLinksDuur;
	}

	public void setGyroBubbleLinksDuur(int gyroBubbleLinksDuur) {
		this.gyroBubbleLinksDuur = gyroBubbleLinksDuur;
	}

	public int getGyroBubbleLinksIntensity() {
		return gyroBubbleLinksIntensity;
	}

	public void setGyroBubbleLinksIntensity(int gyroBubbleLinksIntensity) {
		this.gyroBubbleLinksIntensity = gyroBubbleLinksIntensity;
	}

	public int getGyroBubbleLinksHoogtepunt() {
		return gyroBubbleLinksHoogtepunt;
	}

	public void setGyroBubbleLinksHoogtepunt(int gyroBubbleLinksHoogtepunt) {
		this.gyroBubbleLinksHoogtepunt = gyroBubbleLinksHoogtepunt;
	}

	public int getGyroStartupRelatieveSnelheid() {
		return gyroStartupRelatieveSnelheid;
	}

	public void setGyroStartupRelatieveSnelheid(int gyroStartupRelatieveSnelheid) {
		this.gyroStartupRelatieveSnelheid = gyroStartupRelatieveSnelheid;
	}
	
}
