package com.waze.search.v2;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fn extends fo {

    /* renamed from: a, reason: collision with root package name */
    private final List f36532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.waze.ui.ac.n nVar, List list, List list2) {
        super(nVar, list);
        h.g.b.x.f(nVar, "headerLabel");
        h.g.b.x.f(list, "chips");
        h.g.b.x.f(list2, "results");
        this.f36532a = list2;
    }

    public final List a() {
        return this.f36532a;
    }
}
