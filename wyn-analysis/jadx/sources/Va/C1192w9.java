package Va;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.my.target.common.MyTargetManager;

/* renamed from: Va.w9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1192w9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14736c = {'c', 'o', 'm', '.', 'y', 't', 'a', 'r', 'g', 'e', 'n', 'M', 'T', 'd', 'f', 'h'};

    /* renamed from: d, reason: collision with root package name */
    public static int f14737d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14738e = 1;

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14736c;
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
                            int i12 = c10 / 4;
                            int i13 = c10 % 4;
                            int i14 = c11 / 4;
                            int i15 = c11 % 4;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 3) % 4) * 4) + i13];
                                cArr2[i11] = cArr[(((i14 + 3) % 4) * 4) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 4) + ((i13 + 3) % 4)];
                                cArr2[i11] = cArr[(i14 * 4) + ((i15 + 3) % 4)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 4) + i15];
                                cArr2[i11] = cArr[(i14 * 4) + i13];
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

    @Override // Va.AbstractC1127r9
    public final String a() {
        int maximumDrawingCacheSize;
        int iArgb;
        int i5 = f14738e + 99;
        f14737d = i5 % 128;
        if (i5 % 2 != 0) {
            maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() % 124) + 37;
            iArgb = Color.argb(1, 1, 0, 1) + 73;
        } else {
            maximumDrawingCacheSize = 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            iArgb = 41 - Color.argb(0, 0, 0, 0);
        }
        String strIntern = f((byte) iArgb, maximumDrawingCacheSize, "\u0000\u0006\u0006\u0007\u0004\u000b\r\t").intern();
        f14737d = (f14738e + 59) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C4 c42 = new C4(a());
        f14737d = (f14738e + 121) % 128;
        return c42;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f14738e = (f14737d + 125) % 128;
        String strIntern = f((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 39), (ViewConfiguration.getTapTimeout() >> 16) + 36, "\u0001\u0002\u0003\u0000\u0000\u0006\u0001\u0007\u0007\u0004\t\n\u0007\u0001\u0001\u0002\u0094\u0094\u0002\t\u0007\u000f\b\u0000\u0007\u0004\t\n\u0007\t\n\u000e\u0004\n\u000b\u0005").intern();
        int i5 = f14738e + 89;
        f14737d = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14737d + 1;
        f14738e = i5 % 128;
        if (i5 % 2 != 0) {
            return MyTargetManager.class;
        }
        int i10 = 25 / 0;
        return MyTargetManager.class;
    }
}
