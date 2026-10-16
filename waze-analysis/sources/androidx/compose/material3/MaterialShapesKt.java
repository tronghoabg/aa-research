package androidx.compose.material3;

import androidx.compose.material3.internal.ShapeUtilKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MaterialShapesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Path toPath(RoundedPolygon roundedPolygon, int i2, Composer composer, int i3, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1218001419, i3, -1, "androidx.compose.material3.toPath (MaterialShapes.kt:67)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = AndroidPath_androidKt.Path();
            composer.updateRememberedValue(objRememberedValue);
        }
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        Path path = (Path) objRememberedValue;
        boolean zChanged = ((((i3 & 112) ^ 48) > 32 && composer.changed(i2)) || (i3 & 48) == 32) | composer.changed(roundedPolygon);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            ShapeUtilKt.toPath(roundedPolygon, path, i2, false, true);
            composer.updateRememberedValue(path);
        } else {
            path = objRememberedValue2;
        }
        Path path2 = path;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return path2;
    }

    public static /* synthetic */ Path toPath$default(Morph morph, float f2, Path path, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return toPath(morph, f2, path, i2);
    }

    public static final Shape toShape(final RoundedPolygon roundedPolygon, final int i2, Composer composer, int i3, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-449076077, i3, -1, "androidx.compose.material3.toShape (MaterialShapes.kt:84)");
        }
        boolean z = true;
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        boolean zChanged = composer.changed(roundedPolygon);
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Shape(roundedPolygon, i2) { // from class: androidx.compose.material3.MaterialShapesKt$toShape$1$1
                private long lastSize = Size.Companion.m8057getUnspecifiedNHjbRc();
                private final Path shapePath;
                private Path workPath;

                {
                    this.shapePath = ShapeUtilKt.toPath$default(roundedPolygon, null, i2, false, false, 13, null);
                }

                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
                    Path path;
                    if (!Size.m8045equalsimpl0(j2, this.lastSize) || (path = this.workPath) == null) {
                        this.lastSize = j2;
                        this.workPath = AndroidPath_androidKt.Path();
                    } else {
                        path.rewind();
                    }
                    Path path2 = this.workPath;
                    x.c(path2);
                    Path.CC.m8542addPathUv8p0NA$default(path2, this.shapePath, 0L, 2, null);
                    int i5 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
                    float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
                    Matrix.m8508scaleimpl$default(fArrM8492constructorimpl$default, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i5), 0.0f, 4, null);
                    path2.mo8119transform58bKbWc(fArrM8492constructorimpl$default);
                    path2.mo8120translatek4lQ0M(Offset.m7984minusMKHz9U(SizeKt.m8059getCenteruvyYCjk(j2), path2.getBounds().m8010getCenterF1C5BW0()));
                    return new Outline.Generic(path2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        MaterialShapesKt$toShape$1$1 materialShapesKt$toShape$1$1 = (MaterialShapesKt$toShape$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return materialShapesKt$toShape$1$1;
    }

    public static final Path toPath(Morph morph, float f2, Path path, int i2) {
        return ShapeUtilKt.toPath$default(morph, f2, path, i2, false, false, 0.0f, 0.0f, 120, null);
    }
}
