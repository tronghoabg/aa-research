package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ckk {
    public static final defpackage.ckk a = new defpackage.ckk();

    public final android.graphics.LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return new android.graphics.LinearGradient(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
    }

    public final android.graphics.RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return new android.graphics.RadialGradient(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), f, jArr, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
    }
}
