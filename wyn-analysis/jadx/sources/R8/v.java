package R8;

import Va.C0991h2;
import Va.C0995h6;
import Va.C1098p5;
import Va.C1112q6;
import Va.C1186w3;
import Va.C1223z4;
import Va.E1;
import Va.W0;
import Va.Z3;
import java.nio.ByteBuffer;
import u6.AbstractC4256a;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class v {
    public static int a(int i5, int i10, int i11, int i12) {
        return i5 | i10 | i11 | 128 | i12;
    }

    public static /* synthetic */ int b(int i5) {
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                i10 = 3;
                if (i5 != 3) {
                    if (i5 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static boolean c(int i5, boolean z2) {
        int i10 = i5 & 7;
        if (i10 != 4) {
            return z2 && i10 == 3;
        }
        return true;
    }

    public static String d(int i5, int i10, char c10, int i11) {
        return W0.C0(i11, i5 + i10, c10).intern();
    }

    public static String e(int i5, int i10, String str, String str2) {
        return str + i5 + str2 + i10;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder h(String str, int i5, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i5);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static void i(int i5, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(i5);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static void j(String str, String str2, String str3) {
        AbstractC4256a.E(str3, str + str2);
    }

    public static void k(String str, String str2, char[] cArr, int i5, int i10) {
        ByteBuffer.wrap(str.getBytes(str2)).asCharBuffer().get(cArr, i5, i10);
    }

    public static boolean l(int i5, int i10, char c10, int i11, String str) {
        return str.equals(W0.C0(i11, i5 - i10, c10).intern());
    }

    public static boolean m(String str, int[] iArr, boolean z2, String str2) {
        return str2.equals(C1112q6.F0(str, iArr, z2).intern());
    }

    public static boolean n(int i5, int i10, char c10, int i11, String str) {
        return str.equals(E1.K0(i11, i5 + i10, c10).intern());
    }

    public static boolean o(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C1098p5.S0(i11, i5 - i10, c10).intern());
    }

    public static boolean p(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C0995h6.h1(i11, i5 + i10, c10).intern());
    }

    public static boolean q(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C0995h6.h1(i11, i5 - i10, c10).intern());
    }

    public static boolean r(int i5, int i10, char c10, int i11, String str) {
        return str.equals(E1.K0(i11, i5 - i10, c10).intern());
    }

    public static boolean s(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C0991h2.D0(i11, i5 + i10, c10).intern());
    }

    public static boolean t(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C0991h2.D0(i11, i5 - i10, c10).intern());
    }

    public static boolean u(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C1186w3.K0(i11, i5 - i10, c10).intern());
    }

    public static boolean v(int i5, int i10, char c10, int i11, String str) {
        return str.equals(Z3.N0(i11, i5 + i10, c10).intern());
    }

    public static boolean w(int i5, int i10, char c10, int i11, String str) {
        return str.equals(Z3.N0(i11, i5 - i10, c10).intern());
    }

    public static boolean x(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C1223z4.b1(i11, i5 + i10, c10).intern());
    }

    public static boolean y(int i5, int i10, char c10, int i11, String str) {
        return str.equals(C1098p5.S0(i11, i5 + i10, c10).intern());
    }
}
