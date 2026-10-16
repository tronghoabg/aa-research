package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DefaultHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    private final View view;

    public DefaultHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo9034performHapticFeedbackCdsT49E(int i2) {
        ViewCompat.performHapticFeedback(this.view, HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9042getConfirm5zf0vsI()) ? 16 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9043getContextClick5zf0vsI()) ? 6 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9044getGestureEnd5zf0vsI()) ? 13 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9045getGestureThresholdActivate5zf0vsI()) ? 23 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9046getKeyboardTap5zf0vsI()) ? 3 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9047getLongPress5zf0vsI()) ? 0 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9048getReject5zf0vsI()) ? 17 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9049getSegmentFrequentTick5zf0vsI()) ? 27 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9050getSegmentTick5zf0vsI()) ? 26 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9051getTextHandleMove5zf0vsI()) ? 9 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9052getToggleOff5zf0vsI()) ? 22 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9053getToggleOn5zf0vsI()) ? 21 : HapticFeedbackType.m9038equalsimpl0(i2, HapticFeedbackType.Companion.m9054getVirtualKey5zf0vsI()) ? 1 : -1);
    }
}
