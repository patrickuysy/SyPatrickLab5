package sy.patrick.com.sypatricklab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SyPatrickLab5_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy_patrick_lab5_2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if(v.getId() == R.id.actbtn1)
        {
            i = new Intent(this, SyPatrickLab5_1.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.mapbtn)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.594316,120.970606"));
            chooser = Intent.createChooser(i, "create a map application");
            startActivity(chooser);
        }
    }
}
