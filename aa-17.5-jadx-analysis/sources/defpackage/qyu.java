package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qyu extends ijn implements qyw {
    public qyu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVideoFocusListener");
    }

    @Override // defpackage.qyw
    public final void e(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gk(1, parcelGh);
    }
}
