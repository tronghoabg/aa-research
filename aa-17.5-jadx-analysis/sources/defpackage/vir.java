package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;
import com.google.android.libraries.maps.model.StreetViewSource;

/* loaded from: classes3.dex */
public abstract class vir extends ijo implements vis {
    public vir() {
        super("com.google.android.libraries.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        via vhyVar = null;
        vig vieVar = null;
        sqj sqhVar = null;
        vid vibVar = null;
        vhx vhvVar = null;
        switch (i) {
            case 1:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                m(zJ);
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                j(zJ2);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zJ3 = ijp.j(parcel);
                ijp.d(parcel);
                l(zJ3);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zJ4 = ijp.j(parcel);
                ijp.d(parcel);
                k(zJ4);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean z = z();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 6:
                boolean zW = w();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(zW ? 1 : 0);
                return true;
            case 7:
                boolean zY = y();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ijp.a;
                parcel2.writeInt(zY ? 1 : 0);
                return true;
            case 8:
                boolean zX = x();
                parcel2.writeNoException();
                ClassLoader classLoader4 = ijp.a;
                parcel2.writeInt(zX ? 1 : 0);
                return true;
            case 9:
                StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) ijp.a(parcel, StreetViewPanoramaCamera.CREATOR);
                long j = parcel.readLong();
                ijp.d(parcel);
                i(streetViewPanoramaCamera, j);
                parcel2.writeNoException();
                return true;
            case 10:
                StreetViewPanoramaCamera streetViewPanoramaCameraF = f();
                parcel2.writeNoException();
                ijp.h(parcel2, streetViewPanoramaCameraF);
                return true;
            case 11:
                String string = parcel.readString();
                ijp.d(parcel);
                s(string);
                parcel2.writeNoException();
                return true;
            case 12:
                LatLng latLng = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                ijp.d(parcel);
                r(latLng);
                parcel2.writeNoException();
                return true;
            case 13:
                LatLng latLng2 = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                int i2 = parcel.readInt();
                ijp.d(parcel);
                t(latLng2, i2);
                parcel2.writeNoException();
                return true;
            case 14:
                StreetViewPanoramaLocation streetViewPanoramaLocationG = g();
                parcel2.writeNoException();
                ijp.h(parcel2, streetViewPanoramaLocationG);
                return true;
            case 15:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaChangeListener");
                    vhyVar = iInterfaceQueryLocalInterface instanceof via ? (via) iInterfaceQueryLocalInterface : new vhy(strongBinder);
                }
                ijp.d(parcel);
                o(vhyVar);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    vhvVar = iInterfaceQueryLocalInterface2 instanceof vhx ? (vhx) iInterfaceQueryLocalInterface2 : new vhv(strongBinder2);
                }
                ijp.d(parcel);
                n(vhvVar);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaClickListener");
                    vibVar = iInterfaceQueryLocalInterface3 instanceof vid ? (vid) iInterfaceQueryLocalInterface3 : new vib(strongBinder3);
                }
                ijp.d(parcel);
                p(vibVar);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface4 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface4 : new sqh(strongBinder4);
                }
                ijp.d(parcel);
                StreetViewPanoramaOrientation streetViewPanoramaOrientationH = h(sqhVar);
                parcel2.writeNoException();
                ijp.h(parcel2, streetViewPanoramaOrientationH);
                return true;
            case 19:
                StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) ijp.a(parcel, StreetViewPanoramaOrientation.CREATOR);
                ijp.d(parcel);
                sqj sqjVarE = e(streetViewPanoramaOrientation);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarE);
                return true;
            case 20:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaLongClickListener");
                    vieVar = iInterfaceQueryLocalInterface5 instanceof vig ? (vig) iInterfaceQueryLocalInterface5 : new vie(strongBinder5);
                }
                ijp.d(parcel);
                q(vieVar);
                parcel2.writeNoException();
                return true;
            case 21:
                LatLng latLng3 = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                StreetViewSource streetViewSource = (StreetViewSource) ijp.a(parcel, StreetViewSource.CREATOR);
                ijp.d(parcel);
                v(latLng3, streetViewSource);
                parcel2.writeNoException();
                return true;
            case 22:
                LatLng latLng4 = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                int i3 = parcel.readInt();
                StreetViewSource streetViewSource2 = (StreetViewSource) ijp.a(parcel, StreetViewSource.CREATOR);
                ijp.d(parcel);
                u(latLng4, i3, streetViewSource2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
