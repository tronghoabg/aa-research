package com.google.d.d;

import j$.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cc extends bg {

    /* renamed from: a, reason: collision with root package name */
    ep f7485a;

    /* renamed from: b, reason: collision with root package name */
    boolean f7486b = false;

    cc(int i2) {
        this.f7485a = new ep(i2);
    }

    public final cf a() {
        Objects.requireNonNull(this.f7485a);
        if (this.f7485a.f7573c == 0) {
            return fa.f7604a;
        }
        this.f7486b = true;
        return new fa(this.f7485a);
    }

    @Override // com.google.d.d.bg
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        f(obj, 1);
    }

    public final void c(Iterable iterable) {
        ep epVar;
        Objects.requireNonNull(this.f7485a);
        if (!(iterable instanceof em)) {
            super.d(iterable);
            return;
        }
        em emVar = (em) iterable;
        if (emVar instanceof fa) {
            epVar = ((fa) emVar).f7605b;
        } else {
            if (emVar instanceof u) {
                ep epVar2 = ((u) emVar).f7659a;
            }
            epVar = null;
        }
        if (epVar != null) {
            ep epVar3 = this.f7485a;
            epVar3.g(Math.max(epVar3.f7573c, epVar.f7573c));
            for (int iA = epVar.a(); iA >= 0; iA = epVar.e(iA)) {
                f(epVar.f(iA), epVar.c(iA));
            }
            return;
        }
        Set setC = emVar.c();
        ep epVar4 = this.f7485a;
        epVar4.g(Math.max(epVar4.f7573c, setC.size()));
        for (el elVar : emVar.c()) {
            f(elVar.b(), elVar.a());
        }
    }

    public final void f(Object obj, int i2) {
        Objects.requireNonNull(this.f7485a);
        if (i2 == 0) {
            return;
        }
        if (this.f7486b) {
            this.f7485a = new ep(this.f7485a);
        }
        this.f7486b = false;
        com.google.d.b.an.B(obj);
        ep epVar = this.f7485a;
        epVar.j(obj, i2 + epVar.b(obj));
    }
}
