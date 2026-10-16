package com.applovin.impl.sdk;

import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.zzgwt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder g(zzgwt zzgwtVar) {
        return new RouteDiscoveryPreference.Builder(zzgwtVar, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i5, Interpolator interpolator, long j8) {
        return new WindowInsetsAnimation(i5, interpolator, j8);
    }

    public static /* synthetic */ void z() {
    }
}
