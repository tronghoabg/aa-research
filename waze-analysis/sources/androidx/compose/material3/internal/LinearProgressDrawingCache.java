package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LinearProgressDrawingCache {
    private float currentIndicatorTrackGapSize;
    private float[] currentProgressFractions;
    private Stroke currentStroke;
    private float currentStrokeCapWidth;
    private Stroke currentTrackStroke;
    private final Path fullProgressPath;
    private final PathMeasure pathMeasure;
    private float progressPathScale;
    private Path[] progressPathsToDraw;
    private final Path trackPathToDraw;
    private float currentWavelength = -1.0f;
    private float currentAmplitude = -1.0f;
    private long currentSize = Size.Companion.m8057getUnspecifiedNHjbRc();
    private float currentWaveOffset = -1.0f;

    public LinearProgressDrawingCache() {
        Stroke stroke = new Stroke(0.0f, 0.0f, 0, 0, null, 31, null);
        this.currentStroke = stroke;
        this.currentTrackStroke = stroke;
        this.progressPathScale = 1.0f;
        this.fullProgressPath = AndroidPath_androidKt.Path();
        this.pathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        this.trackPathToDraw = AndroidPath_androidKt.Path();
    }

    private final void updateDrawPaths(boolean z, float[] fArr, float f2, float f3) {
        int i2;
        float f4;
        Path path;
        float[] fArr2;
        if (Size.m8045equalsimpl0(this.currentSize, Size.Companion.m8057getUnspecifiedNHjbRc())) {
            throw new IllegalArgumentException("updateDrawPaths was called before updateFullPaths");
        }
        Path[] pathArr = this.progressPathsToDraw;
        x.c(pathArr);
        int length = pathArr.length;
        int i3 = 1;
        int length2 = fArr.length >> 1;
        if (length != length2) {
            StringBuilder sb = new StringBuilder("the given progress fraction pairs do not match the expected number of progress paths to draw. updateDrawPaths called with ");
            sb.append(length2);
            sb.append(" pairs, while there are ");
            Path[] pathArr2 = this.progressPathsToDraw;
            x.c(pathArr2);
            sb.append(pathArr2.length);
            sb.append(" expected progress paths.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!z && Arrays.equals(this.currentProgressFractions, fArr) && this.currentAmplitude == f2 && this.currentWaveOffset == f3) {
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.currentSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.currentSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f;
        float fMin = this.currentIndicatorTrackGapSize;
        float f5 = fIntBitsToFloat - this.currentStrokeCapWidth;
        this.trackPathToDraw.rewind();
        this.trackPathToDraw.moveTo(f5, fIntBitsToFloat2);
        Path[] pathArr3 = this.progressPathsToDraw;
        x.c(pathArr3);
        int length3 = pathArr3.length;
        float f6 = f5;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length3) {
            Path[] pathArr4 = this.progressPathsToDraw;
            x.c(pathArr4);
            pathArr4[i4].rewind();
            int i6 = i4 + i4;
            float f7 = fArr[i6];
            float f8 = fArr[i6 + i3];
            float f9 = f7 * fIntBitsToFloat;
            float f10 = f8 * fIntBitsToFloat;
            if (i4 == 0) {
                float f11 = this.currentStrokeCapWidth;
                fMin = f10 < f11 ? 0.0f : Math.min(f10 - f11, this.currentIndicatorTrackGapSize);
                i5 = f10 >= this.currentStrokeCapWidth ? i3 : 0;
                i2 = 0;
            } else {
                i2 = i4;
            }
            float f12 = fMin;
            int i7 = i5;
            float f13 = this.currentStrokeCapWidth;
            float f14 = fIntBitsToFloat - f13;
            float f15 = f10 < f13 ? f13 : f10;
            if (f9 >= f13) {
                f13 = f9;
            }
            float fAbs = Math.abs(f8 - f7);
            float f16 = f15 > f14 ? f14 : f15;
            float f17 = f13 > f14 ? f14 : f13;
            if (fAbs > 0.0f) {
                float f18 = f2 == 0.0f ? 0.0f : this.currentWavelength * f3;
                PathMeasure pathMeasure = this.pathMeasure;
                float f19 = this.progressPathScale;
                Path[] pathArr5 = this.progressPathsToDraw;
                x.c(pathArr5);
                PathMeasure.CC.getSegment$default(pathMeasure, (f17 + f18) * f19, (f16 + f18) * f19, pathArr5[i2], false, 8, null);
                Path[] pathArr6 = this.progressPathsToDraw;
                x.c(pathArr6);
                Path path2 = pathArr6[i2];
                float[] fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, i3, null);
                Matrix.m8514translateimpl$default(fArrM8492constructorimpl$default, f18 > 0.0f ? -f18 : 0.0f, (1.0f - f2) * fIntBitsToFloat2, 0.0f, 4, null);
                if (f2 != 1.0f) {
                    path = path2;
                    fArr2 = fArrM8492constructorimpl$default;
                    Matrix.m8508scaleimpl$default(fArr2, 0.0f, f2, 0.0f, 5, null);
                } else {
                    path = path2;
                    fArr2 = fArrM8492constructorimpl$default;
                }
                path.mo8119transform58bKbWc(fArr2);
            }
            if (i7 != 0) {
                float f20 = this.currentStrokeCapWidth;
                f4 = f12 + f20 + f20;
            } else {
                f4 = f12;
            }
            float f21 = f16 + f4;
            if (f6 > f21) {
                this.trackPathToDraw.lineTo(Math.max(this.currentStrokeCapWidth, f21), fIntBitsToFloat2);
            }
            if (f10 > f9) {
                float fMax = Math.max(this.currentStrokeCapWidth, f17 - f4);
                this.trackPathToDraw.moveTo(fMax, fIntBitsToFloat2);
                f6 = fMax;
            }
            i4 = i2 + 1;
            fMin = f12;
            i5 = i7;
            i3 = 1;
        }
        float f22 = this.currentStrokeCapWidth;
        if (f6 > f22) {
            this.trackPathToDraw.lineTo(f22, fIntBitsToFloat2);
        }
        float[] fArr3 = this.currentProgressFractions;
        x.c(fArr3);
        c.aK(fArr, fArr3, 0, 0, 14);
        this.currentAmplitude = f2;
        this.currentWaveOffset = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[PHI: r17
  0x0084: PHI (r17v3 char) = (r17v1 char), (r17v4 char) binds: [B:28:0x0082, B:24:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* renamed from: updateFullPaths-LjSzlW0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m6279updateFullPathsLjSzlW0(long r21, float r23, float r24, float r25, androidx.compose.ui.graphics.drawscope.Stroke r26, androidx.compose.ui.graphics.drawscope.Stroke r27) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.LinearProgressDrawingCache.m6279updateFullPathsLjSzlW0(long, float, float, float, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.ui.graphics.drawscope.Stroke):boolean");
    }

    /* renamed from: updatePaths-VygBpHg$default, reason: not valid java name */
    public static /* synthetic */ void m6280updatePathsVygBpHg$default(LinearProgressDrawingCache linearProgressDrawingCache, long j2, float f2, float[] fArr, float f3, float f4, float f5, Stroke stroke, Stroke stroke2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        linearProgressDrawingCache.m6281updatePathsVygBpHg(j2, f2, fArr, f3, f4, f5, stroke, stroke2);
    }

    public final float getCurrentStrokeCapWidth() {
        return this.currentStrokeCapWidth;
    }

    public final Path getFullProgressPath() {
        return this.fullProgressPath;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final Path[] getProgressPathsToDraw() {
        return this.progressPathsToDraw;
    }

    public final Path getTrackPathToDraw() {
        return this.trackPathToDraw;
    }

    public final void setCurrentStrokeCapWidth(float f2) {
        this.currentStrokeCapWidth = f2;
    }

    public final void setProgressPathsToDraw(Path[] pathArr) {
        this.progressPathsToDraw = pathArr;
    }

    /* renamed from: updatePaths-VygBpHg, reason: not valid java name */
    public final void m6281updatePathsVygBpHg(long j2, float f2, float[] fArr, float f3, float f4, float f5, Stroke stroke, Stroke stroke2) {
        if (this.currentProgressFractions == null) {
            int length = fArr.length;
            this.currentProgressFractions = new float[length];
            int i2 = length >> 1;
            Path[] pathArr = new Path[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                pathArr[i3] = AndroidPath_androidKt.Path();
            }
            this.progressPathsToDraw = pathArr;
        }
        updateDrawPaths(m6279updateFullPathsLjSzlW0(j2, f2, f3, f5, stroke, stroke2), fArr, f3, f4);
    }
}
