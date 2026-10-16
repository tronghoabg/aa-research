package Cd;

import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final /* synthetic */ class V implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2038a;

    public /* synthetic */ V(boolean z2) {
        this.f2038a = z2;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g0 retryOnExceptionIf = (g0) obj;
        Throwable cause = (Throwable) obj3;
        AbstractC3340k.e(retryOnExceptionIf, "$this$retryOnExceptionIf");
        AbstractC3340k.e((Fd.c) obj2, "<unused var>");
        AbstractC3340k.e(cause, "cause");
        vg.b bVar = b0.f2078a;
        Throwable thA = Hd.a.a(cause);
        return Boolean.valueOf(((thA instanceof c0) || (thA instanceof Bd.a) || (thA instanceof SocketTimeoutException)) ? this.f2038a : !(cause instanceof CancellationException));
    }
}
