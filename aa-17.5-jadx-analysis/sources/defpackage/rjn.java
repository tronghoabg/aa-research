package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rjn extends ijn implements rjp {
    public rjn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
    }

    @Override // defpackage.rjp
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(2, parcelGh);
    }

    @Override // defpackage.rjp
    public final void f() throws RemoteException {
        gj(3, gh());
    }
}
