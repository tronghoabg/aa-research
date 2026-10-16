package com.waze.nav_connect.b;

import com.waze.config.ConfigValues;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f30771a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30772b;

    ad(af afVar, int i2) {
        this.f30772b = i2;
        this.f30771a = afVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        y yVar;
        z zVar;
        if (this.f30772b == 0) {
            y yVar2 = (y) obj;
            if (yVar2 == null) {
                this.f30771a.n(a.f30756d);
            } else if (yVar2.g()) {
                this.f30771a.m(yVar2);
            }
            return h.ab.f48028a;
        }
        Object obj2 = (com.waze.map.isolated.k) obj;
        boolean z = obj2 instanceof com.waze.nav_connect.a.b;
        bn bnVar = this.f30771a.f30782h;
        if (z) {
            boolean z2 = obj2 instanceof com.waze.nav_connect.a.p;
            com.waze.nav_connect.a.b bVar = (com.waze.nav_connect.a.b) obj2;
            String strE = bVar.a().e();
            String strD = bVar.a().d();
            com.waze.nav_connect.a.d dVarB = bVar.a().b();
            String strB = ConfigValues.CONFIG_VALUE_NAV_CONNECT_CONSENT_HELP_CENTER_URL.b();
            h.g.b.x.e(strB, "getValue(...)");
            String strB2 = ConfigValues.CONFIG_VALUE_NAV_CONNECT_CONSENT_REQUIRED_VERSION.b();
            h.g.b.x.e(strB2, "getValue(...)");
            if (bVar instanceof com.waze.nav_connect.a.p) {
                com.waze.nav_connect.a.p pVar = (com.waze.nav_connect.a.p) bVar;
                zVar = new z(pVar.a().c(), pVar.b(), false, pVar.d());
            } else if (bVar instanceof com.waze.nav_connect.a.l) {
                com.waze.nav_connect.a.l lVar = (com.waze.nav_connect.a.l) bVar;
                zVar = new z(lVar.a().c(), lVar.b(), true);
            } else {
                if (!(bVar instanceof com.waze.nav_connect.a.n)) {
                    throw new h.i();
                }
                com.waze.nav_connect.a.n nVar = (com.waze.nav_connect.a.n) bVar;
                zVar = new z(nVar.a().c(), nVar.b(), false);
            }
            yVar = new y(z2, strE, strD, dVarB, strB, strB2, zVar);
        } else {
            yVar = null;
        }
        bnVar.e(yVar);
        return h.ab.f48028a;
    }
}
