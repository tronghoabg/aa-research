package Va;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class H8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13408f = {-97072527, 314927285, -1395367235, 1152626658, 248341502, -1512659027, -1991323238, 2047615021, 543172010, 230576336, 834276094, -22671183, -2084060351, 1576839628, -1591824824, -4941532, -1429228245, 2120991735};

    /* renamed from: g, reason: collision with root package name */
    public static int f13409g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13410h = 1;

    /* renamed from: d, reason: collision with root package name */
    public final String f13411d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1215y8[] f13412e;

    public H8(String str, ArrayList arrayList) {
        this.f13411d = AbstractC1152t8.a(str);
        AbstractC1215y8[] abstractC1215y8Arr = new AbstractC1215y8[arrayList.size()];
        this.f13412e = abstractC1215y8Arr;
        arrayList.toArray(abstractC1215y8Arr);
    }

    public static String f(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13408f.clone();
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

    @Override // Va.AbstractC1215y8
    public C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        ArrayList arrayListH = h(c1203x8, c1214y7);
        if (g().equals(f(3 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{1449737587, -585815792}).intern())) {
            String strIntern = f(7 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{-816249297, -1428227560, -2071283647, -46413596}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c1214y7.f());
            sb2.append(f((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, new int[]{1903551645, -1165135709}).intern());
            sb2.append(arrayListH.get(0));
            AbstractC0897a.e(strIntern, sb2.toString());
            C1139s8 c1139s8 = new C1139s8(null);
            f13410h = (f13409g + 87) % 128;
            return c1139s8;
        }
        try {
            return new C1139s8(((C1126r8) c1203x8.h(g())).c(c1203x8, c1214y7, arrayListH));
        } catch (Exception unused) {
            if (c1214y7.h().f(g()) != null) {
                C1139s8 c1139s8C = c1214y7.h().f(g()).c(c1203x8, c1214y7, arrayListH);
                c1139s8C.d(false);
                f13409g = (f13410h + 111) % 128;
                return c1139s8C;
            }
            C1139s8 c1139s82 = new C1139s8(c1214y7.d().a(c1214y7, g(), arrayListH, c1214y7.b(), c1203x8));
            int i5 = f13409g + 77;
            f13410h = i5 % 128;
            if (i5 % 2 != 0) {
                return c1139s82;
            }
            throw null;
        }
    }

    public String e(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13411d);
        sb2.append(f(-TextUtils.lastIndexOf("", '0'), new int[]{-1587493455, -883824935}).intern());
        sb2.append(AbstractC1215y8.d(objArr));
        sb2.append(f((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{1041012195, 1297050257}).intern());
        String string = sb2.toString();
        int i5 = f13409g + 11;
        f13410h = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 56 / 0;
        }
        return string;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            f13410h = (f13409g + 89) % 128;
            return true;
        }
        if (obj != null) {
            f13409g = (f13410h + 107) % 128;
            if (getClass() == obj.getClass()) {
                H8 h82 = (H8) obj;
                if (this.f13411d.equals(h82.f13411d)) {
                    return Arrays.equals(this.f13412e, h82.f13412e);
                }
                return false;
            }
        }
        return false;
    }

    public final String g() {
        int i5 = f13409g + 113;
        f13410h = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f13411d;
        }
        throw null;
    }

    public final ArrayList h(C1203x8 c1203x8, C1214y7 c1214y7) {
        ArrayList arrayList = new ArrayList();
        AbstractC1215y8[] abstractC1215y8Arr = this.f13412e;
        f13409g = (f13410h + 89) % 128;
        for (AbstractC1215y8 abstractC1215y8 : abstractC1215y8Arr) {
            arrayList.add(abstractC1215y8.c(c1203x8, c1214y7).c());
        }
        int i5 = f13410h + 33;
        f13409g = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 92 / 0;
        }
        return arrayList;
    }

    public int hashCode() {
        int iHashCode = 0;
        String str = this.f13411d;
        if (str != null) {
            int i5 = f13409g + 87;
            f13410h = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 26 / 0;
                iHashCode = str.hashCode();
            } else {
                iHashCode = str.hashCode();
            }
            f13409g = (f13410h + 61) % 128;
        }
        return Arrays.hashCode(this.f13412e) + (iHashCode * 31);
    }

    public String toString() {
        f13409g = (f13410h + 105) % 128;
        String strE = e(this.f13412e);
        f13410h = (f13409g + 75) % 128;
        return strE;
    }
}
