package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class nqn extends defpackage.affy implements defpackage.affc {
    public static final defpackage.nqn a = new defpackage.nqn();

    public nqn() {
        super(1, java.lang.Integer.TYPE, "dec", "dec()I", 0);
    }

    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() - 1);
    }
}
