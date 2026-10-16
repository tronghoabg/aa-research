package defpackage;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class boi extends defpackage.affy implements defpackage.affg {
    public static final defpackage.boi a = new defpackage.boi();

    public boi() {
        super(2, defpackage.afhi.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue()));
    }
}
