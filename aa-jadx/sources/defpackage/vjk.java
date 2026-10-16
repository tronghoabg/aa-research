package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjk extends defpackage.ijv implements defpackage.vjm {
    public vjk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.ISnapshotReadyCallback");
    }

    @Override // defpackage.vjm
    public final void a(android.graphics.Bitmap bitmap) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.vjm
    public final void b(defpackage.srh srhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, srhVar);
        fr(2, parcelFp);
    }
}
