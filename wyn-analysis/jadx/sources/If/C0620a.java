package If;

import java.util.concurrent.CancellationException;

/* renamed from: If.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0620a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f5458a;

    public C0620a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f5458a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
