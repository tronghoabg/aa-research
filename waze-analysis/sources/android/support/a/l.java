package android.support.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class l extends Binder implements m {
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
    static final int TRANSACTION_onSessionEnded = 4;
    static final int TRANSACTION_onVerticalScrollEvent = 2;

    public l() {
        attachInterface(this, "android.support.customtabs.IEngagementSignalsCallback");
    }

    public static m asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.IEngagementSignalsCallback");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new k(iBinder) : (m) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 0 && i2 <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.IEngagementSignalsCallback");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("android.support.customtabs.IEngagementSignalsCallback");
            return true;
        }
        if (i2 == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(getInterfaceVersion());
            return true;
        }
        if (i2 == 2) {
            onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else if (i2 == 3) {
            onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else {
            if (i2 != 4) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            onSessionEnded(parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
