package B9;

import D9.i;
import android.app.Application;
import df.InterfaceC2432a;
import java.util.Map;
import z9.C4623B;

/* loaded from: classes4.dex */
public final class g implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2432a f1638a;

    /* renamed from: b, reason: collision with root package name */
    public final F9.a f1639b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f1640c;

    /* renamed from: d, reason: collision with root package name */
    public final F9.a f1641d;

    /* renamed from: e, reason: collision with root package name */
    public final F9.a f1642e;

    /* renamed from: f, reason: collision with root package name */
    public final F9.a f1643f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2432a f1644g;

    public g(InterfaceC2432a interfaceC2432a, F9.a aVar, InterfaceC2432a interfaceC2432a2, F9.a aVar2, F9.a aVar3, F9.a aVar4, InterfaceC2432a interfaceC2432a3) {
        this.f1638a = interfaceC2432a;
        this.f1639b = aVar;
        this.f1640c = interfaceC2432a2;
        this.f1641d = aVar2;
        this.f1642e = aVar3;
        this.f1643f = aVar4;
        this.f1644g = interfaceC2432a3;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        return new f((C4623B) this.f1638a.get(), (Map) this.f1639b.get(), (D9.g) this.f1640c.get(), new Y9.c(7, false), new Y9.c(7, false), (i) this.f1641d.get(), (Application) this.f1642e.get(), (D9.a) this.f1643f.get(), (D9.d) this.f1644g.get());
    }
}
