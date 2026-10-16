package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcf extends defpackage.ijv implements defpackage.pch {
    public pcf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedServiceCallback");
    }

    @Override // defpackage.pch
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(3, parcelFp);
    }
}
