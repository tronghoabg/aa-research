package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class jv {
    public static final zu a = new zu(30);
    public static Paint b;

    public static float a(float f) {
        if (f < 1.0f) {
            return 1.0f;
        }
        return Math.min(f, 1000.0f);
    }

    static void b(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
