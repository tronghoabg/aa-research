package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class boa extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.bob b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boa(defpackage.bob bobVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = bobVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
