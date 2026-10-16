package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nht implements defpackage.affg {
    public final /* synthetic */ defpackage.nkp a;
    public final /* synthetic */ defpackage.nkj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ defpackage.bwx e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object j;
    public final /* synthetic */ java.lang.Object k;
    private final /* synthetic */ int l;

    public /* synthetic */ nht(defpackage.nkp nkpVar, defpackage.nkj nkjVar, boolean z, boolean z2, defpackage.affc affcVar, java.util.Map map, defpackage.bwx bwxVar, defpackage.afer aferVar, boolean z3, boolean z4, boolean z5, int i) {
        this.l = i;
        this.a = nkpVar;
        this.b = nkjVar;
        this.c = z;
        this.d = z2;
        this.k = affcVar;
        this.i = map;
        this.e = bwxVar;
        this.j = aferVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [afer, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.l != 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i = iIntValue & 3;
            int i2 = iIntValue & 1;
            defpackage.yqm yqmVar = defpackage.nif.a;
            if (bveVar.I(i != 2, i2)) {
                boolean z = this.h;
                boolean z2 = this.g;
                boolean z3 = this.f;
                ?? r14 = this.j;
                defpackage.bwx bwxVar = this.e;
                ?? r12 = this.i;
                ?? r5 = this.k;
                boolean z4 = this.d;
                boolean z5 = this.c;
                defpackage.nkj nkjVar = this.b;
                defpackage.nkp nkpVar = this.a;
                defpackage.lhe lheVar = (defpackage.lhe) r5.invoke(defpackage.nmu.e);
                defpackage.cgf cgfVarB = defpackage.awj.b(defpackage.cgf.e, 1.0f);
                defpackage.yqm yqmVar2 = defpackage.nkp.a;
                defpackage.nif.m(nkpVar, nkjVar, z5, z4, lheVar, cgfVarB, r12, bwxVar, r14, z3, z2, z, bveVar, 229448, 0);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        int i3 = iIntValue2 & 3;
        int i4 = iIntValue2 & 1;
        defpackage.yqm yqmVar3 = defpackage.nif.a;
        if (bveVar2.I(i3 != 2, i4)) {
            boolean z6 = this.h;
            boolean z7 = this.g;
            boolean z8 = this.f;
            ?? r9 = this.k;
            defpackage.bwx bwxVar2 = this.e;
            ?? r7 = this.j;
            java.lang.Object obj3 = this.i;
            boolean z9 = this.d;
            boolean z10 = this.c;
            defpackage.nkj nkjVar2 = this.b;
            defpackage.nkp nkpVar2 = this.a;
            defpackage.cgf cgfVarB2 = defpackage.awj.b(defpackage.cgf.e, 1.0f);
            defpackage.yqm yqmVar4 = defpackage.nkp.a;
            defpackage.nke nkeVar = defpackage.nkj.a;
            defpackage.nif.l(nkpVar2, nkjVar2, z10, z9, (defpackage.lhe) obj3, cgfVarB2, r7, bwxVar2, r9, z8, z7, z6, bveVar2, 229448, 0);
        } else {
            bveVar2.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ nht(defpackage.nkp nkpVar, defpackage.nkj nkjVar, boolean z, boolean z2, defpackage.lhe lheVar, java.util.Map map, defpackage.bwx bwxVar, defpackage.afer aferVar, boolean z3, boolean z4, boolean z5, int i) {
        this.l = i;
        this.a = nkpVar;
        this.b = nkjVar;
        this.c = z;
        this.d = z2;
        this.i = lheVar;
        this.j = map;
        this.e = bwxVar;
        this.k = aferVar;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }
}
