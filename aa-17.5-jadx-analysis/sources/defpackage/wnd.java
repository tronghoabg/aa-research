package defpackage;

import com.google.android.projection.gearhead.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wnd {
    private static final int[] a = {R.attr.dynamicColorThemeOverlay};
    private static final wnc b;
    private static final wnc c;
    private static final Map d;
    private static final Map e;

    static {
        wna wnaVar = new wna();
        b = wnaVar;
        wnb wnbVar = new wnb();
        c = wnbVar;
        HashMap map = new HashMap();
        map.put("fcnt", wnaVar);
        map.put("google", wnaVar);
        map.put("hmd global", wnaVar);
        map.put("infinix", wnaVar);
        map.put("infinix mobility limited", wnaVar);
        map.put("itel", wnaVar);
        map.put("kyocera", wnaVar);
        map.put("lenovo", wnaVar);
        map.put("lge", wnaVar);
        map.put("meizu", wnaVar);
        map.put("motorola", wnaVar);
        map.put("nothing", wnaVar);
        map.put("oneplus", wnaVar);
        map.put("oppo", wnaVar);
        map.put("realme", wnaVar);
        map.put("robolectric", wnaVar);
        map.put("samsung", wnbVar);
        map.put("sharp", wnaVar);
        map.put("shift", wnaVar);
        map.put("sony", wnaVar);
        map.put("tcl", wnaVar);
        map.put("tecno", wnaVar);
        map.put("tecno mobile limited", wnaVar);
        map.put("vivo", wnaVar);
        map.put("wingtech", wnaVar);
        map.put("xiaomi", wnaVar);
        d = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", wnaVar);
        map2.put("jio", wnaVar);
        e = DesugarCollections.unmodifiableMap(map2);
    }

    private wnd() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.app.Activity r3, defpackage.wne r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L8
            goto L85
        L8:
            int r0 = defpackage.dvv.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L4e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L24
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r1 = "Tiramisu"
            boolean r0 = defpackage.dvv.a(r1, r0)
            if (r0 == 0) goto L24
            goto L4e
        L24:
            java.util.Map r0 = defpackage.wnd.d
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.Object r0 = r0.get(r1)
            wnc r0 = (defpackage.wnc) r0
            if (r0 != 0) goto L46
            java.util.Map r0 = defpackage.wnd.e
            java.lang.String r1 = android.os.Build.BRAND
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.Object r0 = r0.get(r1)
            wnc r0 = (defpackage.wnc) r0
        L46:
            if (r0 == 0) goto L85
            boolean r0 = r0.a()
            if (r0 == 0) goto L85
        L4e:
            int r4 = r4.a
            if (r4 != 0) goto L61
            int[] r4 = defpackage.wnd.a
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4)
            r0 = 0
            int r0 = r4.getResourceId(r0, r0)
            r4.recycle()
            r4 = r0
        L61:
            android.content.res.Resources$Theme r0 = r3.getTheme()
            r1 = 1
            r0.applyStyle(r4, r1)
            android.view.Window r3 = r3.getWindow()
            r0 = 0
            if (r3 == 0) goto L80
            android.view.View r3 = r3.peekDecorView()
            if (r3 == 0) goto L80
            android.content.Context r3 = r3.getContext()
            if (r3 == 0) goto L80
            android.content.res.Resources$Theme r0 = r3.getTheme()
        L80:
            if (r0 == 0) goto L85
            r0.applyStyle(r4, r1)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnd.a(android.app.Activity, wne):void");
    }
}
