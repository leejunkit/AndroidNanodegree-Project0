package co.cloudpastor.appportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends ActionBarActivity {

    private Map<String, String> mapping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Map<String, String> mapping = new HashMap<String, String>();
        mapping.put("Proj1", "SPOTIFY STREAMER app.");
        mapping.put("Proj2", "SCORES app.");
        mapping.put("Proj3", "LIBRARY app.");
        mapping.put("Proj4", "BUILD IT BIGGER app.");
        mapping.put("Proj5", "XYZ READER app.");
        mapping.put("Capstone", "CAPSTONE app.");

        this.mapping = mapping;

        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnClicked(View view) {
        Button btn = (Button)view;

        // create the toast
        String text = "This button will launch my " + getProjectNameFromButtonTag((String)btn.getTag());
        Toast t = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        t.show();
    }

    private String getProjectNameFromButtonTag(String tag) {
        return this.mapping.get(tag);
    }
}
