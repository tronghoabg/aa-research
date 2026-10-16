package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
final class dyg implements dyi {
    private final IBinder a;

    public dyg(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dyi
    public final void a(dyf dyfVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ILocalSilenceStateListener");
            parcelObtain.writeStrongInterface(dyfVar);
            this.a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dyi
    public final void b(boolean z) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ILocalSilenceStateListener");
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
