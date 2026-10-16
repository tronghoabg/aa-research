package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bbt extends defpackage.afea {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.bby c;
    int d;
    defpackage.aga e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbt(defpackage.bby bbyVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = bbyVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.x(0, null, this);
    }
}
