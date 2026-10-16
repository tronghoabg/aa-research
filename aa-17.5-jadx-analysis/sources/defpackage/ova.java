package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ova extends ijn implements ovc {
    public ova(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.ICarRegionController");
    }

    @Override // defpackage.ovc
    public final void e() throws RemoteException {
        gj(1, gh());
    }

    @Override // defpackage.ovc
    public final boolean f() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
