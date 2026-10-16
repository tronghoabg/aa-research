package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import defpackage.sqh;
import defpackage.sqj;

/* loaded from: classes3.dex */
public interface IGroundOverlayDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IGroundOverlayDelegate {

        public static class Proxy extends ijn implements IGroundOverlayDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iGroundOverlayDelegate);
                Parcel parcelGi = gi(19, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getBearing() throws RemoteException {
                Parcel parcelGi = gi(12, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public LatLngBounds getBounds() throws RemoteException {
                Parcel parcelGi = gi(10, gh());
                LatLngBounds latLngBounds = (LatLngBounds) ijp.a(parcelGi, LatLngBounds.CREATOR);
                parcelGi.recycle();
                return latLngBounds;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getHeight() throws RemoteException {
                Parcel parcelGi = gi(8, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public String getId() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public LatLng getPosition() throws RemoteException {
                Parcel parcelGi = gi(4, gh());
                LatLng latLng = (LatLng) ijp.a(parcelGi, LatLng.CREATOR);
                parcelGi.recycle();
                return latLng;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public sqj getTag() throws RemoteException {
                sqj sqhVar;
                Parcel parcelGi = gi(25, gh());
                IBinder strongBinder = parcelGi.readStrongBinder();
                if (strongBinder == null) {
                    sqhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                }
                parcelGi.recycle();
                return sqhVar;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getTransparency() throws RemoteException {
                Parcel parcelGi = gi(18, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getWidth() throws RemoteException {
                Parcel parcelGi = gi(7, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public float getZIndex() throws RemoteException {
                Parcel parcelGi = gi(14, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(20, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public boolean isClickable() throws RemoteException {
                Parcel parcelGi = gi(23, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public boolean isVisible() throws RemoteException {
                Parcel parcelGi = gi(16, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void remove() throws RemoteException {
                gj(1, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setBearing(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(11, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setClickable(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(22, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setDimensions(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(5, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setDimensionsWithHeight(float f, float f2) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                parcelGh.writeFloat(f2);
                gj(6, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setImage(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(21, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setPosition(LatLng latLng) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.g(parcelGh, latLng);
                gj(3, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.g(parcelGh, latLngBounds);
                gj(9, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setTag(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(24, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setTransparency(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(17, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setVisible(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(15, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate
            public void setZIndex(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(13, parcelGh);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate");
        }

        public static IGroundOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate");
            return iInterfaceQueryLocalInterface instanceof IGroundOverlayDelegate ? (IGroundOverlayDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            sqj sqhVar = null;
            switch (i) {
                case 1:
                    remove();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                case 3:
                    LatLng latLng = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                    ijp.d(parcel);
                    setPosition(latLng);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    LatLng position = getPosition();
                    parcel2.writeNoException();
                    ijp.h(parcel2, position);
                    return true;
                case 5:
                    float f = parcel.readFloat();
                    ijp.d(parcel);
                    setDimensions(f);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    float f2 = parcel.readFloat();
                    float f3 = parcel.readFloat();
                    ijp.d(parcel);
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
                    LatLngBounds latLngBounds = (LatLngBounds) ijp.a(parcel, LatLngBounds.CREATOR);
                    ijp.d(parcel);
                    setPositionFromBounds(latLngBounds);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    LatLngBounds bounds = getBounds();
                    parcel2.writeNoException();
                    ijp.h(parcel2, bounds);
                    return true;
                case 11:
                    float f4 = parcel.readFloat();
                    ijp.d(parcel);
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
                    ijp.d(parcel);
                    setZIndex(f5);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 15:
                    boolean zJ = ijp.j(parcel);
                    ijp.d(parcel);
                    setVisible(zJ);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    ClassLoader classLoader = ijp.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 17:
                    float f6 = parcel.readFloat();
                    ijp.d(parcel);
                    setTransparency(f6);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    float transparency = getTransparency();
                    parcel2.writeNoException();
                    parcel2.writeFloat(transparency);
                    return true;
                case 19:
                    IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
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
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                    }
                    ijp.d(parcel);
                    setImage(sqhVar);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zJ2 = ijp.j(parcel);
                    ijp.d(parcel);
                    setClickable(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = ijp.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 24:
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        sqhVar = iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(strongBinder2);
                    }
                    ijp.d(parcel);
                    setTag(sqhVar);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    sqj tag = getTag();
                    parcel2.writeNoException();
                    ijp.i(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) throws RemoteException;

    float getBearing() throws RemoteException;

    LatLngBounds getBounds() throws RemoteException;

    float getHeight() throws RemoteException;

    String getId() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    sqj getTag() throws RemoteException;

    float getTransparency() throws RemoteException;

    float getWidth() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isClickable() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setBearing(float f) throws RemoteException;

    void setClickable(boolean z) throws RemoteException;

    void setDimensions(float f) throws RemoteException;

    void setDimensionsWithHeight(float f, float f2) throws RemoteException;

    void setImage(sqj sqjVar) throws RemoteException;

    void setPosition(LatLng latLng) throws RemoteException;

    void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException;

    void setTag(sqj sqjVar) throws RemoteException;

    void setTransparency(float f) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void setZIndex(float f) throws RemoteException;
}
