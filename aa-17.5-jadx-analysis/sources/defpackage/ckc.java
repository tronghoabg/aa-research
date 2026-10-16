package defpackage;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* loaded from: classes.dex */
final class ckc {
    public static final ckc a = new ckc();

    public final LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return new RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, jArr, (float[]) null, Shader.TileMode.CLAMP);
    }
}
