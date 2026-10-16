package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OverscrollConfiguration_androidKt {
    private static final ProvidableCompositionLocal<OverscrollConfiguration> LocalOverscrollConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.foundation.OverscrollConfiguration_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return OverscrollConfiguration_androidKt.LocalOverscrollConfiguration$lambda$0();
        }
    }, 1, null);

    static final OverscrollConfiguration LocalOverscrollConfiguration$lambda$0() {
        return new OverscrollConfiguration(0L, null, 3, null);
    }

    public static final ProvidableCompositionLocal<OverscrollConfiguration> getLocalOverscrollConfiguration() {
        return LocalOverscrollConfiguration;
    }

    public static /* synthetic */ void getLocalOverscrollConfiguration$annotations() {
    }
}
