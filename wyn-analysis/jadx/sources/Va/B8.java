package Va;

import android.graphics.Color;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class B8 extends AbstractC1215y8 {

    /* renamed from: e, reason: collision with root package name */
    public static int f13237e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13238f = 1;

    /* renamed from: d, reason: collision with root package name */
    public final String f13239d;

    public B8(String str) {
        this.f13239d = AbstractC1152t8.a(str);
    }

    @Override // Va.AbstractC1215y8
    public final C1139s8 b(C1203x8 c1203x8, C1214y7 c1214y7) {
        String str;
        Z0 z0C = c1214y7.c();
        String str2 = this.f13239d;
        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 6;
        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 152;
        int iRed = Color.red(0) + 5;
        char[] charArray = "\u0013\u0001\f\u0003ￎ\u0013".toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[longPressTimeout];
                Ab.f13219v = 0;
                while (true) {
                    int i5 = Ab.f13219v;
                    if (i5 >= longPressTimeout) {
                        break;
                    }
                    char c10 = (char) (charArray[i5] + windowTouchSlop);
                    cArr[i5] = c10;
                    cArr[i5] = (char) (c10 - '8');
                    Ab.f13219v = i5 + 1;
                }
                if (iRed > 0) {
                    Ab.f13220w = iRed;
                    char[] cArr2 = new char[longPressTimeout];
                    System.arraycopy(cArr, 0, cArr2, 0, longPressTimeout);
                    int i10 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, longPressTimeout - i10, i10);
                    int i11 = Ab.f13220w;
                    System.arraycopy(cArr2, i11, cArr, 0, longPressTimeout - i11);
                }
                char[] cArr3 = new char[longPressTimeout];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= longPressTimeout) {
                        break;
                    }
                    cArr3[i12] = cArr[(longPressTimeout - i12) - 1];
                    Ab.f13219v = i12 + 1;
                }
                str = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strJ0 = AbstractC1104pb.j0(str2, str.intern());
        z0C.getClass();
        Z0.f13886P = (Z0.f13887Q + 99) % 128;
        Class clsY0 = z0C.y0(strJ0, true);
        int i13 = Z0.f13886P + 11;
        Z0.f13887Q = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        C1139s8 c1139s8 = new C1139s8(clsY0);
        f13237e = (f13238f + 3) % 128;
        return c1139s8;
    }

    public final boolean equals(Object obj) {
        int i5 = f13237e;
        int i10 = i5 + 79;
        f13238f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            f13238f = (i5 + 5) % 128;
            return true;
        }
        if (obj == null || B8.class != obj.getClass()) {
            int i11 = f13237e + 121;
            f13238f = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 32 / 0;
            }
            return false;
        }
        String str = ((B8) obj).f13239d;
        String str2 = this.f13239d;
        if (str2 != null) {
            return str2.equals(str);
        }
        if (str != null) {
            return false;
        }
        int i13 = (f13237e + 7) % 128;
        f13238f = i13;
        int i14 = i13 + 31;
        f13237e = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 40 / 0;
        }
        return true;
    }

    public final int hashCode() {
        f13237e = (f13238f + 97) % 128;
        String str = this.f13239d;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        int i5 = f13237e + 109;
        f13238f = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i5 = f13237e;
        int i10 = i5 + 33;
        f13238f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i11 = i5 + 87;
        f13238f = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f13239d;
        if (i12 == 0) {
            int i13 = 94 / 0;
        }
        return str;
    }
}
