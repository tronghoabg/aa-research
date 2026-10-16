package Va;

import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class Q8 extends N8 {
    public static int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f13629l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static int f13630m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f13631n = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13632j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, int i5) {
        super(abstractC1215y8, abstractC1215y82, 0);
        this.f13632j = i5;
    }

    public static String m(int i5) {
        String str;
        char[] charArray = "⧫ᄔ".toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 6842658195598748118L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.F8
    public final String h() {
        String str;
        switch (this.f13632j) {
            case 0:
                int i5 = f13629l + 47;
                k = i5 % 128;
                return m(i5 % 2 != 0 ? 8132 - (ViewConfiguration.getScrollBarFadeDuration() + 59) : 14591 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
            default:
                f13630m = (f13631n + 107) % 128;
                int maximumFlingVelocity = 2 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                char[] charArray = "胋嗩".toCharArray();
                synchronized (Ab.f13198F) {
                    try {
                        char[] cArr = new char[charArray.length];
                        Ab.f13197E = 0;
                        char[] cArr2 = new char[2];
                        while (true) {
                            int i10 = Ab.f13197E;
                            if (i10 < charArray.length) {
                                cArr2[0] = charArray[i10];
                                cArr2[1] = charArray[i10 + 1];
                                int i11 = 58224;
                                for (int i12 = 0; i12 < 16; i12++) {
                                    char c10 = cArr2[1];
                                    char c11 = cArr2[0];
                                    char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 13712)) ^ ((c11 >>> 5) + 26119)));
                                    cArr2[1] = c12;
                                    cArr2[0] = (char) (c11 - (((c12 >>> 5) + 6769) ^ ((c12 + i11) ^ ((c12 << 4) + 17952))));
                                    i11 -= 40503;
                                }
                                int i13 = Ab.f13197E;
                                cArr[i13] = cArr2[0];
                                cArr[i13 + 1] = cArr2[1];
                                Ab.f13197E = i13 + 2;
                            } else {
                                str = new String(cArr, 0, maximumFlingVelocity);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String strIntern = str.intern();
                int i14 = f13630m + 1;
                f13631n = i14 % 128;
                if (i14 % 2 != 0) {
                    return strIntern;
                }
                throw null;
        }
    }

    @Override // Va.N8
    public final boolean j(Object obj, Object obj2) {
        switch (this.f13632j) {
            case 0:
                int i5 = k;
                int i10 = i5 + 53;
                f13629l = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                if (obj != obj2) {
                    return false;
                }
                int i11 = i5 + 57;
                f13629l = i11 % 128;
                if (i11 % 2 != 0) {
                    return true;
                }
                throw null;
            default:
                int i12 = (f13631n + 51) % 128;
                f13630m = i12;
                if (obj == obj2) {
                    return false;
                }
                int i13 = i12 + 77;
                f13631n = i13 % 128;
                if (i13 % 2 != 0) {
                    return true;
                }
                throw null;
        }
    }

    @Override // Va.N8
    public final boolean k(String str, String str2) {
        switch (this.f13632j) {
            case 0:
                f13629l = (k + 113) % 128;
                boolean zEquals = str.equals(str2);
                f13629l = (k + 73) % 128;
                return zEquals;
            default:
                if (str.equals(str2)) {
                    return false;
                }
                int i5 = (f13630m + 61) % 128;
                f13631n = i5;
                f13630m = (i5 + 7) % 128;
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r4 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r4 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = r0 + 49;
        Va.Q8.f13629l = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if ((r0 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return false;
     */
    @Override // Va.N8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(int r4) {
        /*
            r3 = this;
            int r0 = r3.f13632j
            switch(r0) {
                case 0: goto L26;
                default: goto L5;
            }
        L5:
            int r0 = Va.Q8.f13630m
            int r1 = r0 + 71
            int r2 = r1 % 128
            Va.Q8.f13631n = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L24
            r1 = 0
            if (r4 == 0) goto L23
            int r0 = r0 + 123
            int r4 = r0 % 128
            Va.Q8.f13631n = r4
            int r0 = r0 % 2
            r4 = 1
            if (r0 != 0) goto L22
            r0 = 13
            int r0 = r0 / r1
        L22:
            r1 = r4
        L23:
            return r1
        L24:
            r4 = 0
            throw r4
        L26:
            int r0 = Va.Q8.k
            int r1 = r0 + 57
            int r2 = r1 % 128
            Va.Q8.f13629l = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 != 0) goto L39
            r1 = 68
            int r1 = r1 / r2
            if (r4 != 0) goto L3d
            goto L3b
        L39:
            if (r4 != 0) goto L3d
        L3b:
            r2 = 1
            goto L47
        L3d:
            int r0 = r0 + 49
            int r4 = r0 % 128
            Va.Q8.f13629l = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L48
        L47:
            return r2
        L48:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Q8.l(int):boolean");
    }
}
