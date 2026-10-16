package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dyh extends Binder implements dyi {
    private final afec a;
    private final afec b;
    private final afec c;

    public dyh(afec afecVar, afec afecVar2, afec afecVar3) {
        attachInterface(this, "androidx.core.telecom.extensions.ILocalSilenceStateListener");
        this.a = afecVar;
        this.b = afecVar2;
        this.c = afecVar3;
    }

    @Override // defpackage.dyi
    public final void a(dyf dyfVar) {
        this.c.invoke(dyfVar != null ? new dyy(dyfVar) : null);
    }

    @Override // defpackage.dyi
    public final void b(boolean z) {
        this.a.invoke(Boolean.valueOf(z));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        dyf dydVar;
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
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                dydVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.telecom.extensions.ILocalSilenceActions");
                dydVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dyf)) ? new dyd(strongBinder) : (dyf) iInterfaceQueryLocalInterface;
            }
            a(dydVar);
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            this.b.invoke(Boolean.valueOf(parcel.readInt() != 0));
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
