package com.waze.o.d.a;

import com.waze.R;
import com.waze.car_lib.p.dc;
import com.waze.car_lib.p.dg;
import com.waze.car_lib.screens.bp;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements bp {

    /* renamed from: a, reason: collision with root package name */
    private final dg f32844a;

    public c(com.waze.shared_infra.o.a aVar) {
        x.f(aVar, "stringProvider");
        this.f32844a = new dg(aVar.c(R.string.CONVERSATION_INFRA_PERMISSION_TITLE, new Object[0]), aVar.c(R.string.CONVERSATION_INFRA_PERMISSION_SUBTITLE, new Object[0]), Integer.valueOf(R.drawable.companinio), true, new dc(aVar.c(R.string.CONVERSATION_INFRA_PERMISSION_PRIMARY_BUTTON, new Object[0]), true), null, 32);
    }

    @Override // com.waze.car_lib.screens.bp
    public final dg a() {
        return this.f32844a;
    }
}
