package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dhq extends defpackage.afea {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.dhr c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhq(defpackage.dhr dhrVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = dhrVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
