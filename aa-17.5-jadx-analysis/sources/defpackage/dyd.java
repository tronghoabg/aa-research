package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
final class dyd implements dyf {
    private final IBinder a;

    public dyd(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dyf
    public final void a(boolean z, dxv dxvVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ILocalSilenceActions");
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeStrongInterface(dxvVar);
            this.a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
