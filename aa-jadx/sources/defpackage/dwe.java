package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dwe implements defpackage.dwg {
    private final android.os.IBinder a;

    public dwe(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dwg
    public final void a(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            parcelObtain.writeInt(i);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(1, parcelObtain, null, 1)) {
                throw new android.os.RemoteException("Method send is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }
}
