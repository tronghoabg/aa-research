package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Indication {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.Indication$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IndicationInstance $default$rememberUpdatedInstance(Indication indication, InteractionSource interactionSource, Composer composer, int i2) {
            composer.startReplaceGroup(1257603829);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257603829, i2, -1, "androidx.compose.foundation.Indication.rememberUpdatedInstance (Indication.kt:74)");
            }
            NoIndicationInstance noIndicationInstance = NoIndicationInstance.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return noIndicationInstance;
        }
    }

    IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i2);
}
