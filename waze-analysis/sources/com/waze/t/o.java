package com.waze.t;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements com.waze.t.a.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f40905a;

    public o(com.waze.sharedui.profile.b bVar) {
        x.f(bVar, "profileManager");
        this.f40905a = bVar;
    }

    @Override // com.waze.t.a.j
    public final /* bridge */ /* synthetic */ Object b() {
        return this.f40905a.b().getBasicInfo().getFirstName();
    }
}
