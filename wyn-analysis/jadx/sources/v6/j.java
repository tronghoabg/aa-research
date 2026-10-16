package v6;

import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public abstract class j {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
        } catch (IllegalStateException e7) {
            AbstractC4256a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
