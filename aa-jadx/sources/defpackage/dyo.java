package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dyo extends android.os.Binder implements defpackage.dyp {
    private final defpackage.affc a;
    private final defpackage.affc b;
    private final defpackage.affc c;

    public dyo(defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.affc affcVar3) {
        attachInterface(this, "androidx.core.telecom.extensions.ILocalSilenceStateListener");
        this.a = affcVar;
        this.b = affcVar2;
        this.c = affcVar3;
    }

    @Override // defpackage.dyp
    public final void a(defpackage.dym dymVar) {
        this.c.invoke(dymVar != null ? new defpackage.dzf(dymVar) : null);
    }

    @Override // defpackage.dyp
    public final void b(boolean z) {
        this.a.invoke(java.lang.Boolean.valueOf(z));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        defpackage.dym dykVar;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.ILocalSilenceStateListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.ILocalSilenceStateListener");
            return true;
        }
        if (i == 1) {
            b(parcel.readInt() != 0);
        } else if (i == 2) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                dykVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.telecom.extensions.ILocalSilenceActions");
                dykVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.dym)) ? new defpackage.dyk(strongBinder) : (defpackage.dym) iInterfaceQueryLocalInterface;
            }
            a(dykVar);
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            this.b.invoke(java.lang.Boolean.valueOf(parcel.readInt() != 0));
        }
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
