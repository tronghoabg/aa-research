package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay implements cs {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f36806a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f36807b = kotlinx.coroutines.b.ck.b(null);

    ay(ba baVar) {
        this.f36806a = baVar;
    }

    @Override // com.waze.settings.cs
    public final /* bridge */ /* synthetic */ kotlinx.coroutines.b.ch a() {
        throw null;
    }

    @Override // com.waze.settings.cs
    public final void b(int i2) {
        if (i2 != 3) {
            ba baVar = this.f36806a;
            if (baVar.getChildFragmentManager().b() != 0) {
                baVar.getChildFragmentManager().av();
                return;
            }
        }
        this.f36806a.U(i2);
        this.f36807b.e(Integer.valueOf(i2));
    }

    @Override // com.waze.settings.cs
    public final void c(String str, String str2) {
        h.g.b.x.f(str, "page");
        ba baVar = this.f36806a;
        com.waze.settings.tree.f fVarC = baVar.Y().c(str);
        if (fVarC instanceof com.waze.settings.tree.e) {
            baVar.T((com.waze.settings.tree.e) fVarC, str2);
        } else {
            ba.q(baVar, str, str2);
        }
    }
}
