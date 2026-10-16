package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qvw extends ijo implements qvx {
    public qvw() {
        super("com.google.android.gms.car.ICarCall");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qwa qvyVar = null;
        switch (i) {
            case 1:
                List listG = g();
                parcel2.writeNoException();
                parcel2.writeTypedList(listG);
                return true;
            case 2:
                boolean zS = s();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 3:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                p(zJ);
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
                o(i2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
                    qvyVar = iInterfaceQueryLocalInterface instanceof qwa ? (qwa) iInterfaceQueryLocalInterface : new qvy(strongBinder);
                }
                ijp.d(parcel);
                boolean zT = t(qvyVar);
                parcel2.writeNoException();
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
                    qvyVar = iInterfaceQueryLocalInterface2 instanceof qwa ? (qwa) iInterfaceQueryLocalInterface2 : new qvy(strongBinder2);
                }
                ijp.d(parcel);
                boolean zU = u(qvyVar);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 9:
                CarCall carCall = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                h(carCall);
                parcel2.writeNoException();
                return true;
            case 10:
                CarCall carCall2 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.j(parcel);
                parcel.readString();
                ijp.d(parcel);
                z(carCall2);
                parcel2.writeNoException();
                return true;
            case 11:
                CarCall carCall3 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                j(carCall3);
                parcel2.writeNoException();
                return true;
            case 12:
                CarCall carCall4 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                l(carCall4);
                parcel2.writeNoException();
                return true;
            case 13:
                CarCall carCall5 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                r(carCall5);
                parcel2.writeNoException();
                return true;
            case 14:
                CarCall carCall6 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                char c = (char) parcel.readInt();
                ijp.d(parcel);
                n(carCall6, c);
                parcel2.writeNoException();
                return true;
            case 15:
                CarCall carCall7 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                q(carCall7);
                parcel2.writeNoException();
                return true;
            case 16:
                ijp.j(parcel);
                ijp.d(parcel);
                y();
                parcel2.writeNoException();
                return true;
            case 17:
                CarCall carCall8 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                CarCall carCall9 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                ijp.d(parcel);
                i(carCall8, carCall9);
                parcel2.writeNoException();
                return true;
            case 18:
                ijp.d(parcel);
                B();
                parcel2.writeNoException();
                return true;
            case 19:
                String string = parcel.readString();
                ijp.d(parcel);
                m(string);
                parcel2.writeNoException();
                return true;
            case 20:
                k();
                parcel2.writeNoException();
                return true;
            case 21:
            case 25:
            default:
                return false;
            case 22:
                ijp.d(parcel);
                w();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.readString();
                ijp.d(parcel);
                A();
                parcel2.writeNoException();
                return true;
            case 24:
                ijp.d(parcel);
                x();
                parcel2.writeNoException();
                return true;
            case 26:
                CarCall carCall10 = (CarCall) ijp.a(parcel, CarCall.CREATOR);
                PhoneAccountHandle phoneAccountHandle = (PhoneAccountHandle) ijp.a(parcel, PhoneAccountHandle.CREATOR);
                ijp.j(parcel);
                ijp.d(parcel);
                v(carCall10, phoneAccountHandle);
                parcel2.writeNoException();
                return true;
        }
    }
}
