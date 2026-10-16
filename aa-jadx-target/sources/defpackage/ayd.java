package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ayd extends defpackage.afea {
    java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.aye c;
    int d;
    defpackage.akv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayd(defpackage.aye ayeVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = ayeVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, this);
    }
}
