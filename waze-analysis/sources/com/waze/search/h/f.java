package com.waze.search.h;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f35914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f35915b;

    f(o oVar, kotlinx.coroutines.af afVar) {
        this.f35914a = oVar;
        this.f35915b = afVar;
    }

    public final void a(com.waze.w.i iVar, String str, int i2) {
        h.g.b.x.f(iVar, "autoCompletePlace");
        h.g.b.x.f(str, "searchTerm");
        kotlinx.coroutines.aj.z(this.f35915b, null, null, new e(this.f35914a, iVar, str, i2, null), 3);
    }

    public final void b() {
        this.f35914a.f35956l.a(v.f35964a);
    }

    public final void c(String str, String str2, int i2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "searchTerm");
        o.k(this.f35914a, str, str2, i2);
    }
}
