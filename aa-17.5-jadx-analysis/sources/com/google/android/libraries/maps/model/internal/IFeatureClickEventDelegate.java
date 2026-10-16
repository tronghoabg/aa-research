package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface IFeatureClickEventDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IFeatureClickEventDelegate {

        public static class Proxy extends ijn implements IFeatureClickEventDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
            public List<IBinder> getFeatures() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                ArrayList<IBinder> arrayListCreateBinderArrayList = parcelGi.createBinderArrayList();
                parcelGi.recycle();
                return arrayListCreateBinderArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
            public LatLng getLatLng() throws RemoteException {
                Parcel parcelGi = gi(1, gh());
                LatLng latLng = (LatLng) ijp.a(parcelGi, LatLng.CREATOR);
                parcelGi.recycle();
                return latLng;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate");
        }

        public static IFeatureClickEventDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate");
            return iInterfaceQueryLocalInterface instanceof IFeatureClickEventDelegate ? (IFeatureClickEventDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                LatLng latLng = getLatLng();
                parcel2.writeNoException();
                ijp.h(parcel2, latLng);
            } else {
                if (i != 2) {
                    return false;
                }
                List<IBinder> features = getFeatures();
                parcel2.writeNoException();
                parcel2.writeBinderList(features);
            }
            return true;
        }
    }

    List<IBinder> getFeatures() throws RemoteException;

    LatLng getLatLng() throws RemoteException;
}
