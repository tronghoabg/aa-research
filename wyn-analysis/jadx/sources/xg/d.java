package xg;

import A.AbstractC0213f;
import java.io.PrintStream;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f47901a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f47902b;

    static {
        int i5;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i10 = 2;
        if (property == null || property.isEmpty()) {
            i5 = 1;
        } else {
            for (int i11 = 0; i11 < 3; i11++) {
                if (strArr[i11].equalsIgnoreCase(property)) {
                    i5 = 2;
                    break;
                }
            }
            i5 = 1;
        }
        f47901a = i5;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i10 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i10 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i10 = 3;
            }
        }
        f47902b = i10;
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): " + str);
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        return AbstractC0213f.f(f47901a) != 1 ? System.err : System.out;
    }

    public static final void c(String str) {
        if (AbstractC0213f.f(3) >= AbstractC0213f.f(f47902b)) {
            b().println("SLF4J(W): " + str);
        }
    }
}
