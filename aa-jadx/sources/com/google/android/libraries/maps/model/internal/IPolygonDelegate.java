package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IPolygonDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IPolygonDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IPolygonDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IPolygonDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.IPolygonDelegate iPolygonDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iPolygonDelegate);
                android.os.Parcel parcelFq = fq(19, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int getFillColor() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(12, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public java.util.List getHoles() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(6, fp());
                java.util.ArrayList arrayListC = defpackage.ijx.c(parcelFq);
                parcelFq.recycle();
                return arrayListC;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public java.lang.String getId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public java.util.List<com.google.android.libraries.maps.model.LatLng> getPoints() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.libraries.maps.model.LatLng.CREATOR);
                parcelFq.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int getStrokeColor() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(10, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int getStrokeJointType() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(24, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public java.util.List<com.google.android.libraries.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(26, fp());
                java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.libraries.maps.model.PatternItem.CREATOR);
                parcelFq.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public float getStrokeWidth() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(8, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public defpackage.srh getTag() throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFq = fq(28, fp());
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

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public float getZIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(14, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(20, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean isClickable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(22, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean isGeodesic() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(18, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(16, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void remove() throws android.os.RemoteException {
                fr(1, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setClickable(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(21, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setFillColor(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(11, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setGeodesic(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(17, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setHoles(java.util.List list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeList(list);
                fr(5, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setPoints(java.util.List<com.google.android.libraries.maps.model.LatLng> list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeTypedList(list);
                fr(3, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokeColor(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(9, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokeJointType(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(23, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokePattern(java.util.List<com.google.android.libraries.maps.model.PatternItem> list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeTypedList(list);
                fr(25, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokeWidth(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(7, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setTag(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(27, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setVisible(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(15, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setZIndex(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(13, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IPolygonDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IPolygonDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IPolygonDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IPolygonDelegate ? (com.google.android.libraries.maps.model.internal.IPolygonDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IPolygonDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            defpackage.srh srfVar;
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
                    java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.libraries.maps.model.LatLng.CREATOR);
                    defpackage.ijx.d(parcel);
                    setPoints(arrayListCreateTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    java.util.List<com.google.android.libraries.maps.model.LatLng> points = getPoints();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(points);
                    return true;
                case 5:
                    java.util.ArrayList arrayListC = defpackage.ijx.c(parcel);
                    defpackage.ijx.d(parcel);
                    setHoles(arrayListC);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    java.util.List holes = getHoles();
                    parcel2.writeNoException();
                    parcel2.writeList(holes);
                    return true;
                case 7:
                    float f = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setStrokeWidth(f);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    float strokeWidth = getStrokeWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(strokeWidth);
                    return true;
                case 9:
                    int i2 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    setStrokeColor(i2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    int strokeColor = getStrokeColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeColor);
                    return true;
                case 11:
                    int i3 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    setFillColor(i3);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    int fillColor = getFillColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(fillColor);
                    return true;
                case 13:
                    float f2 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setZIndex(f2);
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
                    boolean zJ2 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setGeodesic(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zIsGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                    parcel2.writeInt(zIsGeodesic ? 1 : 0);
                    return true;
                case 19:
                    com.google.android.libraries.maps.model.internal.IPolygonDelegate iPolygonDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iPolygonDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 20:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 21:
                    boolean zJ3 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setClickable(zJ3);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 23:
                    int i4 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    setStrokeJointType(i4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int strokeJointType = getStrokeJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeJointType);
                    return true;
                case 25:
                    java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(com.google.android.libraries.maps.model.PatternItem.CREATOR);
                    defpackage.ijx.d(parcel);
                    setStrokePattern(arrayListCreateTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    java.util.List<com.google.android.libraries.maps.model.PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 27:
                    android.os.IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder == null) {
                        srfVar = null;
                    } else {
                        android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                    }
                    defpackage.ijx.d(parcel);
                    setTag(srfVar);
                    parcel2.writeNoException();
                    return true;
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    defpackage.srh tag = getTag();
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.IPolygonDelegate iPolygonDelegate) throws android.os.RemoteException;

    int getFillColor() throws android.os.RemoteException;

    java.util.List getHoles() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    java.util.List<com.google.android.libraries.maps.model.LatLng> getPoints() throws android.os.RemoteException;

    int getStrokeColor() throws android.os.RemoteException;

    int getStrokeJointType() throws android.os.RemoteException;

    java.util.List<com.google.android.libraries.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException;

    float getStrokeWidth() throws android.os.RemoteException;

    defpackage.srh getTag() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isGeodesic() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setFillColor(int i) throws android.os.RemoteException;

    void setGeodesic(boolean z) throws android.os.RemoteException;

    void setHoles(java.util.List list) throws android.os.RemoteException;

    void setPoints(java.util.List<com.google.android.libraries.maps.model.LatLng> list) throws android.os.RemoteException;

    void setStrokeColor(int i) throws android.os.RemoteException;

    void setStrokeJointType(int i) throws android.os.RemoteException;

    void setStrokePattern(java.util.List<com.google.android.libraries.maps.model.PatternItem> list) throws android.os.RemoteException;

    void setStrokeWidth(float f) throws android.os.RemoteException;

    void setTag(defpackage.srh srhVar) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;
}
