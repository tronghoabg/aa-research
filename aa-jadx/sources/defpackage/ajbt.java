package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ajbt extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.ajbu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbt(defpackage.ajbu ajbuVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = ajbuVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
