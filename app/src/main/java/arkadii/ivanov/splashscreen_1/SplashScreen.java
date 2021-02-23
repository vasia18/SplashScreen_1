package arkadii.ivanov.splashscreen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

public class SplashScreen extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));  // ставим таймер на Splash screen

		Intent intent = new Intent(this, MainActivity.class); //обьявляем намеренья перехода из тикущего окна (SplashScreen.java) в окно MainActivity.java
		startActivity(intent); //запускаем намеренья
		finish(); //закрыть
	}
}