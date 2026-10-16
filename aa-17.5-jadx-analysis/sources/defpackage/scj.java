package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class scj extends ijn implements scl {
    public scj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IZeroPartyChecker");
    }

    @Override // defpackage.scl
    public final void e(sco scoVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, scoVar);
        gk(1, parcelGh);
    }
}
