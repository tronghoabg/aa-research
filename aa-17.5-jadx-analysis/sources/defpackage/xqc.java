package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class xqc extends ijn implements xqe {
    public xqc(IBinder iBinder) {
        super(iBinder, "com.google.android.projection.sdk.demand.ICallbacks");
    }

    @Override // defpackage.xqe
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(3, parcelGh);
    }
}
