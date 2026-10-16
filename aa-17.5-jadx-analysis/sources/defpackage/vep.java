package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vep extends ijo implements veq {
    public vep() {
        super("com.google.android.libraries.maps.internal.IMapViewDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        vgv vgtVar;
        switch (i) {
            case 1:
                veg vegVarB = b();
                parcel2.writeNoException();
                ijp.i(parcel2, vegVarB);
                return true;
            case 2:
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                d(bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                k();
                parcel2.writeNoException();
                return true;
            case 4:
                j();
                parcel2.writeNoException();
                return true;
            case 5:
                f();
                parcel2.writeNoException();
                return true;
            case 6:
                i();
                parcel2.writeNoException();
                return true;
            case 7:
                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                l(bundle2);
                parcel2.writeNoException();
                ijp.h(parcel2, bundle2);
                return true;
            case 8:
                sqj sqjVarA = a();
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarA);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    vgtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapReadyCallback");
                    vgtVar = iInterfaceQueryLocalInterface instanceof vgv ? (vgv) iInterfaceQueryLocalInterface : new vgt(strongBinder);
                }
                ijp.d(parcel);
                c(vgtVar);
                parcel2.writeNoException();
                return true;
            case 10:
                Bundle bundle3 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                g(bundle3);
                parcel2.writeNoException();
                return true;
            case 11:
                h();
                parcel2.writeNoException();
                return true;
            case 12:
                m();
                parcel2.writeNoException();
                return true;
            case 13:
                n();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
