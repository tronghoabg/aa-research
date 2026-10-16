package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.AlphaJumpKeyItem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class ovs extends ijo implements ovt {
    public ovs() {
        super("com.google.android.apps.auto.sdk.IMenuController");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ovr ovrVar;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ovrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IMenuAdapter");
                    ovrVar = iInterfaceQueryLocalInterface instanceof ovr ? (ovr) iInterfaceQueryLocalInterface : new ovr(strongBinder);
                }
                ijp.d(parcel);
                k(ovrVar);
                break;
            case 2:
                c();
                break;
            case 3:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                d(i2);
                break;
            case 4:
                j();
                break;
            case 5:
                b();
                break;
            case 6:
                i();
                break;
            case 7:
                a();
                break;
            case 8:
                g();
                break;
            case 9:
                f();
                break;
            case 10:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(AlphaJumpKeyItem.CREATOR);
                ijp.d(parcel);
                h(arrayListCreateTypedArrayList);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
