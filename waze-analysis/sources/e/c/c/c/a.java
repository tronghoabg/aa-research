package e.c.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends Throwable {
    private static final long serialVersionUID = -4649703670690200604L;

    a() {
        super("No further exceptions");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
