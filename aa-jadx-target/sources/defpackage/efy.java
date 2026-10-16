package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class efy extends defpackage.afea {
    boolean a;
    java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.egk d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efy(defpackage.egk egkVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = egkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(false, null, this);
    }
}
