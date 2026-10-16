package defpackage;

/* loaded from: classes3.dex */
class ajbk extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbk(StackTraceElement[] stackTraceElementArr) {
        super("Coroutine encountered an exception.");
        stackTraceElementArr.getClass();
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return this;
    }
}
