package y5;

import A5.d;
import df.InterfaceC2432a;
import java.util.concurrent.Executor;
import t5.C4124s;
import u5.C4254e;
import v5.InterfaceC4301b;

/* loaded from: classes3.dex */
public final class b implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2432a f48031a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f48032b;

    /* renamed from: c, reason: collision with root package name */
    public final C4124s f48033c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2432a f48034d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2432a f48035e;

    public b(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, C4124s c4124s, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4) {
        this.f48031a = interfaceC2432a;
        this.f48032b = interfaceC2432a2;
        this.f48033c = c4124s;
        this.f48034d = interfaceC2432a3;
        this.f48035e = interfaceC2432a4;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        return new C4563a((Executor) this.f48031a.get(), (C4254e) this.f48032b.get(), (z5.c) this.f48033c.get(), (d) this.f48034d.get(), (B5.c) this.f48035e.get());
    }
}
