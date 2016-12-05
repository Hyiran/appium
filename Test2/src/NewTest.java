import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;

import org.apache.bcel.generic.NEW;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.SetupApi;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;


public class NewTest extends BaseExample {
	private static final String TEMP_FILE = null;
	private static AppiumDriver<MobileElement> driver;

	String phoneTx="//UIAApplication[1]/UIAWindow[2]/UIATextField[1]";
	String pswTx="//UIAApplication[1]/UIAWindow[2]/UIASecureTextField[1]";
	String loginBt="//UIAApplication[1]/UIAWindow[2]/UIAButton[1]";
	String yishangBt="//UIAApplication[1]/UIAWindow[1]/UIAButton[3]";
	String qiehuanBt="//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAStaticText[1]";
	String huifangBt="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAButton[1]";
	String hf_2="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]";
	String hf_1="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]";
	String hf_3="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]/UIAButton[1]";
	String hf_12="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAButton[1]";
	String xhzBt1="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[1]";
	String xhzBt2="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[2]";
	String xhzBt3="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[3]";
	String xhzBt5="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[5]";
	String xhzBt6="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[6]";
	String xhzBt7="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[7]";
	String qhhz2="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]";
	String qhhz3="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]";
	String qhhz4="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[4]";
	String qhhz5="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[5]";
	String qhhz6="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[6]";
	String qhhz7="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[7]";

	String hz1="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[1]";
	String hz11="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[2]";
	String hz2="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[2]/UIAStaticText[1]";
	String hz22="//UIAApplication[1]/UIAWindow[2]/UIACollectionView[1]/UIACollectionCell[2]/UIAStaticText[2]";
	String jinrujiaoshiBt="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]";
	String backBt="//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
	String kc1="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAStaticText[1]";
	String kc2="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAStaticText[2]";
	String kc3="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAStaticText[3]";
	String kc4="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAStaticText[4]";
	String kc5="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[12]/UIAStaticText[5]";
	String qhhz="//UIAApplication[1]/UIAWindow[1]/UIAImage[1]";
	String qhkc="//UIAApplication[1]/UIAWindow[1]/UIAImage[2]/UIAStaticText[1]";
	String kc_qt="//UIAApplication[1]/UIAWindow[1]/UIAButton[2]";
	String kc__qt="//UIAApplication[1]/UIAWindow[1]/UIAButton[3]";
	String kc___qt="//UIAApplication[1]/UIAWindow[1]/UIAButton[4]";
	String kc_qt_1="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]";
	String kc_qt_2="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]";
	String kc_qt_3="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]";
	String kc_qt_8="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[8]";

	//图片相似度对比
	// 全流程
	public static String Comp1(String a,String b) throws IOException {
		// 获取图像
		File imageFile = new File(a);
		File imageFile2 = new File(b);
		Image image = ImageIO.read(imageFile);
		Image image2 = ImageIO.read(imageFile2);

		// 转换至灰度
		image = toGrayscale(image);
		image2 = toGrayscale(image2);
		// 缩小成32x32的缩略图
		image = scale(image);
		image2=scale(image2);
		// 获取灰度像素数组
		int[] pixels = getPixels(image);
		int[] pixels2=getPixels(image2);
		// 获取平均灰度颜色
		int averageColor = getAverageOfPixelArray(pixels);
		int averageColor2 = getAverageOfPixelArray(pixels2);

		// 获取灰度像素的比较数组（即图像指纹序列）
		pixels = getPixelDeviateWeightsArray(pixels, averageColor);
		pixels2=getPixelDeviateWeightsArray(pixels2, averageColor2);
		// 获取两个图的汉明距离（假设另一个图也已经按上面步骤得到灰度比较数组）
		int hammingDistance = getHammingDistance(pixels, pixels2);
		// 通过汉明距离计算相似度，取值范围 [0.0, 1.0]
		double similarity = calSimilarity(hammingDistance);
		String text="与目标图片相似程度： "+similarity*100+"%";
		return text;
	}

