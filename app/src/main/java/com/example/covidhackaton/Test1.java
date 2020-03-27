package com.example.covidhackaton;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class Test1 extends Fragment {

    @BindView(R.id.textView)
    TextView textView;

    Test1ViewModel test1ViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test1, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        test1ViewModel = new ViewModelProvider(requireActivity()).get(Test1ViewModel.class);


        test1ViewModel.someData.observe(getViewLifecycleOwner(), value -> {
            textView.setText(String.valueOf(value));
        });
    }

    @OnClick(R.id.button)
    void goToTest2() {
        Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.action_test1_to_test2);
    }

}
