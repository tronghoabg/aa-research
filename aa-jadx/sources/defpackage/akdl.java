package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akdl implements java.io.Serializable {
    public static final defpackage.akdl a = new defpackage.akgv("UTC", "UTC", 0, 0);
    public static java.util.Set b = null;
    public static defpackage.akgu d = null;
    private static defpackage.akgw e = null;
    private static volatile defpackage.akdl f = null;
    private static defpackage.akfp g = null;
    private static java.util.Map h = null;
    private static java.util.Map i = null;
    private static final long serialVersionUID = 5546345482340108586L;
    public final java.lang.String c;

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:52:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        defpackage.akgw akgzVar;
        java.util.Set setA;
        defpackage.akgu akguVar = null;
        try {
            java.lang.String property = java.lang.System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    akgzVar = (defpackage.akgw) java.lang.Class.forName(property).newInstance();
                } catch (java.lang.Exception e2) {
                    java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                    threadCurrentThread.getThreadGroup().uncaughtException(threadCurrentThread, e2);
                    akgzVar = null;
                    if (akgzVar == null) {
                        try {
                            akgzVar = new defpackage.akgz();
                        } catch (java.lang.Exception e3) {
                            java.lang.Thread threadCurrentThread2 = java.lang.Thread.currentThread();
                            threadCurrentThread2.getThreadGroup().uncaughtException(threadCurrentThread2, e3);
                        }
                    }
                    if (akgzVar == null) {
                        akgzVar = new defpackage.akgx();
                    }
                    setA = akgzVar.a();
                    if (setA != null) {
                    }
                    throw new java.lang.IllegalArgumentException("The provider doesn't have any available ids");
                }
            } else {
                akgzVar = null;
            }
        } catch (java.lang.SecurityException unused) {
            akgzVar = null;
        }
        if (akgzVar == null) {
            akgzVar = new defpackage.akgz();
        }
        if (akgzVar == null) {
            akgzVar = new defpackage.akgx();
        }
        setA = akgzVar.a();
        if (setA != null || setA.size() == 0) {
            throw new java.lang.IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!setA.contains("UTC")) {
            throw new java.lang.IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!a.equals(akgzVar.b("UTC"))) {
            throw new java.lang.IllegalArgumentException("Invalid UTC zone provided");
        }
        e = akgzVar;
        b = setA;
        try {
            java.lang.String property2 = java.lang.System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property2 != null) {
                try {
                    akguVar = (defpackage.akgu) java.lang.Class.forName(property2).newInstance();
                } catch (java.lang.Exception e4) {
                    java.lang.Thread threadCurrentThread3 = java.lang.Thread.currentThread();
                    threadCurrentThread3.getThreadGroup().uncaughtException(threadCurrentThread3, e4);
                }
            }
        } catch (java.lang.SecurityException unused2) {
        }
        if (akguVar == null) {
            akguVar = new defpackage.akgu();
        }
        d = akguVar;
    }

    protected akdl(java.lang.String str) {
        this.c = str;
    }

    public static java.lang.String h(int i2) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (i2 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i2 = -i2;
        }
        int i3 = i2 / 3600000;
        defpackage.akgj.c(stringBuffer, i3, 2);
        stringBuffer.append(':');
        int i4 = i2 - (i3 * 3600000);
        int i5 = i4 / 60000;
        defpackage.akgj.c(stringBuffer, i5, 2);
        int i6 = i4 - (i5 * 60000);
        if (i6 != 0) {
            int i7 = i6 / 1000;
            stringBuffer.append(':');
            defpackage.akgj.c(stringBuffer, i7, 2);
            int i8 = i6 - (i7 * 1000);
            if (i8 != 0) {
                stringBuffer.append('.');
                defpackage.akgj.c(stringBuffer, i8, 3);
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static defpackage.akdl i(java.lang.String str) {
        if (str == null) {
            return j();
        }
        if (!str.equals("UTC")) {
            defpackage.akdl akdlVarB = e.b(str);
            if (akdlVarB != null) {
                return akdlVarB;
            }
            if (!str.startsWith("+") && !str.startsWith("-")) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "The datetime zone id '", "' is not recognised"));
            }
            int iN = n(str);
            if (iN != 0) {
                return p(h(iN), iN);
            }
        }
        return a;
    }

    public static defpackage.akdl j() {
        defpackage.akdl akdlVarB;
        defpackage.akdl akdlVarI;
        defpackage.akdl akdlVar = f;
        if (akdlVar != null) {
            return akdlVar;
        }
        synchronized (defpackage.akdl.class) {
            akdlVarB = f;
            if (akdlVarB == null) {
                akdlVarB = null;
                try {
                    java.lang.String property = java.lang.System.getProperty("user.timezone");
                    akdlVarI = property != null ? i(property) : null;
                } catch (java.lang.IllegalArgumentException unused) {
                } catch (java.lang.RuntimeException unused2) {
                }
                if (akdlVarI == null) {
                    try {
                        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
                        if (timeZone == null) {
                            akdlVarB = j();
                        } else {
                            java.lang.String id = timeZone.getID();
                            if (id.equals("UTC")) {
                                akdlVarB = a;
                            } else {
                                java.lang.String strO = o(id);
                                akdlVarB = strO != null ? e.b(strO) : null;
                                if (akdlVarB == null) {
                                    akdlVarB = e.b(id);
                                }
                                if (akdlVarB == null) {
                                    if (strO == null) {
                                        java.lang.String id2 = timeZone.getID();
                                        if (id2.startsWith("GMT+") || id2.startsWith("GMT-")) {
                                            int iN = n(id2.substring(3));
                                            akdlVarB = ((long) iN) == 0 ? a : p(h(iN), iN);
                                        }
                                    }
                                    throw new java.lang.IllegalArgumentException(defpackage.a.bp(id, "The datetime zone id '", "' is not recognised"));
                                }
                            }
                        }
                    } catch (java.lang.IllegalArgumentException unused3) {
                        akdlVarB = akdlVarI;
                    }
                } else {
                    akdlVarB = akdlVarI;
                }
                if (akdlVarB == null) {
                    akdlVarB = a;
                }
                f = akdlVarB;
            }
        }
        return akdlVarB;
    }

    private static int n(java.lang.String str) {
        java.lang.String str2;
        defpackage.akdj akdjVar = new defpackage.akdj();
        defpackage.akfp akfpVarQ = q();
        if (akfpVarQ.c != akdjVar) {
            akfpVarQ = new defpackage.akfp(akfpVarQ.a, akfpVarQ.b, akdjVar, akfpVarQ.d);
        }
        defpackage.akgl akglVar = akfpVarQ.b;
        if (akglVar == null) {
            throw new java.lang.UnsupportedOperationException("Parsing not supported");
        }
        defpackage.akgh akghVar = new defpackage.akgh(akfpVarQ.b(akfpVarQ.c));
        int iC = akglVar.c(akghVar, str, 0);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= str.length()) {
            return -((int) akghVar.g(str));
        }
        java.lang.String string = str.toString();
        int i2 = defpackage.akgj.a;
        java.lang.String strConcat = string.length() <= iC + 35 ? string : string.substring(0, iC + 32).concat("...");
        if (iC <= 0) {
            str2 = "Invalid format: \"" + strConcat + "\"";
        } else if (iC >= string.length()) {
            str2 = "Invalid format: \"" + strConcat + "\" is too short";
        } else {
            str2 = "Invalid format: \"" + strConcat + "\" is malformed at \"" + strConcat.substring(iC) + "\"";
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    private static synchronized java.lang.String o(java.lang.String str) {
        java.util.Map map;
        map = i;
        if (map == null) {
            map = new java.util.HashMap();
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
        return (java.lang.String) map.get(str);
    }

    private static synchronized defpackage.akdl p(java.lang.String str, int i2) {
        defpackage.akdl akdlVar;
        try {
            if (i2 == 0) {
                return a;
            }
            if (h == null) {
                h = new java.util.HashMap();
            }
            java.lang.ref.Reference reference = (java.lang.ref.Reference) h.get(str);
            if (reference != null && (akdlVar = (defpackage.akdl) reference.get()) != null) {
                return akdlVar;
            }
            defpackage.akgv akgvVar = new defpackage.akgv(str, null, i2, i2);
            h.put(str, new java.lang.ref.SoftReference(akgvVar));
            return akgvVar;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private static synchronized defpackage.akfp q() {
        defpackage.akfp akfpVarA;
        akfpVarA = g;
        if (akfpVarA == null) {
            defpackage.akge akgeVar = new defpackage.akge();
            akgeVar.u(null, true, 4);
            akfpVarA = akgeVar.a();
            g = akfpVarA;
        }
        return akfpVarA;
    }

    public abstract int a(long j);

    public int b(long j) {
        int iA = a(j);
        long j2 = j - ((long) iA);
        int iA2 = a(j2);
        if (iA != iA2) {
            if (iA - iA2 < 0 && e(j2) != e(j - ((long) iA2))) {
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
        throw new java.lang.ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract long e(long j);

    public abstract boolean equals(java.lang.Object obj);

    public abstract long f(long j);

    public abstract java.lang.String g(long j);

    public int hashCode() {
        return this.c.hashCode() + 57;
    }

    public abstract boolean k();

    public final boolean l(long j) {
        return a(j) == c(j);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public final long m(long j, long j2) {
        int iA = a(j2);
        long j3 = j - ((long) iA);
        if (a(j3) != iA) {
            int iA2 = a(j);
            long j4 = j - ((long) iA2);
            int iA3 = a(j4);
            if (iA2 == iA3 || iA2 >= 0) {
                iA2 = iA3;
            } else {
                long jE = e(j4);
                if (jE == j4) {
                    jE = Long.MAX_VALUE;
                }
                long j5 = j - ((long) iA3);
                long jE2 = e(j5);
                if (jE == (jE2 != j5 ? jE2 : Long.MAX_VALUE)) {
                    iA2 = iA3;
                }
            }
            long j6 = iA2;
            j3 = j - j6;
            if ((j ^ j3) < 0 && (j ^ j6) < 0) {
                throw new java.lang.ArithmeticException("Subtracting time zone offset caused overflow");
            }
        }
        return j3;
    }

    public final java.lang.String toString() {
        return this.c;
    }

    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new defpackage.akdk(this.c);
    }
}
