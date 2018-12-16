package christmasTik;

import java.awt.AWTException;
import java.awt.Color;
import java.io.IOException;
import java.util.Scanner;

public class GamePlay {

	public void readyPlay() {
		
		System.out.println("||************************||");
		System.out.println("         欢迎使用由小剑提供的自动打游戏工具！");
		System.out.println("游戏即将开始，在键盘上输入3，并回车，进入游戏3秒开始倒计时：");
		Scanner scan = new Scanner(System.in);
		Integer t = 0;
		try {
			t = scan.nextInt();
		} catch (Exception e) {
			System.out.println("输入秒数有误！");
		}
		scan.close();
		System.out.println("||************************||");
		System.out.println("         游戏预备开始！现在进入"+t+"秒倒计时！");
		while(t > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("         "+t);
			t--;
		}
		
	}
	
	
	public void testPress() {
		Keyboard key = new Keyboard();
		while(true) {
			try {
				key.doPress(1);
				int n = (int) (Math.random() * 10);
				System.out.println(n);
				Thread.sleep(500 + n);
			} catch (AWTException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void doPlay() {
		System.out.println("         游戏开始！");
		Screen sc = new Screen();
		Keyboard key = new Keyboard();
		while(true) {
			try {
				//100毫秒检测一次
				Thread.sleep(100);
				Color color = sc.getScreenPixel(210, 420);
				System.out.println("当前该点的颜色值为："+color.getRGB());
				int rgb = color.getRGB();
				//糖果
				if(rgb == -5627879 ||
						rgb == -2867921 ||
						rgb == -5561573 ||
						rgb == -4286596 ||
						rgb == -5618642 ||
						rgb == -5619924 ||
						rgb == -3064272 ||
						rgb == -5628136 ||
						rgb == -5681611 ||
						rgb == -2933201 ||
						rgb == -5427161 ||
						rgb == -5622490 ||
						rgb == -4616583 ||
						rgb == -5626596 ||
						rgb == -5625314 ||
						rgb == -5362138 ||
						rgb == -5608119) {
					key.doPress(1);
					System.out.println("糖果");
					Thread.sleep(800);
				}
				//熊
				if(rgb == -3958165 ||
						rgb == -7506 ||
						rgb == -5435 ||
						rgb == -7763 ||
						rgb == -1316891 ||
						rgb == -6989 ||
						rgb == -3883 ||
						rgb == -2902638 ||
						rgb == -5965 ||
						rgb == -3892371 ||
						rgb == -2045005 ||
						rgb == -791583 ||
						rgb == -1811 ||
						rgb == -139092 ||
						rgb == -4749989 ||
						rgb == -2506319 ||
						rgb == -7247 ||
						rgb == -3760271 ||
						rgb == -6993 ||
						rgb == -4352387 ||
						rgb == -4815526 ||
						rgb == -921875 ||
						rgb == -7507 ||
						rgb == -204625) {
					key.doPress(2);
					System.out.println("熊");
					Thread.sleep(800);
				}
				//树
				if(rgb == -987927 ||
						rgb == -604586 ||
						rgb == -4330381 ||
						rgb == -2068901 ||
						rgb == -6638483 ||
						rgb == -3758189 ||
						rgb == -4264332 ||
						rgb == -4330893 ||
						rgb == -6962591 ||
						rgb == -801182 ||
						rgb == -2779806 ||
						rgb == -6768529 ||
						rgb == -4604566 ||
						rgb == -3489944 ||
						rgb == -6056351 ||
						rgb == -1979457 ||
						rgb == -2499221 ||
						rgb == -2133669) {
					key.doPress(3);
					System.out.println("树");
					Thread.sleep(800);
				}
				
				//袜子
				if(rgb == -2719147 ||
						rgb == -4617364 ||
						rgb == -14220 ||
						rgb == -16547 ||
						rgb == -2438721 ||
						rgb == -3244720 ||
						rgb == -4154750 ||
						rgb == -1922937 ||
						rgb == -857371 ||
						rgb == -2718631 ||
						rgb == -673424 ||
						rgb == -4878990 ||
						rgb == -4614786 ||
						rgb == -16549 ||
						rgb == -329481 ||
						rgb == -1530263 ||
						rgb == -3693169 ||
						rgb == -4683671 ||
						rgb == -5607607 ||
						rgb == -1325906 ||
						rgb == -2253962 ||
						rgb == -1658219 ||
						rgb == -279204) {
					key.doPress(4);
					System.out.println("袜子");
					Thread.sleep(800);
				}
				
				//提前150毫秒做点击，做一次点击后延迟一秒钟
//				key.doPress(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
