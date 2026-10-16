package defpackage;

/* loaded from: classes.dex */
public final class abqs {
    public static final abnf a;

    static {
        abnp abnpVarN = abnf.a.n();
        abnpVarN.t();
        ((abnf) abnpVarN.b).b = -315576000000L;
        abnpVarN.t();
        ((abnf) abnpVarN.b).c = -999999999;
        abnp abnpVarN2 = abnf.a.n();
        abnpVarN2.t();
        ((abnf) abnpVarN2.b).b = 315576000000L;
        abnpVarN2.t();
        ((abnf) abnpVarN2.b).c = 999999999;
        abnp abnpVarN3 = abnf.a.n();
        abnpVarN3.t();
        ((abnf) abnpVarN3.b).b = 0L;
        abnpVarN3.t();
        ((abnf) abnpVarN3.b).c = 0;
        a = (abnf) abnpVarN3.q();
    }

    public static long a(abnf abnfVar) {
        g(abnfVar);
        return a.A(wox.aj(abnfVar.b), abnfVar.c / 1000000);
    }

    public static abnf b(long j) {
        return d(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    public static abnf c(long j) {
        return d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static abnf d(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = a.A(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        abnp abnpVarN = abnf.a.n();
        abnpVarN.t();
        ((abnf) abnpVarN.b).b = j;
        abnpVarN.t();
        ((abnf) abnpVarN.b).c = i;
        abnf abnfVar = (abnf) abnpVarN.q();
        g(abnfVar);
        return abnfVar;
    }

    public static String e(abnf abnfVar) {
        g(abnfVar);
        long j = abnfVar.b;
        int i = abnfVar.c;
        StringBuilder sb = new StringBuilder();
        if (j < 0 || i < 0) {
            sb.append("-");
            j = -j;
            i = -i;
        }
        sb.append(j);
        if (i != 0) {
            sb.append(".");
            sb.append(abqu.e(i));
        }
        sb.append("s");
        return sb.toString();
    }

    public static boolean f(abnf abnfVar) {
        g(abnfVar);
        long j = abnfVar.b;
        return j == 0 ? abnfVar.c < 0 : j < 0;
    }

    public static void g(abnf abnfVar) {
        long j = abnfVar.b;
        int i = abnfVar.c;
        if (a.o(j, i)) {
            return;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
