package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class ovp extends ijo implements ovq {
    public ovp() {
        super("com.google.android.apps.auto.sdk.IImeController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ovn ovlVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            ovlVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IImeCallback");
            ovlVar = iInterfaceQueryLocalInterface instanceof ovn ? (ovn) iInterfaceQueryLocalInterface : new ovl(strongBinder);
        }
        ijp.d(parcel);
        e(ovlVar);
        parcel2.writeNoException();
        return true;
    }
}
