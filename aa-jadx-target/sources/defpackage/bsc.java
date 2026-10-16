package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bsc implements defpackage.affg {
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bsc(long j, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.d = i;
        this.a = j;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [cld, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [cld, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [affh, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.d;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (bveVar.I(i2 != 2, iIntValue & 1)) {
                defpackage.dai.aC(this.a, defpackage.bxi.p(bveVar).m, defpackage.dai.as(1921972184, true, new defpackage.bmg(this.b, this.c, 7), bveVar), bveVar, 384);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.bve bveVar2 = (defpackage.bve) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                defpackage.dai.aC(this.a, (defpackage.dgd) this.b, defpackage.dai.as(-1767363041, true, new defpackage.bmc(this.c, 6), bveVar2), bveVar2, 384);
            } else {
                bveVar2.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            return defpackage.mcl.j(this.c, this.a, this.b, (defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
        }
        if (i == 3) {
            return defpackage.mcl.j(this.c, this.a, this.b, (defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
        }
        defpackage.bve bveVar3 = (defpackage.bve) obj;
        int iIntValue3 = ((java.lang.Integer) obj2).intValue();
        int i3 = iIntValue3 & 3;
        int i4 = iIntValue3 & 1;
        defpackage.yqm yqmVar = defpackage.myx.a;
        if (bveVar3.I(i3 != 2, i4)) {
            this.c.invoke(new mzn(this.a, (mxn) this.b), bveVar3, 0);
        } else {
            bveVar3.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bsc(defpackage.affh affhVar, long j, java.lang.Object obj, int i) {
        this.d = i;
        this.c = affhVar;
        this.a = j;
        this.b = obj;
    }
}
