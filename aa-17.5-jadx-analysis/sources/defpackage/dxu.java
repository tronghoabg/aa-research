package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class dxu extends Binder implements dxv {
    public dxu() {
        attachInterface(this, "androidx.core.telecom.extensions.IActionsResultCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.telecom.extensions.IActionsResultCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.telecom.extensions.IActionsResultCallback");
            return true;
        }
        if (i == 1) {
            c();
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            b(parcel.readInt(), parcel.readString());
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
