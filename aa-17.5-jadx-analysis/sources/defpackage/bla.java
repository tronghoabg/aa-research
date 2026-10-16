package defpackage;

/* loaded from: classes.dex */
public final class bla {
    public static final deb a = new deb("SelectionHandleInfo");

    public static final long a(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) - 1.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final boolean b(int i, boolean z) {
        if (i == 1) {
            if (!z) {
                return true;
            }
            z = true;
        }
        return i == 2 && z;
    }
}
