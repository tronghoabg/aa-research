package android.support.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class b extends Binder implements c {
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_onExtraCallback = 3;
    static final int TRANSACTION_onExtraCallbackWithResult = 4;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onWarmupCompleted = 5;

    public b() {
        attachInterface(this, "android.support.customtabs.IAuthTabCallback");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.IAuthTabCallback");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new a(iBinder) : (c) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 0 && i2 <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.IAuthTabCallback");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("android.support.customtabs.IAuthTabCallback");
            return true;
        }
        if (i2 == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(getInterfaceVersion());
            return true;
        }
        if (i2 == 2) {
            onNavigationEvent(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else if (i2 == 3) {
            onExtraCallback(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else if (i2 == 4) {
            Bundle bundleOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedObject(bundleOnExtraCallbackWithResult, 1);
        } else {
            if (i2 != 5) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            onWarmupCompleted((Bundle) parcel.readTypedObject(Bundle.CREATOR));
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
