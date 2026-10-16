package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cqh extends defpackage.afea {
    long a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.cqi c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqh(defpackage.cqi cqiVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = cqiVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
