package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TextAutoSize {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ TextAutoSize m3373StepBasedvU0ePk$default(Companion companion, long j2, long j3, long j4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = TextAutoSizeDefaults.INSTANCE.m3376getMinFontSizeXSAIIZE();
            }
            long j5 = j2;
            if ((i2 & 2) != 0) {
                j3 = TextAutoSizeDefaults.INSTANCE.m3375getMaxFontSizeXSAIIZE();
            }
            long j6 = j3;
            if ((i2 & 4) != 0) {
                j4 = TextUnitKt.getSp(0.25d);
            }
            return companion.m3374StepBasedvU0ePk(j5, j6, j4);
        }

        /* renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final TextAutoSize m3374StepBasedvU0ePk(long j2, long j3, long j4) {
            return new AutoSizeStepBased(j2, j3, j4, null);
        }
    }

    boolean equals(Object obj);

    /* renamed from: getFontSize-Ci0_558 */
    long mo3204getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j2, AnnotatedString annotatedString);

    int hashCode();
}
