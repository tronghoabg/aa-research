package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aql extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.aqp b;
    int c;
    afgu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aql(defpackage.aqp aqpVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = aqpVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(0L, this);
    }
}
