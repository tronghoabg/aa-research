package Ef;

import java.util.concurrent.locks.LockSupport;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0490h extends AbstractC0476a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f3738d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0481c0 f3739e;

    public C0490h(InterfaceC3108h interfaceC3108h, Thread thread, AbstractC0481c0 abstractC0481c0) {
        super(interfaceC3108h, true);
        this.f3738d = thread;
        this.f3739e = abstractC0481c0;
    }

    @Override // Ef.z0
    public final void k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3738d;
        if (AbstractC3340k.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
