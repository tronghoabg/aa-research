package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkg implements defpackage.jkf {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.WM.LOADING.MAN");
    private static final j$.time.Duration b = defpackage.ysr.cE(2);
    private static final j$.time.Duration c = defpackage.ysr.cB(50);
    private final defpackage.jki d;
    private final android.content.Context e;
    private final defpackage.xzo f;
    private boolean k;
    private final defpackage.xzg o;
    private defpackage.jke p;
    private final android.graphics.Region g = new android.graphics.Region();
    private final android.graphics.Region h = new android.graphics.Region();
    private final java.util.HashSet i = new java.util.HashSet();
    private final android.os.Handler j = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean l = true;
    private final java.lang.Runnable m = new defpackage.ire(this, 18);
    private final java.lang.Runnable n = new defpackage.ire(this, 19);
    private final java.lang.Runnable q = new defpackage.ire(this, 20);

    public jkg(defpackage.jki jkiVar, android.content.Context context, defpackage.xzo xzoVar) {
        this.d = jkiVar;
        this.e = context;
        this.f = xzoVar;
        this.o = new defpackage.xzg(xzoVar);
    }

    private final void j(defpackage.ive iveVar) {
        android.graphics.Rect rect = iveVar.o;
        android.graphics.Rect rect2 = new android.graphics.Rect(rect.left, rect.top, (iveVar.e - rect.right) - rect.left, (iveVar.f - rect.bottom) - rect.top);
        android.graphics.Region region = this.h;
        region.set(rect2);
        if (defpackage.actb.a.fF().h()) {
            java.util.List list = iveVar.p;
            if (list.isEmpty()) {
                return;
            }
            android.graphics.Region region2 = new android.graphics.Region((android.graphics.Rect) defpackage.afga.az(list));
            ((defpackage.yqj) a.f()).u("Ignoring cutout region for the purposes of calculating loading complete.");
            region.op(region2, android.graphics.Region.Op.DIFFERENCE);
        }
    }

    private final boolean k(defpackage.jhl jhlVar) {
        defpackage.yqm yqmVar = a;
        yqmVar.l().y("Checking if %s covers the space", jhlVar.aO());
        if (!this.k || !jhlVar.aG()) {
            if (this.k) {
                yqmVar.l().y("Window %s ignored since it isn't touchable", jhlVar.F());
            }
            return false;
        }
        android.graphics.Region region = this.g;
        region.op(jhlVar.n(), android.graphics.Region.Op.UNION);
        android.graphics.Region region2 = this.h;
        if (region2.op(region, android.graphics.Region.Op.DIFFERENCE) || !this.i.isEmpty()) {
            yqmVar.l().R("Space not fully covered by %s. Covered = %s, full = %s", jhlVar.aO(), region.getBounds(), region2.getBounds());
            return false;
        }
        yqmVar.l().y("Hiding loading screen successfully due to %s", jhlVar.aO());
        i();
        return true;
    }

    @Override // defpackage.jkf
    public final void a(defpackage.ive iveVar, java.util.UUID uuid) {
        uuid.getClass();
        defpackage.ill.d();
        a.l().y("Configured to %s", iveVar);
        j(iveVar);
    }

    @Override // defpackage.jkf
    public final void b(defpackage.ive iveVar, java.util.UUID uuid, int i) {
        uuid.getClass();
        defpackage.ill.d();
        if (this.l) {
            defpackage.jki jkiVar = this.d;
            defpackage.jki.a.l().M("Initialized to %s -- %s", uuid, iveVar);
            jkiVar.e(defpackage.jki.g(iveVar), defpackage.jki.f(iveVar), uuid, false, iveVar.p);
            android.util.Size size = iveVar.m;
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
            defpackage.jkj jkjVar = new defpackage.jkj();
            jkjVar.n(jkiVar.c);
            jkjVar.l(1);
            jkjVar.m(999);
            jkjVar.d(rect);
            jkjVar.g(new jhq(new android.graphics.Rect(), new android.graphics.Rect()));
            jkjVar.e(new defpackage.jkh(jkiVar));
            jkjVar.b(uuid);
            jkjVar.f(64);
            jkjVar.d = 2;
            jkjVar.f |= 32768;
            jkjVar.e = new android.graphics.Rect();
            jkjVar.f |= 131072;
            defpackage.jhl jhlVarJ = jkiVar.b.j(jkjVar.a());
            jhlVarJ.getClass();
            jkiVar.f = jhlVarJ;
            jkiVar.c(i);
            this.l = false;
        }
    }

    @Override // defpackage.jkf
    public final void c(defpackage.jhl jhlVar) {
        defpackage.ill.d();
        java.util.HashSet hashSet = this.i;
        hashSet.remove(jhlVar);
        if (this.k && !k(jhlVar) && hashSet.isEmpty()) {
            this.j.postDelayed(this.q, b.toMillis());
        }
    }

    @Override // defpackage.jkf
    public final void d(defpackage.jhl jhlVar) {
        defpackage.ill.d();
        this.i.add(jhlVar);
    }

    @Override // defpackage.jkf
    public final void e(defpackage.jhl jhlVar) {
        defpackage.ill.d();
        if (this.k) {
            defpackage.jhl jhlVar2 = this.d.f;
            if (jhlVar2 == null || !defpackage.afga.f(jhlVar, jhlVar2)) {
                k(jhlVar);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.jkf
    public final void f(defpackage.ive iveVar, java.util.UUID uuid, defpackage.jke jkeVar) throws afbj {
        uuid.getClass();
        jkeVar.getClass();
        j$.time.Duration duration = j$.time.Duration.ZERO;
        duration.getClass();
        g(iveVar, uuid, jkeVar, duration);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.jkf
    public final void g(defpackage.ive iveVar, java.util.UUID uuid, defpackage.jke jkeVar, j$.time.Duration duration) throws afbj {
        uuid.getClass();
        jkeVar.getClass();
        duration.getClass();
        defpackage.ill.d();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.f()).R("Show for %s, screen dimens %s, trigger duration %s", jkeVar, iveVar, duration);
        if (this.l) {
            ((defpackage.yqj) yqmVar.f()).u("Can't show the loading screen before it is initialized");
            return;
        }
        j$.time.Duration duration2 = jkeVar.h;
        if (!defpackage.afga.f(duration2, j$.time.Duration.ZERO) && duration2.compareTo(duration) > 0) {
            yqmVar.l().y("Minimum trigger duration not met, not showing loading screen. Remaining: %s", duration2.minus(duration));
            return;
        }
        yqmVar.l().M("Minimum trigger duration of %s met by %s", duration2, duration);
        j(iveVar);
        this.g.setEmpty();
        this.i.clear();
        this.p = jkeVar;
        if (this.k) {
            yqmVar.l().u("Show while already showing, updating params and resetting timeouts");
            this.d.d(iveVar, uuid);
            android.os.Handler handler = this.j;
            handler.removeCallbacks(this.q);
            handler.removeCallbacks(this.m);
            handler.removeCallbacks(this.n);
        } else {
            defpackage.jki jkiVar = this.d;
            defpackage.jki.a.l().M("Show for %s -- %s", uuid, iveVar);
            jkiVar.d(iveVar, uuid);
            defpackage.jhl jhlVar = jkiVar.f;
            defpackage.jhl jhlVar2 = null;
            if (jhlVar == null) {
                defpackage.afga.d("projectionWindow");
                jhlVar = null;
            }
            if (jhlVar.aF()) {
                defpackage.jkr jkrVar = jkiVar.b;
                defpackage.jhl jhlVar3 = jkiVar.f;
                if (jhlVar3 == null) {
                    defpackage.afga.d("projectionWindow");
                    jhlVar3 = null;
                }
                ((defpackage.inh) jkrVar).ak(jhlVar3, 0);
            }
            defpackage.jhl jhlVar4 = jkiVar.f;
            if (jhlVar4 == null) {
                defpackage.afga.d("projectionWindow");
                jhlVar4 = null;
            }
            if (jhlVar4.aD()) {
                jkiVar.e = true;
            } else {
                defpackage.jkr jkrVar2 = jkiVar.b;
                defpackage.jhl jhlVar5 = jkiVar.f;
                if (jhlVar5 == null) {
                    defpackage.afga.d("projectionWindow");
                } else {
                    jhlVar2 = jhlVar5;
                }
                jkrVar2.q(jhlVar2);
            }
        }
        defpackage.xzg xzgVar = this.o;
        if (!xzgVar.a) {
            xzgVar.e();
        }
        j$.time.Duration duration3 = jkeVar.e;
        if (duration3 != null) {
            this.j.postDelayed(this.m, duration3.toMillis());
        }
        this.k = true;
    }

    @Override // defpackage.jkf
    public final void h(int i) {
        this.d.c(i);
    }

    public final void i() {
        android.os.Handler handler = this.j;
        handler.removeCallbacks(this.q);
        handler.removeCallbacks(this.m);
        defpackage.xzg xzgVar = this.o;
        j$.time.Duration durationC = xzgVar.c();
        durationC.getClass();
        defpackage.jke jkeVar = this.p;
        if (jkeVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        j$.time.Duration durationMinus = jkeVar.g.minus(durationC);
        durationMinus.getClass();
        if (durationMinus.compareTo(c) > 0) {
            a.l().y("Showing screen for remaining %s", durationMinus);
            handler.postDelayed(this.n, durationMinus.toMillis());
            return;
        }
        handler.removeCallbacks(this.n);
        xzgVar.f();
        defpackage.rqt rqtVarA = defpackage.rqt.a(this.e);
        defpackage.yzd yzdVar = defpackage.yzd.CAR_SERVICE;
        defpackage.zbe zbeVar = defpackage.zbe.PROJECTION_WINDOW_MANAGER;
        defpackage.jke jkeVar2 = this.p;
        if (jkeVar2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, jkeVar2.f);
        rrvVarH.u(durationC.toMillis());
        rqtVarA.c(rrvVarH.l());
        xzgVar.d();
        defpackage.jki jkiVar = this.d;
        defpackage.jki.a.l().u("Hiding");
        defpackage.jhl jhlVar = jkiVar.f;
        if (jhlVar == null) {
            defpackage.afga.d("projectionWindow");
            jhlVar = null;
        }
        defpackage.inh inhVar = (defpackage.inh) jkiVar.b;
        inhVar.R(jhlVar, inhVar.Y.a(inhVar.l, android.R.anim.fade_out), null, true, true, false, null);
        this.k = false;
    }
}
