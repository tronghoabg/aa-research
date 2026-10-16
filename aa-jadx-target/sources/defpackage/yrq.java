package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yrq {
    public static final defpackage.yrs a = a(defpackage.yrs.d);

    private static defpackage.yrs a(java.lang.String[] strArr) {
        defpackage.ysa ysaVar;
        try {
            ysaVar = ysb.a;
        } catch (java.lang.NoClassDefFoundError unused) {
            ysaVar = null;
        }
        if (ysaVar != null) {
            return ysaVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            try {
                return (defpackage.yrs) java.lang.Class.forName(str).getConstructor(null).newInstance(null);
            } catch (java.lang.Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof java.lang.reflect.InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new java.lang.IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
