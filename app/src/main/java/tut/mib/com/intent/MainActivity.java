package tut.mib.com.intent;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText msg = (EditText) findViewById(R.id.msg);
       // Button btn = (Button) findViewById(R.id.btnsendmsg);


    }

    public void SendMsgToMsgReceiver(View view) {
        EditText msg = (EditText) findViewById(R.id.msg);
        String messg = msg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
     //   Intent receiverIntent = new Intent(this, MsgReceiver.class);
       //
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messg);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Hello there");
        startActivity(intent);
    }
}
