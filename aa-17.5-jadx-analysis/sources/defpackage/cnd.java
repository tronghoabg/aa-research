package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cnd extends cod {
    public final List a = new ArrayList();
    public boolean b = true;
    public long c;
    public afec d;
    private float[] e;
    private List f;
    private boolean g;
    private final afec h;
    private String i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private cjm r;

    public cnd() {
        float[] fArr = clj.a;
        this.c = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        this.f = com.a;
        this.g = true;
        this.h = new cep(this, 8);
        this.i = "";
        this.m = 1.0f;
        this.n = 1.0f;
        this.q = true;
    }

    private final void r() {
        this.b = false;
        float[] fArr = clj.a;
        this.c = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
    }

    private final void s(cjs cjsVar) {
        if (this.b && cjsVar != null) {
            if (cjsVar instanceof ckx) {
                t(((ckx) cjsVar).a);
            } else {
                r();
            }
        }
    }

    private final void t(long j) {
        if (this.b && j != 16) {
            long j2 = this.c;
            if (j2 == 16) {
                this.c = j;
            } else {
                if (cjv.d(j2) == cjv.d(j) && cjv.c(j2) == cjv.c(j) && cjv.b(j2) == cjv.b(j)) {
                    return;
                }
                r();
            }
        }
    }

    private final boolean u() {
        return !this.f.isEmpty();
    }

    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.cod
    public final afec b() {
        return this.d;
    }

    @Override // defpackage.cod
    public final void c(cmd cmdVar) {
        if (this.q) {
            float[] fArrE = this.e;
            if (fArrE == null) {
                fArrE = cki.e();
                this.e = fArrE;
            } else {
                cki.c(fArrE);
            }
            cki.g(fArrE, this.o + this.k, this.p + this.l);
            double d = this.j * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = fArrE[0];
            float f2 = fArrE[4];
            float f3 = -fSin;
            float f4 = fArrE[1];
            float f5 = fArrE[5];
            float f6 = fArrE[2];
            float f7 = fArrE[6];
            float f8 = fArrE[3];
            float f9 = fArrE[7];
            fArrE[0] = (fCos * f) + (fSin * f2);
            fArrE[1] = (fCos * f4) + (fSin * f5);
            fArrE[2] = (fCos * f6) + (fSin * f7);
            fArrE[3] = (fCos * f8) + (fSin * f9);
            fArrE[4] = (f * f3) + (f2 * fCos);
            fArrE[5] = (f4 * f3) + (f5 * fCos);
            fArrE[6] = (f6 * f3) + (f7 * fCos);
            fArrE[7] = (f3 * f8) + (fCos * f9);
            cki.f(fArrE, this.m, this.n);
            cki.g(fArrE, -this.k, -this.l);
            this.q = false;
        }
        if (this.g) {
            if (u()) {
                cjm cjmVar = this.r;
                if (cjmVar == null) {
                    cjmVar = new cjm((byte[]) null);
                    this.r = cjmVar;
                }
                czz.E(this.f, cjmVar);
            }
            this.g = false;
        }
        cma cmaVarR = cmdVar.r();
        long jA = cmaVarR.a();
        cmaVarR.b().g();
        try {
            izj izjVar = cmaVarR.c;
            float[] fArr = this.e;
            if (fArr != null) {
                ((cma) izjVar.a).b().b(new cki(fArr).a);
            }
            cjm cjmVar2 = this.r;
            if (u() && cjmVar2 != null) {
                izjVar.m(cjmVar2);
            }
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((cod) list.get(i)).c(cmdVar);
            }
        } finally {
            cmaVarR.b().e();
            cmaVarR.h(jA);
        }
    }

    public final void d(int i, cod codVar) {
        int iA = a();
        List list = this.a;
        if (i < iA) {
            list.set(i, codVar);
        } else {
            list.add(codVar);
        }
        e(codVar);
        codVar.h(this.h);
        q();
    }

    public final void e(cod codVar) {
        if (codVar instanceof cnh) {
            cnh cnhVar = (cnh) codVar;
            s(cnhVar.a);
            s(cnhVar.b);
        } else if (codVar instanceof cnd) {
            cnd cndVar = (cnd) codVar;
            if (cndVar.b && this.b) {
                t(cndVar.c);
            } else {
                r();
            }
        }
    }

    public final void f(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            List list = this.a;
            if (i < list.size()) {
                ((cod) list.get(i)).h(null);
                list.remove(i);
            }
        }
        q();
    }

    public final void g(List list) {
        this.f = list;
        this.g = true;
        q();
    }

    @Override // defpackage.cod
    public final void h(afec afecVar) {
        this.d = afecVar;
    }

    public final void i(String str) {
        this.i = str;
        q();
    }

    public final void j(float f) {
        this.k = f;
        this.q = true;
        q();
    }

    public final void k(float f) {
        this.l = f;
        this.q = true;
        q();
    }

    public final void l(float f) {
        this.j = f;
        this.q = true;
        q();
    }

    public final void m(float f) {
        this.m = f;
        this.q = true;
        q();
    }

    public final void n(float f) {
        this.n = f;
        this.q = true;
        q();
    }

    public final void o(float f) {
        this.o = f;
        this.q = true;
        q();
    }

    public final void p(float f) {
        this.p = f;
        this.q = true;
        q();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.i);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cod codVar = (cod) list.get(i);
            sb.append("\t");
            sb.append(codVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
