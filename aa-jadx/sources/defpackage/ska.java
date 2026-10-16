package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ska extends defpackage.ijv implements android.os.IInterface {
    public ska(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void e(defpackage.sjz sjzVar, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, sjzVar);
        defpackage.ijx.g(parcelFp, batchedLogErrorParcelable);
        fs(8, parcelFp);
    }
}
