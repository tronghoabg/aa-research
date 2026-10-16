package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afjw {
    private static final boolean useClassValue;

    static {
        java.lang.Object objCy;
        try {
            objCy = java.lang.Class.forName("java.lang.ClassValue");
        } catch (java.lang.Throwable th) {
            objCy = defpackage.afga.cy(th);
        }
        if (defpackage.afaw.b(objCy)) {
            objCy = java.lang.Boolean.TRUE;
        }
        boolean z = objCy instanceof defpackage.afav;
        java.lang.Object obj = java.lang.Boolean.FALSE;
        if (true == z) {
            objCy = obj;
        }
        useClassValue = ((java.lang.Boolean) objCy).booleanValue();
    }

    public static final <V> defpackage.afjv<V> createCache(defpackage.affc<? super java.lang.Class, ? extends V> affcVar) {
        affcVar.getClass();
        return useClassValue ? new afkd(affcVar) : new defpackage.afkf(affcVar);
    }
}
