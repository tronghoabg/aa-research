package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqe extends defpackage.afea {
    long a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.aqf c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqe(defpackage.aqf aqfVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = aqfVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(0L, 0L, this);
    }
}
