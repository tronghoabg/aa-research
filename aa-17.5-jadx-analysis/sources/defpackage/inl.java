package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.apps.auto.carservice.gmscorecompat.CarStartupServiceImpl;
import com.google.android.apps.auto.carservice.gmscorecompat.CarUsbReceiver;
import com.google.android.gms.carsetup.setup.SetupBinder;

/* loaded from: classes2.dex */
public final /* synthetic */ class inl implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ inl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.b) {
            case 0:
                ComponentName componentName = ((ing) this.a).d;
                Intent intent = iob.a;
                return new RuntimeException(String.valueOf(String.valueOf(componentName)).concat(" crashed with no exn"));
            case 1:
                return ((ima) this.a).y();
            case 2:
                int i = CarStartupServiceImpl.a;
                return this.a;
            case 3:
                int i2 = CarUsbReceiver.a;
                PowerManager powerManager = (PowerManager) ((Context) this.a).getApplicationContext().getSystemService("power");
                wub.K(powerManager, new Object[0]);
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(268435457, "gearhead:UsbReceiver");
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(30000L);
                return new SetupBinder(new sky(wakeLockNewWakeLock));
            case 4:
                yph yphVar = jnv.a;
                smr smrVarH = uqw.H(rlx.a, Looper.getMainLooper(), "Dummy Listener");
                snb snbVar = new snb();
                snbVar.a = new qpz(6);
                snbVar.c = 11010;
                final snc sncVarA = snbVar.a();
                smx smxVar = new smx();
                smxVar.c = smrVarH;
                smxVar.a = new qpz(7);
                smxVar.b = new qpz(8);
                smxVar.f = 11010;
                rjr rjrVarA = smxVar.a();
                Object obj = this.a;
                svz svzVarX = ((sla) obj).x(rjrVarA);
                final rlx rlxVar = (rlx) obj;
                return spu.aK(svzVarX.c(swd.a, new svy() { // from class: rlv
                    @Override // defpackage.svy
                    public final svz a(Object obj2) {
                        return rlxVar.u(0, sncVarA);
                    }
                }));
            case 5:
                yph yphVar2 = jnv.a;
                return spu.aK(((sla) this.a).v(uqw.G(rlx.a, "Dummy Listener"), 11011));
            case 6:
                yph yphVar3 = kjf.a;
                return this.a;
            case 7:
                return ((Enum) this.a).name();
            case 8:
                return new eqm(Boolean.valueOf(((lyu) this.a).h()));
            case 9:
                return ((nrq) this.a).d;
            case 10:
                return this.a;
            case 11:
                return new ojg((Context) this.a);
            case 12:
                return new okb((Context) this.a);
            case 13:
                return new okl((Context) this.a);
            case 14:
                return new ojv((Context) this.a);
            case 15:
                return new ojp((Context) this.a);
            case 16:
                return new okp((Context) this.a);
            case 17:
                return new ojd((Context) this.a);
            case 18:
                return new oks((Context) this.a);
            case 19:
                return new okf((Context) this.a);
            default:
                return new okn((Context) this.a);
        }
    }
}
