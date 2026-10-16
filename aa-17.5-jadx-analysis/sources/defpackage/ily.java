package defpackage;

import android.content.pm.PackageManager;
import com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.gms.car.diagnostics.CriticalError;

/* loaded from: classes.dex */
public final /* synthetic */ class ily implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ ily(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        switch (this.a) {
            case 0:
                CriticalError criticalErrorA = CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER);
                iku ikuVar = GearheadCarServiceCallbacks.b;
                ikuVar.getClass();
                ikuVar.a(criticalErrorA);
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                yph yphVar = joi.a;
                return;
            case 5:
                ((ype) ((ype) jqj.a.g()).ai((char) 2600)).u("Delegate CarService has died, no recovery possible.");
                throw new IllegalStateException("Delegate CarService has died, no recovery possible.");
            case 6:
                yph yphVar2 = jqm.a;
                return;
            case 7:
                yph yphVar3 = kyw.a;
                if (lbh.d().g()) {
                    mua.a().x();
                    return;
                }
                return;
            case 8:
                int i = kzf.a;
                lah.a().h(18, null);
                return;
            case 9:
                kzn.e();
                return;
            case 10:
                lah.e(ywj.VOICE_SESSION_MICROPHONE_NOT_OPENED_WITHIN_TIMEOUT, null);
                return;
            case 11:
                yph yphVar4 = lzv.a;
                nsy.a().b(null);
                return;
            case 12:
                mcw mcwVar = mda.a;
                PackageManager packageManager = mki.a.c.getPackageManager();
                yno it = ((ylx) kmo.a(acpf.e())).keySet().iterator();
                it.getClass();
                while (it.hasNext()) {
                    E next = it.next();
                    next.getClass();
                    try {
                        packageManager.getPackageUid((String) next, 0);
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PARKED_APP, yzy.LM).l());
                        ebf.j().F((rqv) olm.e(acai.N).l());
                        return;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return;
            case 13:
                msb msbVar = msc.a;
                nsr.c().f(true);
                return;
            case 14:
                yph yphVar5 = RailHotseatItemView.a;
                return;
            case 15:
                yph yphVar6 = nnm.a;
                return;
            case 16:
                nrl.j();
                return;
            case 17:
                nrl.j();
                return;
            case 18:
                yph yphVar7 = nrx.a;
                ((ype) nrx.a.l().ai((char) 5357)).u("onScrimClicked");
                nrq.b().a().i();
                return;
            case 19:
                nuj nujVarB = nuj.b();
                nvm.a.longValue();
                nujVarB.g("quick_feedback_notification_tag", 759347436L, "com.google.android.projection.gearhead");
                return;
            default:
                yph yphVar8 = nvs.a;
                return;
        }
    }
}
