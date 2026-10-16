package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class rwu extends ijo implements rwv {
    public rwu() {
        super("com.google.android.gms.car.startup.IStartup");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            long j = parcel.readLong();
            ijp.d(parcel);
            r(j);
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i == 8) {
            long j2 = parcel.readLong();
            ijp.d(parcel);
            m(j2);
            parcel2.writeNoException();
        } else if (i != 13) {
            rwy rwwVar = null;
            rwy rwwVar2 = null;
            rwm rwkVar = null;
            rwm rwkVar2 = null;
            rws rwqVar = null;
            rwm rwkVar3 = null;
            rwy rwwVar3 = null;
            if (i == 4) {
                long j3 = parcel.readLong();
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcel, ParcelFileDescriptor.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IStartupServiceCallback");
                    rwwVar = iInterfaceQueryLocalInterface instanceof rwy ? (rwy) iInterfaceQueryLocalInterface : new rww(strongBinder);
                }
                ijp.d(parcel);
                g(j3, parcelFileDescriptor, rwwVar);
                parcel2.writeNoException();
            } else if (i == 5) {
                long j4 = parcel.readLong();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.startup.IStartupServiceCallback");
                    rwwVar3 = iInterfaceQueryLocalInterface2 instanceof rwy ? (rwy) iInterfaceQueryLocalInterface2 : new rww(strongBinder2);
                }
                ijp.d(parcel);
                h(j4, rwwVar3);
                parcel2.writeNoException();
            } else if (i != 6) {
                switch (i) {
                    case 15:
                        f();
                        parcel2.writeNoException();
                        break;
                    case 16:
                        IBinder strongBinder3 = parcel.readStrongBinder();
                        if (strongBinder3 != null) {
                            IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                            rwqVar = iInterfaceQueryLocalInterface3 instanceof rws ? (rws) iInterfaceQueryLocalInterface3 : new rwq(strongBinder3);
                        }
                        ijp.d(parcel);
                        rwp rwpVarC = c(rwqVar);
                        parcel2.writeNoException();
                        ijp.i(parcel2, rwpVarC);
                        break;
                    case 17:
                        long j5 = parcel.readLong();
                        ArrayList arrayListC = ijp.c(parcel);
                        ArrayList arrayListC2 = ijp.c(parcel);
                        ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ijp.a(parcel, ParcelFileDescriptor.CREATOR);
                        IBinder strongBinder4 = parcel.readStrongBinder();
                        if (strongBinder4 != null) {
                            IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.startup.ICarServiceCallback");
                            rwkVar2 = iInterfaceQueryLocalInterface4 instanceof rwm ? (rwm) iInterfaceQueryLocalInterface4 : new rwk(strongBinder4);
                        }
                        rwm rwmVar = rwkVar2;
                        ijp.d(parcel);
                        l(j5, arrayListC, arrayListC2, parcelFileDescriptor2, rwmVar);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        long j6 = parcel.readLong();
                        ArrayList arrayListC3 = ijp.c(parcel);
                        ArrayList arrayListC4 = ijp.c(parcel);
                        IBinder strongBinder5 = parcel.readStrongBinder();
                        if (strongBinder5 != null) {
                            IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.startup.ICarServiceCallback");
                            rwkVar = iInterfaceQueryLocalInterface5 instanceof rwm ? (rwm) iInterfaceQueryLocalInterface5 : new rwk(strongBinder5);
                        }
                        ijp.d(parcel);
                        j(j6, arrayListC3, arrayListC4, rwkVar);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        long j7 = parcel.readLong();
                        int i2 = parcel.readInt();
                        ijp.d(parcel);
                        i(j7, i2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        long j8 = parcel.readLong();
                        int i3 = parcel.readInt();
                        Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                        IBinder strongBinder6 = parcel.readStrongBinder();
                        if (strongBinder6 != null) {
                            IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.startup.IStartupServiceCallback");
                            rwwVar2 = iInterfaceQueryLocalInterface6 instanceof rwy ? (rwy) iInterfaceQueryLocalInterface6 : new rww(strongBinder6);
                        }
                        ijp.d(parcel);
                        d(j8, i3, bundle, rwwVar2);
                        parcel2.writeNoException();
                        break;
                    case 21:
                        t();
                        parcel2.writeNoException();
                        ClassLoader classLoader = ijp.a;
                        parcel2.writeInt(1);
                        break;
                    case 22:
                        ClassLoader classLoader2 = ijp.a;
                        boolean z = parcel.readInt() != 0;
                        boolean z2 = parcel.readInt() != 0;
                        ijp.d(parcel);
                        o(z, z2);
                        parcel2.writeNoException();
                        break;
                    case 23:
                        long j9 = parcel.readLong();
                        Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                        ijp.d(parcel);
                        n(j9, bundle2);
                        parcel2.writeNoException();
                        break;
                    case 24:
                        parcel.readInt();
                        parcel.readInt();
                        ijp.d(parcel);
                        u();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        break;
                    case 25:
                        int i4 = parcel.readInt();
                        int i5 = parcel.readInt();
                        ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) ijp.a(parcel, ParcelFileDescriptor.CREATOR);
                        byte[] bArrCreateByteArray = parcel.createByteArray();
                        ijp.d(parcel);
                        boolean zS = s(i4, i5, parcelFileDescriptor3, bArrCreateByteArray);
                        parcel2.writeNoException();
                        parcel2.writeInt(zS ? 1 : 0);
                        break;
                    default:
                        return false;
                }
            } else {
                long j10 = parcel.readLong();
                ArrayList arrayListC5 = ijp.c(parcel);
                ParcelFileDescriptor parcelFileDescriptor4 = (ParcelFileDescriptor) ijp.a(parcel, ParcelFileDescriptor.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.startup.ICarServiceCallback");
                    rwkVar3 = iInterfaceQueryLocalInterface7 instanceof rwm ? (rwm) iInterfaceQueryLocalInterface7 : new rwk(strongBinder7);
                }
                ijp.d(parcel);
                k(j10, arrayListC5, parcelFileDescriptor4, rwkVar3);
                parcel2.writeNoException();
            }
        } else {
            qup qupVarB = b();
            parcel2.writeNoException();
            ijp.i(parcel2, qupVarB);
        }
        return true;
    }
}
