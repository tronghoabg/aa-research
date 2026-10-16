package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rkg extends defpackage.ijv implements defpackage.rki {
    public rkg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayManager");
    }

    @Override // defpackage.rki
    public final void a(defpackage.rkl rklVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rklVar);
        fs(2, parcelFp);
    }

    @Override // defpackage.rki
    public final void b(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeTypedList(list);
        fs(4, parcelFp);
    }

    @Override // defpackage.rki
    public final void c(defpackage.rkl rklVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rklVar);
        fs(3, parcelFp);
    }
}
