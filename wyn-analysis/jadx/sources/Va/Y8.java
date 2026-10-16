package Va;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class Y8 extends AbstractC0933c9 {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f13871h = {-2110499006, 628665497, -1360820752, 930702440, 845170259, 956846547, -1071501743, 701844863, 1618993225, -429352635, 1228815329, 1433260970, 281192638, 693209386, -301888960, -937884034, 1445223949, 540915295};

    /* renamed from: i, reason: collision with root package name */
    public static int f13872i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f13873j = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1215y8 f13874d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1215y8 f13875e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1215y8 f13876f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0933c9 f13877g;

    public Y8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, AbstractC1215y8 abstractC1215y83, AbstractC0933c9 abstractC0933c9) {
        this.f13874d = abstractC1215y8;
        this.f13875e = abstractC1215y82;
        this.f13876f = abstractC1215y83;
        this.f13877g = abstractC0933c9;
    }

    public static String e(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13871h.clone();
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

    public static void f(AbstractC1215y8 abstractC1215y8, C1203x8 c1203x8, C1214y7 c1214y7) {
        int i5 = f13873j;
        int i10 = i5 + 89;
        f13872i = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (abstractC1215y8 != null) {
            int i11 = i5 + 93;
            f13872i = i11 % 128;
            if (i11 % 2 == 0) {
                abstractC1215y8.c(c1203x8, c1214y7);
            } else {
                abstractC1215y8.c(c1203x8, c1214y7);
                int i12 = 51 / 0;
            }
        }
    }

    @Override // Va.AbstractC0933c9
    public final int a() {
        int i5 = f13873j + 79;
        f13872i = i5 % 128;
        int i10 = i5 % 2;
        AbstractC0933c9 abstractC0933c9 = this.f13877g;
        if (i10 == 0) {
            return abstractC0933c9.a();
        }
        abstractC0933c9.a();
        throw null;
    }

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        f(this.f13874d, c1203x8, c1214y7);
        while (this.f13875e.c(c1203x8, c1214y7).e()) {
            int i5 = f13872i + 101;
            f13873j = i5 % 128;
            int i10 = i5 % 2;
            AbstractC0933c9 abstractC0933c9 = this.f13877g;
            if (i10 == 0) {
                abstractC0933c9.d(c1203x8, c1214y7).g();
                throw null;
            }
            C1139s8 c1139s8D = abstractC0933c9.d(c1203x8, c1214y7);
            if (!(!c1139s8D.g())) {
                break;
            }
            if (c1139s8D.b()) {
                f13872i = (f13873j + 25) % 128;
                return c1139s8D;
            }
            f(this.f13876f, c1203x8, c1214y7);
        }
        return new C1139s8(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y8.class != obj.getClass()) {
            return false;
        }
        Y8 y82 = (Y8) obj;
        AbstractC1215y8 abstractC1215y8 = y82.f13874d;
        AbstractC1215y8 abstractC1215y82 = this.f13874d;
        if (abstractC1215y82 == null ? abstractC1215y8 != null : !abstractC1215y82.equals(abstractC1215y8)) {
            return false;
        }
        AbstractC1215y8 abstractC1215y83 = y82.f13875e;
        AbstractC1215y8 abstractC1215y84 = this.f13875e;
        if (abstractC1215y84 == null ? abstractC1215y83 != null : !abstractC1215y84.equals(abstractC1215y83)) {
            return false;
        }
        AbstractC1215y8 abstractC1215y85 = y82.f13876f;
        AbstractC1215y8 abstractC1215y86 = this.f13876f;
        if (abstractC1215y86 == null ? abstractC1215y85 != null : !abstractC1215y86.equals(abstractC1215y85)) {
            return false;
        }
        AbstractC0933c9 abstractC0933c9 = y82.f13877g;
        AbstractC0933c9 abstractC0933c92 = this.f13877g;
        if (abstractC0933c92 != null) {
            f13873j = (f13872i + 13) % 128;
            return abstractC0933c92.equals(abstractC0933c9);
        }
        if (abstractC0933c9 == null) {
            f13872i = (f13873j + 89) % 128;
            return true;
        }
        int i5 = f13872i + 7;
        f13873j = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        AbstractC1215y8 abstractC1215y8 = this.f13874d;
        int iHashCode3 = (abstractC1215y8 != null ? abstractC1215y8.hashCode() : 0) * 31;
        AbstractC1215y8 abstractC1215y82 = this.f13875e;
        if (abstractC1215y82 != null) {
            int i5 = f13872i + 49;
            f13873j = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode = abstractC1215y82.hashCode();
                int i10 = 80 / 0;
            } else {
                iHashCode = abstractC1215y82.hashCode();
            }
        } else {
            iHashCode = 0;
        }
        int i11 = (iHashCode3 + iHashCode) * 31;
        AbstractC1215y8 abstractC1215y83 = this.f13876f;
        int iHashCode4 = (i11 + (abstractC1215y83 != null ? abstractC1215y83.hashCode() : 0)) * 31;
        AbstractC0933c9 abstractC0933c9 = this.f13877g;
        if (abstractC0933c9 != null) {
            iHashCode2 = abstractC0933c9.hashCode();
        } else {
            f13872i = (f13873j + 105) % 128;
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e(5 - ExpandableListView.getPackedPositionGroup(0L), new int[]{-532087109, 430570348, 1922257657, -628059670}).intern());
        AbstractC1215y8 abstractC1215y8 = this.f13874d;
        if (abstractC1215y8 != null) {
            sb2.append(abstractC1215y8);
            f13873j = (f13872i + 73) % 128;
        }
        sb2.append(e(View.combineMeasuredStates(0, 0) + 2, new int[]{-897516107, 1216208209}).intern());
        sb2.append(this.f13875e);
        sb2.append(e(3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new int[]{-897516107, 1216208209}).intern());
        AbstractC1215y8 abstractC1215y82 = this.f13876f;
        if (abstractC1215y82 != null) {
            f13872i = (f13873j + 105) % 128;
            sb2.append(abstractC1215y82);
        }
        sb2.append(e(2 - (ViewConfiguration.getFadingEdgeLength() >> 16), new int[]{-928996664, 324194760}).intern());
        sb2.append(this.f13877g);
        String string = sb2.toString();
        int i5 = f13873j + 49;
        f13872i = i5 % 128;
        if (i5 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
