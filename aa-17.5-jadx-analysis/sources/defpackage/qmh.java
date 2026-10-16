package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class qmh {
    public static volatile qmh a;
    public final Context b;
    public final Context c;
    public final qmu d;
    public final qnd e;
    public final qmx f;
    public final qnh g;
    public final qmc h;
    public final qmn i;
    public final qmw j;
    public final spk k;
    private final qlk l;
    private final qmd m;
    private final qni n;
    private final qla o;
    private final qms p;

    public qmh(rjg rjgVar) {
        Object obj = rjgVar.b;
        spu.ax(obj, "Application context can't be null");
        Object obj2 = rjgVar.a;
        spu.aw(obj2);
        this.b = (Context) obj;
        this.c = (Context) obj2;
        this.k = spk.a;
        this.d = new qmu(this);
        qnd qndVar = new qnd(this);
        qndVar.t();
        this.e = qndVar;
        e().p(4, a.bq(qmg.a, "Google Analytics ", " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4"), null, null, null);
        qnh qnhVar = new qnh(this);
        qnhVar.t();
        this.g = qnhVar;
        qni qniVar = new qni(this);
        qniVar.t();
        this.n = qniVar;
        qmd qmdVar = new qmd(this);
        qms qmsVar = new qms(this);
        qmc qmcVar = new qmc(this);
        qmn qmnVar = new qmn(this);
        qmw qmwVar = new qmw(this);
        spu.aw(obj);
        if (qlk.a == null) {
            synchronized (qlk.class) {
                if (qlk.a == null) {
                    qlk.a = new qlk((Context) obj);
                }
            }
        }
        qlk qlkVar = qlk.a;
        qlkVar.f = new advf(this, 1);
        this.l = qlkVar;
        qla qlaVar = new qla(this);
        qmsVar.t();
        this.p = qmsVar;
        qmcVar.t();
        this.h = qmcVar;
        qmnVar.t();
        this.i = qmnVar;
        qmwVar.t();
        this.j = qmwVar;
        qmx qmxVar = new qmx(this);
        qmxVar.t();
        this.f = qmxVar;
        qmdVar.t();
        this.m = qmdVar;
        qni qniVarF = qlaVar.a.f();
        qniVarF.s();
        qniVarF.s();
        if (qniVarF.f) {
            qniVarF.s();
            qlaVar.e = qniVarF.g;
        }
        qniVarF.s();
        qlaVar.d = true;
        this.o = qlaVar;
        qmq qmqVar = qmdVar.a;
        qmqVar.s();
        spu.as(!qmqVar.a, "Analytics backend already started");
        qmqVar.a = true;
        qmqVar.g().c(new qjv(qmqVar, 6, null));
    }

    public static final void g(qmf qmfVar) {
        spu.ax(qmfVar, "Analytics service not created/initialized");
        spu.an(qmfVar.u(), "Analytics service not initialized");
    }

    public final qla a() {
        qla qlaVar = this.o;
        spu.aw(qlaVar);
        spu.an(qlaVar.d, "Analytics instance not initialized");
        return qlaVar;
    }

    public final qlk b() {
        qlk qlkVar = this.l;
        spu.aw(qlkVar);
        return qlkVar;
    }

    public final qmd c() {
        qmd qmdVar = this.m;
        g(qmdVar);
        return qmdVar;
    }

    public final qms d() {
        qms qmsVar = this.p;
        g(qmsVar);
        return qmsVar;
    }

    public final qnd e() {
        qnd qndVar = this.e;
        g(qndVar);
        return qndVar;
    }

    public final qni f() {
        qni qniVar = this.n;
        g(qniVar);
        return qniVar;
    }
}
