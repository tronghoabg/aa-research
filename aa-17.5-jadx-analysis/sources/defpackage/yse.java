package defpackage;

/* loaded from: classes3.dex */
public final class yse {
    public static final ysh a;
    private static final String[] b = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [ysh] */
    static {
        ysj ysjVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                ysjVar = new ysj();
                break;
            }
            ysjVar = null;
            try {
                ysjVar = (ysh) Class.forName(b[i]).asSubclass(ysh.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (ysjVar != null) {
                break;
            } else {
                i++;
            }
        }
        a = ysjVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "skip count cannot be negative: "));
        }
        return a.a(cls, i + 1);
    }
}
