package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class dqa {
    public dqn a;
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
    public final HashMap r;
    dpe s;

    public dqa(dqa dqaVar) {
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
        this.r = new HashMap();
        this.a = dqaVar.a;
        this.b = dqaVar.b;
        this.c = dqaVar.c;
        this.d = dqaVar.d;
        this.e = dqaVar.e;
        a(dqaVar);
    }

    public final void a(dqa dqaVar) {
        if (dqaVar == null) {
            return;
        }
        this.f = dqaVar.f;
        this.g = dqaVar.g;
        this.h = dqaVar.h;
        this.i = dqaVar.i;
        this.j = dqaVar.j;
        this.k = dqaVar.k;
        this.l = dqaVar.l;
        this.m = dqaVar.m;
        this.n = dqaVar.n;
        this.o = dqaVar.o;
        this.p = dqaVar.p;
        this.q = dqaVar.q;
        this.s = dqaVar.s;
        HashMap map = this.r;
        map.clear();
        for (dpc dpcVar : dqaVar.r.values()) {
            map.put(dpcVar.a, new dpc(dpcVar));
        }
    }

    public dqa() {
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
        this.r = new HashMap();
    }

    public dqa(dqn dqnVar) {
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
        this.r = new HashMap();
        this.a = dqnVar;
    }
}
