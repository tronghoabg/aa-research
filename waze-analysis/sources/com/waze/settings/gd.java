package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gd extends ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gd(ds dsVar) {
        super(null);
        this.f37298a = dsVar;
    }

    @Override // com.waze.settings.ai
    public final void c(com.waze.settings.tree.g gVar, int i2) {
        h.g.b.x.f(gVar, "page");
        ds dsVar = this.f37298a;
        if (i2 == 20002) {
            dsVar.M();
        } else {
            dsVar.L();
        }
    }
}
