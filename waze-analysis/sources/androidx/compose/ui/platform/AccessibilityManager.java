package androidx.compose.ui.platform;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface AccessibilityManager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AccessibilityManager$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager accessibilityManager, long j2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if (obj == null) {
                return accessibilityManager.calculateRecommendedTimeoutMillis(j2, z & ((i2 & 2) == 0), z2 & ((i2 & 4) == 0), z3 & ((i2 & 8) == 0));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class DefaultImpls {
    }

    long calculateRecommendedTimeoutMillis(long j2, boolean z, boolean z2, boolean z3);
}
