package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo4058apply7g2Lkgo(long j2, float f2, Composer composer, int i2) {
        composer.startReplaceGroup(-1687113661);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i2, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m11163compareTo0680j_4(f2, 0.0f) <= 0 || colors.isLight()) {
            composer.startReplaceGroup(-1095489470);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1095627978);
            j2 = ColorKt.m8273compositeOverOWjLjI(ElevationOverlayKt.m4081calculateForegroundColorCLU3JFs(j2, f2, composer, i2 & 126), j2);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j2;
    }
}
