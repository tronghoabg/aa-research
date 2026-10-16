package com.waze.search.c;

import com.waze.location.bg;
import com.waze.location.o;
import com.waze.perf.n;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f35597a;

    /* renamed from: b, reason: collision with root package name */
    private final n f35598b;

    public m(o oVar, n nVar) {
        x.f(oVar, "locationSensorListener");
        x.f(nVar, "config");
        this.f35598b = nVar;
        this.f35597a = ai.y(new l(bg.h(oVar), this));
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f35597a;
    }
}
