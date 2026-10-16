package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dhm extends defpackage.afea {
    public java.lang.Object a;
    public /* synthetic */ java.lang.Object b;
    public int c;
    final /* synthetic */ defpackage.ldx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhm(defpackage.ldx ldxVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = ldxVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.y(null, this);
    }
}
