package com.abcnull.testcase;

import com.abcnull.basetest.BaseTest;
import com.abcnull.pageobject.page.BaiduPage;
import com.abcnull.util.ScreenshotUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * 百度页面测试用例
 *
 * @author Derrick
 * @version 1.0.0
 * @date 2020/1/28
 */
public class BaiduTest extends BaseTest {
    private BaiduPage baiduPage;

    @Test(description = "百度首页_搜索测试", priority = 1)
    public void testSearch() throws IOException {
        // 初始化百度页面
        baiduPage = new BaiduPage(driver);
        // 进入百度首页
        baiduPage.enterPage();
        // 百度页面搜索检测
        assert baiduPage.search();
//        //截图
//        if(baiduPage.search()){
//            ScreenshotUtil.capture(driver);
//            File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(screenshotAs,new File("/Derrick/test.png"));
//        }

    }
}