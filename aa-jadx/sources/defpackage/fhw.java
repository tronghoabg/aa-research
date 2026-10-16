package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class fhw extends defpackage.fib {
    protected defpackage.dvm[] m;
    java.lang.String n;
    int o;
    int p;

    public fhw(defpackage.fhw fhwVar) {
        super(null);
        this.m = null;
        this.o = 0;
        this.n = fhwVar.n;
        int i = fhwVar.p;
        this.p = 0;
        this.m = defpackage.dtk.e(fhwVar.m);
    }

    public boolean a() {
        return false;
    }

    public defpackage.dvm[] getPathData() {
        return this.m;
    }

    public java.lang.String getPathName() {
        return this.n;
    }

    public void setPathData(defpackage.dvm[] dvmVarArr) {
        defpackage.dvm[] dvmVarArr2 = this.m;
        if (dvmVarArr2 != null && dvmVarArr != null) {
            if (dvmVarArr2.length == dvmVarArr.length) {
                for (int i = 0; i < dvmVarArr2.length; i++) {
                    defpackage.dvm dvmVar = dvmVarArr2[i];
                    char c = dvmVar.a;
                    defpackage.dvm dvmVar2 = dvmVarArr[i];
                    if (c == dvmVar2.a && dvmVar.b.length == dvmVar2.b.length) {
                    }
                }
                defpackage.dvm[] dvmVarArr3 = this.m;
                for (int i2 = 0; i2 < dvmVarArr.length; i2++) {
                    dvmVarArr3[i2].a = dvmVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = dvmVarArr[i2].b;
                        if (i3 < fArr.length) {
                            dvmVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = defpackage.dtk.e(dvmVarArr);
    }

    public fhw() {
        super(null);
        this.m = null;
        this.o = 0;
    }
}
