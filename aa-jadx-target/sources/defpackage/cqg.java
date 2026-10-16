package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cqg extends defpackage.afea {
    long a;
    long b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.cqi d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqg(defpackage.cqi cqiVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = cqiVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0L, 0L, this);
    }
}
