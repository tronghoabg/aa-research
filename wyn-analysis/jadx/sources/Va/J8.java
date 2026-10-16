package Va;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;

/* loaded from: classes4.dex */
public final class J8 extends AbstractC1215y8 {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f13450e = {'E', 'r', 'o', ' ', 'e', 'v', 'a', 'l', 'u', 't', 'i', 'n', 'g', 'x', 'p', 's', '\'', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

    /* renamed from: f, reason: collision with root package name */
    public static int f13451f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13452g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final String f13453d;

    public J8(String str) {
        this.f13453d = AbstractC1152t8.a(str);
    }

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13450e;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        try {
            return new C1139s8(c1203x8.h(e()));
        } catch (Exception unused) {
            C1126r8 c1126r8Q = c1214y7.q(e());
            if (c1126r8Q != null) {
                C1139s8 c1139s8 = new C1139s8(c1126r8Q);
                int i5 = f13451f + 21;
                f13452g = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 98 / 0;
                }
                return c1139s8;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f((byte) (80 - TextUtils.indexOf("", "", 0)), 29 - (ViewConfiguration.getTouchSlop() >> 8), "\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0007\b\t\u0007\u0005\u000e\f\r\u0004\u0000\u000e\n\u0002\u0000ÃÃ\f\u0000\r\u0001w").intern());
            sb2.append(this);
            sb2.append(f((byte) (Color.alpha(0) + 11), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), CommonGetHeaderBiddingToken.HB_TOKEN_VERSION).intern());
            new C1023j8(c1214y7, c1203x8, sb2.toString(), null).d(c1214y7.f());
            return new C1139s8(null);
        }
    }

    public final String e() {
        int i5 = (f13452g + 111) % 128;
        f13451f = i5;
        int i10 = i5 + 123;
        f13452g = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f13453d;
        if (i11 == 0) {
            int i12 = 51 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i5 = f13451f;
        int i10 = i5 + 83;
        f13452g = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i11 = i5 + 31;
            f13452g = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj != null && J8.class == obj.getClass()) {
            return this.f13453d.equals(((J8) obj).f13453d);
        }
        f13451f = (f13452g + 69) % 128;
        return false;
    }

    public final int hashCode() {
        int i5 = f13452g;
        int i10 = (i5 + 115) % 128;
        f13451f = i10;
        String str = this.f13453d;
        if (str != null) {
            f13452g = (i10 + 69) % 128;
            return str.hashCode();
        }
        int i11 = i5 + 39;
        f13451f = i11 % 128;
        if (i11 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final String toString() {
        String strE;
        int i5 = f13452g + 109;
        f13451f = i5 % 128;
        if (i5 % 2 != 0) {
            strE = e();
            int i10 = 15 / 0;
        } else {
            strE = e();
        }
        int i11 = f13451f + 69;
        f13452g = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 35 / 0;
        }
        return strE;
    }
}
