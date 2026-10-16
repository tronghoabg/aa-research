package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class lnb implements lkc {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaModel");
    final defpackage.lke b;
    public final java.util.List c = new java.util.concurrent.CopyOnWriteArrayList();
    public android.content.Intent d;
    public los e;
    public defpackage.lmk f;
    public com.google.android.apps.auto.components.media.compat.AaPlaybackState g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final defpackage.eqs k;
    private final defpackage.eqs l;
    private final defpackage.eqp m;
    private final lna n;
    private final defpackage.eqp o;
    private final lna p;
    private final ljy q;
    private final ljy r;

    public lnb() {
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        this.h = false;
        this.i = false;
        this.j = false;
        defpackage.eqs eqsVar = new defpackage.eqs(null);
        this.l = eqsVar;
        this.k = new defpackage.eqs(new defpackage.lmw());
        this.m = defpackage.tcu.C(eqsVar, new defpackage.llk(16));
        this.n = new defpackage.lmy(this, defpackage.ler.c());
        defpackage.eqp eqpVarC = defpackage.tcu.C(eqsVar, new defpackage.llk(17));
        this.o = eqpVarC;
        this.p = new defpackage.lmz(this, defpackage.ler.c());
        defpackage.ebo.g(eqpVarC, new defpackage.llk(18));
        this.q = new defpackage.lmv(this, 1);
        this.r = new defpackage.lmv(this, 0);
        defpackage.lkd lkdVarA = defpackage.lke.a();
        lkdVarA.d(defpackage.kzi.r().b());
        this.b = lkdVarA.a();
    }

    private final void m(android.content.ComponentName componentName) {
        if (!defpackage.adae.p()) {
            this.d = null;
        }
        this.e = null;
        this.g = null;
        this.f = null;
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        this.h = false;
        this.k.m(new defpackage.lmw());
        this.l.m(componentName);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final defpackage.lke a() throws wfo {
        defpackage.wfp.c();
        return (defpackage.lke) new defpackage.nub((defpackage.lke) defpackage.sqs.aJ(this.e, new defpackage.lmd(7))).i(this.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final defpackage.lmk b() throws wfo {
        defpackage.wfp.c();
        return this.f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final com.google.android.apps.auto.components.media.compat.AaPlaybackState c() throws wfo {
        defpackage.wfp.c();
        return this.g;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void d(lkb lkbVar) throws wfo {
        defpackage.wfp.c();
        this.c.add(lkbVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void e(lkb lkbVar) throws wfo {
        defpackage.wfp.c();
        this.c.remove(lkbVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void f() throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) a.l().ai((char) 4017)).u("start()");
        defpackage.kzi.r().e(this.q);
        defpackage.kzi.r().e(this.r);
        this.o.eM(defpackage.ler.c(), this.p);
        this.m.eM(defpackage.ler.c(), this.n);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void g() throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) a.l().ai((char) 4018)).u("stop()");
        this.c.clear();
        defpackage.kzi.r().g(this.q);
        defpackage.kzi.r().g(this.r);
        defpackage.eqp eqpVar = this.o;
        lna lnaVar = this.p;
        eqpVar.k(lnaVar);
        lnaVar.b();
        defpackage.eqp eqpVar2 = this.m;
        lna lnaVar2 = this.n;
        eqpVar2.k(lnaVar2);
        lnaVar2.b();
        m(null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean h() throws wfo {
        defpackage.wfp.c();
        return this.e instanceof lok;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean i(java.lang.String str) throws wfo {
        defpackage.wfp.c();
        lok lokVar = this.e;
        if (lokVar instanceof lok) {
            return lokVar.a().getBoolean(str, false);
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final ohy j() throws wfo {
        defpackage.wfp.c();
        lok lokVar = this.e;
        if (lokVar instanceof lok) {
            return lokVar.i;
        }
        return null;
    }

    protected void k(android.content.ComponentName componentName) {
        l(componentName);
    }

    public final void l(android.content.ComponentName componentName) {
        ((defpackage.yqj) a.l().ai((char) 4019)).y("onMediaAppChanged %s", componentName);
        android.content.ComponentName componentName2 = (android.content.ComponentName) defpackage.sqs.aJ(a(), new defpackage.lmd(6));
        if (j$.util.Objects.equals(componentName2, componentName)) {
            return;
        }
        this.j = false;
        this.i = true;
        m(componentName);
        java.util.List list = this.c;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lkb) it.next()).a(componentName2, componentName);
        }
        this.i = false;
        ljy ljyVar = this.r;
        defpackage.kzi.r().g(ljyVar);
        defpackage.kzi.r().e(ljyVar);
        if (!h() || this.j) {
            return;
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((lkb) it2.next()).b();
        }
        this.j = true;
    }
}
