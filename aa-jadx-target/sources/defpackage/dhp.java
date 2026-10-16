package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dhp extends defpackage.afea {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    /* synthetic */ java.lang.Object e;
    final /* synthetic */ defpackage.dhr f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhp(defpackage.dhr dhrVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.f = dhrVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
