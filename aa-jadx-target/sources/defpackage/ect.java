package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ect {
    private final defpackage.edf a;
    defpackage.dvl[] b;
    android.graphics.Rect[][] c;
    android.graphics.Rect[][] d;

    public ect(defpackage.edf edfVar) {
        this.c = new android.graphics.Rect[10][];
        this.d = new android.graphics.Rect[10][];
        this.a = edfVar;
        h(edfVar);
    }

    public defpackage.edf a() {
        i();
        return this.a;
    }

    public void g(int i, defpackage.dvl dvlVar) {
        if (this.b == null) {
            this.b = new defpackage.dvl[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[defpackage.ebq.c(i2)] = dvlVar;
            }
        }
    }

    public void h(defpackage.edf edfVar) {
        int i = 1;
        while (i <= 512) {
            defpackage.edc edcVar = edfVar.b;
            java.util.List<android.graphics.Rect> listF = edcVar.f(i);
            int iC = defpackage.ebq.c(i);
            this.c[iC] = (android.graphics.Rect[]) listF.toArray(new android.graphics.Rect[listF.size()]);
            if (i != 8) {
                java.util.List<android.graphics.Rect> listG = edcVar.g(i);
                this.d[iC] = (android.graphics.Rect[]) listG.toArray(new android.graphics.Rect[listG.size()]);
            } else {
                i = 8;
            }
            i += i;
        }
    }

    protected final void i() {
        defpackage.dvl[] dvlVarArr = this.b;
        if (dvlVarArr != null) {
            defpackage.dvl dvlVarF = dvlVarArr[defpackage.ebq.c(1)];
            defpackage.dvl dvlVarF2 = this.b[defpackage.ebq.c(2)];
            if (dvlVarF2 == null) {
                dvlVarF2 = this.a.f(2);
            }
            if (dvlVarF == null) {
                dvlVarF = this.a.f(1);
            }
            c(defpackage.dvl.b(dvlVarF, dvlVarF2));
            defpackage.dvl dvlVar = this.b[defpackage.ebq.c(16)];
            if (dvlVar != null) {
                e(dvlVar);
            }
            defpackage.dvl dvlVar2 = this.b[defpackage.ebq.c(32)];
            if (dvlVar2 != null) {
                d(dvlVar2);
            }
            defpackage.dvl dvlVar3 = this.b[defpackage.ebq.c(64)];
            if (dvlVar3 != null) {
                f(dvlVar3);
            }
        }
    }

    public ect() {
        this(new defpackage.edf((defpackage.edf) null));
    }

    public void b(defpackage.dvl dvlVar) {
    }

    public void c(defpackage.dvl dvlVar) {
    }

    public void d(defpackage.dvl dvlVar) {
    }

    public void e(defpackage.dvl dvlVar) {
    }

    public void f(defpackage.dvl dvlVar) {
    }
}
