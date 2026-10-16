package defpackage;

/* loaded from: classes3.dex */
public final class yun extends Exception {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yun(Exception exc) {
        super(exc);
        exc.getClass();
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable getCause() {
        Throwable cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }
}
