package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IFeatureDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IFeatureDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IFeatureDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IFeatureDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public java.util.Map getDatasetAttributes() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(5, fp());
                java.util.HashMap hashMap = parcelFq.readHashMap(defpackage.ijx.a);
                parcelFq.recycle();
                return hashMap;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public java.lang.String getDatasetId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public java.lang.String getFeatureType() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public java.lang.String getPlaceId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(3, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureDelegate
            public int getSubfeatureType() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(1, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IFeatureDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IFeatureDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IFeatureDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IFeatureDelegate ? (com.google.android.libraries.maps.model.internal.IFeatureDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IFeatureDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i == 1) {
                int subfeatureType = getSubfeatureType();
                parcel2.writeNoException();
                parcel2.writeInt(subfeatureType);
            } else if (i == 2) {
                java.lang.String featureType = getFeatureType();
                parcel2.writeNoException();
                parcel2.writeString(featureType);
            } else if (i == 3) {
                java.lang.String placeId = getPlaceId();
                parcel2.writeNoException();
                parcel2.writeString(placeId);
            } else if (i == 4) {
                java.lang.String datasetId = getDatasetId();
                parcel2.writeNoException();
                parcel2.writeString(datasetId);
            } else {
                if (i != 5) {
                    return false;
                }
                java.util.Map datasetAttributes = getDatasetAttributes();
                parcel2.writeNoException();
                parcel2.writeMap(datasetAttributes);
            }
            return true;
        }
    }

    java.util.Map getDatasetAttributes() throws android.os.RemoteException;

    java.lang.String getDatasetId() throws android.os.RemoteException;

    java.lang.String getFeatureType() throws android.os.RemoteException;

    java.lang.String getPlaceId() throws android.os.RemoteException;

    int getSubfeatureType() throws android.os.RemoteException;
}
