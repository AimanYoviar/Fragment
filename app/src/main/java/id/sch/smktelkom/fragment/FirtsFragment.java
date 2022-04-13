package id.sch.smktelkom.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.textfield.TextInputEditText;

public class FirtsFragment extends Fragment{
    private PageViewModel pageViewModel;
    public Button button;
    public FirtsFragment() {

    }
    /**
     * Create a new instance of this fragment
     * @return A new instance of fragment FirstFragment.
     */
    public static FirtsFragment newInstance() {
        return new FirtsFragment();
    }
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// init ViewModel
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_firts, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable
            Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText nameEditText =
                view.findViewById(R.id.textInputTextName);
// Add Text Watcher on name input text
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int
                    i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setName(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        TextInputEditText nameAgeText = view.findViewById(R.id.textInputTextAge);
        // Add Text Watcher on name input text
        nameAgeText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setAge(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        TextInputEditText namePhoneText = view.findViewById(R.id.textInputTextPhone);
        // Add Text Watcher on name input text
        namePhoneText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setPhone(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
        TextInputEditText nameAddressText = view.findViewById(R.id.textInputTextAddress);
        // Add Text Watcher on name input text
        nameAddressText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setAddress(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

    }
}