package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class qul extends ijo implements qum {
    public qul() {
        super("com.google.android.gms.car.IAudioRecord");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int iE = e();
            parcel2.writeNoException();
            parcel2.writeInt(iE);
        } else if (i == 2) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            ParcelFileDescriptor parcelFileDescriptorF = f(i2);
            parcel2.writeNoException();
            ijp.h(parcel2, parcelFileDescriptorF);
        } else {
            if (i != 3) {
                return false;
            }
            g();
            parcel2.writeNoException();
        }
        return true;
    }
}
