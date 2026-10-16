package Va;

/* renamed from: Va.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0923c extends Ob {

    /* renamed from: o, reason: collision with root package name */
    public static int f14047o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f14048p = 1;

    /* renamed from: l, reason: collision with root package name */
    public String f14049l;

    /* renamed from: m, reason: collision with root package name */
    public String f14050m;

    /* renamed from: n, reason: collision with root package name */
    public String f14051n;

    public static String a(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 99295043727978549L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ String b(C0923c c0923c) {
        int i5 = (f14047o + 61) % 128;
        f14048p = i5;
        String str = c0923c.f14051n;
        int i10 = i5 + 91;
        f14047o = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 88 / 0;
        }
        return str;
    }

    public static String c(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(2231152186400035710L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 2231152186400035710L));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ String d(C0923c c0923c) {
        int i5 = f14048p;
        int i10 = i5 + 107;
        f14047o = i10 % 128;
        int i11 = i10 % 2;
        String str = c0923c.f14050m;
        if (i11 != 0) {
            throw null;
        }
        int i12 = i5 + 73;
        f14047o = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
