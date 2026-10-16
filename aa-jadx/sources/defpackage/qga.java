package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qga {
    private static final defpackage.yqm a = defpackage.yqm.c("ADU.AppResourceLoader");

    public static android.graphics.drawable.Drawable a(android.content.Context context, int i) {
        try {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources resources = context.getResources();
            resources.getValue(i, typedValue, true);
            return (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) ? context.getDrawable(i) : defpackage.fia.b(resources, i, context.getTheme());
        } catch (android.content.res.Resources.NotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 7065)).u("Failed to load resource from app");
            return null;
        }
    }
}
