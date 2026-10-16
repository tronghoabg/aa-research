package android.support.v7.widget;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.collection.LruCache;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bh {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1132a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final LruCache f1133b = new LruCache(30);

    /* renamed from: c, reason: collision with root package name */
    private static Paint f1134c;

    static Typeface a(Typeface typeface, String str, int i2) {
        FontVariationAxis[] fontVariationAxisArr;
        int length;
        bg bgVar = new bg(typeface, str, i2);
        LruCache lruCache = f1133b;
        Typeface typeface2 = (Typeface) lruCache.get(bgVar);
        if (typeface2 != null) {
            return typeface2;
        }
        Paint paint = f1134c;
        if (paint == null) {
            paint = new Paint();
            f1134c = paint;
        }
        if (i2 != 0) {
            if (TextUtils.isEmpty(str)) {
                fontVariationAxisArr = new FontVariationAxis[0];
            } else {
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                if (fontVariationAxisArrFromFontVariationSettings != null) {
                    fontVariationAxisArr = fontVariationAxisArrFromFontVariationSettings;
                }
            }
            int i3 = 0;
            boolean z = false;
            while (true) {
                length = fontVariationAxisArr.length;
                if (i3 >= length) {
                    break;
                }
                FontVariationAxis fontVariationAxis = fontVariationAxisArr[i3];
                if ("wght".equals(fontVariationAxis.getTag())) {
                    fontVariationAxisArr[i3] = new FontVariationAxis("wght", c(fontVariationAxis.getStyleValue() + i2));
                    z = true;
                }
                i3++;
            }
            if (!z) {
                FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[length + 1];
                System.arraycopy(fontVariationAxisArr, 0, fontVariationAxisArr2, 0, length);
                fontVariationAxisArr2[length] = new FontVariationAxis("wght", c(i2 + DisplayStrings.DS_NIGHT));
                fontVariationAxisArr = fontVariationAxisArr2;
            }
            str = FontVariationAxis.toFontVariationSettings(fontVariationAxisArr);
        }
        if (Objects.equals(paint.getFontVariationSettings(), str)) {
            paint.setFontVariationSettings(null);
        }
        paint.setTypeface(typeface);
        if (!paint.setFontVariationSettings(str)) {
            return null;
        }
        Typeface typeface3 = paint.getTypeface();
        lruCache.put(bgVar, typeface3);
        return typeface3;
    }

    static void b(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }

    private static float c(float f2) {
        if (f2 < 1.0f) {
            return 1.0f;
        }
        return Math.min(f2, 1000.0f);
    }
}
