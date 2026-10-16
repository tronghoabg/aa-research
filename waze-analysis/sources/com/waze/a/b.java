package com.waze.a;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements com.waze.app_nav.hub.b.j {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13609a;

    public /* synthetic */ b(int i2) {
        this.f13609a = i2;
    }

    @Override // com.waze.app_nav.hub.b.j
    public final com.waze.app_nav.hub.b.i create(Context context) {
        int i2 = this.f13609a;
        if (i2 == 0) {
            h hVar = h.f13638a;
            h.g.b.x.f(context, "context");
            com.waze.sharedui.d.b bVar = new com.waze.sharedui.d.b(context, null, 0);
            bVar.show();
            return com.waze.app_nav.hub.b.m.a(bVar);
        }
        if (i2 != 1) {
            h.g.b.x.f(context, "context");
            com.waze.view.popups.e eVar = new com.waze.view.popups.e(context);
            eVar.show();
            return com.waze.app_nav.hub.b.m.a(eVar);
        }
        h hVar2 = h.f13638a;
        h.g.b.x.f(context, "context");
        com.waze.sharedui.d.b bVar2 = new com.waze.sharedui.d.b(context, null, 0);
        bVar2.show();
        return com.waze.app_nav.hub.b.m.a(bVar2);
    }
}
