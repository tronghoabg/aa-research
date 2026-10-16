package com.waze.main_screen.p.a.b.b;

import com.waze.NativeManager;
import com.waze.navigate.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ad implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final ch f26884a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26885b;

    /* renamed from: c, reason: collision with root package name */
    private final ak f26886c;

    /* renamed from: d, reason: collision with root package name */
    private final r f26887d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.p.a.a.a f26888e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.bottom_bars.scrollable_eta.q f26889f;

    /* renamed from: g, reason: collision with root package name */
    private final NativeManager f26890g;

    public ad(ch chVar, a aVar, ak akVar, r rVar, com.waze.main_screen.p.a.a.a aVar2, com.waze.main_screen.bottom_bars.scrollable_eta.q qVar, NativeManager nativeManager) {
        h.g.b.x.f(chVar, "etaScreenNavDataProvider");
        h.g.b.x.f(aVar, "mainBarStateHolderFactory");
        h.g.b.x.f(akVar, "midSectionStateHolderFactory");
        h.g.b.x.f(rVar, "controlPanelStateHolderFactory");
        h.g.b.x.f(aVar2, "etaDrawerConfig");
        h.g.b.x.f(qVar, "etaStatsSender");
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f26884a = chVar;
        this.f26885b = aVar;
        this.f26886c = akVar;
        this.f26887d = rVar;
        this.f26888e = aVar2;
        this.f26889f = qVar;
        this.f26890g = nativeManager;
    }

    @Override // com.waze.main_screen.p.a.b.b.ac
    public final af a() {
        r rVar = this.f26887d;
        ak akVar = this.f26886c;
        return new aj(this.f26884a, this.f26885b.a(), akVar.a(), rVar.a(), this.f26888e, this.f26889f, this.f26890g);
    }
}
