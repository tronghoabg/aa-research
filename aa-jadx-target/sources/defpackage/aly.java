package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aly implements defpackage.affh {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aly(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01d1  */
    /* JADX WARN: Type inference failed for: r0v10, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [cld, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [affi, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
        int i = this.c;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            int i2 = iIntValue & 17;
            int i3 = iIntValue & 1;
            defpackage.alu aluVar = defpackage.amb.a;
            if (bveVar.I(i2 != 16, i3)) {
                java.lang.Object objG = bveVar.g();
                if (objG == defpackage.bvd.a) {
                    objG = new defpackage.bil(defpackage.alt.a);
                    bveVar.x(objG);
                }
                java.lang.Object obj4 = this.b;
                ?? r0 = this.a;
                defpackage.bil bilVar = (defpackage.bil) objG;
                ((androidx.compose.runtime.snapshots.SnapshotStateList) bilVar.b).clear();
                r0.invoke(bilVar);
                bilVar.q((defpackage.alu) obj4, bveVar, 0);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        int i4 = 9;
        if (i == 1) {
            defpackage.cub cubVar = (defpackage.cub) obj;
            defpackage.cux cuxVarV = ((defpackage.ctx) obj2).v(((defpackage.dlm) obj3).a);
            if (!cubVar.dU()) {
                j = (((long) cuxVarV.a) << 32) | (((long) cuxVarV.b) & 4294967295L);
            } else if (((java.lang.Boolean) this.a.invoke(((defpackage.agn) this.b).g())).booleanValue()) {
                j = (((long) cuxVarV.a) << 32) | (((long) cuxVarV.b) & 4294967295L);
            } else {
                j = 0;
            }
            return cubVar.dS((int) (j >> 32), (int) (4294967295L & j), defpackage.afcf.a, new defpackage.aap(cuxVarV, 9));
        }
        defpackage.cjx cjxVar = null;
        if (i == 2) {
            defpackage.bve bveVar2 = (defpackage.bve) obj2;
            ((java.lang.Integer) obj3).intValue();
            defpackage.aem aemVar = defpackage.blg.a;
            bveVar2.v(759876635);
            java.lang.Object objG2 = bveVar2.g();
            java.lang.Object obj5 = defpackage.bvd.a;
            if (objG2 == obj5) {
                ?? r2 = this.b;
                defpackage.lam lamVar = defpackage.byp.a;
                java.lang.Object bvrVar = new defpackage.bvr(r2, null);
                bveVar2.x(bvrVar);
                objG2 = bvrVar;
            }
            defpackage.bys bysVar = (defpackage.bys) objG2;
            java.lang.Object objG3 = bveVar2.g();
            if (objG3 == obj5) {
                objG3 = new defpackage.aeb(new defpackage.cji(defpackage.blg.a(bysVar)), defpackage.blg.d, new defpackage.cji(defpackage.blg.b), "Animatable");
                bveVar2.x(objG3);
            }
            defpackage.aeb aebVar = (defpackage.aeb) objG3;
            defpackage.afbk afbkVar = defpackage.afbk.a;
            boolean zE = bveVar2.E(aebVar);
            java.lang.Object objG4 = bveVar2.g();
            if (zE || objG4 == obj5) {
                objG4 = new defpackage.blf(bysVar, aebVar, (defpackage.afdk) null, 0);
                bveVar2.x(objG4);
            }
            defpackage.bvx.g(afbkVar, (defpackage.affg) objG4, bveVar2);
            java.lang.Object obj6 = aebVar.b;
            boolean zC = bveVar2.C(obj6);
            java.lang.Object objG5 = bveVar2.g();
            if (zC || objG5 == obj5) {
                objG5 = new defpackage.bjd(obj6, i4);
                bveVar2.x(objG5);
            }
            defpackage.cgf cgfVar = (defpackage.cgf) this.a.invoke((defpackage.afer) objG5);
            bveVar2.o();
            return cgfVar;
        }
        if (i == 3) {
            defpackage.dft dftVar = (defpackage.dft) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            int iIntValue3 = ((java.lang.Integer) obj3).intValue();
            defpackage.dhz dhzVar = dftVar.f;
            defpackage.dil dilVar = dftVar.c;
            if (dilVar == null) {
                dilVar = defpackage.dil.k;
            }
            defpackage.die dieVar = dftVar.d;
            defpackage.die dieVar2 = new defpackage.die(dieVar != null ? dieVar.a : 0);
            defpackage.dif difVar = dftVar.e;
            this.b.setSpan(new defpackage.dhj((android.graphics.Typeface) this.a.invoke(dhzVar, dilVar, dieVar2, new defpackage.dif(difVar != null ? difVar.a : 65535))), iIntValue2, iIntValue3, 33);
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar3 = (defpackage.bve) obj2;
        int iIntValue4 = ((java.lang.Integer) obj3).intValue();
        int i5 = defpackage.nob.a;
        ((defpackage.awd) obj).getClass();
        if (bveVar3.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
            defpackage.nod nodVar = (defpackage.nod) this.a;
            defpackage.noc nocVar = nodVar.c;
            if ((nocVar == null || (ghIcon = nocVar.a) == null) && (ghIcon = nodVar.b.a) == null) {
                return defpackage.afbk.a;
            }
            ?? r1 = this.b;
            float f = defpackage.ktf.f.i;
            defpackage.cgf cgfVarH = defpackage.cjv.h(new defpackage.awi(f, f, f, f, true).a(new defpackage.atj(true)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, r1, true, 0, 1042431);
            defpackage.cne cneVarF = defpackage.lgo.f(ghIcon, 0.0f, bveVar3, 3);
            if (nodVar.g) {
                bveVar3.v(368971557);
                defpackage.kry kryVar = defpackage.kry.C;
                defpackage.ksw kswVar = defpackage.ksx.a;
                cjxVar = new defpackage.cjx(defpackage.ksx.b(defpackage.kfp.i(bveVar3), kryVar), 5);
                bveVar3.o();
            } else {
                bveVar3.v(369063379);
                bveVar3.o();
            }
            defpackage.ca.bb(cneVarF, null, cgfVarH, null, null, 0.0f, cjxVar, bveVar3, 56, 56);
        } else {
            bveVar3.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ aly(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
