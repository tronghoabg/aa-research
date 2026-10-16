package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class rwr extends ijo implements rws {
    public rwr() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            ijp.d(parcel);
            a(i2, bArrCreateByteArray);
        } else if (i == 2) {
            b();
        } else {
            if (i != 3) {
                return false;
            }
            c();
        }
        parcel2.writeNoException();
        return true;
    }
}
