package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dyr extends android.os.Binder implements defpackage.dys {
    private final defpackage.affc a;
    private final defpackage.affc b;
    private final defpackage.affc c;

    public dyr(defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.affc affcVar3) {
        attachInterface(this, "androidx.core.telecom.extensions.IMeetingSummaryStateListener");
        this.a = affcVar;
        this.b = affcVar2;
        this.c = affcVar3;
    }

    @Override // defpackage.dys
    public final void a() {
        this.c.invoke(defpackage.afbk.a);
    }

    @Override // defpackage.dys
    public final void b(java.lang.String str) {
        str.getClass();
        this.a.invoke(str);
    }

    @Override // defpackage.dys
    public final void c(int i) {
        this.b.invoke(java.lang.Integer.valueOf(i));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
            return true;
        }
        if (i == 1) {
            b(parcel.readString());
        } else if (i == 2) {
            c(parcel.readInt());
        } else {
            if (i != 3) {
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
