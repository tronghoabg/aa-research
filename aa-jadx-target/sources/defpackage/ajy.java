package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ajy implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajy(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [cds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [cdv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v45, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v47, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v51, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [asi, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = 1;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                this.a.c(this.b);
                return defpackage.afbk.a;
            case 1:
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                cxnVar.q();
                defpackage.dai.aG(cxnVar, ((defpackage.ckr) this.a).a, (defpackage.cka) this.b, 0.0f, null, 60);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                long j = ((defpackage.anu) obj).c;
                java.lang.Object obj2 = this.b;
                defpackage.amv amvVar = (defpackage.amv) obj2;
                long jC = defpackage.cji.c(j, true == amvVar.l() ? -1.0f : 1.0f);
                ((defpackage.amz) this.a).a(amvVar.a.c(java.lang.Float.intBitsToFloat((int) (((defpackage.aoj) obj2).d == defpackage.apn.a ? jC & 4294967295L : jC >> 32))), 0.0f);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.bzc) ((defpackage.kwv) this.b).a).m(this.a);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.anu anuVar = (defpackage.anu) obj;
                ((defpackage.izq) this.b).o(defpackage.cji.c(((defpackage.aqp) this.a).e(anuVar.c), true == anuVar.d ? -1.0f : 1.0f), 1);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((java.lang.Long) obj).longValue();
                defpackage.ark arkVar = (defpackage.ark) this.b;
                float f = arkVar.e;
                arkVar.e = 0.0f;
                this.a.invoke(java.lang.Float.valueOf(f));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                afgs afgsVar = (afgs) this.a;
                float f2 = afgsVar.a - fFloatValue;
                afgsVar.a = f2;
                this.b.invoke(java.lang.Float.valueOf(f2));
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                float fFloatValue2 = ((java.lang.Float) obj).floatValue();
                afgs afgsVar2 = (afgs) this.a;
                float f3 = afgsVar2.a - fFloatValue2;
                afgsVar2.a = f3;
                this.b.invoke(java.lang.Float.valueOf(f3));
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                defpackage.avn avnVar = (defpackage.avn) this.b;
                boolean z = avnVar.c;
                java.lang.Object obj3 = this.a;
                if (z) {
                    cuwVar.x((defpackage.cux) obj3, defpackage.dln.q(cuwVar, avnVar.a), defpackage.dln.q(cuwVar, avnVar.b));
                } else {
                    cuwVar.r((defpackage.cux) obj3, defpackage.dln.q(cuwVar, avnVar.a), defpackage.dln.q(cuwVar, avnVar.b), 0.0f);
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.cuw cuwVar2 = (defpackage.cuw) obj;
                defpackage.avp avpVar = (defpackage.avp) this.b;
                long j2 = ((defpackage.dlw) avpVar.a.invoke(cuwVar2)).a;
                boolean z2 = avpVar.b;
                java.lang.Object obj4 = this.a;
                int i2 = (int) (j2 >> 32);
                int i3 = (int) (j2 & 4294967295L);
                if (z2) {
                    cuwVar2.y((defpackage.cux) obj4, i2, i3, defpackage.cuy.a);
                } else {
                    defpackage.cuw.A(cuwVar2, (defpackage.cux) obj4, i2, i3, null, 12);
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.cuw cuwVar3 = (defpackage.cuw) obj;
                defpackage.avs avsVar = (defpackage.avs) this.b;
                boolean z3 = avsVar.e;
                java.lang.Object obj5 = this.a;
                if (z3) {
                    cuwVar3.x((defpackage.cux) obj5, defpackage.dln.q(cuwVar3, avsVar.a), defpackage.dln.q(cuwVar3, avsVar.b));
                } else {
                    cuwVar3.r((defpackage.cux) obj5, defpackage.dln.q(cuwVar3, avsVar.a), defpackage.dln.q(cuwVar3, avsVar.b), 0.0f);
                }
                return defpackage.afbk.a;
            case 11:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                ((defpackage.awv) obj7).b((android.view.View) obj6);
                return new defpackage.agp(obj7, obj6, 4, null);
            case 12:
                defpackage.ayk aykVar = (defpackage.ayk) this.b;
                defpackage.der derVar = aykVar.b;
                if (derVar != null) {
                    derVar.b();
                }
                java.lang.Object obj8 = this.a;
                aykVar.b = null;
                defpackage.ayl aylVar = (defpackage.ayl) obj8;
                aium aiumVar = aylVar.b;
                if (aiumVar != null) {
                    aiumVar.O(defpackage.afbk.a);
                }
                aylVar.b = null;
                return defpackage.afbk.a;
            case 13:
                ((defpackage.cmq) this.a).h(((java.lang.Number) ((defpackage.aeb) obj).d()).floatValue());
                ((defpackage.azf) this.b).b.invoke();
                return defpackage.afbk.a;
            case 14:
                ((defpackage.cmq) this.a).h(((java.lang.Number) ((defpackage.aeb) obj).d()).floatValue());
                ((defpackage.azf) this.b).b.invoke();
                return defpackage.afbk.a;
            case 15:
                java.lang.Object obj9 = this.b;
                defpackage.aaw aawVar = ((defpackage.bag) obj9).a;
                java.lang.Object obj10 = this.a;
                aawVar.e(obj10);
                return new defpackage.agp(obj9, obj10, 5);
            case 16:
                return new defpackage.bag(this.a, (java.util.Map) obj, this.b);
            case 17:
                this.a.invoke(java.lang.Integer.valueOf(((defpackage.epq) this.b).i().b));
                return defpackage.afbk.a;
            case 18:
                ((defpackage.cuw) obj).w(new defpackage.bbs(this.a, i));
                this.b.a();
                return defpackage.afbk.a;
            case 19:
                defpackage.dkd dkdVar = (defpackage.dkd) obj;
                if (!defpackage.afga.f(this.b, dkdVar)) {
                    this.a.invoke(dkdVar);
                }
                return defpackage.afbk.a;
            default:
                defpackage.dga dgaVar = (defpackage.dga) obj;
                java.lang.Object obj11 = this.b;
                if (obj11 != null) {
                    ((defpackage.bfk) obj11).a.b(dgaVar);
                }
                ?? r11 = this.a;
                if (r11 != 0) {
                    r11.invoke(dgaVar);
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ ajy(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
