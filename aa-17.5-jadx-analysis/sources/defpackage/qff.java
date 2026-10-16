package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class qff {
    private static final yph a = yph.c("ADU.AppResourceLoader");

    public static Drawable a(Context context, int i) {
        try {
            TypedValue typedValue = new TypedValue();
            Resources resources = context.getResources();
            resources.getValue(i, typedValue, true);
            return (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) ? context.getDrawable(i) : fhu.b(resources, i, context.getTheme());
        } catch (Resources.NotFoundException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 7040)).u("Failed to load resource from app");
            return null;
        }
    }
}
