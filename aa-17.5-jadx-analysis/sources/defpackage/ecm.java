package defpackage;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public class ecm {
    private final ecy a;
    dve[] b;
    Rect[][] c;
    Rect[][] d;

    public ecm(ecy ecyVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = ecyVar;
        h(ecyVar);
    }

    public ecy a() {
        i();
        return this.a;
    }

    public void g(int i, dve dveVar) {
        if (this.b == null) {
            this.b = new dve[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[ebi.g(i2)] = dveVar;
            }
        }
    }

    public void h(ecy ecyVar) {
        int i = 1;
        while (i <= 512) {
            ecv ecvVar = ecyVar.b;
            List<Rect> listF = ecvVar.f(i);
            int iG = ebi.g(i);
            this.c[iG] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = ecvVar.g(i);
                this.d[iG] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            } else {
                i = 8;
            }
            i += i;
        }
    }

    protected final void i() {
        dve[] dveVarArr = this.b;
        if (dveVarArr != null) {
            dve dveVarF = dveVarArr[ebi.g(1)];
            dve dveVarF2 = this.b[ebi.g(2)];
            if (dveVarF2 == null) {
                dveVarF2 = this.a.f(2);
            }
            if (dveVarF == null) {
                dveVarF = this.a.f(1);
            }
            c(dve.b(dveVarF, dveVarF2));
            dve dveVar = this.b[ebi.g(16)];
            if (dveVar != null) {
                e(dveVar);
            }
            dve dveVar2 = this.b[ebi.g(32)];
            if (dveVar2 != null) {
                d(dveVar2);
            }
            dve dveVar3 = this.b[ebi.g(64)];
            if (dveVar3 != null) {
                f(dveVar3);
            }
        }
    }

    public ecm() {
        this(new ecy((ecy) null));
    }

    public void b(dve dveVar) {
    }

    public void c(dve dveVar) {
    }

    public void d(dve dveVar) {
    }

    public void e(dve dveVar) {
    }

    public void f(dve dveVar) {
    }
}
