package sy.patrick.com.sypatricklab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SyPatrickLab5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy_patrick_lab5_1);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser=null;
        if(v.getId() == R.id.activitybtn)
        {
            i = new Intent(this, SyPatrickLab5_2.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.mapbtn)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5586943,120.981250"));
            chooser = Intent.createChooser(i, "create a map application");
            startActivity(chooser);
        }
    }
}
