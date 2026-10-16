package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gio implements hem {
    public final geu a;
    public final boolean b;
    public boolean c;
    private final long d;
    private final Handler e;
    private boolean f;
    private final Runnable g;
    private Runnable h;
    private wb i;

    public gio(geu geuVar) {
        this.a = geuVar;
        this.b = ((ggk) geuVar.F(ggk.class)).h() && !((jwq) geuVar).c.e();
        this.d = ((ggk) geuVar.F(ggk.class)).a();
        this.e = new Handler(Looper.getMainLooper());
        this.c = true;
        this.g = new elt(this, 17);
        ahnc.d(dty.f(((jwq) geuVar).a.a()), null, 0, new gfw(this, (afck) null, 2), 3);
    }

    private final void d() {
        this.e.removeCallbacks(this.g);
        this.f = false;
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        this.h = null;
    }

    public final void a() {
        this.e.removeCallbacks(this.g);
        this.f = false;
        this.h = null;
    }

    public final synchronized void b() {
        this.f = false;
        Runnable runnable = this.h;
        if (runnable != null) {
            geu geuVar = this.a;
            ((jwq) geuVar).d.d(gnr.a(25));
            c(new elt(runnable, 18), this.i);
        }
    }

    public final boolean c(Runnable runnable, wb wbVar) {
        this.i = wbVar;
        this.h = runnable;
        if (wbVar == null) {
            d();
            return true;
        }
        Map map = ghs.a;
        boolean z = this.b;
        ghr ghrVarA = ghs.a(wbVar);
        if (!z || this.c || !ghrVarA.a || ghrVarA.b) {
            d();
            return true;
        }
        if (!this.f) {
            d();
            this.e.postDelayed(this.g, this.d);
            this.f = true;
            return true;
        }
        gks.k("CarApp.H.Dis", "Delaying template update for %s\nReason: too many refreshes in a short span of time.", wbVar.getClass().getName());
        geu geuVar = this.a;
        gnq gnqVarA = gnr.a(10);
        jwq jwqVar = (jwq) geuVar;
        gnqVarA.a(((gmh) jwqVar.c).a);
        gnqVarA.b(wbVar.getClass().getSimpleName());
        jwqVar.d.d(gnqVarA);
        return false;
    }
}
