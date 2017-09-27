package tut.mib.com.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MsgReceiver extends AppCompatActivity {
    static  String EXTRA_MESSAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_receiver);
        TextView tv1 = findViewById(R.id.recivedmsg);
        Intent  intent = getIntent();
        String msg = intent.getStringExtra(EXTRA_MESSAGE);
        tv1.setText(msg);

    }
}
