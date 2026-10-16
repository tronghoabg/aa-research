package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qwf extends ijo implements qwg {
    public qwf() {
        super("com.google.android.gms.car.ICarConnectionListener");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            b(i2);
        } else if (i == 2) {
            c();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            ijp.d(parcel);
            a(i3);
        }
        return true;
    }
}
