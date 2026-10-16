package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bjd implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bjd(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v25, types: [bkc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [bkc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v31, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v35, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v49, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v53, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [affg, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        bud budVar;
        bua buaVar;
        defpackage.bmb bmbVar;
        defpackage.bmb bmbVar2;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Long.valueOf(((defpackage.bje) this.a).b);
            case 1:
                return ((defpackage.bjb) this.a).d.b;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.bje) this.a).c.invoke();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Long.valueOf(((defpackage.bje) this.a).b);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.bje) this.a).c.invoke();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bjk bjkVar = (defpackage.bjk) this.a;
                bjkVar.f();
                bjkVar.m();
                return java.lang.Boolean.TRUE;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bjo bjoVar = (defpackage.bjo) this.a;
                bjoVar.f();
                bjoVar.l();
                return java.lang.Boolean.TRUE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf((9223372034707292159L & this.a.a()) != 9205357640488583168L);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf((9223372034707292159L & this.a.a()) != 9205357640488583168L);
            case 9:
                defpackage.aem aemVar = defpackage.blg.a;
                return new defpackage.cji(((defpackage.cji) this.a.a()).a);
            case 10:
                return new defpackage.cji(defpackage.blg.a(this.a));
            case 11:
                return java.lang.Boolean.valueOf(!((defpackage.blw) this.a).s);
            case 12:
                defpackage.blw blwVar = (defpackage.blw) this.a;
                defpackage.dfb dfbVar = blwVar.f().a;
                long jG = defpackage.dax.g(0, blwVar.f().a().length());
                long j = defpackage.dgc.a;
                defpackage.dkd dkdVar = new defpackage.dkd(dfbVar, jG, (defpackage.dgc) null);
                blwVar.c.invoke(dkdVar);
                long j2 = dkdVar.b;
                blwVar.o = new defpackage.dgc(j2);
                blwVar.n = defpackage.dkd.b(blwVar.n, null, j2, 5);
                blwVar.j(true);
                return defpackage.afbk.a;
            case 13:
                defpackage.afer aferVar = ((defpackage.blw) this.a).f;
                if (aferVar != null) {
                    aferVar.invoke();
                }
                return defpackage.afbk.a;
            case 14:
                ?? r13 = this.a;
                if (((defpackage.bpi) defpackage.cjv.y(r13, defpackage.bpk.b)) == null) {
                    defpackage.bnt bntVar = (defpackage.bnt) r13;
                    defpackage.cwn cwnVar = bntVar.g;
                    if (cwnVar != null) {
                        ((defpackage.cwo) r13).V(cwnVar);
                    }
                    bntVar.g = null;
                } else {
                    defpackage.bnt bntVar2 = (defpackage.bnt) r13;
                    if (bntVar2.g == null) {
                        defpackage.bns bnsVar = new defpackage.bns(r13, 0);
                        defpackage.bjd bjdVar = new defpackage.bjd(r13, 15);
                        defpackage.asj asjVar = bntVar2.a;
                        boolean z = bntVar2.b;
                        float f = bntVar2.c;
                        defpackage.ags agsVar = defpackage.btr.a;
                        defpackage.cwo cwoVar = new defpackage.cwo(asjVar, z, f, bnsVar, bjdVar);
                        ((defpackage.cwo) r13).W(cwoVar);
                        bntVar2.g = cwoVar;
                    }
                }
                return defpackage.afbk.a;
            case 15:
                ?? r14 = this.a;
                defpackage.bow bowVar = ((defpackage.bol) defpackage.cjv.y(r14, defpackage.bom.a)).d;
                defpackage.khb khbVar = (defpackage.khb) defpackage.cjv.y(r14, defpackage.bpk.a);
                defpackage.bpi bpiVar = (defpackage.bpi) defpackage.cjv.y(r14, defpackage.bpk.b);
                defpackage.bnt bntVar3 = (defpackage.bnt) r14;
                float f2 = 0.1f;
                if (bntVar3.e) {
                    budVar = new bud((bpiVar == null || (bmbVar2 = bpiVar.b) == null) ? 0.1f : bmbVar2.d);
                } else {
                    budVar = buc.b;
                }
                if (bntVar3.f) {
                    java.lang.Object obj = khbVar.a;
                    if (bpiVar != null && bpiVar.b != null) {
                        f2 = 0.0f;
                    }
                    buaVar = new bua(f2);
                } else {
                    buaVar = btz.a;
                }
                bub bubVar = new bub((bpiVar == null || bpiVar.b == null) ? 0.08f : 0.0f);
                float f3 = 0.16f;
                if (bpiVar != null && (bmbVar = bpiVar.b) != null) {
                    f3 = bmbVar.a;
                }
                return new bue(budVar, buaVar, bubVar, new btx(f3));
            case 16:
                return ((defpackage.bwc) this.a).ao();
            case 17:
                return ((defpackage.bwc) this.a).ao();
            case 18:
                ((defpackage.bxt) this.a).C();
                return defpackage.afbk.a;
            case 19:
                ((defpackage.bxt) this.a).C();
                return defpackage.afbk.a;
            default:
                java.lang.Object obj2 = this.a;
                defpackage.cdr cdrVar = (defpackage.cdr) obj2;
                defpackage.cdz cdzVar = cdrVar.e;
                java.lang.Object obj3 = cdrVar.c;
                if (obj3 != null) {
                    return cdzVar.a.invoke(obj2, obj3);
                }
                throw new java.lang.IllegalArgumentException("Value should be initialized");
        }
    }
}
