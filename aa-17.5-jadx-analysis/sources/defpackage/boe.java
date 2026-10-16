package defpackage;

/* loaded from: classes.dex */
final /* synthetic */ class boe extends afey implements afeg {
    public static final boe a = new boe();

    public boe() {
        super(2, afgi.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
