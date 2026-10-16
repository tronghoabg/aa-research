package Cd;

import java.util.Map;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class E implements Fd.b {

    /* renamed from: a, reason: collision with root package name */
    public final Jd.s f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final Jd.H f1997b;

    /* renamed from: c, reason: collision with root package name */
    public final Nd.d f1998c;

    /* renamed from: d, reason: collision with root package name */
    public final Jd.o f1999d;

    public E(Fd.c cVar) {
        this.f1996a = cVar.f4046b;
        this.f1997b = cVar.f4045a.b();
        this.f1998c = cVar.f4050f;
        this.f1999d = new Jd.o((Map) cVar.f4047c.f421a);
    }

    @Override // Jd.q
    public final Jd.m a() {
        return this.f1999d;
    }

    @Override // Fd.b
    public final Nd.d b() {
        return this.f1998c;
    }

    @Override // Fd.b, Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // Fd.b
    public final Jd.H getUrl() {
        return this.f1997b;
    }

    @Override // Fd.b
    public final Jd.s h() {
        return this.f1996a;
    }
}
