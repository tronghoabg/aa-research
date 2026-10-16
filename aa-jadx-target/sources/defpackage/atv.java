package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class atv implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ atv(defpackage.cux cuxVar, defpackage.ctx ctxVar, defpackage.cub cubVar, int i, int i2, defpackage.atq atqVar, int i3) {
        this.g = i3;
        this.c = cuxVar;
        this.e = ctxVar;
        this.f = cubVar;
        this.a = i;
        this.b = i2;
        this.d = atqVar;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [cub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [cub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [ctx, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int iA;
        if (this.g != 0) {
            defpackage.cfu cfuVar = ((defpackage.atq) this.d).a;
            defpackage.cuw cuwVar = (defpackage.cuw) obj;
            ?? r11 = this.f;
            defpackage.atp.d(cuwVar, (defpackage.cux) this.c, this.e, r11.p(), this.a, this.b, cfuVar);
            return defpackage.afbk.a;
        }
        defpackage.cuw cuwVar2 = (defpackage.cuw) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            defpackage.cux[] cuxVarArr = (defpackage.cux[]) this.c;
            if (i >= cuxVarArr.length) {
                return defpackage.afbk.a;
            }
            ?? r3 = this.e;
            defpackage.cux cuxVar = cuxVarArr[i];
            int i3 = i2 + 1;
            cuxVar.getClass();
            defpackage.awa awaVarD = defpackage.asq.D(cuxVar);
            defpackage.dlz dlzVarP = r3.p();
            defpackage.aue aueVar = awaVarD != null ? awaVarD.c : null;
            int i4 = this.a;
            if (aueVar != null) {
                iA = aueVar.a(i4, cuxVar.a, dlzVarP, cuxVar, this.b);
            } else {
                iA = ((defpackage.atw) this.d).a.a(cuxVar.a, i4, dlzVarP);
            }
            cuwVar2.r(cuxVar, iA, ((int[]) this.f)[i2], 0.0f);
            i++;
            i2 = i3;
        }
    }

    public /* synthetic */ atv(defpackage.cux[] cuxVarArr, defpackage.atw atwVar, int i, int i2, defpackage.cub cubVar, int[] iArr, int i3) {
        this.g = i3;
        this.c = cuxVarArr;
        this.d = atwVar;
        this.a = i;
        this.b = i2;
        this.e = cubVar;
        this.f = iArr;
    }
}
