package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fn extends ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fn(ds dsVar) {
        super(null);
        this.f37268a = dsVar;
    }

    @Override // com.waze.settings.ai
    public final void c(com.waze.settings.tree.g gVar, int i2) {
        h.g.b.x.f(gVar, "page");
        ds dsVar = this.f37268a;
        if (i2 == 20002) {
            dsVar.M();
        } else {
            dsVar.L();
        }
    }
}
