package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class woa {
    private static final int[] a = {com.google.android.projection.gearhead.R.attr.dynamicColorThemeOverlay};
    private static final defpackage.wnz b;
    private static final defpackage.wnz c;
    private static final java.util.Map d;
    private static final java.util.Map e;

    static {
        defpackage.wnx wnxVar = new defpackage.wnx();
        b = wnxVar;
        defpackage.wny wnyVar = new defpackage.wny();
        c = wnyVar;
        java.util.HashMap map = new java.util.HashMap();
        map.put("fcnt", wnxVar);
        map.put("google", wnxVar);
        map.put("hmd global", wnxVar);
        map.put("infinix", wnxVar);
        map.put("infinix mobility limited", wnxVar);
        map.put("itel", wnxVar);
        map.put("kyocera", wnxVar);
        map.put("lenovo", wnxVar);
        map.put("lge", wnxVar);
        map.put("meizu", wnxVar);
        map.put("motorola", wnxVar);
        map.put("nothing", wnxVar);
        map.put("oneplus", wnxVar);
        map.put("oppo", wnxVar);
        map.put("realme", wnxVar);
        map.put("robolectric", wnxVar);
        map.put("samsung", wnyVar);
        map.put("sharp", wnxVar);
        map.put("shift", wnxVar);
        map.put("sony", wnxVar);
        map.put("tcl", wnxVar);
        map.put("tecno", wnxVar);
        map.put("tecno mobile limited", wnxVar);
        map.put("vivo", wnxVar);
        map.put("wingtech", wnxVar);
        map.put("xiaomi", wnxVar);
        d = j$.util.DesugarCollections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("asus", wnxVar);
        map2.put("jio", wnxVar);
        e = j$.util.DesugarCollections.unmodifiableMap(map2);
    }

    private woa() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    public static void a(android.app.Activity activity, defpackage.wob wobVar) {
        android.view.View viewPeekDecorView;
        android.content.Context context;
        defpackage.wnz wnzVar;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        int i = defpackage.dwc.a;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            if (android.os.Build.VERSION.SDK_INT < 32) {
                wnzVar = (defpackage.wnz) d.get(android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ROOT));
                if (wnzVar == null) {
                    wnzVar = (defpackage.wnz) e.get(android.os.Build.BRAND.toLowerCase(java.util.Locale.ROOT));
                }
                if (wnzVar != null) {
                    return;
                } else {
                    return;
                }
            }
            java.lang.String str = android.os.Build.VERSION.CODENAME;
            str.getClass();
            if (!defpackage.dwc.a("Tiramisu", str)) {
                wnzVar = (defpackage.wnz) d.get(android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ROOT));
                if (wnzVar == null) {
                    wnzVar = (defpackage.wnz) e.get(android.os.Build.BRAND.toLowerCase(java.util.Locale.ROOT));
                }
                if (wnzVar != null || !wnzVar.a()) {
                    return;
                }
            }
        }
        int i2 = wobVar.a;
        if (i2 == 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(a);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            i2 = resourceId;
        }
        activity.getTheme().applyStyle(i2, true);
        android.view.Window window = activity.getWindow();
        android.content.res.Resources.Theme theme = null;
        if (window != null && (viewPeekDecorView = window.peekDecorView()) != null && (context = viewPeekDecorView.getContext()) != null) {
            theme = context.getTheme();
        }
        if (theme != null) {
            theme.applyStyle(i2, true);
        }
    }
}
