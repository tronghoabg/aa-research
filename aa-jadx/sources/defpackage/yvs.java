package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yvs extends java.lang.Exception {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvs(java.lang.Exception exc) {
        super(exc);
        exc.getClass();
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ java.lang.Throwable getCause() {
        java.lang.Throwable cause = super.getCause();
        cause.getClass();
        return (java.lang.Exception) cause;
    }
}
