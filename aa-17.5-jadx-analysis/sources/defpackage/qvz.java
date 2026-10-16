package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class qvz extends ijo implements qwa {
    public qvz() {
        super("com.google.android.gms.car.ICarCallListener");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
                ijp.d(parcel);
                e(keyEvent);
                return true;
            case 2:
                boolean zJ = ijp.j(parcel);
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                ijp.d(parcel);
                f(zJ, i2, i3);
                return true;
            case 3:
                CarCall carCall = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                g(carCall);
                return true;
            case 4:
                CarCall carCall2 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                i(carCall2);
                return true;
            case 5:
                CarCall carCall3 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                int i4 = parcel.readInt();
                ijp.d(parcel);
                q(carCall3, i4);
                return true;
            case 6:
                CarCall carCall4 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                CarCall carCall5 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                o(carCall4, carCall5);
                return true;
            case 7:
                CarCall carCall6 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(CarCall.CREATOR);
                ijp.d(parcel);
                k(carCall6, arrayListCreateTypedArrayList);
                return true;
            case 8:
                CarCall carCall7 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                CarCall.Details details = (CarCall.Details) ijp.a(parcel, CarCall.Details.CREATOR);
                ijp.d(parcel);
                n(carCall7, details);
                return true;
            case 9:
                CarCall carCall8 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ijp.d(parcel);
                j(carCall8, arrayListCreateStringArrayList);
                return true;
            case 10:
                CarCall carCall9 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                String string = parcel.readString();
                ijp.d(parcel);
                p(carCall9, string);
                return true;
            case 11:
                CarCall carCall10 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                h(carCall10);
                return true;
            case 12:
                CarCall carCall11 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CarCall.CREATOR);
                ijp.d(parcel);
                l(carCall11, arrayListCreateTypedArrayList2);
                return true;
            case 13:
                CarCall carCall12 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                m(carCall12, string2, bundle);
                return true;
            default:
                return false;
        }
    }
}
