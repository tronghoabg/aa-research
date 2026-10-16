package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qvw extends defpackage.ijw implements defpackage.qvx {
    public qvw() {
        super("com.google.android.gms.car.ICarAudio");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qyc qvyVar = null;
        switch (i) {
            case 1:
                int[] iArrP = p();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrP);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArrO = o();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArrR = r(i2);
                parcel2.writeNoException();
                parcel2.writeTypedArray(carAudioConfigurationArrR, 1);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration carAudioConfigurationF = f(i3, i4);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carAudioConfigurationF);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i5 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArrQ = q(i5);
                parcel2.writeNoException();
                parcel2.writeTypedArray(carAudioConfigurationArrQ, 1);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration carAudioConfigurationD = d(i6, i7);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carAudioConfigurationD);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                defpackage.ijx.d(parcel);
                int iC = c(i8, i9);
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                defpackage.ijx.d(parcel);
                int iB = b(i10, i11);
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 9:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null && (strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback") instanceof qwa)) {
                }
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                defpackage.ijx.d(parcel);
                qwk qwkVarT = t();
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, qwkVarT);
                return true;
            case 10:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    qyc qycVarQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    qvyVar = qycVarQueryLocalInterface instanceof qwa ? (qwa) qycVarQueryLocalInterface : new defpackage.qvy(strongBinder2);
                }
                int i12 = parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                defpackage.ijx.d(parcel);
                qwd qwdVarS = s(qvyVar, i12);
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, qwdVarS);
                return true;
            case 11:
                long j = parcel.readLong();
                defpackage.ijx.d(parcel);
                boolean zN = n(j);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 12:
                long j2 = parcel.readLong();
                defpackage.ijx.d(parcel);
                boolean zM = m(j2);
                parcel2.writeNoException();
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 13:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    qyc qycVarQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
                    qvyVar = qycVarQueryLocalInterface2 instanceof qwj ? (qwj) qycVarQueryLocalInterface2 : new qwh(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                g(qvyVar);
                parcel2.writeNoException();
                return true;
            case 14:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    qyc qycVarQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
                    qvyVar = qycVarQueryLocalInterface3 instanceof qwj ? (qwj) qycVarQueryLocalInterface3 : new qwh(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                k(qvyVar);
                parcel2.writeNoException();
                return true;
            case 15:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    qyc qycVarQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
                    qvyVar = qycVarQueryLocalInterface4 instanceof qyc ? qycVarQueryLocalInterface4 : new qya(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                h(qvyVar);
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    qyc qycVarQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
                    qvyVar = qycVarQueryLocalInterface5 instanceof qyc ? qycVarQueryLocalInterface5 : new qya(strongBinder6);
                }
                defpackage.ijx.d(parcel);
                l(qvyVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
