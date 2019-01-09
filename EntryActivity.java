package atakanov.nariman.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EntryActivity extends AppCompatActivity {
    FragmentManager fragmentManager = getFragmentManager();
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        showAuth();
    }

    private void showAuth() {
        AuthFragment fragment = new AuthFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.entry_container, fragment)
                .addToBackStack(null)
                .commit();
        if(fragment.success){
            showMain();
        }
    }

    private void showMain() {
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment,fragment)
                .addToBackStack(null)
                .commit();
    }

    public static class AuthFragment extends Fragment {
        boolean success;
        public final void onAuthSuccess() {
            success = true;
        }
    }

    public static class MainFragment extends Fragment { }
}
