package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class c extends h.g.b.u implements h.g.a.l {
    c(Object obj) {
        super(1, obj, h.class, "allNavigationSettingsClicked", "allNavigationSettingsClicked(Lcom/waze/settings/tree/nodes/SettingPage;)V", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        com.waze.settings.tree.d.n nVar = (com.waze.settings.tree.d.n) obj;
        h.g.b.x.f(nVar, "p0");
        h hVar = (h) this.receiver;
        h.g.b.x.f(nVar, "navSettingsPage");
        hVar.H(new m(nVar));
        return h.ab.f48028a;
    }
}
