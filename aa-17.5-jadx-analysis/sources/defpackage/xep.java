package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xep extends ijn implements xer {
    public xep(IBinder iBinder) {
        super(iBinder, "com.google.android.projection.gearhead.sdk.ICarSystemUiCallback");
    }

    @Override // defpackage.xer
    public final void e(byte b) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeByte(b);
        gk(7, parcelGh);
    }
}
