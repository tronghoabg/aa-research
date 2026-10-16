package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ezs extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.ezt b;
    int c;
    int[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezs(defpackage.ezt eztVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = eztVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
