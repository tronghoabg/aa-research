package com.waze;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kc implements com.waze.app_nav.hub.b.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd f25027a;

    /* renamed from: b, reason: collision with root package name */
    private final ka f25028b;

    public kc(bd bdVar, ka kaVar) {
        h.g.b.x.f(kaVar, "popup");
        this.f25027a = bdVar;
        this.f25028b = kaVar;
    }

    @Override // com.waze.app_nav.hub.b.f
    public final void a() {
        bd bdVar = this.f25027a;
        bdVar.f16202c.e("on popup dismissed - carConnection: " + bdVar.f16200a.a().d() + " popup=" + this.f25028b);
        bdVar.f16203d.d(false);
    }

    @Override // com.waze.app_nav.hub.b.f
    public final void b() {
        com.waze.shared_infra.i.e eVar = this.f25027a.f16202c;
        ka kaVar = this.f25028b;
        Objects.toString(kaVar);
        eVar.e("on popup presented: popup=".concat(kaVar.toString()));
    }
}
