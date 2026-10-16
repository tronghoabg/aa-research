package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bce extends defpackage.afea {
    int a;
    int b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.bcf d;
    int e;
    defpackage.cjj f;
    java.lang.Object[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bce(defpackage.bcf bcfVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = bcfVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
