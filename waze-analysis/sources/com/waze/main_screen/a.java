package com.waze.main_screen;

import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements com.waze.map.main.ab {

    /* renamed from: a, reason: collision with root package name */
    private final bn f25525a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f25526b;

    public a() {
        bn bnVarB = ck.b(new com.waze.map.main.aa(0, 0, 0, 0, 0, 0, 0));
        this.f25525a = bnVarB;
        this.f25526b = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    @Override // com.waze.map.main.ab
    public final ch a() {
        return this.f25526b;
    }

    @Override // com.waze.map.main.ab
    public final void b(com.waze.map.main.aa aaVar) {
        h.g.b.x.f(aaVar, "geometry");
        this.f25525a.e(aaVar);
    }
}
