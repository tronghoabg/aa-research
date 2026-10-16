package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ehm extends defpackage.afea {
    java.lang.Object a;
    int b;
    int c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.eho e;
    int f;
    ajey g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehm(defpackage.eho ehoVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.e = ehoVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
