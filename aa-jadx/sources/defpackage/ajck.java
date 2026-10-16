package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ajck extends java.lang.Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajck(java.lang.StackTraceElement[] stackTraceElementArr) {
        super("Coroutine encountered an exception.");
        stackTraceElementArr.getClass();
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
