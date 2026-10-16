package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Rect;
import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m8490boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m8492constructorimpl$default(float[] fArr, int i2, o oVar) {
        return (i2 & 1) != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f} : fArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8493equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && x.n(fArr, ((Matrix) obj).m8515unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8494equalsimpl0(float[] fArr, float[] fArr2) {
        return x.n(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m8495getimpl(float[] fArr, int i2, int i3) {
        return fArr[(i2 * 4) + i3];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8496hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m8497invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f4 * f9) - (f5 * f8);
        float f19 = (f10 * f15) - (f11 * f14);
        float f20 = (f3 * f9) - (f5 * f7);
        float f21 = (f10 * f16) - (f12 * f14);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f10 * f17) - (f13 * f14);
        float f24 = (f2 * f9) - (f5 * f6);
        float f25 = (f11 * f16) - (f12 * f15);
        float f26 = (f2 * f8) - (f4 * f6);
        float f27 = (f11 * f17) - (f13 * f15);
        float f28 = (f2 * f7) - (f3 * f6);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f28 * f29) - (f26 * f27)) + (f24 * f25)) + (f22 * f23)) - (f20 * f21)) + (f18 * f19);
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr[0] = (((f7 * f29) - (f8 * f27)) + (f9 * f25)) * f31;
            fArr[1] = ((((-f3) * f29) + (f4 * f27)) - (f5 * f25)) * f31;
            fArr[2] = (((f15 * f18) - (f16 * f20)) + (f17 * f22)) * f31;
            fArr[3] = ((((-f11) * f18) + (f12 * f20)) - (f13 * f22)) * f31;
            float f32 = -f6;
            fArr[4] = (((f32 * f29) + (f8 * f23)) - (f9 * f21)) * f31;
            fArr[5] = (((f29 * f2) - (f4 * f23)) + (f5 * f21)) * f31;
            float f33 = -f14;
            fArr[6] = (((f33 * f18) + (f16 * f24)) - (f17 * f26)) * f31;
            fArr[7] = (((f18 * f10) - (f12 * f24)) + (f13 * f26)) * f31;
            fArr[8] = (((f6 * f27) - (f7 * f23)) + (f9 * f19)) * f31;
            fArr[9] = ((((-f2) * f27) + (f23 * f3)) - (f5 * f19)) * f31;
            fArr[10] = (((f14 * f20) - (f15 * f24)) + (f17 * f28)) * f31;
            fArr[11] = ((((-f10) * f20) + (f24 * f11)) - (f13 * f28)) * f31;
            fArr[12] = (((f32 * f25) + (f7 * f21)) - (f8 * f19)) * f31;
            fArr[13] = (((f2 * f25) - (f3 * f21)) + (f4 * f19)) * f31;
            fArr[14] = (((f33 * f22) + (f15 * f26)) - (f16 * f28)) * f31;
            fArr[15] = (((f10 * f22) - (f11 * f26)) + (f12 * f28)) * f31;
        }
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m8498mapMKHz9U(float[] fArr, long j2) {
        if (fArr.length < 16) {
            return j2;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[15];
        long j3 = j2 >> 32;
        long j4 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j4);
        float f11 = 1.0f / (((f4 * fIntBitsToFloat) + (f7 * fIntBitsToFloat2)) + f10);
        if ((Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) >= 2139095040) {
            f11 = 0.0f;
        }
        float f12 = (f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2) + f9;
        return (Float.floatToRawIntBits((((f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2)) + f8) * f11) << 32) | (Float.floatToRawIntBits(f11 * f12) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m8500mapimpl(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f11 = f4 * left;
        float f12 = f7 * top;
        float f13 = 1.0f / ((f11 + f12) + f10);
        if ((Float.floatToRawIntBits(f13) & Integer.MAX_VALUE) >= 2139095040) {
            f13 = 0.0f;
        }
        float f14 = f2 * left;
        float f15 = f5 * top;
        float f16 = f14 + f15 + f8;
        float f17 = left * f3;
        float f18 = top * f6;
        float f19 = f17 + f18 + f9;
        float f20 = f7 * bottom;
        float f21 = 1.0f / ((f11 + f20) + f10);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f5 * bottom;
        float f23 = f14 + f22 + f8;
        float f24 = f6 * bottom;
        float f25 = f17 + f24 + f9;
        float f26 = f4 * right;
        float f27 = 1.0f / ((f12 + f26) + f10);
        if ((Float.floatToRawIntBits(f27) & Integer.MAX_VALUE) >= 2139095040) {
            f27 = 0.0f;
        }
        float f28 = f2 * right;
        float f29 = f28 + f15 + f8;
        float f30 = f3 * right;
        float f31 = f18 + f30 + f9;
        float f32 = 1.0f / ((f26 + f20) + f10);
        float f33 = (Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) < 2139095040 ? f32 : 0.0f;
        float f34 = f23 * f21;
        float f35 = f27 * f29;
        float f36 = (f28 + f22 + f8) * f33;
        float f37 = f13 * f16;
        mutableRect.setLeft(Math.min(f37, Math.min(f34, Math.min(f35, f36))));
        float f38 = f21 * f25;
        float f39 = f27 * f31;
        float f40 = (f30 + f24 + f9) * f33;
        float f41 = f13 * f19;
        mutableRect.setTop(Math.min(f41, Math.min(f38, Math.min(f39, f40))));
        mutableRect.setRight(Math.max(f37, Math.max(f34, Math.max(f35, f36))));
        mutableRect.setBottom(Math.max(f41, Math.max(f38, Math.max(f39, f40))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m8501resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m8502resetToPivotedTransformimpl(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        double d2 = f7 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        double d3 = f8 * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        double d4 = f9 * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d4);
        float fCos3 = (float) Math.cos(d4);
        if (fArr.length < 16) {
            return;
        }
        float f13 = -fSin3;
        float f14 = fSin * fCos2;
        float f15 = fSin * fSin2;
        float f16 = -fSin2;
        float f17 = fSin3 * f14;
        float f18 = fCos3 * f16;
        float f19 = fSin3 * f15;
        float f20 = fCos3 * fCos2;
        float f21 = f15 * fCos3;
        float f22 = f13 * fCos2;
        float f23 = (f5 * fSin) + (f6 * fCos);
        float f24 = f23 * fCos2;
        float f25 = (-f4) * fSin2;
        float f26 = f23 * fSin2;
        float f27 = ((f13 * f16) + (f14 * fCos3)) * f11;
        float f28 = fCos3 * fCos * f11;
        float f29 = (f22 + f21) * f11;
        float f30 = (f18 + f17) * f10;
        float f31 = fSin3 * fCos * f10;
        float f32 = (f20 + f19) * f10;
        fArr[0] = f32;
        fArr[1] = f31;
        fArr[2] = f30;
        fArr[3] = 0.0f;
        fArr[4] = f29;
        fArr[5] = f28;
        fArr[6] = f27;
        fArr[7] = 0.0f;
        fArr[8] = fSin2 * fCos * f12;
        fArr[9] = (-fSin) * f12;
        fArr[10] = fCos2 * fCos * f12;
        fArr[11] = 0.0f;
        float f33 = -f2;
        fArr[12] = ((f32 * f33) - (f29 * f3)) + (f4 * fCos2) + f26 + f2;
        fArr[13] = ((f31 * f33) - (f28 * f3)) + ((fCos * f5) - (f6 * fSin)) + f3;
        fArr[14] = ((f33 * f30) - (f3 * f27)) + f25 + f24;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m8503resetToPivotedTransformimpl$default(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f6 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f7 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f8 = 0.0f;
        }
        if ((i2 & 128) != 0) {
            f9 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f10 = 1.0f;
        }
        if ((i2 & 512) != 0) {
            f11 = 1.0f;
        }
        if ((i2 & 1024) != 0) {
            f12 = 1.0f;
        }
        m8502resetToPivotedTransformimpl(fArr, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m8504rotateXimpl(float[] fArr, float f2) {
        if (fArr.length < 16) {
            return;
        }
        double d2 = f2 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[5];
        float f6 = fArr[6];
        float f7 = fArr[9];
        float f8 = fArr[10];
        float f9 = fArr[13];
        float f10 = fArr[14];
        fArr[1] = (f3 * fCos) - (f4 * fSin);
        fArr[2] = (f3 * fSin) + (f4 * fCos);
        fArr[5] = (f5 * fCos) - (f6 * fSin);
        fArr[6] = (f5 * fSin) + (f6 * fCos);
        fArr[9] = (f7 * fCos) - (f8 * fSin);
        fArr[10] = (f7 * fSin) + (f8 * fCos);
        fArr[13] = (f9 * fCos) - (f10 * fSin);
        fArr[14] = (f9 * fSin) + (f10 * fCos);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m8505rotateYimpl(float[] fArr, float f2) {
        if (fArr.length < 16) {
            return;
        }
        double d2 = f2 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f3 = fArr[0];
        float f4 = fArr[2];
        float f5 = fArr[4];
        float f6 = fArr[6];
        float f7 = fArr[8];
        float f8 = fArr[10];
        float f9 = fArr[12];
        float f10 = fArr[14];
        fArr[0] = (f3 * fCos) + (f4 * fSin);
        fArr[2] = ((-f3) * fSin) + (f4 * fCos);
        fArr[4] = (f5 * fCos) + (f6 * fSin);
        fArr[6] = ((-f5) * fSin) + (f6 * fCos);
        fArr[8] = (f7 * fCos) + (f8 * fSin);
        fArr[10] = ((-f7) * fSin) + (f8 * fCos);
        fArr[12] = (f9 * fCos) + (f10 * fSin);
        fArr[14] = ((-f9) * fSin) + (f10 * fCos);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m8506rotateZimpl(float[] fArr, float f2) {
        if (fArr.length < 16) {
            return;
        }
        double d2 = f2 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f3 = fArr[0];
        float f4 = fArr[4];
        float f5 = -fSin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = fArr[2];
        float f9 = fArr[6];
        float f10 = fArr[3];
        float f11 = fArr[7];
        fArr[0] = (fCos * f3) + (fSin * f4);
        fArr[1] = (fCos * f6) + (fSin * f7);
        fArr[2] = (fCos * f8) + (fSin * f9);
        fArr[3] = (fCos * f10) + (fSin * f11);
        fArr[4] = (f3 * f5) + (f4 * fCos);
        fArr[5] = (f6 * f5) + (f7 * fCos);
        fArr[6] = (f8 * f5) + (f9 * fCos);
        fArr[7] = (f5 * f10) + (fCos * f11);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m8507scaleimpl(float[] fArr, float f2, float f3, float f4) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f2;
        fArr[1] = fArr[1] * f2;
        fArr[2] = fArr[2] * f2;
        fArr[3] = fArr[3] * f2;
        fArr[4] = fArr[4] * f3;
        fArr[5] = fArr[5] * f3;
        fArr[6] = fArr[6] * f3;
        fArr[7] = fArr[7] * f3;
        fArr[8] = fArr[8] * f4;
        fArr[9] = fArr[9] * f4;
        fArr[10] = fArr[10] * f4;
        fArr[11] = fArr[11] * f4;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m8508scaleimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        m8507scaleimpl(fArr, f2, f3, f4);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m8509setimpl(float[] fArr, int i2, int i3, float f2) {
        fArr[(i2 * 4) + i3] = f2;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m8510setFrom58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m8511timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f2 = fArr[0];
            float f3 = fArr2[0];
            float f4 = f2 * f3;
            float f5 = fArr[1];
            float f6 = fArr2[4];
            float f7 = f5 * f6;
            float f8 = fArr[2];
            float f9 = fArr2[8];
            float f10 = f8 * f9;
            float f11 = fArr[3];
            float f12 = fArr2[12];
            float f13 = f11 * f12;
            float f14 = fArr2[1];
            float f15 = f2 * f14;
            float f16 = fArr2[5];
            float f17 = f5 * f16;
            float f18 = fArr2[9];
            float f19 = f8 * f18;
            float f20 = fArr2[13];
            float f21 = f11 * f20;
            float f22 = fArr2[2];
            float f23 = f2 * f22;
            float f24 = fArr2[6];
            float f25 = f5 * f24;
            float f26 = fArr2[10];
            float f27 = f8 * f26;
            float f28 = fArr2[14];
            float f29 = f11 * f28;
            float f30 = fArr2[3];
            float f31 = fArr2[7];
            float f32 = fArr2[11];
            float f33 = fArr2[15];
            float f34 = fArr[4];
            float f35 = f34 * f3;
            float f36 = fArr[5];
            float f37 = f36 * f6;
            float f38 = fArr[6];
            float f39 = f38 * f9;
            float f40 = fArr[7];
            float f41 = f40 * f12;
            float f42 = f34 * f14;
            float f43 = f36 * f16;
            float f44 = f38 * f18;
            float f45 = f40 * f20;
            float f46 = f34 * f22;
            float f47 = f36 * f24;
            float f48 = f38 * f26;
            float f49 = f40 * f28;
            float f50 = fArr[8];
            float f51 = f50 * f3;
            float f52 = fArr[9];
            float f53 = f52 * f6;
            float f54 = fArr[10];
            float f55 = f54 * f9;
            float f56 = fArr[11];
            float f57 = f56 * f12;
            float f58 = f50 * f14;
            float f59 = f52 * f16;
            float f60 = f54 * f18;
            float f61 = f56 * f20;
            float f62 = f50 * f22;
            float f63 = f52 * f24;
            float f64 = f54 * f26;
            float f65 = f56 * f28;
            float f66 = fArr[12];
            float f67 = fArr[13];
            float f68 = fArr[14];
            float f69 = f9 * f68;
            float f70 = fArr[15];
            float f71 = f12 * f70;
            float f72 = f18 * f68;
            float f73 = f20 * f70;
            float f74 = f26 * f68;
            float f75 = f28 * f70;
            fArr[0] = f4 + f7 + f10 + f13;
            fArr[1] = f15 + f17 + f19 + f21;
            fArr[2] = f23 + f25 + f27 + f29;
            fArr[3] = (f2 * f30) + (f5 * f31) + (f8 * f32) + (f11 * f33);
            fArr[4] = f35 + f37 + f39 + f41;
            fArr[5] = f42 + f43 + f44 + f45;
            fArr[6] = f46 + f47 + f48 + f49;
            fArr[7] = (f34 * f30) + (f36 * f31) + (f38 * f32) + (f40 * f33);
            fArr[8] = f51 + f53 + f55 + f57;
            fArr[9] = f58 + f59 + f60 + f61;
            fArr[10] = f62 + f63 + f64 + f65;
            fArr[11] = (f50 * f30) + (f52 * f31) + (f54 * f32) + (f56 * f33);
            fArr[12] = (f3 * f66) + (f6 * f67) + f69 + f71;
            fArr[13] = (f14 * f66) + (f16 * f67) + f72 + f73;
            fArr[14] = (f22 * f66) + (f24 * f67) + f74 + f75;
            fArr[15] = (f66 * f30) + (f67 * f31) + (f68 * f32) + (f70 * f33);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8512toStringimpl(float[] fArr) {
        return h.n.o.c("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m8513translateimpl(float[] fArr, float f2, float f3, float f4) {
        if (fArr.length < 16) {
            return;
        }
        float f5 = fArr[0] * f2;
        float f6 = fArr[4] * f3;
        float f7 = f5 + f6 + (fArr[8] * f4) + fArr[12];
        float f8 = fArr[1] * f2;
        float f9 = fArr[5] * f3;
        float f10 = f8 + f9 + (fArr[9] * f4) + fArr[13];
        float f11 = fArr[2] * f2;
        float f12 = fArr[6] * f3;
        float f13 = f11 + f12 + (fArr[10] * f4) + fArr[14];
        float f14 = fArr[3] * f2;
        float f15 = fArr[7] * f3;
        float f16 = f14 + f15 + (fArr[11] * f4) + fArr[15];
        fArr[12] = f7;
        fArr[13] = f10;
        fArr[14] = f13;
        fArr[15] = f16;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m8514translateimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        m8513translateimpl(fArr, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        return m8493equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m8496hashCodeimpl(this.values);
    }

    public String toString() {
        return m8512toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m8515unboximpl() {
        return this.values;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m8491constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m8499mapimpl(float[] fArr, Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f11 = f4 * left;
        float f12 = f7 * top;
        float f13 = 1.0f / ((f11 + f12) + f10);
        if ((Float.floatToRawIntBits(f13) & Integer.MAX_VALUE) >= 2139095040) {
            f13 = 0.0f;
        }
        float f14 = f2 * left;
        float f15 = f5 * top;
        float f16 = f14 + f15 + f8;
        float f17 = left * f3;
        float f18 = top * f6;
        float f19 = f17 + f18 + f9;
        float f20 = f7 * bottom;
        float f21 = 1.0f / ((f11 + f20) + f10);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f5 * bottom;
        float f23 = f14 + f22 + f8;
        float f24 = f6 * bottom;
        float f25 = f17 + f24 + f9;
        float f26 = f4 * right;
        float f27 = 1.0f / ((f12 + f26) + f10);
        if ((Float.floatToRawIntBits(f27) & Integer.MAX_VALUE) >= 2139095040) {
            f27 = 0.0f;
        }
        float f28 = f2 * right;
        float f29 = f28 + f15 + f8;
        float f30 = f3 * right;
        float f31 = f18 + f30 + f9;
        float f32 = 1.0f / ((f26 + f20) + f10);
        float f33 = (Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) < 2139095040 ? f32 : 0.0f;
        float f34 = f30 + f24 + f9;
        float f35 = f23 * f21;
        float f36 = f27 * f29;
        float f37 = (f28 + f22 + f8) * f33;
        float f38 = f13 * f16;
        float f39 = f21 * f25;
        float f40 = f27 * f31;
        float f41 = f34 * f33;
        float f42 = f13 * f19;
        return new Rect(Math.min(f38, Math.min(f35, Math.min(f36, f37))), Math.min(f42, Math.min(f39, Math.min(f40, f41))), Math.max(f38, Math.max(f35, Math.max(f36, f37))), Math.max(f42, Math.max(f39, Math.max(f40, f41))));
    }
}
