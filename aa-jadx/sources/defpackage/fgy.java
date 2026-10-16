package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fgy extends android.util.Property {
    public fgy(java.lang.Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(defpackage.fha.a((android.view.View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.fha.d((android.view.View) obj, ((java.lang.Float) obj2).floatValue());
    }
}
