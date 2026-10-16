package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class arj extends defpackage.afea {
    java.lang.Object a;
    float b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.ark d;
    int e;
    defpackage.axl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arj(defpackage.ark arkVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = arkVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
