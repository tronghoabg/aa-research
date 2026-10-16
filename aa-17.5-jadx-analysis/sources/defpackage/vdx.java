package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public abstract class vdx extends ijo implements vdy {
    public vdx() {
        super("com.google.android.libraries.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                sqj sqjVarJ = j();
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarJ);
                return true;
            case 2:
                sqj sqjVarK = k();
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarK);
                return true;
            case 3:
                float f = parcel.readFloat();
                float f2 = parcel.readFloat();
                ijp.d(parcel);
                sqj sqjVarG = g(f, f2);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarG);
                return true;
            case 4:
                float f3 = parcel.readFloat();
                ijp.d(parcel);
                sqj sqjVarL = l(f3);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarL);
                return true;
            case 5:
                float f4 = parcel.readFloat();
                ijp.d(parcel);
                sqj sqjVarH = h(f4);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarH);
                return true;
            case 6:
                float f5 = parcel.readFloat();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                ijp.d(parcel);
                sqj sqjVarI = i(f5, i2, i3);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarI);
                return true;
            case 7:
                CameraPosition cameraPosition = (CameraPosition) ijp.a(parcel, CameraPosition.CREATOR);
                ijp.d(parcel);
                sqj sqjVarA = a(cameraPosition);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarA);
                return true;
            case 8:
                LatLng latLng = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                ijp.d(parcel);
                sqj sqjVarB = b(latLng);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarB);
                return true;
            case 9:
                LatLng latLng2 = (LatLng) ijp.a(parcel, LatLng.CREATOR);
                float f6 = parcel.readFloat();
                ijp.d(parcel);
                sqj sqjVarF = f(latLng2, f6);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarF);
                return true;
            case 10:
                LatLngBounds latLngBounds = (LatLngBounds) ijp.a(parcel, LatLngBounds.CREATOR);
                int i4 = parcel.readInt();
                ijp.d(parcel);
                sqj sqjVarC = c(latLngBounds, i4);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarC);
                return true;
            case 11:
                LatLngBounds latLngBounds2 = (LatLngBounds) ijp.a(parcel, LatLngBounds.CREATOR);
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                ijp.d(parcel);
                sqj sqjVarD = d(latLngBounds2, i5, i6, i7);
                parcel2.writeNoException();
                ijp.i(parcel2, sqjVarD);
                return true;
            default:
                return false;
        }
    }
}
