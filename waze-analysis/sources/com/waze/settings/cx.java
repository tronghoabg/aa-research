package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx implements cs {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dc f36993a;

    /* renamed from: b, reason: collision with root package name */
    private final cs f36994b;

    public cx(dc dcVar, cs csVar) {
        h.g.b.x.f(csVar, "delegateSettingsNavigator");
        this.f36993a = dcVar;
        this.f36994b = csVar;
    }

    @Override // com.waze.settings.cs
    public final kotlinx.coroutines.b.ch a() {
        throw null;
    }

    @Override // com.waze.settings.cs
    public final void b(int i2) {
        dc dcVar = this.f36993a;
        com.waze.settings.tree.g gVarB = dcVar.b();
        if (gVarB != null) {
            ai aiVar = gVarB.f37568e;
            if (aiVar != null) {
                aiVar.c(gVarB, i2);
            }
            com.waze.search.v2.o.e(dcVar, i2);
        }
        dcVar.k().F(Integer.valueOf(i2));
        this.f36994b.b(i2);
    }

    @Override // com.waze.settings.cs
    public final void c(String str, String str2) {
        h.g.b.x.f(str, "page");
        this.f36994b.c(str, str2);
    }
}
