package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dyn implements defpackage.dyp {
    private final android.os.IBinder a;

    public dyn(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dyp
    public final void a(defpackage.dym dymVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ILocalSilenceStateListener");
            parcelObtain.writeStrongInterface(dymVar);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dyp
    public final void b(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ILocalSilenceStateListener");
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
