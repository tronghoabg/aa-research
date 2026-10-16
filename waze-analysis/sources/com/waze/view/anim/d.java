package com.waze.view.anim;

import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Interpolator f44973a;

    /* renamed from: b, reason: collision with root package name */
    public static final Interpolator f44974b;

    /* renamed from: c, reason: collision with root package name */
    public static final Interpolator f44975c;

    static {
        PathInterpolatorCompat.create(1.0f, 0.0f, 0.9f, 1.0f);
        PathInterpolatorCompat.create(0.0f, 0.6f, 0.0f, 1.0f);
        PathInterpolatorCompat.create(1.0f, 0.0f, 0.7f, 1.0f);
        PathInterpolatorCompat.create(0.3f, 0.0f, 0.0f, 1.0f);
        f44973a = PathInterpolatorCompat.create(0.5f, 0.0f, 0.25f, 1.0f);
        f44974b = PathInterpolatorCompat.create(0.5f, 0.0f, 0.5f, -0.5f);
        f44975c = PathInterpolatorCompat.create(0.0f, 1.5f, 0.25f, 1.0f);
        PathInterpolatorCompat.create(0.2f, 1.25f, 0.5f, 1.0f);
    }
}
