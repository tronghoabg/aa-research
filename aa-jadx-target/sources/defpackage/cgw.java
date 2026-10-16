package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cgw extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.cgx b;
    int c;
    aixy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgw(defpackage.cgx cgxVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = cgxVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
