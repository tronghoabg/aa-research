package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dyb extends android.os.Binder implements defpackage.dyc {
    public dyb() {
        attachInterface(this, "androidx.core.telecom.extensions.IActionsResultCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
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
    public final android.os.IBinder asBinder() {
        return this;
    }
}
