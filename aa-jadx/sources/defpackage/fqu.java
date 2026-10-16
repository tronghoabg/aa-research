package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fqu extends defpackage.afea {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.fqv c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqu(defpackage.fqv fqvVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = fqvVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
