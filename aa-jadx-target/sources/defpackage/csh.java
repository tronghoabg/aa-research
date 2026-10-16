package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class csh extends defpackage.affy implements defpackage.affg {
    public static final defpackage.csh a = new defpackage.csh();

    public csh() {
        super(2, defpackage.afhi.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.valueOf(java.lang.Math.max(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue()));
    }
}
