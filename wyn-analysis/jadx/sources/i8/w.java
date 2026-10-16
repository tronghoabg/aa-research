package i8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class w extends j implements x {
    @Override // i8.j
    public final boolean a(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) k.a(parcel);
        k.b(parcel);
        b(bundle);
        return true;
    }
}
