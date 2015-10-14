package edu.kvcc.cis298.workwithclasses.workwithclasses;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by aaernie7528 on 10/14/2015.
 */
public class SubActivity {
    private TextView mMessage;
    private boolean mCool;

    public static Intent newIntent(Context packageContext, String theMessage){
        Intent i = new Intent(packageContext, SubActivity.class);
        i.putExtra("the_sub_key",theMessage);
        return i;
    }
    public static boolean userIsCool(Intent result){
        return result.getBooleanExtra("been_there", true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        mMessage = (TextView) findViewById(R.id.cool_text_view);

        String theMessageString = getIntent().getStringExtra("the_sub_key");
        mMessage.setText(theMessageString);

        Intent data = new Intent();
        data.putExtra("been_there", mCool);
        setResult(RESULT_OK, data);

    }

}
