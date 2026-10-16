package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sxt extends defpackage.ijv implements android.os.IInterface {
    public sxt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(defpackage.qxn qxnVar, defpackage.sxs sxsVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxnVar);
        defpackage.ijx.i(parcelFp, sxsVar);
        fr(4, parcelFp);
    }
}
