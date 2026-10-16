package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajpr {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger("okio.Okio");

    public static final boolean a(java.lang.AssertionError assertionError) {
        java.lang.String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !defpackage.afzh.u(message, "getsockname failed", false)) ? false : true;
    }
}
