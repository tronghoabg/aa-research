package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IStyleFactory extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IStyleFactory {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IStyleFactory {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IStyleFactory");
            }

            @Override // com.google.android.libraries.maps.model.internal.IStyleFactory
            public com.google.android.libraries.maps.model.FeatureStyle getStyle(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iFeatureDelegate);
                android.os.Parcel parcelFq = fq(1, parcelFp);
                com.google.android.libraries.maps.model.FeatureStyle featureStyle = (com.google.android.libraries.maps.model.FeatureStyle) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.FeatureStyle.CREATOR);
                parcelFq.recycle();
                return featureStyle;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IStyleFactory");
        }

        public static com.google.android.libraries.maps.model.internal.IStyleFactory asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IStyleFactory");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IStyleFactory ? (com.google.android.libraries.maps.model.internal.IStyleFactory) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IStyleFactory.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegateAsInterface = com.google.android.libraries.maps.model.internal.IFeatureDelegate.Stub.asInterface(parcel.readStrongBinder());
            defpackage.ijx.d(parcel);
            com.google.android.libraries.maps.model.FeatureStyle style = getStyle(iFeatureDelegateAsInterface);
            parcel2.writeNoException();
            defpackage.ijx.h(parcel2, style);
            return true;
        }
    }

    com.google.android.libraries.maps.model.FeatureStyle getStyle(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) throws android.os.RemoteException;
}
