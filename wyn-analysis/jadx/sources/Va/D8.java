package Va;

import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class D8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static int f13272f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13273g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f13274d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13275e;

    public D8(AbstractC1215y8 abstractC1215y8, String str) {
        this.f13274d = abstractC1215y8;
        this.f13275e = str;
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        f13273g = (f13272f + 125) % 128;
        Object objC = this.f13274d.c(c1203x8, c1214y7).c();
        boolean z2 = objC instanceof C1214y7;
        String str = this.f13275e;
        if (!z2) {
            try {
                return new C1139s8(objC.getClass().getDeclaredField(str).get(objC));
            } catch (Exception unused) {
                return new C1139s8(null);
            }
        }
        C1139s8 c1139s8 = new C1139s8(((C1214y7) objC).q(str));
        f13272f = (f13273g + 21) % 128;
        return c1139s8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L4d
            java.lang.Class r2 = r6.getClass()
            java.lang.Class<Va.D8> r3 = Va.D8.class
            if (r3 == r2) goto L10
            goto L4d
        L10:
            Va.D8 r6 = (Va.D8) r6
            Va.y8 r2 = r6.f13274d
            Va.y8 r3 = r5.f13274d
            if (r3 == 0) goto L2f
            int r4 = Va.D8.f13273g
            int r4 = r4 + 31
            int r4 = r4 % 128
            Va.D8.f13272f = r4
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L32
            int r6 = Va.D8.f13273g
            int r6 = r6 + 49
            int r6 = r6 % 128
            Va.D8.f13272f = r6
            goto L31
        L2f:
            if (r2 == 0) goto L32
        L31:
            return r1
        L32:
            java.lang.String r6 = r6.f13275e
            java.lang.String r2 = r5.f13275e
            if (r2 == 0) goto L3d
            boolean r6 = r2.equals(r6)
            return r6
        L3d:
            if (r6 != 0) goto L4d
            int r6 = Va.D8.f13273g
            int r6 = r6 + 29
            int r2 = r6 % 128
            Va.D8.f13272f = r2
            int r6 = r6 % 2
            if (r6 == 0) goto L4c
            return r1
        L4c:
            return r0
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.D8.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = Va.D8.f13272f
            int r0 = r0 + 43
            int r1 = r0 % 128
            Va.D8.f13273g = r1
            int r0 = r0 % 2
            r1 = 0
            Va.y8 r2 = r3.f13274d
            if (r0 != 0) goto L15
            r0 = 54
            int r0 = r0 / r1
            if (r2 == 0) goto L1c
            goto L17
        L15:
            if (r2 == 0) goto L1c
        L17:
            int r0 = r2.hashCode()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            int r0 = r0 * 31
            java.lang.String r2 = r3.f13275e
            if (r2 == 0) goto L27
            int r1 = r2.hashCode()
        L27:
            int r0 = r0 + r1
            int r1 = Va.D8.f13273g
            int r1 = r1 + 23
            int r1 = r1 % 128
            Va.D8.f13272f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.D8.hashCode():int");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13274d.toString());
        int touchSlop = 1 - (ViewConfiguration.getTouchSlop() >> 8);
        char[] charArray = "讪\ue6ee".toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i5 = Ab.f13197E;
                    if (i5 >= charArray.length) {
                        break;
                    }
                    cArr2[0] = charArray[i5];
                    cArr2[1] = charArray[i5 + 1];
                    int i10 = 58224;
                    for (int i11 = 0; i11 < 16; i11++) {
                        char c10 = cArr2[1];
                        char c11 = cArr2[0];
                        char c12 = (char) (c10 - (((c11 + i10) ^ ((c11 << 4) + 57892)) ^ ((c11 >>> 5) + 55060)));
                        cArr2[1] = c12;
                        cArr2[0] = (char) (c11 - (((c12 >>> 5) + 58620) ^ ((c12 + i10) ^ ((c12 << 4) + 533))));
                        i10 -= 40503;
                    }
                    int i12 = Ab.f13197E;
                    cArr[i12] = cArr2[0];
                    cArr[i12 + 1] = cArr2[1];
                    Ab.f13197E = i12 + 2;
                }
                str = new String(cArr, 0, touchSlop);
            } catch (Throwable th) {
                throw th;
            }
        }
        sb2.append(str.intern());
        sb2.append(this.f13275e);
        String string = sb2.toString();
        int i13 = f13273g + 93;
        f13272f = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 12 / 0;
        }
        return string;
    }
}
