package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class svr extends defpackage.ijv implements android.os.IInterface {
    public svr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(defpackage.svq svqVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, svqVar);
        parcelFp.writeString(str);
        fr(5, parcelFp);
    }
}
