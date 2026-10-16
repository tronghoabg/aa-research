package Va;

import android.view.View;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class X8 extends AbstractC0933c9 {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13845e = {-598734277, -252066075, -83151014, 1388977281, 1834245808, 489114282, 1416558927, 826642654, -341318833, 288524756, 2108818476, -338004689, -227303124, -707481186, -1659170128, 883089213, -552432623, 39096654};

    /* renamed from: f, reason: collision with root package name */
    public static int f13846f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13847g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13848d;

    public /* synthetic */ X8(int i5) {
        this.f13848d = i5;
    }

    public static String e(int i5) {
        String str;
        char[] charArray = "龰႞仫蘶ᳺ廜".toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 35462)) ^ ((c11 >>> 5) + 57485)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 18148) ^ ((c12 + i11) ^ ((c12 << 4) + 48768))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // Va.AbstractC0933c9
    public final C1139s8 c(C1203x8 c1203x8, C1214y7 c1214y7) {
        switch (this.f13848d) {
            case 0:
                C1139s8 c1139s8 = new C1139s8(null);
                int i5 = C1139s8.f14573g;
                c1139s8.f14577d = true;
                C1139s8.f14572f = (i5 + 9) % 128;
                return c1139s8;
            default:
                C1139s8 c1139s82 = new C1139s8(null);
                int i10 = C1139s8.f14572f;
                int i11 = i10 + 71;
                C1139s8.f14573g = i11 % 128;
                int i12 = i11 % 2;
                c1139s82.f14576c = true;
                int i13 = i10 + 99;
                C1139s8.f14573g = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                int i14 = f13847g + 49;
                f13846f = i14 % 128;
                if (i14 % 2 == 0) {
                    return c1139s82;
                }
                throw null;
        }
    }

    public final String toString() {
        String str;
        switch (this.f13848d) {
            case 0:
                int[] iArr = {1120664443, 1538025312, -367954936, -1006971305, -1928813356, 589560066};
                int mode = 9 - View.MeasureSpec.getMode(0);
                synchronized (AbstractC0897a.f13930n) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[12];
                        int[] iArr2 = (int[]) f13845e.clone();
                        AbstractC0897a.k = 0;
                        while (true) {
                            int i5 = AbstractC0897a.k;
                            if (i5 < 6) {
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
                                int i18 = i16 ^ iArr2[17];
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
                                str = new String(cArr2, 0, mode);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str.intern();
            default:
                int i21 = f13846f + 93;
                f13847g = i21 % 128;
                String strIntern = e(i21 % 2 == 0 ? 115 - (ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)) : (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7).intern();
                f13847g = (f13846f + 77) % 128;
                return strIntern;
        }
    }
}
