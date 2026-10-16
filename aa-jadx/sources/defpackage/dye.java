package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dye implements defpackage.dyg {
    private final android.os.IBinder a;

    public dye(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dyg
    public final void a() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICallIconStateListener");
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dyg
    public final void b(android.net.Uri uri) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICallIconStateListener");
            parcelObtain.writeInt(1);
            uri.writeToParcel(parcelObtain, 0);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
