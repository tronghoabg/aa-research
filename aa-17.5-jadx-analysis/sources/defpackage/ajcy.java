package defpackage;

/* loaded from: classes3.dex */
public final class ajcy {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object objDE;
        Object objDE2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objDE = Class.forName("afcy").getCanonicalName();
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
        if (aezw.a(objDE) != null) {
            objDE = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objDE;
        try {
            objDE2 = Class.forName("ajcy").getCanonicalName();
        } catch (Throwable th2) {
            objDE2 = woy.dE(th2);
        }
        if (aezw.a(objDE2) != null) {
            objDE2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) objDE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable a(java.lang.Throwable r10, defpackage.afdb r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcy.a(java.lang.Throwable, afdb):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable thA;
        boolean z = ajbn.a;
        if (ajbn.a || !aitz.b || (thA = ajci.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thA.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (affa.f(c, stackTrace[i].getClassName())) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
            i = -1;
        } else {
            i = -1;
        }
        int iE = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (iE == -1 ? 0 : length - iE);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        thA.setStackTrace(stackTraceElementArr);
        return thA;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (affa.f(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (d(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return afyh.g(stackTraceElement.getClassName(), "_COROUTINE", false);
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (affa.f(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
