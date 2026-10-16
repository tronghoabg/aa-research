package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class ovh extends ijo implements ovi {
    public ovh() {
        super("com.google.android.apps.auto.sdk.IDrawerController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ovf ovdVar;
        switch (i) {
            case 1:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 2:
                boolean zJ = j();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 3:
                f();
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ovdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IDrawerCallback");
                    ovdVar = iInterfaceQueryLocalInterface instanceof ovf ? (ovf) iInterfaceQueryLocalInterface : new ovd(strongBinder);
                }
                ijp.d(parcel);
                g(ovdVar);
                parcel2.writeNoException();
                return true;
            case 6:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                h(i2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
