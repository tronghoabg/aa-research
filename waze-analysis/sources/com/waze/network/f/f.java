package com.waze.network.f;

import com.waze.authentication.ax;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements com.waze.authentication.l {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f32302a;

    public f(h.f fVar) {
        h.g.b.x.f(fVar, "credentialsRepository");
        this.f32302a = fVar;
    }

    @Override // com.waze.authentication.l
    public final ax a() {
        ax axVar = (ax) h.a.i.R(((com.waze.authentication.aj) this.f32302a.getValue()).a());
        if (axVar != null) {
            return axVar;
        }
        throw com.waze.authentication.m.f15766a;
    }
}
