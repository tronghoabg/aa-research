package com.waze.settings;

import com.waze.ix;
import com.waze.mg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak implements com.waze.ifs.ui.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f36773a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.settings.tree.d.g f36774b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f36775c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f36776d;

    ak(al alVar, com.waze.settings.tree.d.g gVar, de deVar, String str) {
        this.f36773a = alVar;
        this.f36774b = gVar;
        this.f36775c = deVar;
        this.f36776d = str;
    }

    @Override // com.waze.ifs.ui.b
    public final void a(com.waze.ifs.ui.a aVar, int i2, int i3) {
        h.g.b.x.f(aVar, "context");
        if (i2 == 15001) {
            aVar.az(this);
            if (ix.m(mg.f29780a.a())) {
                this.f36773a.C(this.f36774b, this.f36775c, this.f36776d);
            }
        }
    }
}
