package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class cnh extends cod {
    public cjs a;
    public cjs b;
    private float f;
    private float j;
    private float l;
    private boolean o;
    private cmg p;
    private final aezr q;
    private final cjm r;
    private cjm s;
    private cjm t;
    private float c = 1.0f;
    private List d = com.a;
    private float e = 1.0f;
    private int g = 0;
    private int h = 0;
    private float i = 4.0f;
    private float k = 1.0f;
    private boolean m = true;
    private boolean n = true;

    public cnh() {
        cjm cjmVar = new cjm((byte[]) null);
        this.r = cjmVar;
        this.s = cjmVar;
        this.q = woy.dH(3, new blv(15));
    }

    private final void r() {
        if (this.j == BitmapDescriptorFactory.HUE_RED && this.k == 1.0f) {
            this.s = this.r;
            return;
        }
        cjm cjmVar = this.s;
        cjm cjmVar2 = this.r;
        if (affa.f(cjmVar, cjmVar2)) {
            this.s = new cjm((byte[]) null);
        } else {
            int iA = this.s.a();
            this.s.k();
            this.s.l(iA);
        }
        s().h(cjmVar2);
        float f = s().f();
        float f2 = this.j;
        float f3 = this.l;
        float f4 = ((f2 + f3) % 1.0f) * f;
        float f5 = ((this.k + f3) % 1.0f) * f;
        if (f4 <= f5) {
            s().g(f4, f5, this.s);
            return;
        }
        cjm cjmVar3 = this.t;
        if (cjmVar3 == null) {
            cjmVar3 = new cjm((byte[]) null);
            this.t = cjmVar3;
        }
        cjmVar3.j();
        s().g(f4, f, cjmVar3);
        this.s.o(cjmVar3);
        cjmVar3.j();
        s().g(BitmapDescriptorFactory.HUE_RED, f5, cjmVar3);
        this.s.o(cjmVar3);
    }

    private final sm s() {
        return (sm) this.q.a();
    }

    public final void a(cjs cjsVar) {
        this.a = cjsVar;
        q();
    }

    @Override // defpackage.cod
    public final void c(cmd cmdVar) {
        cmd cmdVar2;
        cmg cmgVar;
        if (this.m) {
            czz.E(this.d, this.r);
            r();
        } else if (this.o) {
            r();
        }
        this.m = false;
        this.o = false;
        cjs cjsVar = this.a;
        if (cjsVar != null) {
            cmdVar2 = cmdVar;
            czz.aI(cmdVar2, this.s, cjsVar, this.c, null, 56);
        } else {
            cmdVar2 = cmdVar;
        }
        cjs cjsVar2 = this.b;
        if (cjsVar2 != null) {
            cmg cmgVar2 = this.p;
            if (this.n || cmgVar2 == null) {
                cmg cmgVar3 = new cmg(this.f, this.i, this.g, this.h, 16);
                this.p = cmgVar3;
                this.n = false;
                cmgVar = cmgVar3;
            } else {
                cmgVar = cmgVar2;
            }
            czz.aI(cmdVar2, this.s, cjsVar2, this.e, cmgVar, 48);
        }
    }

    public final void d(float f) {
        this.c = f;
        q();
    }

    public final void e(List list) {
        this.d = list;
        this.m = true;
        q();
    }

    public final void f(int i) {
        this.s.l(i);
        q();
    }

    public final void g(cjs cjsVar) {
        this.b = cjsVar;
        q();
    }

    public final void i(float f) {
        this.e = f;
        q();
    }

    public final void j(int i) {
        this.g = i;
        this.n = true;
        q();
    }

    public final void k(int i) {
        this.h = i;
        this.n = true;
        q();
    }

    public final void l(float f) {
        this.i = f;
        this.n = true;
        q();
    }

    public final void m(float f) {
        this.f = f;
        this.n = true;
        q();
    }

    public final void n(float f) {
        this.k = f;
        this.o = true;
        q();
    }

    public final void o(float f) {
        this.l = f;
        this.o = true;
        q();
    }

    public final void p(float f) {
        this.j = f;
        this.o = true;
        q();
    }

    public final String toString() {
        return this.r.toString();
    }
}
