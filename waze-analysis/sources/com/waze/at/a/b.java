package com.waze.at.a;

import com.waze.alerters.a.k;
import com.waze.app_nav.ah;
import com.waze.app_nav.w;
import com.waze.at.c;
import com.waze.shared_infra.r.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import org.a.b.b.d;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final w f15653a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.r.a f15654b;

    /* renamed from: c, reason: collision with root package name */
    private final af f15655c;

    public b(w wVar, com.waze.shared_infra.r.a aVar, af afVar) {
        x.f(wVar, "mainScreenFlowController");
        x.f(aVar, "appSessionController");
        x.f(afVar, "scope");
        this.f15653a = wVar;
        this.f15654b = aVar;
        this.f15655c = afVar;
    }

    public static final /* synthetic */ void b(b bVar, boolean z, p pVar) {
        c cVar = c.f15670a;
        com.waze.at.b bVar2 = new com.waze.at.b();
        bVar2.c(z);
        bVar2.b(pVar);
        k.c(bVar.f15653a, bVar2.a(), ah.f15182a);
    }

    public final void c() {
        aj.z(this.f15655c, null, null, new a(this, null), 3);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return d.e();
    }
}
