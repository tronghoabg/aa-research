package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IFeatureLayerDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public void addOnFeatureClickListener(com.google.android.libraries.maps.model.internal.IOnFeatureClickListener iOnFeatureClickListener) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iOnFeatureClickListener);
                fr(4, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public java.lang.String getDatasetId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(6, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public java.lang.String getFeatureType() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(1, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public boolean isAvailable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public void removeOnFeatureClickListener(com.google.android.libraries.maps.model.internal.IOnFeatureClickListener iOnFeatureClickListener) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iOnFeatureClickListener);
                fr(5, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate
            public void setFeatureStyle(com.google.android.libraries.maps.model.internal.IStyleFactory iStyleFactory) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iStyleFactory);
                fr(3, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate ? (com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            switch (i) {
                case 1:
                    java.lang.String featureType = getFeatureType();
                    parcel2.writeNoException();
                    parcel2.writeString(featureType);
                    return true;
                case 2:
                    boolean zIsAvailable = isAvailable();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                    parcel2.writeInt(zIsAvailable ? 1 : 0);
                    return true;
                case 3:
                    com.google.android.libraries.maps.model.internal.IStyleFactory iStyleFactoryAsInterface = com.google.android.libraries.maps.model.internal.IStyleFactory.Stub.asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    setFeatureStyle(iStyleFactoryAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    com.google.android.libraries.maps.model.internal.IOnFeatureClickListener iOnFeatureClickListenerAsInterface = com.google.android.libraries.maps.model.internal.IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    addOnFeatureClickListener(iOnFeatureClickListenerAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    com.google.android.libraries.maps.model.internal.IOnFeatureClickListener iOnFeatureClickListenerAsInterface2 = com.google.android.libraries.maps.model.internal.IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    removeOnFeatureClickListener(iOnFeatureClickListenerAsInterface2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    java.lang.String datasetId = getDatasetId();
                    parcel2.writeNoException();
                    parcel2.writeString(datasetId);
                    return true;
                default:
                    return false;
            }
        }
    }

    void addOnFeatureClickListener(com.google.android.libraries.maps.model.internal.IOnFeatureClickListener iOnFeatureClickListener) throws android.os.RemoteException;

    java.lang.String getDatasetId() throws android.os.RemoteException;

    java.lang.String getFeatureType() throws android.os.RemoteException;

    boolean isAvailable() throws android.os.RemoteException;

    void removeOnFeatureClickListener(com.google.android.libraries.maps.model.internal.IOnFeatureClickListener iOnFeatureClickListener) throws android.os.RemoteException;

    void setFeatureStyle(com.google.android.libraries.maps.model.internal.IStyleFactory iStyleFactory) throws android.os.RemoteException;
}
