package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class amd extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.amf b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amd(defpackage.amf amfVar, float f, float f2, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = amfVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.amd(this.b, this.c, this.d, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            defpackage.amf amfVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
            this.a = 1;
            if (amfVar.i((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.amd) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
