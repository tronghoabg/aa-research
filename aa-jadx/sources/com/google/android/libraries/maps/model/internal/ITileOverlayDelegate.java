package com.google.android.libraries.maps.model.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface ITileOverlayDelegate extends android.os.IInterface {

    public static abstract class Stub extends defpackage.ijw implements com.google.android.libraries.maps.model.internal.ITileOverlayDelegate {

        public static class Proxy extends defpackage.ijv implements com.google.android.libraries.maps.model.internal.ITileOverlayDelegate {
            public Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.ITileOverlayDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void clearTileCache() throws android.os.RemoteException {
                fr(2, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public boolean equalsRemote(com.google.android.libraries.maps.model.internal.ITileOverlayDelegate iTileOverlayDelegate) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                defpackage.ijx.i(parcelFp, iTileOverlayDelegate);
                android.os.Parcel parcelFq = fq(8, parcelFp);
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public boolean getFadeIn() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(11, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public java.lang.String getId() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(3, fp());
                java.lang.String string = parcelFq.readString();
                parcelFq.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public float getTransparency() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(13, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public float getZIndex() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(5, fp());
                float f = parcelFq.readFloat();
                parcelFq.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public int hashCodeRemote() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(9, fp());
                int i = parcelFq.readInt();
                parcelFq.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelFq = fq(7, fp());
                boolean zJ = defpackage.ijx.j(parcelFq);
                parcelFq.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void remove() throws android.os.RemoteException {
                fr(1, fp());
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setFadeIn(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(10, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setTransparency(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(12, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setVisible(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeInt(z ? 1 : 0);
                fr(6, parcelFp);
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setZIndex(float f) throws android.os.RemoteException {
                android.os.Parcel parcelFp = fp();
                parcelFp.writeFloat(f);
                fr(4, parcelFp);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.ITileOverlayDelegate");
        }

        public static com.google.android.libraries.maps.model.internal.ITileOverlayDelegate asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.ITileOverlayDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.libraries.maps.model.internal.ITileOverlayDelegate ? (com.google.android.libraries.maps.model.internal.ITileOverlayDelegate) iInterfaceQueryLocalInterface : new com.google.android.libraries.maps.model.internal.ITileOverlayDelegate.Stub.Proxy(iBinder);
        }

        @Override // defpackage.ijw
        protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
            switch (i) {
                case 1:
                    remove();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    clearTileCache();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    java.lang.String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 4:
                    float f = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setZIndex(f);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 6:
                    boolean zJ = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setVisible(zJ);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 8:
                    com.google.android.libraries.maps.model.internal.ITileOverlayDelegate iTileOverlayDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    defpackage.ijx.d(parcel);
                    boolean zEqualsRemote = equalsRemote(iTileOverlayDelegateAsInterface);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEqualsRemote ? 1 : 0);
                    return true;
                case 9:
                    int iHashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(iHashCodeRemote);
                    return true;
                case 10:
                    boolean zJ2 = defpackage.ijx.j(parcel);
                    defpackage.ijx.d(parcel);
                    setFadeIn(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean fadeIn = getFadeIn();
                    parcel2.writeNoException();
                    java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                    parcel2.writeInt(fadeIn ? 1 : 0);
                    return true;
                case 12:
                    float f2 = parcel.readFloat();
                    defpackage.ijx.d(parcel);
                    setTransparency(f2);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                default:
                    return false;
            }
        }
    }

    void clearTileCache() throws android.os.RemoteException;

    boolean equalsRemote(com.google.android.libraries.maps.model.internal.ITileOverlayDelegate iTileOverlayDelegate) throws android.os.RemoteException;

    boolean getFadeIn() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    float getTransparency() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    int hashCodeRemote() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setFadeIn(boolean z) throws android.os.RemoteException;

    void setTransparency(float f) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;
}
