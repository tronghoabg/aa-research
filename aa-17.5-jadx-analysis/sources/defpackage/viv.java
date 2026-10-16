package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class viv extends ijo implements viw {
    public viv() {
        super("com.google.android.libraries.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        vij vihVar;
        switch (i) {
            case 1:
                vis visVarB = b();
                parcel2.writeNoException();
                ijp.i(parcel2, visVarB);
                return true;
            case 2:
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                d(bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                h();
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                f();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                i(bundle2);
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
                    vihVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    vihVar = iInterfaceQueryLocalInterface instanceof vij ? (vij) iInterfaceQueryLocalInterface : new vih(strongBinder);
                }
                ijp.d(parcel);
                c(vihVar);
                parcel2.writeNoException();
                return true;
            case 10:
                j();
                parcel2.writeNoException();
                return true;
            case 11:
                k();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
