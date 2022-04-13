package id.sch.smktelkom.fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAge = new MutableLiveData<>();
    private MutableLiveData<String> mPhone= new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }

    public LiveData<String> getName() {
        return mName;
    }

    // Umur
    public void setAge(String name) {
        mAge.setValue(name);
    }

    public LiveData<String> getAge() {
        return mAge;
    }

    public void setPhone(String name) {
        mPhone.setValue(name);
    }

    public LiveData<String> getPhone() {
        return mPhone;
    }

    public void setAddress(String name) {
        mAddress.setValue(name);
    }

    public LiveData<String> getAddress() {
        return mAddress;
    }
}


