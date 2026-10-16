package com.waze.car_lib.j;

import androidx.camera.video.AudioStats;
import androidx.car.app.model.Distance;
import com.waze.modules.navigation.ao;
import com.waze.modules.navigation.as;
import com.waze.modules.navigation.at;
import com.waze.modules.navigation.bk;
import com.waze.modules.navigation.bq;
import com.waze.modules.navigation.br;
import com.waze.navigate.de;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20202a = new d();

    public static final Distance a(de deVar) {
        int i2 = 1;
        if (deVar == null) {
            Distance distanceCreate = Distance.create(AudioStats.AUDIO_AMPLITUDE_NONE, 1);
            h.g.b.x.e(distanceCreate, "create(...)");
            return distanceCreate;
        }
        double dA = deVar.a();
        com.waze.sharedui.utils.d dVarC = deVar.c();
        com.waze.sharedui.utils.d dVar = com.waze.sharedui.utils.d.KILOMETER;
        int iOrdinal = dVarC.ordinal();
        if (iOrdinal == 0) {
            i2 = 2;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i2 = 4;
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                i2 = 6;
            }
        }
        Distance distanceCreate2 = Distance.create(dA, i2);
        h.g.b.x.e(distanceCreate2, "create(...)");
        return distanceCreate2;
    }

    public static final void b(com.waze.car_lib.f.a aVar, com.waze.av.b.n nVar, com.waze.modules.navigation.ah ahVar, at atVar) {
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(ahVar, "caller");
        com.waze.modules.navigation.ai aiVar = new com.waze.modules.navigation.ai(nVar);
        if (atVar == null) {
            atVar = at.f30323c;
        }
        c(aVar, new br(new ao(ahVar, aiVar, null, false, atVar, null, false, null, 236)));
    }

    public static final void c(com.waze.car_lib.f.a aVar, com.waze.av.d.t tVar) {
        br brVar;
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(tVar, "startNavigationEvent");
        boolean z = tVar instanceof bq;
        bk bkVarF = aVar.f();
        if (z) {
            bq bqVar = (bq) tVar;
            brVar = new bq(ao.i(bqVar.e(), false, null, d(aVar), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2), bqVar.i());
        } else {
            if (!(tVar instanceof br)) {
                throw new h.i();
            }
            brVar = new br(ao.i(((br) tVar).e(), false, null, d(aVar), DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_2));
        }
        bkVarF.a(brVar);
    }

    private static final as d(com.waze.car_lib.f.a aVar) {
        return com.waze.car_lib.r.bq.i(aVar.a()) ? as.f30319c : as.f30318b;
    }
}
