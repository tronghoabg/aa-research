package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dqi {
    public defpackage.dqv a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public final java.util.HashMap r;
    defpackage.dpm s;

    public dqi(defpackage.dqi dqiVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new java.util.HashMap();
        this.a = dqiVar.a;
        this.b = dqiVar.b;
        this.c = dqiVar.c;
        this.d = dqiVar.d;
        this.e = dqiVar.e;
        a(dqiVar);
    }

    public final void a(defpackage.dqi dqiVar) {
        if (dqiVar == null) {
            return;
        }
        this.f = dqiVar.f;
        this.g = dqiVar.g;
        this.h = dqiVar.h;
        this.i = dqiVar.i;
        this.j = dqiVar.j;
        this.k = dqiVar.k;
        this.l = dqiVar.l;
        this.m = dqiVar.m;
        this.n = dqiVar.n;
        this.o = dqiVar.o;
        this.p = dqiVar.p;
        this.q = dqiVar.q;
        this.s = dqiVar.s;
        java.util.HashMap map = this.r;
        map.clear();
        for (defpackage.dpk dpkVar : dqiVar.r.values()) {
            map.put(dpkVar.a, new defpackage.dpk(dpkVar));
        }
    }

    public dqi() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new java.util.HashMap();
    }

    public dqi(defpackage.dqv dqvVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new java.util.HashMap();
        this.a = dqvVar;
    }
}
