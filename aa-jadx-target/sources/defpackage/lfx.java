package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lfx implements defpackage.gaw {
    private final android.graphics.drawable.AdaptiveIconDrawable e = new android.graphics.drawable.AdaptiveIconDrawable(new android.graphics.drawable.ColorDrawable(), new android.graphics.drawable.ColorDrawable());
    private final android.util.LruCache f = new android.util.LruCache(10);
    public static final defpackage.lfw a = new defpackage.lfw();
    private static final defpackage.yqm d = defpackage.yqm.c("GH.IconShapeProv");
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 10);
    public static final defpackage.cld c = new defpackage.lfv();

    public static final defpackage.lfx b() {
        return a.a();
    }

    @Override // defpackage.gaw
    public final synchronized android.graphics.Path a(int i) {
        android.graphics.Path path;
        android.util.LruCache lruCache = this.f;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        android.graphics.Path path2 = (android.graphics.Path) lruCache.get(numValueOf);
        if (path2 != null) {
            return path2;
        }
        int i2 = defpackage.lfw.b;
        defpackage.acwd acwdVar = defpackage.acwd.a;
        if (acwdVar.fF().d()) {
            defpackage.abpj abpjVar = acwdVar.fF().b().b;
            java.lang.String str = android.os.Build.MANUFACTURER;
            str.getClass();
            java.util.Locale locale = java.util.Locale.ROOT;
            locale.getClass();
            java.lang.String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (!abpjVar.contains(lowerCase)) {
                path = new android.graphics.Path();
                float f = i / 2.0f;
                path.addCircle(f, f, f, android.graphics.Path.Direction.CW);
            }
            d.l().w("Stored icon mask with size %d", i);
            lruCache.put(numValueOf, path);
            return path;
        }
        android.graphics.drawable.AdaptiveIconDrawable adaptiveIconDrawable = this.e;
        ep$.ExternalSyntheticApiModelOutline1.m(adaptiveIconDrawable, new android.graphics.Rect(0, 0, i, i));
        path = new android.graphics.Path(ep$.ExternalSyntheticApiModelOutline1.m(adaptiveIconDrawable));
        d.l().w("Stored icon mask with size %d", i);
        lruCache.put(numValueOf, path);
        return path;
    }
}
