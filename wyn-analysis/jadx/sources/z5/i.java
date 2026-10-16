package z5;

import df.InterfaceC2432a;
import java.util.concurrent.Executor;
import t5.C4124s;
import v5.InterfaceC4301b;

/* loaded from: classes3.dex */
public final class i implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2432a f48403a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f48404b;

    /* renamed from: c, reason: collision with root package name */
    public final C4124s f48405c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2432a f48406d;

    public i(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, C4124s c4124s, InterfaceC2432a interfaceC2432a3) {
        this.f48403a = interfaceC2432a;
        this.f48404b = interfaceC2432a2;
        this.f48405c = c4124s;
        this.f48406d = interfaceC2432a3;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        return new h((Executor) this.f48403a.get(), (A5.d) this.f48404b.get(), (c) this.f48405c.get(), (B5.c) this.f48406d.get());
    }
}
