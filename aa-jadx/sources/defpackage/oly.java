package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oly extends android.util.Property {
    public oly(java.lang.Class cls) {
        super(cls, "ANDROID_AUTO:TRANSLATE_Y");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((android.view.View) obj).getTranslationY());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.view.View) obj).setTranslationY(((java.lang.Float) obj2).floatValue());
    }
}