	// 将任意Image类型图像转换为BufferedImage类型，方便后续操作
	public static BufferedImage convertToBufferedFrom(Image srcImage) {
		BufferedImage bufferedImage = new BufferedImage(srcImage.getWidth(null),
				srcImage.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = bufferedImage.createGraphics();
		g.drawImage(srcImage, null, null);
		g.dispose();
		return bufferedImage;
	}

	// 转换至灰度图
	public static BufferedImage toGrayscale(Image image) {
		BufferedImage sourceBuffered = convertToBufferedFrom(image);
		ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
		ColorConvertOp op = new ColorConvertOp(cs, null);
		BufferedImage grayBuffered = op.filter(sourceBuffered, null);
		return grayBuffered;
	}

	// 缩放至32x32像素缩略图
	public static Image scale(Image image) {
		image = image.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		return image;
	}

	// 获取像素数组
	public static int[] getPixels(Image image) {
		int width = image.getWidth(null);
		int height = image.getHeight(null);
		int[] pixels = convertToBufferedFrom(image).getRGB(0, 0, width, height,
				null, 0, width);
		return pixels;
	}

	// 获取灰度图的平均像素颜色值
	public static int getAverageOfPixelArray(int[] pixels) {
		Color color;
		long sumRed = 0;
		for (int i = 0; i < pixels.length; i++) {
			color = new Color(pixels[i], true);
			sumRed += color.getRed();
		}
		int averageRed = (int) (sumRed / pixels.length);
		return averageRed;
	}

	// 获取灰度图的像素比较数组（平均值的离差）
	public static int[] getPixelDeviateWeightsArray(int[] pixels,final int averageColor) {
		Color color;
		int[] dest = new int[pixels.length];
		for (int i = 0; i < pixels.length; i++) {
			color = new Color(pixels[i], true);
			dest[i] = color.getRed() - averageColor > 0 ? 1 : 0;
		}
		return dest;
	}

	// 获取两个缩略图的平均像素比较数组的汉明距离（距离越大差异越大）
	public static int getHammingDistance(int[] a, int[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] == b[i] ? 0 : 1;
		}
		return sum;
	}

