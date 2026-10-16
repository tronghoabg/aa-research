package com.waze.by;

import com.waze.settings.tree.b.f;
import h.c.e;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.az.b f18203a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f18204b;

    /* renamed from: c, reason: collision with root package name */
    private final f f18205c;

    public b(com.waze.az.b bVar, f fVar, ab abVar) {
        x.f(bVar, "detector");
        x.f(fVar, "config");
        x.f(abVar, "mainDispatcher");
        this.f18203a = bVar;
        this.f18205c = fVar;
        this.f18204b = abVar;
    }

    public final Object b(e eVar) {
        return aj.v(this.f18204b, new a(this, null), eVar);
    }

    public final boolean d() {
        return this.f18205c.h();
    }
}
