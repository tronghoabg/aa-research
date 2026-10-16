package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class csg extends defpackage.affy implements defpackage.affg {
    public static final defpackage.csg a = new defpackage.csg();

    public csg() {
        super(2, defpackage.afhi.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue()));
    }
}
