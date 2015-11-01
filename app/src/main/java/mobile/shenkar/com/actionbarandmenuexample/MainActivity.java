package mobile.shenkar.com.actionbarandmenuexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //For this reason, you should use the support
        // library's Toolbar class to implement your activities' app bars.
        // Using the support library's toolbar helps ensure that your app will have consistent
        // behavior across the widest range of devices. For example,
        // the Toolbar widget provides a material design experience on
        // devices running Android 2.1 (API level 7) or later, but the native action bar doesn't support material design
        // unless the device is running Android 5.0 (API level 21) or later.
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);


        //By default, the action bar contains just the name of the app and an overflow menu
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                Toast.makeText(this,"Settings.",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_favorite:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Toast.makeText(this,"Favorite.",Toast.LENGTH_SHORT).show();

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        MenuItem favorite = menu.findItem(R.id.action_favorite);
        Toast.makeText(this,"onPrepareOptionsMenu",Toast.LENGTH_SHORT).show();
        return true;
    }

    public void changeMenuClick(View v){
        //call invalidateOptionsMenu() to request that the system call onPrepareOptionsMenu()
        invalidateOptionsMenu();
    }


}
