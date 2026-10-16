package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bxe extends defpackage.afea {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.bxf c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxe(defpackage.bxf bxfVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = bxfVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
