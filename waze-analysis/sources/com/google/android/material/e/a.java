package com.google.android.material.e;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.focus.d;
import com.google.android.material.internal.t;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6508a = (int) Math.round(5.1000000000000005d);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6509b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6510c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6511d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6512e;

    /* renamed from: f, reason: collision with root package name */
    private final float f6513f;

    public a(Context context) {
        boolean zJ = t.j(context, R.attr.elevationOverlayEnabled, false);
        int iC = d.c(context, R.attr.elevationOverlayColor, 0);
        int iC2 = d.c(context, R.attr.elevationOverlayAccentColor, 0);
        int iC3 = d.c(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f6509b = zJ;
        this.f6510c = iC;
        this.f6511d = iC2;
        this.f6512e = iC3;
        this.f6513f = f2;
    }

    public final int a(int i2, float f2) {
        int i3;
        if (!this.f6509b || ColorUtils.setAlphaComponent(i2, 255) != this.f6512e) {
            return i2;
        }
        float fMin = (this.f6513f <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int iD = d.d(ColorUtils.setAlphaComponent(i2, 255), this.f6510c, fMin);
        if (fMin > 0.0f && (i3 = this.f6511d) != 0) {
            iD = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i3, f6508a), iD);
        }
        return ColorUtils.setAlphaComponent(iD, iAlpha);
    }

    public final boolean b() {
        return this.f6509b;
    }
}
