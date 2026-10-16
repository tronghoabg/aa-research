package j1;

import java.util.Locale;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3076d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f38575a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f38576b = new char[24];

    public static void a(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(long j8, String str) {
        if (j8 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        }
        if (j8 <= Long.MAX_VALUE) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
    }

    public static void c(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void e(long j8, StringBuilder sb2) {
        synchronized (f38575a) {
            sb2.append(f38576b, 0, f(j8));
        }
    }

    public static int f(long j8) {
        char c10;
        int i5;
        int i10;
        int i11;
        if (f38576b.length < 0) {
            f38576b = new char[0];
        }
        char[] cArr = f38576b;
        if (j8 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j8 > 0) {
            c10 = '+';
        } else {
            j8 = -j8;
            c10 = '-';
        }
        int i12 = (int) (j8 % 1000);
        int iFloor = (int) Math.floor(j8 / 1000);
        if (iFloor > 86400) {
            i5 = iFloor / 86400;
            iFloor -= 86400 * i5;
        } else {
            i5 = 0;
        }
        if (iFloor > 3600) {
            i10 = iFloor / 3600;
            iFloor -= i10 * 3600;
        } else {
            i10 = 0;
        }
        if (iFloor > 60) {
            int i13 = iFloor / 60;
            iFloor -= i13 * 60;
            i11 = i13;
        } else {
            i11 = 0;
        }
        cArr[0] = c10;
        int iG = g(cArr, i5, 'd', 1, false, 0);
        int iG2 = g(cArr, i10, 'h', iG, iG != 1, 0);
        int iG3 = g(cArr, i11, 'm', iG2, iG2 != 1, 0);
        int iG4 = g(cArr, i12, 'm', g(cArr, iFloor, 's', iG3, iG3 != 1, 0), true, 0);
        cArr[iG4] = 's';
        return iG4 + 1;
    }

    public static int g(char[] cArr, int i5, char c10, int i10, boolean z2, int i11) {
        int i12;
        if (!z2 && i5 <= 0) {
            return i10;
        }
        if ((!z2 || i11 < 3) && i5 <= 99) {
            i12 = i10;
        } else {
            int i13 = i5 / 100;
            cArr[i10] = (char) (i13 + 48);
            i12 = i10 + 1;
            i5 -= i13 * 100;
        }
        if ((z2 && i11 >= 2) || i5 > 9 || i10 != i12) {
            int i14 = i5 / 10;
            cArr[i12] = (char) (i14 + 48);
            i12++;
            i5 -= i14 * 10;
        }
        cArr[i12] = (char) (i5 + 48);
        cArr[i12 + 1] = c10;
        return i12 + 2;
    }
}
