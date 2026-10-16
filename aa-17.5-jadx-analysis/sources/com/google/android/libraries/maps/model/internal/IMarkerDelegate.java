package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.LatLng;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import defpackage.sqh;
import defpackage.sqj;

/* loaded from: classes3.dex */
public interface IMarkerDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IMarkerDelegate {

        public static class Proxy extends ijn implements IMarkerDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IMarkerDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean equalsRemote(IMarkerDelegate iMarkerDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iMarkerDelegate);
                Parcel parcelGi = gi(16, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public float getAlpha() throws RemoteException {
                Parcel parcelGi = gi(26, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public int getCollisionBehavior() throws RemoteException {
                Parcel parcelGi = gi(35, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public String getContentDescription() throws RemoteException {
                Parcel parcelGi = gi(36, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public sqj getIconView() throws RemoteException {
                sqj sqhVar;
                Parcel parcelGi = gi(34, gh());
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

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public String getId() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public int getMarkerType() throws RemoteException {
                Parcel parcelGi = gi(32, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public LatLng getPosition() throws RemoteException {
                Parcel parcelGi = gi(4, gh());
                LatLng latLng = (LatLng) ijp.a(parcelGi, LatLng.CREATOR);
                parcelGi.recycle();
                return latLng;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public float getRotation() throws RemoteException {
                Parcel parcelGi = gi(23, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public String getSnippet() throws RemoteException {
                Parcel parcelGi = gi(8, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public sqj getTag() throws RemoteException {
                sqj sqhVar;
                Parcel parcelGi = gi(30, gh());
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

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public String getTitle() throws RemoteException {
                Parcel parcelGi = gi(6, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public float getZIndex() throws RemoteException {
                Parcel parcelGi = gi(28, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(17, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void hideInfoWindow() throws RemoteException {
                gj(12, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isDraggable() throws RemoteException {
                Parcel parcelGi = gi(10, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isFlat() throws RemoteException {
                Parcel parcelGi = gi(21, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isInfoWindowShown() throws RemoteException {
                Parcel parcelGi = gi(13, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public boolean isVisible() throws RemoteException {
                Parcel parcelGi = gi(15, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void remove() throws RemoteException {
                gj(1, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setAlpha(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(25, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setAnchor(float f, float f2) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                parcelGh.writeFloat(f2);
                gj(19, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setDraggable(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(9, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setFlat(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(20, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setIcon(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(18, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setIconView(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(33, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setInfoWindowAnchor(float f, float f2) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                parcelGh.writeFloat(f2);
                gj(24, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setMarkerType(int i) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                gj(31, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setPosition(LatLng latLng) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.g(parcelGh, latLng);
                gj(3, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setRotation(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(22, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setSnippet(String str) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeString(str);
                gj(7, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setTag(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(29, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setTitle(String str) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeString(str);
                gj(5, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setVisible(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(14, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void setZIndex(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(27, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IMarkerDelegate
            public void showInfoWindow() throws RemoteException {
                gj(11, gh());
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IMarkerDelegate");
        }

        public static IMarkerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IMarkerDelegate");
            return iInterfaceQueryLocalInterface instanceof IMarkerDelegate ? (IMarkerDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
                    String string = parcel.readString();
                    ijp.d(parcel);
                    setTitle(string);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    String title = getTitle();
                    parcel2.writeNoException();
                    parcel2.writeString(title);
                    return true;
                case 7:
                    String string2 = parcel.readString();
                    ijp.d(parcel);
                    setSnippet(string2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String snippet = getSnippet();
                    parcel2.writeNoException();
                    parcel2.writeString(snippet);
                    return true;
                case 9:
                    boolean zJ = ijp.j(parcel);
                    ijp.d(parcel);
                    setDraggable(zJ);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    boolean zIsDraggable = isDraggable();
                    parcel2.writeNoException();
                    ClassLoader classLoader = ijp.a;
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
                    ClassLoader classLoader2 = ijp.a;
                    parcel2.writeInt(zIsInfoWindowShown ? 1 : 0);
                    return true;
                case 14:
                    boolean zJ2 = ijp.j(parcel);
                    ijp.d(parcel);
                    setVisible(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    ClassLoader classLoader3 = ijp.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 16:
                    IMarkerDelegate iMarkerDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
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
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                    }
                    ijp.d(parcel);
                    setIcon(sqhVar);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    float f = parcel.readFloat();
                    float f2 = parcel.readFloat();
                    ijp.d(parcel);
                    setAnchor(f, f2);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zJ3 = ijp.j(parcel);
                    ijp.d(parcel);
                    setFlat(zJ3);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zIsFlat = isFlat();
                    parcel2.writeNoException();
                    ClassLoader classLoader4 = ijp.a;
                    parcel2.writeInt(zIsFlat ? 1 : 0);
                    return true;
                case 22:
                    float f3 = parcel.readFloat();
                    ijp.d(parcel);
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
                    ijp.d(parcel);
                    setInfoWindowAnchor(f4, f5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    float f6 = parcel.readFloat();
                    ijp.d(parcel);
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
                    ijp.d(parcel);
                    setZIndex(f7);
                    parcel2.writeNoException();
                    return true;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        sqhVar = iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(strongBinder2);
                    }
                    ijp.d(parcel);
                    setTag(sqhVar);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    sqj tag = getTag();
                    parcel2.writeNoException();
                    ijp.i(parcel2, tag);
                    return true;
                case 31:
                    int i2 = parcel.readInt();
                    ijp.d(parcel);
                    setMarkerType(i2);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    int markerType = getMarkerType();
                    parcel2.writeNoException();
                    parcel2.writeInt(markerType);
                    return true;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        sqhVar = iInterfaceQueryLocalInterface3 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface3 : new sqh(strongBinder3);
                    }
                    ijp.d(parcel);
                    setIconView(sqhVar);
                    parcel2.writeNoException();
                    return true;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    sqj iconView = getIconView();
                    parcel2.writeNoException();
                    ijp.i(parcel2, iconView);
                    return true;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    int collisionBehavior = getCollisionBehavior();
                    parcel2.writeNoException();
                    parcel2.writeInt(collisionBehavior);
                    return true;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    String contentDescription = getContentDescription();
                    parcel2.writeNoException();
                    parcel2.writeString(contentDescription);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IMarkerDelegate iMarkerDelegate) throws RemoteException;

    float getAlpha() throws RemoteException;

    int getCollisionBehavior() throws RemoteException;

    String getContentDescription() throws RemoteException;

    sqj getIconView() throws RemoteException;

    String getId() throws RemoteException;

    int getMarkerType() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    float getRotation() throws RemoteException;

    String getSnippet() throws RemoteException;

    sqj getTag() throws RemoteException;

    String getTitle() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    void hideInfoWindow() throws RemoteException;

    boolean isDraggable() throws RemoteException;

    boolean isFlat() throws RemoteException;

    boolean isInfoWindowShown() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setAlpha(float f) throws RemoteException;

    void setAnchor(float f, float f2) throws RemoteException;

    void setDraggable(boolean z) throws RemoteException;

    void setFlat(boolean z) throws RemoteException;

    void setIcon(sqj sqjVar) throws RemoteException;

    void setIconView(sqj sqjVar) throws RemoteException;

    void setInfoWindowAnchor(float f, float f2) throws RemoteException;

    void setMarkerType(int i) throws RemoteException;

    void setPosition(LatLng latLng) throws RemoteException;

    void setRotation(float f) throws RemoteException;

    void setSnippet(String str) throws RemoteException;

    void setTag(sqj sqjVar) throws RemoteException;

    void setTitle(String str) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void setZIndex(float f) throws RemoteException;

    void showInfoWindow() throws RemoteException;
}
