package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qea extends defpackage.ijv implements defpackage.qec {
    public qea(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileService");
    }

    @Override // defpackage.qec
    public final void e(long j, int i, int i2, byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeByteArray(bArr);
        fr(1, parcelFp);
    }

    @Override // defpackage.qec
    public final byte[] f(long j, int i, long j2, int i2, byte[] bArr, defpackage.qdz qdzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeLong(-4319067186032159575L);
        parcelFp.writeInt(i2);
        parcelFp.writeByteArray(bArr);
        defpackage.ijx.i(parcelFp, qdzVar);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        byte[] bArrCreateByteArray = parcelFq.createByteArray();
        parcelFq.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.qec
    public final byte[] g(long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(4, parcelFp);
        byte[] bArrCreateByteArray = parcelFq.createByteArray();
        parcelFq.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.qec
    public final android.os.Bundle h(long j) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(0);
        android.os.Parcel parcelFq = fq(5, parcelFp);
        android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcelFq, android.os.Bundle.CREATOR);
        parcelFq.recycle();
        return bundle;
    }

    @Override // defpackage.qec
    public final void i(long j, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(0);
        defpackage.ijx.g(parcelFp, bundle);
        fr(2, parcelFp);
    }
}
