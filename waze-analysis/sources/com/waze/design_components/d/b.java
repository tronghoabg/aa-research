package com.waze.design_components.d;

import android.content.Context;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Shape;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    private static /* synthetic */ int a(Context context, boolean z, boolean z2) {
        x.f(context, "context");
        int i2 = R.color.Grey900;
        if (z2) {
            if (z) {
                i2 = R.color.White;
            }
        } else if (!z) {
            i2 = R.color.Grey200;
        }
        return ContextCompat.getColor(context, i2);
    }

    public static int c(View view) {
        Insets insets;
        x.f(view, "<this>");
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(2)) == null) {
            return 0;
        }
        return Math.abs(insets.top - insets.bottom);
    }

    public static void d(View view) {
        x.f(view, "<this>");
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
    }

    public static void e(View view, float f2) {
        x.f(view, "<this>");
        view.setOutlineProvider(new a(view, f2));
    }

    public static int f(Context context, boolean z, boolean z2) {
        return a(context, z, z2);
    }

    public static int g(Context context, boolean z, boolean z2) {
        return a(context, z, z2);
    }

    public static Modifier h(Modifier modifier, Shape shape) {
        x.f(modifier, "<this>");
        x.f(shape, "shape");
        return ShadowKt.m7823shadows4CzXII$default(modifier, 1.0f, shape, false, 0L, 0L, 28, null);
    }

    public static Modifier i(Modifier modifier, Shape shape) {
        x.f(modifier, "<this>");
        x.f(shape, "shape");
        return ShadowKt.m7823shadows4CzXII$default(modifier, 3.0f, shape, false, 0L, 0L, 28, null);
    }

    public static Modifier j(Modifier modifier, Shape shape) {
        x.f(modifier, "<this>");
        x.f(shape, "shape");
        return ShadowKt.m7823shadows4CzXII$default(modifier, 6.0f, shape, false, 0L, 0L, 28, null);
    }

    public static Modifier k(Modifier modifier, Shape shape) {
        x.f(modifier, "<this>");
        x.f(shape, "shape");
        return ShadowKt.m7823shadows4CzXII$default(ShadowKt.m7823shadows4CzXII$default(ShadowKt.m7823shadows4CzXII$default(modifier, 3.0f, shape, false, 0L, 0L, 24, null), 3.0f, shape, false, 0L, 0L, 24, null), 6.0f, shape, false, 0L, 0L, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.design_components.g.c n(android.util.AttributeSet r6, com.waze.design_components.g.d r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "schema"
            h.g.b.x.f(r7, r0)
            java.lang.String r1 = "attrName"
            h.g.b.x.f(r8, r1)
            com.waze.design_components.g.c r2 = new com.waze.design_components.g.c
            h.g.b.x.f(r7, r0)
            h.g.b.x.f(r8, r1)
            r3 = 0
            if (r6 == 0) goto L2b
            java.lang.String r4 = r7.a()
            r5 = 0
            int r4 = r6.getAttributeResourceValue(r4, r8, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 > 0) goto L2c
        L2b:
            r4 = r3
        L2c:
            h.g.b.x.f(r7, r0)
            h.g.b.x.f(r8, r1)
            if (r6 == 0) goto L3c
            java.lang.String r7 = r7.a()
            java.lang.String r3 = r6.getAttributeValue(r7, r8)
        L3c:
            r2.<init>(r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.design_components.d.b.n(android.util.AttributeSet, com.waze.design_components.g.d, java.lang.String):com.waze.design_components.g.c");
    }

    private b() {
        throw null;
    }
}
