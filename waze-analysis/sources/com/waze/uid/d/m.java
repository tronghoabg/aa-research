package com.waze.uid.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final l f44456a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44457b;

    public m(l lVar) {
        x.f(lVar, "callback");
        this.f44456a = lVar;
        this.f44457b = com.waze.uid.e.f.i();
    }

    @Override // com.waze.uid.d.l
    public final void a(com.waze.sharedui.b bVar) {
        x.f(bVar, "error");
        int i2 = this.f44457b;
        int i3 = com.waze.uid.e.f.i();
        if (i2 == i3) {
            this.f44456a.a(bVar);
            return;
        }
        com.waze.shared_infra.i.h.k("UID_SERVICES", "unexpected state enter id: current=" + i3 + ", expected=" + i2);
    }
}
