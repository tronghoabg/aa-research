package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class aivi extends CancellationException implements aitr {
    private final transient aivh a;

    public aivi(String str, Throwable th, aivh aivhVar) {
        super(str);
        this.a = aivhVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.aitr
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!aitz.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new aivi(message, this, b());
    }

    public final aivh b() {
        aivh aivhVar = this.a;
        return aivhVar == null ? aivt.a : aivhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aivi) {
            aivi aiviVar = (aivi) obj;
            if (affa.f(aiviVar.getMessage(), getMessage()) && affa.f(aiviVar.b(), b()) && affa.f(aiviVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (aitz.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
