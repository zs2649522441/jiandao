package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.xiangnmu.R;

public class Myfragment extends Fragment {

    private EditText phone_num;
    private EditText verfied;
    private Button send_verfied_bug;
    private Button login;
    private Button login_zc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.myfragment, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        phone_num =inflate. findViewById(R.id.phone_num);
        verfied= inflate.findViewById(R.id.verified);
        send_verfied_bug= inflate.findViewById(R.id.send_verfied_bug);
        login= inflate.findViewById(R.id.login_but);
        login_zc= inflate.findViewById(R.id.login_but_zc);
    }
}
