package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class bnz extends defpackage.afea {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.bob c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnz(defpackage.bob bobVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = bobVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
