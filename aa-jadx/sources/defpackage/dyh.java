package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dyh implements defpackage.dyj {
    private final android.os.IBinder a;

    public dyh(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dyj
    public final void a(int i, int[] iArr, java.lang.String str, defpackage.dyg dygVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArr);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(dygVar);
            this.a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dyj
    public final void b(int i, int[] iArr, defpackage.dyp dypVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArr);
            parcelObtain.writeStrongInterface(dypVar);
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.dyj
    public final void c(int i, defpackage.dys dysVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongInterface(dysVar);
            this.a.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.dyj
    public final void d() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
