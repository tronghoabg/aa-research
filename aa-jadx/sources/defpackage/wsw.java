package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wsw extends android.util.Property {
    public wsw(java.lang.Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int[] iArr = defpackage.wsx.a;
        return java.lang.Float.valueOf(((defpackage.wsx) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        int[] iArr = defpackage.wsx.a;
        ((defpackage.wsx) obj).g = fFloatValue;
    }
}
