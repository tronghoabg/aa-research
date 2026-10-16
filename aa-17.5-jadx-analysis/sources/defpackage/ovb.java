package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class ovb extends ijo implements ovc {
    public ovb() {
        super("com.google.android.apps.auto.sdk.ICarRegionController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            e();
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zF = f();
            parcel2.writeNoException();
            ClassLoader classLoader = ijp.a;
            parcel2.writeInt(zF ? 1 : 0);
        }
        return true;
    }
}
