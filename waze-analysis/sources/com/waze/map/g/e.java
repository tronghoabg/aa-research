package com.waze.map.g;

import com.waze.bw.c.d.cf;
import com.waze.map.b.bg;
import com.waze.map.b.ck;
import com.waze.map.b.cl;
import com.waze.map.b.cm;
import com.waze.map.b.cn;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.bw;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29051a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29052b;

    public /* synthetic */ e(boolean z, int i2) {
        this.f29052b = i2;
        this.f29051a = z;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f29052b;
        if (i2 == 0) {
            bg bgVar = (bg) obj;
            h.g.b.x.f(bgVar, "prev");
            com.waze.destination_cell.b.e eVarD = bgVar.d();
            if (eVarD instanceof cn) {
                cn cnVar = (cn) eVarD;
                if (!(cnVar.h() instanceof cm)) {
                    return bg.e(bgVar, cn.j(cnVar, this.f29051a ? ck.f28150a : cl.f28151a, null, 2));
                }
            }
            return null;
        }
        if (i2 == 1) {
            com.waze.navbar.p pVar = (com.waze.navbar.p) obj;
            h.g.b.x.f(pVar, "it");
            if (this.f29051a) {
                pVar.B();
            } else {
                pVar.C(false);
            }
            return ab.f48028a;
        }
        if (i2 == 2) {
            cf cfVar = (cf) obj;
            h.g.b.x.f(cfVar, "it");
            return cf.i(cfVar, null, null, null, null, false, false, this.f29051a, false, DisplayStrings.DS_TRIP_OVERVIEW_LICENSE_PLATE_RESTRICTION_ALERT);
        }
        if (i2 != 3) {
            bw bwVar = (bw) obj;
            h.g.b.x.f(bwVar, "it");
            return bw.y(bwVar, false, this.f29051a, null, null, null, 0L, null, 0L, null, null, false, null, null, null, null, false, 0L, null, 0L, null, null, false, 16777213);
        }
        cf cfVar2 = (cf) obj;
        h.g.b.x.f(cfVar2, "it");
        return cf.i(cfVar2, null, null, null, null, false, this.f29051a, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2);
    }
}
