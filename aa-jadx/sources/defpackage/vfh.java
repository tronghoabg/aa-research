package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfh extends defpackage.ijv implements defpackage.vfj {
    public vfh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.ILocationSourceDelegate");
    }

    @Override // defpackage.vfj
    public final void a(defpackage.vhd vhdVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, vhdVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.vfj
    public final void b() throws android.os.RemoteException {
        fr(2, fp());
    }
}
