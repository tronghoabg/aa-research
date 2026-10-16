package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ogy extends defpackage.ijw implements ogz {
    public ogy() {
        super("com.google.android.apps.auto.components.telecom.service.ICarCall");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.ohm ohkVar = null;
        switch (i) {
            case 1:
                java.util.List listH = h();
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                boolean zB = B();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                x(zJ);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int iF = f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int iE = e();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                w(i2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    ohk ohkVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.components.telecom.service.ICarCallListener");
                    ohkVar = ohkVarQueryLocalInterface instanceof defpackage.ohm ? (defpackage.ohm) ohkVarQueryLocalInterface : new ohk(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zD = D(ohkVar);
                parcel2.writeNoException();
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    ohk ohkVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.apps.auto.components.telecom.service.ICarCallListener");
                    ohkVar = ohkVarQueryLocalInterface2 instanceof defpackage.ohm ? (defpackage.ohm) ohkVarQueryLocalInterface2 : new ohk(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                boolean zF = F(ohkVar);
                parcel2.writeNoException();
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 9:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                i(carCall);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall2 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                boolean zJ2 = defpackage.ijx.j(parcel);
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                s(carCall2, zJ2, string);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall3 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                k(carCall3);
                parcel2.writeNoException();
                return true;
            case 12:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall4 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                m(carCall4);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall5 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                A(carCall5);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall6 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                char c = (char) parcel.readInt();
                defpackage.ijx.d(parcel);
                q(carCall6, c);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall7 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                z(carCall7);
                parcel2.writeNoException();
                return true;
            case 16:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall8 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                boolean zJ3 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                r(carCall8, zJ3);
                parcel2.writeNoException();
                return true;
            case 17:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall9 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                com.google.android.apps.auto.components.telecom.call.CarCall carCall10 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                j(carCall9, carCall10);
                parcel2.writeNoException();
                return true;
            case 18:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall11 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                y(carCall11);
                parcel2.writeNoException();
                return true;
            case 19:
                java.lang.String string2 = parcel.readString();
                defpackage.ijx.d(parcel);
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
                defpackage.ijx.d(parcel);
                G();
                parcel2.writeNoException();
                return true;
            case 23:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall12 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                java.lang.String string3 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                v(carCall12, string3, bundle);
                parcel2.writeNoException();
                return true;
            case 24:
                android.net.Uri uri = (android.net.Uri) defpackage.ijx.a(parcel, android.net.Uri.CREATOR);
                android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                p(uri, bundle2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall13 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.ijx.a(parcel, android.telecom.PhoneAccountHandle.CREATOR);
                boolean zJ4 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                n(carCall13, phoneAccountHandle, zJ4);
                parcel2.writeNoException();
                return true;
            case 27:
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) defpackage.ijx.a(parcel, android.bluetooth.BluetoothDevice.CREATOR);
                defpackage.ijx.d(parcel);
                t(bluetoothDevice);
                parcel2.writeNoException();
                return true;
            case 28:
                android.telecom.CallAudioState callAudioStateG = g();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, callAudioStateG);
                return true;
            case 29:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall14 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                boolean zE = E(carCall14);
                parcel2.writeNoException();
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 30:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall15 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                defpackage.ijx.d(parcel);
                boolean zC = C(carCall15);
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 31:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall16 = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                boolean zJ5 = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                u(carCall16, zJ5);
                parcel2.writeNoException();
                return true;
        }
    }
}
