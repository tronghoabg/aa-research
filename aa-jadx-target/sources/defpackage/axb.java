package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class axb implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ axb(defpackage.axc axcVar, int i, defpackage.cux cuxVar, int i2, defpackage.cub cubVar, int i3) {
        this.f = i3;
        this.c = axcVar;
        this.a = i;
        this.d = cuxVar;
        this.b = i2;
        this.e = cubVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [cub, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int iA;
        if (this.f == 0) {
            defpackage.affg affgVar = ((defpackage.axc) this.c).b;
            defpackage.cux cuxVar = (defpackage.cux) this.d;
            ((defpackage.cuw) obj).s(cuxVar, ((defpackage.dlw) affgVar.invoke(new defpackage.dly((((long) (this.a - cuxVar.a)) << 32) | (((long) (this.b - cuxVar.b)) & 4294967295L)), this.e.p())).a, 0.0f);
            return defpackage.afbk.a;
        }
        defpackage.cuw cuwVar = (defpackage.cuw) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            defpackage.cux[] cuxVarArr = (defpackage.cux[]) this.d;
            if (i >= cuxVarArr.length) {
                return defpackage.afbk.a;
            }
            defpackage.cux cuxVar2 = cuxVarArr[i];
            int i3 = i2 + 1;
            cuxVar2.getClass();
            defpackage.awa awaVarD = defpackage.asq.D(cuxVar2);
            defpackage.aue aueVar = awaVarD != null ? awaVarD.c : null;
            int i4 = this.a;
            if (aueVar != null) {
                iA = aueVar.a(i4, cuxVar2.b, defpackage.dlz.a, cuxVar2, this.b);
            } else {
                iA = ((defpackage.awc) this.c).a.a(cuxVar2.b, i4);
            }
            cuwVar.r(cuxVar2, ((int[]) this.e)[i2], iA, 0.0f);
            i++;
            i2 = i3;
        }
    }

    public /* synthetic */ axb(defpackage.cux[] cuxVarArr, defpackage.awc awcVar, int i, int i2, int[] iArr, int i3) {
        this.f = i3;
        this.d = cuxVarArr;
        this.c = awcVar;
        this.a = i;
        this.b = i2;
        this.e = iArr;
    }
}
