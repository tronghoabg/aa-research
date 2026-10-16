package com.waze.main_screen.ae.a;

import com.waze.sdk.bd;
import com.waze.sdk.bi;
import h.g.b.aq;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    private final bd f25729a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f25730b;

    /* renamed from: c, reason: collision with root package name */
    private final o f25731c;

    public h(bd bdVar, ab abVar, o oVar) {
        x.f(bdVar, "sdkManager");
        x.f(abVar, "ioDispatcher");
        x.f(oVar, "statsSender");
        this.f25729a = bdVar;
        this.f25730b = abVar;
        this.f25731c = oVar;
    }

    @Override // com.waze.main_screen.ae.a.a
    public final d a() {
        return new n(this.f25729a, this.f25730b, this.f25731c);
    }

    @Override // com.waze.main_screen.ae.a.a
    public final kotlinx.coroutines.b.k b() {
        aq aqVar = new aq();
        kotlinx.coroutines.b.k kVarF = bi.f();
        x.e(kVarF, "getButtonStateFlow(...)");
        return ai.y(new g(kVarF, aqVar, this));
    }
}
