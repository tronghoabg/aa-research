package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dya implements dyc {
    private final IBinder a;

    public dya(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.dyc
    public final void a(int i, int[] iArr, String str, dxz dxzVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArr);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(dxzVar);
            this.a.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.dyc
    public final void b(int i, int[] iArr, dyi dyiVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArr);
            parcelObtain.writeStrongInterface(dyiVar);
            this.a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.dyc
    public final void c(int i, dyl dylVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongInterface(dylVar);
            this.a.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.dyc
    public final void d() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.core.telecom.extensions.ICapabilityExchangeListener");
            this.a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
