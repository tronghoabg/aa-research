package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;
import com.google.android.libraries.maps.model.StreetViewSource;

/* loaded from: classes3.dex */
public interface vis extends IInterface {
    sqj e(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException;

    StreetViewPanoramaCamera f() throws RemoteException;

    StreetViewPanoramaLocation g() throws RemoteException;

    StreetViewPanoramaOrientation h(sqj sqjVar) throws RemoteException;

    void i(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException;

    void j(boolean z) throws RemoteException;

    void k(boolean z) throws RemoteException;

    void l(boolean z) throws RemoteException;

    void m(boolean z) throws RemoteException;

    void n(vhx vhxVar) throws RemoteException;

    void o(via viaVar) throws RemoteException;

    void p(vid vidVar) throws RemoteException;

    void q(vig vigVar) throws RemoteException;

    void r(LatLng latLng) throws RemoteException;

    void s(String str) throws RemoteException;

    void t(LatLng latLng, int i) throws RemoteException;

    void u(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException;

    void v(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException;

    boolean w() throws RemoteException;

    boolean x() throws RemoteException;

    boolean y() throws RemoteException;

    boolean z() throws RemoteException;
}
