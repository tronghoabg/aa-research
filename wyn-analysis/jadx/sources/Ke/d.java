package Ke;

/* loaded from: classes5.dex */
public final class d extends RuntimeException {
    public d(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
