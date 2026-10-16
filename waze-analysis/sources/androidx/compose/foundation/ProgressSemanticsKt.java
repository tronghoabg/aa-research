package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;
import h.k.e;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    public static final Modifier progressSemantics(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new l() { // from class: androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressSemanticsKt.progressSemantics$lambda$1((SemanticsPropertyReceiver) obj);
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f2, e eVar, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            eVar = n.b(0.0f, 1.0f);
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return progressSemantics(modifier, f2, eVar, i2);
    }

    static final ab progressSemantics$lambda$0(float f2, e eVar, int i2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) n.q(Float.valueOf(f2), eVar)).floatValue(), eVar, i2));
        return ab.f48028a;
    }

    static final ab progressSemantics$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
        return ab.f48028a;
    }

    public static final Modifier progressSemantics(Modifier modifier, final float f2, final e<Float> eVar, final int i2) {
        return SemanticsModifierKt.semantics(modifier, true, new l() { // from class: androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ProgressSemanticsKt.progressSemantics$lambda$0(f2, eVar, i2, (SemanticsPropertyReceiver) obj);
            }
        });
    }
}
