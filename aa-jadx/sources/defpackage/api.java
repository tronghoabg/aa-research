package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class api extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.apj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public api(defpackage.apj apjVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = apjVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, this);
    }
}
