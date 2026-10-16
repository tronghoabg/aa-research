package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aefb {
    public static final /* synthetic */ int a = 0;

    static {
        java.lang.Object obj;
        java.lang.Class<?> cls;
        defpackage.aefa aefaVar;
        try {
            cls = java.lang.Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (java.lang.Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                aefaVar = (defpackage.aefa) cls.asSubclass(defpackage.aefa.class).getConstructor(defpackage.aefc.class).newInstance(defpackage.aefa.a);
            } catch (java.lang.Throwable th2) {
                obj = th2;
                aefaVar = null;
            }
        } else {
            aefaVar = null;
        }
        if (aefaVar == null) {
            new defpackage.aefa(defpackage.aefa.a);
        }
        if (obj != null) {
            try {
                if (java.lang.Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    java.lang.Class<?> cls2 = java.lang.Class.forName("java.util.logging.Logger");
                    java.lang.Object objInvoke = cls2.getMethod("getLogger", java.lang.String.class).invoke(null, defpackage.aefb.class.getName());
                    java.lang.Class<?> cls3 = java.lang.Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, java.lang.String.class, java.lang.Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private aefb() {
    }
}
