package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtd extends android.util.Property {
    public wtd(java.lang.Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((defpackage.wte) obj).f());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((defpackage.wte) obj).i(((java.lang.Float) obj2).floatValue());
    }
}
