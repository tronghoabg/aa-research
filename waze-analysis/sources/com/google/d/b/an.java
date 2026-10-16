package com.google.d.b;

import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an {
    public static void A(int i2, int i3) {
        String strD;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strD = d("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException("negative size: " + i3);
                }
                strD = d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void B(Object obj) {
        obj.getClass();
    }

    public static void C(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void D(Object obj, String str, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(d(str, obj2));
        }
    }

    public static void E(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(Q(i2, i3, "index"));
        }
    }

    static boolean F(String str) {
        return str == null || str.isEmpty();
    }

    public static z G(Class cls) {
        return new z(cls.getSimpleName());
    }

    public static z H(Object obj) {
        return new z(obj.getClass().getSimpleName());
    }

    public static Object I(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static t J() {
        return new u();
    }

    public static String K(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (O(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (O(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String L(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (N(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (N(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean M(CharSequence charSequence, CharSequence charSequence2) {
        int iR;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence2.charAt(i2);
            if (cCharAt != cCharAt2 && ((iR = R(cCharAt)) >= 26 || iR != R(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean N(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean O(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private static String P(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e2);
            return "<" + str + " threw " + e2.getClass().getName() + ">";
        }
    }

    private static String Q(int i2, int i3, String str) {
        if (i2 < 0) {
            return d("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    private static int R(char c2) {
        return (char) ((c2 | ' ') - 97);
    }

    public static aj a(aj ajVar) {
        return ((ajVar instanceof al) || (ajVar instanceof ak)) ? ajVar : ajVar instanceof Serializable ? new ak(ajVar) : new al(ajVar);
    }

    public static aj b(Object obj) {
        return new am(obj);
    }

    public static String c(String str) {
        if (F(str)) {
            return null;
        }
        return str;
    }

    public static String d(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(P(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(P(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String e(String str) {
        return str == null ? "" : str;
    }

    public static boolean f(String str) {
        return F(str);
    }

    public static int g(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String h(String str) {
        if (str.length() > 23) {
            int i2 = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i2 = length;
                    break;
                }
            }
            str = str.substring(i2 + 1);
        }
        String strConcat = "".concat(String.valueOf(str));
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static /* synthetic */ boolean i(int i2, com.google.d.f.r rVar, StringBuilder sb) {
        if (i2 - 1 != 0 || rVar == com.google.d.f.r.f7872a) {
            return false;
        }
        sb.append(rVar.b());
        sb.append('.');
        sb.append(rVar.d());
        sb.append(':');
        sb.append(rVar.a());
        return true;
    }

    public static ab j() {
        return ad.f7196a;
    }

    public static ab k(ab abVar, ab abVar2) {
        B(abVar);
        return new ac(Arrays.asList(abVar, abVar2));
    }

    public static void l(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void n(boolean z, String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(d(str, Character.valueOf(c2)));
        }
    }

    public static void o(boolean z, String str, int i2) {
        if (!z) {
            throw new IllegalArgumentException(d(str, Integer.valueOf(i2)));
        }
    }

    public static void p(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(d(str, Long.valueOf(j2)));
        }
    }

    public static void q(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(d(str, obj));
        }
    }

    public static void r(boolean z, String str, int i2, int i3) {
        if (!z) {
            throw new IllegalArgumentException(d(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void s(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(d(str, obj, obj2));
        }
    }

    public static void t(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? Q(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? Q(i3, i4, "end index") : d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void u(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void v(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void w(boolean z, String str, int i2) {
        if (!z) {
            throw new IllegalStateException(d(str, Integer.valueOf(i2)));
        }
    }

    public static void x(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalStateException(d(str, Long.valueOf(j2)));
        }
    }

    public static void y(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(d(str, obj));
        }
    }

    public static void z(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(d(str, obj, obj2));
        }
    }
}
