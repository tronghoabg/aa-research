package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ehf extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.ehg b;
    int c;
    ajey d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehf(defpackage.ehg ehgVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = ehgVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
