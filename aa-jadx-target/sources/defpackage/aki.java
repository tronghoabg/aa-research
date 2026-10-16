package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aki extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.akj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(defpackage.akj akjVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = akjVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
