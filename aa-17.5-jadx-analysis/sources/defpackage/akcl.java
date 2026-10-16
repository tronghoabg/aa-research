package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class akcl implements Serializable {
    public static final akcl a = new akfv("UTC", "UTC", 0, 0);
    public static Set b = null;
    public static akfu d = null;
    private static akfw e = null;
    private static volatile akcl f = null;
    private static akep g = null;
    private static Map h = null;
    private static Map i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final String c;

    static {
        akfw akfzVar;
        String property;
        akfu akfuVar = null;
        try {
            property = System.getProperty("org.joda.time.DateTimeZone.Provider");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            try {
                akfzVar = (akfw) Class.forName(property).newInstance();
            } catch (Exception e2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getThreadGroup().uncaughtException(threadCurrentThread, e2);
            }
        } else {
            akfzVar = null;
        }
        if (akfzVar == null) {
            try {
                akfzVar = new akfz();
            } catch (Exception e3) {
                Thread threadCurrentThread2 = Thread.currentThread();
                threadCurrentThread2.getThreadGroup().uncaughtException(threadCurrentThread2, e3);
            }
        }
        if (akfzVar == null) {
            akfzVar = new akfx();
        }
        Set setA = akfzVar.a();
        if (setA == null || setA.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!setA.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!a.equals(akfzVar.b("UTC"))) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
        e = akfzVar;
        b = setA;
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property2 != null) {
                try {
                    akfuVar = (akfu) Class.forName(property2).newInstance();
                } catch (Exception e4) {
                    Thread threadCurrentThread3 = Thread.currentThread();
                    threadCurrentThread3.getThreadGroup().uncaughtException(threadCurrentThread3, e4);
                }
            }
        } catch (SecurityException unused2) {
        }
        if (akfuVar == null) {
            akfuVar = new akfu();
        }
        d = akfuVar;
    }

    protected akcl(String str) {
        this.c = str;
    }

    public static String h(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        akfj.c(stringBuffer, i3, 2);
        stringBuffer.append(':');
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        akfj.c(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 != 0) {
            int i7 = i6 / 1000;
            stringBuffer.append(':');
            akfj.c(stringBuffer, i7, 2);
            int i8 = i6 - (i7 * 1000);
            if (i8 != 0) {
                stringBuffer.append('.');
                akfj.c(stringBuffer, i8, 3);
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static akcl i(String str) {
        if (str == null) {
            return j();
        }
        if (!str.equals("UTC")) {
            akcl akclVarB = e.b(str);
            if (akclVarB != null) {
                return akclVarB;
            }
            if (!str.startsWith("+") && !str.startsWith("-")) {
                throw new IllegalArgumentException(a.bq(str, "The datetime zone id '", "' is not recognised"));
            }
            int iN = n(str);
            if (iN != 0) {
                return p(h(iN), iN);
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0007, B:9:0x000c, B:11:0x0014, B:15:0x001c, B:17:0x0022, B:18:0x0027, B:20:0x0033, B:21:0x0036, B:23:0x003c, B:25:0x0044, B:29:0x004f, B:31:0x005b, B:33:0x0063, B:35:0x0073, B:36:0x0076, B:37:0x007f, B:38:0x008c, B:41:0x0090, B:42:0x0092, B:43:0x0094), top: B:52:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.akcl j() {
        /*
            akcl r0 = defpackage.akcl.f
            if (r0 != 0) goto L99
            java.lang.Class<akcl> r1 = defpackage.akcl.class
            monitor-enter(r1)
            akcl r0 = defpackage.akcl.f     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L94
            r0 = 0
            java.lang.String r2 = "user.timezone"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.RuntimeException -> L19 java.lang.IllegalArgumentException -> L8e java.lang.Throwable -> L96
            if (r2 == 0) goto L19
            akcl r2 = i(r2)     // Catch: java.lang.RuntimeException -> L19 java.lang.IllegalArgumentException -> L8e java.lang.Throwable -> L96
            goto L1a
        L19:
            r2 = r0
        L1a:
            if (r2 != 0) goto L8d
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r3 != 0) goto L27
            akcl r0 = j()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L27:
            java.lang.String r4 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            java.lang.String r5 = "UTC"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r5 == 0) goto L36
            akcl r0 = defpackage.akcl.a     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L36:
            java.lang.String r5 = o(r4)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r5 == 0) goto L42
            akfw r0 = defpackage.akcl.e     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            akcl r0 = r0.b(r5)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
        L42:
            if (r0 != 0) goto L4a
            akfw r0 = defpackage.akcl.e     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            akcl r0 = r0.b(r4)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
        L4a:
            if (r0 == 0) goto L4d
            goto L8e
        L4d:
            if (r5 != 0) goto L7f
            java.lang.String r0 = r3.getID()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            java.lang.String r3 = "GMT+"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r3 != 0) goto L63
            java.lang.String r3 = "GMT-"
            boolean r3 = r0.startsWith(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            if (r3 == 0) goto L7f
        L63:
            r3 = 3
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            int r0 = n(r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            long r3 = (long) r0     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L76
            akcl r0 = defpackage.akcl.a     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L76:
            java.lang.String r3 = h(r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            akcl r0 = p(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            goto L8e
        L7f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            java.lang.String r3 = "The datetime zone id '"
            java.lang.String r5 = "' is not recognised"
            java.lang.String r3 = defpackage.a.bq(r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.Throwable -> L96
        L8d:
            r0 = r2
        L8e:
            if (r0 != 0) goto L92
            akcl r0 = defpackage.akcl.a     // Catch: java.lang.Throwable -> L96
        L92:
            defpackage.akcl.f = r0     // Catch: java.lang.Throwable -> L96
        L94:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            return r0
        L96:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            throw r0
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcl.j():akcl");
    }

    private static int n(String str) {
        String str2;
        akcj akcjVar = new akcj();
        akep akepVarQ = q();
        if (akepVarQ.c != akcjVar) {
            akepVarQ = new akep(akepVarQ.a, akepVarQ.b, akcjVar, akepVarQ.d);
        }
        akfl akflVar = akepVarQ.b;
        if (akflVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        akfh akfhVar = new akfh(akepVarQ.b(akepVarQ.c));
        int iC = akflVar.c(akfhVar, str, 0);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= str.length()) {
            return -((int) akfhVar.g(str));
        }
        String string = str.toString();
        int i2 = akfj.a;
        String strConcat = string.length() <= iC + 35 ? string : string.substring(0, iC + 32).concat("...");
        if (iC <= 0) {
            str2 = "Invalid format: \"" + strConcat + "\"";
        } else if (iC >= string.length()) {
            str2 = "Invalid format: \"" + strConcat + "\" is too short";
        } else {
            str2 = "Invalid format: \"" + strConcat + "\" is malformed at \"" + strConcat.substring(iC) + "\"";
        }
        throw new IllegalArgumentException(str2);
    }

    private static synchronized String o(String str) {
        Map map;
        map = i;
        if (map == null) {
            map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            i = map;
        }
        return (String) map.get(str);
    }

    private static synchronized akcl p(String str, int i2) {
        akcl akclVar;
        if (i2 == 0) {
            return a;
        }
        if (h == null) {
            h = new HashMap();
        }
        Reference reference = (Reference) h.get(str);
        if (reference != null && (akclVar = (akcl) reference.get()) != null) {
            return akclVar;
        }
        akfv akfvVar = new akfv(str, null, i2, i2);
        h.put(str, new SoftReference(akfvVar));
        return akfvVar;
    }

    private static synchronized akep q() {
        akep akepVarA;
        akepVarA = g;
        if (akepVarA == null) {
            akfe akfeVar = new akfe();
            akfeVar.u(null, true, 4);
            akepVarA = akfeVar.a();
            g = akepVarA;
        }
        return akepVarA;
    }

    public abstract int a(long j);

    public int b(long j) {
        int iA = a(j);
        long j2 = j - iA;
        int iA2 = a(j2);
        if (iA != iA2) {
            if (iA - iA2 < 0 && e(j2) != e(j - iA2)) {
                return iA;
            }
        } else if (iA >= 0) {
            long jF = f(j2);
            if (jF < j2) {
                int iA3 = a(jF);
                if (j2 - jF <= iA3 - iA) {
                    return iA3;
                }
            }
        }
        return iA2;
    }

    public abstract int c(long j);

    public final long d(long j) {
        long jA = a(j);
        long j2 = j + jA;
        if ((j ^ j2) >= 0 || (j ^ jA) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract long e(long j);

    public abstract boolean equals(Object obj);

    public abstract long f(long j);

    public abstract String g(long j);

    public int hashCode() {
        return this.c.hashCode() + 57;
    }

    public abstract boolean k();

    public final boolean l(long j) {
        return a(j) == c(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(long r9, long r11) {
        /*
            r8 = this;
            int r11 = r8.a(r11)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.a(r0)
            if (r12 == r11) goto L56
            int r11 = r8.a(r9)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.a(r0)
            if (r11 == r12) goto L3c
            if (r11 >= 0) goto L3c
            long r2 = r8.e(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L2a
            r2 = r4
        L2a:
            long r0 = (long) r12
            long r0 = r9 - r0
            long r6 = r8.e(r0)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L36
            goto L37
        L36:
            r4 = r6
        L37:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L3c
            goto L3d
        L3c:
            r11 = r12
        L3d:
            long r11 = (long) r11
            long r0 = r9 - r11
            long r2 = r9 ^ r0
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L56
            long r9 = r9 ^ r11
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 < 0) goto L4e
            goto L56
        L4e:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Subtracting time zone offset caused overflow"
            r8.<init>(r9)
            throw r8
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcl.m(long, long):long");
    }

    public final String toString() {
        return this.c;
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new akck(this.c);
    }
}
