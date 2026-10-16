package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShapesKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.material.ShapesKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return ShapesKt.LocalShapes$lambda$0();
        }
    });

    static final Shapes LocalShapes$lambda$0() {
        return new Shapes(null, null, null, 7, null);
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }
}
