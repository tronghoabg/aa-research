package Va;

import android.graphics.ImageFormat;

/* loaded from: classes4.dex */
public final class T8 extends AbstractC1215y8 {

    /* renamed from: d, reason: collision with root package name */
    public static final T8 f13720d = new T8();

    /* renamed from: e, reason: collision with root package name */
    public static int f13721e = (1 + 53) % 128;

    /* renamed from: f, reason: collision with root package name */
    public static int f13722f = 1;

    public static String e(int i5) {
        String str;
        char[] charArray = "浩\ua83b洇ᛆ\udfad闊涢杍".toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-3084995345519002236L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-3084995345519002236L)));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        C1139s8 c1139s8 = new C1139s8(null);
        int i5 = f13721e + 97;
        f13722f = i5 % 128;
        if (i5 % 2 != 0) {
            return c1139s8;
        }
        throw null;
    }

    public final String toString() {
        int i5 = f13722f + 9;
        f13721e = i5 % 128;
        return (i5 % 2 != 0 ? e((-1) >>> ImageFormat.getBitsPerPixel(0)) : e((-1) - ImageFormat.getBitsPerPixel(0))).intern();
    }
}
