package Jf;

import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3108h f6107a;

    public e(InterfaceC3108h interfaceC3108h) {
        this.f6107a = interfaceC3108h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f6107a);
    }
}
