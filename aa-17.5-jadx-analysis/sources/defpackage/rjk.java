package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class rjk extends ijn implements rjm {
    public rjk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayManager");
    }

    @Override // defpackage.rjm
    public final void a(rjp rjpVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rjpVar);
        gk(2, parcelGh);
    }

    @Override // defpackage.rjm
    public final void b(List list) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeTypedList(list);
        gk(4, parcelGh);
    }

    @Override // defpackage.rjm
    public final void c(rjp rjpVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rjpVar);
        gk(3, parcelGh);
    }
}
