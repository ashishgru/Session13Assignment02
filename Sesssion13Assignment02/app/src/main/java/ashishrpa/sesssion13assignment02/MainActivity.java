package ashishrpa.sesssion13assignment02;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.mipmap.ic_launcher01);
        actionBar.setTitle("Android ActionBar");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.abar_contacts:{

                Toast.makeText(this, "Contacts option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Contacts option selected");
                return true;

            }

            case R.id.abar_settings:{

                Toast.makeText(this, "Settings option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Settings option selected");
                return true;

            }

            case R.id.abar_status:{

                Toast.makeText(this, "Status option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Status option selected");
                return true;

            }
            case R.id.abar_check:{

                Toast.makeText(this, "Check option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Check option selected");
                return true;

            }

            case R.id.abar_voice:{

                Toast.makeText(this, "Voice option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Voice option selected");
                return true;

            }

            case R.id.abar_call:{

                Toast.makeText(this, "Call option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Call option selected");
                return true;

            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
