package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class njx implements defpackage.affh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ njx(defpackage.nkj nkjVar, android.content.ComponentName componentName, defpackage.nkf nkfVar, boolean z, int i) {
        this.e = i;
        this.b = nkjVar;
        this.c = componentName;
        this.d = nkfVar;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v34, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [bys, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.CharSequence charSequenceAA;
        defpackage.bve bveVar;
        java.lang.Object obj4 = null;
        if (this.e == 0) {
            defpackage.mqj mqjVar = (defpackage.mqj) obj2;
            java.lang.Object objR = defpackage.nkj.r((android.content.ComponentName) obj);
            java.lang.Object obj5 = this.c;
            if (objR == null) {
                objR = obj5;
            }
            return ((defpackage.nkj) this.b).j((android.content.ComponentName) objR, mqjVar != null ? mqjVar.a() : null, (defpackage.nkf) this.d, this.a, true);
        }
        uxy uxyVar = (uxy) obj;
        defpackage.bve bveVar2 = (defpackage.bve) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        defpackage.yqm yqmVar = defpackage.myx.a;
        uxyVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != bveVar2.C(uxyVar) ? 2 : 4;
        }
        if (bveVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
            if (this.a) {
                ?? r14 = this.c;
                if (defpackage.tna.aA(r14) != null) {
                    charSequenceAA = defpackage.tna.aA(r14);
                } else {
                    charSequenceAA = defpackage.tna.aA(this.d);
                }
            } else {
                charSequenceAA = defpackage.tna.aA(this.d);
            }
            if (charSequenceAA != null) {
                java.lang.String string = charSequenceAA.toString();
                if (!afzh.v(string)) {
                    obj4 = string;
                }
            }
            if (obj4 != null || defpackage.lmp.a.a().d()) {
                bveVar2.v(696104405);
                defpackage.cfy cfyVar = defpackage.cfs.n;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, cfyVar, bveVar2, 48);
                int iF = defpackage.a.f(bveVar2.b());
                defpackage.cdd cddVarN = bveVar2.N();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgcVar);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVar2.M();
                bveVar2.w();
                if (bveVar2.G()) {
                    bveVar2.j(aferVar);
                } else {
                    bveVar2.y();
                }
                defpackage.byw.c(bveVar2, ctyVarA, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVar2, defpackage.cwl.g);
                defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                if (defpackage.lmp.a.a().d()) {
                    ?? r12 = this.b;
                    bveVar2.v(-1933541715);
                    java.util.Iterator it = defpackage.tna.aq(r12).iterator();
                    while (it.hasNext()) {
                        defpackage.bve bveVar3 = bveVar2;
                        defpackage.boh.a(defpackage.day.h(((java.lang.Number) it.next()).intValue(), bveVar2, 0), null, null, 0L, bveVar3, 56, 12);
                        defpackage.asq.A(defpackage.awj.i(cgcVar, defpackage.gjr.P0.k), bveVar3);
                        bveVar2 = bveVar3;
                    }
                    bveVar = bveVar2;
                    bveVar.o();
                } else {
                    bveVar = bveVar2;
                    bveVar.v(-1933302426);
                    bveVar.o();
                }
                defpackage.bve bveVar4 = bveVar;
                uxyVar.c(obj4, (defpackage.cgf) null, false, bveVar4, (iIntValue << 9) & 7168, 6);
                bveVar4.n();
                bveVar4.o();
            } else {
                bveVar2.v(696552231);
                bveVar2.o();
            }
        } else {
            bveVar2.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ njx(boolean z, defpackage.bys bysVar, defpackage.bys bysVar2, defpackage.bys bysVar3, int i) {
        this.e = i;
        this.a = z;
        this.c = bysVar;
        this.d = bysVar2;
        this.b = bysVar3;
    }
}
