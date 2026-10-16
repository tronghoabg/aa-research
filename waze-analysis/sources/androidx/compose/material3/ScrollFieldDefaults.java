package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScrollFieldDefaults {
    public static final int $stable = 0;
    public static final ScrollFieldDefaults INSTANCE = new ScrollFieldDefaults();
    private static final float ScrollFieldHeight = 200.0f;

    private ScrollFieldDefaults() {
    }

    static final ab Item$lambda$0(ScrollFieldDefaults scrollFieldDefaults, int i2, boolean z, ScrollFieldColors scrollFieldColors, int i3, int i4, Composer composer, int i5) {
        scrollFieldDefaults.Item(i2, z, scrollFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Item(final int r33, final boolean r34, androidx.compose.material3.ScrollFieldColors r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScrollFieldDefaults.Item(int, boolean, androidx.compose.material3.ScrollFieldColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public final ScrollFieldColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554025106, i2, -1, "androidx.compose.material3.ScrollFieldDefaults.colors (ScrollField.kt:211)");
        }
        ScrollFieldColors defaultScrollFieldColors = getDefaultScrollFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultScrollFieldColors;
    }

    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final ScrollFieldColors m5436colorsRGew2ao(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130128049, i2, -1, "androidx.compose.material3.ScrollFieldDefaults.colors (ScrollField.kt:229)");
        }
        long j5 = j2;
        ScrollFieldColors scrollFieldColorsM5432copyysEtTa8 = getDefaultScrollFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 >> 6) & 112).m5432copyysEtTa8(j5, j3, j4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollFieldColorsM5432copyysEtTa8;
    }

    public final ScrollFieldColors getDefaultScrollFieldColors(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2102859049, i2, -1, "androidx.compose.material3.ScrollFieldDefaults.<get-defaultScrollFieldColors> (ScrollField.kt:237)");
        }
        ScrollFieldColors defaultScrollFieldColorsCached$material3 = colorScheme.getDefaultScrollFieldColorsCached$material3();
        if (defaultScrollFieldColorsCached$material3 == null) {
            composer.startReplaceGroup(2082063747);
            ScrollFieldColors scrollFieldColors = new ScrollFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4583getSurfaceContainerLowest0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4566getOutline0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4560getOnSurface0d7_KjU(), null);
            colorScheme.setDefaultScrollFieldColorsCached$material3(scrollFieldColors);
            composer.endReplaceGroup();
            defaultScrollFieldColorsCached$material3 = scrollFieldColors;
        } else {
            composer.startReplaceGroup(2082052246);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultScrollFieldColorsCached$material3;
    }

    /* renamed from: getScrollFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m5437getScrollFieldHeightD9Ej5fM() {
        return ScrollFieldHeight;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1744892529, i2, -1, "androidx.compose.material3.ScrollFieldDefaults.<get-shape> (ScrollField.kt:208)");
        }
        CornerBasedShape large = ShapeDefaults.INSTANCE.getLarge();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return large;
    }
}
