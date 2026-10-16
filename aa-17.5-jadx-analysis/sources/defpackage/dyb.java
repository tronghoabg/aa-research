package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dyb extends Binder implements dyc {
    final /* synthetic */ dyw a;

    public dyb(dyw dywVar) {
        this.a = dywVar;
        attachInterface(this, "androidx.core.telecom.extensions.ICapabilityExchangeListener");
    }

    @Override // defpackage.dyc
    public final void a(int i, int[] iArr, String str, dxz dxzVar) {
        dyw dywVar;
        afei afeiVar;
        str.getClass();
        if (dxzVar == null || (afeiVar = (dywVar = this.a).c) == null) {
            return;
        }
        afeiVar.invoke(dywVar.a, iArr != null ? woy.dh(iArr) : afbg.a, str, new sm(dxzVar));
    }

    @Override // defpackage.dyc
    public final void b(int i, int[] iArr, dyi dyiVar) {
        dyw dywVar;
        afei afeiVar;
        if (dyiVar == null || (afeiVar = (dywVar = this.a).b) == null) {
            return;
        }
        afeiVar.invoke(dywVar.a, Integer.valueOf(i), iArr != null ? woy.dh(iArr) : afbg.a, new sm(dyiVar));
    }

    @Override // defpackage.dyc
    public final void c(int i, dyl dylVar) {
        dyw dywVar;
        afeg afegVar;
        if (dylVar == null || (afegVar = (dywVar = this.a).d) == null) {
            return;
        }
        afegVar.invoke(dywVar.a, new sm(dylVar));
    }

    @Override // defpackage.dyc
    public final void d() {
        ahni.e(this.a.a, aije.a("remote has removed extensions", null));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface iInterfaceQueryLocalInterface;
        IInterface iInterfaceQueryLocalInterface2;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.ICapabilityExchangeListener");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            return true;
        }
        dyi dygVar = null;
        dyl dyjVar = null;
        dxz dxxVar = null;
        switch (i) {
            case 1:
                parcel.readInt();
                parcel.createIntArray();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null && (iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.telecom.extensions.IParticipantStateListener")) != null && (iInterfaceQueryLocalInterface instanceof dym)) {
                }
                return true;
            case 2:
                parcel.readInt();
                parcel.createIntArray();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null && (iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.core.telecom.extensions.ICallDetailsListener")) != null && (iInterfaceQueryLocalInterface2 instanceof dxw)) {
                }
                parcel.readString();
                throw new aezt("An operation is not implemented: Not yet implemented");
            case 3:
                d();
                return true;
            case 4:
                int i3 = parcel.readInt();
                int[] iArrCreateIntArray = parcel.createIntArray();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("androidx.core.telecom.extensions.ILocalSilenceStateListener");
                    dygVar = (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof dyi)) ? new dyg(strongBinder3) : (dyi) iInterfaceQueryLocalInterface3;
                }
                b(i3, iArrCreateIntArray, dygVar);
                return true;
            case 5:
                int i4 = parcel.readInt();
                int[] iArrCreateIntArray2 = parcel.createIntArray();
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("androidx.core.telecom.extensions.ICallIconStateListener");
                    dxxVar = (iInterfaceQueryLocalInterface4 == null || !(iInterfaceQueryLocalInterface4 instanceof dxz)) ? new dxx(strongBinder4) : (dxz) iInterfaceQueryLocalInterface4;
                }
                a(i4, iArrCreateIntArray2, string, dxxVar);
                return true;
            case 6:
                int i5 = parcel.readInt();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("androidx.core.telecom.extensions.IMeetingSummaryStateListener");
                    dyjVar = (iInterfaceQueryLocalInterface5 == null || !(iInterfaceQueryLocalInterface5 instanceof dyl)) ? new dyj(strongBinder5) : (dyl) iInterfaceQueryLocalInterface5;
                }
                c(i5, dyjVar);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
