package com.google.android.material.a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f6173a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f6174b = new FastOutSlowInInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f6175c = new FastOutLinearInInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f6176d = new LinearOutSlowInInterpolator();

    static {
        new DecelerateInterpolator();
    }

    public static int a(int i2, int i3, float f2) {
        return i2 + Math.round(f2 * (i3 - i2));
    }
}
