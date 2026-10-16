package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ovo extends ijn implements ovq {
    public ovo(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IImeController");
    }

    @Override // defpackage.ovq
    public final void e(ovn ovnVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, ovnVar);
        gj(1, parcelGh);
    }
}
