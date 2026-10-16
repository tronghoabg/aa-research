package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cva implements defpackage.cuz {
    private final defpackage.cvq a;
    private final defpackage.csv b;
    private final defpackage.cvq c;
    private final defpackage.csv d;
    private final /* synthetic */ int e;
    private final java.lang.Object f;

    public cva(defpackage.cuz[] cuzVarArr, int i) {
        this.e = i;
        this.f = cuzVarArr;
        int length = cuzVarArr.length;
        defpackage.cvq[] cvqVarArr = new defpackage.cvq[length];
        for (int i2 = 0; i2 < length; i2++) {
            cvqVarArr[i2] = ((defpackage.cuz[]) this.f)[i2].c();
        }
        this.a = new defpackage.cvq(new defpackage.cvi(cvqVarArr, 5));
        int length2 = ((defpackage.cuz[]) this.f).length;
        defpackage.csv[] csvVarArr = new defpackage.csv[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            csvVarArr[i3] = ((defpackage.cuz[]) this.f)[i3].b();
        }
        this.b = new defpackage.csv(new defpackage.cvi(csvVarArr, 1));
        int length3 = ((defpackage.cuz[]) this.f).length;
        defpackage.cvq[] cvqVarArr2 = new defpackage.cvq[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            cvqVarArr2[i4] = ((defpackage.cuz[]) this.f)[i4].d();
        }
        this.c = new defpackage.cvq(new defpackage.cvi(cvqVarArr2, 4));
        int length4 = ((defpackage.cuz[]) this.f).length;
        defpackage.csv[] csvVarArr2 = new defpackage.csv[length4];
        for (int i5 = 0; i5 < length4; i5++) {
            csvVarArr2[i5] = ((defpackage.cuz[]) this.f)[i5].a();
        }
        this.d = new defpackage.csv(new defpackage.amc(csvVarArr2, 20));
    }

    @Override // defpackage.cuz
    public final defpackage.csv a() {
        return this.d;
    }

    @Override // defpackage.cuz
    public final defpackage.csv b() {
        return this.b;
    }

    @Override // defpackage.cuz
    public final defpackage.cvq c() {
        return this.a;
    }

    @Override // defpackage.cuz
    public final defpackage.cvq d() {
        return this.c;
    }

    public final java.lang.String toString() {
        int i = this.e;
        java.lang.Object obj = this.f;
        if (i != 0) {
            return defpackage.afga.cs((java.lang.Object[]) obj, null, "innermostOf(", ")", null, 57);
        }
        return "RectRulers(" + ((java.lang.String) obj) + ")";
    }

    public cva(java.lang.String str, int i) {
        this.e = i;
        this.f = str;
        this.a = new defpackage.cvq(null);
        this.b = new defpackage.csv(null);
        this.c = new defpackage.cvq(null);
        this.d = new defpackage.csv(null);
    }
}
