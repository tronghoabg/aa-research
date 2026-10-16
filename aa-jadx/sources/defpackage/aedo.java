package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aedo {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aedl.class.getName());
    public static final defpackage.ajob b;

    static {
        defpackage.ajob ajobVar = defpackage.ajob.a;
        b = defpackage.airb.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(int i, byte b2, short s) throws java.io.IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s), java.lang.Integer.valueOf(i));
    }

    public static int b(defpackage.ajoa ajoaVar) throws java.io.IOException {
        return (ajoaVar.d() & 255) | ((ajoaVar.d() & 255) << 16) | ((ajoaVar.d() & 255) << 8);
    }

    public static java.io.IOException c(java.lang.String str, java.lang.Object... objArr) throws java.io.IOException {
        throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    public static java.lang.IllegalArgumentException d(java.lang.String str, java.lang.Object... objArr) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, str, objArr));
    }
}
