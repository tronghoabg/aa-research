package com.waze.main_screen.p;

import androidx.compose.animation.core.Animatable;
import com.waze.c.e.cd;
import com.waze.navigate.ej;
import com.waze.navigate.ek;
import com.waze.navigate.el;
import com.waze.navigate.em;
import com.waze.navigate.et;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aq implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27043a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27044b;

    aq(Object obj, int i2) {
        this.f27044b = i2;
        this.f27043a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        Object objD2;
        bm bmVarM;
        switch (this.f27044b) {
            case 0:
                ((bf) this.f27043a).u().t();
                return h.ab.f48028a;
            case 1:
                a.a.q(this.f27043a).invoke(true);
                return h.ab.f48028a;
            case 2:
                ((com.waze.main_screen.m.p) this.f27043a).d(new com.waze.main_screen.m.e(((Number) obj).intValue()));
                return h.ab.f48028a;
            case 3:
                ((com.waze.main_screen.m.p) this.f27043a).d(new com.waze.main_screen.m.c(((Number) obj).intValue()));
                return h.ab.f48028a;
            case 4:
                Object objAnimateTo$default = Animatable.animateTo$default((Animatable) this.f27043a, new Integer(((com.waze.map.main.aa) obj).a()), com.waze.z.a.aa.c(com.waze.z.a.x.f46210a), null, new com.waze.main_screen.l.a(15), eVar, 4, null);
                return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
            case 5:
                ((bf) this.f27043a).v().b((com.waze.map.main.aa) obj);
                return h.ab.f48028a;
            case 6:
                cd cdVar = (cd) obj;
                kotlinx.coroutines.b.bn bnVar = ((bs) this.f27043a).H;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, bm.m((bm) objD, null, null, null, null, null, null, null, null, null, null, cdVar != null ? new bl() : null, 2047)));
                return h.ab.f48028a;
            default:
                em emVar = (em) obj;
                kotlinx.coroutines.b.bn bnVar2 = ((bs) this.f27043a).H;
                do {
                    objD2 = bnVar2.d();
                    bmVarM = (bm) objD2;
                    com.waze.map.isolated.k kVarL = bmVarM.l();
                    bj bjVar = kVarL instanceof bj ? (bj) kVarL : null;
                    boolean zA = bjVar != null ? bjVar.a() : false;
                    if (emVar instanceof ej) {
                        bmVarM = bm.m(bmVarM, null, null, null, null, null, null, null, null, null, new bj(zA), null, DisplayStrings.DS_AAOS_TRIP_OVERVIEW_VIEW_ALL_SETTINGS_BUTTON);
                    } else {
                        if (!(emVar instanceof el)) {
                            throw new h.i();
                        }
                        el elVar = (el) emVar;
                        if ((!et.p(elVar) && !zA) || elVar.a() == ek.f31316c || elVar.a() == ek.f31320g) {
                            bmVarM = bm.m(bmVarM, null, null, null, null, null, null, null, null, null, new bk(elVar.a()), null, DisplayStrings.DS_AAOS_TRIP_OVERVIEW_VIEW_ALL_SETTINGS_BUTTON);
                        }
                    }
                } while (!bnVar2.f(objD2, bmVarM));
                return h.ab.f48028a;
        }
    }
}
