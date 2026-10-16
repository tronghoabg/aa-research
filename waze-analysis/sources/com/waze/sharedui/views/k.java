package com.waze.sharedui.views;

import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Interpolator f39250a;

    /* renamed from: b, reason: collision with root package name */
    public static final Interpolator f39251b;

    static {
        PathInterpolatorCompat.create(1.0f, 0.0f, 0.9f, 1.0f);
        PathInterpolatorCompat.create(0.0f, 0.6f, 0.0f, 1.0f);
        PathInterpolatorCompat.create(1.0f, 0.0f, 0.7f, 1.0f);
        f39250a = PathInterpolatorCompat.create(0.3f, 0.0f, 0.0f, 1.0f);
        PathInterpolatorCompat.create(0.5f, 0.0f, 0.25f, 1.0f);
        PathInterpolatorCompat.create(0.5f, 0.0f, 0.5f, -0.5f);
        f39251b = PathInterpolatorCompat.create(0.0f, 1.5f, 0.25f, 1.0f);
        PathInterpolatorCompat.create(0.2f, 1.25f, 0.5f, 1.0f);
        PathInterpolatorCompat.create(0.9f, 0.01f, 0.99f, 0.75f);
        PathInterpolatorCompat.create(0.2f, 0.7f, -0.01f, 1.0f);
    }
}
