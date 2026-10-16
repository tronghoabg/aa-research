package androidx.compose.ui.platform;

import android.content.Context;
import androidx.collection.SieveCacheKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {

    @Deprecated
    public static final int FlagContentControls = 4;

    @Deprecated
    public static final int FlagContentIcons = 1;

    @Deprecated
    public static final int FlagContentText = 2;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        x.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j2, boolean z, boolean z2, boolean z3) {
        int i2 = z;
        if (j2 >= SieveCacheKt.NodeLinkMask) {
            return j2;
        }
        if (z2) {
            i2 = (z ? 1 : 0) | 2;
        }
        if (z3) {
            i2 = (i2 == true ? 1 : 0) | 4;
        }
        int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j2, i2);
        if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return recommendedTimeoutMillis;
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
