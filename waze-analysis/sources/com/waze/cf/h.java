package com.waze.cf;

import com.waze.ao;
import com.waze.bn;
import com.waze.cf.c.l;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements bn {

    /* renamed from: a, reason: collision with root package name */
    private final ao f22238a;

    /* renamed from: b, reason: collision with root package name */
    private final l f22239b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.cf.d.c f22240c;

    /* renamed from: d, reason: collision with root package name */
    private final af f22241d;

    /* renamed from: e, reason: collision with root package name */
    private final List f22242e;

    public h(ao aoVar, l lVar, com.waze.cf.d.c cVar, af afVar) {
        x.f(aoVar, "carManager");
        x.f(lVar, "disconnectedCarPopupListener");
        x.f(cVar, "disconnectedCarOpenSearchListener");
        x.f(afVar, "scope");
        this.f22238a = aoVar;
        this.f22239b = lVar;
        this.f22240c = cVar;
        this.f22241d = afVar;
        this.f22242e = h.a.i.i(new a(lVar, 1, null), new a(cVar, 0));
    }

    @Override // com.waze.bn
    public final void a() {
        aj.z(this.f22241d, null, null, new g(this, (h.c.e) null, 0), 3);
    }
}
