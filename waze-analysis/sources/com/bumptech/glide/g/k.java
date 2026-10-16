package com.bumptech.glide.g;

import android.os.SystemClock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2906a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final double f2907b = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j2) {
        return (SystemClock.elapsedRealtimeNanos() - j2) * f2907b;
    }
}
