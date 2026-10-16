package com.airbnb.lottie.c;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ej;
import android.view.View;
import com.airbnb.lottie.d.i;
import com.airbnb.lottie.g.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f2089d;

    /* renamed from: f, reason: collision with root package name */
    private ej f2091f;

    /* renamed from: a, reason: collision with root package name */
    private final i f2086a = new i();

    /* renamed from: b, reason: collision with root package name */
    private final Map f2087b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f2088c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f2090e = ".ttf";

    public a(Drawable.Callback callback, ej ejVar) {
        this.f2091f = ejVar;
        if (callback instanceof View) {
            this.f2089d = ((View) callback).getContext().getAssets();
        } else {
            c.a("LottieDrawable must be inside of a view for images to work.");
            this.f2089d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface a(com.airbnb.lottie.d.c r8) {
        /*
            r7 = this;
            com.airbnb.lottie.d.i r0 = r7.f2086a
            java.lang.String r1 = r8.b()
            java.lang.String r2 = r8.d()
            r0.a(r1, r2)
            java.util.Map r1 = r7.f2087b
            java.lang.Object r2 = r1.get(r0)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 != 0) goto L87
            java.lang.String r2 = r8.b()
            java.util.Map r3 = r7.f2088c
            java.lang.Object r4 = r3.get(r2)
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            if (r4 == 0) goto L26
            goto L5a
        L26:
            android.support.v7.widget.ej r4 = r7.f2091f
            if (r4 == 0) goto L2f
            android.graphics.Typeface r4 = r4.l()
            goto L30
        L2f:
            r4 = 0
        L30:
            android.graphics.Typeface r5 = r8.a()
            if (r5 == 0) goto L3b
            android.graphics.Typeface r4 = r8.a()
            goto L5a
        L3b:
            if (r4 != 0) goto L57
            java.lang.String r4 = r7.f2090e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "fonts/"
            r5.<init>(r6)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.content.res.AssetManager r7 = r7.f2089d
            android.graphics.Typeface r7 = android.graphics.Typeface.createFromAsset(r7, r4)
            r4 = r7
        L57:
            r3.put(r2, r4)
        L5a:
            java.lang.String r7 = r8.d()
            java.lang.String r8 = "Italic"
            boolean r8 = r7.contains(r8)
            java.lang.String r2 = "Bold"
            boolean r7 = r7.contains(r2)
            r2 = 0
            if (r8 == 0) goto L72
            if (r7 == 0) goto L71
            r2 = 3
            goto L79
        L71:
            r7 = r2
        L72:
            if (r8 == 0) goto L76
            r2 = 2
            goto L79
        L76:
            if (r7 == 0) goto L79
            r2 = 1
        L79:
            int r7 = r4.getStyle()
            if (r7 == r2) goto L83
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r2)
        L83:
            r1.put(r0, r4)
            return r4
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.a.a(com.airbnb.lottie.d.c):android.graphics.Typeface");
    }

    public final void b(String str) {
        this.f2090e = str;
    }

    public final void c(ej ejVar) {
        this.f2091f = ejVar;
    }
}
