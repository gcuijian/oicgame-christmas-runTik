package christmasTik;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Keyboard {

	public void doPress(Integer n) throws AWTException, IOException {
		
		Robot robot = new Robot();
		
		/**
		 * 
		 * 模拟器实现方式
		 */
//		if(n == 1)
//			keyPress(robot, KeyEvent.VK_Q);
//		if(n == 2)
//			keyPress(robot, KeyEvent.VK_W);
//		if(n == 3)
//			keyPress(robot, KeyEvent.VK_E);
//		if(n == 4)
//			keyPress(robot, KeyEvent.VK_R);
		
		//远程实现方式，鼠标定位，后点击
		if(n == 1)
			robot.mouseMove(60, 675);
		if(n == 2)
			robot.mouseMove(150, 675);
		if(n == 3)
			robot.mouseMove(240, 675);
		if(n == 4)
			robot.mouseMove(340, 675);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		System.out.println("n："+n);
//		Runtime.getRuntime().exec("notepad");
//		robot.delay(2000);
//        keyPressString(robot, "大家好，我是一个小机器人，我有很多本领呢 ！"); //输入字符串
//        robot.delay(3000);  //等待 3秒
//        keyPress(robot, KeyEvent.VK_A); //按下 a 键

	}
	
	// shift+ 按键
    public static void keyPressWithShift(Robot r, int key) {
        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(key);
        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_SHIFT);
        r.delay(100);
    }
	 
    // ctrl+ 按键
    public static void keyPressWithCtrl(Robot r, int key) {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(key);
        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.delay(100);
    }
	 
    // alt+ 按键
    public static void keyPressWithAlt(Robot r, int key) {
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(key);
        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_ALT);
        r.delay(100);
    }
    //打印出字符串
    public static void keyPressString(Robot r, String str){
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();//获取剪切板
        Transferable tText = new StringSelection(str);
        clip.setContents(tText, null); //设置剪切板内容
        keyPressWithCtrl(r, KeyEvent.VK_V);//粘贴
        r.delay(100);
    }
     
    //单个 按键
    public static void keyPress(Robot r,int key){
        r.keyPress(key);
        r.keyRelease(key);
        r.delay(300);
    }

	
}
