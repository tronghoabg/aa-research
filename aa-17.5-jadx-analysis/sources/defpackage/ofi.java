package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.telecom.CallAudioState;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.projection.gearhead.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ofi extends ebf implements lhg {
    public static final yph a = yph.c("GH.CurrentCallProducer");
    public final Context b;
    public CarCall c;
    public Uri d;
    public long e;
    private final odj h;
    private int i;
    private final Set j = new HashSet();
    final ieq f = new ofg(this);
    final ieq g = new ofh(this);

    public ofi(Context context, odj odjVar) {
        this.h = odjVar;
        context.getClass();
        this.b = context;
    }

    private final void P() {
        Q();
        mlq.e().h(yzr.CALL);
    }

    private final void Q() {
        Context context = this.b;
        hrt.c(context).i(this.g);
        hrt.c(context).i(this.f);
    }

    private final void R() {
        int i;
        odo odoVarA = odn.a();
        odo odoVarA2 = odn.a();
        CarCall carCallG = odoVarA2.g();
        if (carCallG == null) {
            carCallG = null;
        } else {
            CarCall carCallH = odoVarA2.h();
            if (carCallH != null) {
                if (carCallH.e == carCallG.e && !S(carCallG) && S(carCallH)) {
                    carCallG = carCallH;
                }
            }
        }
        if (carCallG != null && !mcd.A().t(carCallG) && ogb.k()) {
            ((ype) ((ype) a.f()).ai((char) 5851)).u("Not generating dialer call notification");
            return;
        }
        if (carCallG == null || (i = carCallG.e) == 7) {
            P();
            return;
        }
        if (i == 2 && mcd.A().u() && mcd.A().t(carCallG)) {
            if (!lgv.c().v(mcd.A().b(carCallG).getPackageName())) {
                ComponentName componentNameB = mcd.A().b(carCallG);
                ((ype) ((ype) a.g()).ai((char) 5850)).y("Incoming Call - Mic permission is missing for: %s", componentNameB.getPackageName());
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.DT);
                rrbVarH.p(componentNameB);
                ohsVarJ.F(rrbVarH.l());
                mcd.A().p(this.b, componentNameB);
                return;
            }
        }
        ((ype) ((ype) a.f()).ai(5849)).w("updateNotification(%d)", carCallG.a);
        this.i = this.h.a();
        this.c = carCallG;
        kqu kquVarC = jxn.c();
        String strU = odoVarA.u(carCallG);
        Context context = this.b;
        this.d = kquVarC.b(strU, odoVarA.p(context, carCallG));
        oit.a();
        this.e = SystemClock.elapsedRealtime();
        hsq hsqVarF = hrt.c(context).b().f(this.d);
        ieq ieqVar = this.g;
        hsqVarF.q(ieqVar);
        if (ieqVar.c.l()) {
            return;
        }
        hrt.c(context).b().f(jxn.c().a(odoVarA.u(carCallG), odoVarA.p(context, carCallG))).q(this.f);
    }

    private static final boolean S(CarCall carCall) {
        moa moaVarA = mlq.e().a(yzr.CALL, carCall.a);
        return moaVarA != null && moaVarA.T();
    }

    public final void O(Bitmap bitmap) {
        moa moaVarA;
        CarCall carCall = this.c;
        odo odoVarA = odn.a();
        long j = carCall.f.d;
        String strU = odn.a().u(carCall);
        if (strU == null) {
            strU = "";
        }
        ComponentName componentNameB = mcd.A().b(carCall);
        Context context = this.b;
        String packageName = context.getPackageName();
        if (mcd.A().t(carCall)) {
            packageName = componentNameB.getPackageName();
        }
        ohj ohjVar = new ohj();
        ohjVar.h = carCall.a;
        ohjVar.i = packageName;
        ohjVar.m = j;
        ohjVar.n = Alert.DURATION_SHOW_INDEFINITELY;
        ohjVar.s = odoVarA.p(context, carCall);
        ohjVar.b = odoVarA.m(context, strU);
        int i = carCall.e;
        ohjVar.a = i;
        ohjVar.w = context.getColor(R.color.dialer_action_bar);
        ohjVar.d(bitmap);
        ohjVar.y = R.drawable.ic_phone_vector;
        ohjVar.C = new oes(carCall);
        ohjVar.c = componentNameB;
        ohjVar.o = odn.a().F(i);
        ohk ohkVar = new ohk(ohjVar);
        if (jri.a() && (moaVarA = mlq.e().a(yzr.CALL, ohkVar.a())) != null && moaVarA.T() && !ohkVar.r) {
            mlq.e().g(moaVarA);
        }
        if (mjv.C().g(this.c)) {
            return;
        }
        ((ype) ((ype) a.f()).ai(5846)).w("post notification. id=%d", this.c.a);
        mlq.e().j(ohkVar);
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) ((ype) a.f()).ai((char) 5847)).u("onStart");
        this.h.D(this);
        R();
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) ((ype) a.f()).ai((char) 5848)).u("onStop");
        this.h.E(this);
        Q();
        this.j.clear();
    }

    @Override // defpackage.ebf
    public final void m(CallAudioState callAudioState) {
        if (this.i == callAudioState.getRoute()) {
            ((ype) ((ype) a.f()).ai(5839)).B("AudioState changed. No update needed: %#X(%#X)", callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
        } else {
            ((ype) ((ype) a.f()).ai(5838)).B("AudioState changed. New route: %#X(%#X)", callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
            R();
        }
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        ((ype) ((ype) a.f()).ai(5840)).w("onCallAdded(%d)", carCall.a);
        R();
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        ((ype) ((ype) a.f()).ai(5841)).w("onCallRemoved(%d)", carCall.a);
        P();
        R();
    }

    @Override // defpackage.ebf
    public final void r(CarCall carCall, List list) {
        R();
    }

    @Override // defpackage.ebf
    public final void u(CarCall carCall, CarCall.Details details) {
        ((ype) ((ype) a.f()).ai(5843)).w("onDetailsChanged(%d)", carCall.a);
        R();
    }

    @Override // defpackage.ebf
    public final void v(CarCall carCall, CarCall carCall2) {
        R();
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) {
        ((ype) ((ype) a.f()).ai(5845)).B("onStateChanged(%d). New state: %d", carCall.a, i);
        R();
    }
}
