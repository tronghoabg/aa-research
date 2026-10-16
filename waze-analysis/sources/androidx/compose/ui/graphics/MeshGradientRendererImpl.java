package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MeshGradientRendererImpl implements MeshGradientRenderer {
    private static final int MaxSubdivision = 64;
    private static final int MinSubdivision = 4;
    private static final float TargetPxPerSegment = 8.0f;
    private float[] colorForwardDifferenceRowResults;
    private int[] colorsBuffer;
    private float[] forwardDifferenceRowResultsX;
    private float[] forwardDifferenceRowResultsY;
    private short[] indexBuffer;
    private float[] positionsBuffer;
    private float[] vBernsteinBasis;
    private float[] vCatmullRomBasis;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final android.graphics.Paint paint = new android.graphics.Paint();
    private int lastSubdivisionU = -1;
    private int lastSubdivisionV = -1;
    private final float[] patchPositions = new float[8];
    private final float[] patchLeftBezierOffsets = new float[8];
    private final float[] patchRightBezierOffsets = new float[8];
    private final float[] patchTopBezierOffsets = new float[8];
    private final float[] patchBottomBezierOffsets = new float[8];
    private final int[] patchColors = new int[16];
    private final float[] okLabPatchColors = new float[64];
    private final float[] controlPoints = new float[32];

    private final void buildControlPointMatrix(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6) {
        fArr6[buildControlPointMatrix$idx(0, 0, 0)] = fArr[0];
        fArr6[buildControlPointMatrix$idx(0, 0, 1)] = fArr[1];
        fArr6[buildControlPointMatrix$idx(0, 3, 0)] = fArr[2];
        fArr6[buildControlPointMatrix$idx(0, 3, 1)] = fArr[3];
        fArr6[buildControlPointMatrix$idx(3, 0, 0)] = fArr[4];
        fArr6[buildControlPointMatrix$idx(3, 0, 1)] = fArr[5];
        fArr6[buildControlPointMatrix$idx(3, 3, 0)] = fArr[6];
        fArr6[buildControlPointMatrix$idx(3, 3, 1)] = fArr[7];
        fArr6[buildControlPointMatrix$idx(0, 1, 0)] = fArr6[buildControlPointMatrix$idx(0, 0, 0)] + fArr3[0];
        fArr6[buildControlPointMatrix$idx(0, 1, 1)] = fArr6[buildControlPointMatrix$idx(0, 0, 1)] + fArr3[1];
        fArr6[buildControlPointMatrix$idx(0, 2, 0)] = fArr6[buildControlPointMatrix$idx(0, 3, 0)] + fArr2[2];
        fArr6[buildControlPointMatrix$idx(0, 2, 1)] = fArr6[buildControlPointMatrix$idx(0, 3, 1)] + fArr2[3];
        fArr6[buildControlPointMatrix$idx(3, 1, 0)] = fArr6[buildControlPointMatrix$idx(3, 0, 0)] + fArr3[4];
        fArr6[buildControlPointMatrix$idx(3, 1, 1)] = fArr6[buildControlPointMatrix$idx(3, 0, 1)] + fArr3[5];
        fArr6[buildControlPointMatrix$idx(3, 2, 0)] = fArr6[buildControlPointMatrix$idx(3, 3, 0)] + fArr2[6];
        fArr6[buildControlPointMatrix$idx(3, 2, 1)] = fArr6[buildControlPointMatrix$idx(3, 3, 1)] + fArr2[7];
        fArr6[buildControlPointMatrix$idx(1, 0, 0)] = fArr6[buildControlPointMatrix$idx(0, 0, 0)] + fArr5[0];
        fArr6[buildControlPointMatrix$idx(1, 0, 1)] = fArr6[buildControlPointMatrix$idx(0, 0, 1)] + fArr5[1];
        fArr6[buildControlPointMatrix$idx(2, 0, 0)] = fArr6[buildControlPointMatrix$idx(3, 0, 0)] + fArr4[4];
        fArr6[buildControlPointMatrix$idx(2, 0, 1)] = fArr6[buildControlPointMatrix$idx(3, 0, 1)] + fArr4[5];
        fArr6[buildControlPointMatrix$idx(1, 3, 0)] = fArr6[buildControlPointMatrix$idx(0, 3, 0)] + fArr5[2];
        fArr6[buildControlPointMatrix$idx(1, 3, 1)] = fArr6[buildControlPointMatrix$idx(0, 3, 1)] + fArr5[3];
        fArr6[buildControlPointMatrix$idx(2, 3, 0)] = fArr6[buildControlPointMatrix$idx(3, 3, 0)] + fArr4[6];
        fArr6[buildControlPointMatrix$idx(2, 3, 1)] = fArr6[buildControlPointMatrix$idx(3, 3, 1)] + fArr4[7];
        fArr6[buildControlPointMatrix$idx(1, 1, 0)] = (fArr6[buildControlPointMatrix$idx(0, 1, 0)] + fArr6[buildControlPointMatrix$idx(1, 0, 0)]) - fArr6[buildControlPointMatrix$idx(0, 0, 0)];
        fArr6[buildControlPointMatrix$idx(1, 1, 1)] = (fArr6[buildControlPointMatrix$idx(0, 1, 1)] + fArr6[buildControlPointMatrix$idx(1, 0, 1)]) - fArr6[buildControlPointMatrix$idx(0, 0, 1)];
        fArr6[buildControlPointMatrix$idx(1, 2, 0)] = (fArr6[buildControlPointMatrix$idx(0, 2, 0)] + fArr6[buildControlPointMatrix$idx(1, 3, 0)]) - fArr6[buildControlPointMatrix$idx(0, 3, 0)];
        fArr6[buildControlPointMatrix$idx(1, 2, 1)] = (fArr6[buildControlPointMatrix$idx(0, 2, 1)] + fArr6[buildControlPointMatrix$idx(1, 3, 1)]) - fArr6[buildControlPointMatrix$idx(0, 3, 1)];
        fArr6[buildControlPointMatrix$idx(2, 1, 0)] = (fArr6[buildControlPointMatrix$idx(2, 0, 0)] + fArr6[buildControlPointMatrix$idx(3, 1, 0)]) - fArr6[buildControlPointMatrix$idx(3, 0, 0)];
        fArr6[buildControlPointMatrix$idx(2, 1, 1)] = (fArr6[buildControlPointMatrix$idx(2, 0, 1)] + fArr6[buildControlPointMatrix$idx(3, 1, 1)]) - fArr6[buildControlPointMatrix$idx(3, 0, 1)];
        fArr6[buildControlPointMatrix$idx(2, 2, 0)] = (fArr6[buildControlPointMatrix$idx(2, 3, 0)] + fArr6[buildControlPointMatrix$idx(3, 2, 0)]) - fArr6[buildControlPointMatrix$idx(3, 3, 0)];
        fArr6[buildControlPointMatrix$idx(2, 2, 1)] = (fArr6[buildControlPointMatrix$idx(2, 3, 1)] + fArr6[buildControlPointMatrix$idx(3, 2, 1)]) - fArr6[buildControlPointMatrix$idx(3, 3, 1)];
    }

    private static final int buildControlPointMatrix$idx(int i2, int i3, int i4) {
        int i5 = (i2 * 4) + i3;
        return i5 + i5 + i4;
    }

    private final void buildIndexBuffer(int i2, int i3) {
        short[] sArr = this.indexBuffer;
        if (sArr == null) {
            x.g();
        }
        int i4 = i2 - 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i5 + 1;
            int i8 = i3 - 1;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = (i5 * i3) + i9;
                int i11 = i10 + 1;
                int i12 = (i7 * i3) + i9;
                short s = (short) i10;
                sArr[i6] = s;
                sArr[i6 + 1] = (short) i12;
                short s2 = (short) (i12 + 1);
                sArr[i6 + 2] = s2;
                sArr[i6 + 3] = s;
                int i13 = i6 + 5;
                sArr[i6 + 4] = s2;
                i6 += 6;
                sArr[i13] = (short) i11;
            }
            i5 = i7;
        }
    }

    /* renamed from: calculateSubdivisions-2kb6nC0, reason: not valid java name */
    private final long m8522calculateSubdivisions2kb6nC0(int i2, int i3, float[] fArr, long j2) {
        int i4 = i3;
        int i5 = 0;
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        while (i5 < i2 * i4) {
            int i6 = i5 / i4;
            int i7 = i5 % i4;
            int pointIndex = getPointIndex(i6, i7, i4);
            int i8 = i7 + 1;
            int pointIndex2 = getPointIndex(i6, i8, i4);
            int i9 = i6 + 1;
            int pointIndex3 = getPointIndex(i9, i7, i4);
            int pointIndex4 = getPointIndex(i9, i8, i4);
            int i10 = pointIndex + pointIndex;
            int i11 = (int) (j2 >> 32);
            float fIntBitsToFloat = fArr[i10] * Float.intBitsToFloat(i11);
            int i12 = i10 + 1;
            float f2 = fArr[i12];
            int i13 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            int i14 = pointIndex2 + pointIndex2;
            int i15 = i14 + 1;
            int i16 = pointIndex3 + pointIndex3;
            int i17 = i16 + 1;
            int i18 = pointIndex4 + pointIndex4;
            int i19 = i18 + 1;
            int i20 = i5;
            float fDist = dist(fIntBitsToFloat, f2 * Float.intBitsToFloat(i13), fArr[i14] * Float.intBitsToFloat(i11), fArr[i15] * Float.intBitsToFloat(i13)) + dist(fArr[i16] * Float.intBitsToFloat(i11), fArr[i17] * Float.intBitsToFloat(i13), fArr[i18] * Float.intBitsToFloat(i11), fArr[i19] * Float.intBitsToFloat(i13));
            float fDist2 = dist(fArr[i10] * Float.intBitsToFloat(i11), fArr[i12] * Float.intBitsToFloat(i13), fArr[i16] * Float.intBitsToFloat(i11), fArr[i17] * Float.intBitsToFloat(i13)) + dist(fArr[i14] * Float.intBitsToFloat(i11), fArr[i15] * Float.intBitsToFloat(i13), fArr[i18] * Float.intBitsToFloat(i11), fArr[i19] * Float.intBitsToFloat(i13));
            fMax = Math.max(fMax, fDist * 0.5f);
            fMax2 = Math.max(fMax2, fDist2 * 0.5f);
            i5 = i20 + 1;
            i4 = i3;
        }
        int iCeil = (int) Math.ceil(fMax / 8.0f);
        int i21 = 64;
        if (iCeil < 4) {
            iCeil = 4;
        } else if (iCeil > 64) {
            iCeil = 64;
        }
        int iCeil2 = (int) Math.ceil(fMax2 / 8.0f);
        if (iCeil2 < 4) {
            i21 = 4;
        } else if (iCeil2 <= 64) {
            i21 = iCeil2;
        }
        return (iCeil << 32) | (i21 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    private final void computeBezierSurfacePoints(float[] fArr, int i2, int i3, float[] fArr2) {
        float[] fArr3 = this.forwardDifferenceRowResultsX;
        if (fArr3 == null) {
            x.g();
        }
        float[] fArr4 = this.forwardDifferenceRowResultsY;
        if (fArr4 == null) {
            x.g();
        }
        int i4 = i2 - 1;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = i5 * 8;
            float f2 = fArr[i6];
            float f3 = fArr[i6 + 2];
            float f4 = f3 * 3.0f;
            float f5 = fArr[i6 + 4] * 3.0f;
            float f6 = (((-f2) + f4) - f5) + fArr[i6 + 6];
            float f7 = fArr[i6 + 1];
            float f8 = fArr[i6 + 3];
            float f9 = f8 * 3.0f;
            float f10 = fArr[i6 + 5] * 3.0f;
            float f11 = (((-f7) + f9) - f10) + fArr[i6 + 7];
            int i7 = i5 * i2;
            fArr3[i7] = f2;
            fArr4[i7] = f7;
            float f12 = ((3.0f * f7) - (f8 * 6.0f)) + f10;
            float f13 = 1.0f / i4;
            float f14 = f13 * f13;
            float f15 = f14 * f13;
            float f16 = f11 * f15;
            float f17 = f12 * f14;
            float f18 = f16 + f17;
            float f19 = f6 * f15;
            float f20 = (((f2 * 3.0f) - (f3 * 6.0f)) + f5) * f14;
            float f21 = f19 + f20;
            float f22 = f16 * 6.0f;
            float f23 = f17 + f17 + f22;
            float f24 = f18 + ((((-3.0f) * f7) + f9) * f13);
            float f25 = f19 * 6.0f;
            float f26 = f25 + f20 + f20;
            float f27 = f21 + (((f2 * (-3.0f)) + f4) * f13);
            float f28 = f2;
            for (int i8 = 1; i8 < i2; i8++) {
                f28 += f27;
                f27 += f26;
                f26 += f25;
                f7 += f24;
                f24 += f23;
                f23 += f22;
                int i9 = i7 + i8;
                fArr3[i9] = f28;
                fArr4[i9] = f7;
            }
        }
        float[] fArr5 = this.vBernsteinBasis;
        if (fArr5 == null) {
            x.g();
        }
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = i10 * 4;
            for (int i12 = 0; i12 < i2; i12++) {
                int i13 = (i12 * i3) + i10;
                int i14 = i11 + 1;
                int i15 = i2 + i12;
                int i16 = i11 + 2;
                int i17 = i2 + i2 + i12;
                int i18 = i11 + 3;
                int i19 = (i2 * 3) + i12;
                int i20 = i13 + i13;
                fArr2[i20] = (fArr5[i11] * fArr3[i12]) + (fArr5[i14] * fArr3[i15]) + (fArr5[i16] * fArr3[i17]) + (fArr5[i18] * fArr3[i19]);
                fArr2[i20 + 1] = (fArr5[i11] * fArr4[i12]) + (fArr5[i14] * fArr4[i15]) + (fArr5[i16] * fArr4[i17]) + (fArr5[i18] * fArr4[i19]);
            }
        }
    }

    private final void computeBilinearSurfaceColors(int[] iArr, int i2, int i3, int[] iArr2) {
        int i4 = i2;
        int i5 = i3;
        long jColor = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(1, 1)]);
        long jColor2 = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(1, 2)]);
        long jColor3 = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(2, 1)]);
        long jColor4 = ColorKt.Color(iArr[computeBilinearSurfaceColors$colorIdx(2, 2)]);
        int i6 = 0;
        while (i6 < i4) {
            float f2 = i6 / (i4 - 1);
            long jM8279lerpjxsXWHM = ColorKt.m8279lerpjxsXWHM(jColor, jColor2, f2);
            long jM8279lerpjxsXWHM2 = ColorKt.m8279lerpjxsXWHM(jColor3, jColor4, f2);
            int i7 = 0;
            while (i7 < i5) {
                iArr2[(i6 * i5) + i7] = ColorKt.m8282toArgb8_81llA(ColorKt.m8279lerpjxsXWHM(jM8279lerpjxsXWHM, jM8279lerpjxsXWHM2, i7 / (i5 - 1)));
                i7++;
                i5 = i3;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
    }

    private static final int computeBilinearSurfaceColors$colorIdx(int i2, int i3) {
        return (i2 * 4) + i3;
    }

    private final void computeCatmullRomSurfaceColors(int[] iArr, int i2, int i3, int[] iArr2) {
        int i4;
        int i5;
        int i6;
        float maxValue;
        int i7 = 0;
        while (true) {
            i4 = 3;
            if (i7 >= 16) {
                break;
            }
            long jM8225convertvNxB06k = Color.m8225convertvNxB06k(ColorKt.Color(iArr[i7]), ColorSpaces.INSTANCE.getOklab());
            int i8 = i7 * 4;
            this.okLabPatchColors[i8] = Color.m8234getRedimpl(jM8225convertvNxB06k);
            this.okLabPatchColors[i8 + 1] = Color.m8233getGreenimpl(jM8225convertvNxB06k);
            this.okLabPatchColors[i8 + 2] = Color.m8231getBlueimpl(jM8225convertvNxB06k);
            this.okLabPatchColors[i8 + 3] = Color.m8230getAlphaimpl(jM8225convertvNxB06k);
            i7++;
        }
        float[] fArr = this.colorForwardDifferenceRowResults;
        if (fArr == null) {
            x.g();
        }
        int i9 = i2 - 1;
        int i10 = 0;
        while (true) {
            i5 = 4;
            if (i10 >= 4) {
                break;
            }
            int i11 = i10 * 16;
            int i12 = 0;
            while (i12 < 4) {
                float f2 = i9;
                float[] fArr2 = this.okLabPatchColors;
                float f3 = fArr2[i11 + i12];
                float f4 = -f3;
                float f5 = fArr2[i11 + 4 + i12];
                float f6 = fArr2[i11 + 8 + i12];
                float f7 = fArr2[i11 + 12 + i12];
                float f8 = ((f4 + (f5 * 3.0f)) - (3.0f * f6)) + f7;
                float f9 = (((f3 + f3) - (5.0f * f5)) + (4.0f * f6)) - f7;
                float f10 = f4 + f6;
                int i13 = i10 * i2 * 4;
                float minValue = i12 < i4 ? ColorSpaces.INSTANCE.getOklab().getMinValue(i12) : 0.0f;
                if (i12 < i4) {
                    i6 = i4;
                    maxValue = ColorSpaces.INSTANCE.getOklab().getMaxValue(i12);
                } else {
                    i6 = i4;
                    maxValue = 1.0f;
                }
                float f11 = 1.0f / f2;
                fArr[i13 + i12] = n.g(f5, minValue, maxValue);
                float f12 = f11 * f11;
                float f13 = f8 * 0.5f * f12 * f11;
                float f14 = f9 * 0.5f * f12;
                float f15 = f13 + f14 + (f10 * 0.5f * f11);
                float f16 = f13 * 6.0f;
                float f17 = f16 + f14 + f14;
                for (int i14 = 1; i14 < i2; i14++) {
                    f5 += f15;
                    f15 += f17;
                    f17 += f16;
                    fArr[i13 + (i14 * 4) + i12] = n.g(f5, minValue, maxValue);
                }
                i12++;
                i4 = i6;
            }
            i10++;
        }
        float[] fArr3 = this.vCatmullRomBasis;
        if (fArr3 == null) {
            x.g();
        }
        int i15 = 0;
        while (i15 < i2) {
            int i16 = i15 * 4;
            int i17 = i2 * 4;
            int i18 = (i2 + i2) * i5;
            int i19 = i2 * 12;
            int i20 = 0;
            while (i20 < i3) {
                int i21 = i19 + i16;
                int i22 = i18 + i16;
                int i23 = i17 + i16;
                int i24 = i20 * 4;
                float f18 = fArr3[i24];
                float f19 = fArr[i16] * f18;
                float f20 = fArr3[i24 + 1];
                float f21 = fArr[i23] * f20;
                float f22 = fArr3[i24 + 2];
                float f23 = fArr[i22] * f22;
                float f24 = fArr3[i24 + 3];
                float f25 = fArr[i21] * f24;
                float f26 = fArr[i16 + 1] * f18;
                float f27 = fArr[i23 + 1] * f20;
                float f28 = fArr[i22 + 1] * f22;
                float f29 = fArr[i21 + 1] * f24;
                float f30 = fArr[i16 + 2] * f18;
                float f31 = fArr[i23 + 2] * f20;
                float f32 = fArr[i22 + 2] * f22;
                float f33 = fArr[i21 + 2] * f24;
                iArr2[(i15 * i3) + i20] = ColorKt.m8282toArgb8_81llA(Color.m8225convertvNxB06k(ColorKt.Color(f19 + f21 + f23 + f25, f26 + f27 + f28 + f29, f30 + f31 + f32 + f33, (f18 * fArr[i16 + 3]) + (f20 * fArr[i23 + 3]) + (f22 * fArr[i22 + 3]) + (f24 * fArr[i21 + 3]), ColorSpaces.INSTANCE.getOklab()), ColorSpaces.INSTANCE.getSrgb()));
                i20++;
                fArr3 = fArr3;
            }
            i15++;
            i5 = 4;
        }
    }

    private final float dist(float f2, float f3, float f4, float f5) {
        float f6 = f5 - f3;
        float f7 = f4 - f2;
        return (float) Math.sqrt((f7 * f7) + (f6 * f6));
    }

    /* renamed from: drawPatch-W8bZRI4, reason: not valid java name */
    private final void m8523drawPatchW8bZRI4(Canvas canvas, int i2, int i3, int i4, boolean z, float[] fArr, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, long j2, int i5, int i6, float[] fArr6, int[] iArr2, short[] sArr) {
        m8524readPatchPositionsyzxVdVo(i2, i4, fArr, j2, this.patchPositions);
        m8524readPatchPositionsyzxVdVo(i2, i4, fArr2, j2, this.patchLeftBezierOffsets);
        m8524readPatchPositionsyzxVdVo(i2, i4, fArr4, j2, this.patchRightBezierOffsets);
        m8524readPatchPositionsyzxVdVo(i2, i4, fArr3, j2, this.patchTopBezierOffsets);
        m8524readPatchPositionsyzxVdVo(i2, i4, fArr5, j2, this.patchBottomBezierOffsets);
        readPatchColors(i2, i3, i4, iArr, this.patchColors);
        buildControlPointMatrix(this.patchPositions, this.patchLeftBezierOffsets, this.patchRightBezierOffsets, this.patchTopBezierOffsets, this.patchBottomBezierOffsets, this.controlPoints);
        computeBezierSurfacePoints(this.controlPoints, i5, i6, fArr6);
        int[] iArr3 = this.patchColors;
        if (z) {
            computeCatmullRomSurfaceColors(iArr3, i5, i6, iArr2);
        } else {
            computeBilinearSurfaceColors(iArr3, i5, i6, iArr2);
        }
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawVertices(Canvas.VertexMode.TRIANGLES, fArr6.length, fArr6, 0, null, 0, iArr2, 0, sArr, 0, sArr.length, this.paint);
    }

    private final int getPointIndex(int i2, int i3, int i4) {
        return (i2 * (i4 + 1)) + i3;
    }

    private final void precomputeBasisArrays(int i2) {
        float f2;
        int i3 = i2 * 4;
        float[] fArr = this.vBernsteinBasis;
        if (fArr == null || fArr.length != i3) {
            fArr = new float[i3];
            this.vBernsteinBasis = fArr;
        }
        if (fArr == null) {
            x.g();
        }
        int i4 = i2 - 1;
        int i5 = 0;
        while (true) {
            f2 = i4;
            if (i5 >= i2) {
                break;
            }
            float f3 = i5 / f2;
            int i6 = i5 * 4;
            float f4 = f3 * f3;
            float f5 = f4 * f3;
            float f6 = f4 * 3.0f;
            float f7 = f3 * 3.0f;
            fArr[i6] = (((-f5) + f6) - f7) + 1.0f;
            fArr[i6 + 1] = ((3.0f * f5) - (f4 * 6.0f)) + f7;
            fArr[i6 + 2] = ((-3.0f) * f5) + f6;
            fArr[i6 + 3] = f5;
            i5++;
        }
        float[] fArr2 = this.vCatmullRomBasis;
        if (fArr2 == null || fArr2.length != i3) {
            fArr2 = new float[i3];
            this.vCatmullRomBasis = fArr2;
        }
        if (fArr2 == null) {
            x.g();
        }
        for (int i7 = 0; i7 < i2; i7++) {
            float f8 = i7 / f2;
            int i8 = i7 * 4;
            float f9 = f8 * f8;
            float f10 = f9 * f8;
            fArr2[i8] = (((-f10) + (f9 + f9)) - f8) * 0.5f;
            fArr2[i8 + 1] = (((f10 * 3.0f) - (5.0f * f9)) + 2.0f) * 0.5f;
            fArr2[i8 + 2] = ((f10 * (-3.0f)) + (4.0f * f9) + f8) * 0.5f;
            fArr2[i8 + 3] = (f10 - f9) * 0.5f;
        }
    }

    private final void readPatchColors(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        int i5 = i2 / i4;
        int i6 = i2 % i4;
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                iArr2[(i7 * 4) + i8] = iArr[getPointIndex(n.j((i5 - 1) + i7, 0, i3), n.j((i6 - 1) + i8, 0, i4), i4)];
            }
        }
    }

    /* renamed from: readPatchPositions-yzxVdVo, reason: not valid java name */
    private final void m8524readPatchPositionsyzxVdVo(int i2, int i3, float[] fArr, long j2, float[] fArr2) {
        if (fArr == null) {
            int length = fArr2.length;
            for (int i4 = 0; i4 < length; i4++) {
                fArr2[i4] = 0.0f;
            }
            return;
        }
        int i5 = i2 / i3;
        int i6 = i2 % i3;
        int pointIndex = getPointIndex(i5, i6, i3);
        int i7 = i6 + 1;
        int pointIndex2 = getPointIndex(i5, i7, i3);
        int i8 = i5 + 1;
        int pointIndex3 = getPointIndex(i8, i6, i3);
        int pointIndex4 = getPointIndex(i8, i7, i3);
        int i9 = pointIndex + pointIndex;
        int i10 = (int) (j2 >> 32);
        fArr2[0] = fArr[i9] * Float.intBitsToFloat(i10);
        int i11 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        fArr2[1] = fArr[i9 + 1] * Float.intBitsToFloat(i11);
        int i12 = pointIndex2 + pointIndex2;
        fArr2[2] = fArr[i12] * Float.intBitsToFloat(i10);
        fArr2[3] = fArr[i12 + 1] * Float.intBitsToFloat(i11);
        int i13 = pointIndex3 + pointIndex3;
        fArr2[4] = fArr[i13] * Float.intBitsToFloat(i10);
        fArr2[5] = fArr[i13 + 1] * Float.intBitsToFloat(i11);
        int i14 = pointIndex4 + pointIndex4;
        fArr2[6] = fArr[i14] * Float.intBitsToFloat(i10);
        fArr2[7] = fArr[i14 + 1] * Float.intBitsToFloat(i11);
    }

    @Override // androidx.compose.ui.graphics.MeshGradientRenderer
    public void draw(DrawScope drawScope, int i2, int i3, float[] fArr, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, boolean z) {
        int i4 = (i2 + 1) * (i3 + 1);
        int i5 = i4 + i4;
        if (fArr.length != i5) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("positions array must have at least " + i5 + " elements");
        }
        int[] iArr2 = iArr;
        if (iArr2.length != i4) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("colors array must have at least " + i4 + " elements");
        }
        if (fArr2 != null && fArr2.length != i5) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("leftBezierOffsets array must have at least " + i5 + " elements");
        }
        if (fArr3 != null && fArr3.length != i5) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("topBezierOffsets array must have at least " + i5 + " elements");
        }
        if (fArr4 != null && fArr4.length != i5) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("rightBezierOffsets array must have at least " + i5 + " elements");
        }
        if (fArr5 != null && fArr5.length != i5) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("bottomBezierOffsets array must have at least " + i5 + " elements");
        }
        MeshGradientKt.inferBezierControlPointsIfRequired(i2, i3, fArr, fArr2, fArr3, fArr4, fArr5);
        MeshGradientRendererImpl meshGradientRendererImpl = this;
        long jM8522calculateSubdivisions2kb6nC0 = meshGradientRendererImpl.m8522calculateSubdivisions2kb6nC0(i2, i3, fArr, drawScope.mo8751getSizeNHjbRc());
        int i6 = (int) (jM8522calculateSubdivisions2kb6nC0 >> 32);
        int i7 = (int) (jM8522calculateSubdivisions2kb6nC0 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (meshGradientRendererImpl.indexBuffer == null || meshGradientRendererImpl.lastSubdivisionU != i6 || meshGradientRendererImpl.lastSubdivisionV != i7) {
            meshGradientRendererImpl.indexBuffer = new short[(i6 - 1) * (i7 - 1) * 6];
            int i8 = i6 * 4;
            meshGradientRendererImpl.forwardDifferenceRowResultsX = new float[i8];
            meshGradientRendererImpl.forwardDifferenceRowResultsY = new float[i8];
            meshGradientRendererImpl.colorForwardDifferenceRowResults = new float[i6 * 16];
            int i9 = i6 * i7;
            meshGradientRendererImpl.positionsBuffer = new float[i9 + i9];
            meshGradientRendererImpl.colorsBuffer = new int[i9];
            meshGradientRendererImpl.buildIndexBuffer(i6, i7);
            meshGradientRendererImpl.precomputeBasisArrays(i7);
            meshGradientRendererImpl.lastSubdivisionU = i6;
            meshGradientRendererImpl.lastSubdivisionV = i7;
        }
        short[] sArr = meshGradientRendererImpl.indexBuffer;
        if (sArr == null) {
            x.g();
        }
        float[] fArr6 = meshGradientRendererImpl.positionsBuffer;
        if (fArr6 == null) {
            x.g();
        }
        int[] iArr3 = meshGradientRendererImpl.colorsBuffer;
        if (iArr3 == null) {
            x.g();
        }
        int i10 = 0;
        for (int i11 = i2 * i3; i10 < i11; i11 = i11) {
            short[] sArr2 = sArr;
            float[] fArr7 = fArr6;
            int[] iArr4 = iArr3;
            int i12 = i10;
            meshGradientRendererImpl.m8523drawPatchW8bZRI4(drawScope.getDrawContext().getCanvas(), i12, i2, i3, z, fArr, iArr2, fArr2, fArr3, fArr4, fArr5, drawScope.mo8751getSizeNHjbRc(), i6, i7, fArr7, iArr4, sArr2);
            i10 = i12 + 1;
            meshGradientRendererImpl = this;
            iArr2 = iArr;
            fArr6 = fArr7;
            iArr3 = iArr4;
            sArr = sArr2;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
