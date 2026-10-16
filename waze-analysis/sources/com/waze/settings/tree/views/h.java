package com.waze.settings.tree.views;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ de f37621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.waze.settings.tree.m f37622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f37623d;

    h(com.waze.settings.tree.d.b bVar, int i2, c cVar, de deVar) {
        this.f37622c = bVar;
        this.f37620a = i2;
        this.f37623d = cVar;
        this.f37621b = deVar;
    }

    public final void a(int i2) {
        String strS;
        com.waze.settings.tree.m mVar = this.f37622c;
        com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) h.a.i.S(mVar.f(), this.f37620a);
        if (gVar == null || (strS = gVar.s()) == null) {
            strS = "";
        }
        String strS2 = ((com.waze.settings.tree.d.g) mVar.f().get(i2)).s();
        com.waze.settings.tree.m mVar2 = mVar;
        mVar.d().c(this.f37623d, strS2, strS);
        com.waze.search.v2.o.i(mVar2, this.f37621b, strS, strS2 != null ? strS2 : "");
    }

    public /* synthetic */ h(com.waze.settings.tree.d.o oVar, int i2, i iVar, de deVar) {
        this.f37622c = oVar;
        this.f37620a = i2;
        this.f37623d = iVar;
        this.f37621b = deVar;
    }
}
