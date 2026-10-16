package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class owi extends defpackage.ijv implements defpackage.owk {
    public owi(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IImeCallback");
    }

    @Override // defpackage.owk
    public final void e() throws android.os.RemoteException {
        fr(2, fp());
    }

    @Override // defpackage.owk
    public final void f() throws android.os.RemoteException {
        fr(3, fp());
    }

    @Override // defpackage.owk
    public final boolean g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
