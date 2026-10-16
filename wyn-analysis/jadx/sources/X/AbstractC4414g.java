package x;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4414g {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f47507a;

    static {
        long[] jArr = AbstractC4427t.f47559a;
        int iD = AbstractC4427t.d(0);
        int iMax = iD > 0 ? Math.max(7, AbstractC4427t.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ff.m.q0(jArr);
        }
        int i5 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j8)) | j8;
        AbstractC4427t.a(iMax);
        int[] iArr = new int[iMax];
        f47507a = new int[0];
    }
}
