package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class arr extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.ars b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arr(defpackage.ars arsVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = arsVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, 0.0f, 0.0f, null, this);
    }
}