	// 通过汉明距离计算相似度
	public static double calSimilarity(int hammingDistance){
		int length = 32*32;
		double similarity = (length - hammingDistance) / (double) length;

		// 使用指数曲线调整相似度结果
		similarity = java.lang.Math.pow(similarity, 2);
		return similarity;
	}
	//截取图片
	public  String getScreen(String a){
		String fileRoute="/Users/zhukai/Desktop/截图/";
		//			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		String picname=fileRoute+a+".png";
		File screen = driver.getScreenshotAs(OutputType.FILE);
		//			System.out.println(picname);
		File screenFile = new File(picname);
		try {
			FileUtils.copyFile(screen, screenFile); 
			//				String time=df.format(new Date()).toString();
			//				System.out.println("当前时间"+time);
			//				return time;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return picname;   
	}
	@BeforeClass
	public void Setup()throws Exception{
		extent = ExtentManager.getReporter(filePath);
		// 设置APP路径
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apps");
		File app = new File(appDir, "app-study-iPad-dev.ipa");
		// 设置自动化相关参数
		DesiredCapabilities capabilities = new DesiredCapabilities();
		System.out.println("设置路径完毕,设置自动化相关参数");
		// 设置apk路径
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("autoDismissAlerts", true);
		// 初始化 AppiumDriver
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	public void login(String phone,String psw) throws InterruptedException {
		driver.findElement(By.xpath(phoneTx)).sendKeys(phone);
		driver.findElement(By.xpath(pswTx)).sendKeys(psw);
		test.log(LogStatus.INFO, "登录页面: " + test.addScreenCapture(getScreen("登录页面")));
		driver.findElement(By.xpath(loginBt)).click();
		Thread.sleep(10000);
		System.out.println("登录成功");
	}
	@Test
	public void AppiumTesta() throws InterruptedException, IOException {
		try {
			test = extent.startTest("登录测试");
			test.log(LogStatus.INFO, "引导页面: " + test.addScreenCapture(getScreen("引导页面1"))+Comp1("/Users/zhukai/Desktop/截图/引导页面1.png", "/Users/zhukai/Desktop/测试.png"));
			Thread.sleep(1000);
			driver.swipe(808, 579, 316, 578, 1);
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAImage[3]")).click();
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAScrollView[1]/UIAImage[1]/UIAButton[1]")).click();
			login("15210172811","123456");
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "选孩子: " + test.addScreenCapture(getScreen("选孩子")));
			driver.findElement(By.xpath(xhzBt3)).click();//选孩子
			Thread.sleep(3000);
			getScreen("我的课程");
			Comp1("/Users/zhukai/Desktop/5.png","/Users/zhukai/Desktop/8.png");
			String staticSt=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[5]")).getText();
			System.out.println(staticSt);
			int a = staticSt.indexOf("没有课");
			if (a>0) {
				System.out.println("暂无课程，进入已上课程");
				Thread.sleep(2000);
				driver.findElement(By.xpath(yishangBt)).click();
				getScreen("已上课程");
				Thread.sleep(3000);
				String temp=driver.findElement(By.xpath(kc1)).getText();
				int b = temp.indexOf("Level"); 
				if (b<0) {
					String date=driver.findElement(By.xpath(kc1)).getText();
					String Level=driver.findElement(By.xpath(kc2)).getText()
							+driver.findElement(By.xpath(kc3)).getText()
							+driver.findElement(By.xpath(kc4)).getText();
					String teacher=driver.findElement(By.xpath(kc5)).getText();
					System.out.println(date+"    "+Level+"    "+teacher);
				}
				else{
					Thread.sleep(1000);
					System.out.println("进入回放课程，课程信息：(默认打印最新一条)");
					String date=driver.findElement(By.xpath(kc1)).getText();
					String Level=driver.findElement(By.xpath(kc2)).getText()
							+driver.findElement(By.xpath(kc3)).getText();
					String teacher=driver.findElement(By.xpath(kc4)).getText();
					System.out.println(date+"    "+Level+"    "+teacher);
				}
				Thread.sleep(1000);
				driver.findElement(By.xpath(huifangBt)).click();
				getScreen("进入回放");
				Thread.sleep(5000);
				driver.findElement(By.xpath(backBt));//返回按钮
			}
			else {
				getScreen("进入我的课程");
				driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]")).click();//点击主屏幕
				driver.findElement(By.xpath(jinrujiaoshiBt)).click();//进入教室
				Thread.sleep(10000);
				driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();//点击知道了
			}
			test.log(LogStatus.PASS, "Pass");
			Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
			Thread.sleep(1000);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail");
			Assert.assertEquals(test.getRunStatus(), LogStatus.FAIL);
			test.log(LogStatus.INFO, "失败截图: " + test.addScreenCapture(getScreen("失败截图")));
		}
		driver.resetApp();
	}

