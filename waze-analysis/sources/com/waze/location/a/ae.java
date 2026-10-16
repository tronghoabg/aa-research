package com.waze.location.a;

import com.waze.navigate.dg;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25185a;

    public ae(dg dgVar, com.waze.sharedui.e.g gVar) {
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(gVar, "locationService");
        this.f25185a = ai.y(ai.r(dgVar.ah(), new ab(dgVar.J(), 0), new ab(gVar.d(), 2), new ad(null)));
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f25185a;
    }
}
