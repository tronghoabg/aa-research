package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;

/* loaded from: classes3.dex */
public abstract class vit extends ijo implements viu {
    public vit() {
        super("com.google.android.libraries.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar = null;
        vij vihVar = null;
        switch (i) {
            case 1:
                vis visVarA = a();
                parcel2.writeNoException();
                ijp.i(parcel2, visVarA);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface instanceof sqj) {
                    }
                }
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) ijp.a(parcel, StreetViewPanoramaOptions.CREATOR);
                ijp.d(parcel);
                n(streetViewPanoramaOptions);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                c(bundle);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(strongBinder2);
                }
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface3 instanceof sqj) {
                    }
                }
                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                sqj sqjVarM = m(sqhVar, bundle2);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarM);
                return true;
            case 5:
                h();
                parcel2.writeNoException();
                return true;
            case 6:
                g();
                parcel2.writeNoException();
                return true;
            case 7:
                f();
                parcel2.writeNoException();
                return true;
            case 8:
                d();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                Bundle bundle3 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                i(bundle3);
                parcel2.writeNoException();
                ijp.h(parcel2, bundle3);
                return true;
            case 11:
                boolean zL = l();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 12:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    vihVar = iInterfaceQueryLocalInterface4 instanceof vij ? (vij) iInterfaceQueryLocalInterface4 : new vih(strongBinder4);
                }
                ijp.d(parcel);
                b(vihVar);
                parcel2.writeNoException();
                return true;
            case 13:
                j();
                parcel2.writeNoException();
                return true;
            case 14:
                k();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
