package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IBitmapDescriptorFactoryDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh defaultMarker() throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFq = fq(4, fp());
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh defaultMarkerWithHue(float f) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                android.os.Parcel parcelFq = fq(5, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh fromAsset(java.lang.String str) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                parcelFp.writeString(str);
                android.os.Parcel parcelFq = fq(2, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh fromBitmap(android.graphics.Bitmap bitmap) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, bitmap);
                android.os.Parcel parcelFq = fq(6, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh fromFile(java.lang.String str) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                parcelFp.writeString(str);
                android.os.Parcel parcelFq = fq(3, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh fromPath(java.lang.String str) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                parcelFp.writeString(str);
                android.os.Parcel parcelFq = fq(7, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh fromPinConfig(com.google.android.libraries.maps.model.PinConfig pinConfig) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, pinConfig);
                android.os.Parcel parcelFq = fq(8, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate
            public defpackage.srh fromResource(int i) throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                android.os.Parcel parcelFq = fq(1, parcelFp);
                android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                if (strongBinder == null) {
                    srfVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                }
                parcelFq.recycle();
                return srfVar;
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate ? (com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IBitmapDescriptorFactoryDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            switch (i) {
                case 1:
                    int i2 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarFromResource = fromResource(i2);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarFromResource);
                    return true;
                case 2:
                    java.lang.String string = parcel.readString();
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarFromAsset = fromAsset(string);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarFromAsset);
                    return true;
                case 3:
                    java.lang.String string2 = parcel.readString();
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarFromFile = fromFile(string2);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarFromFile);
                    return true;
                case 4:
                    defpackage.srh srhVarDefaultMarker = defaultMarker();
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarDefaultMarker);
                    return true;
                case 5:
                    float f = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarDefaultMarkerWithHue = defaultMarkerWithHue(f);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarDefaultMarkerWithHue);
                    return true;
                case 6:
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) defpackage.ijx.a(parcel, android.graphics.Bitmap.CREATOR);
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarFromBitmap = fromBitmap(bitmap);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarFromBitmap);
                    return true;
                case 7:
                    java.lang.String string3 = parcel.readString();
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarFromPath = fromPath(string3);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarFromPath);
                    return true;
                case 8:
                    com.google.android.libraries.maps.model.PinConfig pinConfig = (com.google.android.libraries.maps.model.PinConfig) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.PinConfig.CREATOR);
                    defpackage.ijx.d(parcel);
                    defpackage.srh srhVarFromPinConfig = fromPinConfig(pinConfig);
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, srhVarFromPinConfig);
                    return true;
                default:
                    return false;
            }
        }
    }

    defpackage.srh defaultMarker() throws android.os.RemoteException;

    defpackage.srh defaultMarkerWithHue(float f) throws android.os.RemoteException;

    defpackage.srh fromAsset(java.lang.String str) throws android.os.RemoteException;

    defpackage.srh fromBitmap(android.graphics.Bitmap bitmap) throws android.os.RemoteException;

    defpackage.srh fromFile(java.lang.String str) throws android.os.RemoteException;

    defpackage.srh fromPath(java.lang.String str) throws android.os.RemoteException;

    defpackage.srh fromPinConfig(com.google.android.libraries.maps.model.PinConfig pinConfig) throws android.os.RemoteException;

    defpackage.srh fromResource(int i) throws android.os.RemoteException;
}
