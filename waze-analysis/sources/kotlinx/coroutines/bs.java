package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bs extends CancellationException implements x {

    /* renamed from: a, reason: collision with root package name */
    private final transient br f51767a;

    public bs(String str, Throwable th, br brVar) {
        super(str);
        this.f51767a = brVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.x
    public final /* bridge */ /* synthetic */ Throwable a() {
        bs bsVar;
        if (ai.b()) {
            String message = getMessage();
            h.g.b.x.c(message);
            bsVar = new bs(message, this, b());
        } else {
            bsVar = null;
        }
        return bsVar;
    }

    public final br b() {
        br brVar = this.f51767a;
        return brVar == null ? cl.f51810b : brVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bs) {
            bs bsVar = (bs) obj;
            if (h.g.b.x.n(bsVar.getMessage(), getMessage()) && h.g.b.x.n(bsVar.b(), b()) && h.g.b.x.n(bsVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (ai.b()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        h.g.b.x.c(message);
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
