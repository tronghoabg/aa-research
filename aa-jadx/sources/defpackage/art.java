package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class art implements defpackage.affc {
    public final /* synthetic */ float a;
    public final /* synthetic */ defpackage.afgs b;
    public final /* synthetic */ defpackage.apw c;
    public final /* synthetic */ defpackage.affc d;
    private final /* synthetic */ int e;

    public /* synthetic */ art(float f, defpackage.afgs afgsVar, defpackage.apw apwVar, defpackage.affc affcVar, int i) {
        this.e = i;
        this.a = f;
        this.b = afgsVar;
        this.c = apwVar;
        this.d = affcVar;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        if (this.e == 0) {
            defpackage.affc affcVar = this.d;
            defpackage.apw apwVar = this.c;
            defpackage.afgs afgsVar = this.b;
            return defpackage.asq.m(this.a, afgsVar, apwVar, affcVar, (defpackage.aei) obj);
        }
        defpackage.aei aeiVar = (defpackage.aei) obj;
        float fAbs = java.lang.Math.abs(((java.lang.Number) aeiVar.a()).floatValue());
        float f = this.a;
        defpackage.affc affcVar2 = this.d;
        defpackage.apw apwVar2 = this.c;
        defpackage.afgs afgsVar2 = this.b;
        if (fAbs >= java.lang.Math.abs(f)) {
            float fK = defpackage.asq.k(((java.lang.Number) aeiVar.a()).floatValue(), f);
            defpackage.asq.n(aeiVar, apwVar2, affcVar2, fK - afgsVar2.a);
            aeiVar.b();
            afgsVar2.a = fK;
        } else {
            defpackage.asq.n(aeiVar, apwVar2, affcVar2, ((java.lang.Number) aeiVar.a()).floatValue() - afgsVar2.a);
            afgsVar2.a = ((java.lang.Number) aeiVar.a()).floatValue();
        }
        return defpackage.afbk.a;
    }
}
