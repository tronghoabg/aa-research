package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class egq extends defpackage.afea {
    boolean a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.egs c;
    int d;
    defpackage.ego e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egq(defpackage.egs egsVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = egsVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
