package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dyk implements defpackage.dym {
    private final android.os.IBinder a;

    public dyk(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dym
    public final void a(boolean z, defpackage.dyc dycVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ILocalSilenceActions");
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeStrongInterface(dycVar);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }
}
