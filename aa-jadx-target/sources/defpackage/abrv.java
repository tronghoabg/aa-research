package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abrv {
    public static final defpackage.aboh a;

    static {
        defpackage.abor aborVarN = defpackage.aboh.a.n();
        aborVarN.t();
        ((defpackage.aboh) aborVarN.b).b = -315576000000L;
        aborVarN.t();
        ((defpackage.aboh) aborVarN.b).c = -999999999;
        defpackage.abor aborVarN2 = defpackage.aboh.a.n();
        aborVarN2.t();
        ((defpackage.aboh) aborVarN2.b).b = 315576000000L;
        aborVarN2.t();
        ((defpackage.aboh) aborVarN2.b).c = 999999999;
        defpackage.abor aborVarN3 = defpackage.aboh.a.n();
        aborVarN3.t();
        ((defpackage.aboh) aborVarN3.b).b = 0L;
        aborVarN3.t();
        ((defpackage.aboh) aborVarN3.b).c = 0;
        a = (defpackage.aboh) aborVarN3.q();
    }

    public static long a(defpackage.aboh abohVar) {
        g(abohVar);
        return defpackage.a.z(defpackage.acmh.A(abohVar.b), abohVar.c / 1000000);
    }

    public static defpackage.aboh b(long j) {
        return d(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    public static defpackage.aboh c(long j) {
        return d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static defpackage.aboh d(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = defpackage.a.z(j, i / 1000000000);
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
        defpackage.abor aborVarN = defpackage.aboh.a.n();
        aborVarN.t();
        ((defpackage.aboh) aborVarN.b).b = j;
        aborVarN.t();
        ((defpackage.aboh) aborVarN.b).c = i;
        defpackage.aboh abohVar = (defpackage.aboh) aborVarN.q();
        g(abohVar);
        return abohVar;
    }

    public static java.lang.String e(defpackage.aboh abohVar) {
        g(abohVar);
        long j = abohVar.b;
        int i = abohVar.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j < 0 || i < 0) {
            sb.append("-");
            j = -j;
            i = -i;
        }
        sb.append(j);
        if (i != 0) {
            sb.append(".");
            sb.append(defpackage.abrx.e(i));
        }
        sb.append("s");
        return sb.toString();
    }

    public static boolean f(defpackage.aboh abohVar) {
        g(abohVar);
        long j = abohVar.b;
        if (j == 0) {
            return abohVar.c < 0;
        }
        return j < 0;
    }

    public static void g(defpackage.aboh abohVar) {
        long j = abohVar.b;
        int i = abohVar.c;
        if (defpackage.a.n(j, i)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
