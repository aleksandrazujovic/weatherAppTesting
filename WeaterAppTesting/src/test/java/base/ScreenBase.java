package base;

import com.github.javafaker.Faker;
import com.github.javafaker.File;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

public class ScreenBase {

    public static AppiumDriver driver;

    public static Faker faker = new Faker();

    public ScreenBase(AppiumDriver driver){
        this.driver = driver;
    }

    public static void verticalScroll (AppiumDriver driver){

        WebElement area = driver.findElement(By.id("android:id/content"));

        int centerX = area.getRect().x + (area.getSize().width/2);
        double startY = area.getRect().y + (area.getSize().getHeight() * 0.9);
        double endY = area.getRect().y + (area.getSize().getHeight() * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger,1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX, (int) startY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),centerX,(int)endY));
        swipe.addAction(finger.createPointerUp(0));

        driver.perform(Arrays.asList(swipe));

    }

    public static void longPress (AppiumDriver driver){

        WebElement favLoc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup"));

        Point element_location = favLoc.getLocation(); //Getting element's location
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence longpress = new Sequence(finger, 1);
        longpress.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(), element_location.x, element_location.y));
        longpress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        longpress.addAction(finger.createPointerMove(Duration.ofMillis(2000),PointerInput.Origin.viewport(), element_location.x, element_location.y));
        longpress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(longpress));

    }





}
