package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionSceneKt {
    public static final MotionScene MotionScene(String str, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1620042625, i2, -1, "androidx.constraintlayout.compose.MotionScene (MotionScene.kt:48)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(str)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new JSONMotionScene(str);
            composer.updateRememberedValue(objRememberedValue);
        }
        JSONMotionScene jSONMotionScene = (JSONMotionScene) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jSONMotionScene;
    }
}
