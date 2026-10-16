package com.waze.modules.a;

import com.waze.authentication.aj;
import com.waze.authentication.ax;
import com.waze.authentication.l;
import com.waze.authentication.m;
import h.a.i;
import h.f;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final f f29795a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29796b;

    public a(f fVar, com.waze.shared_infra.i.e eVar) {
        x.f(fVar, "credentialsRepository");
        x.f(eVar, "logger");
        this.f29795a = fVar;
        this.f29796b = eVar;
    }

    @Override // com.waze.authentication.l
    public final ax a() {
        ax axVar = (ax) i.R(((aj) this.f29795a.getValue()).a());
        if (axVar != null) {
            return axVar;
        }
        this.f29796b.b("No valid authentication info - username, password and token are null");
        throw m.f15766a;
    }
}
