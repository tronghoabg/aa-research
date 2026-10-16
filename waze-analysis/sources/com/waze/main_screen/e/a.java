package com.waze.main_screen.e;

import com.waze.bi.g;
import com.waze.bi.i;
import com.waze.bi.j;
import h.ab;
import h.c.e;
import h.g.b.x;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final j f26322a;

    /* renamed from: b, reason: collision with root package name */
    private final j f26323b;

    /* renamed from: c, reason: collision with root package name */
    private final g f26324c;

    public a(j jVar, j jVar2, g gVar) {
        x.f(jVar, "shouldShowCopilotMarketplaceRedDotUseCase");
        x.f(jVar2, "inboxNotificationUseCase");
        x.f(gVar, "redDotNotification");
        this.f26322a = jVar;
        this.f26323b = jVar2;
        this.f26324c = gVar;
    }

    public final Object a(e eVar) {
        Object objA = i.a(this.f26324c, ai.I(this.f26322a.e(), this.f26323b.e()), eVar);
        return objA == h.c.a.a.f48038a ? objA : ab.f48028a;
    }
}
