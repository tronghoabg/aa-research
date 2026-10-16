package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dvo {
    public static final defpackage.dvw a;
    public static final defpackage.aab b;
    private static android.graphics.Paint c;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            a = new defpackage.dvt();
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            a = new defpackage.dvs();
        } else {
            a = new defpackage.dvr();
        }
        b = new defpackage.aab(16);
        c = null;
    }

    public static android.graphics.Typeface a(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        android.graphics.Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.c(d(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    public static android.graphics.Typeface b(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str, 0);
            android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static android.graphics.fonts.Font c(android.graphics.Typeface typeface) {
        android.graphics.Paint paint = c;
        if (paint == null) {
            paint = new android.graphics.Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        android.graphics.text.PositionedGlyphs positionedGlyphsShapeTextRun = android.graphics.text.TextRunShaper.shapeTextRun((java.lang.CharSequence) " ", 0, 1, 0, 1, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    public static java.lang.String d(android.content.res.Resources resources, int i, java.lang.String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
