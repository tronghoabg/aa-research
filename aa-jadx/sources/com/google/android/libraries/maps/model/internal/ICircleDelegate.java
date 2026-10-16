package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface ICircleDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.ICircleDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.ICircleDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.ICircleDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.ICircleDelegate iCircleDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iCircleDelegate);
                android.os.Parcel parcelFq = fq(17, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public com.google.android.libraries.maps.model.LatLng getCenter() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(4, fp());
                com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.LatLng.CREATOR);
                parcelFq.recycle();
                return latLng;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public int getFillColor() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(12, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public java.lang.String getId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(2, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public double getRadius() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(6, fp());
                double d = parcelFq.readDouble();
                parcelFq.recycle();
                return d;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public int getStrokeColor() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(10, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public java.util.List<com.google.android.libraries.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(22, fp());
                java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.libraries.maps.model.PatternItem.CREATOR);
                parcelFq.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public float getStrokeWidth() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(8, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public defpackage.srh getTag() throws android.os.RemoteException {
                defpackage.srh srfVar;
                android.os.Parcel parcelFq = fq(24, fp());
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

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public float getZIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(14, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(18, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public boolean isClickable() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(20, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(16, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void remove() throws android.os.RemoteException {
                fr(1, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setCenter(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.g(parcelFp, latLng);
                fr(3, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setClickable(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(19, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setFillColor(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(11, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setRadius(double d) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeDouble(d);
                fr(5, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setStrokeColor(int i) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeInt(i);
                fr(9, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setStrokePattern(java.util.List<com.google.android.libraries.maps.model.PatternItem> list) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeTypedList(list);
                fr(21, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setStrokeWidth(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(7, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setTag(defpackage.srh srhVar) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, srhVar);
                fr(23, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setVisible(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(15, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
            public void setZIndex(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(13, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.ICircleDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.ICircleDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.ICircleDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.ICircleDelegate ? (com.google.android.libraries.maps.model.internal.ICircleDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.ICircleDelegate.Stub.Proxy(iBinder);
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
                    com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.LatLng.CREATOR);
                    defpackage.ijx.d(parcel);
                    setCenter(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    com.google.android.libraries.maps.model.LatLng center = getCenter();
                    parcel2.writeNoException();
                    defpackage.ijx.h(parcel2, center);
                    return true;
                case 5:
                    double d = parcel.readDouble();
                    defpackage.ijx.d(parcel);
                    setRadius(d);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    double radius = getRadius();
                    parcel2.writeNoException();
                    parcel2.writeDouble(radius);
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
                    com.google.android.libraries.maps.model.internal.ICircleDelegate iCircleDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iCircleDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 18:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 19:
                    boolean zJ2 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setClickable(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 21:
                    java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.libraries.maps.model.PatternItem.CREATOR);
                    defpackage.ijx.d(parcel);
                    setStrokePattern(arrayListCreateTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    java.util.List<com.google.android.libraries.maps.model.PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 23:
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
                case 24:
                    defpackage.srh tag = getTag();
                    parcel2.writeNoException();
                    defpackage.ijx.i(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.ICircleDelegate iCircleDelegate) throws android.os.RemoteException;

    com.google.android.libraries.maps.model.LatLng getCenter() throws android.os.RemoteException;

    int getFillColor() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    double getRadius() throws android.os.RemoteException;

    int getStrokeColor() throws android.os.RemoteException;

    java.util.List<com.google.android.libraries.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException;

    float getStrokeWidth() throws android.os.RemoteException;

    defpackage.srh getTag() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setCenter(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setFillColor(int i) throws android.os.RemoteException;

    void setRadius(double d) throws android.os.RemoteException;

    void setStrokeColor(int i) throws android.os.RemoteException;

    void setStrokePattern(java.util.List<com.google.android.libraries.maps.model.PatternItem> list) throws android.os.RemoteException;

    void setStrokeWidth(float f) throws android.os.RemoteException;

    void setTag(defpackage.srh srhVar) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;
}
