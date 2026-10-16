package com.waze.app_nav;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag implements w {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15179b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f15180c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f15181d;

    public ag(kotlinx.coroutines.af afVar, h.g.a.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aVar, "defaultFlow");
        h.g.b.x.f(eVar, "logger");
        this.f15179b = eVar;
        bn bnVarB = ck.b(new aa(h.a.i.h()));
        this.f15180c = bnVarB;
        ac acVar = new ac(bnVarB, this);
        int i2 = bz.f51630a;
        this.f15181d = ai.V(acVar, afVar, by.b(), new v(h(), h.a.i.h()));
        ai.m(ai.K(bnVarB, new x(this, null)), afVar);
        ai.m(ai.y(new af(bnVarB)), afVar);
    }

    public static final /* synthetic */ v g(aa aaVar) {
        z zVar = (z) h.a.i.U(aaVar.a());
        m mVarA = zVar != null ? zVar.a() : h();
        List listAK = h.a.i.aK(aaVar.a());
        ArrayList arrayList = new ArrayList(h.a.i.q(listAK, 10));
        Iterator it = listAK.iterator();
        while (it.hasNext()) {
            arrayList.add(((z) it.next()).a());
        }
        return new v(mVarA, arrayList);
    }

    private static final m h() {
        return new m(com.waze.main_screen.r.f27406a, new ah(false, null, new f(g.f15205a), 3));
    }

    @Override // com.waze.app_nav.w
    public final r a(m mVar) {
        bn bnVar;
        Object objD;
        aa aaVar;
        List listD;
        h.g.b.x.f(mVar, "destination");
        z zVar = new z(mVar);
        do {
            bnVar = this.f15180c;
            objD = bnVar.d();
            aaVar = (aa) objD;
            listD = mVar.c().e() ? h.a.i.d(zVar) : h.a.i.ag(aaVar.a(), zVar);
            com.waze.shared_infra.i.e eVar = this.f15179b;
            boolean zE = mVar.c().e();
            z zVar2 = (z) h.a.i.U(aaVar.a());
            eVar.e("openDestination, clearBackStack=" + zE + ", newDestination=" + mVar + ", prevDestination=" + (zVar2 != null ? zVar2.a() : null));
        } while (!bnVar.f(objD, aa.b(aaVar, listD)));
        if (mVar.c().e()) {
            Iterator it = aaVar.a().iterator();
            while (it.hasNext()) {
                ((z) it.next()).b().a(s.f15438a);
            }
        }
        return new y(zVar);
    }

    @Override // com.waze.app_nav.w
    public final ch b() {
        return this.f15181d;
    }

    @Override // com.waze.app_nav.w
    public final void c() {
        bn bnVar;
        Object objD;
        aa aaVar;
        this.f15179b.e("handle back");
        do {
            bnVar = this.f15180c;
            objD = bnVar.d();
            aaVar = (aa) objD;
        } while (!bnVar.f(objD, aa.b(aaVar, h.a.i.aK(aaVar.a()))));
        z zVar = (z) h.a.i.U(aaVar.a());
        if (zVar != null) {
            zVar.b().a(s.f15438a);
        }
    }

    @Override // com.waze.app_nav.w
    public final void d() {
        bn bnVar;
        Object objD;
        aa aaVar;
        this.f15179b.e("show root");
        do {
            bnVar = this.f15180c;
            objD = bnVar.d();
            aaVar = (aa) objD;
        } while (!bnVar.f(objD, aa.b(aaVar, h.a.i.h())));
        Iterator it = aaVar.a().iterator();
        while (it.hasNext()) {
            ((z) it.next()).b().a(s.f15438a);
        }
    }

    @Override // com.waze.app_nav.w
    public final void e(long j2) {
        bn bnVar;
        Object objD;
        aa aaVarB;
        Object obj = null;
        do {
            bnVar = this.f15180c;
            objD = bnVar.d();
            aaVarB = (aa) objD;
            List listAq = h.a.i.aq(aaVarB.a());
            Iterator it = listAq.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (((z) it.next()).a().a() == j2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                obj = listAq.get(i2);
                listAq.remove(i2);
                aaVarB = aa.b(aaVarB, listAq);
            }
        } while (!bnVar.f(objD, aaVarB));
        z zVar = (z) obj;
        if (zVar != null) {
            zVar.b().a(new t());
        }
    }
}
