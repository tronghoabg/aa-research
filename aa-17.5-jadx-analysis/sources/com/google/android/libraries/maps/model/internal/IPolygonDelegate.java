package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import defpackage.sqh;
import defpackage.sqj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface IPolygonDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IPolygonDelegate {

        public static class Proxy extends ijn implements IPolygonDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IPolygonDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean equalsRemote(IPolygonDelegate iPolygonDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iPolygonDelegate);
                Parcel parcelGi = gi(19, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int getFillColor() throws RemoteException {
                Parcel parcelGi = gi(12, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public List getHoles() throws RemoteException {
                Parcel parcelGi = gi(6, gh());
                ArrayList arrayListC = ijp.c(parcelGi);
                parcelGi.recycle();
                return arrayListC;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public String getId() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public List<LatLng> getPoints() throws RemoteException {
                Parcel parcelGi = gi(4, gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(LatLng.CREATOR);
                parcelGi.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int getStrokeColor() throws RemoteException {
                Parcel parcelGi = gi(10, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int getStrokeJointType() throws RemoteException {
                Parcel parcelGi = gi(24, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public List<PatternItem> getStrokePattern() throws RemoteException {
                Parcel parcelGi = gi(26, gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(PatternItem.CREATOR);
                parcelGi.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public float getStrokeWidth() throws RemoteException {
                Parcel parcelGi = gi(8, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public sqj getTag() throws RemoteException {
                sqj sqhVar;
                Parcel parcelGi = gi(28, gh());
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

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public float getZIndex() throws RemoteException {
                Parcel parcelGi = gi(14, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(20, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean isClickable() throws RemoteException {
                Parcel parcelGi = gi(22, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean isGeodesic() throws RemoteException {
                Parcel parcelGi = gi(18, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public boolean isVisible() throws RemoteException {
                Parcel parcelGi = gi(16, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void remove() throws RemoteException {
                gj(1, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setClickable(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(21, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setFillColor(int i) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                gj(11, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setGeodesic(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(17, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setHoles(List list) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeList(list);
                gj(5, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setPoints(List<LatLng> list) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeTypedList(list);
                gj(3, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokeColor(int i) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                gj(9, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokeJointType(int i) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                gj(23, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokePattern(List<PatternItem> list) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeTypedList(list);
                gj(25, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setStrokeWidth(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(7, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setTag(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(27, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setVisible(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(15, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
            public void setZIndex(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(13, parcelGh);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IPolygonDelegate");
        }

        public static IPolygonDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IPolygonDelegate");
            return iInterfaceQueryLocalInterface instanceof IPolygonDelegate ? (IPolygonDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // defpackage.ijo
        protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            sqj sqhVar;
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
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(LatLng.CREATOR);
                    ijp.d(parcel);
                    setPoints(arrayListCreateTypedArrayList);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    List<LatLng> points = getPoints();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(points);
                    return true;
                case 5:
                    ArrayList arrayListC = ijp.c(parcel);
                    ijp.d(parcel);
                    setHoles(arrayListC);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    List holes = getHoles();
                    parcel2.writeNoException();
                    parcel2.writeList(holes);
                    return true;
                case 7:
                    float f = parcel.readFloat();
                    ijp.d(parcel);
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
                    ijp.d(parcel);
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
                    ijp.d(parcel);
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
                    ijp.d(parcel);
                    setZIndex(f2);
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
                    boolean zJ2 = ijp.j(parcel);
                    ijp.d(parcel);
                    setGeodesic(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zIsGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = ijp.a;
                    parcel2.writeInt(zIsGeodesic ? 1 : 0);
                    return true;
                case 19:
                    IPolygonDelegate iPolygonDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
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
                    boolean zJ3 = ijp.j(parcel);
                    ijp.d(parcel);
                    setClickable(zJ3);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    ClassLoader classLoader3 = ijp.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 23:
                    int i4 = parcel.readInt();
                    ijp.d(parcel);
                    setStrokeJointType(i4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int strokeJointType = getStrokeJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(strokeJointType);
                    return true;
                case 25:
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(PatternItem.CREATOR);
                    ijp.d(parcel);
                    setStrokePattern(arrayListCreateTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    List<PatternItem> strokePattern = getStrokePattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(strokePattern);
                    return true;
                case 27:
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder == null) {
                        sqhVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                    }
                    ijp.d(parcel);
                    setTag(sqhVar);
                    parcel2.writeNoException();
                    return true;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    sqj tag = getTag();
                    parcel2.writeNoException();
                    ijp.i(parcel2, tag);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IPolygonDelegate iPolygonDelegate) throws RemoteException;

    int getFillColor() throws RemoteException;

    List getHoles() throws RemoteException;

    String getId() throws RemoteException;

    List<LatLng> getPoints() throws RemoteException;

    int getStrokeColor() throws RemoteException;

    int getStrokeJointType() throws RemoteException;

    List<PatternItem> getStrokePattern() throws RemoteException;

    float getStrokeWidth() throws RemoteException;

    sqj getTag() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isClickable() throws RemoteException;

    boolean isGeodesic() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setClickable(boolean z) throws RemoteException;

    void setFillColor(int i) throws RemoteException;

    void setGeodesic(boolean z) throws RemoteException;

    void setHoles(List list) throws RemoteException;

    void setPoints(List<LatLng> list) throws RemoteException;

    void setStrokeColor(int i) throws RemoteException;

    void setStrokeJointType(int i) throws RemoteException;

    void setStrokePattern(List<PatternItem> list) throws RemoteException;

    void setStrokeWidth(float f) throws RemoteException;

    void setTag(sqj sqjVar) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void setZIndex(float f) throws RemoteException;
}
