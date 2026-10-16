package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class anl extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ defpackage.anm e;
    final /* synthetic */ defpackage.apw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anl(float f, defpackage.anm anmVar, defpackage.apw apwVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = f;
        this.e = anmVar;
        this.f = apwVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.anl(this.d, this.e, this.f, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        float f;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                defpackage.afga.cz(obj);
            } catch (java.util.concurrent.CancellationException unused) {
                ((afgs) obj3).a = ((java.lang.Number) ((defpackage.aek) obj2).b()).floatValue();
            }
            f = ((afgs) obj3).a;
        } else {
            defpackage.afga.cz(obj);
            float f2 = this.d;
            if (java.lang.Math.abs(f2) > 1.0f) {
                afgs afgsVar = new afgs();
                afgsVar.a = f2;
                afgs afgsVar2 = new afgs();
                defpackage.aek aekVarB = defpackage.ca.B(0.0f, f2);
                try {
                    defpackage.anm anmVar = this.e;
                    defpackage.kwv kwvVar = anmVar.b;
                    defpackage.afl aflVar = new defpackage.afl(afgsVar2, this.f, afgsVar, anmVar, 2);
                    this.a = afgsVar;
                    this.b = aekVarB;
                    this.c = 1;
                    if (defpackage.afw.ah(aekVarB, kwvVar, false, aflVar, this) == afdrVar) {
                        return afdrVar;
                    }
                    obj3 = afgsVar;
                    f = ((afgs) obj3).a;
                } catch (java.util.concurrent.CancellationException unused2) {
                    obj2 = aekVarB;
                    obj3 = afgsVar;
                    ((afgs) obj3).a = ((java.lang.Number) ((defpackage.aek) obj2).b()).floatValue();
                }
            } else {
                f = this.d;
            }
        }
        return new java.lang.Float(f);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.anl) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
