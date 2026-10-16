package Va;

/* loaded from: classes4.dex */
public enum W9 {
    f13824b(-1),
    f13825c(0),
    f13826d(1),
    f13827e(2),
    f13828f(3),
    f13829g(4),
    f13830h(5),
    f13831i(6),
    f13832j(7);


    /* renamed from: l, reason: collision with root package name */
    public static final int[] f13833l = {-1077194909, 118812584, -58858183, -1746563693, 288020993, -58735435, 1985736475, 1303989934, -1389986272, -340918760, 139450323, 983823714, -1527467829, 1522809222, 1527079327, -1988048549, -1452819418, -1220186796};

    /* renamed from: m, reason: collision with root package name */
    public static int f13834m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f13835n = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f13836a;

    static {
        int i5 = f13834m + 121;
        f13835n = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    W9(int i5) {
        this.f13836a = i5;
    }

    public static W9 a(int i5) {
        switch (i5) {
            case -1:
                return f13824b;
            case 0:
                return f13825c;
            case 1:
                return f13826d;
            case 2:
                f13835n = (f13834m + 75) % 128;
                return f13827e;
            case 3:
                return f13828f;
            case 4:
                return f13829g;
            case 5:
                return f13830h;
            case 6:
                return f13831i;
            case 7:
                int i10 = f13834m + 105;
                f13835n = i10 % 128;
                if (i10 % 2 != 0) {
                    return f13832j;
                }
                throw null;
            default:
                return null;
        }
    }

    public static String c(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13833l.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static W9 valueOf(String str) {
        int i5 = f13835n + 31;
        f13834m = i5 % 128;
        int i10 = i5 % 2;
        W9 w92 = (W9) Enum.valueOf(W9.class, str);
        if (i10 != 0) {
            int i11 = 81 / 0;
        }
        f13834m = (f13835n + 47) % 128;
        return w92;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static W9[] valuesCustom() {
        W9[] w9Arr;
        int i5 = f13835n + 61;
        f13834m = i5 % 128;
        int i10 = i5 % 2;
        W9[] w9ArrValuesCustom = values();
        if (i10 != 0) {
            w9Arr = (W9[]) w9ArrValuesCustom.clone();
            int i11 = 36 / 0;
        } else {
            w9Arr = (W9[]) w9ArrValuesCustom.clone();
        }
        f13834m = (f13835n + 99) % 128;
        return w9Arr;
    }

    public final int b() {
        int i5 = f13834m + 117;
        int i10 = i5 % 128;
        f13835n = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        f13834m = (i10 + 41) % 128;
        return this.f13836a;
    }
}
