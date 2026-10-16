package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class afvs {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static final java.lang.String a(java.lang.String str) {
        java.lang.String strQuote = java.util.regex.Pattern.quote(str);
        strQuote.getClass();
        return strQuote;
    }

    public static final void b(defpackage.afdk afdkVar, defpackage.afdk afdkVar2) throws java.lang.Throwable {
        try {
            defpackage.ajdb.a(defpackage.afga.s(afdkVar), defpackage.afbk.a);
        } catch (java.lang.Throwable th) {
            g(afdkVar2, th);
        }
    }

    public static final void c(defpackage.affg affgVar, java.lang.Object obj, defpackage.afdk afdkVar) {
        try {
            defpackage.ajdb.a(defpackage.afga.s(defpackage.afga.r(affgVar, obj, afdkVar)), defpackage.afbk.a);
        } catch (java.lang.Throwable th) {
            g(afdkVar, th);
        }
    }

    public static final boolean d(java.lang.String str, boolean z) {
        java.lang.String property;
        int i = defpackage.ajea.a;
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        return property != null ? java.lang.Boolean.parseBoolean(property) : z;
    }

    public static final int e(java.lang.String str, int i, int i2) {
        return (int) f(str, i, i2);
    }

    public static final long f(java.lang.String str, long j, long j2) {
        java.lang.String property;
        int i = defpackage.ajea.a;
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        java.lang.Long lP = defpackage.afzh.P(property);
        if (lP == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bB(property, str, "System property '", "' has unrecognized value '", "'"));
        }
        long jLongValue = lP.longValue();
        if (jLongValue >= 1 && jLongValue <= j2) {
            return jLongValue;
        }
        throw new java.lang.IllegalStateException("System property '" + str + "' should be in range 1.." + j2 + ", but is '" + jLongValue + "'");
    }

    private static final void g(defpackage.afdk afdkVar, java.lang.Throwable th) throws java.lang.Throwable {
        if (th instanceof defpackage.aivh) {
            th = ((defpackage.aivh) th).a;
        }
        afdkVar.w(defpackage.afga.cy(th));
        throw th;
    }

    public static <T> defpackage.afvp<T> lazySoft(T t, defpackage.afer<T> aferVar) {
        if (aferVar == null) {
            $$$reportNull$$$0(0);
        }
        return new defpackage.afvp<>(t, aferVar);
    }

    public static <T> defpackage.afvp<T> lazySoft(defpackage.afer<T> aferVar) {
        if (aferVar == null) {
            $$$reportNull$$$0(1);
        }
        return lazySoft(null, aferVar);
    }
}
