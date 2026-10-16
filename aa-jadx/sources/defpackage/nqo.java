package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class nqo extends defpackage.affy implements defpackage.affc {
    public static final defpackage.nqo a = new defpackage.nqo();

    public nqo() {
        super(1, java.lang.Integer.TYPE, "inc", "inc()I", 0);
    }

    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + 1);
    }
}
