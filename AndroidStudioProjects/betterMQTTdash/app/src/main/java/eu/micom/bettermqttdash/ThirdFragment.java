package eu.micom.bettermqttdash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by daze on 14.01.17.
 */

public class ThirdFragment extends Fragment {
 // BLAAAA
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        myView = inflater.inflate(R.layout.third_layout, container, false);
        return myView;
    }
}
