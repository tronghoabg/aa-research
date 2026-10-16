package defpackage;

/* loaded from: classes2.dex */
final /* synthetic */ class bqc extends afey implements afeg {
    public static final bqc a = new bqc();

    public bqc() {
        super(2, afgi.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
