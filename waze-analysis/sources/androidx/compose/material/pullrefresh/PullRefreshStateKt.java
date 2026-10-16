package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.c.k;
import h.g.a.a;
import h.g.b.an;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m4299rememberPullRefreshStateUuyPYSY(final boolean z, a<ab> aVar, float f2, float f3, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            f2 = PullRefreshDefaults.INSTANCE.m4291getRefreshThresholdD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f3 = PullRefreshDefaults.INSTANCE.m4292getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i2, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (Dp.m11163compareTo0680j_4(f2, 0.0f) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        af afVar = (af) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, (i2 >> 3) & 14);
        final an anVar = new an();
        final an anVar2 = new an();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        anVar.f48102a = density.mo2127toPx0680j_4(f2);
        anVar2.f48102a = density.mo2127toPx0680j_4(f3);
        boolean zChanged = composer.changed(afVar);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new PullRefreshState(afVar, stateRememberUpdatedState, anVar2.f48102a, anVar.f48102a);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final PullRefreshState pullRefreshState = (PullRefreshState) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(pullRefreshState);
        boolean z2 = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(z)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zChanged2 = zChangedInstance | z2 | composer.changed(anVar.f48102a) | composer.changed(anVar2.f48102a);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new a() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return PullRefreshStateKt.rememberPullRefreshState_UuyPYSY$lambda$3$0(pullRefreshState, z, anVar, anVar2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.SideEffect((a) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullRefreshState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberPullRefreshState_UuyPYSY$lambda$3$0(PullRefreshState pullRefreshState, boolean z, an anVar, an anVar2) {
        pullRefreshState.setRefreshing$material(z);
        pullRefreshState.setThreshold$material(anVar.f48102a);
        pullRefreshState.setRefreshingOffset$material(anVar2.f48102a);
        return ab.f48028a;
    }
}
