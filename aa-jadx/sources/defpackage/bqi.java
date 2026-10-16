package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class bqi extends defpackage.affy implements defpackage.affg {
    public static final defpackage.bqi a = new defpackage.bqi();

    public bqi() {
        super(2, defpackage.afhi.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue()));
    }
}
