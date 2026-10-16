package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class thh extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.thi b;
    int c;
    defpackage.tgf d;
    defpackage.thg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thh(defpackage.thi thiVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = thiVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
