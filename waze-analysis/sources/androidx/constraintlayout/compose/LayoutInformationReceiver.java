package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface LayoutInformationReceiver {
    MotionLayoutDebugFlags getForcedDrawDebug();

    int getForcedHeight();

    float getForcedProgress();

    int getForcedWidth();

    LayoutInfoFlags getLayoutInformationMode();

    void onNewProgress(float f2);

    void resetForcedProgress();

    void setLayoutInformation(String str);

    void setUpdateFlag(MutableState<Long> mutableState);
}
