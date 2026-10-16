package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: classes.dex */
public final class qwb extends ijn implements qwd {
    public qwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallback");
    }

    @Override // defpackage.qwd
    public final void e(BitmapTeleporter bitmapTeleporter) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bitmapTeleporter);
        gk(2, parcelGh);
    }
}
