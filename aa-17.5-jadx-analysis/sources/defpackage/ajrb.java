package defpackage;

/* loaded from: classes2.dex */
public final class ajrb extends ajps {
    private static final long serialVersionUID = 82685265288806048L;

    public ajrb() {
        super("Cannot retry request with a non-repeatable request entity.");
    }

    public ajrb(Throwable th) {
        super("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", th);
    }
}
