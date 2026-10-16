package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class efu extends defpackage.afea {
    boolean a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    /* synthetic */ java.lang.Object f;
    final /* synthetic */ defpackage.egk g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efu(defpackage.egk egkVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.g = egkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(false, this);
    }
}
