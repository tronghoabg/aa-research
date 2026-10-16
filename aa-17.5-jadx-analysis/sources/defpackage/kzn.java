package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.display.CarRegionId;
import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class kzn implements kzl {
    public static final yph a = yph.c("GH.AssistantScrimMan");
    private static final Duration c = Duration.ofSeconds(5);
    private boolean d;
    private final Runnable e = new ily(9);
    public noh b = null;
    private final Handler f = new Handler(Looper.getMainLooper());

    public static kzn b() {
        return (kzn) mki.a.b(kzn.class, new jqw(18));
    }

    public static CarRegionId c(nsn nsnVar) {
        return nsr.c().b().r(nsnVar);
    }

    public static /* synthetic */ void e() {
        if (!kio.b().r()) {
            ((ype) a.l().ai((char) 3661)).u("Projection stopping, no need to tear down assistant activities");
            return;
        }
        ((ype) ((ype) a.h()).ai((char) 3664)).u("Assistant took too long to dismiss, tearing down the activities");
        ohs ohsVarJ = ebf.j();
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.ASSISTANT_SCRIM;
        yzy yzyVar = yzy.Lj;
        ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzyVar).l());
        kgq.d(new nrm(1), "GH.AssistantScrimMan", yzzVar, yzyVar, "Unable to tear down assistant", new Object[0]);
    }

    public static void f(CarRegionId carRegionId) throws qrz {
        mki.a.g();
        ols.E(kio.b().e(), carRegionId);
    }

    @Override // defpackage.kzl
    public final void a(yzy yzyVar) {
        ((ype) a.l().ai((char) 3658)).u("Dismissing assistant");
        kxb kxbVarC = lau.c();
        Integer num = (Integer) kxbVarC.i().e();
        kxbVarC.j(ywk.SCRIM_CLICKED);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.ASSISTANT_SCRIM, yzyVar).l());
        if (this.d) {
            return;
        }
        if (!Objects.equals(num, 2)) {
            e();
        } else {
            this.f.postDelayed(this.e, c.toMillis());
            this.d = true;
        }
    }

    public final void d() {
        if (this.b == null) {
            ((ype) a.l().ai((char) 3660)).u("No fragment, nothing to hide");
            return;
        }
        ((ype) a.l().ai((char) 3659)).u("Hiding");
        noh nohVar = this.b;
        nohVar.getClass();
        nohVar.d();
        this.b = null;
        this.f.removeCallbacks(this.e);
        this.d = false;
    }
}
