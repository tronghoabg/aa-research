package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dyf extends android.os.Binder implements defpackage.dyg {
    private final defpackage.affc a;
    private final defpackage.affc b;

    public dyf(defpackage.affc affcVar, defpackage.affc affcVar2) {
        attachInterface(this, "androidx.core.telecom.extensions.ICallIconStateListener");
        this.a = affcVar;
        this.b = affcVar2;
    }

    @Override // defpackage.dyg
    public final void a() {
        this.b.invoke(defpackage.afbk.a);
    }

    @Override // defpackage.dyg
    public final void b(android.net.Uri uri) {
        uri.getClass();
        this.a.invoke(uri);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.ICallIconStateListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.ICallIconStateListener");
            return true;
        }
        if (i == 1) {
            b((android.net.Uri) (parcel.readInt() != 0 ? android.net.Uri.CREATOR.createFromParcel(parcel) : null));
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            a();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
