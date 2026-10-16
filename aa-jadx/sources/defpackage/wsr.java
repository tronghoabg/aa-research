package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wsr extends android.util.Property {
    public wsr(java.lang.Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int[] iArr = defpackage.wss.a;
        return java.lang.Float.valueOf(((defpackage.wss) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        int[] iArr = defpackage.wss.a;
        ((defpackage.wss) obj).h = fFloatValue;
    }
}
