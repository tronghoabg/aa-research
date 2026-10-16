package defpackage;

/* loaded from: classes.dex */
public final class aeeb {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj;
        Class<?> cls;
        aeea aeeaVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                aeeaVar = (aeea) cls.asSubclass(aeea.class).getConstructor(aeec.class).newInstance(aeea.a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            aeeaVar = null;
        }
        if (aeeaVar == null) {
            new aeea(aeea.a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, aeeb.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private aeeb() {
    }
}
