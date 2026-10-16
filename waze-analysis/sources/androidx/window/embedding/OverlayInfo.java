package androidx.window.embedding;

import android.app.Activity;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayInfo {
    private final ActivityStack activityStack;
    private final OverlayAttributes currentOverlayAttributes;
    private final String overlayTag;

    public OverlayInfo(String str, OverlayAttributes overlayAttributes, ActivityStack activityStack) {
        x.f(str, "overlayTag");
        this.overlayTag = str;
        this.currentOverlayAttributes = overlayAttributes;
        this.activityStack = activityStack;
    }

    public final boolean contains(Activity activity) {
        x.f(activity, "activity");
        ActivityStack activityStack = this.activityStack;
        if (activityStack != null) {
            return activityStack.contains(activity);
        }
        return false;
    }

    public final ActivityStack getActivityStack() {
        return this.activityStack;
    }

    public final OverlayAttributes getCurrentOverlayAttributes() {
        return this.currentOverlayAttributes;
    }

    public final String getOverlayTag() {
        return this.overlayTag;
    }

    public String toString() {
        return "OverlayInfo: {tag=" + this.overlayTag + ", currentOverlayAttrs=" + this.currentOverlayAttributes + ", activityStack=" + this.activityStack + "}";
    }
}
