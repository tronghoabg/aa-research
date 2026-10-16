package Va;

import android.graphics.Color;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class I8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13424f = {1411768817, -225482512, 825996846, 1744057012, 1439915563, -1052891097, -878539719, 1876767303, 2063845712, 439803141, -88386540, -365978611, -1779319978, -434864079, 1312932671, 1362236437, -197087216, -1125826107};

    /* renamed from: g, reason: collision with root package name */
    public static int f13425g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13426h = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f13427d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1215y8 f13428e;

    public I8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82) {
        this.f13427d = abstractC1215y8;
        this.f13428e = abstractC1215y82;
    }

    public static String f(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13424f.clone();
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

    public final AbstractC1215y8 e() {
        int i5 = f13426h;
        int i10 = i5 + 41;
        f13425g = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        f13425g = (i5 + 77) % 128;
        return this.f13428e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L49
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L49
        L12:
            Va.I8 r5 = (Va.I8) r5
            Va.y8 r2 = r5.f13427d
            Va.y8 r3 = r4.f13427d
            if (r3 == 0) goto L29
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2c
            int r5 = Va.I8.f13425g
            int r5 = r5 + 75
            int r5 = r5 % 128
            Va.I8.f13426h = r5
            goto L2b
        L29:
            if (r2 == 0) goto L2c
        L2b:
            return r1
        L2c:
            Va.y8 r5 = r5.f13428e
            Va.y8 r2 = r4.f13428e
            if (r2 == 0) goto L37
            boolean r5 = r2.equals(r5)
            return r5
        L37:
            if (r5 != 0) goto L3a
            return r0
        L3a:
            int r5 = Va.I8.f13425g
            int r5 = r5 + 59
            int r0 = r5 % 128
            Va.I8.f13426h = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L47
            return r1
        L47:
            r5 = 0
            throw r5
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.I8.equals(java.lang.Object):boolean");
    }

    public final AbstractC1215y8 g() {
        int i5 = f13426h + 89;
        int i10 = i5 % 128;
        f13425g = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        f13426h = (i10 + 87) % 128;
        return this.f13427d;
    }

    public int hashCode() {
        int i5 = f13425g + 9;
        f13426h = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int iHashCode = 0;
        AbstractC1215y8 abstractC1215y8 = this.f13427d;
        int iHashCode2 = (abstractC1215y8 != null ? abstractC1215y8.hashCode() : 0) * 31;
        AbstractC1215y8 abstractC1215y82 = this.f13428e;
        if (abstractC1215y82 != null) {
            int i10 = f13425g + 63;
            f13426h = i10 % 128;
            if (i10 % 2 == 0) {
                abstractC1215y82.hashCode();
                throw null;
            }
            iHashCode = abstractC1215y82.hashCode();
            f13425g = (f13426h + 125) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g().toString());
        sb2.append(f(1 - (ViewConfiguration.getWindowTouchSlop() >> 8), new int[]{-1818049716, -461078107}).intern());
        sb2.append(e().toString());
        sb2.append(f(1 - Color.red(0), new int[]{-204645904, 125839984}).intern());
        String string = sb2.toString();
        int i5 = f13425g + 1;
        f13426h = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
