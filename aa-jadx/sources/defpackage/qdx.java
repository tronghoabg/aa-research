package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qdx extends defpackage.ijv implements defpackage.qdz {
    public qdx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileCallback");
    }

    @Override // defpackage.qdz
    public final void e(long j, int i, byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeByteArray(bArr);
        fr(4, parcelFp);
    }

    @Override // defpackage.qdz
    public final void f(long j, int i, int i2, byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeByteArray(bArr);
        fr(1, parcelFp);
    }

    @Override // defpackage.qdz
    public final void g(long j, int i, byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeInt(0);
        parcelFp.writeByteArray(bArr);
        fr(3, parcelFp);
    }

    @Override // defpackage.qdz
    public final void h(long j, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(0);
        defpackage.ijx.g(parcelFp, bundle);
        fr(2, parcelFp);
    }
}
