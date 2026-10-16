package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xqf extends ijn implements xqh {
    public xqf(IBinder iBinder) {
        super(iBinder, "com.google.android.projection.sdk.demand.IDemandSpace");
    }

    @Override // defpackage.xqh
    public final void e(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(5, parcelGh);
    }

    @Override // defpackage.xqh
    public final void f(xqe xqeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, xqeVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.xqh
    public final void g(xqe xqeVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, xqeVar);
        gj(2, parcelGh);
    }
}
