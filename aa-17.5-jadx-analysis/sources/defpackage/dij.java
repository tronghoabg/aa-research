package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dij {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new ThreadLocal();

    public static final Typeface a(Typeface typeface, dic dicVar, Context context) throws IOException {
        String strC;
        float fB;
        if (typeface == null) {
            return null;
        }
        List list = dicVar.a;
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = b;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        Paint paint2 = paint;
        paint2.setFontVariationSettings(null);
        paint2.setTypeface(typeface);
        dlf.w(context);
        int iAj = a.aj(context);
        if (iAj == 0) {
            strC = dlz.c(list, null, null, null, new cyo(10), 31);
        } else {
            int size = list.size();
            String strConcat = "";
            boolean z = false;
            for (int i = 0; i < size; i++) {
                dhz dhzVar = (dhz) list.get(i);
                if (affa.f(dhzVar.a(), "wght")) {
                    fB = afpt.d(dhzVar.b() + iAj, 1.0f, 1000.0f);
                    z = true;
                } else {
                    fB = dhzVar.b();
                }
                if (i != 0) {
                    Objects.toString(strConcat);
                    strConcat = strConcat.concat(",");
                }
                strConcat = ((Object) strConcat) + "'" + dhzVar.a() + "' " + fB;
            }
            if (z) {
                strC = strConcat;
            } else {
                float fD = afpt.d(iAj + 400.0f, 1.0f, 1000.0f);
                if (!list.isEmpty()) {
                    Objects.toString(strConcat);
                    strConcat = strConcat.concat(",");
                }
                strC = ((Object) strConcat) + "'wght' " + fD;
            }
        }
        paint2.setFontVariationSettings(strC);
        return paint2.getTypeface();
    }
}
