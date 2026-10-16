package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mpe implements lhg, qqq {
    public static final yph a = yph.c("GH.ProjectionContext");
    public boolean b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private boolean f;

    public static mpe a() {
        return (mpe) mki.a.i(mpe.class);
    }

    public final mqb b(Intent intent) {
        mqb mqbVarE = mov.e(intent);
        ComponentName componentName = mqbVarE == null ? null : mqbVarE.a;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            mot motVar = (mot) it.next();
            if (motVar.b.equals(componentName)) {
                mqb mqbVarH = motVar.h();
                if (mqbVarH == null) {
                    break;
                }
                return mqbVarH;
            }
        }
        return mqbVarE;
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        kgq.d(new kyi(this, 8), "GH.ProjectionContext", yzz.PROJECTION_CONTEXT, yzy.pw, "Error registering car activity start processor.", new Object[0]);
        this.f = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        if (this.b) {
            if (kio.b().q()) {
                mki.a.g();
                rdm rdmVarD = ((qsz) kio.b().e()).d();
                if (omc.c("CAR.CLIENT", 3)) {
                    rrd.a("CAR.CLIENT", null, "UnregisterCarActivityLifecycleEventProcessor");
                }
                rdmVarD.i.F(new rcs(this, 2));
            }
            this.b = false;
        }
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f = false;
    }

    @Override // defpackage.qqq
    public final void e(Intent intent) {
        if (this.f) {
            i(intent);
        } else {
            ((ype) ((ype) a.h()).ai((char) 5158)).y("Attempting to start %s out of lifetime. Doing nothing", intent);
        }
    }

    public final void f(mou mouVar) {
        this.e.add(mouVar);
    }

    public final void g(mov movVar) {
        this.c.add(movVar);
    }

    public final void h(mot motVar) {
        this.d.add(motVar);
    }

    public final void i(Intent intent) {
        k(intent, new qql());
    }

    public final void j(mqb mqbVar) {
        i(mqbVar.a());
    }

    public final void k(Intent intent, qql qqlVar) {
        qql qqlVarB;
        for (mou mouVar : this.e) {
            intent.getClass();
            if (mouVar.b(intent)) {
                yph yphVar = mou.b;
                yop yopVarL = yphVar.l();
                String str = mouVar.c;
                yopVarL.M("%s intent interceptor will intercept the intent %s", str, intent);
                mouVar.a(intent);
                yphVar.l().M("%s intent interceptor intercepted the intent %s", str, intent);
                return;
            }
        }
        mqb mqbVarB = mqb.b(intent);
        if (mqbVarB != null) {
            lgw lgwVarA = lem.a();
            qrn qrnVarE = kio.b().e();
            ComponentName componentName = mqbVarB.a;
            mqc mqcVarA = lgwVarA.a(qrnVarE, new mqb(componentName));
            if (mqcVarA != null) {
                mpz mpzVar = mqcVarA.b;
                mpz mpzVar2 = mpz.b;
                if (mpzVar == mpzVar2 && !componentName.equals(mkn.A)) {
                    lgv.a().f(mpzVar2, componentName);
                }
            }
            mqbVarB.d(intent);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mov) it.next()).f(intent, qqlVar);
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((mot) it2.next()).f(intent, qqlVar);
        }
        ((ype) a.l().ai((char) 5159)).M("startCarActivity(intent:%s, activityOptions:%s)", intent, qqlVar);
        CarRegionId carRegionId = qqlVar.e;
        if (carRegionId == null) {
            carRegionId = CarRegionId.a;
        }
        boolean booleanExtra = intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false);
        yph yphVar2 = mpd.a;
        boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_STARTED_BY_DASHBOARD", false);
        if (!ldz.a().c(kio.b().e()) || !carRegionId.equals(CarRegionId.a) || booleanExtra || booleanExtra2) {
            qqlVarB = carRegionId.equals(CarRegionId.a) ? qql.b(mki.a.c, R.anim.coolwalk_app_switch_enter, R.anim.coolwalk_no_op_app_switch_exit) : qql.b(mki.a.c, R.anim.coolwalk_app_switch_enter, R.anim.coolwalk_app_switch_exit);
        } else {
            nsw nswVarI = nsh.i();
            Context context = mki.a.c;
            CarDisplayId carDisplayId = CarDisplayId.a;
            qqlVarB = nswVarI.g(carDisplayId) ? nswVarI.k(carDisplayId) ? qql.b(context, R.anim.activity_slide_in_from_right, R.anim.activity_slide_out_to_right) : qql.b(context, R.anim.activity_slide_in_from_left, R.anim.activity_slide_out_to_left) : qql.b(context, R.anim.activity_slide_up, R.anim.activity_slide_down);
            qqlVarB.e = carRegionId;
        }
        String str2 = qqlVar.a;
        if (str2 != null) {
            qqlVarB.a = str2;
        }
        if (qqlVar.b == 1) {
            qqlVarB.b = 1;
            qqlVarB.c = qqlVar.c;
            qqlVarB.d = qqlVar.d;
        }
        qqlVarB.e = qqlVar.e;
        kgq.d(new mjc(intent, qqlVarB.a(), 3, null), "GH.ProjectionContext", yzz.PROJECTION_CONTEXT, yzy.pu, "Car no longer connected, unable to start %s", intent.toUri(0));
    }
}
