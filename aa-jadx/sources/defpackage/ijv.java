package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ijv implements android.os.IInterface {
    private final android.os.IBinder a;
    private final java.lang.String b;

    protected ijv(android.os.IBinder iBinder, java.lang.String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.a;
    }

    public final android.os.Parcel fp() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final android.os.Parcel fq(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (java.lang.RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final void fr(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void fs(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public java.lang.String getInterfaceDescriptor() {
        return this.b;
    }
}
