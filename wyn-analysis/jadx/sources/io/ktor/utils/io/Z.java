package io.ktor.utils.io;

import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class Z implements Ef.E {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2886t f37381a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f37382b;

    public Z(InterfaceC2886t interfaceC2886t, InterfaceC3108h coroutineContext) {
        AbstractC3340k.e(coroutineContext, "coroutineContext");
        this.f37381a = interfaceC2886t;
        this.f37382b = coroutineContext;
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f37382b;
    }
}
