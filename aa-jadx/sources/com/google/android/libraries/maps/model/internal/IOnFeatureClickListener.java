package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IOnFeatureClickListener extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IOnFeatureClickListener {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IOnFeatureClickListener {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IOnFeatureClickListener");
            }

            @Override // com.google.android.libraries.maps.model.internal.IOnFeatureClickListener
            public void onFeatureClick(com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate iFeatureClickEventDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iFeatureClickEventDelegate);
                fr(1, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IOnFeatureClickListener");
        }

        public static com.google.android.libraries.maps.model.internal.IOnFeatureClickListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IOnFeatureClickListener");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IOnFeatureClickListener ? (com.google.android.libraries.maps.model.internal.IOnFeatureClickListener) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IOnFeatureClickListener.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate iFeatureClickEventDelegateAsInterface = com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate.Stub.asInterface(parcel.readStrongBinder());
            defpackage.ijx.d(parcel);
            onFeatureClick(iFeatureClickEventDelegateAsInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onFeatureClick(com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate iFeatureClickEventDelegate) throws android.os.RemoteException;
}
