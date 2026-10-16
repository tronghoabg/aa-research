package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qxo extends defpackage.ijv implements defpackage.qxq {
    public qxo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMediaPlaybackStatus");
    }

    @Override // defpackage.qxq
    public final void f(qxt qxtVar, java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, java.lang.String str4, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxtVar);
        parcelFp.writeString(str);
        parcelFp.writeString(str2);
        parcelFp.writeString(str3);
        parcelFp.writeByteArray(bArr);
        parcelFp.writeString(null);
        parcelFp.writeInt(i);
        parcelFp.writeInt(0);
        fr(2, parcelFp);
    }

    @Override // defpackage.qxq
    public final void g(qxt qxtVar, int i, java.lang.String str, int i2, boolean z, boolean z2, boolean z3) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxtVar);
        parcelFp.writeInt(i);
        parcelFp.writeString(str);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(0);
        parcelFp.writeInt(0);
        fr(1, parcelFp);
    }

    @Override // defpackage.qxq
    public final boolean h(qxt qxtVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxtVar);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qxq
    public final boolean i(qxt qxtVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxtVar);
        android.os.Parcel parcelFq = fq(4, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
