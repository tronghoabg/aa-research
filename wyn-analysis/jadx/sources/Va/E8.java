package Va;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class E8 extends H8 {
    public static final int[] k = {126410818, -520849612, -185212105, -635241136, 1982594852, -916686705, 884845598, 2002294681, -1897545999, -958145852, -729857307, 1572523104, 674357343, 2055767301, 471621333, -12842965, 1714514232, 1750233462};

    /* renamed from: l, reason: collision with root package name */
    public static int f13311l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f13312m = 1;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1215y8 f13313i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1215y8[] f13314j;

    public E8(AbstractC1215y8 abstractC1215y8, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(str, arrayList2);
        this.f13313i = abstractC1215y8;
        if (arrayList != null) {
            AbstractC1215y8[] abstractC1215y8Arr = new AbstractC1215y8[arrayList.size()];
            this.f13314j = abstractC1215y8Arr;
            arrayList.toArray(abstractC1215y8Arr);
        }
    }

    public static ArrayList i(AbstractC1215y8[] abstractC1215y8Arr, C1203x8 c1203x8, C1214y7 c1214y7) {
        ArrayList arrayList = new ArrayList();
        int length = abstractC1215y8Arr.length;
        int i5 = 0;
        while (i5 < length) {
            f13312m = (f13311l + 33) % 128;
            arrayList.add((Class) abstractC1215y8Arr[i5].c(c1203x8, c1214y7).c());
            i5++;
            f13311l = (f13312m + 79) % 128;
        }
        return arrayList;
    }

    public static String j(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) k.clone();
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

    @Override // Va.H8, Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        Method methodK;
        ArrayList arrayListH = h(c1203x8, c1214y7);
        AbstractC1215y8 abstractC1215y8 = this.f13313i;
        if (abstractC1215y8 instanceof J8) {
            if (((J8) abstractC1215y8).e().equals(j((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5, new int[]{-1242432761, 603408861, 1832228725, 1316359084}).intern())) {
                C1139s8 c1139s8C = ((C0999ha) c1214y7.h().f14264b).f(g()).c(c1203x8, c1214y7, arrayListH);
                c1139s8C.d(false);
                return c1139s8C;
            }
        }
        Object objC = this.f13313i.c(c1203x8, c1214y7).c();
        if (objC instanceof Q6) {
            return new C1139s8(((Q6) objC).a(c1214y7, g(), arrayListH, c1214y7.b(), c1203x8));
        }
        if (objC instanceof C1214y7) {
            synchronized (objC) {
                try {
                    C1214y7 c1214y72 = (C1214y7) objC;
                    C1126r8 c1126r8Q = c1214y72.q(g());
                    if (c1126r8Q != null) {
                        C1139s8 c1139s8C2 = c1126r8Q.c(c1214y72.e(), c1214y72, arrayListH);
                        c1139s8C2.d(false);
                        return c1139s8C2;
                    }
                    String strF = c1214y7.f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j(Process.getGidForName("") + 24, new int[]{-12182449, 1205763348, -1951390836, -858240726, 503269666, 496354820, -1444528134, -3603771, 1748413765, -1903585070, -460780335, -415940515}).intern());
                    sb2.append(g());
                    AbstractC0897a.f(strF, sb2.toString(), new NoSuchMethodException());
                } finally {
                }
            }
        }
        try {
            AbstractC1215y8[] abstractC1215y8Arr = this.f13314j;
            if (abstractC1215y8Arr != null) {
                methodK = AbstractC1168ub.b(objC, g(), i(abstractC1215y8Arr, c1203x8, c1214y7));
            } else {
                methodK = AbstractC1168ub.k(objC, g(), arrayListH);
            }
            if (methodK != null) {
                return new C1139s8(methodK.invoke(objC, arrayListH.toArray()));
            }
            arrayListH.add(0, objC);
            return new C1139s8(c1214y7.d().a(c1214y7, g(), arrayListH, c1214y7.b(), c1203x8));
        } catch (IllegalAccessException e7) {
            String strF2 = c1214y7.f();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j(24 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{-12182449, 1205763348, -1951390836, -858240726, 503269666, 496354820, -1444528134, -3603771, 1748413765, -1903585070, -460780335, -415940515}).intern());
            sb3.append(this);
            AbstractC0897a.f(strF2, sb3.toString(), e7);
            return null;
        } catch (IllegalArgumentException e10) {
            String strF3 = c1214y7.f();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j(23 - (ViewConfiguration.getTapTimeout() >> 16), new int[]{-12182449, 1205763348, -1951390836, -858240726, 503269666, 496354820, -1444528134, -3603771, 1748413765, -1903585070, -460780335, -415940515}).intern());
            sb4.append(this);
            AbstractC0897a.f(strF3, sb4.toString(), e10);
            return null;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // Va.H8
    public final String e(Object[] objArr) {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13313i);
        sb2.append(j((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), new int[]{-2114652358, -841008906}).intern());
        sb2.append(g());
        int i5 = f13312m + 39;
        int i10 = i5 % 128;
        f13311l = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        AbstractC1215y8[] abstractC1215y8Arr = this.f13314j;
        if (abstractC1215y8Arr != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j(1 - Color.blue(0), new int[]{-350173544, -1866468657}).intern());
            sb3.append(AbstractC1215y8.d(abstractC1215y8Arr));
            sb3.append(j(View.resolveSizeAndState(0, 0, 0) + 1, new int[]{259387330, 1012457131}).intern());
            string = sb3.toString();
        } else {
            f13312m = (i10 + 119) % 128;
            string = "";
        }
        sb2.append(string);
        sb2.append(j(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new int[]{1038826564, 2139431574}).intern());
        sb2.append(AbstractC1215y8.d(objArr));
        sb2.append(j((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new int[]{-1987944995, 138334629}).intern());
        String string2 = sb2.toString();
        f13312m = (f13311l + 83) % 128;
        return string2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r2 != null) goto L20;
     */
    @Override // Va.H8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L47
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<Va.E8> r3 = Va.E8.class
            if (r3 == r2) goto L10
            goto L47
        L10:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto L1f
            int r5 = Va.E8.f13312m
            int r5 = r5 + 27
            int r5 = r5 % 128
            Va.E8.f13311l = r5
            return r1
        L1f:
            Va.E8 r5 = (Va.E8) r5
            Va.y8 r2 = r5.f13313i
            Va.y8 r3 = r4.f13313i
            if (r3 == 0) goto L36
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L39
            int r5 = Va.E8.f13312m
            int r5 = r5 + 125
            int r5 = r5 % 128
            Va.E8.f13311l = r5
            goto L38
        L36:
            if (r2 == 0) goto L39
        L38:
            return r1
        L39:
            Va.y8[] r5 = r5.f13314j
            Va.y8[] r2 = r4.f13314j
            if (r2 == 0) goto L44
            boolean r5 = r2.equals(r5)
            return r5
        L44:
            if (r5 != 0) goto L47
            return r0
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E8.equals(java.lang.Object):boolean");
    }

    @Override // Va.H8
    public final int hashCode() {
        int iHashCode;
        f13312m = (f13311l + 49) % 128;
        int iHashCode2 = super.hashCode() * 31;
        int iHashCode3 = 0;
        AbstractC1215y8 abstractC1215y8 = this.f13313i;
        if (abstractC1215y8 != null) {
            iHashCode = abstractC1215y8.hashCode();
        } else {
            f13312m = (f13311l + 55) % 128;
            iHashCode = 0;
        }
        int i5 = (iHashCode2 + iHashCode) * 31;
        AbstractC1215y8[] abstractC1215y8Arr = this.f13314j;
        if (abstractC1215y8Arr != null) {
            iHashCode3 = abstractC1215y8Arr.hashCode();
            f13311l = (f13312m + 77) % 128;
        }
        return i5 + iHashCode3;
    }

    @Override // Va.H8
    public final String toString() {
        int i5 = f13312m + 85;
        f13311l = i5 % 128;
        int i10 = i5 % 2;
        AbstractC1215y8[] abstractC1215y8Arr = this.f13412e;
        if (i10 != 0) {
            int i11 = H8.f13409g + 13;
            H8.f13410h = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            e(abstractC1215y8Arr);
            throw null;
        }
        int i12 = H8.f13409g + 13;
        H8.f13410h = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        String strE = e(abstractC1215y8Arr);
        f13312m = (f13311l + 37) % 128;
        return strE;
    }
}
