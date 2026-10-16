package Va;

/* renamed from: Va.b9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0920b9 extends C0907a9 {

    /* renamed from: h, reason: collision with root package name */
    public static int f14035h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14036i = 1;

    public static String f(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 32091)) ^ ((c11 >>> 5) + 15007)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 60808) ^ ((c12 + i11) ^ ((c12 << 4) + 55264))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.C0907a9, Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        C1139s8 c1139s8C;
        int i5 = f14036i + 73;
        f14035h = i5 % 128;
        if (i5 % 2 != 0) {
            c1139s8C = super.c(c1203x8, c1214y7);
            c1139s8C.d(false);
        } else {
            c1139s8C = super.c(c1203x8, c1214y7);
            c1139s8C.d(true);
        }
        int i10 = f14035h + 69;
        f14036i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 43 / 0;
        }
        return c1139s8C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(f(7 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "ऒ₎朽\udfc2㜄魃ႏண").intern());
        r0.append(super.toString());
        r0 = r0.toString();
        r1 = Va.C0920b9.f14035h + 117;
        Va.C0920b9.f14036i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r0 = f(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 7, "ऒ₎朽\udfc2㜄魃ꏻ踉").intern();
        Va.C0920b9.f14035h = (Va.C0920b9.f14036i + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // Va.C0907a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = Va.C0920b9.f14035h
            int r0 = r0 + 87
            int r1 = r0 % 128
            Va.C0920b9.f14036i = r1
            int r0 = r0 % 2
            Va.y8 r1 = r5.f13982d
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L23
            int r0 = Va.C0907a9.f13980f
            int r0 = r0 + 83
            int r4 = r0 % 128
            Va.C0907a9.f13981g = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L22
            r0 = 58
            int r0 = r0 / r3
            if (r1 == 0) goto L64
            goto L31
        L22:
            throw r2
        L23:
            int r0 = Va.C0907a9.f13980f
            int r0 = r0 + 83
            int r4 = r0 % 128
            Va.C0907a9.f13981g = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L7d
            if (r1 == 0) goto L64
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r1 = r1 >> 16
            int r1 = 7 - r1
            java.lang.String r3 = "ऒ₎朽\udfc2㜄魃ႏண"
            java.lang.String r1 = f(r1, r3)
            java.lang.String r1 = r1.intern()
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = Va.C0920b9.f14035h
            int r1 = r1 + 117
            int r3 = r1 % 128
            Va.C0920b9.f14036i = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L63
            return r0
        L63:
            throw r2
        L64:
            int r0 = android.graphics.drawable.Drawable.resolveOpacity(r3, r3)
            int r0 = r0 + 7
            java.lang.String r1 = "ऒ₎朽\udfc2㜄魃ꏻ踉"
            java.lang.String r0 = f(r0, r1)
            java.lang.String r0 = r0.intern()
            int r1 = Va.C0920b9.f14036i
            int r1 = r1 + 109
            int r1 = r1 % 128
            Va.C0920b9.f14035h = r1
            return r0
        L7d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0920b9.toString():java.lang.String");
    }
}
