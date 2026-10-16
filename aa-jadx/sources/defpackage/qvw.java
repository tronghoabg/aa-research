package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qvw extends defpackage.ijw implements defpackage.qvx {
    public qvw() {
        super("com.google.android.gms.car.ICarAudio");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qwa qvyVar = null;
        defpackage.qyc qyaVar = null;
        defpackage.qyc qyaVar2 = null;
        defpackage.qwj qwhVar = null;
        defpackage.qwj qwhVar2 = null;
        switch (i) {
            case 1:
                int[] iArrP = p();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrP);
                return true;
            case 2:
                int[] iArrO = o();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO);
                return true;
            case 3:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArrR = r(i2);
                parcel2.writeNoException();
                parcel2.writeTypedArray(carAudioConfigurationArrR, 1);
                return true;
            case 4:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration carAudioConfigurationF = f(i3, i4);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carAudioConfigurationF);
                return true;
            case 5:
                int i5 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArrQ = q(i5);
                parcel2.writeNoException();
                parcel2.writeTypedArray(carAudioConfigurationArrQ, 1);
                return true;
            case 6:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                defpackage.ijx.d(parcel);
                com.google.android.gms.car.CarAudioConfiguration carAudioConfigurationD = d(i6, i7);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carAudioConfigurationD);
                return true;
            case 7:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                defpackage.ijx.d(parcel);
                int iC = c(i8, i9);
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 8:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                defpackage.ijx.d(parcel);
                int iB = b(i10, i11);
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 9:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    if (iInterfaceQueryLocalInterface instanceof defpackage.qwa) {
                    }
                }
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.qwk qwkVarT = t();
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, qwkVarT);
                return true;
            case 10:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    qvyVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qwa ? (defpackage.qwa) iInterfaceQueryLocalInterface2 : new defpackage.qvy(strongBinder2);
                }
                int i12 = parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.qwd qwdVarS = s(qvyVar, i12);
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
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
                    qwhVar2 = iInterfaceQueryLocalInterface3 instanceof defpackage.qwj ? (defpackage.qwj) iInterfaceQueryLocalInterface3 : new defpackage.qwh(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                g(qwhVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
                    qwhVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qwj ? (defpackage.qwj) iInterfaceQueryLocalInterface4 : new defpackage.qwh(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                k(qwhVar);
                parcel2.writeNoException();
                return true;
            case 15:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
                    qyaVar2 = iInterfaceQueryLocalInterface5 instanceof defpackage.qyc ? (defpackage.qyc) iInterfaceQueryLocalInterface5 : new defpackage.qya(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                h(qyaVar2);
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
                    qyaVar = iInterfaceQueryLocalInterface6 instanceof defpackage.qyc ? (defpackage.qyc) iInterfaceQueryLocalInterface6 : new defpackage.qya(strongBinder6);
                }
                defpackage.ijx.d(parcel);
                l(qyaVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
