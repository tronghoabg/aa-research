package z5;

import Va.C1038ka;
import android.content.Context;
import df.InterfaceC2432a;
import java.util.concurrent.Executor;
import t5.C4124s;
import u5.C4254e;
import v5.InterfaceC4301b;
import za.C4658a;

/* loaded from: classes3.dex */
public final class g implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final A5.e f48392a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f48393b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f48394c;

    /* renamed from: d, reason: collision with root package name */
    public final C4124s f48395d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2432a f48396e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2432a f48397f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2432a f48398g;

    public g(A5.e eVar, InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, C4124s c4124s, InterfaceC2432a interfaceC2432a3, InterfaceC2432a interfaceC2432a4, InterfaceC2432a interfaceC2432a5) {
        this.f48392a = eVar;
        this.f48393b = interfaceC2432a;
        this.f48394c = interfaceC2432a2;
        this.f48395d = c4124s;
        this.f48396e = interfaceC2432a3;
        this.f48397f = interfaceC2432a4;
        this.f48398g = interfaceC2432a5;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        return new f((Context) this.f48392a.f354b, (C4254e) this.f48393b.get(), (A5.d) this.f48394c.get(), (c) this.f48395d.get(), (Executor) this.f48396e.get(), (B5.c) this.f48397f.get(), new C1038ka(15), new C4658a(14), (A5.c) this.f48398g.get());
    }
}
