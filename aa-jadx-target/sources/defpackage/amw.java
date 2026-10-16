package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class amw extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.ana b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amw(defpackage.ana anaVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = anaVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, null, this);
    }
}
