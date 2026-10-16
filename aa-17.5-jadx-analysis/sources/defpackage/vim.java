package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.VisibleRegion;

/* loaded from: classes3.dex */
public interface vim extends IInterface {
    sqj e(LatLng latLng) throws RemoteException;

    LatLng f(sqj sqjVar) throws RemoteException;

    VisibleRegion g() throws RemoteException;
}
