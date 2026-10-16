package com.waze.car_lib.r.d;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.waze.car_lib.aw;
import com.waze.car_lib.bd;
import com.waze.car_lib.f.jb;
import com.waze.car_lib.f.jc;
import com.waze.car_lib.r.cq;
import com.waze.car_lib.r.fj;
import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import com.waze.modules.c.ar;
import com.waze.modules.c.dk;
import com.waze.modules.c.dp;
import com.waze.modules.navigation.af;
import com.waze.modules.navigation.ah;
import com.waze.sharedui.views.ap;
import com.waze.sharedui.web.at;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.bb;
import com.waze.trip_overview.be;
import com.waze.trip_overview.bf;
import com.waze.trip_overview.bg;
import com.waze.trip_overview.bi;
import com.waze.trip_overview.bj;
import com.waze.trip_overview.bk;
import com.waze.trip_overview.bl;
import com.waze.trip_overview.z;
import h.ab;
import h.g.b.ao;
import h.g.b.aq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x implements LifecycleOwner {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.f.h f21337a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.utils.f f21338b;

    /* renamed from: c, reason: collision with root package name */
    private final af f21339c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21340d;

    /* renamed from: e, reason: collision with root package name */
    private final g f21341e;

    /* renamed from: f, reason: collision with root package name */
    private final z f21342f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.bp.i f21343g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.j.w f21344h;

    /* renamed from: i, reason: collision with root package name */
    private final bl f21345i;

    /* renamed from: j, reason: collision with root package name */
    private final bd f21346j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.af f21347k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.car_lib.j.x f21348l;
    private final com.waze.bn.b m;
    private final com.waze.shared_infra.i.e n;
    private final com.waze.z o;
    private final LifecycleRegistry p = new LifecycleRegistry(this);
    private boolean q;
    private final bn r;
    private final long s;
    private ah t;
    private final bn u;
    private final bn v;
    private final ch w;
    private final Map x;

    public /* synthetic */ x(com.waze.car_lib.f.h hVar, com.waze.sharedui.utils.f fVar, af afVar, com.waze.shared_infra.o.a aVar, g gVar, z zVar, com.waze.bp.i iVar, com.waze.car_lib.j.w wVar, bl blVar, bd bdVar, kotlinx.coroutines.af afVar2, com.waze.car_lib.j.x xVar, com.waze.bn.b bVar, com.waze.shared_infra.i.e eVar, com.waze.z zVar2) {
        this.f21337a = hVar;
        this.f21338b = fVar;
        this.f21339c = afVar;
        this.f21340d = aVar;
        this.f21341e = gVar;
        this.f21342f = zVar;
        this.f21343g = iVar;
        this.f21344h = wVar;
        this.f21345i = blVar;
        this.f21346j = bdVar;
        this.f21347k = afVar2;
        this.f21348l = xVar;
        this.m = bVar;
        this.n = eVar;
        this.o = zVar2;
        bdVar.v(wVar.a(), getLifecycle(), "TripOverviewStateHolder", com.waze.bk.a.a.f16839a, zVar.m() ? aw.f18912b : aw.f18911a);
        this.q = true;
        this.r = ck.b(Long.valueOf(System.currentTimeMillis()));
        this.s = gVar.a();
        this.u = ck.b(false);
        bn bnVarB = ck.b(new com.waze.car_lib.screens.b.r(false));
        this.v = bnVarB;
        this.w = ai.U(bnVarB);
        this.x = new LinkedHashMap();
    }

    public static final /* synthetic */ Object O(x xVar, com.waze.t.c.n nVar, h.c.e eVar) {
        if (h.g.b.x.n(nVar, com.waze.car_lib.f.f.f19574a)) {
            Object objA = xVar.f21343g.a(eVar);
            return objA == h.c.a.a.f48038a ? objA : ab.f48028a;
        }
        if (!h.g.b.x.n(nVar, com.waze.car_lib.f.g.f19602a)) {
            throw new h.i();
        }
        xVar.f21337a.H(com.waze.car_lib.f.i.f19691a);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(h.c.e r20) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.d.x.P(h.c.e):java.lang.Object");
    }

    private static final void Q(Set set, List list, ao aoVar, h hVar, String str) {
        String lowerCase = hVar.a().toLowerCase(Locale.ROOT);
        h.g.b.x.e(lowerCase, "toLowerCase(...)");
        int iH = h.a.i.H(set, lowerCase);
        if (str != null) {
            if (iH >= 0) {
                list.add(new j(iH, hVar, str));
                return;
            }
            int i2 = aoVar.f48103a;
            aoVar.f48103a = i2 + 1;
            list.add(new j(i2, hVar, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(jb jbVar, Integer num, String str) {
        be beVar = jbVar == jb.f19738b ? be.f41067b : be.f41066a;
        int iIntValue = num != null ? num.intValue() : DisplayStrings.DS_NIGHT;
        bl blVar = this.f21345i;
        if (str == null) {
            str = "";
        }
        blVar.y(beVar, iIntValue, str, this.t);
        com.waze.car_lib.f.h hVar = this.f21337a;
        h.g.b.x.f(jbVar, "errorType");
        hVar.H(new com.waze.car_lib.f.j(jbVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        bn bnVar;
        Object objD;
        Object objD2;
        com.waze.car_lib.screens.b.q qVarI;
        do {
            bnVar = this.r;
            objD = bnVar.d();
            ((Number) objD).longValue();
        } while (!bnVar.f(objD, Long.valueOf(System.currentTimeMillis())));
        this.q = false;
        bn bnVar2 = this.v;
        do {
            objD2 = bnVar2.d();
            qVarI = (cq) objD2;
            com.waze.car_lib.screens.b.q qVar = qVarI instanceof com.waze.car_lib.screens.b.q ? (com.waze.car_lib.screens.b.q) qVarI : null;
            if (qVar != null) {
                qVarI = com.waze.car_lib.screens.b.q.i(qVar, 0, this.q, DisplayStrings.DS_TRIP_OVERVIEW_LICENSE_PLATE_RESTRICTION_ALERT);
            }
        } while (!bnVar2.f(objD2, qVarI));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(bb bbVar, Long l2) {
        Object objD = this.f21343g.e().d();
        byte[] bArr = null;
        com.waze.c.b.h hVar = objD instanceof com.waze.c.b.h ? (com.waze.c.b.h) objD : null;
        if (hVar == null) {
            return;
        }
        this.f21345i.o(bbVar, (6 & 2) != 0 ? null : null, (6 & 4) != 0 ? null : null, true, true, ((dk) hVar.c()).c(), hVar.a(), this.t, ((dk) hVar.c()).f(), new com.waze.trip_overview.h(bArr), 0L, (6 & 2048) != 0 ? null : l2, com.b.b.a.u.g(this.o));
    }

    private final void U(bg bgVar) {
        this.f21345i.r(bgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(ar arVar, bk bkVar) {
        ArrayList arrayListH;
        bf bfVar;
        bi biVarW = W(arVar);
        List list = (List) this.x.get(arVar);
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                h hVarB = ((j) it.next()).b();
                dp dpVar = dp.f30104a;
                h hVar = h.f21278a;
                switch (hVarB.ordinal()) {
                    case 0:
                        bfVar = bf.f41069a;
                        break;
                    case 1:
                        bfVar = bf.f41070b;
                        break;
                    case 2:
                        bfVar = bf.f41071c;
                        break;
                    case 3:
                        bfVar = bf.f41072d;
                        break;
                    case 4:
                        bfVar = bf.f41073e;
                        break;
                    case 5:
                        bfVar = bf.f41074f;
                        break;
                    case 6:
                        bfVar = bf.f41075g;
                        break;
                    case 7:
                        bfVar = bf.f41076h;
                        break;
                    default:
                        throw new h.i();
                }
                arrayList.add(bfVar);
            }
            arrayListH = arrayList;
        } else {
            arrayListH = h.a.i.h();
        }
        this.f21345i.m(bkVar, biVarW, arrayListH);
    }

    private static final bi W(ar arVar) {
        return new bi(String.valueOf(arVar.a()), arVar.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.car_lib.screens.b.p f(com.waze.car_lib.r.d.x r27, com.waze.modules.c.ar r28) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.d.x.f(com.waze.car_lib.r.d.x, com.waze.modules.c.ar):com.waze.car_lib.screens.b.p");
    }

    public static final /* synthetic */ Object l(x xVar, h.c.e eVar) {
        xVar.T(bb.q, new Long(h.o.a.p(xVar.s)));
        Object objP = xVar.P(eVar);
        return objP == h.c.a.a.f48038a ? objP : ab.f48028a;
    }

    static /* synthetic */ Object n(x xVar, h.c.e eVar) {
        xVar.T(bb.f41044a, null);
        Object objP = xVar.P(eVar);
        return objP == h.c.a.a.f48038a ? objP : ab.f48028a;
    }

    public static final /* synthetic */ void t(x xVar, long j2) {
        Object objD;
        com.waze.car_lib.screens.b.q qVarI;
        Object objD2 = xVar.f21343g.e().d();
        com.waze.c.b.h hVar = objD2 instanceof com.waze.c.b.h ? (com.waze.c.b.h) objD2 : null;
        if (hVar == null) {
            return;
        }
        int i2 = fj.f21640a;
        int iB = fj.b(((dk) hVar.c()).f(), j2);
        bn bnVar = xVar.v;
        do {
            objD = bnVar.d();
            qVarI = (cq) objD;
            com.waze.car_lib.screens.b.q qVar = qVarI instanceof com.waze.car_lib.screens.b.q ? (com.waze.car_lib.screens.b.q) qVarI : null;
            if (qVar != null) {
                qVarI = com.waze.car_lib.screens.b.q.i(qVar, iB, false, 247);
            }
        } while (!bnVar.f(objD, qVarI));
        xVar.V((ar) ((dk) hVar.c()).f().get(iB), bk.f41094b);
        xVar.S();
    }

    static final void w(x xVar, CompletableDeferred completableDeferred, StartNavigationResponse startNavigationResponse) {
        if (startNavigationResponse == null || startNavigationResponse.getCode() != 0) {
            xVar.n.g("Navigation request failed " + (startNavigationResponse != null ? Integer.valueOf(startNavigationResponse.getCode()) : null) + ": " + (startNavigationResponse != null ? startNavigationResponse.getServerDesc() : null));
            xVar.R(jb.f19738b, startNavigationResponse != null ? Integer.valueOf(startNavigationResponse.getCode()) : null, startNavigationResponse != null ? startNavigationResponse.getServerDesc() : null);
        } else {
            xVar.f21337a.H(com.waze.car_lib.f.r.f19776a);
        }
        completableDeferred.a(ab.f48028a);
    }

    public final void A() {
        U(bg.f41079b);
    }

    public final void B() {
        this.f21337a.H(com.waze.car_lib.f.p.f19773a);
        T(bb.o, null);
        S();
    }

    public final void C() {
        this.f21337a.H(com.waze.car_lib.f.n.f19771a);
        T(bb.p, null);
        S();
    }

    public final void D(boolean z) {
        this.u.e(Boolean.valueOf(z));
        S();
    }

    public final void E() {
        U(bg.f41078a);
    }

    public final void F(jc jcVar) {
        h.g.b.x.f(jcVar, "params");
        com.waze.c.b.h hVar = new com.waze.c.b.h(jcVar.c(), jcVar.d(), jcVar.b(), null, ((ar) h.a.i.P(jcVar.c().f())).a());
        com.waze.bp.i iVar = this.f21343g;
        iVar.f(hVar);
        this.t = jcVar.a();
        dk dkVarC = jcVar.c();
        List<ar> listF = dkVarC.f();
        ArrayList arrayList = new ArrayList(h.a.i.q(listF, 10));
        for (ar arVar : listF) {
            bi biVarW = W(arVar);
            List listN = arVar.n();
            boolean z = arVar.h() != null;
            boolean zIsEmpty = true ^ at.r(arVar, this.f21342f, this.f21340d).isEmpty();
            arVar.i();
            arrayList.add(new bj(biVarW, listN, z, zIsEmpty, arVar.D(), arVar.F(), arVar.m(), arVar.q()));
        }
        bl blVar = this.f21345i;
        blVar.D(arrayList, dkVarC.h(), dkVarC.e());
        ah ahVar = this.t;
        bg bgVar = bg.f41078a;
        Object objD = iVar.e().d();
        com.waze.c.b.h hVar2 = objD instanceof com.waze.c.b.h ? (com.waze.c.b.h) objD : null;
        if (hVar2 != null) {
            ((dk) hVar2.c()).c();
            ap.n(blVar, ahVar, hVar2.a(), 0L, true, true, hVar2.e(), bgVar, com.b.b.a.u.g(this.o), null, 1024);
        }
        bk bkVar = bk.f41093a;
        Object objD2 = iVar.e().d();
        com.waze.c.b.h hVar3 = objD2 instanceof com.waze.c.b.h ? (com.waze.c.b.h) objD2 : null;
        if (hVar3 == null) {
            return;
        }
        int i2 = fj.f21640a;
        V((ar) ((dk) hVar3.c()).f().get(fj.b(((dk) hVar3.c()).f(), hVar3.a())), bkVar);
    }

    public final void G() {
        this.p.setCurrentState(Lifecycle.State.CREATED);
        t tVar = new t(this, (h.c.e) null, 1, (byte[]) null);
        kotlinx.coroutines.af afVar = this.f21347k;
        aj.z(afVar, null, null, tVar, 3);
        aj.z(afVar, null, null, new s(this, null), 3);
        aj.z(afVar, null, null, new t(this, null, 0), 3);
        aj.z(afVar, null, null, new t(this, (h.c.e) null, 2, (char[]) null), 3);
        aj.z(afVar, null, null, new t(this, (h.c.e) null, 3, (short[]) null), 3);
        aj.z(afVar, null, null, new w(this, new aq(), null), 3);
    }

    public final void H() {
        aj.z(this.f21347k, null, null, new t(this, (h.c.e) null, 5, (boolean[]) null), 3);
    }

    public final void I() {
        boolean z;
        Object objD = this.f21343g.e().d();
        com.waze.c.b.h hVar = objD instanceof com.waze.c.b.h ? (com.waze.c.b.h) objD : null;
        if (hVar == null) {
            return;
        }
        T(bb.f41050g, null);
        List listF = ((dk) hVar.c()).f();
        boolean z2 = true;
        if ((listF instanceof Collection) && listF.isEmpty()) {
            z = false;
        } else {
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                if (((ar) it.next()).h() != null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List listF2 = ((dk) hVar.c()).f();
        if ((listF2 instanceof Collection) && listF2.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = listF2.iterator();
            while (it2.hasNext()) {
                if (((ar) it2.next()).i().longValue() > 0) {
                    break;
                }
            }
            z2 = false;
        }
        this.f21337a.H(new com.waze.car_lib.f.q(z, z2));
        this.f21345i.p(z, z2);
        S();
    }

    public final void J() {
        this.f21344h.a().z();
        S();
    }

    public final void K() {
        this.f21344h.a().A();
        S();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.p;
    }

    public final ch s() {
        return this.w;
    }

    public final void x() {
        T(bb.m, null);
        this.f21337a.H(com.waze.car_lib.f.o.f19772a);
        S();
    }

    public final void y() {
        T(bb.f41051h, null);
        H();
        this.f21337a.H(com.waze.car_lib.f.i.f19691a);
    }

    public final void z(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            return;
        }
        Object objD = this.f21343g.e().d();
        com.waze.c.b.h hVar = objD instanceof com.waze.c.b.h ? (com.waze.c.b.h) objD : null;
        if (hVar != null) {
            List listSubList = ((dk) hVar.c()).f().subList(i2, i3);
            ArrayList arrayList = new ArrayList(h.a.i.q(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ar) it.next()).a()));
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f21345i.q(arrayList2);
        }
    }
}
