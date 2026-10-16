package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MeshGradientKt {
    /* renamed from: distanceFrom-0a9Yr6o, reason: not valid java name */
    private static final float m8519distanceFrom0a9Yr6o(long j2, long j3) {
        return Offset.m7978getDistanceimpl(Offset.m7984minusMKHz9U(j2, j3));
    }

    private static final long getOffset(float[] fArr, int i2) {
        int i3 = i2 + 1;
        float f2 = fArr[i2];
        float f3 = fArr[i3];
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void inferBezierControlPointsIfRequired(int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        int i10 = i3;
        if (i9 < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i10 >= 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i10 + 1;
                    int i14 = (i11 * i13) + i12;
                    int i15 = i14 + i14;
                    long offset = getOffset(fArr, i15);
                    if (i11 > 0) {
                        int i16 = ((i11 - 1) * i13) + i12;
                        i5 = i16 + i16;
                    } else {
                        i5 = i15;
                    }
                    if (i11 < i9) {
                        int i17 = ((i11 + 1) * i13) + i12;
                        i6 = i17 + i17;
                    } else {
                        i6 = i15;
                    }
                    if (i12 > 0) {
                        int i18 = i14 - 1;
                        i7 = i18 + i18;
                    } else {
                        i7 = i15;
                    }
                    if (i12 < i10) {
                        int i19 = i14 + 1;
                        i8 = i19 + i19;
                    } else {
                        i8 = i15;
                    }
                    long offset2 = getOffset(fArr, i5);
                    i4 = i11;
                    int i20 = i12;
                    long offset3 = getOffset(fArr, i6);
                    long offset4 = getOffset(fArr, i7);
                    long offset5 = getOffset(fArr, i8);
                    long jM7987timestuRUvjQ = Offset.m7987timestuRUvjQ(m8520normalizedk4lQ0M(Offset.m7984minusMKHz9U(offset5, offset4)), 0.33f);
                    long jM7987timestuRUvjQ2 = Offset.m7987timestuRUvjQ(m8520normalizedk4lQ0M(Offset.m7984minusMKHz9U(offset3, offset2)), 0.33f);
                    if (fArr2 != null && (getOffset(fArr2, i15) & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        m8521setOffset0AR0LA0(fArr2, i15, Offset.m7987timestuRUvjQ(Offset.m7987timestuRUvjQ(jM7987timestuRUvjQ, m8519distanceFrom0a9Yr6o(offset4, offset)), -1.0f));
                    }
                    if (fArr3 != null && (getOffset(fArr3, i15) & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        m8521setOffset0AR0LA0(fArr3, i15, Offset.m7987timestuRUvjQ(Offset.m7987timestuRUvjQ(jM7987timestuRUvjQ2, m8519distanceFrom0a9Yr6o(offset2, offset)), -1.0f));
                    }
                    if (fArr5 != null && (getOffset(fArr5, i15) & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        m8521setOffset0AR0LA0(fArr5, i15, Offset.m7987timestuRUvjQ(jM7987timestuRUvjQ2, m8519distanceFrom0a9Yr6o(offset3, offset)));
                    }
                    if (fArr4 != null && (getOffset(fArr4, i15) & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                        m8521setOffset0AR0LA0(fArr4, i15, Offset.m7987timestuRUvjQ(jM7987timestuRUvjQ, m8519distanceFrom0a9Yr6o(offset5, offset)));
                    }
                    i10 = i3;
                    if (i20 == i10) {
                        break;
                    }
                    i12 = i20 + 1;
                    i9 = i2;
                    i11 = i4;
                }
            } else {
                i4 = i11;
            }
            i9 = i2;
            if (i4 == i9) {
                return;
            } else {
                i11 = i4 + 1;
            }
        }
    }

    public static final Modifier meshGradient(Modifier modifier, int i2, int i3, boolean z, l<? super MeshGradientScope, ab> lVar) {
        return modifier.then(new MeshGradientBlockModifierElement(i2, i3, z, lVar));
    }

    /* renamed from: normalized-k-4lQ0M, reason: not valid java name */
    private static final long m8520normalizedk4lQ0M(long j2) {
        float fM7978getDistanceimpl = Offset.m7978getDistanceimpl(j2);
        if (fM7978getDistanceimpl == 0.0f) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / fM7978getDistanceimpl;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / fM7978getDistanceimpl;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setOffset-0AR0LA0, reason: not valid java name */
    public static final void m8521setOffset0AR0LA0(float[] fArr, int i2, long j2) {
        fArr[i2] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[i2 + 1] = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }
}
