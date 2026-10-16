package com.waze.car_lib.f.a;

import com.waze.shared_infra.coordinators.s;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends s {

    /* renamed from: a, reason: collision with root package name */
    private final bm f19340a;

    /* renamed from: b, reason: collision with root package name */
    private final bq f19341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(af afVar) {
        super(h.f19343a, afVar);
        x.f(afVar, "scope");
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51273c);
        this.f19340a = bmVarC;
        this.f19341b = ai.S(bmVarC);
    }

    public final bq a() {
        return this.f19341b;
    }

    public final void b() {
        H(g.f19342a);
    }

    public final void c() {
        this.f19340a.c(d.f19338a);
    }

    public final void d() {
        this.f19340a.c(e.f19339a);
    }
}
