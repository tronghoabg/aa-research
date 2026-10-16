package defpackage;

/* loaded from: classes3.dex */
public final class ton {
    public static final byte[] a = {68, 82, 65, 84};
    private static final float[] b = new float[31];

    static {
        for (int i = 0; i <= 30; i++) {
            b[i] = (float) (Math.pow(2.0d, 30 - i) / 256.0d);
        }
    }

    public static float a(float f) {
        return (float) (Math.pow(2.0d, 30.0f - f) / 256.0d);
    }
}
