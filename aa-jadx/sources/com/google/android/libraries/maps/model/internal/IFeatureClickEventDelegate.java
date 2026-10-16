package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IFeatureClickEventDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
            public java.util.List<android.os.IBinder> getFeatures() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.util.ArrayList<android.os.IBinder> arrayListCreateBinderArrayList = parcelFq.createBinderArrayList();
                parcelFq.recycle();
                return arrayListCreateBinderArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate
            public com.google.android.libraries.maps.model.LatLng getLatLng() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(1, fp());
                com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.LatLng.CREATOR);
                parcelFq.recycle();
                return latLng;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate ? (com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i == 1) {
                com.google.android.libraries.maps.model.LatLng latLng = getLatLng();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, latLng);
            } else {
                if (i != 2) {
                    return false;
                }
                java.util.List<android.os.IBinder> features = getFeatures();
                parcel2.writeNoException();
                parcel2.writeBinderList(features);
            }
            return true;
        }
    }

    java.util.List<android.os.IBinder> getFeatures() throws android.os.RemoteException;

    com.google.android.libraries.maps.model.LatLng getLatLng() throws android.os.RemoteException;
}
