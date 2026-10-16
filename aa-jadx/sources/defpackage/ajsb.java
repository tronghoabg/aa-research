package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajsb extends defpackage.ajqs {
    private static final long serialVersionUID = 82685265288806048L;

    public ajsb() {
        super("Cannot retry request with a non-repeatable request entity.");
    }

    public ajsb(java.lang.Throwable th) {
        super("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", th);
    }
}
