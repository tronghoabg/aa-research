package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vea extends ijo implements veb {
    public vea() {
        super("com.google.android.libraries.maps.internal.ICancelableCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            b();
        } else {
            if (i != 2) {
                return false;
            }
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
