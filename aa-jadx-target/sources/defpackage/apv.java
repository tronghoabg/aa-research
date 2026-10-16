package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class apv extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ afgs a;
    final /* synthetic */ float b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apv(afgs afgsVar, float f, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = afgsVar;
        this.b = f;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.apv apvVar = new defpackage.apv(this.a, this.b, afdkVar);
        apvVar.c = obj;
        return apvVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        this.a.a = ((defpackage.apw) this.c).a(this.b);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apv) b((defpackage.apw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
