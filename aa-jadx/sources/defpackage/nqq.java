package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nqq extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.nqr b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqq(defpackage.nqr nqrVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = nqrVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(false, this);
    }
}
