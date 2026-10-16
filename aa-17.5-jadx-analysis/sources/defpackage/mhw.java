package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mhw extends ijn implements mhy {
    public mhw(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.projectionstate.IProjectionStateOwner");
    }

    @Override // defpackage.mhy
    public final boolean e() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
