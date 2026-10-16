package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class elf extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public elf() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final defpackage.ejx a() {
        return new defpackage.ejx(getMessage());
    }
}
