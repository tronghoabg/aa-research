package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class abpv {
    private static volatile int a = 100;

    public static abpw b(Object obj) {
        return ((abnv) obj).al;
    }

    public static abpw c(abpw abpwVar, abpw abpwVar2) {
        abpw abpwVar3 = abpw.a;
        if (abpwVar3.equals(abpwVar2)) {
            return abpwVar;
        }
        if (abpwVar3.equals(abpwVar)) {
            int i = abpwVar.b + abpwVar2.b;
            int[] iArrCopyOf = Arrays.copyOf(abpwVar.c, i);
            System.arraycopy(abpwVar2.c, 0, iArrCopyOf, abpwVar.b, abpwVar2.b);
            Object[] objArrCopyOf = Arrays.copyOf(abpwVar.d, i);
            System.arraycopy(abpwVar2.d, 0, objArrCopyOf, abpwVar.b, abpwVar2.b);
            return new abpw(i, iArrCopyOf, objArrCopyOf, true);
        }
        if (abpwVar2.equals(abpwVar3)) {
            return abpwVar;
        }
        abpwVar.b();
        int i2 = abpwVar.b + abpwVar2.b;
        abpwVar.c(i2);
        System.arraycopy(abpwVar2.c, 0, abpwVar.c, abpwVar.b, abpwVar2.b);
        System.arraycopy(abpwVar2.d, 0, abpwVar.d, abpwVar.b, abpwVar2.b);
        abpwVar.b = i2;
        return abpwVar;
    }

    public static void d(Object obj, abpw abpwVar) {
        ((abnv) obj).al = abpwVar;
    }

    public static final abpw e(Object obj) {
        abnv abnvVar = (abnv) obj;
        abpw abpwVar = abnvVar.al;
        if (abpwVar != abpw.a) {
            return abpwVar;
        }
        abpw abpwVar2 = new abpw();
        abnvVar.al = abpwVar2;
        return abpwVar2;
    }

    final boolean a(Object obj, abmx abmxVar, int i) throws IOException {
        int i2 = abmxVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ((abpw) obj).e(i3 << 3, Long.valueOf(abmxVar.k()));
            return true;
        }
        if (i4 == 1) {
            abpw abpwVar = (abpw) obj;
            abpwVar.e((i3 << 3) | 1, Long.valueOf(abmxVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((abpw) obj).e((i3 << 3) | 2, abmxVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new abon("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new abom();
            }
            ((abpw) obj).e(5 | (i3 << 3), Integer.valueOf(abmxVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        abpw abpwVar2 = new abpw();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new abon("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (abmxVar.c() != Integer.MAX_VALUE && a(abpwVar2, abmxVar, i6)) {
        }
        if ((i5 | 4) != abmxVar.b) {
            throw new abon("Protocol message end-group tag did not match expected tag.");
        }
        abpwVar2.d();
        ((abpw) obj).e(i5 | 3, abpwVar2);
        return true;
    }
}
