package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qjh extends ijo implements qji {
    public qjh() {
        super("com.google.android.gearhead.sdk.assistant.IVoicePlate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            a(i2);
        } else if (i == 2) {
            int i3 = parcel.readInt();
            ijp.d(parcel);
            c(i3);
        } else if (i == 3) {
            parcel.readString();
            parcel.readString();
            ijp.d(parcel);
            d();
        } else {
            if (i != 4) {
                return false;
            }
            int i4 = parcel.readInt();
            parcel.readString();
            ijp.d(parcel);
            f(i4);
        }
        return true;
    }
}
