package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IMapCapabilitiesDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isAdvancedMarkersAvailable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(1, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate
            public boolean isDataDrivenStylingAvailable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate ? (com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            if (i == 1) {
                boolean zIsAdvancedMarkersAvailable = isAdvancedMarkersAvailable();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zIsAdvancedMarkersAvailable ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                boolean zIsDataDrivenStylingAvailable = isDataDrivenStylingAvailable();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                parcel2.writeInt(zIsDataDrivenStylingAvailable ? 1 : 0);
            }
            return true;
        }
    }

    boolean isAdvancedMarkersAvailable() throws android.os.RemoteException;

    boolean isDataDrivenStylingAvailable() throws android.os.RemoteException;
}
