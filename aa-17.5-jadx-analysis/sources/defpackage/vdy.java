package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public interface vdy extends IInterface {
    sqj a(CameraPosition cameraPosition) throws RemoteException;

    sqj b(LatLng latLng) throws RemoteException;

    sqj c(LatLngBounds latLngBounds, int i) throws RemoteException;

    sqj d(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    sqj f(LatLng latLng, float f) throws RemoteException;

    sqj g(float f, float f2) throws RemoteException;

    sqj h(float f) throws RemoteException;

    sqj i(float f, int i, int i2) throws RemoteException;

    sqj j() throws RemoteException;

    sqj k() throws RemoteException;

    sqj l(float f) throws RemoteException;
}
