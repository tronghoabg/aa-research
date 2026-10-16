package io.ktor.utils.io;

import java.io.IOException;
import lf.AbstractC3464c;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class a0 implements InterfaceC2886t {

    /* renamed from: b, reason: collision with root package name */
    public final Pf.a f37384b;

    @Nullable
    private volatile S closed;

    public a0(Pf.a aVar) {
        this.f37384b = aVar;
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final void a(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new S(new IOException(message, th));
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Throwable b() {
        S s10 = this.closed;
        if (s10 != null) {
            return s10.a(Q.f37370a);
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Pf.a d() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.f37384b;
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Object g(int i5, AbstractC3464c abstractC3464c) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return Boolean.valueOf(this.f37384b.request(i5));
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final boolean h() {
        return this.f37384b.exhausted();
    }
}
