package io.ktor.utils.io;

import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b0 implements Ef.E {

    /* renamed from: a, reason: collision with root package name */
    public final J f37387a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f37388b;

    public b0(J j8, InterfaceC3108h coroutineContext) {
        AbstractC3340k.e(coroutineContext, "coroutineContext");
        this.f37387a = j8;
        this.f37388b = coroutineContext;
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f37388b;
    }
}
