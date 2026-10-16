package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aea extends defpackage.afee implements defpackage.affc {
    final /* synthetic */ defpackage.aeb a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aea(defpackage.aeb aebVar, java.lang.Object obj, defpackage.afdk afdkVar) {
        super(1, afdkVar);
        this.a = aebVar;
        this.b = obj;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        defpackage.aeb aebVar = this.a;
        aebVar.g();
        java.lang.Object obj2 = this.b;
        defpackage.aek aekVar = aebVar.b;
        java.lang.Object objB = aebVar.b(obj2);
        aekVar.c(objB);
        aebVar.i(objB);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return new defpackage.aea(this.a, this.b, (defpackage.afdk) obj).hf(defpackage.afbk.a);
    }
}
