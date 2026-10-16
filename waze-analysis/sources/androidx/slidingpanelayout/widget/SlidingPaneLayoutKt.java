package androidx.slidingpanelayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SlidingPaneLayoutKt {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    private static final long ACCESSIBILITY_EVENT_TIMEOUT_MS = 200;
    private static final int DIVIDER_VIRTUAL_VIEW_ID = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int MIN_TOUCH_TARGET_SIZE = 48;
    private static final String TAG = "SlidingPaneLayout";
    private static final boolean edgeSizeUsingSystemGestureInsets = true;

    private static final boolean getCanExpandWidth(SlidingPaneLayout.LayoutParams layoutParams) {
        return layoutParams.width == -1 || layoutParams.weight > 0.0f;
    }

    private static final boolean getCanInfluenceParentSize(SlidingPaneLayout.LayoutParams layoutParams) {
        if (layoutParams.width == -1 || layoutParams.width == 0) {
            return (layoutParams.height == -1 || layoutParams.height == 0) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getChildHeightMeasureSpec(View view, boolean z, int i2, int i3) {
        return z ? ViewGroup.getChildMeasureSpec(i2, i3, view.getLayoutParams().height) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private static final boolean getWeightOnlyWidth(SlidingPaneLayout.LayoutParams layoutParams) {
        return layoutParams.width == 0 && layoutParams.weight > 0.0f;
    }
}
