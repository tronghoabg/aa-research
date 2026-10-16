package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorMatrixKt {
    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m8308dotMe4OoYI(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 5;
        float f2 = fArr[i4] * fArr2[i3];
        float f3 = fArr[i4 + 1] * fArr2[i3 + 5];
        return f2 + f3 + (fArr[i4 + 2] * fArr2[i3 + 10]) + (fArr[i4 + 3] * fArr2[i3 + 15]);
    }
}
