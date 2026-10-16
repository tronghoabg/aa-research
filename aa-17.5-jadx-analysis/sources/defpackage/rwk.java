package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rwk extends ijn implements rwm {
    public rwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.ICarServiceCallback");
    }

    @Override // defpackage.rwm
    public final void e(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(0);
        gj(3, parcelGh);
    }

    @Override // defpackage.rwm
    public final void f(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(2, parcelGh);
    }
}
