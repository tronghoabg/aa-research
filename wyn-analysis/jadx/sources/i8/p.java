package i8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class p extends j implements q {
    @Override // i8.j
    public final boolean a(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i5 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) k.a(parcel);
            k.b(parcel);
            e(bundle);
            return true;
        }
        if (i5 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) k.a(parcel);
            k.b(parcel);
            c(bundle2);
            return true;
        }
        if (i5 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) k.a(parcel);
            k.b(parcel);
            d(bundle3);
            return true;
        }
        if (i5 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) k.a(parcel);
        k.b(parcel);
        b(bundle4);
        return true;
    }
}
