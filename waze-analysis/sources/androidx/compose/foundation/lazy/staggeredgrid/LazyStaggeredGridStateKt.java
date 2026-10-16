package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridStateKt {
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(final int i2, final int i3, Composer composer, int i4, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(161145796, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:84)");
        }
        boolean z = true;
        if (1 == (i5 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<LazyStaggeredGridState, Object> saver = LazyStaggeredGridState.Companion.getSaver();
        boolean z2 = (((i4 & 14) ^ 6) > 4 && composer.changed(i2)) || (i4 & 6) == 4;
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((((i4 & 112) ^ 48) <= 32 || !composer.changed(i3)) && (i4 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyStaggeredGridStateKt.rememberLazyStaggeredGridState$lambda$0$0(i2, i3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState$lambda$0$0(int i2, int i3) {
        return new LazyStaggeredGridState(i2, i3);
    }
}
