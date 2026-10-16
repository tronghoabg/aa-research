package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class scs extends defpackage.ijv implements android.os.IInterface {
    public scs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IConnectionTransferCallbacks");
    }

    public final void e() throws android.os.RemoteException {
        fr(2, fp());
    }

    public final void f(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(1, parcelFp);
    }
}
