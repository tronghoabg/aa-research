package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ape extends defpackage.afea {
    float a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.aph c;
    int d;
    afgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ape(defpackage.aph aphVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = aphVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, 0.0f, 0.0f, this);
    }
}
