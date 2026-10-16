package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dyi extends android.os.Binder implements defpackage.dyj {
    final /* synthetic */ defpackage.dzd a;

    public dyi(defpackage.dzd dzdVar) {
        this.a = dzdVar;
        attachInterface(this, "androidx.core.telecom.extensions.ICapabilityExchangeListener");
    }

    @Override // defpackage.dyj
    public final void a(int i, int[] iArr, java.lang.String str, defpackage.dyg dygVar) {
        defpackage.dzd dzdVar;
        defpackage.affi affiVar;
        str.getClass();
        if (dygVar == null || (affiVar = (dzdVar = this.a).c) == null) {
            return;
        }
        affiVar.invoke(dzdVar.a, iArr != null ? defpackage.afga.cb(iArr) : defpackage.afcg.a, str, new defpackage.sr(dygVar));
    }

    @Override // defpackage.dyj
    public final void b(int i, int[] iArr, defpackage.dyp dypVar) {
        defpackage.dzd dzdVar;
        defpackage.affi affiVar;
        if (dypVar == null || (affiVar = (dzdVar = this.a).b) == null) {
            return;
        }
        affiVar.invoke(dzdVar.a, java.lang.Integer.valueOf(i), iArr != null ? defpackage.afga.cb(iArr) : defpackage.afcg.a, new defpackage.sr(dypVar));
    }

    @Override // defpackage.dyj
    public final void c(int i, defpackage.dys dysVar) {
        defpackage.dzd dzdVar;
        defpackage.affg affgVar;
        if (dysVar == null || (affgVar = (dzdVar = this.a).d) == null) {
            return;
        }
        affgVar.invoke(dzdVar.a, new defpackage.sr(dysVar));
    }

    @Override // defpackage.dyj
    public final void d() {
        defpackage.ahoi.e(this.a.a, defpackage.ahzq.a("remote has removed extensions", null));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        android.os.IInterface iInterfaceQueryLocalInterface;
        android.os.IInterface iInterfaceQueryLocalInterface2;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.ICapabilityExchangeListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            return true;
        }
        defpackage.dyp dynVar = null;
        defpackage.dys dyqVar = null;
        defpackage.dyg dyeVar = null;
        switch (i) {
            case 1:
                parcel.readInt();
                parcel.createIntArray();
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null && (iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.telecom.extensions.IParticipantStateListener")) != null && (iInterfaceQueryLocalInterface instanceof defpackage.dyt)) {
                }
                return true;
            case 2:
                parcel.readInt();
                parcel.createIntArray();
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null && (iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.core.telecom.extensions.ICallDetailsListener")) != null && (iInterfaceQueryLocalInterface2 instanceof defpackage.dyd)) {
                }
                parcel.readString();
                throw new defpackage.afat("An operation is not implemented: Not yet implemented");
            case 3:
                d();
                return true;
            case 4:
                int i3 = parcel.readInt();
                int[] iArrCreateIntArray = parcel.createIntArray();
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.core.telecom.extensions.ILocalSilenceStateListener");
                    dynVar = (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof defpackage.dyp)) ? new defpackage.dyn(strongBinder3) : (defpackage.dyp) iInterfaceQueryLocalInterface3;
                }
                b(i3, iArrCreateIntArray, dynVar);
                return true;
            case 5:
                int i4 = parcel.readInt();
                int[] iArrCreateIntArray2 = parcel.createIntArray();
                java.lang.String string = parcel.readString();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("androidx.core.telecom.extensions.ICallIconStateListener");
                    dyeVar = (iInterfaceQueryLocalInterface4 == null || !(iInterfaceQueryLocalInterface4 instanceof defpackage.dyg)) ? new defpackage.dye(strongBinder4) : (defpackage.dyg) iInterfaceQueryLocalInterface4;
                }
                a(i4, iArrCreateIntArray2, string, dyeVar);
                return true;
            case 6:
                int i5 = parcel.readInt();
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
                    dyqVar = (iInterfaceQueryLocalInterface5 == null || !(iInterfaceQueryLocalInterface5 instanceof defpackage.dys)) ? new defpackage.dyq(strongBinder5) : (defpackage.dys) iInterfaceQueryLocalInterface5;
                }
                c(i5, dyqVar);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
