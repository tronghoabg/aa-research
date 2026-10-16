package androidx.navigation.compose.internal;

import androidx.activity.BackEventCompat;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h.ab;
import h.c.e;
import h.g.a.p;
import java.util.UUID;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavComposeUtils_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void PredictiveBackHandler(boolean z, final p<? super k<BackEventCompat>, ? super e<? super ab>, ? extends Object> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1818896922);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            boolean z3 = (z ? 1 : 0) | i5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818896922, i4, -1, "androidx.navigation.compose.internal.PredictiveBackHandler (NavComposeUtils.android.kt:30)");
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(1 == z3, pVar, composerStartRestartGroup, i4 & 126, 0);
            z2 = z3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                z2 = z3;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z4 = true == z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.navigation.compose.internal.NavComposeUtils_androidKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return NavComposeUtils_androidKt.PredictiveBackHandler$lambda$0(z4, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab PredictiveBackHandler$lambda$0(boolean z, p pVar, int i2, int i3, Composer composer, int i4) {
        PredictiveBackHandler(z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
