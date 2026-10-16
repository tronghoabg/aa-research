package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jw {
    public static final defpackage.aab a = new defpackage.aab(30);
    public static android.graphics.Paint b;

    public static float a(float f) {
        if (f < 1.0f) {
            return 1.0f;
        }
        return java.lang.Math.min(f, 1000.0f);
    }

    static void b(android.widget.TextView textView, java.lang.String str) {
        if (j$.util.Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
