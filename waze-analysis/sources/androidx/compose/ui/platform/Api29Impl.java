package androidx.compose.ui.platform;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Api29Impl {
    public static final int $stable = 0;
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    public final int getRecommendedTimeoutMillis(android.view.accessibility.AccessibilityManager accessibilityManager, int i2, int i3) {
        return accessibilityManager.getRecommendedTimeoutMillis(i2, i3);
    }
}
