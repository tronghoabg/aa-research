package com.waze.uid;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.api.b f44806a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f44807b;

    y(com.waze.sharedui.api.b bVar, aa aaVar) {
        this.f44806a = bVar;
        this.f44807b = aaVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        this.f44806a.a(bVar);
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        com.waze.sharedui.api.l lVar = (com.waze.sharedui.api.l) obj;
        h.g.b.x.f(lVar, "value");
        NativeManager.Post(new com.waze.beacons.p(this.f44807b, 17));
        this.f44806a.b(lVar);
    }
}
