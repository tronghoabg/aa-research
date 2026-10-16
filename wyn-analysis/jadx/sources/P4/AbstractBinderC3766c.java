package p4;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3766c extends Binder implements InterfaceC3767d {
    @Override // android.os.Binder
    public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
        }
        if (i5 == 1598968902) {
            parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
            return true;
        }
        if (i5 != 1) {
            return super.onTransact(i5, parcel, parcel2, i10);
        }
        a(parcel.readInt(), parcel.readString(), parcel.readString());
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
