package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ytj {
    public static final defpackage.ytm a;
    private static final java.lang.String[] b = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    static {
        defpackage.ytm ytoVar;
        for (int i = 0; i < 2; i++) {
            ytoVar = null;
            try {
                ytoVar = (defpackage.ytm) java.lang.Class.forName(b[i]).asSubclass(defpackage.ytm.class).getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.Throwable unused) {
            }
            if (ytoVar != null) {
                a = ytoVar;
            }
        }
        ytoVar = new defpackage.yto();
        a = ytoVar;
    }

    public static java.lang.StackTraceElement a(java.lang.Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "skip count cannot be negative: "));
        }
        return a.a(cls, i + 1);
    }
}
