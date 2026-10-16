package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
final class zzady {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e7) {
            zzeh.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
