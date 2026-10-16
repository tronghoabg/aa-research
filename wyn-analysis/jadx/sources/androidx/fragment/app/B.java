package androidx.fragment.app;

import g.InterfaceC2654b;
import h.AbstractC2762a;
import java.util.concurrent.atomic.AtomicReference;
import t.InterfaceC4035a;

/* loaded from: classes.dex */
public final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4035a f18289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2762a f18291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2654b f18292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f18293e;

    public B(F f10, InterfaceC4035a interfaceC4035a, AtomicReference atomicReference, AbstractC2762a abstractC2762a, InterfaceC2654b interfaceC2654b) {
        this.f18293e = f10;
        this.f18289a = interfaceC4035a;
        this.f18290b = atomicReference;
        this.f18291c = abstractC2762a;
        this.f18292d = interfaceC2654b;
    }

    @Override // androidx.fragment.app.D
    public final void a() {
        F f10 = this.f18293e;
        this.f18290b.set(((g.h) this.f18289a.apply(null)).c(f10.generateActivityResultKey(), f10, this.f18291c, this.f18292d));
    }
}
