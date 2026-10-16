package Va;

import android.widget.ExpandableListView;

/* renamed from: Va.f9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0972f9 extends AbstractC0933c9 {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14163f = {-1154705051, 1218761377, -396592272, -971438388, 2079037843, 919666884, 810281750, -1477483322, -489418704, 979105129, -558078731, -1392896611, -724801083, 1619345780, 1450923223, 788044811, -1275241476, -301521547};

    /* renamed from: g, reason: collision with root package name */
    public static int f14164g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14165h = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f14166d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0933c9 f14167e;

    public C0972f9(AbstractC1215y8 abstractC1215y8, AbstractC0933c9 abstractC0933c9) {
        this.f14166d = abstractC1215y8;
        this.f14167e = abstractC0933c9;
    }

    public static String e(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14163f.clone();
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

    @Override // Va.AbstractC0933c9
    public final int a() {
        int i5 = f14164g + 77;
        f14165h = i5 % 128;
        int i10 = i5 % 2;
        AbstractC0933c9 abstractC0933c9 = this.f14167e;
        if (i10 != 0) {
            return abstractC0933c9.a();
        }
        abstractC0933c9.a();
        throw null;
    }

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        while (this.f14166d.c(c1203x8, c1214y7).e()) {
            C1139s8 c1139s8D = this.f14167e.d(c1203x8, c1214y7);
            if (c1139s8D.g()) {
                break;
            }
            f14165h = (f14164g + 11) % 128;
            if (c1139s8D.b()) {
                int i5 = f14165h + 39;
                f14164g = i5 % 128;
                if (i5 % 2 == 0) {
                    return c1139s8D;
                }
                throw null;
            }
        }
        C1139s8 c1139s8 = new C1139s8(null);
        f14165h = (f14164g + 121) % 128;
        return c1139s8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f14165h = (f14164g + 121) % 128;
            return true;
        }
        if (obj != null) {
            f14165h = (f14164g + 41) % 128;
            if (C0972f9.class == obj.getClass()) {
                C0972f9 c0972f9 = (C0972f9) obj;
                AbstractC1215y8 abstractC1215y8 = c0972f9.f14166d;
                AbstractC1215y8 abstractC1215y82 = this.f14166d;
                if (abstractC1215y82 == null ? abstractC1215y8 != null : !abstractC1215y82.equals(abstractC1215y8)) {
                    return false;
                }
                AbstractC0933c9 abstractC0933c9 = c0972f9.f14167e;
                AbstractC0933c9 abstractC0933c92 = this.f14167e;
                if (abstractC0933c92 != null) {
                    return abstractC0933c92.equals(abstractC0933c9);
                }
                if (abstractC0933c9 == null) {
                    return true;
                }
                int i5 = f14165h + 119;
                f14164g = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5;
        int iHashCode = 0;
        AbstractC1215y8 abstractC1215y8 = this.f14166d;
        int iHashCode2 = (abstractC1215y8 != null ? abstractC1215y8.hashCode() : 0) * 31;
        AbstractC0933c9 abstractC0933c9 = this.f14167e;
        if (abstractC0933c9 != null) {
            iHashCode = abstractC0933c9.hashCode();
            i5 = f14164g + 99;
        } else {
            i5 = f14164g + 105;
        }
        f14165h = i5 % 128;
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e(6 - ExpandableListView.getPackedPositionChild(0L), new int[]{1537562470, -1891769830, 1556106052, 1150634889}).intern());
        sb2.append(this.f14166d);
        sb2.append(e((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, new int[]{-1299129002, 1212552106}).intern());
        sb2.append(this.f14167e);
        String string = sb2.toString();
        f14164g = (f14165h + 65) % 128;
        return string;
    }
}
