package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.StreetViewPanoramaOptions;
import com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate;

/* loaded from: classes3.dex */
public interface ved extends IInterface {
    vdy a() throws RemoteException;

    veo b(sqj sqjVar) throws RemoteException;

    veq c(sqj sqjVar, GoogleMapOptions googleMapOptions) throws RemoteException;

    viu d(sqj sqjVar) throws RemoteException;

    viw f(sqj sqjVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    IBitmapDescriptorFactoryDelegate g() throws RemoteException;

    void h(sqj sqjVar) throws RemoteException;

    void i(sqj sqjVar, int i) throws RemoteException;

    void j(sqj sqjVar, int i) throws RemoteException;

    void k(String str) throws RemoteException;

    void l() throws RemoteException;

    void m(vew vewVar) throws RemoteException;
}
