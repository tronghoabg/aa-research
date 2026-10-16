package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class arp extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.ars c;
    final /* synthetic */ float d;
    final /* synthetic */ defpackage.affc e;
    final /* synthetic */ defpackage.apw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arp(defpackage.ars arsVar, float f, defpackage.affc affcVar, defpackage.apw apwVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = arsVar;
        this.d = f;
        this.e = affcVar;
        this.f = apwVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.arp(this.c, this.d, this.e, this.f, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.arp arpVar;
        java.lang.Object obj2;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.b;
        if (i == 0) {
            defpackage.afga.cz(obj);
            defpackage.ars arsVar = this.c;
            float f = this.d;
            float fA = arsVar.a.a(f, defpackage.ca.aj(arsVar.c, f));
            if (java.lang.Float.isNaN(fA)) {
                defpackage.asq.d("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            afgs afgsVar = new afgs();
            float fAbs = java.lang.Math.abs(fA) * java.lang.Math.signum(f);
            afgsVar.a = fAbs;
            defpackage.affc affcVar = this.e;
            affcVar.invoke(new java.lang.Float(fAbs));
            defpackage.apw apwVar = this.f;
            float f2 = afgsVar.a;
            defpackage.ajy ajyVar = new defpackage.ajy(afgsVar, affcVar, 6);
            this.a = afgsVar;
            this.b = 1;
            arpVar = this;
            obj = arsVar.d(apwVar, f2, f, ajyVar, arpVar);
            if (obj != afdrVar) {
                obj2 = afgsVar;
            }
        }
        if (i != 1) {
            defpackage.afga.cz(obj);
            return obj;
        }
        obj2 = this.a;
        defpackage.afga.cz(obj);
        arpVar = this;
        defpackage.ars arsVar2 = arpVar.c;
        defpackage.aek aekVar = (defpackage.aek) obj;
        float fB = arsVar2.a.b(((java.lang.Number) aekVar.b()).floatValue());
        if (java.lang.Float.isNaN(fB)) {
            defpackage.asq.d("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ((afgs) obj2).a = fB;
        java.lang.Object obj3 = obj2;
        defpackage.apw apwVar2 = arpVar.f;
        defpackage.aek aekVarC = defpackage.ca.C(aekVar, 0.0f, 0.0f, 30);
        defpackage.aej aejVar = arsVar2.b;
        defpackage.ajy ajyVar2 = new defpackage.ajy(obj3, arpVar.e, 7);
        arpVar.a = null;
        arpVar.b = 2;
        java.lang.Object objL = defpackage.asq.l(apwVar2, fB, fB, aekVarC, aejVar, ajyVar2, arpVar);
        return objL == afdrVar ? afdrVar : objL;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.arp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
