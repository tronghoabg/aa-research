package com.google.android.material.focus;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.internal.t;
import com.google.d.b.an;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class d {
    public static int a(int i2, int i3) {
        return ColorUtils.setAlphaComponent(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static int b(View view, int i2) {
        return j(view.getContext(), t.i(view.getContext(), i2, view.getClass().getCanonicalName()));
    }

    public static int c(Context context, int i2, int i3) {
        Integer numE = e(context, i2);
        return numE != null ? numE.intValue() : i3;
    }

    public static int d(int i2, int i3, float f2) {
        return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static Integer e(Context context, int i2) {
        TypedValue typedValueG = t.g(context, i2);
        if (typedValueG != null) {
            return Integer.valueOf(j(context, typedValueG));
        }
        return null;
    }

    public static boolean f(int i2) {
        return i2 != 0 && ColorUtils.calculateLuminance(i2) > 0.5d;
    }

    public static int g(Context context, String str) {
        return j(context, t.i(context, R.attr.colorSurface, str));
    }

    public static Uri h(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static bm i(bm bmVar) {
        return bd.m(bmVar, an.J(), cf.y());
    }

    private static int j(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? ContextCompat.getColor(context, typedValue.resourceId) : typedValue.data;
    }
}
