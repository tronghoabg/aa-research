package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMapOptions;

/* loaded from: classes3.dex */
public abstract class ven extends ijo implements veo {
    public ven() {
        super("com.google.android.libraries.maps.internal.IMapFragmentDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar = null;
        vgv vgtVar = null;
        switch (i) {
            case 1:
                veg vegVarA = a();
                parcel2.writeNoException();
                ijp.i(parcel2, vegVarA);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface instanceof sqj) {
                    }
                }
                GoogleMapOptions googleMapOptions = (GoogleMapOptions) ijp.a(parcel, GoogleMapOptions.CREATOR);
                ijp.d(parcel);
                s(googleMapOptions);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                f(bundle);
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
                sqj sqjVarR = r(sqhVar, bundle2);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarR);
                return true;
            case 5:
                m();
                parcel2.writeNoException();
                return true;
            case 6:
                l();
                parcel2.writeNoException();
                return true;
            case 7:
                h();
                parcel2.writeNoException();
                return true;
            case 8:
                g();
                parcel2.writeNoException();
                return true;
            case 9:
                k();
                parcel2.writeNoException();
                return true;
            case 10:
                Bundle bundle3 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                n(bundle3);
                parcel2.writeNoException();
                ijp.h(parcel2, bundle3);
                return true;
            case 11:
                boolean zQ = q();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zQ ? 1 : 0);
                return true;
            case 12:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.libraries.maps.internal.IOnMapReadyCallback");
                    vgtVar = iInterfaceQueryLocalInterface4 instanceof vgv ? (vgv) iInterfaceQueryLocalInterface4 : new vgt(strongBinder4);
                }
                ijp.d(parcel);
                c(vgtVar);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle4 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                i(bundle4);
                parcel2.writeNoException();
                return true;
            case 14:
                j();
                parcel2.writeNoException();
                return true;
            case 15:
                o();
                parcel2.writeNoException();
                return true;
            case 16:
                p();
                parcel2.writeNoException();
                return true;
            case 17:
                d();
                parcel2.writeNoException();
                return true;
            case 18:
                String string = parcel.readString();
                ijp.d(parcel);
                String strB = b(string);
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            default:
                return false;
        }
    }
}
