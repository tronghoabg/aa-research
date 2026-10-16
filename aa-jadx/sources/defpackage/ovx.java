package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ovx extends defpackage.ijv implements defpackage.ovz {
    public ovx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.ICarRegionController");
    }

    @Override // defpackage.ovz
    public final void e() throws android.os.RemoteException {
        fr(1, fp());
    }

    @Override // defpackage.ovz
    public final boolean f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
