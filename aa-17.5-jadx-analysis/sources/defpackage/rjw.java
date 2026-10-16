package defpackage;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import java.util.List;

/* loaded from: classes.dex */
public abstract class rjw extends ijo implements rjx {
    public rjw() {
        super("com.google.android.gms.car.display.manager.ICarDisplay");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qyn qylVar = null;
        rkp rknVar = null;
        rkp rknVar2 = null;
        rkg rkeVar = null;
        rkg rkeVar2 = null;
        rkd rkbVar = null;
        rkd rkbVar2 = null;
        qyn qylVar2 = null;
        switch (i) {
            case 2:
                qzf qzfVarD = d();
                parcel2.writeNoException();
                ijp.i(parcel2, qzfVarD);
                return true;
            case 3:
                CarUiInfo carUiInfoC = c();
                parcel2.writeNoException();
                ijp.h(parcel2, carUiInfoC);
                return true;
            case 4:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    qylVar = iInterfaceQueryLocalInterface instanceof qyn ? (qyn) iInterfaceQueryLocalInterface : new qyl(strongBinder);
                }
                ijp.d(parcel);
                n(qylVar);
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    qylVar2 = iInterfaceQueryLocalInterface2 instanceof qyn ? (qyn) iInterfaceQueryLocalInterface2 : new qyl(strongBinder2);
                }
                ijp.d(parcel);
                s(qylVar2);
                parcel2.writeNoException();
                return true;
            case 6:
                CarDisplay carDisplayG = g();
                parcel2.writeNoException();
                ijp.h(parcel2, carDisplayG);
                return true;
            case 7:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
                    rkbVar2 = iInterfaceQueryLocalInterface3 instanceof rkd ? (rkd) iInterfaceQueryLocalInterface3 : new rkb(strongBinder3);
                }
                ijp.d(parcel);
                k(rkbVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
                    rkbVar = iInterfaceQueryLocalInterface4 instanceof rkd ? (rkd) iInterfaceQueryLocalInterface4 : new rkb(strongBinder4);
                }
                ijp.d(parcel);
                p(rkbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                Rect rectA = a();
                parcel2.writeNoException();
                ijp.h(parcel2, rectA);
                return true;
            case 10:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
                    rkeVar2 = iInterfaceQueryLocalInterface5 instanceof rkg ? (rkg) iInterfaceQueryLocalInterface5 : new rke(strongBinder5);
                }
                ijp.d(parcel);
                l(rkeVar2);
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
                    rkeVar = iInterfaceQueryLocalInterface6 instanceof rkg ? (rkg) iInterfaceQueryLocalInterface6 : new rke(strongBinder6);
                }
                ijp.d(parcel);
                q(rkeVar);
                parcel2.writeNoException();
                return true;
            case 12:
                CarDisplayUiFeatures carDisplayUiFeaturesH = h();
                parcel2.writeNoException();
                ijp.h(parcel2, carDisplayUiFeaturesH);
                return true;
            case 13:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
                    rknVar2 = iInterfaceQueryLocalInterface7 instanceof rkp ? (rkp) iInterfaceQueryLocalInterface7 : new rkn(strongBinder7);
                }
                ijp.d(parcel);
                m(rknVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
                    rknVar = iInterfaceQueryLocalInterface8 instanceof rkp ? (rkp) iInterfaceQueryLocalInterface8 : new rkn(strongBinder8);
                }
                ijp.d(parcel);
                r(rknVar);
                parcel2.writeNoException();
                return true;
            case 15:
                List listI = i();
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 16:
                o();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
