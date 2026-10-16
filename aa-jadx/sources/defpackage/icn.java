package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icn {
    private static volatile boolean a = true;

    public static android.graphics.drawable.Drawable a(android.content.Context context, android.content.Context context2, int i, android.content.res.Resources.Theme theme) {
        android.content.Context context3;
        try {
            if (a) {
                if (theme != null) {
                    defpackage.pl plVar = new defpackage.pl(context2, theme);
                    plVar.b(theme.getResources().getConfiguration());
                    context3 = plVar;
                } else {
                    context3 = context2;
                }
                return defpackage.ca.e(context3, i);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
        } catch (java.lang.IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (java.lang.NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        android.content.res.Resources resources = context2.getResources();
        java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
        return resources.getDrawable(i, theme);
    }
}
