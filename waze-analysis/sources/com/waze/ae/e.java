package com.waze.ae;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapLine;
import com.waze.jni.protos.map.MapLineIntersectionMetadata;
import com.waze.map.ag;
import com.waze.map.ah;
import com.waze.map.cc;
import com.waze.modules.c.ap;
import com.waze.modules.c.cf;
import h.g.b.x;
import h.i;
import i.a.a.g;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class e {
    public /* synthetic */ e(byte[] bArr) {
    }

    public static void a(am amVar, Lifecycle lifecycle, a aVar) {
        x.f(amVar, "deferred");
        x.f(lifecycle, "lifecycle");
        x.f(aVar, "callback");
        k kVarE = ai.E(new b(amVar, null));
        x.f(kVarE, "flow");
        x.f(lifecycle, "lifecycle");
        x.f(aVar, "callback");
        b(kVarE, LifecycleKt.getCoroutineScope(lifecycle), aVar);
    }

    public static void b(k kVar, af afVar, a aVar) {
        x.f(kVar, "flow");
        x.f(afVar, "scope");
        x.f(aVar, "callback");
        aj.z(afVar, null, null, new d(kVar, aVar, null), 3);
    }

    public static /* synthetic */ ah d(MapLineIntersectionMetadata mapLineIntersectionMetadata) {
        Position.IntPosition coordinate = mapLineIntersectionMetadata.getCoordinate();
        x.e(coordinate, "getCoordinate(...)");
        com.waze.shared_infra.h.c cVarA = cc.a(coordinate);
        MapLine mapLine = mapLineIntersectionMetadata.getMapLine();
        x.e(mapLine, "getMapLine(...)");
        return new ah(cVarA, i(mapLine), mapLineIntersectionMetadata.getAzimuth(), mapLineIntersectionMetadata.getDistanceMeters());
    }

    public static ap e(g gVar) {
        x.f(gVar, "<this>");
        switch (gVar) {
            case STREET:
                return ap.f29859a;
            case HIGHWAY:
                return ap.f29860b;
            case FREEWAY:
                return ap.f29861c;
            case RAMP:
                return ap.f29862d;
            case TRAIL:
                return ap.f29863e;
            case PRIMARY:
                return ap.f29864f;
            case SECONDARY:
                return ap.f29865g;
            case _4X4:
                return ap.f29866h;
            case WALKWAY:
                return ap.f29867i;
            case PEDESTRIAN:
                return ap.f29868j;
            case EXIT:
                return ap.f29869k;
            case _4X4_TRAIL:
                return ap.f29870l;
            case FERRY_CROSSING:
                return ap.m;
            case STAIRWAY:
                return ap.n;
            case PRIVATE:
                return ap.o;
            case RAILROAD:
                return ap.p;
            case RUNWAY:
                return ap.q;
            case PARKING:
                return ap.r;
            case SERVICEROAD:
                return ap.s;
            case ALLEY:
                return ap.t;
            case ARTIFICIAL_CONNECTOR:
                return ap.u;
            case SHORT_CUT:
                return ap.v;
            case IGNORE_SEGMENT:
                return ap.w;
            case END:
                return ap.x;
            default:
                throw new i();
        }
    }

    public static com.waze.modules.c.aj g(cf cfVar) {
        x.f(cfVar, "<this>");
        return new com.waze.modules.c.aj(cfVar.d(), cfVar.c().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ag i(MapLine mapLine) {
        int tileId = mapLine.getTileId();
        int lineId = mapLine.getLineId();
        boolean reversed = mapLine.getReversed();
        Position.IntPosition centerPosition = mapLine.getCenterPosition();
        x.e(centerPosition, "getCenterPosition(...)");
        com.waze.shared_infra.h.c cVarA = cc.a(centerPosition);
        List<Position.IntPosition> positionsList = mapLine.getPositionsList();
        x.e(positionsList, "getPositionsList(...)");
        List<Position.IntPosition> list = positionsList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (Position.IntPosition intPosition : list) {
            x.c(intPosition);
            arrayList.add(cc.a(intPosition));
        }
        return new ag(lineId, tileId, reversed, cVarA, arrayList);
    }

    public com.waze.modules.c.d f() {
        throw null;
    }

    public e h() {
        throw null;
    }

    private e() {
        throw null;
    }
}
