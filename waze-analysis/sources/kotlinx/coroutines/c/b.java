package kotlinx.coroutines.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class b extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(StackTraceElement[] stackTraceElementArr) {
        super("Coroutine cancelled by exception");
        x.f("Coroutine cancelled by exception", "message");
        x.f(stackTraceElementArr, "stackTrace");
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return this;
    }
}