	@Test
	public void AppiumTestb() throws Exception{
		try {
			test = extent.startTest("选孩子测试");
			Thread.sleep(1000);
			System.out.println("Test Two");
			String hzxx1=driver.findElement(By.xpath(hz1)).getText()+driver.findElement(By.xpath(hz11)).getText();
			test.log(LogStatus.INFO, "孩子1:"+ hzxx1 + test.addScreenCapture(getScreen("引导页面")));
			Thread.sleep(1000);
			String hzxx2=driver.findElement(By.xpath(hz2)).getText()+driver.findElement(By.xpath(hz22)).getText();
			System.out.println("孩子2:"+hzxx2);
			System.out.println("选择孩子1");
			driver.findElement(By.xpath(xhzBt1)).click();
			Thread.sleep(1000);
			System.out.println("切换孩子");
			driver.findElement(By.xpath(qhhz)).click();
			Thread.sleep(1000);
			System.out.println("选择孩子2");
			driver.findElement(By.xpath(qhhz2)).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Pass");
			Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);		
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail");
			Assert.assertEquals(test.getRunStatus(), LogStatus.FAIL);
			test.log(LogStatus.INFO, "失败截图: " + test.addScreenCapture(getScreen("失败截图")));
		}
		driver.resetApp();

	}
	@Test 
	public void AppiumTestc() throws InterruptedException{
		try{
			test = extent.startTest("中教梳理课测试");
			Thread.sleep(1000);
			System.out.println("Test Three");
			System.out.println("中教梳理课－选孩子5");
			driver.findElement(By.xpath(xhzBt5)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(yishangBt)).click();
			Thread.sleep(1000);
			System.out.println("中教梳理课回放");
			driver.findElement(By.xpath(qhkc)).click();
			test.log(LogStatus.INFO, "课程回放: " + test.addScreenCapture(getScreen("课程回放")));
			getScreen("切换课程");
			Thread.sleep(1000);
			driver.findElement(By.xpath(kc_qt)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(kc_qt_2)).click();
			Thread.sleep(3000);
			getScreen("中教梳理课");
			driver.findElement(By.xpath(hf_2)).click();
			getScreen("进入中教梳理课");
			test.log(LogStatus.INFO, "进入中教梳理课: " + test.addScreenCapture(getScreen("进入")));
			Thread.sleep(8000);
			test.log(LogStatus.PASS, "Pass");
			Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail");
			Assert.assertEquals(test.getRunStatus(), LogStatus.FAIL);
			test.log(LogStatus.INFO, "失败截图: " + test.addScreenCapture(getScreen("失败截图")));
		}
		driver.resetApp();

	}

	@Test
	public void AppiumTestd() throws InterruptedException{
		try{
			test = extent.startTest("IT Test课程测试");
			System.out.println("IT Test课程－选孩子3");
			Thread.sleep(2000);
			driver.findElement(By.xpath(xhzBt3)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]")).click();
			driver.findElement(By.xpath(yishangBt)).click();
			test.log(LogStatus.INFO, "已上课程页面: " + test.addScreenCapture(getScreen("已上课程页面3")));
			Thread.sleep(2000);
			driver.findElement(By.xpath(qhkc)).click();
			Thread.sleep(2000);
			System.out.println("IT Test回放");
			driver.findElement(By.xpath(kc__qt)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(kc_qt_1)).click();
			test.log(LogStatus.INFO, "IT Test课程: " + test.addScreenCapture(getScreen("IT Test课程")));
			driver.findElement(By.xpath(hf_1)).click();
			test.log(LogStatus.INFO, "进入教室: " + test.addScreenCapture(getScreen("进入教室ittest")));
			Thread.sleep(8000);
			test.log(LogStatus.PASS, "Pass");
			Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);		
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "失败截图: " + test.addScreenCapture(getScreen("失败截图")));
		}
		driver.resetApp();
	}
	@Test
	public void AppiumTeste() throws InterruptedException{
		try {
			test = extent.startTest("公开课测试");
			System.out.println("公开课－选孩子7");
			driver.findElement(By.xpath(xhzBt7)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]")).click();
			driver.findElement(By.xpath(yishangBt)).click();
			driver.findElement(By.xpath(qhkc)).click();
			System.out.println("公开课回放");
			driver.findElement(By.xpath(kc__qt)).click();
			test.log(LogStatus.INFO, "切换公开课页面: " + test.addScreenCapture(getScreen("公开课页面")));
			Thread.sleep(1000);
			driver.findElement(By.xpath(kc_qt_2)).click();
			test.log(LogStatus.INFO, "进入公开课: " + test.addScreenCapture(getScreen("进入公开课")));
			Thread.sleep(3000);
			driver.findElement(By.xpath(hf_3)).click();
			test.log(LogStatus.INFO, "进入教室: " + test.addScreenCapture(getScreen("进入教室")));
			Thread.sleep(1000);
			String mes=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[10]")).getText();
			test.log(LogStatus.INFO, "回放信息反馈: " +mes+ test.addScreenCapture(getScreen("回放信息")));
			System.out.println("正常");
			driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();//知道了
			System.out.println("-------------------------------");
			System.out.println("环球大冒险");
			driver.findElement(By.xpath(qhkc)).click();
			System.out.println("环球大冒险课程回放");
			driver.findElement(By.xpath(kc___qt)).click();
			test.log(LogStatus.INFO, "切换环球大冒险: " + test.addScreenCapture(getScreen("切换环球大冒险")));
			driver.findElement(By.xpath(kc_qt_1)).click();
			test.log(LogStatus.INFO, "环球大冒险页面: " + test.addScreenCapture(getScreen("环球大冒险页面")));
			Thread.sleep(3000);
			driver.findElement(By.xpath(hf_3)).click();
			test.log(LogStatus.INFO, "进入教室: " + test.addScreenCapture(getScreen("进入教室环球大冒险")));
			Thread.sleep(8000);
			System.out.println("正常");
			driver.findElement(By.xpath(backBt)).click();
			Thread.sleep(1000);
			System.out.println("-------------------------------");
			System.out.println("新版VIPKID主修课程");
			driver.findElement(By.xpath(qhkc)).click();
			Thread.sleep(2000);
			System.out.println("课程回放");
			driver.findElement(By.xpath(kc_qt_3)).click();
			test.log(LogStatus.INFO, "切换新版VIPKID主修课程页面: " + test.addScreenCapture(getScreen("切换新版VIPKID主修课程页面")));
			Thread.sleep(1000);
			driver.findElement(By.xpath(hf_12)).click();
			test.log(LogStatus.INFO, "进入教室: " + test.addScreenCapture(getScreen("进入新版VIPKID主修课程")));
			Thread.sleep(8000);
			System.out.println("正常");
			driver.findElement(By.xpath(backBt)).click();
			Thread.sleep(1000);
			System.out.println("-------------------------------");
			System.out.println("VIPKID主修课程");
			System.out.println("课程回放");
			driver.findElement(By.xpath(qhkc)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(kc_qt)).click();
			driver.findElement(By.xpath(kc_qt_8)).click();
			test.log(LogStatus.INFO, "切换VIPKID主修课程页面: " + test.addScreenCapture(getScreen("切换VIPKID主修课程页面")));
			Thread.sleep(2000);
			driver.findElement(By.xpath(hf_12)).click();
			test.log(LogStatus.INFO, "进入教室: " + test.addScreenCapture(getScreen("进入新版VIPKID主修课程页面")));
			Thread.sleep(8000);
			System.out.println("正常");
			driver.findElement(By.xpath(backBt)).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Pass");
			Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail");
			Assert.assertEquals(test.getRunStatus(), LogStatus.FAIL);
			test.log(LogStatus.INFO, "失败截图: " + test.addScreenCapture(getScreen("失败截图")));
		}		
	}

}

class ExtentManager {
	private static ExtentReports extent;

	public synchronized static ExtentReports getReporter(String filePath) {
		if (extent == null) {
			extent = new ExtentReports(filePath, true);

			extent
			.addSystemInfo("Host Name", "测试")
			.addSystemInfo("Environment", "QA");

		}

		return extent;
	}
}
abstract class BaseExample {
	protected ExtentReports extent;
	protected ExtentTest test;
	final String filePath = "/Users/zhukai/Desktop/Extent.html";
	@AfterMethod
	protected void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
		} else {
			test.log(LogStatus.PASS, "Test passed");
		}
		extent.endTest(test);        
		extent.flush();
	}



	@AfterSuite
	protected void afterSuite() {
		extent.close();
	}
}