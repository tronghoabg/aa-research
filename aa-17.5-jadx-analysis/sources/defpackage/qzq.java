package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qzq extends ijn implements qzs {
    public qzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IProjectionLifecycle");
    }

    @Override // defpackage.qzs
    public final void e(Bundle bundle, qzv qzvVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        ijp.i(parcelGh, qzvVar);
        gk(3, parcelGh);
    }

    @Override // defpackage.qzs
    public final void f() throws RemoteException {
        gk(2, gh());
    }

    @Override // defpackage.qzs
    public final void g(qzv qzvVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qzvVar);
        gk(4, parcelGh);
    }

    @Override // defpackage.qzs
    public final void h(qzv qzvVar, qup qupVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qzvVar);
        ijp.i(parcelGh, qupVar);
        gk(1, parcelGh);
    }

    @Override // defpackage.qzs
    public final void i(qzv qzvVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qzvVar);
        gk(5, parcelGh);
    }
}
