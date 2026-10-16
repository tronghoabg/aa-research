package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f51866a = a.a.H();

    /* renamed from: b, reason: collision with root package name */
    private static final String f51867b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f51868c;

    static {
        Object objA;
        Object objA2;
        try {
            objA = Class.forName("h.c.b.a.a").getCanonicalName();
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (h.m.c(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f51867b = (String) objA;
        try {
            objA2 = Class.forName("kotlinx.coroutines.e.aj").getCanonicalName();
        } catch (Throwable th2) {
            objA2 = e.b.c.a(th2);
        }
        if (h.m.c(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f51868c = (String) objA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Throwable a(java.lang.Throwable r10, h.c.b.a.d r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e.aj.a(java.lang.Throwable, h.c.b.a.d):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable thA;
        int i2 = kotlinx.coroutines.c.d.f51787a;
        if (kotlinx.coroutines.c.d.a() || !kotlinx.coroutines.ai.c() || (thA = r.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thA.getStackTrace();
        int length = stackTrace.length;
        int i3 = length - 1;
        if (i3 >= 0) {
            while (true) {
                int i4 = i3 - 1;
                if (h.g.b.x.n(f51868c, stackTrace[i3].getClassName())) {
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                i3 = i4;
            }
            i3 = -1;
        } else {
            i3 = -1;
        }
        int iE = e(stackTrace, f51867b);
        int i5 = 0;
        int i6 = (length - i3) - (iE == -1 ? 0 : length - iE);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i6];
        while (i5 < i6) {
            stackTraceElementArr[i5] = i5 == 0 ? f51866a : stackTrace[((i3 + 1) + i5) - 1];
            i5++;
        }
        thA.setStackTrace(stackTraceElementArr);
        return thA;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (h.g.b.x.n(cause.getClass(), th.getClass())) {
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
        return h.n.o.ah(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (h.g.b.x.n(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }
}
