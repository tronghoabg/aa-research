package Va;

import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public final class W8 extends AbstractC0946d9 {
    public static final char[] k = {'m', 214, 245, 281, '\\', 188, 16, 5, '2', 'h', 'o', 'l', 'B'};

    /* renamed from: l, reason: collision with root package name */
    public static int f13819l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f13820m = 1;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1215y8 f13821h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0933c9 f13822i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0933c9 f13823j;

    public W8(AbstractC1215y8 abstractC1215y8, AbstractC0933c9 abstractC0933c9, AbstractC0933c9 abstractC0933c92, byte b5) {
        super(b5);
        this.f13821h = abstractC1215y8;
        this.f13822i = abstractC0933c9;
        this.f13823j = abstractC0933c92;
    }

    public static String f(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(k, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r1
  0x0031: PHI (r1v3 int) = (r1v2 int), (r1v5 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Va.AbstractC0933c9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r5 = this;
            int r0 = Va.W8.f13820m
            int r0 = r0 + 119
            int r0 = r0 % 128
            Va.W8.f13819l = r0
            Va.c9 r0 = r5.f13822i
            int r1 = r0.a()
            Va.c9 r2 = r5.f13823j
            if (r2 == 0) goto L33
            int r3 = Va.W8.f13820m
            int r3 = r3 + 43
            int r4 = r3 % 128
            Va.W8.f13819l = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L28
            int r2 = r2.a()
            int r1 = r1 - r2
            boolean r0 = r0 instanceof Va.V8
            if (r0 == 0) goto L33
            goto L31
        L28:
            int r2 = r2.a()
            int r1 = r1 + r2
            boolean r0 = r0 instanceof Va.V8
            if (r0 == 0) goto L33
        L31:
            int r1 = r1 + (-1)
        L33:
            int r0 = Va.W8.f13819l
            int r0 = r0 + 105
            int r2 = r0 % 128
            Va.W8.f13820m = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L40
            return r1
        L40:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.W8.a():int");
    }

    @Override // Va.AbstractC0933c9
    public final int b(C1203x8 c1203x8) {
        boolean zE = c1203x8.e(this);
        AbstractC0933c9 abstractC0933c9 = this.f13822i;
        if (zE) {
            f13819l = (f13820m + 35) % 128;
            return abstractC0933c9 instanceof V8 ? 1 : 0;
        }
        int iA = abstractC0933c9.a();
        if (this.f13823j instanceof V8) {
            return iA;
        }
        int i5 = iA - 1;
        f13820m = (f13819l + 107) % 128;
        return i5;
    }

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        if (this.f13821h.c(c1203x8, c1214y7).e()) {
            int i5 = f13820m + 115;
            f13819l = i5 % 128;
            int i10 = i5 % 2;
            AbstractC0933c9 abstractC0933c9 = this.f13822i;
            if (i10 == 0) {
                return abstractC0933c9.d(c1203x8, c1214y7);
            }
            abstractC0933c9.d(c1203x8, c1214y7);
            throw null;
        }
        AbstractC0933c9 abstractC0933c92 = this.f13823j;
        if (abstractC0933c92 == null) {
            return new C1139s8(Boolean.FALSE);
        }
        int i11 = f13819l + 59;
        f13820m = i11 % 128;
        if (i11 % 2 != 0) {
            c1203x8.f(this);
            return abstractC0933c92.d(c1203x8, c1214y7);
        }
        c1203x8.f(this);
        abstractC0933c92.d(c1203x8, c1214y7);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        r0 = r0 + 85;
        Va.W8.f13819l = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r0 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (Va.W8.class == r5.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r5 = (Va.W8) r5;
        r0 = r5.f13821h;
        r1 = r4.f13821h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r1.equals(r0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = r5.f13822i;
        r1 = r4.f13822i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r1.equals(r0) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        r5 = r5.f13823j;
        r0 = r4.f13823j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        return r0.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r5 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        r5 = Va.W8.f13819l + 19;
        Va.W8.f13820m = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if ((r5 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r5 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = Va.W8.f13820m
            int r1 = r0 + 83
            int r2 = r1 % 128
            Va.W8.f13819l = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = 13
            int r1 = r1 / r3
            if (r4 != r5) goto L17
            goto L16
        L14:
            if (r4 != r5) goto L17
        L16:
            return r2
        L17:
            if (r5 == 0) goto L6e
            int r0 = r0 + 85
            int r1 = r0 % 128
            Va.W8.f13819l = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L6c
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<Va.W8> r1 = Va.W8.class
            if (r1 == r0) goto L2c
            goto L6e
        L2c:
            Va.W8 r5 = (Va.W8) r5
            Va.y8 r0 = r5.f13821h
            Va.y8 r1 = r4.f13821h
            if (r1 == 0) goto L3b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
            goto L3d
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return r3
        L3e:
            Va.c9 r0 = r5.f13822i
            Va.c9 r1 = r4.f13822i
            if (r1 == 0) goto L4b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4e
            goto L4d
        L4b:
            if (r0 == 0) goto L4e
        L4d:
            return r3
        L4e:
            Va.c9 r5 = r5.f13823j
            Va.c9 r0 = r4.f13823j
            if (r0 == 0) goto L59
            boolean r5 = r0.equals(r5)
            return r5
        L59:
            if (r5 != 0) goto L5c
            return r2
        L5c:
            int r5 = Va.W8.f13819l
            int r5 = r5 + 19
            int r0 = r5 % 128
            Va.W8.f13820m = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L6b
            r5 = 75
            int r5 = r5 / r3
        L6b:
            return r3
        L6c:
            r5 = 0
            throw r5
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.W8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        AbstractC1215y8 abstractC1215y8 = this.f13821h;
        if (abstractC1215y8 != null) {
            int i5 = f13819l + 121;
            f13820m = i5 % 128;
            if (i5 % 2 == 0) {
                abstractC1215y8.hashCode();
                throw null;
            }
            iHashCode = abstractC1215y8.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        AbstractC0933c9 abstractC0933c9 = this.f13822i;
        int iHashCode3 = (i10 + (abstractC0933c9 != null ? abstractC0933c9.hashCode() : 0)) * 31;
        AbstractC0933c9 abstractC0933c92 = this.f13823j;
        if (abstractC0933c92 != null) {
            int i11 = f13819l + 91;
            f13820m = i11 % 128;
            if (i11 % 2 == 0) {
                abstractC0933c92.hashCode();
                throw null;
            }
            iHashCode2 = abstractC0933c92.hashCode();
        } else {
            f13819l = (f13820m + 61) % 128;
        }
        return iHashCode3 + iHashCode2;
    }

    public final String toString() throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f("\u0000\u0000\u0000\u0001", new int[]{0, 4, 178, 0}, true).intern());
        sb2.append(this.f13821h);
        sb2.append(f("\u0000\u0001", new int[]{4, 2, 152, 0}, true).intern());
        AbstractC0933c9 abstractC0933c9 = this.f13822i;
        sb2.append(abstractC0933c9);
        AbstractC0933c9 abstractC0933c92 = this.f13823j;
        if (abstractC0933c92 != null) {
            int i5 = (f13820m + 39) % 128;
            f13819l = i5;
            if (abstractC0933c9 instanceof V8) {
                int i10 = i5 + 75;
                f13820m = i10 % 128;
                sb2.append((i10 % 2 == 0 ? f(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{6, 1, 0, 0}, false) : f(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{6, 1, 0, 0}, true)).intern());
            } else {
                sb2.append(f(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{7, 1, 0, 1}, true).intern());
                int i11 = AbstractC0946d9.f14107f + 69;
                AbstractC0946d9.f14108g = i11 % 128;
                int i12 = i11 % 2;
                AbstractC0946d9.e(this.f14109d, sb2);
                if (i12 == 0) {
                    throw null;
                }
            }
            sb2.append(f("\u0001\u0001\u0001\u0000\u0001", new int[]{8, 5, 0, 0}, false).intern());
            sb2.append(abstractC0933c92);
        }
        return sb2.toString();
    }
}
