package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: classes.dex */
public abstract class qwc extends ijo implements qwd {
    public qwc() {
        super("com.google.android.gms.car.ICarCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            parcel.readInt();
            ijp.d(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) ijp.a(parcel, BitmapTeleporter.CREATOR);
        ijp.d(parcel);
        e(bitmapTeleporter);
        return true;
    }
}
