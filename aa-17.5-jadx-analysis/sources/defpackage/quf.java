package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class quf extends ijo implements qug {
    public quf() {
        super("com.google.android.gms.car.IAudioPolicy");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            qum qumVarF = f(i2);
            parcel2.writeNoException();
            ijp.i(parcel2, qumVarF);
        } else if (i == 2) {
            int i3 = parcel.readInt();
            int[] iArrCreateIntArray = parcel.createIntArray();
            ijp.d(parcel);
            qum qumVarG = g(i3, iArrCreateIntArray);
            parcel2.writeNoException();
            ijp.i(parcel2, qumVarG);
        } else if (i == 3) {
            int iE = e();
            parcel2.writeNoException();
            parcel2.writeInt(iE);
        } else {
            if (i != 4) {
                return false;
            }
            h();
            parcel2.writeNoException();
        }
        return true;
    }
}
