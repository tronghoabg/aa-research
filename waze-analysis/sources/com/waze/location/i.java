package com.waze.location;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f25403a;

    public i(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "currLocation");
        this.f25403a = aVar;
    }

    @Override // h.g.a.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.waze.sharedui.utils.c invoke(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "location");
        com.waze.shared_infra.h.c cVar2 = (com.waze.shared_infra.h.c) this.f25403a.invoke();
        if (cVar2.h() && cVar.h()) {
            return new com.waze.sharedui.utils.c(com.waze.sharedui.utils.f.d(ConfigValues.CONFIG_VALUE_GENERAL_UNITS.b()), h.h.a.b(com.waze.sharedui.utils.f.b(cVar2, cVar)), true);
        }
        return null;
    }
}
