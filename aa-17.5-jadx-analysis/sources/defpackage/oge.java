package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.List;

/* loaded from: classes.dex */
public abstract class oge extends ijo implements ogf {
    public oge() {
        super("com.google.android.apps.auto.components.telecom.service.ICarCall");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ogs ogqVar = null;
        switch (i) {
            case 1:
                List listH = h();
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case 2:
                boolean zB = B();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case 3:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                x(zJ);
                parcel2.writeNoException();
                return true;
            case 4:
                int iF = f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case 5:
                int iE = e();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 6:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                w(i2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.components.telecom.service.ICarCallListener");
                    ogqVar = iInterfaceQueryLocalInterface instanceof ogs ? (ogs) iInterfaceQueryLocalInterface : new ogq(strongBinder);
                }
                ijp.d(parcel);
                boolean zD = D(ogqVar);
                parcel2.writeNoException();
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.apps.auto.components.telecom.service.ICarCallListener");
                    ogqVar = iInterfaceQueryLocalInterface2 instanceof ogs ? (ogs) iInterfaceQueryLocalInterface2 : new ogq(strongBinder2);
                }
                ijp.d(parcel);
                boolean zF = F(ogqVar);
                parcel2.writeNoException();
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 9:
                CarCall carCall = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                i(carCall);
                parcel2.writeNoException();
                return true;
            case 10:
                CarCall carCall2 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                boolean zJ2 = ijp.j(parcel);
                String string = parcel.readString();
                ijp.d(parcel);
                s(carCall2, zJ2, string);
                parcel2.writeNoException();
                return true;
            case 11:
                CarCall carCall3 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                k(carCall3);
                parcel2.writeNoException();
                return true;
            case 12:
                CarCall carCall4 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                m(carCall4);
                parcel2.writeNoException();
                return true;
            case 13:
                CarCall carCall5 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                A(carCall5);
                parcel2.writeNoException();
                return true;
            case 14:
                CarCall carCall6 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                char c = (char) parcel.readInt();
                ijp.d(parcel);
                q(carCall6, c);
                parcel2.writeNoException();
                return true;
            case 15:
                CarCall carCall7 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                z(carCall7);
                parcel2.writeNoException();
                return true;
            case 16:
                CarCall carCall8 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                boolean zJ3 = ijp.j(parcel);
                ijp.d(parcel);
                r(carCall8, zJ3);
                parcel2.writeNoException();
                return true;
            case 17:
                CarCall carCall9 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                CarCall carCall10 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                j(carCall9, carCall10);
                parcel2.writeNoException();
                return true;
            case 18:
                CarCall carCall11 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                y(carCall11);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                ijp.d(parcel);
                o(string2);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel2.writeNoException();
                return true;
            case 21:
            case 25:
            default:
                return false;
            case 22:
                ijp.d(parcel);
                G();
                parcel2.writeNoException();
                return true;
            case 23:
                CarCall carCall12 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                String string3 = parcel.readString();
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                v(carCall12, string3, bundle);
                parcel2.writeNoException();
                return true;
            case 24:
                Uri uri = (Uri) ijp.a(parcel, Uri.CREATOR);
                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                p(uri, bundle2);
                parcel2.writeNoException();
                return true;
            case 26:
                CarCall carCall13 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                PhoneAccountHandle phoneAccountHandle = (PhoneAccountHandle) ijp.a(parcel, PhoneAccountHandle.CREATOR);
                boolean zJ4 = ijp.j(parcel);
                ijp.d(parcel);
                n(carCall13, phoneAccountHandle, zJ4);
                parcel2.writeNoException();
                return true;
            case 27:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) ijp.a(parcel, BluetoothDevice.CREATOR);
                ijp.d(parcel);
                t(bluetoothDevice);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                CallAudioState callAudioStateG = g();
                parcel2.writeNoException();
                ijp.h(parcel2, callAudioStateG);
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                CarCall carCall14 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                boolean zE = E(carCall14);
                parcel2.writeNoException();
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 30:
                CarCall carCall15 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                boolean zC = C(carCall15);
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 31:
                CarCall carCall16 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                boolean zJ5 = ijp.j(parcel);
                ijp.d(parcel);
                u(carCall16, zJ5);
                parcel2.writeNoException();
                return true;
        }
    }
}
