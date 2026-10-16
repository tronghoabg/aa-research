package com.google.android.libraries.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.Cap;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import com.google.android.libraries.maps.model.StyleSpan;
import defpackage.ijn;
import defpackage.ijo;
import defpackage.ijp;
import defpackage.sqh;
import defpackage.sqj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface IPolylineDelegate extends IInterface {

    public static abstract class Stub extends ijo implements IPolylineDelegate {

        public static class Proxy extends ijn implements IPolylineDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.maps.model.internal.IPolylineDelegate");
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean equalsRemote(IPolylineDelegate iPolylineDelegate) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, iPolylineDelegate);
                Parcel parcelGi = gi(15, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public int getColor() throws RemoteException {
                Parcel parcelGi = gi(8, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public Cap getEndCap() throws RemoteException {
                Parcel parcelGi = gi(22, gh());
                Cap cap = (Cap) ijp.a(parcelGi, Cap.CREATOR);
                parcelGi.recycle();
                return cap;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public String getId() throws RemoteException {
                Parcel parcelGi = gi(2, gh());
                String string = parcelGi.readString();
                parcelGi.recycle();
                return string;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public int getJointType() throws RemoteException {
                Parcel parcelGi = gi(24, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public List<PatternItem> getPattern() throws RemoteException {
                Parcel parcelGi = gi(26, gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(PatternItem.CREATOR);
                parcelGi.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public List<LatLng> getPoints() throws RemoteException {
                Parcel parcelGi = gi(4, gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(LatLng.CREATOR);
                parcelGi.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public List<StyleSpan> getSpans() throws RemoteException {
                Parcel parcelGi = gi(30, gh());
                ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(StyleSpan.CREATOR);
                parcelGi.recycle();
                return arrayListCreateTypedArrayList;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public Cap getStartCap() throws RemoteException {
                Parcel parcelGi = gi(20, gh());
                Cap cap = (Cap) ijp.a(parcelGi, Cap.CREATOR);
                parcelGi.recycle();
                return cap;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
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

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public float getWidth() throws RemoteException {
                Parcel parcelGi = gi(6, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public float getZIndex() throws RemoteException {
                Parcel parcelGi = gi(10, gh());
                float f = parcelGi.readFloat();
                parcelGi.recycle();
                return f;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public int hashCodeRemote() throws RemoteException {
                Parcel parcelGi = gi(16, gh());
                int i = parcelGi.readInt();
                parcelGi.recycle();
                return i;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean isClickable() throws RemoteException {
                Parcel parcelGi = gi(18, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean isGeodesic() throws RemoteException {
                Parcel parcelGi = gi(14, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public boolean isVisible() throws RemoteException {
                Parcel parcelGi = gi(12, gh());
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ;
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void remove() throws RemoteException {
                gj(1, gh());
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setClickable(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(17, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setColor(int i) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                gj(7, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setEndCap(Cap cap) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.g(parcelGh, cap);
                gj(21, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setGeodesic(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(13, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setJointType(int i) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeInt(i);
                gj(23, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setPattern(List<PatternItem> list) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeTypedList(list);
                gj(25, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setPoints(List<LatLng> list) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeTypedList(list);
                gj(3, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setSpans(List<StyleSpan> list) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeTypedList(list);
                gj(29, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setStartCap(Cap cap) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.g(parcelGh, cap);
                gj(19, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setTag(sqj sqjVar) throws RemoteException {
                Parcel parcelGh = gh();
                ijp.i(parcelGh, sqjVar);
                gj(27, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setVisible(boolean z) throws RemoteException {
                Parcel parcelGh = gh();
                ClassLoader classLoader = ijp.a;
                parcelGh.writeInt(z ? 1 : 0);
                gj(11, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setWidth(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(5, parcelGh);
            }

            @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
            public void setZIndex(float f) throws RemoteException {
                Parcel parcelGh = gh();
                parcelGh.writeFloat(f);
                gj(9, parcelGh);
            }
        }

        public Stub() {
            super("com.google.android.libraries.maps.model.internal.IPolylineDelegate");
        }

        public static IPolylineDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.maps.model.internal.IPolylineDelegate");
            return iInterfaceQueryLocalInterface instanceof IPolylineDelegate ? (IPolylineDelegate) iInterfaceQueryLocalInterface : new Proxy(iBinder);
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
                    float f = parcel.readFloat();
                    ijp.d(parcel);
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
                    ijp.d(parcel);
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
                    ijp.d(parcel);
                    setZIndex(f2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    float zIndex = getZIndex();
                    parcel2.writeNoException();
                    parcel2.writeFloat(zIndex);
                    return true;
                case 11:
                    boolean zJ = ijp.j(parcel);
                    ijp.d(parcel);
                    setVisible(zJ);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    ClassLoader classLoader = ijp.a;
                    parcel2.writeInt(zIsVisible ? 1 : 0);
                    return true;
                case 13:
                    boolean zJ2 = ijp.j(parcel);
                    ijp.d(parcel);
                    setGeodesic(zJ2);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    boolean zIsGeodesic = isGeodesic();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = ijp.a;
                    parcel2.writeInt(zIsGeodesic ? 1 : 0);
                    return true;
                case 15:
                    IPolylineDelegate iPolylineDelegateAsInterface = asInterface(parcel.readStrongBinder());
                    ijp.d(parcel);
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
                    boolean zJ3 = ijp.j(parcel);
                    ijp.d(parcel);
                    setClickable(zJ3);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    boolean zIsClickable = isClickable();
                    parcel2.writeNoException();
                    ClassLoader classLoader3 = ijp.a;
                    parcel2.writeInt(zIsClickable ? 1 : 0);
                    return true;
                case 19:
                    Cap cap = (Cap) ijp.a(parcel, Cap.CREATOR);
                    ijp.d(parcel);
                    setStartCap(cap);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    Cap startCap = getStartCap();
                    parcel2.writeNoException();
                    ijp.h(parcel2, startCap);
                    return true;
                case 21:
                    Cap cap2 = (Cap) ijp.a(parcel, Cap.CREATOR);
                    ijp.d(parcel);
                    setEndCap(cap2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    Cap endCap = getEndCap();
                    parcel2.writeNoException();
                    ijp.h(parcel2, endCap);
                    return true;
                case 23:
                    int i3 = parcel.readInt();
                    ijp.d(parcel);
                    setJointType(i3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    int jointType = getJointType();
                    parcel2.writeNoException();
                    parcel2.writeInt(jointType);
                    return true;
                case 25:
                    ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(PatternItem.CREATOR);
                    ijp.d(parcel);
                    setPattern(arrayListCreateTypedArrayList2);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    List<PatternItem> pattern = getPattern();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(pattern);
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
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(StyleSpan.CREATOR);
                    ijp.d(parcel);
                    setSpans(arrayListCreateTypedArrayList3);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    List<StyleSpan> spans = getSpans();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(spans);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IPolylineDelegate iPolylineDelegate) throws RemoteException;

    int getColor() throws RemoteException;

    Cap getEndCap() throws RemoteException;

    String getId() throws RemoteException;

    int getJointType() throws RemoteException;

    List<PatternItem> getPattern() throws RemoteException;

    List<LatLng> getPoints() throws RemoteException;

    List<StyleSpan> getSpans() throws RemoteException;

    Cap getStartCap() throws RemoteException;

    sqj getTag() throws RemoteException;

    float getWidth() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isClickable() throws RemoteException;

    boolean isGeodesic() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setClickable(boolean z) throws RemoteException;

    void setColor(int i) throws RemoteException;

    void setEndCap(Cap cap) throws RemoteException;

    void setGeodesic(boolean z) throws RemoteException;

    void setJointType(int i) throws RemoteException;

    void setPattern(List<PatternItem> list) throws RemoteException;

    void setPoints(List<LatLng> list) throws RemoteException;

    void setSpans(List<StyleSpan> list) throws RemoteException;

    void setStartCap(Cap cap) throws RemoteException;

    void setTag(sqj sqjVar) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    void setWidth(float f) throws RemoteException;

    void setZIndex(float f) throws RemoteException;
}
