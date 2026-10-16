package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bdt extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdt(defpackage.bcf bcfVar, defpackage.dkd dkdVar, defpackage.beg begVar, defpackage.bfi bfiVar, defpackage.djv djvVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.g = i;
        this.f = bcfVar;
        this.b = dkdVar;
        this.c = begVar;
        this.d = bfiVar;
        this.e = djvVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [djv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bys, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.g;
        java.lang.Object obj2 = this.f;
        if (i != 0) {
            ?? r3 = this.d;
            java.lang.Object obj3 = this.b;
            return new defpackage.bdt((defpackage.beg) obj2, (defpackage.bys) r3, (defpackage.fbl) obj3, (defpackage.blw) this.c, (defpackage.djl) this.e, afdkVar, 1);
        }
        java.lang.Object obj4 = this.b;
        java.lang.Object obj5 = this.c;
        return new defpackage.bdt((defpackage.bcf) obj2, (defpackage.dkd) obj4, (defpackage.beg) obj5, (defpackage.bfi) this.d, (defpackage.djv) this.e, afdkVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [afbk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [djv, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.cjj cjjVarL;
        if (this.g != 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            try {
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    aiza aizaVar = new aiza(new defpackage.byr(new defpackage.bav(this.d, 17), null));
                    java.lang.Object obj2 = this.f;
                    java.lang.Object obj3 = this.b;
                    defpackage.bdr bdrVar = new defpackage.bdr((defpackage.beg) obj2, (defpackage.fbl) obj3, (defpackage.blw) this.c, (defpackage.djl) this.e, 0);
                    this.a = 1;
                    if (aizaVar.hd(bdrVar, this) == afdrVar) {
                        return afdrVar;
                    }
                }
                defpackage.asq.ai((defpackage.beg) this.f);
                this = defpackage.afbk.a;
                return this;
            } catch (java.lang.Throwable th) {
                defpackage.asq.ai((defpackage.beg) this.f);
                throw th;
            }
        }
        defpackage.afdr afdrVar2 = defpackage.afdr.a;
        if (this.a != 0) {
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            java.lang.Object obj4 = this.f;
            java.lang.Object obj5 = this.b;
            java.lang.Object obj6 = this.c;
            java.lang.Object obj7 = this.d;
            ?? r5 = this.e;
            defpackage.bep bepVar = ((defpackage.beg) obj6).a;
            this.a = 1;
            long j = ((defpackage.dkd) obj5).b;
            long j2 = defpackage.dgc.a;
            int iA = r5.a(java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L)));
            defpackage.dga dgaVar = ((defpackage.bfi) obj7).a;
            if (iA < dgaVar.a.a.a()) {
                cjjVarL = dgaVar.l(iA);
            } else {
                cjjVarL = iA != 0 ? dgaVar.l(iA - 1) : new defpackage.cjj(0.0f, 0.0f, 1.0f, (int) (defpackage.bes.a(bepVar.b, bepVar.e, bepVar.g) & 4294967295L));
            }
            java.lang.Object objA = ((defpackage.bcf) obj4).a(cjjVarL, this);
            if (objA != afdrVar2) {
                objA = defpackage.afbk.a;
            }
            if (objA == afdrVar2) {
                return afdrVar2;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.g != 0) {
            return ((defpackage.bdt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bdt) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdt(defpackage.beg begVar, defpackage.bys bysVar, defpackage.fbl fblVar, defpackage.blw blwVar, defpackage.djl djlVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.g = i;
        this.f = begVar;
        this.d = bysVar;
        this.b = fblVar;
        this.c = blwVar;
        this.e = djlVar;
    }
}
