package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dyq implements defpackage.dys {
    private final android.os.IBinder a;

    public dyq(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dys
    public final void a() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dys
    public final void b(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
            parcelObtain.writeString(str);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.dys
    public final void c(int i) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
            parcelObtain.writeInt(i);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
