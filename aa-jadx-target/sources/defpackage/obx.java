package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class obx implements defpackage.affc {
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ obx(defpackage.afgv afgvVar, float f, defpackage.aeg aegVar, defpackage.aek aekVar, defpackage.affc affcVar, int i) {
        this.f = i;
        this.e = afgvVar;
        this.a = f;
        this.b = aegVar;
        this.c = aekVar;
        this.d = affcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.afau afauVar;
        defpackage.afau afauVar2;
        if (this.f != 0) {
            long jLongValue = ((java.lang.Long) obj).longValue();
            java.lang.Object obj2 = ((defpackage.afgv) this.e).a;
            obj2.getClass();
            defpackage.afw.g((defpackage.aei) obj2, jLongValue, this.a, this.b, (defpackage.aek) this.c, this.d);
            return defpackage.afbk.a;
        }
        defpackage.cuw cuwVar = (defpackage.cuw) obj;
        cuwVar.getClass();
        ?? r0 = this.b;
        java.lang.Object obj3 = this.e;
        float f = this.a;
        java.lang.Object obj4 = this.d;
        java.lang.Object obj5 = this.c;
        if (r0.p() == defpackage.dlz.b) {
            if (obj5 != null) {
                afauVar2 = new defpackage.afau(java.lang.Integer.valueOf(defpackage.afhi.k(((defpackage.cux) obj5).a * 0.8f)), obj5);
            } else {
                afauVar2 = obj4 != null ? new defpackage.afau(java.lang.Integer.valueOf(((defpackage.cux) obj4).a + defpackage.afhi.k(f)), obj4) : new defpackage.afau(0, null);
            }
            int iIntValue = ((java.lang.Number) afauVar2.a).intValue();
            defpackage.cux cuxVar = (defpackage.cux) afauVar2.b;
            defpackage.cux cuxVar2 = (defpackage.cux) obj3;
            cuwVar.r(cuxVar2, iIntValue, 0, 0.0f);
            if (cuxVar != null) {
                defpackage.ocb.f(cuwVar, cuxVar, cuxVar2.b, 0);
            }
        } else {
            defpackage.cux cuxVar3 = (defpackage.cux) obj3;
            cuwVar.r(cuxVar3, 0, 0, 0.0f);
            if (obj5 != null) {
                afauVar = new defpackage.afau(java.lang.Integer.valueOf(defpackage.afhi.k(cuxVar3.a - (((defpackage.cux) obj5).a * 0.2f))), obj5);
            } else {
                afauVar = obj4 != null ? new defpackage.afau(java.lang.Integer.valueOf(cuxVar3.a + defpackage.afhi.k(f)), obj4) : new defpackage.afau(0, null);
            }
            int iIntValue2 = ((java.lang.Number) afauVar.a).intValue();
            defpackage.cux cuxVar4 = (defpackage.cux) afauVar.b;
            if (cuxVar4 != null) {
                defpackage.ocb.f(cuwVar, cuxVar4, cuxVar3.b, iIntValue2);
            }
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ obx(defpackage.cub cubVar, defpackage.cux cuxVar, defpackage.cux cuxVar2, float f, defpackage.cux cuxVar3, int i) {
        this.f = i;
        this.b = cubVar;
        this.c = cuxVar;
        this.d = cuxVar2;
        this.a = f;
        this.e = cuxVar3;
    }
}
