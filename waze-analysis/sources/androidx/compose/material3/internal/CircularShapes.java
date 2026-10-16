package androidx.compose.material3.internal;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.graphics.shapes.CornerRounding;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.graphics.shapes.ShapesKt;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CircularShapes {
    private Morph activeIndicatorMorph;
    private RoundedPolygon activeIndicatorPolygon;
    private Size currentSize;
    private RoundedPolygon trackPolygon;
    private float currentWavelength = -1.0f;
    private final MutableIntState currentVertexCount = SnapshotIntStateKt.mutableIntStateOf(-1);

    public static /* synthetic */ Path getProgressPath$default(CircularShapes circularShapes, float f2, Path path, boolean z, float f3, float f4, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f3 = 0.5f;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.5f;
        }
        circularShapes.getProgressPath(f2, path, z, f3, f4);
        return path;
    }

    public final MutableIntState getCurrentVertexCount() {
        return this.currentVertexCount;
    }

    public final Path getProgressPath(float f2, Path path, boolean z, float f3, float f4) {
        RoundedPolygon roundedPolygon;
        Morph morph = this.activeIndicatorMorph;
        if (morph != null) {
            ShapeUtilKt.toPath$default(morph, f2, path, 0, z, false, f3, f4, 20, null);
            return path;
        }
        if (f2 == 1.0f && (roundedPolygon = this.activeIndicatorPolygon) != null) {
            ShapeUtilKt.toPath$default(roundedPolygon, path, 0, z, false, 10, null);
            return path;
        }
        RoundedPolygon roundedPolygon2 = this.trackPolygon;
        if (roundedPolygon2 != null) {
            ShapeUtilKt.toPath$default(roundedPolygon2, path, 0, z, false, 10, null);
        }
        return path;
    }

    public final Path getTrackPath(Path path) {
        RoundedPolygon roundedPolygon = this.trackPolygon;
        if (roundedPolygon == null) {
            return path;
        }
        ShapeUtilKt.toPath$default(roundedPolygon, path, 0, false, false, 14, null);
        return path;
    }

    /* renamed from: update-Cqks5Fs, reason: not valid java name */
    public final void m6244updateCqks5Fs(long j2, float f2, float f3, boolean z) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Wavelength should be greater than zero");
        }
        if (Size.m8044equalsimpl(j2, this.currentSize) && f2 == this.currentWavelength) {
            if (z && this.activeIndicatorMorph == null) {
                RoundedPolygon roundedPolygon = this.trackPolygon;
                x.c(roundedPolygon);
                RoundedPolygon roundedPolygon2 = this.activeIndicatorPolygon;
                x.c(roundedPolygon2);
                this.activeIndicatorMorph = new Morph(roundedPolygon, roundedPolygon2);
                return;
            }
            return;
        }
        int iRound = (int) Math.round((((Size.m8048getMinDimensionimpl(j2) / 2.0f) - (f3 / 2.0f)) * 6.283185307179586d) / f2);
        MutableIntState mutableIntState = this.currentVertexCount;
        int iMax = Math.max(5, iRound);
        if (iMax != mutableIntState.getIntValue()) {
            this.trackPolygon = ShapesKt.circle$default(RoundedPolygon.Companion, iMax, 0.0f, 0.0f, 0.0f, 14, null).normalized();
            this.activeIndicatorPolygon = ShapesKt.star$default(RoundedPolygon.Companion, iMax, 0.0f, 0.75f, new CornerRounding(0.35f, 0.4f), new CornerRounding(0.5f, 0.0f, 2, null), null, 0.0f, 0.0f, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_5, null).normalized();
            if (z) {
                RoundedPolygon roundedPolygon3 = this.trackPolygon;
                x.c(roundedPolygon3);
                RoundedPolygon roundedPolygon4 = this.activeIndicatorPolygon;
                x.c(roundedPolygon4);
                this.activeIndicatorMorph = new Morph(roundedPolygon3, roundedPolygon4);
            }
        }
        this.currentSize = Size.m8037boximpl(j2);
        this.currentWavelength = f2;
        this.currentVertexCount.setIntValue(iMax);
    }
}
