package androidx.compose.material3;

import android.media.AudioManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimeInputErrorHandlerImpl implements TimeInputErrorHandler {
    private final AudioManager audioManager;
    private final HapticFeedback haptics;
    private final boolean isTouchExplorationEnabled;

    public TimeInputErrorHandlerImpl(HapticFeedback hapticFeedback, AudioManager audioManager, boolean z) {
        this.haptics = hapticFeedback;
        this.audioManager = audioManager;
        this.isTouchExplorationEnabled = z;
    }

    @Override // androidx.compose.material3.TimeInputErrorHandler
    public void onError() {
        this.haptics.mo9034performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m9048getReject5zf0vsI());
        if (this.isTouchExplorationEnabled) {
            return;
        }
        this.audioManager.playSoundEffect(9, 0.5f);
    }
}
