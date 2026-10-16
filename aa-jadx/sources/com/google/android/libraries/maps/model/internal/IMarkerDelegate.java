package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IMarkerDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IMarkerDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IMarkerDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IMarkerDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iMarkerDelegate);
                android.os.Parcel parcelFq = fq(16, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public float getAlpha() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(26, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public int getCollisionBehavior() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(35, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public java.lang.String getContentDescription() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(36, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public defpackage.srh getIconView() throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFq = fq(34, fp());
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

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public java.lang.String getId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public int getMarkerType() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(32, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public com.google.android.libraries.maps.model.LatLng getPosition() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.LatLng.CREATOR);
                parcelFq.recycle();
                return latLng;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public float getRotation() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(23, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public java.lang.String getSnippet() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(8, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public defpackage.srh getTag() throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFq = fq(30, fp());
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

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public java.lang.String getTitle() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(6, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public float getZIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(28, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(17, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void hideInfoWindow() throws android.os.RemoteException {
                fr(12, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isDraggable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(10, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isFlat() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(21, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isInfoWindowShown() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(13, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(15, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void remove() throws android.os.RemoteException {
                fr(1, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setAlpha(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(25, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setAnchor(float f, float f2) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                parcelFp.writeFloat(f2);
                fr(19, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setDraggable(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(9, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setFlat(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(20, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setIcon(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(18, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setIconView(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(33, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setInfoWindowAnchor(float f, float f2) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                parcelFp.writeFloat(f2);
                fr(24, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setMarkerType(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(31, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setPosition(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, latLng);
                fr(3, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setRotation(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(22, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setSnippet(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeString(str);
                fr(7, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setTag(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(29, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setTitle(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeString(str);
                fr(5, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setVisible(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(14, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setZIndex(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(27, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void showInfoWindow() throws android.os.RemoteException {
                fr(11, fp());
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IMarkerDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IMarkerDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IMarkerDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IMarkerDelegate ? (com.google.android.libraries.maps.model.internal.IMarkerDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IMarkerDelegate.Stub.Proxy(iBinder);
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
                    java.lang.String string = parcel.readString();
                    defpackage.ijx.d(parcel);
                    setTitle(string);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    java.lang.String title = getTitle();
                    parcel2.writeNoException();
                    parcel2.writeString(title);
                    return true;
                case 7:
                    java.lang.String string2 = parcel.readString();
                    defpackage.ijx.d(parcel);
                    setSnippet(string2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    java.lang.String snippet = getSnippet();
                    parcel2.writeNoException();
                    parcel2.writeString(snippet);
                    return true;
                case 9:
                    boolean zJ = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setDraggable(zJ);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    boolean zIsDraggable = isDraggable();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                    parcel2.writeInt(zIsDraggable ? 1 : 0);
                    return true;
                case 11:
                    showInfoWindow();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    hideInfoWindow();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean zIsInfoWindowShown = isInfoWindowShown();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                    parcel2.writeInt(zIsInfoWindowShown ? 1 : 0);
                    return true;
                case 14:
                    boolean zJ2 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setVisible(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 16:
                    com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iMarkerDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 17:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 18:
                    android.os.IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                    }
                    defpackage.ijx.d(parcel);
                    setIcon(srfVar);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    float f = parcel.readFloat();
                    float f2 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setAnchor(f, f2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zJ3 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setFlat(zJ3);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zIsFlat = isFlat();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader4 = defpackage.ijx.a;
                    parcel2.writeInt(zIsFlat ? 1 : 0);
                    return true;
                case 22:
                    float f3 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setRotation(f3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    float rotation = getRotation();
                    parcel2.writeNoException();
                    parcel2.writeFloat(rotation);
                    return true;
                case 24:
                    float f4 = parcel.readFloat();
                    float f5 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setInfoWindowAnchor(f4, f5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    float f6 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setAlpha(f6);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    float alpha = getAlpha();
                    parcel2.writeNoException();
                    parcel2.writeFloat(alpha);
                    return true;
                case 27:
                    float f7 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setZIndex(f7);
                    parcel2.writeNoException();
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        srfVar = iInterfaceQueryLocalInterface2 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface2 : new defpackage.srf(strongBinder2);
                    }
                    defpackage.ijx.d(parcel);
                    setTag(srfVar);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    defpackage.srh tag = getTag();
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, tag);
                    return true;
                case 31:
                    int i2 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    setMarkerType(i2);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    int markerType = getMarkerType();
                    parcel2.writeNoException();
                    parcel2.writeInt(markerType);
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        srfVar = iInterfaceQueryLocalInterface3 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface3 : new defpackage.srf(strongBinder3);
                    }
                    defpackage.ijx.d(parcel);
                    setIconView(srfVar);
                    parcel2.writeNoException();
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    defpackage.srh iconView = getIconView();
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, iconView);
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    int collisionBehavior = getCollisionBehavior();
                    parcel2.writeNoException();
                    parcel2.writeInt(collisionBehavior);
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                    java.lang.String contentDescription = getContentDescription();
                    parcel2.writeNoException();
                    parcel2.writeString(contentDescription);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException;

    float getAlpha() throws android.os.RemoteException;

    int getCollisionBehavior() throws android.os.RemoteException;

    java.lang.String getContentDescription() throws android.os.RemoteException;

    defpackage.srh getIconView() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    int getMarkerType() throws android.os.RemoteException;

    com.google.android.libraries.maps.model.LatLng getPosition() throws android.os.RemoteException;

    float getRotation() throws android.os.RemoteException;

    java.lang.String getSnippet() throws android.os.RemoteException;

    defpackage.srh getTag() throws android.os.RemoteException;

    java.lang.String getTitle() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    void hideInfoWindow() throws android.os.RemoteException;

    boolean isDraggable() throws android.os.RemoteException;

    boolean isFlat() throws android.os.RemoteException;

    boolean isInfoWindowShown() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setAlpha(float f) throws android.os.RemoteException;

    void setAnchor(float f, float f2) throws android.os.RemoteException;

    void setDraggable(boolean z) throws android.os.RemoteException;

    void setFlat(boolean z) throws android.os.RemoteException;

    void setIcon(defpackage.srh srhVar) throws android.os.RemoteException;

    void setIconView(defpackage.srh srhVar) throws android.os.RemoteException;

    void setInfoWindowAnchor(float f, float f2) throws android.os.RemoteException;

    void setMarkerType(int i) throws android.os.RemoteException;

    void setPosition(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setRotation(float f) throws android.os.RemoteException;

    void setSnippet(java.lang.String str) throws android.os.RemoteException;

    void setTag(defpackage.srh srhVar) throws android.os.RemoteException;

    void setTitle(java.lang.String str) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    void showInfoWindow() throws android.os.RemoteException;
}
