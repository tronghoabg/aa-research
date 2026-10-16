package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ViewConfigurationApi26Impl {
    public static final ViewConfigurationApi26Impl INSTANCE = new ViewConfigurationApi26Impl();

    private ViewConfigurationApi26Impl() {
    }

    public final float getHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public final float getVerticalScrollFactor(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
