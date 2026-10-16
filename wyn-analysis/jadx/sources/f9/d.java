package f9;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public abstract class d extends Binder implements i {
    public d() {
        attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    @Override // f9.i
    public void L(Status status, C2618a c2618a) {
        throw new UnsupportedOperationException();
    }

    @Override // f9.i
    public void m(Status status, n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 >= 1 && i5 <= 16777215) {
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }
        if (i5 == 1598968902) {
            parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            return true;
        }
        if (i5 == 1) {
            L(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, (C2618a) (parcel.readInt() != 0 ? C2618a.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        if (i5 != 2) {
            return super.onTransact(i5, parcel, parcel2, i10);
        }
        m(parcel.readInt() != 0 ? Status.CREATOR.createFromParcel(parcel) : null, (n) (parcel.readInt() != 0 ? n.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
