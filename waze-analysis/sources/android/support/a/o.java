package android.support.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class o extends Binder implements p {
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_onMessageChannelReady = 2;
    static final int TRANSACTION_onPostMessage = 3;

    public o() {
        attachInterface(this, "android.support.customtabs.IPostMessageService");
    }

    public static p asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.IPostMessageService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new n(iBinder) : (p) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 0 && i2 <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
        }
        if (i2 == 1598968902) {
            parcel2.writeString("android.support.customtabs.IPostMessageService");
            return true;
        }
        if (i2 == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(getInterfaceVersion());
            return true;
        }
        if (i2 == 2) {
            onMessageChannelReady(e.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            parcel2.writeNoException();
        } else {
            if (i2 != 3) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            onPostMessage(e.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
