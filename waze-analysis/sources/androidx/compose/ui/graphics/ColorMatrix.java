package androidx.compose.ui.graphics;

import h.ab;
import h.g.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m8283boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m8285constructorimpl$default(float[] fArr, int i2, o oVar) {
        return (i2 & 1) != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : fArr;
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m8286convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m8287convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8288equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && x.n(fArr, ((ColorMatrix) obj).m8303unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8289equalsimpl0(float[] fArr, float[] fArr2) {
        return x.n(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m8290getimpl(float[] fArr, int i2, int i3) {
        return fArr[(i2 * 5) + i3];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8291hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m8292resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m8293rotateInternalimpl(float[] fArr, float f2, p<? super Float, ? super Float, ab> pVar) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f3 = f2 * 0.0027777778f;
        float fFloor = (0.25f + f3) - ((float) Math.floor(r5 + 0.5f));
        float fAbs = Math.abs(fFloor);
        float f4 = fAbs + fAbs;
        float fFloor2 = f3 - ((float) Math.floor(0.5f + f3));
        float fAbs2 = Math.abs(fFloor2);
        float f5 = fAbs2 + fAbs2;
        float f6 = 1.0f - f4;
        float f7 = 1.0f - f5;
        pVar.invoke(Float.valueOf(((fFloor * 8.0f) * f6) / (1.25f - (f4 * f6))), Float.valueOf(((fFloor2 * 8.0f) * f7) / (1.25f - (f5 * f7))));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m8294setimpl(float[] fArr, int i2, int i3, float f2) {
        fArr[(i2 * 5) + i3] = f2;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m8295setjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 20 && fArr2.length >= 20) {
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
            fArr[16] = fArr2[16];
            fArr[17] = fArr2[17];
            fArr[18] = fArr2[18];
            fArr[19] = fArr2[19];
        }
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m8296setToRotateBlueimpl(float[] fArr, float f2) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f3 = f2 * 0.0027777778f;
        float fFloor = (0.25f + f3) - ((float) Math.floor(r3 + 0.5f));
        float fAbs = Math.abs(fFloor);
        float f4 = fAbs + fAbs;
        float fFloor2 = f3 - ((float) Math.floor(0.5f + f3));
        float fAbs2 = Math.abs(fFloor2);
        float f5 = fAbs2 + fAbs2;
        float f6 = 1.0f - f4;
        float f7 = ((fFloor * 8.0f) * f6) / (1.25f - (f4 * f6));
        fArr[0] = f7;
        float f8 = 1.0f - f5;
        float f9 = ((fFloor2 * 8.0f) * f8) / (1.25f - (f5 * f8));
        fArr[1] = f9;
        fArr[5] = -f9;
        fArr[6] = f7;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m8297setToRotateGreenimpl(float[] fArr, float f2) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f3 = f2 * 0.0027777778f;
        float fFloor = (0.25f + f3) - ((float) Math.floor(r3 + 0.5f));
        float fAbs = Math.abs(fFloor);
        float f4 = fAbs + fAbs;
        float fFloor2 = f3 - ((float) Math.floor(0.5f + f3));
        float fAbs2 = Math.abs(fFloor2);
        float f5 = fAbs2 + fAbs2;
        float f6 = 1.0f - f4;
        float f7 = ((fFloor * 8.0f) * f6) / (1.25f - (f4 * f6));
        fArr[0] = f7;
        float f8 = 1.0f - f5;
        float f9 = ((fFloor2 * 8.0f) * f8) / (1.25f - (f5 * f8));
        fArr[2] = -f9;
        fArr[10] = f9;
        fArr[12] = f7;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m8298setToRotateRedimpl(float[] fArr, float f2) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f3 = f2 * 0.0027777778f;
        float fFloor = (0.25f + f3) - ((float) Math.floor(r2 + 0.5f));
        float fAbs = Math.abs(fFloor);
        float f4 = fAbs + fAbs;
        float fFloor2 = f3 - ((float) Math.floor(0.5f + f3));
        float fAbs2 = Math.abs(fFloor2);
        float f5 = fAbs2 + fAbs2;
        float f6 = 1.0f - f4;
        float f7 = ((fFloor * 8.0f) * f6) / (1.25f - (f4 * f6));
        fArr[6] = f7;
        float f8 = 1.0f - f5;
        float f9 = ((fFloor2 * 8.0f) * f8) / (1.25f - (f5 * f8));
        fArr[7] = f9;
        fArr[11] = -f9;
        fArr[12] = f7;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m8299setToSaturationimpl(float[] fArr, float f2) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f3 = 1.0f - f2;
        float f4 = 0.213f * f3;
        fArr[0] = f4 + f2;
        float f5 = 0.715f * f3;
        fArr[1] = f5;
        float f6 = f3 * 0.072f;
        fArr[2] = f6;
        fArr[5] = f4;
        fArr[6] = f5 + f2;
        fArr[7] = f6;
        fArr[10] = f4;
        fArr[11] = f5;
        fArr[12] = f6 + f2;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m8300setToScaleimpl(float[] fArr, float f2, float f3, float f4, float f5) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f2;
        fArr[6] = f3;
        fArr[12] = f4;
        fArr[18] = f5;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m8301timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f2 = fArr[0];
        float f3 = fArr2[0];
        float f4 = f2 * f3;
        float f5 = fArr[1];
        float f6 = fArr2[5];
        float f7 = f5 * f6;
        float f8 = fArr[2];
        float f9 = fArr2[10];
        float f10 = f8 * f9;
        float f11 = fArr[3];
        float f12 = fArr2[15];
        float f13 = f11 * f12;
        float f14 = fArr2[1];
        float f15 = f2 * f14;
        float f16 = fArr2[6];
        float f17 = f5 * f16;
        float f18 = fArr2[11];
        float f19 = f8 * f18;
        float f20 = fArr2[16];
        float f21 = f11 * f20;
        float f22 = fArr2[2];
        float f23 = f2 * f22;
        float f24 = fArr2[7];
        float f25 = f5 * f24;
        float f26 = fArr2[12];
        float f27 = f8 * f26;
        float f28 = fArr2[17];
        float f29 = f11 * f28;
        float f30 = fArr2[3];
        float f31 = f2 * f30;
        float f32 = fArr2[8];
        float f33 = f5 * f32;
        float f34 = fArr2[13];
        float f35 = f8 * f34;
        float f36 = fArr2[18];
        float f37 = f11 * f36;
        float f38 = fArr2[4];
        float f39 = fArr2[9];
        float f40 = fArr2[14];
        float f41 = fArr2[19];
        float f42 = (f2 * f38) + (f5 * f39) + (f8 * f40) + (f11 * f41) + fArr[4];
        float f43 = fArr[5];
        float f44 = f43 * f3;
        float f45 = fArr[6];
        float f46 = f45 * f6;
        float f47 = fArr[7];
        float f48 = f47 * f9;
        float f49 = fArr[8];
        float f50 = f49 * f12;
        float f51 = f43 * f14;
        float f52 = f45 * f16;
        float f53 = f47 * f18;
        float f54 = f49 * f20;
        float f55 = f43 * f22;
        float f56 = f45 * f24;
        float f57 = f47 * f26;
        float f58 = f49 * f28;
        float f59 = f43 * f30;
        float f60 = f45 * f32;
        float f61 = f47 * f34;
        float f62 = f49 * f36;
        float f63 = (f43 * f38) + (f45 * f39) + (f47 * f40) + (f49 * f41) + fArr[9];
        float f64 = fArr[10];
        float f65 = f64 * f3;
        float f66 = fArr[11];
        float f67 = f66 * f6;
        float f68 = fArr[12];
        float f69 = f68 * f9;
        float f70 = fArr[13];
        float f71 = f70 * f12;
        float f72 = f64 * f14;
        float f73 = f66 * f16;
        float f74 = f68 * f18;
        float f75 = f70 * f20;
        float f76 = f64 * f22;
        float f77 = f66 * f24;
        float f78 = f68 * f26;
        float f79 = f70 * f28;
        float f80 = f64 * f30;
        float f81 = f66 * f32;
        float f82 = f68 * f34;
        float f83 = f70 * f36;
        float f84 = f4 + f7 + f10 + f13;
        float f85 = (f64 * f38) + (f66 * f39) + (f68 * f40) + (f70 * f41) + fArr[14];
        float f86 = fArr[15];
        float f87 = fArr[16];
        float f88 = fArr[17];
        float f89 = f9 * f88;
        float f90 = fArr[18];
        float f91 = f12 * f90;
        float f92 = f18 * f88;
        float f93 = f20 * f90;
        float f94 = f26 * f88;
        float f95 = f28 * f90;
        float f96 = f34 * f88;
        float f97 = f36 * f90;
        float f98 = (f86 * f38) + (f87 * f39) + (f88 * f40) + (f90 * f41) + fArr[19];
        fArr[0] = f84;
        fArr[1] = f15 + f17 + f19 + f21;
        fArr[2] = f23 + f25 + f27 + f29;
        fArr[3] = f31 + f33 + f35 + f37;
        fArr[4] = f42;
        fArr[5] = f44 + f46 + f48 + f50;
        fArr[6] = f51 + f52 + f53 + f54;
        fArr[7] = f55 + f56 + f57 + f58;
        fArr[8] = f59 + f60 + f61 + f62;
        fArr[9] = f63;
        fArr[10] = f65 + f67 + f69 + f71;
        fArr[11] = f72 + f73 + f74 + f75;
        fArr[12] = f76 + f77 + f78 + f79;
        fArr[13] = f80 + f81 + f82 + f83;
        fArr[14] = f85;
        fArr[15] = (f3 * f86) + (f6 * f87) + f89 + f91;
        fArr[16] = (f14 * f86) + (f16 * f87) + f92 + f93;
        fArr[17] = (f22 * f86) + (f24 * f87) + f94 + f95;
        fArr[18] = (f30 * f86) + (f32 * f87) + f96 + f97;
        fArr[19] = f98;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8302toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m8288equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m8291hashCodeimpl(this.values);
    }

    public String toString() {
        return m8302toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m8303unboximpl() {
        return this.values;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m8284constructorimpl(float[] fArr) {
        return fArr;
    }
}
