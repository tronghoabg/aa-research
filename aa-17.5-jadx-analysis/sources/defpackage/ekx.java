package defpackage;

/* loaded from: classes2.dex */
public final class ekx extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public ekx() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final ejp a() {
        return new ejp(getMessage());
    }
}
