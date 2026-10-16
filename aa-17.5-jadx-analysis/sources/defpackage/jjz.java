package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import j$.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jjz implements jjy {
    public static final yph a = yph.c("CAR.WM.LOADING.MAN");
    private static final Duration b = wub.an(2);
    private static final Duration c = wub.ak(50);
    private final jkb d;
    private final Context e;
    private final xyi f;
    private boolean k;
    private final xya o;
    private jjx p;
    private final Region g = new Region();
    private final Region h = new Region();
    private final HashSet i = new HashSet();
    private final Handler j = new Handler(Looper.getMainLooper());
    private boolean l = true;
    private final Runnable m = new jgw(this, 3);
    private final Runnable n = new jgw(this, 4);
    private final Runnable q = new jgw(this, 5);

    public jjz(jkb jkbVar, Context context, xyi xyiVar) {
        this.d = jkbVar;
        this.e = context;
        this.f = xyiVar;
        this.o = new xya(xyiVar);
    }

    private final void j(iuw iuwVar) {
        Rect rect = iuwVar.o;
        Rect rect2 = new Rect(rect.left, rect.top, (iuwVar.e - rect.right) - rect.left, (iuwVar.f - rect.bottom) - rect.top);
        Region region = this.h;
        region.set(rect2);
        if (acrz.a.gu().i()) {
            List list = iuwVar.p;
            if (list.isEmpty()) {
                return;
            }
            Region region2 = new Region((Rect) woy.bF(list));
            ((ype) a.f()).u("Ignoring cutout region for the purposes of calculating loading complete.");
            region.op(region2, Region.Op.DIFFERENCE);
        }
    }

    private final boolean k(jhf jhfVar) {
        yph yphVar = a;
        yphVar.l().y("Checking if %s covers the space", jhfVar.aM());
        if (!this.k || !jhfVar.aE()) {
            if (this.k) {
                yphVar.l().y("Window %s ignored since it isn't touchable", jhfVar.E());
            }
            return false;
        }
        Region region = this.g;
        region.op(jhfVar.n(), Region.Op.UNION);
        Region region2 = this.h;
        if (region2.op(region, Region.Op.DIFFERENCE) || !this.i.isEmpty()) {
            yphVar.l().R("Space not fully covered by %s. Covered = %s, full = %s", jhfVar.aM(), region.getBounds(), region2.getBounds());
            return false;
        }
        yphVar.l().y("Hiding loading screen successfully due to %s", jhfVar.aM());
        i();
        return true;
    }

    @Override // defpackage.jjy
    public final void a(iuw iuwVar, UUID uuid) {
        uuid.getClass();
        ilb.d();
        a.l().y("Configured to %s", iuwVar);
        j(iuwVar);
    }

    @Override // defpackage.jjy
    public final void b(iuw iuwVar, UUID uuid, int i) {
        uuid.getClass();
        ilb.d();
        if (this.l) {
            jkb jkbVar = this.d;
            jkb.a.l().M("Initialized to %s -- %s", uuid, iuwVar);
            jkbVar.e(jkb.g(iuwVar), jkb.f(iuwVar), uuid, false, iuwVar.p);
            Size size = iuwVar.m;
            Rect rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            jkc jkcVar = new jkc();
            jkcVar.n(jkbVar.c);
            jkcVar.l(1);
            jkcVar.m(999);
            jkcVar.d(rect);
            jkcVar.g(new Rect());
            jkcVar.e(new jka(jkbVar));
            jkcVar.b(uuid);
            jkcVar.f(64);
            jkcVar.d = 2;
            jkcVar.f |= 32768;
            jkcVar.e = new Rect();
            jkcVar.f |= 131072;
            jhf jhfVarJ = jkbVar.b.j(jkcVar.a());
            jhfVarJ.getClass();
            jkbVar.f = jhfVarJ;
            jkbVar.c(i);
            this.l = false;
        }
    }

    @Override // defpackage.jjy
    public final void c(jhf jhfVar) {
        ilb.d();
        HashSet hashSet = this.i;
        hashSet.remove(jhfVar);
        if (this.k && !k(jhfVar) && hashSet.isEmpty()) {
            this.j.postDelayed(this.q, b.toMillis());
        }
    }

    @Override // defpackage.jjy
    public final void d(jhf jhfVar) {
        ilb.d();
        this.i.add(jhfVar);
    }

    @Override // defpackage.jjy
    public final void e(jhf jhfVar) {
        ilb.d();
        if (this.k) {
            jhf jhfVar2 = this.d.f;
            if (jhfVar2 == null || !affa.f(jhfVar, jhfVar2)) {
                k(jhfVar);
            }
        }
    }

    @Override // defpackage.jjy
    public final void f(iuw iuwVar, UUID uuid, jjx jjxVar) {
        uuid.getClass();
        jjxVar.getClass();
        Duration duration = Duration.ZERO;
        duration.getClass();
        g(iuwVar, uuid, jjxVar, duration);
    }

    @Override // defpackage.jjy
    public final void g(iuw iuwVar, UUID uuid, jjx jjxVar, Duration duration) {
        uuid.getClass();
        jjxVar.getClass();
        duration.getClass();
        ilb.d();
        yph yphVar = a;
        ((ype) yphVar.f()).R("Show for %s, screen dimens %s, trigger duration %s", jjxVar, iuwVar, duration);
        if (this.l) {
            ((ype) yphVar.f()).u("Can't show the loading screen before it is initialized");
            return;
        }
        Duration duration2 = jjxVar.h;
        if (!affa.f(duration2, Duration.ZERO) && duration2.compareTo(duration) > 0) {
            yphVar.l().y("Minimum trigger duration not met, not showing loading screen. Remaining: %s", duration2.minus(duration));
            return;
        }
        yphVar.l().M("Minimum trigger duration of %s met by %s", duration2, duration);
        j(iuwVar);
        this.g.setEmpty();
        this.i.clear();
        this.p = jjxVar;
        if (this.k) {
            yphVar.l().u("Show while already showing, updating params and resetting timeouts");
            this.d.d(iuwVar, uuid);
            Handler handler = this.j;
            handler.removeCallbacks(this.q);
            handler.removeCallbacks(this.m);
            handler.removeCallbacks(this.n);
        } else {
            jkb jkbVar = this.d;
            jkb.a.l().M("Show for %s -- %s", uuid, iuwVar);
            jkbVar.d(iuwVar, uuid);
            jhf jhfVar = jkbVar.f;
            jhf jhfVar2 = null;
            if (jhfVar == null) {
                affa.d("projectionWindow");
                jhfVar = null;
            }
            if (jhfVar.aD()) {
                jkk jkkVar = jkbVar.b;
                jhf jhfVar3 = jkbVar.f;
                if (jhfVar3 == null) {
                    affa.d("projectionWindow");
                    jhfVar3 = null;
                }
                ((ina) jkkVar).ak(jhfVar3, 0);
            }
            jhf jhfVar4 = jkbVar.f;
            if (jhfVar4 == null) {
                affa.d("projectionWindow");
                jhfVar4 = null;
            }
            if (jhfVar4.aB()) {
                jkbVar.e = true;
            } else {
                jkk jkkVar2 = jkbVar.b;
                jhf jhfVar5 = jkbVar.f;
                if (jhfVar5 == null) {
                    affa.d("projectionWindow");
                } else {
                    jhfVar2 = jhfVar5;
                }
                jkkVar2.q(jhfVar2);
            }
        }
        xya xyaVar = this.o;
        if (!xyaVar.a) {
            xyaVar.e();
        }
        Duration duration3 = jjxVar.e;
        if (duration3 != null) {
            this.j.postDelayed(this.m, duration3.toMillis());
        }
        this.k = true;
    }

    @Override // defpackage.jjy
    public final void h(int i) {
        this.d.c(i);
    }

    public final void i() {
        Handler handler = this.j;
        handler.removeCallbacks(this.q);
        handler.removeCallbacks(this.m);
        xya xyaVar = this.o;
        Duration durationC = xyaVar.c();
        durationC.getClass();
        jjx jjxVar = this.p;
        if (jjxVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Duration durationMinus = jjxVar.g.minus(durationC);
        durationMinus.getClass();
        if (durationMinus.compareTo(c) > 0) {
            a.l().y("Showing screen for remaining %s", durationMinus);
            handler.postDelayed(this.n, durationMinus.toMillis());
            return;
        }
        handler.removeCallbacks(this.n);
        xyaVar.f();
        rpz rpzVarA = rpz.a(this.e);
        yxy yxyVar = yxy.CAR_SERVICE;
        yzz yzzVar = yzz.PROJECTION_WINDOW_MANAGER;
        jjx jjxVar2 = this.p;
        if (jjxVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, jjxVar2.f);
        rrbVarH.u(durationC.toMillis());
        rpzVarA.c(rrbVarH.l());
        xyaVar.d();
        jkb jkbVar = this.d;
        jkb.a.l().u("Hiding");
        jhf jhfVar = jkbVar.f;
        if (jhfVar == null) {
            affa.d("projectionWindow");
            jhfVar = null;
        }
        ina inaVar = (ina) jkbVar.b;
        inaVar.R(jhfVar, inaVar.Y.a(inaVar.l, R.anim.fade_out), null, true, true, false, null);
        this.k = false;
    }
}
