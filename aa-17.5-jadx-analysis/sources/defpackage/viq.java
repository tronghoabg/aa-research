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
public final class viq extends ijn implements vis {
    public viq(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // defpackage.vis
    public final sqj e(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        sqj sqhVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, streetViewPanoramaOrientation);
        Parcel parcelGi = gi(19, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
        }
        parcelGi.recycle();
        return sqhVar;
    }

    @Override // defpackage.vis
    public final StreetViewPanoramaCamera f() throws RemoteException {
        Parcel parcelGi = gi(10, gh());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) ijp.a(parcelGi, StreetViewPanoramaCamera.CREATOR);
        parcelGi.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // defpackage.vis
    public final StreetViewPanoramaLocation g() throws RemoteException {
        Parcel parcelGi = gi(14, gh());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) ijp.a(parcelGi, StreetViewPanoramaLocation.CREATOR);
        parcelGi.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // defpackage.vis
    public final StreetViewPanoramaOrientation h(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        Parcel parcelGi = gi(18, parcelGh);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) ijp.a(parcelGi, StreetViewPanoramaOrientation.CREATOR);
        parcelGi.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // defpackage.vis
    public final void i(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, streetViewPanoramaCamera);
        parcelGh.writeLong(j);
        gj(9, parcelGh);
    }

    @Override // defpackage.vis
    public final void j(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(2, parcelGh);
    }

    @Override // defpackage.vis
    public final void k(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(4, parcelGh);
    }

    @Override // defpackage.vis
    public final void l(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(3, parcelGh);
    }

    @Override // defpackage.vis
    public final void m(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(1, parcelGh);
    }

    @Override // defpackage.vis
    public final void n(vhx vhxVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vhxVar);
        gj(16, parcelGh);
    }

    @Override // defpackage.vis
    public final void o(via viaVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, viaVar);
        gj(15, parcelGh);
    }

    @Override // defpackage.vis
    public final void p(vid vidVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vidVar);
        gj(17, parcelGh);
    }

    @Override // defpackage.vis
    public final void q(vig vigVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vigVar);
        gj(20, parcelGh);
    }

    @Override // defpackage.vis
    public final void r(LatLng latLng) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
        gj(12, parcelGh);
    }

    @Override // defpackage.vis
    public final void s(String str) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        gj(11, parcelGh);
    }

    @Override // defpackage.vis
    public final void t(LatLng latLng, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
        parcelGh.writeInt(i);
        gj(13, parcelGh);
    }

    @Override // defpackage.vis
    public final void u(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
        parcelGh.writeInt(i);
        ijp.g(parcelGh, streetViewSource);
        gj(22, parcelGh);
    }

    @Override // defpackage.vis
    public final void v(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
        ijp.g(parcelGh, streetViewSource);
        gj(21, parcelGh);
    }

    @Override // defpackage.vis
    public final boolean w() throws RemoteException {
        Parcel parcelGi = gi(6, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.vis
    public final boolean x() throws RemoteException {
        Parcel parcelGi = gi(8, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.vis
    public final boolean y() throws RemoteException {
        Parcel parcelGi = gi(7, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.vis
    public final boolean z() throws RemoteException {
        Parcel parcelGi = gi(5, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
