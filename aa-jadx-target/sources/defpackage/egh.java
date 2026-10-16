package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class egh extends defpackage.afea {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.egk b;
    int c;
    defpackage.afgt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(defpackage.egk egkVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = egkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, false, this);
    }
}
