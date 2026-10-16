package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class oux extends ijn implements ouz {
    public oux(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.ICapabilityController");
    }

    @Override // defpackage.ouz
    public final List e() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        ArrayList<String> arrayListCreateStringArrayList = parcelGi.createStringArrayList();
        parcelGi.recycle();
        return arrayListCreateStringArrayList;
    }
}
