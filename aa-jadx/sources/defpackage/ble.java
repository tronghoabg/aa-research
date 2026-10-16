package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ble {
    public static final defpackage.dej a = new defpackage.dej("SelectionHandleInfo");

    public static final long a(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - 1.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
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
