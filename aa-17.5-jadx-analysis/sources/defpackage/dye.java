package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dye extends Binder implements dyf {
    final /* synthetic */ dxs a;

    public dye(dxs dxsVar) {
        this.a = dxsVar;
        attachInterface(this, "androidx.core.telecom.extensions.ILocalSilenceActions");
    }

    @Override // defpackage.dyf
    public final void a(boolean z, dxv dxvVar) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.telecom.extra.LOCAL_CALL_SILENCE_STATE", z);
        this.a.a.sendCallEvent("android.telecom.event.LOCAL_CALL_SILENCE_STATE_CHANGED", bundle);
        if (dxvVar != null) {
            dxvVar.c();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        dxv dxtVar;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.ILocalSilenceActions");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.ILocalSilenceActions");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        boolean z = parcel.readInt() != 0;
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            dxtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.telecom.extensions.IActionsResultCallback");
            dxtVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dxv)) ? new dxt(strongBinder) : (dxv) iInterfaceQueryLocalInterface;
        }
        a(z, dxtVar);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
