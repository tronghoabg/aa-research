package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class qzl extends ijo implements qzm {
    public qzl() {
        super("com.google.android.gms.car.IDrivingStatusCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            a(i2);
        } else if (i == 2) {
            parcel.readString();
            ijp.d(parcel);
        } else if (i == 3) {
            boolean zJ = ijp.j(parcel);
            ijp.d(parcel);
            c(zJ);
        } else {
            if (i != 4) {
                return false;
            }
            ijp.j(parcel);
            ijp.d(parcel);
        }
        return true;
    }
}
