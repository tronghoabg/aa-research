package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;

/* loaded from: classes3.dex */
public interface ITileOverlayDelegate extends IInterface {

    public static abstract class Stub extends ijo implements ITileOverlayDelegate {

        public static class Proxy extends ijn implements ITileOverlayDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.ITileOverlayDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void clearTileCache() throws RemoteException {
                gj(2, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iTileOverlayDelegate);
                Parcel parcelGi = gi(8, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public boolean getFadeIn() throws RemoteException {
                Parcel parcelGi = gi(11, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public String getId() throws RemoteException {
                Parcel parcelGi = gi(3, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public float getTransparency() throws RemoteException {
                Parcel parcelGi = gi(13, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public float getZIndex() throws RemoteException {
                Parcel parcelGi = gi(5, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(9, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public boolean isVisible() throws RemoteException {
                Parcel parcelGi = gi(7, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void remove() throws RemoteException {
                gj(1, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setFadeIn(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(10, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setTransparency(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(12, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setVisible(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(6, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.ITileOverlayDelegate
            public void setZIndex(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(4, parcelGh);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.ITileOverlayDelegate");
        }

        public static ITileOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.ITileOverlayDelegate");
            return iInterfaceQueryLocalInterface instanceof ITileOverlayDelegate ? (ITileOverlayDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
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
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 4:
                    float f = parcel.readFloat();
                    ijp.d(parcel);
                    setZIndex(f);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 6:
                    boolean zJ = ijp.j(parcel);
                    ijp.d(parcel);
                    setVisible(zJ);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    ClassLoader classLoader = ijp.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 8:
                    ITileOverlayDelegate iTileOverlayDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
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
                    boolean zJ2 = ijp.j(parcel);
                    ijp.d(parcel);
                    setFadeIn(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean fadeIn = getFadeIn();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = ijp.a;
                    parcel2.writeInt(fadeIn ? 1 : 0);
                    return true;
                case 12:
                    float f2 = parcel.readFloat();
                    ijp.d(parcel);
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

    void clearTileCache() throws RemoteException;

    boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) throws RemoteException;

    boolean getFadeIn() throws RemoteException;

    String getId() throws RemoteException;

    float getTransparency() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setFadeIn(boolean z) throws RemoteException;

    void setTransparency(float f) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void setZIndex(float f) throws RemoteException;
}
