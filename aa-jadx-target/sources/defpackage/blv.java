package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class blv extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.blw b;
    int c;
    defpackage.blw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blv(defpackage.blw blwVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = blwVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
