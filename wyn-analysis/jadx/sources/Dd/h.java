package Dd;

import Cd.u0;
import Ef.E;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class h implements E {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f2656a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f2657b;

    public h(u0 httpSendSender, InterfaceC3108h coroutineContext) {
        AbstractC3340k.e(httpSendSender, "httpSendSender");
        AbstractC3340k.e(coroutineContext, "coroutineContext");
        this.f2656a = httpSendSender;
        this.f2657b = coroutineContext;
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f2657b;
    }
}
