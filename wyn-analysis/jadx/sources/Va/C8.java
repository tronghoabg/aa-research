package Va;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class C8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static int f13253f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13254g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final J8 f13255d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1215y8 f13256e;

    public C8(J8 j8, AbstractC1215y8 abstractC1215y8) {
        this.f13255d = j8;
        this.f13256e = abstractC1215y8;
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        f13254g = (f13253f + 7) % 128;
        C1139s8 c1139s8C = this.f13256e.c(c1203x8, c1214y7);
        c1203x8.d(c1139s8C.c(), this.f13255d.e());
        f13253f = (f13254g + 41) % 128;
        return c1139s8C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            int i5 = f13254g + 103;
            f13253f = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj != null && C8.class == obj.getClass()) {
            C8 c82 = (C8) obj;
            J8 j8 = c82.f13255d;
            J8 j82 = this.f13255d;
            if (j82 == null ? j8 != null : !j82.equals(j8)) {
                int i10 = f13254g + 67;
                f13253f = i10 % 128;
                if (i10 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            AbstractC1215y8 abstractC1215y8 = c82.f13256e;
            AbstractC1215y8 abstractC1215y82 = this.f13256e;
            if (abstractC1215y82 != null) {
                return abstractC1215y82.equals(abstractC1215y8);
            }
            if (abstractC1215y8 == null) {
                int i11 = f13253f + 109;
                f13254g = i11 % 128;
                return i11 % 2 != 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        J8 j8 = this.f13255d;
        int iHashCode2 = (j8 != null ? j8.hashCode() : 0) * 31;
        AbstractC1215y8 abstractC1215y8 = this.f13256e;
        if (abstractC1215y8 != null) {
            int i5 = f13253f + 59;
            f13254g = i5 % 128;
            if (i5 % 2 == 0) {
                abstractC1215y8.hashCode();
                throw null;
            }
            iHashCode = abstractC1215y8.hashCode();
            f13254g = (f13253f + 77) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13255d);
        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4;
        char[] charArray = "싗㸹틄\uda65".toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i5 = Ab.f13197E;
                    if (i5 < charArray.length) {
                        cArr2[0] = charArray[i5];
                        cArr2[1] = charArray[i5 + 1];
                        int i10 = 58224;
                        for (int i11 = 0; i11 < 16; i11++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i10) ^ ((c11 << 4) + 63898)) ^ ((c11 >>> 5) + 36955)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 55212) ^ ((c12 + i10) ^ ((c12 << 4) + 53261))));
                            i10 -= 40503;
                        }
                        int i12 = Ab.f13197E;
                        cArr[i12] = cArr2[0];
                        cArr[i12 + 1] = cArr2[1];
                        Ab.f13197E = i12 + 2;
                    } else {
                        str = new String(cArr, 0, iIndexOf);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sb2.append(str.intern());
        sb2.append(this.f13256e);
        String string = sb2.toString();
        f13254g = (f13253f + 121) % 128;
        return string;
    }
}
