package io.ktor.utils.io;

import Ef.InterfaceC0518y;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f37371a;

    public S(Throwable th) {
        this.f37371a = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(tf.l lVar) {
        Throwable th = this.f37371a;
        if (th == 0) {
            return null;
        }
        return th instanceof InterfaceC0518y ? ((InterfaceC0518y) th).a() : th instanceof CancellationException ? Ef.H.a(((CancellationException) th).getMessage(), th) : (Throwable) lVar.invoke(th);
    }
}
