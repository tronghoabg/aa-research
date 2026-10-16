package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcc extends defpackage.ijv implements defpackage.pce {
    public pcc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedService");
    }

    @Override // defpackage.pce
    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(5, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.pce
    public final boolean f(android.os.IBinder iBinder, defpackage.pch pchVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeStrongBinder(iBinder);
        defpackage.ijx.i(parcelFp, pchVar);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.pce
    public final boolean g(android.os.IBinder iBinder) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeStrongBinder(iBinder);
        android.os.Parcel parcelFq = fq(6, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.pce
    public final void h(android.os.IBinder iBinder) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeStrongBinder(iBinder);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
    }
}
