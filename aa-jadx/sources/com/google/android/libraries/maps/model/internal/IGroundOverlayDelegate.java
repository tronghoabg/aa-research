package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IGroundOverlayDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate iGroundOverlayDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iGroundOverlayDelegate);
                android.os.Parcel parcelFq = fq(19, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getBearing() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(12, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public com.google.android.libraries.maps.model.LatLngBounds getBounds() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(10, fp());
                com.google.android.libraries.maps.model.LatLngBounds latLngBounds = (com.google.android.libraries.maps.model.LatLngBounds) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.LatLngBounds.CREATOR);
                parcelFq.recycle();
                return latLngBounds;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getHeight() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(8, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public java.lang.String getId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public com.google.android.libraries.maps.model.LatLng getPosition() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.LatLng.CREATOR);
                parcelFq.recycle();
                return latLng;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public defpackage.srh getTag() throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFq = fq(25, fp());
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

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getTransparency() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(18, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getWidth() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(7, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getZIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(14, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(20, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public boolean isClickable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(23, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(16, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void remove() throws android.os.RemoteException {
                fr(1, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setBearing(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(11, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setClickable(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(22, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setDimensions(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(5, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setDimensionsWithHeight(float f, float f2) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                parcelFp.writeFloat(f2);
                fr(6, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setImage(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(21, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setPosition(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, latLng);
                fr(3, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setPositionFromBounds(com.google.android.libraries.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, latLngBounds);
                fr(9, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setTag(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(24, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setTransparency(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(17, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setVisible(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(15, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setZIndex(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(13, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate ? (com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            defpackage.srh srfVar = null;
            switch (i) {
                case 1:
                    remove();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    java.lang.String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 3:
                    com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.LatLng.CREATOR);
                    defpackage.ijx.d(parcel);
                    setPosition(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    com.google.android.libraries.maps.model.LatLng position = getPosition();
                    parcel2.writeNoException();
                    defpackage.ijx.h(parcel2, position);
                    return true;
                case 5:
                    float f = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setDimensions(f);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float f2 = parcel.readFloat();
                    float f3 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setDimensionsWithHeight(f2, f3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    float width = getWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(width);
                    return true;
                case 8:
                    float height = getHeight();
                    parcel2.writeNoException();
                    parcel2.writeFloat(height);
                    return true;
                case 9:
                    com.google.android.libraries.maps.model.LatLngBounds latLngBounds = (com.google.android.libraries.maps.model.LatLngBounds) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.LatLngBounds.CREATOR);
                    defpackage.ijx.d(parcel);
                    setPositionFromBounds(latLngBounds);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    com.google.android.libraries.maps.model.LatLngBounds bounds = getBounds();
                    parcel2.writeNoException();
                    defpackage.ijx.h(parcel2, bounds);
                    return true;
                case 11:
                    float f4 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setBearing(f4);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    float bearing = getBearing();
                    parcel2.writeNoException();
                    parcel2.writeFloat(bearing);
                    return true;
                case 13:
                    float f5 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setZIndex(f5);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 15:
                    boolean zJ = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setVisible(zJ);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 17:
                    float f6 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setTransparency(f6);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                case 19:
                    com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iGroundOverlayDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 20:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 21:
                    android.os.IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                    }
                    defpackage.ijx.d(parcel);
                    setImage(srfVar);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zJ2 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setClickable(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 24:
                    android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        srfVar = iInterfaceQueryLocalInterface2 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface2 : new defpackage.srf(strongBinder2);
                    }
                    defpackage.ijx.d(parcel);
                    setTag(srfVar);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    defpackage.srh tag = getTag();
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate iGroundOverlayDelegate) throws android.os.RemoteException;

    float getBearing() throws android.os.RemoteException;

    com.google.android.libraries.maps.model.LatLngBounds getBounds() throws android.os.RemoteException;

    float getHeight() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    com.google.android.libraries.maps.model.LatLng getPosition() throws android.os.RemoteException;

    defpackage.srh getTag() throws android.os.RemoteException;

    float getTransparency() throws android.os.RemoteException;

    float getWidth() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setBearing(float f) throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setDimensions(float f) throws android.os.RemoteException;

    void setDimensionsWithHeight(float f, float f2) throws android.os.RemoteException;

    void setImage(defpackage.srh srhVar) throws android.os.RemoteException;

    void setPosition(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setPositionFromBounds(com.google.android.libraries.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException;

    void setTag(defpackage.srh srhVar) throws android.os.RemoteException;

    void setTransparency(float f) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;
}
