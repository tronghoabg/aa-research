package defpackage;

/* loaded from: classes2.dex */
final /* synthetic */ class npv extends afey implements afec {
    public static final npv a = new npv();

    public npv() {
        super(1, Integer.TYPE, "inc", "inc()I", 0);
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(((Number) obj).intValue() + 1);
    }
}
