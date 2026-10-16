package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abqw extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public abqw() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final defpackage.abpp a() {
        return new defpackage.abpp(getMessage());
    }
}
