package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dvx implements dvz {
    private final IBinder a;

    public dvx(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dvz
    public final void a(int i, Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            parcelObtain.writeInt(i);
            parcelObtain.writeTypedObject(bundle, 0);
            if (this.a.transact(1, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method send is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
