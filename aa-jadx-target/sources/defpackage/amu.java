package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class amu extends defpackage.afee implements defpackage.affh {
    int a;
    final /* synthetic */ defpackage.amv b;
    final /* synthetic */ afgs c;
    final /* synthetic */ float d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amu(defpackage.amv amvVar, afgs afgsVar, float f, defpackage.afdk afdkVar) {
        super(3, afdkVar);
        this.b = amvVar;
        this.c = afgsVar;
        this.d = f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        afgs afgsVar;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.a != 0) {
            afgsVar = (afgs) this.e;
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            defpackage.amz amzVar = (defpackage.amz) this.e;
            defpackage.amv amvVar = this.b;
            defpackage.aqm aqmVar = new defpackage.aqm(amvVar, amzVar, 1);
            defpackage.aor aorVar = amvVar.c;
            if (aorVar == null) {
                defpackage.afga.d("resolvedFlingBehavior");
                aorVar = null;
            }
            afgs afgsVar2 = this.c;
            float f = this.d;
            this.e = afgsVar2;
            this.a = 1;
            obj = aorVar.a(aqmVar, f, this);
            if (obj == afdrVar) {
                return afdrVar;
            }
            afgsVar = afgsVar2;
        }
        afgsVar.a = ((java.lang.Number) obj).floatValue();
        return defpackage.afbk.a;
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.amu amuVar = new defpackage.amu(this.b, this.c, this.d, (defpackage.afdk) obj3);
        amuVar.e = (defpackage.amz) obj;
        return amuVar.hf(defpackage.afbk.a);
    }
}
