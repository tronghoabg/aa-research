package Va;

import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class O8 extends AbstractC1215y8 {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13570f = {-1714963948, 474887842, -78687186, -411686627, 1869695202, -258090639, -1683639541, 1988691961, -227722451, -676888897, 1045490908, 184116841, 1505269328, -69759961, -1713389253, -826280666, 1765738073, -1645437719};

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f13571g = {'Y'};

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13572d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1215y8 f13573e;

    public /* synthetic */ O8() {
        this.f13572d = 0;
    }

    private final String e() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = {0, 1, 56, 1};
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13571g, i5, cArr, 0, i10);
                if (i12 > 0) {
                    char[] cArr2 = new char[i10];
                    System.arraycopy(cArr, 0, cArr2, 0, i10);
                    int i13 = i10 - i12;
                    System.arraycopy(cArr2, 0, cArr, i13, i12);
                    System.arraycopy(cArr2, i12, cArr, 0, i13);
                }
                char[] cArr3 = new char[i10];
                Ab.f13222y = 0;
                while (true) {
                    int i14 = Ab.f13222y;
                    if (i14 >= i10) {
                        break;
                    }
                    cArr3[i14] = cArr[(i10 - i14) - 1];
                    Ab.f13222y = i14 + 1;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr3[i15] = (char) (cArr3[i15] - iArr[2]);
                        Ab.f13222y = i15 + 1;
                    }
                }
                str = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        sb2.append(str.intern());
        sb2.append(this.f13573e);
        return sb2.toString();
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        switch (this.f13572d) {
            case 0:
                J8 j8 = (J8) this.f13573e;
                C1139s8 c1139s8C = j8.c(c1203x8, c1214y7);
                c1203x8.d(Integer.valueOf(c1139s8C.a().intValue() + 1), j8.e());
                return c1139s8C;
            case 1:
                J8 j82 = (J8) this.f13573e;
                C1139s8 c1139s8C2 = j82.c(c1203x8, c1214y7);
                Number numberA = c1139s8C2.a();
                c1203x8.d(Integer.valueOf(numberA.intValue() - 1), j82.e());
                return c1139s8C2;
            default:
                return new C1139s8(Boolean.valueOf(!this.f13573e.c(c1203x8, c1214y7).e()));
        }
    }

    public String toString() {
        String str;
        switch (this.f13572d) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((J8) this.f13573e).toString());
                int[] iArr = {1434514374, -525193839};
                int packedPositionType = 2 - ExpandableListView.getPackedPositionType(0L);
                synchronized (AbstractC0897a.f13930n) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[4];
                        int[] iArr2 = (int[]) f13570f.clone();
                        AbstractC0897a.k = 0;
                        while (true) {
                            int i5 = AbstractC0897a.k;
                            if (i5 < 2) {
                                int i10 = iArr[i5];
                                char c10 = (char) (i10 >> 16);
                                cArr[0] = c10;
                                char c11 = (char) i10;
                                cArr[1] = c11;
                                int i11 = iArr[i5 + 1];
                                char c12 = (char) (i11 >> 16);
                                cArr[2] = c12;
                                char c13 = (char) i11;
                                cArr[3] = c13;
                                AbstractC0897a.f13928l = (c10 << 16) + c11;
                                AbstractC0897a.f13929m = (c12 << 16) + c13;
                                AbstractC0897a.o(iArr2);
                                for (int i12 = 0; i12 < 16; i12++) {
                                    int i13 = AbstractC0897a.f13928l ^ iArr2[i12];
                                    AbstractC0897a.f13928l = i13;
                                    int iG = AbstractC0897a.G(i13) ^ AbstractC0897a.f13929m;
                                    int i14 = AbstractC0897a.f13928l;
                                    AbstractC0897a.f13928l = iG;
                                    AbstractC0897a.f13929m = i14;
                                }
                                int i15 = AbstractC0897a.f13928l;
                                int i16 = AbstractC0897a.f13929m;
                                AbstractC0897a.f13928l = i16;
                                AbstractC0897a.f13929m = i15;
                                int i17 = i15 ^ iArr2[16];
                                AbstractC0897a.f13929m = i17;
                                int i18 = iArr2[17] ^ i16;
                                AbstractC0897a.f13928l = i18;
                                cArr[0] = (char) (i18 >>> 16);
                                cArr[1] = (char) i18;
                                cArr[2] = (char) (i17 >>> 16);
                                cArr[3] = (char) i17;
                                AbstractC0897a.o(iArr2);
                                int i19 = AbstractC0897a.k;
                                int i20 = i19 << 1;
                                cArr2[i20] = cArr[0];
                                cArr2[i20 + 1] = cArr[1];
                                cArr2[i20 + 2] = cArr[2];
                                cArr2[i20 + 3] = cArr[3];
                                AbstractC0897a.k = i19 + 2;
                            } else {
                                str = new String(cArr2, 0, packedPositionType);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                sb2.append(str.intern());
                return sb2.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                return e();
        }
    }

    public /* synthetic */ O8(AbstractC1215y8 abstractC1215y8, int i5) {
        this.f13572d = i5;
        this.f13573e = abstractC1215y8;
    }
}
