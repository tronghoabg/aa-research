package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.s;
import h.g.a.t;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CircularProgressDrawingCache {
    private float currentEndProgress;
    private float currentIndicatorTrackGapSize;
    private boolean currentProgressMotionEnabled;
    private float currentStartProgress;
    private Stroke currentStroke;
    private float currentStrokeCapWidth;
    private Stroke currentTrackStroke;
    private final Path fullProgressPath;
    private final Path fullTrackPath;
    private float progressPathLength;
    private final PathMeasure progressPathMeasure;
    private final Path progressPathToDraw;
    private final float[] scaleMatrix;
    private float trackPathLength;
    private final PathMeasure trackPathMeasure;
    private final Path trackPathToDraw;
    private final float[] transformMatrix;
    private float currentAmplitude = -1.0f;
    private float currentWavelength = -1.0f;
    private long currentSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    private float currentWaveOffset = -1.0f;

    public CircularProgressDrawingCache() {
        Stroke stroke = new Stroke(0.0f, 0.0f, 0, 0, null, 31, null);
        this.currentStroke = stroke;
        this.currentTrackStroke = stroke;
        this.scaleMatrix = Matrix.m8492constructorimpl$default(null, 1, null);
        this.transformMatrix = Matrix.m8492constructorimpl$default(null, 1, null);
        this.fullProgressPath = AndroidPath_androidKt.Path();
        this.fullTrackPath = AndroidPath_androidKt.Path();
        this.progressPathToDraw = AndroidPath_androidKt.Path();
        this.trackPathToDraw = AndroidPath_androidKt.Path();
        this.progressPathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        this.trackPathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
    }

    /* renamed from: processPath-HkQT9uY, reason: not valid java name */
    private final void m6241processPathHkQT9uY(Path path, long j2, float[] fArr) {
        path.mo8119transform58bKbWc(fArr);
        path.mo8120translatek4lQ0M(Offset.m7984minusMKHz9U(SizeKt.m8059getCenteruvyYCjk(j2), path.getBounds().m8010getCenterF1C5BW0()));
    }

    private final void updateDrawPaths(boolean z, float f2, float f3, float f4) {
        if (Size.m8045equalsimpl0(this.currentSize, Size.Companion.m8057getUnspecifiedNHjbRc())) {
            throw new IllegalArgumentException("updateDrawPaths was called before updateFullPaths");
        }
        if (!z && this.currentStartProgress == f2 && this.currentEndProgress == f3 && this.currentWaveOffset == f4) {
            return;
        }
        this.trackPathToDraw.rewind();
        this.progressPathToDraw.rewind();
        float f5 = this.progressPathLength;
        float f6 = f2 * f5;
        float f7 = f3 * f5;
        float fMin = Math.min(f7, this.currentIndicatorTrackGapSize);
        float fMin2 = Math.min(f7, this.currentStrokeCapWidth);
        float f8 = fMin + fMin2 + fMin2;
        if (this.currentProgressMotionEnabled) {
            float f9 = f4 < 0.0f ? 0.0f : f4;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            float f10 = this.progressPathLength * f9;
            PathMeasure.CC.getSegment$default(this.progressPathMeasure, f6 + f10, f7 + f10, this.progressPathToDraw, false, 8, null);
            float f11 = (f9 * 360.0f) % 360.0f;
            if (f11 != 0.0f) {
                Path path = this.fullProgressPath;
                Path path2 = this.progressPathToDraw;
                float f12 = -Float.intBitsToFloat((int) (path.getBounds().m8010getCenterF1C5BW0() >> 32));
                path2.mo8120translatek4lQ0M((Float.floatToRawIntBits(-Float.intBitsToFloat((int) (r6.m8010getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f12) << 32));
                Matrix.m8501resetimpl(this.transformMatrix);
                Path path3 = this.progressPathToDraw;
                float[] fArr = this.transformMatrix;
                Matrix.m8506rotateZimpl(fArr, -f11);
                path3.mo8119transform58bKbWc(fArr);
                this.progressPathToDraw.mo8120translatek4lQ0M((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r6.m8010getCenterF1C5BW0() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r6.m8010getCenterF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            }
        } else {
            PathMeasure.CC.getSegment$default(this.progressPathMeasure, f6, f7, this.progressPathToDraw, false, 8, null);
        }
        float f13 = this.trackPathLength;
        if (f13 > 0.0f) {
            PathMeasure.CC.getSegment$default(this.trackPathMeasure, (f3 * f13) + f8, f13 - f8, this.trackPathToDraw, false, 8, null);
        }
        this.currentStartProgress = f2;
        this.currentEndProgress = f3;
        this.currentWaveOffset = f4;
    }

    /* renamed from: updateFullPaths-SaZ-u-8, reason: not valid java name */
    private final boolean m6242updateFullPathsSaZu8(long j2, t<? super Float, ? super Float, ? super Float, ? super Size, ? super Boolean, ? super Path, ? extends Path> tVar, s<? super Float, ? super Float, ? super Float, ? super Size, ? super Path, ? extends Path> sVar, boolean z, float f2, float f3, float f4, Stroke stroke, Stroke stroke2) {
        if (Size.m8045equalsimpl0(this.currentSize, j2) && this.currentAmplitude == f2 && this.currentWavelength == f3 && x.n(this.currentStroke, stroke) && x.n(this.currentTrackStroke, stroke2) && this.currentIndicatorTrackGapSize == f4 && this.currentProgressMotionEnabled == z) {
            return false;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        this.currentStrokeCapWidth = (!(StrokeCap.m8628equalsimpl0(stroke.m8908getCapKaPHkGw(), StrokeCap.Companion.m8632getButtKaPHkGw()) && StrokeCap.m8628equalsimpl0(stroke2.m8908getCapKaPHkGw(), StrokeCap.Companion.m8632getButtKaPHkGw())) && fIntBitsToFloat <= fIntBitsToFloat2) ? Math.max(stroke.getWidth() / 2.0f, stroke2.getWidth() / 2.0f) : 0.0f;
        Matrix.m8501resetimpl(this.scaleMatrix);
        Matrix.m8508scaleimpl$default(this.scaleMatrix, fIntBitsToFloat2 - stroke.getWidth(), fIntBitsToFloat - stroke.getWidth(), 0.0f, 4, null);
        this.fullProgressPath.rewind();
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        tVar.invoke(fValueOf, fValueOf2, Float.valueOf(stroke.getWidth()), Size.m8037boximpl(j2), Boolean.valueOf(z), this.fullProgressPath);
        m6241processPathHkQT9uY(this.fullProgressPath, j2, this.scaleMatrix);
        this.progressPathMeasure.setPath(this.fullProgressPath, true);
        PathMeasure pathMeasure = this.progressPathMeasure;
        this.progressPathLength = z ? pathMeasure.getLength() / 2.0f : pathMeasure.getLength();
        this.fullTrackPath.rewind();
        if (sVar.invoke(fValueOf, fValueOf2, Float.valueOf(stroke.getWidth()), Size.m8037boximpl(j2), this.fullTrackPath) != null) {
            m6241processPathHkQT9uY(this.fullTrackPath, j2, this.scaleMatrix);
            this.trackPathMeasure.setPath(this.fullTrackPath, true);
            this.trackPathLength = this.trackPathMeasure.getLength();
        } else {
            this.trackPathLength = 0.0f;
        }
        this.currentSize = j2;
        this.currentAmplitude = f2;
        this.currentWavelength = f3;
        this.currentStroke = stroke;
        this.currentTrackStroke = stroke2;
        this.currentIndicatorTrackGapSize = f4;
        this.currentProgressMotionEnabled = z;
        return true;
    }

    public final float getCurrentStrokeCapWidth() {
        return this.currentStrokeCapWidth;
    }

    public final Path getFullProgressPath() {
        return this.fullProgressPath;
    }

    public final Path getFullTrackPath() {
        return this.fullTrackPath;
    }

    public final PathMeasure getProgressPathMeasure() {
        return this.progressPathMeasure;
    }

    public final Path getProgressPathToDraw() {
        return this.progressPathToDraw;
    }

    public final PathMeasure getTrackPathMeasure() {
        return this.trackPathMeasure;
    }

    public final Path getTrackPathToDraw() {
        return this.trackPathToDraw;
    }

    public final void setCurrentStrokeCapWidth(float f2) {
        this.currentStrokeCapWidth = f2;
    }

    /* renamed from: updatePaths-bLEYqPY, reason: not valid java name */
    public final void m6243updatePathsbLEYqPY(long j2, t<? super Float, ? super Float, ? super Float, ? super Size, ? super Boolean, ? super Path, ? extends Path> tVar, s<? super Float, ? super Float, ? super Float, ? super Size, ? super Path, ? extends Path> sVar, boolean z, float f2, float f3, float f4, float f5, float f6, float f7, Stroke stroke, Stroke stroke2) {
        updateDrawPaths(m6242updateFullPathsSaZu8(j2, tVar, sVar, z, f4, f6, f7, stroke, stroke2), f2, f3, f5);
    }
}
