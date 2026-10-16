package defpackage;

/* loaded from: classes2.dex */
class fhq extends fhv {
    protected dvf[] m;
    String n;
    int o;
    int p;

    public fhq(fhq fhqVar) {
        super(null);
        this.m = null;
        this.o = 0;
        this.n = fhqVar.n;
        int i = fhqVar.p;
        this.p = 0;
        this.m = dtd.e(fhqVar.m);
    }

    public boolean a() {
        return false;
    }

    public dvf[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(dvf[] dvfVarArr) {
        dvf[] dvfVarArr2 = this.m;
        if (dvfVarArr2 != null && dvfVarArr != null) {
            if (dvfVarArr2.length == dvfVarArr.length) {
                for (int i = 0; i < dvfVarArr2.length; i++) {
                    dvf dvfVar = dvfVarArr2[i];
                    char c = dvfVar.a;
                    dvf dvfVar2 = dvfVarArr[i];
                    if (c == dvfVar2.a && dvfVar.b.length == dvfVar2.b.length) {
                    }
                }
                dvf[] dvfVarArr3 = this.m;
                for (int i2 = 0; i2 < dvfVarArr.length; i2++) {
                    dvfVarArr3[i2].a = dvfVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = dvfVarArr[i2].b;
                        if (i3 < fArr.length) {
                            dvfVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = dtd.e(dvfVarArr);
    }

    public fhq() {
        super(null);
        this.m = null;
        this.o = 0;
    }
}
