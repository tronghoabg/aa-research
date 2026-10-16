package androidx.compose.material3;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MaterialTheme {
    public static final int $stable = 0;
    public static final MaterialTheme INSTANCE = new MaterialTheme();

    private MaterialTheme() {
    }

    public final ColorScheme getColorScheme(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561618718, i2, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:141)");
        }
        ColorScheme colorScheme = ((Values) composer.consume(getLocalMaterialTheme())).getColorScheme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorScheme;
    }

    public final CompositionLocal<Values> getLocalMaterialTheme() {
        return MaterialThemeKt._localMaterialTheme;
    }

    public final CompositionLocal<MotionScheme> getLocalMotionScheme() {
        return CompositionLocalKt.compositionLocalWithComputedDefaultOf(new l() { // from class: androidx.compose.material3.MaterialTheme$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ((MaterialTheme.Values) ((CompositionLocalAccessorScope) obj).getCurrentValue(MaterialTheme.INSTANCE.getLocalMaterialTheme())).getMotionScheme();
            }
        });
    }

    public final MotionScheme getMotionScheme(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-506613891, i2, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:161)");
        }
        MotionScheme motionScheme = ((Values) composer.consume(getLocalMaterialTheme())).getMotionScheme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return motionScheme;
    }

    public final Shapes getShapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(419509830, i2, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:157)");
        }
        Shapes shapes = ((Values) composer.consume(getLocalMaterialTheme())).getShapes();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }

    public final Typography getTypography(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942794935, i2, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:149)");
        }
        Typography typography = ((Values) composer.consume(getLocalMaterialTheme())).getTypography();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }

    public static /* synthetic */ void getLocalMotionScheme$annotations() {
    }

    /* compiled from: WazeSource */
    public final class Values {
        public static final int $stable = 0;
        private final ColorScheme colorScheme;
        private final MotionScheme motionScheme;
        private final Shapes shapes;
        private final Typography typography;

        public /* synthetic */ Values(ColorScheme colorScheme, Typography typography, Shapes shapes, MotionScheme motionScheme, int i2, o oVar) {
            this((i2 & 1) != 0 ? ColorSchemeKt.m4605lightColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null) : colorScheme, (i2 & 2) != 0 ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : typography, (i2 & 4) != 0 ? new Shapes(null, null, null, null, null, 31, null) : shapes, (i2 & 8) != 0 ? MotionScheme.Companion.standard() : motionScheme);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Values values = (Values) obj;
            return x.n(this.colorScheme, values.colorScheme) && x.n(this.typography, values.typography) && x.n(this.shapes, values.shapes) && x.n(this.motionScheme, values.motionScheme);
        }

        public final ColorScheme getColorScheme() {
            return this.colorScheme;
        }

        public final MotionScheme getMotionScheme() {
            return this.motionScheme;
        }

        public final Shapes getShapes() {
            return this.shapes;
        }

        public final Typography getTypography() {
            return this.typography;
        }

        public int hashCode() {
            return (((((this.colorScheme.hashCode() * 31) + this.typography.hashCode()) * 31) + this.shapes.hashCode()) * 31) + this.motionScheme.hashCode();
        }

        public String toString() {
            return "Values(colorScheme=" + this.colorScheme + ", typography=" + this.typography + ", shapes=" + this.shapes + ", motionScheme=" + this.motionScheme + ')';
        }

        public Values(ColorScheme colorScheme, Typography typography, Shapes shapes, MotionScheme motionScheme) {
            this.colorScheme = colorScheme;
            this.typography = typography;
            this.shapes = shapes;
            this.motionScheme = motionScheme;
        }

        public Values() {
            this(null, null, null, null, 15, null);
        }
    }
}
