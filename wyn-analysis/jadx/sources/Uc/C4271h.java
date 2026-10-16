package uc;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.C3618a;

/* renamed from: uc.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4271h implements InterfaceC4270g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f46750a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3618a f46751b;

    public C4271h(C3618a c3618a) {
        this.f46751b = c3618a;
    }

    @Override // uc.InterfaceC4270g
    public final void a(Object obj) {
        if (this.f46750a.get()) {
            return;
        }
        C3618a c3618a = this.f46751b;
        if (((AtomicReference) c3618a.f41021b).get() != this) {
            return;
        }
        C4273j c4273j = (C4273j) c3618a.f41022c;
        c4273j.f46752a.q(c4273j.f46753b, c4273j.f46754c.b(obj));
    }

    public final void b() {
        if (this.f46750a.getAndSet(true)) {
            return;
        }
        C3618a c3618a = this.f46751b;
        if (((AtomicReference) c3618a.f41021b).get() != this) {
            return;
        }
        C4273j c4273j = (C4273j) c3618a.f41022c;
        c4273j.f46752a.q(c4273j.f46753b, null);
    }

    public final void c(String str, String str2, HashMap map) {
        if (this.f46750a.get()) {
            return;
        }
        C3618a c3618a = this.f46751b;
        if (((AtomicReference) c3618a.f41021b).get() != this) {
            return;
        }
        C4273j c4273j = (C4273j) c3618a.f41022c;
        c4273j.f46752a.q(c4273j.f46753b, c4273j.f46754c.f(str, str2, map));
    }
}
