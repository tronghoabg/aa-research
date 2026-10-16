package Va;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import io.presage.Presage;

/* loaded from: classes4.dex */
public final class A9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13188c = {'i', 'o', '.', 'p', 'r', 'e', 's', 'a', 'g', 'P', 'u', 'y', 'j', 'k', 'l', 'm'};

    /* renamed from: d, reason: collision with root package name */
    public static int f13189d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13190e = 1;

    public static String f(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13188c;
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
        f13189d = (f13190e + 65) % 128;
        String strIntern = f((byte) (65 - TextUtils.lastIndexOf("", '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 5, "\u0000\t\b\u0006»").intern();
        int i5 = f13189d + 87;
        f13190e = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1175v5 c1175v5 = new C1175v5(a());
        int i5 = f13190e + 35;
        f13189d = i5 % 128;
        if (i5 % 2 == 0) {
            return c1175v5;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        f13189d = (f13190e + 11) % 128;
        String strIntern = f((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 88), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0004\u0001\n\u0005\u0006\u0007\u0004\t\u0004").intern();
        int i5 = f13189d + 9;
        f13190e = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = (f13189d + 77) % 128;
        f13190e = i5;
        int i10 = i5 + 119;
        f13189d = i10 % 128;
        if (i10 % 2 == 0) {
            return Presage.class;
        }
        throw null;
    }
}
