package com.waze.gas;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import com.waze.map.bi;
import com.waze.map.bj;
import com.waze.map.gu;
import com.waze.modules.c.ax;
import com.waze.modules.c.ay;
import com.waze.modules.c.az;
import com.waze.modules.c.ba;
import com.waze.modules.c.bb;
import com.waze.modules.c.bc;
import com.waze.modules.c.bd;
import com.waze.modules.c.be;
import com.waze.modules.c.bf;
import com.waze.modules.c.bg;
import com.waze.modules.c.bh;
import com.waze.modules.c.bk;
import com.waze.modules.c.bl;
import com.waze.modules.c.bm;
import com.waze.modules.c.bn;
import com.waze.modules.c.bo;
import com.waze.modules.c.bp;
import com.waze.modules.c.bq;
import com.waze.modules.c.br;
import com.waze.modules.c.bs;
import com.waze.modules.c.bt;
import com.waze.modules.c.bu;
import com.waze.modules.c.bv;
import com.waze.modules.c.bw;
import com.waze.modules.c.bx;
import com.waze.modules.c.by;
import com.waze.modules.c.bz;
import com.waze.modules.c.ca;
import com.waze.modules.c.cb;
import com.waze.modules.c.cg;
import com.waze.modules.c.du;
import com.waze.modules.c.dv;
import com.waze.modules.c.eb;
import com.waze.navigate.AddressItem;
import com.waze.notifications.c.k;
import com.waze.reports.ed;
import com.waze.shared_infra.i.h;
import h.g.b.x;
import h.i;
import java.util.Iterator;
import l.a.awg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class a {
    public /* synthetic */ a() {
    }

    public static bj a(MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo) {
        String strS;
        String str;
        String str2;
        String str3;
        String str4;
        AddressItem addressItem;
        bi biVar;
        Object next;
        x.f(detailsPopupInfo, "<this>");
        if (detailsPopupInfo.hasVenue()) {
            ed edVar = new ed(detailsPopupInfo.getVenue());
            String strP = edVar.p();
            String strN = edVar.n();
            String strZ = edVar.z();
            String strR = edVar.r();
            strS = edVar.s();
            str = strP;
            str2 = strN;
            str3 = strZ;
            str4 = strR;
        } else {
            strS = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        AddressItem addressItem2 = new AddressItem(Integer.valueOf(detailsPopupInfo.getCoordinate().getLongitude()), Integer.valueOf(detailsPopupInfo.getCoordinate().getLatitude()), detailsPopupInfo.getTitle(), detailsPopupInfo.getMsg(), null, null, null, null, null, null, null, strS, str, null, str2, str3, str4, detailsPopupInfo.getVenue().toByteArray(), null);
        addressItem2.mIsNavigable = true;
        addressItem2.mPreviewIcon = detailsPopupInfo.getPreviewIcon();
        String poiInfoUrl = detailsPopupInfo.getPoiInfoUrl();
        if (true != detailsPopupInfo.hasPoiInfoUrl()) {
            poiInfoUrl = null;
        }
        addressItem2.setAdvertiserData(poiInfoUrl, null, 0, null);
        addressItem2.setAddress(detailsPopupInfo.getMsg());
        if (detailsPopupInfo.hasVenueOriginal()) {
            ed edVar2 = new ed(detailsPopupInfo.getVenueOriginal());
            addressItem = new AddressItem(Integer.valueOf(edVar2.b()), Integer.valueOf(edVar2.a()), edVar2.t(), edVar2.l(), null, null, null, null, null, null, null, edVar2.s(), edVar2.p(), edVar2.y(), edVar2.n(), edVar2.z(), edVar2.r(), edVar2.an(), edVar2.x());
        } else {
            addressItem = null;
        }
        MapPopupNativeInfo.Style style = detailsPopupInfo.getStyle();
        MapPopupNativeInfo.Style style2 = MapPopupNativeInfo.Style.STYLE_UNKNOWN;
        int iOrdinal = style.ordinal();
        if (iOrdinal == 0) {
            h.c("unknown style from native layer: " + detailsPopupInfo.getStyle() + ", defaulting to small");
            biVar = bi.f28398a;
        } else if (iOrdinal == 1) {
            biVar = bi.f28398a;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new i();
            }
            h.c("unknown style from native layer: " + detailsPopupInfo.getStyle() + ", defaulting to small");
            biVar = bi.f28398a;
        } else {
            biVar = bi.f28399b;
        }
        bi biVar2 = biVar;
        String title = detailsPopupInfo.getTitle();
        String str5 = (title == null || !detailsPopupInfo.hasTitle()) ? null : title;
        String msg = detailsPopupInfo.getMsg();
        x.e(msg, "getMsg(...)");
        String info = detailsPopupInfo.getInfo();
        String str6 = (info == null || !detailsPopupInfo.hasInfo()) ? null : info;
        boolean loader = detailsPopupInfo.getLoader();
        com.waze.aj.b bVar = gu.n;
        MapPopupNativeInfo.WazeUiMapPopupType type = detailsPopupInfo.getType();
        x.e(type, "getType(...)");
        x.f(type, "nativeValue");
        Iterator<E> it = gu.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((gu) next).a() == type) {
                break;
            }
        }
        gu guVar = (gu) next;
        if (guVar == null) {
            h.c("unknown proto type " + type + ", defaulting to NONE");
            guVar = gu.f29181a;
        }
        gu guVar2 = guVar;
        Position.IntPosition coordinate = detailsPopupInfo.getCoordinate();
        x.e(coordinate, "getCoordinate(...)");
        com.waze.shared_infra.h.c cVarI = k.i(coordinate);
        String poiInfoUrl2 = detailsPopupInfo.getPoiInfoUrl();
        String str7 = (poiInfoUrl2 == null || !detailsPopupInfo.hasPoiInfoUrl()) ? null : poiInfoUrl2;
        String previewIcon = detailsPopupInfo.getPreviewIcon();
        String str8 = (previewIcon == null || !detailsPopupInfo.hasPreviewIcon()) ? null : previewIcon;
        Integer numValueOf = Integer.valueOf(detailsPopupInfo.getWalkingDistanceMeters());
        numValueOf.intValue();
        if (true != detailsPopupInfo.hasWalkingDistanceMeters()) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        Integer numValueOf2 = Integer.valueOf(detailsPopupInfo.getTimeoutSeconds());
        numValueOf2.intValue();
        Integer num = true == detailsPopupInfo.hasTimeoutSeconds() ? numValueOf2 : null;
        return new bj(str5, msg, str6, loader, guVar2, cVarI, str7, str8, addressItem2, addressItem, iIntValue, num != null ? num.intValue() : -1, biVar2);
    }

    public static br b(by byVar) {
        x.f(byVar, "<this>");
        if (byVar instanceof br) {
            return (br) byVar;
        }
        if (byVar instanceof bt) {
            return ((bt) byVar).b();
        }
        if (byVar instanceof bv) {
            return ((bv) byVar).c();
        }
        if (byVar instanceof bx) {
            return ((bx) byVar).a();
        }
        if (x.n(byVar, bp.f29917a) || (byVar instanceof bq) || (byVar instanceof bs) || x.n(byVar, bu.f29925a) || (byVar instanceof bw)) {
            return null;
        }
        throw new i();
    }

    public static String c(cg cgVar) {
        x.f(cgVar, "<this>");
        cg cgVar2 = cg.f29948a;
        int iOrdinal = cgVar.ordinal();
        if (iOrdinal == 0) {
            return "TRIP_OVERVIEW";
        }
        if (iOrdinal == 1) {
            return "ALTERNATE_ROUTES";
        }
        if (iOrdinal == 2) {
            return "PARKING_ETA";
        }
        if (iOrdinal == 3) {
            return "CRISIS_RESPONSE_ETA";
        }
        if (iOrdinal == 4) {
            return "PARKING_ETA";
        }
        throw new i();
    }

    public static String d(eb ebVar) {
        if (ebVar instanceof dv) {
            return ((dv) ebVar).a().j();
        }
        if (ebVar instanceof du) {
            return ((du) ebVar).a().a();
        }
        if (ebVar == null) {
            return null;
        }
        throw new i();
    }

    public static awg e(eb ebVar) {
        x.f(ebVar, "<this>");
        if (x.n(ebVar, az.f29899a)) {
            return awg.ROUTE_INSIGHT_INTERNATIONAL;
        }
        if (x.n(ebVar, bb.f29902a)) {
            return awg.ROUTE_INSIGHT_DANGER_ZONE;
        }
        if (x.n(ebVar, be.f29905a)) {
            return awg.ROUTE_INSIGHT_FERRY;
        }
        if (ebVar instanceof bg) {
            return awg.ROUTE_INSIGHT_RESTRICTED_BY_LICENSE_PLATE;
        }
        if (ebVar instanceof bh) {
            return awg.ROUTE_INSIGHT_ENCOURAGEMENT;
        }
        if (x.n(ebVar, com.waze.modules.c.bj.f29911a)) {
            return awg.ROUTE_INSIGHT_INVALID_FOR_PRIVATE_VEHICLE;
        }
        if (ebVar instanceof bk) {
            return awg.ROUTE_INSIGHT_RESTRICTED_ZONE;
        }
        if (ebVar instanceof by) {
            return awg.ROUTE_INSIGHT_TOLL;
        }
        if (x.n(ebVar, ax.f29897a)) {
            return awg.ROUTE_INSIGHT_BEACONS;
        }
        if (x.n(ebVar, ay.f29898a)) {
            return awg.ROUTE_INSIGHT_BLOCKED;
        }
        if (x.n(ebVar, ba.f29901a)) {
            return awg.ROUTE_INSIGHT_BYPASSES_RESTRICTED;
        }
        if (x.n(ebVar, bc.f29903a)) {
            return awg.ROUTE_INSIGHT_DANGEROUS_TURN;
        }
        if (x.n(ebVar, bd.f29904a)) {
            return awg.ROUTE_INSIGHT_ETA_FROM_ML;
        }
        if (ebVar instanceof bf) {
            return awg.ROUTE_INSIGHT_HOV;
        }
        if (x.n(ebVar, com.waze.modules.c.bi.f29910a)) {
            return awg.ROUTE_INSIGHT_PRIMARY_FOR_AVOIDERS;
        }
        if (x.n(ebVar, bn.f29915a)) {
            return awg.ROUTE_INSIGHT_SCHOOL_ZONE;
        }
        if (x.n(ebVar, bo.f29916a)) {
            return awg.ROUTE_INSIGHT_STEPPED_ON_IT;
        }
        if (x.n(ebVar, bz.f29933a)) {
            return awg.ROUTE_INSIGHT_TOLL_FOR_AVOIDERS;
        }
        if (x.n(ebVar, ca.f29935a)) {
            return awg.ROUTE_INSIGHT_UNNATURAL;
        }
        if (x.n(ebVar, cb.f29936a)) {
            return awg.ROUTE_INSIGHT_UNPAVED;
        }
        if (x.n(ebVar, bm.f29914a)) {
            return awg.ROUTE_INSIGHT_SAFETY_INCIDENT;
        }
        if (x.n(ebVar, bl.f29913a)) {
            return awg.ROUTE_INSIGHT_BYPASSES_SAFETY_INCIDENT;
        }
        throw new i();
    }

    public /* synthetic */ a(byte[] bArr, byte[] bArr2) {
    }
}
