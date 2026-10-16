package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class diq {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static final android.graphics.Typeface a(android.graphics.Typeface typeface, defpackage.dij dijVar, android.content.Context context) throws java.io.IOException {
        java.lang.String strC;
        float fB;
        if (typeface == null) {
            return null;
        }
        java.util.List list = dijVar.a;
        if (list.isEmpty()) {
            return typeface;
        }
        java.lang.ThreadLocal threadLocal = b;
        android.graphics.Paint paint = (android.graphics.Paint) threadLocal.get();
        if (paint == null) {
            paint = new android.graphics.Paint();
            threadLocal.set(paint);
        }
        android.graphics.Paint paint2 = paint;
        a$.ExternalSyntheticApiModelOutline1.m(paint2, (java.lang.String) null);
        paint2.setTypeface(typeface);
        defpackage.dln.t(context);
        int iAi = defpackage.a.ai(context);
        if (iAi == 0) {
            strC = defpackage.dmh.c(list, null, null, null, new defpackage.cyw(11), 31);
        } else {
            int size = list.size();
            java.lang.String strConcat = "";
            boolean z = false;
            for (int i = 0; i < size; i++) {
                defpackage.dig digVar = (defpackage.dig) list.get(i);
                if (defpackage.afga.f(digVar.a(), "wght")) {
                    fB = defpackage.afqt.d(digVar.b() + iAi, 1.0f, 1000.0f);
                    z = true;
                } else {
                    fB = digVar.b();
                }
                if (i != 0) {
                    strConcat = strConcat.concat(",");
                }
                strConcat = ((java.lang.Object) strConcat) + "'" + digVar.a() + "' " + fB;
            }
            if (z) {
                strC = strConcat;
            } else {
                float fD = defpackage.afqt.d(iAi + 400.0f, 1.0f, 1000.0f);
                if (!list.isEmpty()) {
                    strConcat = strConcat.concat(",");
                }
                strC = ((java.lang.Object) strConcat) + "'wght' " + fD;
            }
        }
        a$.ExternalSyntheticApiModelOutline1.m(paint2, strC);
        return paint2.getTypeface();
    }
}
