package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class ovj extends ijo implements ovk {
    public ovj() {
        super("com.google.android.apps.auto.sdk.IFacetBarController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zJ = ijp.j(parcel);
        ijp.d(parcel);
        a(zJ);
        parcel2.writeNoException();
        return true;
    }
}
