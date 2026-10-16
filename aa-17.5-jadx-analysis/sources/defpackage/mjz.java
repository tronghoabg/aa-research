package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.apps.auto.components.car.info.StartingProcessInfo;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.android.gearhead.service.SharedService;
import com.google.android.gms.car.CarInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class mjz extends ijo implements mka {
    public final List a;
    public final SharedService b;

    public mjz(SharedService sharedService) {
        super("com.google.android.apps.auto.components.service.ICarModeSharedService");
        this.a = new CopyOnWriteArrayList();
        this.b = sharedService;
    }

    private final void a() {
        if (Binder.getCallingUid() != Process.myUid()) {
            SharedService sharedService = this.b;
            yph yphVar = SharedService.a;
            String[] packagesForUid = sharedService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            skn sknVarA = skn.a(sharedService);
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    if (kmo.c(aczs.b(), str) && sknVarA.b(str)) {
                        return;
                    }
                }
            }
            throw new SecurityException("Unauthorized");
        }
    }

    @Override // defpackage.mka
    public final void e(TelemetryEvent telemetryEvent) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            SharedService sharedService = this.b;
            yph yphVar = SharedService.a;
            Set set = sharedService.c;
            if (!set.contains(Integer.valueOf(callingUid))) {
                String[] packagesForUid = sharedService.getPackageManager().getPackagesForUid(callingUid);
                skn sknVarA = skn.a(sharedService);
                if (packagesForUid != null) {
                    for (String str : packagesForUid) {
                        if (sknVarA.b(str)) {
                            set.add(Integer.valueOf(callingUid));
                        }
                    }
                }
                throw new SecurityException(a.bp(callingUid, "Cannot send telemetry from uid "));
            }
        }
        ((ohw) mki.a.i(ohw.class)).c(telemetryEvent);
    }

    @Override // defpackage.mka
    public final void f(StartingProcessInfo startingProcessInfo) {
        a();
        ((ype) SharedService.a.l().ai((char) 7402)).u("Projection process starting");
        try {
            qjp qjpVar = new qjp(this, startingProcessInfo.a);
            CarInfo carInfo = startingProcessInfo.b;
            if (carInfo != null) {
                kiq.a().d(carInfo, SharedService.class.getName());
            }
            String str = startingProcessInfo.e;
            if (str != null) {
                kiq.a().d.set(str);
            }
            SharedService sharedService = this.b;
            sharedService.d = startingProcessInfo.c;
            sharedService.e = startingProcessInfo.d;
            ((ype) SharedService.a.l().ai((char) 7403)).u("Resetting internal state");
            olm.d().e();
            qjpVar.a(0);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) SharedService.a.h()).p(e)).ai((char) 7404)).u("Couldn't create client");
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            StartingProcessInfo startingProcessInfo = (StartingProcessInfo) ijp.a(parcel, StartingProcessInfo.CREATOR);
            ijp.d(parcel);
            f(startingProcessInfo);
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            ijp.d(parcel);
            g(strongBinder);
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            TelemetryEvent telemetryEvent = (TelemetryEvent) ijp.a(parcel, TelemetryEvent.CREATOR);
            ijp.d(parcel);
            e(telemetryEvent);
            return true;
        }
        mkb mkbVar = null;
        switch (i) {
            case 9:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.apps.auto.components.service.IPlugbotSharedServiceCallback");
                    mkbVar = iInterfaceQueryLocalInterface instanceof mkb ? (mkb) iInterfaceQueryLocalInterface : new mkb(strongBinder2);
                }
                ijp.d(parcel);
                a();
                ((kna) mki.a.i(kna.class)).l(mkbVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.apps.auto.components.service.IPlugbotSharedServiceCallback");
                    mkbVar = iInterfaceQueryLocalInterface2 instanceof mkb ? (mkb) iInterfaceQueryLocalInterface2 : new mkb(strongBinder3);
                }
                ijp.d(parcel);
                a();
                ((kna) mki.a.i(kna.class)).m(mkbVar);
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.apps.auto.components.service.IPlugbotSharedServiceCallback");
                    mkbVar = iInterfaceQueryLocalInterface3 instanceof mkb ? (mkb) iInterfaceQueryLocalInterface3 : new mkb(strongBinder4);
                }
                ijp.d(parcel);
                a();
                ((kna) mki.a.i(kna.class)).n(mkbVar);
                parcel2.writeNoException();
                return true;
            case 12:
                a();
                ((kna) mki.a.i(kna.class)).b();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.mka
    public final void g(IBinder iBinder) {
        qjp qjpVar;
        a();
        yph yphVar = SharedService.a;
        ((ype) yphVar.l().ai((char) 7405)).u("Projection process stopping");
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                qjpVar = null;
                break;
            } else {
                qjpVar = (qjp) it.next();
                if (qjpVar.a == iBinder) {
                    break;
                }
            }
        }
        if (qjpVar == null) {
            ((ype) ((ype) yphVar.g()).ai((char) 7406)).u("Unknown token sent for stopping. Ignore request");
            return;
        }
        if (qjpVar.b(1)) {
            qjpVar.a.unlinkToDeath(qjpVar, 0);
        }
        olm.d().b();
    }
}
