package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface IPolylineDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.IPolylineDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.IPolylineDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IPolylineDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.IPolylineDelegate iPolylineDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iPolylineDelegate);
                android.os.Parcel parcelFq = fq(15, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public int getColor() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(8, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public com.google.android.libraries.maps.model.Cap getEndCap() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(22, fp());
                com.google.android.libraries.maps.model.Cap cap = (com.google.android.libraries.maps.model.Cap) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.Cap.CREATOR);
                parcelFq.recycle();
                return cap;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public java.lang.String getId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public int getJointType() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(24, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public java.util.List<com.google.android.libraries.maps.model.PatternItem> getPattern() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(26, fp());
                java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.libraries.maps.model.PatternItem.CREATOR);
                parcelFq.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public java.util.List<com.google.android.libraries.maps.model.LatLng> getPoints() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.libraries.maps.model.LatLng.CREATOR);
                parcelFq.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public java.util.List<com.google.android.libraries.maps.model.StyleSpan> getSpans() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(30, fp());
                java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.libraries.maps.model.StyleSpan.CREATOR);
                parcelFq.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public com.google.android.libraries.maps.model.Cap getStartCap() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(20, fp());
                com.google.android.libraries.maps.model.Cap cap = (com.google.android.libraries.maps.model.Cap) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.Cap.CREATOR);
                parcelFq.recycle();
                return cap;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
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

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public float getWidth() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(6, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public float getZIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(10, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(16, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean isClickable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(18, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean isGeodesic() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(14, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(12, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void remove() throws android.os.RemoteException {
                fr(1, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setClickable(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(17, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setColor(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(7, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setEndCap(com.google.android.libraries.maps.model.Cap cap) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, cap);
                fr(21, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setGeodesic(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(13, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setJointType(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(23, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setPattern(java.util.List<com.google.android.libraries.maps.model.PatternItem> list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeTypedList(list);
                fr(25, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setPoints(java.util.List<com.google.android.libraries.maps.model.LatLng> list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeTypedList(list);
                fr(3, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setSpans(java.util.List<com.google.android.libraries.maps.model.StyleSpan> list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeTypedList(list);
                fr(29, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setStartCap(com.google.android.libraries.maps.model.Cap cap) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, cap);
                fr(19, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setTag(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(27, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setVisible(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(11, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setWidth(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(5, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setZIndex(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(9, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IPolylineDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.IPolylineDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IPolylineDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.IPolylineDelegate ? (com.google.android.libraries.maps.model.internal.IPolylineDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.IPolylineDelegate.Stub.Proxy(iBinder);
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
                    float f = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setWidth(f);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float width = getWidth();
                    parcel2.writeNoException();
                    parcel2.writeFloat(width);
                    return true;
                case 7:
                    int i2 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    setColor(i2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    int color = getColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(color);
                    return true;
                case 9:
                    float f2 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setZIndex(f2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 11:
                    boolean zJ = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setVisible(zJ);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 13:
                    boolean zJ2 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setGeodesic(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    boolean zIsGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                    parcel2.writeInt(zIsGeodesic ? 1 : 0);
                    return true;
                case 15:
                    com.google.android.libraries.maps.model.internal.IPolylineDelegate iPolylineDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iPolylineDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 16:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 17:
                    boolean zJ3 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setClickable(zJ3);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 19:
                    com.google.android.libraries.maps.model.Cap cap = (com.google.android.libraries.maps.model.Cap) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.Cap.CREATOR);
                    defpackage.ijx.d(parcel);
                    setStartCap(cap);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    com.google.android.libraries.maps.model.Cap startCap = getStartCap();
                    parcel2.writeNoException();
                    defpackage.ijx.h(parcel2, startCap);
                    return true;
                case 21:
                    com.google.android.libraries.maps.model.Cap cap2 = (com.google.android.libraries.maps.model.Cap) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.Cap.CREATOR);
                    defpackage.ijx.d(parcel);
                    setEndCap(cap2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    com.google.android.libraries.maps.model.Cap endCap = getEndCap();
                    parcel2.writeNoException();
                    defpackage.ijx.h(parcel2, endCap);
                    return true;
                case 23:
                    int i3 = parcel.readInt();
                    defpackage.ijx.d(parcel);
                    setJointType(i3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int jointType = getJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(jointType);
                    return true;
                case 25:
                    java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(com.google.android.libraries.maps.model.PatternItem.CREATOR);
                    defpackage.ijx.d(parcel);
                    setPattern(arrayListCreateTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    java.util.List<com.google.android.libraries.maps.model.PatternItem> pattern = getPattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(pattern);
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
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    java.util.ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(com.google.android.libraries.maps.model.StyleSpan.CREATOR);
                    defpackage.ijx.d(parcel);
                    setSpans(arrayListCreateTypedArrayList3);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    java.util.List<com.google.android.libraries.maps.model.StyleSpan> spans = getSpans();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(spans);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.IPolylineDelegate iPolylineDelegate) throws android.os.RemoteException;

    int getColor() throws android.os.RemoteException;

    com.google.android.libraries.maps.model.Cap getEndCap() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    int getJointType() throws android.os.RemoteException;

    java.util.List<com.google.android.libraries.maps.model.PatternItem> getPattern() throws android.os.RemoteException;

    java.util.List<com.google.android.libraries.maps.model.LatLng> getPoints() throws android.os.RemoteException;

    java.util.List<com.google.android.libraries.maps.model.StyleSpan> getSpans() throws android.os.RemoteException;

    com.google.android.libraries.maps.model.Cap getStartCap() throws android.os.RemoteException;

    defpackage.srh getTag() throws android.os.RemoteException;

    float getWidth() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isGeodesic() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setColor(int i) throws android.os.RemoteException;

    void setEndCap(com.google.android.libraries.maps.model.Cap cap) throws android.os.RemoteException;

    void setGeodesic(boolean z) throws android.os.RemoteException;

    void setJointType(int i) throws android.os.RemoteException;

    void setPattern(java.util.List<com.google.android.libraries.maps.model.PatternItem> list) throws android.os.RemoteException;

    void setPoints(java.util.List<com.google.android.libraries.maps.model.LatLng> list) throws android.os.RemoteException;

    void setSpans(java.util.List<com.google.android.libraries.maps.model.StyleSpan> list) throws android.os.RemoteException;

    void setStartCap(com.google.android.libraries.maps.model.Cap cap) throws android.os.RemoteException;

    void setTag(defpackage.srh srhVar) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setWidth(float f) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;
}
