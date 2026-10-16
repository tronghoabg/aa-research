package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bcb extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.bcc b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcb(defpackage.bcc bccVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = bccVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0.0f, this);
    }
}
