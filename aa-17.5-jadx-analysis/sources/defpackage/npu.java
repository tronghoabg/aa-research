package defpackage;

/* loaded from: classes2.dex */
final /* synthetic */ class npu extends afey implements afec {
    public static final npu a = new npu();

    public npu() {
        super(1, Integer.TYPE, "dec", "dec()I", 0);
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(((Number) obj).intValue() - 1);
    }
}
