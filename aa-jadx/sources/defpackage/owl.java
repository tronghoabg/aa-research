package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class owl extends defpackage.ijv implements defpackage.own {
    public owl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IImeController");
    }

    @Override // defpackage.own
    public final void e(defpackage.owk owkVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, owkVar);
        fr(1, parcelFp);
    }
}
