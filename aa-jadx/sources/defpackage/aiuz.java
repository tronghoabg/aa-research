package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aiuz {
    public static final java.lang.String a(java.lang.Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final java.lang.String b(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final java.lang.String c(defpackage.afdk afdkVar) {
        java.lang.Object objCy;
        if (afdkVar instanceof defpackage.ajda) {
            return ((defpackage.ajda) afdkVar).toString();
        }
        try {
            objCy = afdkVar + "@" + b(afdkVar);
        } catch (java.lang.Throwable th) {
            objCy = defpackage.afga.cy(th);
        }
        if (defpackage.afaw.a(objCy) != null) {
            objCy = afdkVar.getClass().getName() + "@" + b(afdkVar);
        }
        return (java.lang.String) objCy;
    }

    public static final int d(char c) {
        if (c >= '0' && c < ':') {
            return c - '0';
        }
        if (c >= 'a' && c < 'g') {
            return c - 'W';
        }
        if (c >= 'A' && c < 'G') {
            return c - '7';
        }
        throw new java.lang.IllegalArgumentException("Unexpected hex digit: " + c);
    }
}
