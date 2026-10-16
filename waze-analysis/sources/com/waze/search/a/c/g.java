package com.waze.search.a.c;

import androidx.lifecycle.ViewModel;
import com.waze.app_nav.w;
import com.waze.search.stats.s;
import com.waze.search.v2.gb;
import com.waze.w.y;
import h.g.b.x;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends ViewModel implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final w f35466a;

    /* renamed from: b, reason: collision with root package name */
    private final a f35467b;

    /* renamed from: c, reason: collision with root package name */
    private final s f35468c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35469d;

    /* renamed from: e, reason: collision with root package name */
    private final bm f35470e;

    /* renamed from: f, reason: collision with root package name */
    private final k f35471f;

    /* renamed from: g, reason: collision with root package name */
    private final k f35472g;

    public g(y yVar, w wVar, a aVar, s sVar, com.waze.shared_infra.i.e eVar) {
        x.f(yVar, "categories");
        x.f(wVar, "wazeMainScreenFlowController");
        x.f(aVar, "categoryGroupItemTransformer");
        x.f(sVar, "searchStatsSender");
        x.f(eVar, "logger");
        this.f35466a = wVar;
        this.f35467b = aVar;
        this.f35468c = sVar;
        this.f35469d = eVar;
        bm bmVarE = bu.e(0, 1, null, 4);
        this.f35470e = bmVarE;
        this.f35471f = bmVarE;
        this.f35472g = new f(yVar.c(), this);
    }

    public static final /* synthetic */ void d(g gVar, com.waze.search.d.a.a.a aVar) {
        gVar.f35469d.a(aVar.toString());
        s.f36105a.a().j(com.waze.search.stats.g.f36034c, gb.m(aVar.d()));
        gVar.f35470e.c(aVar);
    }

    public final k b() {
        return this.f35472g;
    }

    public final k c() {
        return this.f35471f;
    }

    public final void e() {
        this.f35466a.c();
        s.f36105a.a().j(com.waze.search.stats.g.f36032a, null);
    }

    public final void f() {
        this.f35468c.k();
    }

    public final void g() {
        this.f35466a.d();
        s.f36105a.a().j(com.waze.search.stats.g.f36033b, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final void h() {
        this.f35466a.d();
    }
}
