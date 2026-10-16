package Va;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import x6.AbstractC4480k;
import x6.C4470a;

/* loaded from: classes4.dex */
public final class U0 extends AbstractC4480k implements H9 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13743d = {1047559934, -908369121, 1423045834, 1934418436, 786064227, 886821696, 55116879, 147035738, -1952798978, -481153702, -2062224345, 1718750552, -257912737, 278805400, -393627360, 1485540128, -605443614, -1574151746};

    /* renamed from: e, reason: collision with root package name */
    public static int f13744e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13745f = 1;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC4480k f13746a;

    /* renamed from: b, reason: collision with root package name */
    public Ra f13747b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ W0 f13748c;

    public static String a(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f13743d.clone();
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

    @Override // Va.H9
    public final Object d() {
        AbstractC4480k abstractC4480k;
        int i5 = f13745f;
        int i10 = i5 + 95;
        f13744e = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = i5 + 39;
            f13744e = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            abstractC4480k = this.f13746a;
            int i12 = 18 / 0;
        } else {
            int i13 = i5 + 39;
            f13744e = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            abstractC4480k = this.f13746a;
        }
        int i14 = i5 + 57;
        f13744e = i14 % 128;
        if (i14 % 2 == 0) {
            return abstractC4480k;
        }
        throw null;
    }

    @Override // x6.AbstractC4480k
    public final void onAdClicked() {
        int iRgb = (-16777179) - Color.rgb(0, 0, 0);
        this.f13748c.B0(this, this.f13747b, a(iRgb, new int[]{796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, -1116278239, 879833249, -2047342417, -1114411046, -830900968, 960401667}).intern(), new Object[0]);
        AbstractC4480k abstractC4480k = this.f13746a;
        if (abstractC4480k != null) {
            f13745f = (f13744e + 101) % 128;
            abstractC4480k.onAdClicked();
        }
        int i5 = f13744e + 109;
        f13745f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 35 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    @Override // x6.AbstractC4480k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAdDismissedFullScreenContent() {
        /*
            r6 = this;
            int r0 = Va.U0.f13745f
            int r0 = r0 + 107
            int r1 = r0 % 128
            Va.U0.f13744e = r1
            int r0 = r0 % 2
            Va.Ra r1 = r6.f13747b
            Va.W0 r2 = r6.f13748c
            x6.k r3 = r6.f13746a
            if (r0 == 0) goto L34
            r0 = 28
            int[] r0 = new int[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, -1930955085, -1424961112, 1106222641, -460717266, 529834244, 303670142, -1381364408, -1597155542, -711146970, 2125191854, 1761929477, -1302158479, -212354544, 1909836564} // fill-array
            int r4 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r4 = r4 / 125
            r5 = 91
            int r4 = r5 >> r4
            java.lang.String r0 = a(r4, r0)
            java.lang.String r0 = r0.intern()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.B0(r6, r1, r0, r4)
            if (r3 == 0) goto L56
            goto L53
        L34:
            r0 = 28
            int[] r0 = new int[r0]
            r0 = {x009c: FILL_ARRAY_DATA , data: [796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, -1930955085, -1424961112, 1106222641, -460717266, 529834244, 303670142, -1381364408, -1597155542, -711146970, 2125191854, 1761929477, -1302158479, -212354544, 1909836564} // fill-array
            int r4 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r4 = r4 >> 16
            int r4 = 56 - r4
            java.lang.String r0 = a(r4, r0)
            java.lang.String r0 = r0.intern()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2.B0(r6, r1, r0, r4)
            if (r3 == 0) goto L56
        L53:
            r3.onAdDismissedFullScreenContent()
        L56:
            int r0 = Va.U0.f13745f
            int r0 = r0 + 51
            int r0 = r0 % 128
            Va.U0.f13744e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.U0.onAdDismissedFullScreenContent():void");
    }

    @Override // x6.AbstractC4480k
    public final void onAdFailedToShowFullScreenContent(C4470a c4470a) {
        int i5 = f13744e + 17;
        f13745f = i5 % 128;
        int i10 = i5 % 2;
        Ra ra2 = this.f13747b;
        W0 w02 = this.f13748c;
        AbstractC4480k abstractC4480k = this.f13746a;
        if (i10 == 0) {
            w02.B0(this, ra2, a(56 >>> (ViewConfiguration.getKeyRepeatDelay() - 19), new int[]{796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, 1978602834, 610655352, 789015976, 2141717824, -1292679295, 431601387, 1687736605, -142857183, 1236590618, -156847996, -1763497137, 287992866, -2074115099, -1377518703, 1024140123, 1203870709}).intern(), c4470a);
            if (abstractC4480k == null) {
                return;
            }
        } else {
            w02.B0(this, ra2, a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 59, new int[]{796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, 1978602834, 610655352, 789015976, 2141717824, -1292679295, 431601387, 1687736605, -142857183, 1236590618, -156847996, -1763497137, 287992866, -2074115099, -1377518703, 1024140123, 1203870709}).intern(), c4470a);
            if (abstractC4480k == null) {
                return;
            }
        }
        int i11 = f13745f + 125;
        f13744e = i11 % 128;
        int i12 = i11 % 2;
        abstractC4480k.onAdFailedToShowFullScreenContent(c4470a);
        if (i12 != 0) {
            int i13 = 58 / 0;
        }
    }

    @Override // x6.AbstractC4480k
    public final void onAdImpression() {
        f13744e = (f13745f + 45) % 128;
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 40;
        this.f13748c.B0(this, this.f13747b, a(packedPositionGroup, new int[]{796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, 2032513255, -187473582, 1675164808, -1116877889, -1743430289, -643740891}).intern(), new Object[0]);
        AbstractC4480k abstractC4480k = this.f13746a;
        if (abstractC4480k != null) {
            abstractC4480k.onAdImpression();
            f13745f = (f13744e + 47) % 128;
        }
    }

    @Override // x6.AbstractC4480k
    public final void onAdShowedFullScreenContent() {
        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 53;
        this.f13748c.B0(this, this.f13747b, a(fadingEdgeLength, new int[]{796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 1803998344, 1738376947, -194702474, -384445917, 606507721, 828685845, 1434960262, 1654013802, -1560454801, -599216199, 796474610, -807781738, 14747919, -1557655904, 2054187987, 718318384, -1084970926, -1922679638, 2082442080, -1401964014}).intern(), new Object[0]);
        AbstractC4480k abstractC4480k = this.f13746a;
        if (abstractC4480k != null) {
            f13744e = (f13745f + 113) % 128;
            abstractC4480k.onAdShowedFullScreenContent();
        }
        f13744e = (f13745f + 43) % 128;
    }
}
