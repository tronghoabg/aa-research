package defpackage;

/* loaded from: classes.dex */
final /* synthetic */ class cry extends afey implements afeg {
    public static final cry a = new cry();

    public cry() {
        super(2, afgi.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
