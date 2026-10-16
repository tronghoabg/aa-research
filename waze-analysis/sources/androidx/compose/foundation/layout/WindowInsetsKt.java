package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    private static final FixedIntInsets EmptyWindowInsets = new FixedIntInsets(0, 0, 0, 0);

    public static final WindowInsets WindowInsets(int i2, int i3, int i4, int i5) {
        return new FixedIntInsets(i2, i3, i4, i5);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if (1 == (i6 & 1)) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return WindowInsets(i2, i3, i4, i5);
    }

    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m2848WindowInsetsa9UjIt4(float f2, float f3, float f4, float f5) {
        return new FixedDpInsets(f2, f3, f4, f5, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m2849WindowInsetsa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2848WindowInsetsa9UjIt4(f2, f3, f4, f5);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i2, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:221)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m2850onlybOOhFvg(WindowInsets windowInsets, int i2) {
        return new LimitInsets(windowInsets, i2, null);
    }

    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets WindowInsets() {
        return EmptyWindowInsets;
    }

    public static final PaddingValues asPaddingValues(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }
}
