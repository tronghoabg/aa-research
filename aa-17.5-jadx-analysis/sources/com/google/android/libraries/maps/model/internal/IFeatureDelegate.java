package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IFeatureDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IFeatureDelegate {

        public static class Proxy extends ijn implements IFeatureDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IFeatureDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public Map getDatasetAttributes() throws RemoteException {
                Parcel parcelGi = gi(5, gh());
                HashMap hashMap = parcelGi.readHashMap(ijp.a);
                parcelGi.recycle();
                return hashMap;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public String getDatasetId() throws RemoteException {
                Parcel parcelGi = gi(4, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public String getFeatureType() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public String getPlaceId() throws RemoteException {
                Parcel parcelGi = gi(3, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public int getSubfeatureType() throws RemoteException {
                Parcel parcelGi = gi(1, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IFeatureDelegate");
        }

        public static IFeatureDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IFeatureDelegate");
            return iInterfaceQueryLocalInterface instanceof IFeatureDelegate ? (IFeatureDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                int subfeatureType = getSubfeatureType();
                parcel2.writeNoException();
                parcel2.writeInt(subfeatureType);
            } else if (i == 2) {
                String featureType = getFeatureType();
                parcel2.writeNoException();
                parcel2.writeString(featureType);
            } else if (i == 3) {
                String placeId = getPlaceId();
                parcel2.writeNoException();
                parcel2.writeString(placeId);
            } else if (i == 4) {
                String datasetId = getDatasetId();
                parcel2.writeNoException();
                parcel2.writeString(datasetId);
            } else {
                if (i != 5) {
                    return false;
                }
                Map datasetAttributes = getDatasetAttributes();
                parcel2.writeNoException();
                parcel2.writeMap(datasetAttributes);
            }
            return true;
        }
    }

    Map getDatasetAttributes() throws RemoteException;

    String getDatasetId() throws RemoteException;

    String getFeatureType() throws RemoteException;

    String getPlaceId() throws RemoteException;

    int getSubfeatureType() throws RemoteException;
}
