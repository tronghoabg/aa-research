package defpackage;

/* loaded from: classes2.dex */
public final class fjp extends dsu {
    private final Throwable a;

    public fjp(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
