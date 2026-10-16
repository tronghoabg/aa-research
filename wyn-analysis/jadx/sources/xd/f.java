package xd;

import Jd.H;
import Jd.m;
import Jd.s;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f implements Fd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fd.b f47893a;

    public f(e call, Fd.b bVar) {
        AbstractC3340k.e(call, "call");
        this.f47893a = bVar;
    }

    @Override // Jd.q
    public final m a() {
        return this.f47893a.a();
    }

    @Override // Fd.b
    public final Nd.d b() {
        return this.f47893a.b();
    }

    @Override // Fd.b, Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f47893a.getCoroutineContext();
    }

    @Override // Fd.b
    public final H getUrl() {
        return this.f47893a.getUrl();
    }

    @Override // Fd.b
    public final s h() {
        return this.f47893a.h();
    }
}
