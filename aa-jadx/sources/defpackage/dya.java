package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dya implements defpackage.dyc {
    private final android.os.IBinder a;

    public dya(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dyc
    public final void b(int i, java.lang.String str) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.dyc
    public final void c() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.IActionsResultCallback");
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
