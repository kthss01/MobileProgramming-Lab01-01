package embedded.kookmin.ac.kr.lab01_01;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 김태훈 on 2015-11-05.
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onNewBtnBack(View v) {
        Log.d("Test", "Back!!");
        finish();
    }
    public void onLoging(View v) {
        EditText id = (EditText)findViewById(R.id.editTextID);
        Toast.makeText(getApplicationContext(), id.getText(), Toast.LENGTH_LONG).show();
    }
}
