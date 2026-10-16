package defpackage;

/* loaded from: classes.dex */
public final class xtl extends xtk {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
