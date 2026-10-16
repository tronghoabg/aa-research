package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vgp extends defpackage.ijv implements defpackage.vgr {
    public vgp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // defpackage.vgr
    public final void e() throws android.os.RemoteException {
        fr(1, fp());
    }

    @Override // defpackage.vgr
    public final void f(com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate iIndoorBuildingDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iIndoorBuildingDelegate);
        fr(2, parcelFp);
    }
}
