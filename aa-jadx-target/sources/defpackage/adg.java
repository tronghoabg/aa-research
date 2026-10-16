package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adg extends defpackage.afea {
    float a;
    long b;
    long c;
    long d;
    /* synthetic */ java.lang.Object e;
    final /* synthetic */ defpackage.adi f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adg(defpackage.adi adiVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.f = adiVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(this);
    }
}
