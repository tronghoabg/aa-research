package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fai extends defpackage.afea {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.fal c;
    int d;
    java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fai(defpackage.fal falVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = falVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
