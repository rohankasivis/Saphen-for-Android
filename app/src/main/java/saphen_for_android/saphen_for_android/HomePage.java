package saphen_for_android.saphen_for_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HomePage extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    public void onButtonClick(View view)
    {
        if(view.getId() == R.id.list_button)
        {
            Intent intent = new Intent(HomePage.this, ListActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.request_button)
        {
            Intent intent = new Intent(HomePage.this, RequestActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.mark_button)
        {
            Intent intent = new Intent(HomePage.this, MarkActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.travel_button)
        {
            Intent intent = new Intent(HomePage.this, TravelActivity.class);
            startActivity(intent);
        }
    }
}
