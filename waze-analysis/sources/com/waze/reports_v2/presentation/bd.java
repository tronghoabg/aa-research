package com.waze.reports_v2.presentation;

import android.os.Parcelable;
import com.waze.R;
import com.waze.reports_v2.c.dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd implements bb {

    /* renamed from: a, reason: collision with root package name */
    private final dp f34847a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.alerters.a f34848b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f34849c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f34850d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f34851e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f34852f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f34853g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f34854h;

    public bd(dp dpVar, com.waze.alerters.a aVar) {
        Object objPut;
        h.g.b.x.f(dpVar, "dataProvider");
        h.g.b.x.f(aVar, "config");
        this.f34847a = dpVar;
        this.f34848b = aVar;
        Map mapC = h.a.r.c();
        com.waze.reports_v2.b.q[] qVarArrValues = com.waze.reports_v2.b.q.values();
        int length = qVarArrValues.length;
        int i2 = 0;
        while (true) {
            int i3 = R.drawable.icon_report_animal_vector;
            if (i2 >= length) {
                Map mapB = h.a.r.b(mapC);
                this.f34849c = mapB;
                Set<Map.Entry> setEntrySet = mapB.entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(setEntrySet, 10)), 16));
                for (Map.Entry entry : setEntrySet) {
                    h.k kVar = new h.k(((bc) entry.getValue()).d(), entry.getKey());
                    linkedHashMap.put(kVar.c(), kVar.d());
                }
                this.f34850d = linkedHashMap;
                Map mapC2 = h.a.r.c();
                for (com.waze.reports_v2.b.ad adVar : com.waze.reports_v2.b.ad.values()) {
                    Parcelable.Creator<com.waze.reports_v2.b.at> creator = com.waze.reports_v2.b.at.CREATOR;
                    switch (adVar.ordinal()) {
                        case 0:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43671a, R.drawable.icon_report_map_issue_vector, R.string.MAP_ISSUE_REPORT_MENU_ITEM));
                            break;
                        case 1:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43672b, R.drawable.icon_report_assistance_vector, R.string.REPORT_MENU_V2_ROADSIDE_HELP_REPORT_LABEL));
                            break;
                        case 2:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43673c, R.drawable.icon_report_gas_prices_vector, R.string.REPORT_MENU_V2_GAS_REPORT_LABEL));
                            break;
                        case 3:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43674d, R.drawable.icon_report_closure_vector, R.string.CLOSURE_REPORT_MENU_ITEM));
                            break;
                        case 4:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43675e, R.drawable.icon_report_map_chat_vector, R.string.MAP_CHAT_REPORT_MENU_ITEM));
                            break;
                        case 5:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43676f, R.drawable.icon_report_debug_vector, R.string.DEBUG_REPORT_MENU_ITEM));
                            break;
                        case 6:
                            objPut = mapC2.put(adVar, new com.waze.ui.w.b.at(com.waze.ui.w.b.bi.f43677g, R.drawable.icon_report_places_vector, R.string.REPORT_MENU_V2_ADD_PLACE_LABEL));
                            break;
                        default:
                            throw new h.i();
                    }
                }
                Map mapB2 = h.a.r.b(mapC2);
                this.f34851e = mapB2;
                Set<Map.Entry> setEntrySet2 = mapB2.entrySet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(setEntrySet2, 10)), 16));
                for (Map.Entry entry2 : setEntrySet2) {
                    h.k kVar2 = new h.k(((com.waze.ui.w.b.at) entry2.getValue()).c(), entry2.getKey());
                    linkedHashMap2.put(kVar2.c(), kVar2.d());
                }
                this.f34852f = linkedHashMap2;
                Map mapC3 = h.a.r.c();
                for (com.waze.reports_v2.b.at atVar : com.waze.reports_v2.b.at.b()) {
                    switch (atVar.ordinal()) {
                        case 0:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.f43679a, R.drawable.icon_report_traffic_vector, R.string.REPORT_MENU_V2_TRAFFIC_DEFAULT_LABEL, com.waze.ui.w.b.bh.f43660a));
                            break;
                        case 1:
                            com.waze.ui.w.b.bj bjVar = com.waze.ui.w.b.bj.f43680b;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar, R.drawable.icon_report_traffic_standstill_vector, R.string.REPORT_MENU_V2_TRAFFIC_STANDSTILL_LABEL, bjVar));
                            break;
                        case 2:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.f43681c, R.drawable.icon_report_police_vector, R.string.REPORT_MENU_V2_POLICE_DEFAULT_LABEL, com.waze.ui.w.b.bh.f43661b));
                            break;
                        case 3:
                            com.waze.ui.w.b.bj bjVar2 = com.waze.ui.w.b.bj.f43682d;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar2, R.drawable.icon_report_police_hidden_vector, R.string.REPORT_MENU_V2_POLICE_HIDDEN_LABEL, bjVar2));
                            continue;
                        case 4:
                            com.waze.ui.w.b.bj bjVar3 = com.waze.ui.w.b.bj.f43684f;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar3, R.drawable.icon_report_police_mobile_camera_vector, R.string.REPORT_MENU_V2_POLICE_MOBILE_CAMERA_LABEL, bjVar3));
                            continue;
                        case 5:
                            com.waze.ui.w.b.bj bjVar4 = com.waze.ui.w.b.bj.f43683e;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar4, true != this.f34847a.e() ? R.drawable.icon_report_police_other_side_rht_vector : R.drawable.icon_report_police_other_side_lht_vector, R.string.REPORT_MENU_V2_REPORT_OTHER_SIDE, bjVar4));
                            continue;
                        case 6:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.f43685g, R.drawable.icon_report_accident_vector, R.string.REPORT_MENU_V2_CRASH_DEFAULT_LABEL, com.waze.ui.w.b.bh.f43662c));
                            continue;
                        case 7:
                            com.waze.ui.w.b.bj bjVar5 = com.waze.ui.w.b.bj.f43686h;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar5, R.drawable.icon_report_accident_major_vector, R.string.REPORT_MENU_V2_CRASH_PILE_UP_LABEL, bjVar5));
                            continue;
                        case 8:
                            com.waze.ui.w.b.bj bjVar6 = com.waze.ui.w.b.bj.f43687i;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar6, true != this.f34847a.e() ? R.drawable.icon_report_accident_other_side_rht_vector : R.drawable.icon_report_accident_other_side_lht_vector, R.string.REPORT_MENU_V2_REPORT_OTHER_SIDE, bjVar6));
                            continue;
                        case 9:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.f43688j, R.drawable.icon_report_hazard_vector, R.string.REPORT_MENU_V2_HAZARD_DEFAULT_LABEL, com.waze.ui.w.b.bh.f43663d));
                            continue;
                        case 10:
                            com.waze.ui.w.b.bj bjVar7 = com.waze.ui.w.b.bj.f43689k;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar7, R.drawable.icon_report_hazard_broken_light_vector, R.string.REPORT_MENU_V2_HAZARD_BROKEN_TRAFFIC_LIGHT_LABEL, bjVar7));
                            continue;
                        case 11:
                            com.waze.ui.w.b.bj bjVar8 = com.waze.ui.w.b.bj.f43690l;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar8, R.drawable.icon_report_hazard_pothole_vector, R.string.REPORT_MENU_V2_HAZARD_POTHOLE_LABEL, bjVar8));
                            continue;
                        case 12:
                            com.waze.ui.w.b.bj bjVar9 = com.waze.ui.w.b.bj.m;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar9, R.drawable.icon_report_hazard_object_vector, R.string.REPORT_MENU_V2_HAZARD_OBJECT_LABEL, bjVar9));
                            continue;
                        case 13:
                            com.waze.ui.w.b.bj bjVar10 = com.waze.ui.w.b.bj.n;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar10, R.drawable.icon_report_hazard_vehicle_stopped_vector, R.string.REPORT_MENU_V2_HAZARD_VEHICLE_STOPPED_LABEL, bjVar10));
                            continue;
                        case 14:
                            com.waze.ui.w.b.bj bjVar11 = com.waze.ui.w.b.bj.o;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar11, R.drawable.icon_report_hazard_construction_vector, R.string.REPORT_MENU_V2_HAZARD_CONSTRUCTION_LABEL, bjVar11));
                            continue;
                        case 15:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.p, R.drawable.icon_report_weather_vector, R.string.REPORT_MENU_V2_WEATHER_BAD_WEATHER_LABEL, com.waze.ui.w.b.bh.f43664e));
                            continue;
                        case 16:
                            com.waze.ui.w.b.bj bjVar12 = com.waze.ui.w.b.bj.q;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar12, R.drawable.icon_report_hazard_weather_flood_vector, R.string.REPORT_MENU_V2_WEATHER_FLOOD_LABEL, bjVar12));
                            continue;
                        case 17:
                            com.waze.ui.w.b.bj bjVar13 = com.waze.ui.w.b.bj.r;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar13, R.drawable.icon_report_hazard_weather_slippery_road_vector, R.string.REPORT_MENU_V2_WEATHER_SLIPPERY_ROAD_LABEL, bjVar13));
                            continue;
                        case 18:
                            com.waze.ui.w.b.bj bjVar14 = com.waze.ui.w.b.bj.s;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar14, R.drawable.icon_report_hazard_weather_unplowed_road_vector, R.string.REPORT_MENU_V2_WEATHER_UNPLOWED_ROAD_LABEL, bjVar14));
                            continue;
                        case 19:
                            com.waze.ui.w.b.bj bjVar15 = com.waze.ui.w.b.bj.t;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar15, R.drawable.icon_report_hazard_weather_ice_vector, R.string.REPORT_MENU_V2_WEATHER_ICY_ROAD_LABEL, bjVar15));
                            continue;
                        case 20:
                            com.waze.ui.w.b.bj bjVar16 = com.waze.ui.w.b.bj.u;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar16, R.drawable.icon_report_hazard_weather_fog_vector, R.string.REPORT_MENU_V2_WEATHER_FOG_LABEL, bjVar16));
                            continue;
                        case 21:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.v, g(), R.string.REPORT_MENU_V2_BLOCKED_LANE_DEFAULT_LABEL, com.waze.ui.w.b.bh.f43665f));
                            continue;
                        case 22:
                            com.waze.alerters.a aVar2 = this.f34848b;
                            com.waze.ui.w.b.bj bjVar17 = com.waze.ui.w.b.bj.w;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar17, true != aVar2.a() ? R.drawable.icon_report_blocked_lane_left_vector : R.drawable.icon_report_blocked_lane_left_vector_with_lane, R.string.REPORT_MENU_V2_BLOCKED_LANE_LEFT_LABEL, bjVar17));
                            continue;
                        case 23:
                            com.waze.alerters.a aVar3 = this.f34848b;
                            com.waze.ui.w.b.bj bjVar18 = com.waze.ui.w.b.bj.x;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar18, true != aVar3.a() ? R.drawable.icon_report_blocked_lane_center_vector : R.drawable.icon_report_blocked_lane_center_vector_with_lane, R.string.REPORT_MENU_V2_BLOCKED_LANE_CENTER_LABEL, bjVar18));
                            continue;
                        case 24:
                            com.waze.alerters.a aVar4 = this.f34848b;
                            com.waze.ui.w.b.bj bjVar19 = com.waze.ui.w.b.bj.y;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar19, true != aVar4.a() ? R.drawable.icon_report_blocked_lane_right_vector : R.drawable.icon_report_blocked_lane_right_vector_with_lane, R.string.REPORT_MENU_V2_BLOCKED_LANE_RIGHT_LABEL, bjVar19));
                            continue;
                        case 25:
                            com.waze.ui.w.b.bj bjVar20 = com.waze.ui.w.b.bj.z;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar20, R.drawable.icon_hazard_weather_hail, R.string.REPORT_MENU_V2_WEATHER_HAIL_LABEL, bjVar20));
                            continue;
                        case 26:
                            com.waze.ui.w.b.bj bjVar21 = com.waze.ui.w.b.bj.A;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar21, R.drawable.icon_report_hazard_animals, R.string.REPORT_MENU_V2_HAZARD_ANIMALS_LABEL, bjVar21));
                            continue;
                        case 27:
                            com.waze.ui.w.b.bj bjVar22 = com.waze.ui.w.b.bj.B;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar22, R.drawable.icon_report_hazard_missingsign, R.string.REPORT_MENU_V2_HAZARD_MISSING_SIGN_LABEL, bjVar22));
                            continue;
                        case 28:
                            com.waze.ui.w.b.bj bjVar23 = com.waze.ui.w.b.bj.C;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar23, R.drawable.icon_report_hazard_roadkill, R.string.REPORT_MENU_V2_HAZARD_ROADKILL_LABEL, bjVar23));
                            continue;
                        case 29:
                            com.waze.ui.w.b.bj bjVar24 = com.waze.ui.w.b.bj.D;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar24, R.drawable.icon_report_hazard_vehicle_stopped_on_shoulder, R.string.REPORT_MENU_V2_HAZARD_SHOULDER_VEHICLE_STOPPED_LABEL, bjVar24));
                            continue;
                        case 30:
                            com.waze.ui.w.b.bj bjVar25 = com.waze.ui.w.b.bj.E;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar25, R.drawable.icon_report_accident_major_vector, R.string.REPORT_MENU_V2_CRASH_MAJOR_LABEL, bjVar25));
                            continue;
                        case 31:
                            com.waze.ui.w.b.bj bjVar26 = com.waze.ui.w.b.bj.F;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar26, R.drawable.icon_report_accident_minor_vector, R.string.REPORT_MENU_V2_CRASH_MINOR_LABEL, bjVar26));
                            continue;
                        case 32:
                            com.waze.ui.w.b.bj bjVar27 = com.waze.ui.w.b.bj.G;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar27, R.drawable.icon_report_traffic_moderate, R.string.REPORT_MENU_V2_MODERATE_TRAFFIC_LABEL, bjVar27));
                            continue;
                        case 33:
                            com.waze.ui.w.b.bj bjVar28 = com.waze.ui.w.b.bj.H;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar28, R.drawable.icon_report_traffic_heavy, R.string.REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL, bjVar28));
                            continue;
                        case 34:
                        case 49:
                        case 35:
                            com.waze.ui.w.b.bj bjVar29 = com.waze.ui.w.b.bj.I;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar29, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_GENERAL, bjVar29));
                            continue;
                        case 36:
                            com.waze.ui.w.b.bj bjVar30 = com.waze.ui.w.b.bj.J;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar30, R.drawable.icon_report_incorrect_turn, R.string.REPORT_MENU_MAP_ISSUE_WRONG_TURN, bjVar30));
                            continue;
                        case 37:
                            com.waze.ui.w.b.bj bjVar31 = com.waze.ui.w.b.bj.K;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar31, R.drawable.icon_report_incorrect_address, R.string.REPORT_MENU_MAP_ISSUE_WRONG_ADDRESS, bjVar31));
                            continue;
                        case 38:
                            com.waze.ui.w.b.bj bjVar32 = com.waze.ui.w.b.bj.L;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar32, R.drawable.icon_report_incorrect_route, R.string.REPORT_MENU_MAP_ISSUE_WRONG_ROUTE, bjVar32));
                            continue;
                        case 39:
                            com.waze.ui.w.b.bj bjVar33 = com.waze.ui.w.b.bj.M;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar33, R.drawable.icon_report_missing_roundabout, R.string.REPORT_MENU_MAP_ISSUE_NO_ROUNDABOUT, bjVar33));
                            continue;
                        case 40:
                            com.waze.ui.w.b.bj bjVar34 = com.waze.ui.w.b.bj.N;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar34, R.drawable.icon_report_missing_road, R.string.REPORT_MENU_MAP_ISSUE_NO_ROAD, bjVar34));
                            continue;
                        case 41:
                            com.waze.ui.w.b.bj bjVar35 = com.waze.ui.w.b.bj.O;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar35, R.drawable.map_issue_incorrect_turn, R.string.REPORT_MENU_MAP_ISSUE_TURN_NOT_ALLOWED, bjVar35));
                            continue;
                        case 42:
                            com.waze.ui.w.b.bj bjVar36 = com.waze.ui.w.b.bj.P;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar36, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_INCORRECT_JUNCTION, bjVar36));
                            continue;
                        case 43:
                            com.waze.ui.w.b.bj bjVar37 = com.waze.ui.w.b.bj.Q;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar37, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS, bjVar37));
                            continue;
                        case 44:
                            com.waze.ui.w.b.bj bjVar38 = com.waze.ui.w.b.bj.R;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar38, R.drawable.map_issue_incorrect_route, R.string.REPORT_MENU_MAP_ISSUE_WRONG_DRIVING_DIRECTIONS, bjVar38));
                            continue;
                        case 45:
                            com.waze.ui.w.b.bj bjVar39 = com.waze.ui.w.b.bj.S;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar39, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_MISSING_EXIT, bjVar39));
                            continue;
                        case 46:
                            com.waze.ui.w.b.bj bjVar40 = com.waze.ui.w.b.bj.T;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar40, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_MISPLACED_GAS_STATION, bjVar40));
                            continue;
                        case 47:
                            com.waze.ui.w.b.bj bjVar41 = com.waze.ui.w.b.bj.U;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar41, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_MISSING_LANDMARK, bjVar41));
                            continue;
                        case 48:
                            com.waze.ui.w.b.bj bjVar42 = com.waze.ui.w.b.bj.V;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar42, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_MAP_ISSUE_BLOCKED_ROAD, bjVar42));
                            continue;
                        case 50:
                            mapC3.put(atVar, new com.waze.ui.w.b.au(com.waze.ui.w.b.bj.W, i3, R.string.REPORT_MENU_V2_ANIMAL_DEFAULT_LABEL, com.waze.ui.w.b.bh.f43669j));
                            continue;
                        case 51:
                            com.waze.ui.w.b.bj bjVar43 = com.waze.ui.w.b.bj.X;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar43, R.drawable.icon_report_animal_in_lane_vector, R.string.REPORT_MENU_V2_ANIMAL_IN_LANE_LABEL, bjVar43));
                            continue;
                        case 52:
                            com.waze.ui.w.b.bj bjVar44 = com.waze.ui.w.b.bj.Y;
                            mapC3.put(atVar, new com.waze.ui.w.b.au(bjVar44, R.drawable.icon_report_animal_on_shoulder_vector, R.string.REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL, bjVar44));
                            continue;
                        default:
                            throw new h.i();
                    }
                    i3 = R.drawable.icon_report_animal_vector;
                }
                Map mapB3 = h.a.r.b(mapC3);
                this.f34853g = mapB3;
                Set<Map.Entry> setEntrySet3 = mapB3.entrySet();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(setEntrySet3, 10)), 16));
                for (Map.Entry entry3 : setEntrySet3) {
                    h.k kVar3 = new h.k(((com.waze.ui.w.b.au) entry3.getValue()).c(), entry3.getKey());
                    linkedHashMap3.put(kVar3.c(), kVar3.d());
                }
                this.f34854h = linkedHashMap3;
                return;
            }
            com.waze.reports_v2.b.q qVar = qVarArrValues[i2];
            com.waze.reports_v2.b.ad adVar2 = com.waze.reports_v2.b.ad.f34017a;
            Parcelable.Creator<com.waze.reports_v2.b.at> creator2 = com.waze.reports_v2.b.at.CREATOR;
            switch (qVar.ordinal()) {
                case 0:
                    mapC.put(com.waze.reports_v2.b.q.f34111a, new bc(com.waze.ui.w.b.bh.f43660a, R.drawable.icon_report_traffic_vector, R.string.REPORT_MENU_V2_TRAFFIC_REPORT_LABEL, R.string.REPORT_MENU_V2_TRAFFIC_REPORT_TITLE));
                    break;
                case 1:
                    mapC.put(com.waze.reports_v2.b.q.f34112b, new bc(com.waze.ui.w.b.bh.f43661b, R.drawable.icon_report_police_vector, R.string.REPORT_MENU_V2_POLICE_REPORT_LABEL, R.string.REPORT_MENU_V2_POLICE_REPORT_TITLE));
                    break;
                case 2:
                    mapC.put(com.waze.reports_v2.b.q.f34113c, new bc(com.waze.ui.w.b.bh.f43662c, R.drawable.icon_report_accident_vector, R.string.REPORT_MENU_V2_CRASH_REPORT_LABEL, R.string.REPORT_MENU_V2_CRASH_REPORT_TITLE));
                    break;
                case 3:
                    mapC.put(com.waze.reports_v2.b.q.f34114d, new bc(com.waze.ui.w.b.bh.f43663d, R.drawable.icon_report_hazard_vector, R.string.REPORT_MENU_V2_HAZARD_ON_ROAD_REPORT_LABEL, R.string.REPORT_MENU_V2_HAZARD_REPORT_TITLE));
                    break;
                case 4:
                    mapC.put(com.waze.reports_v2.b.q.f34115e, new bc(com.waze.ui.w.b.bh.f43664e, R.drawable.icon_report_weather_vector, R.string.REPORT_MENU_V2_BAD_WEATHER_REPORT_LABEL, R.string.REPORT_MENU_V2_WEATHER_REPORT_TITLE));
                    break;
                case 5:
                    mapC.put(com.waze.reports_v2.b.q.f34116f, new bc(com.waze.ui.w.b.bh.f43665f, g(), R.string.REPORT_MENU_V2_BLOCKED_LANES_REPORT_LABEL, R.string.REPORT_MENU_V2_BLOCKED_LANE_REPORT_TITLE));
                    break;
                case 6:
                    mapC.put(com.waze.reports_v2.b.q.f34117g, new bc(com.waze.ui.w.b.bh.f43668i, R.drawable.icon_report_map_issue_vector, R.string.REPORT_MENU_V2_MAP_ISSUE_REPORT_LABEL, R.string.REPORT_MENU_V2_MAP_ISSUE_REPORT_TITLE));
                    break;
                case 7:
                    break;
                case 8:
                    mapC.put(com.waze.reports_v2.b.q.f34119i, new bc(com.waze.ui.w.b.bh.f43666g, R.drawable.icon_report_closure_vector, R.string.REPORT_MENU_V2_CLOSURE_REPORT_LABEL, R.string.REPORT_MENU_V2_CLOSURE_REPORT_AHEAD_TITLE));
                    break;
                case 9:
                    mapC.put(com.waze.reports_v2.b.q.f34120j, new bc(com.waze.ui.w.b.bh.f43667h, true != this.f34848b.b() ? R.drawable.icon_alerter_personal_safety_b : R.drawable.icon_alerter_personal_safety_a, R.string.REPORT_MENU_V2_PERSONAL_SAFETY_REPORT_LABEL, R.string.REPORT_MENU_V2_PERSONAL_SAFETY_REPORT_TITLE));
                    break;
                case 10:
                    mapC.put(com.waze.reports_v2.b.q.f34121k, new bc(com.waze.ui.w.b.bh.f43669j, R.drawable.icon_report_animal_vector, R.string.REPORT_MENU_V2_ANIMAL_REPORT_LABEL, R.string.REPORT_MENU_V2_ANIMAL_REPORT_TITLE));
                    break;
                default:
                    throw new h.i();
            }
            i2++;
        }
    }

    private final int g() {
        return this.f34848b.a() ? R.drawable.icon_report_blocked_lane_vector_with_lane : R.drawable.icon_report_blocked_lane_vector;
    }

    private final com.waze.ui.w.b.av h(com.waze.reports_v2.b.q qVar, List list) {
        com.waze.ui.w.b.as asVar;
        bc bcVar = (bc) this.f34849c.get(qVar);
        if (bcVar != null) {
            com.waze.ui.w.b.bh bhVarD = bcVar.d();
            int iA = bcVar.a();
            int iB = bcVar.b();
            int iC = bcVar.c();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.waze.ui.w.b.au auVarE = e((com.waze.reports_v2.b.at) it.next());
                if (auVarE != null) {
                    arrayList.add(auVarE);
                }
            }
            asVar = new com.waze.ui.w.b.as(bhVarD, iA, iB, iC, arrayList);
        } else {
            asVar = null;
        }
        return asVar;
    }

    private final com.waze.ui.w.b.av i(com.waze.reports_v2.b.ad adVar) {
        return (com.waze.ui.w.b.av) this.f34851e.get(adVar);
    }

    @Override // com.waze.bl.c.d.a
    public final com.waze.ui.w.b.bj a(com.waze.reports_v2.b.at atVar) {
        h.g.b.x.f(atVar, "item");
        com.waze.ui.w.b.au auVar = (com.waze.ui.w.b.au) this.f34853g.get(atVar);
        if (auVar != null) {
            return auVar.c();
        }
        return null;
    }

    @Override // com.waze.reports_v2.presentation.bb
    public final com.waze.reports_v2.b.q b(com.waze.ui.w.b.bh bhVar) {
        h.g.b.x.f(bhVar, "uiType");
        return (com.waze.reports_v2.b.q) this.f34850d.get(bhVar);
    }

    @Override // com.waze.reports_v2.presentation.bb
    public final com.waze.reports_v2.b.ad c(com.waze.ui.w.b.bi biVar) {
        h.g.b.x.f(biVar, "uiType");
        return (com.waze.reports_v2.b.ad) this.f34852f.get(biVar);
    }

    @Override // com.waze.reports_v2.presentation.bb
    public final com.waze.reports_v2.b.at d(com.waze.ui.w.b.bj bjVar) {
        h.g.b.x.f(bjVar, "uiType");
        return (com.waze.reports_v2.b.at) this.f34854h.get(bjVar);
    }

    @Override // com.waze.reports_v2.presentation.bb
    public final com.waze.ui.w.b.au e(com.waze.reports_v2.b.at atVar) {
        h.g.b.x.f(atVar, "item");
        return (com.waze.ui.w.b.au) this.f34853g.get(atVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (((com.waze.reports_v2.b.ah) r4).g() == com.waze.reports_v2.b.ad.f34020d) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r4 = r3.f34847a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r4.g() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r4.c() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        return h(com.waze.reports_v2.b.q.f34119i, h.a.i.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        return i(com.waze.reports_v2.b.ad.f34020d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r4 = (com.waze.reports_v2.b.ag) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return h(r4.g(), r4.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if ((r4 instanceof com.waze.reports_v2.b.ah) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return i(((com.waze.reports_v2.b.ah) r4).g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        throw new h.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (((com.waze.reports_v2.b.ag) r4).g() == com.waze.reports_v2.b.q.f34119i) goto L11;
     */
    @Override // com.waze.reports_v2.presentation.bb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.ui.w.b.av f(com.waze.bm.a.a.ad r4) {
        /*
            r3 = this;
            java.lang.String r0 = "item"
            h.g.b.x.f(r4, r0)
            boolean r0 = r4 instanceof com.waze.reports_v2.b.ag
            if (r0 == 0) goto L15
            r1 = r4
            com.waze.reports_v2.b.ag r1 = (com.waze.reports_v2.b.ag) r1
            com.waze.reports_v2.b.q r1 = r1.g()
            com.waze.reports_v2.b.q r2 = com.waze.reports_v2.b.q.f34119i
            if (r1 != r2) goto L44
            goto L24
        L15:
            boolean r1 = r4 instanceof com.waze.reports_v2.b.ah
            if (r1 == 0) goto L6a
            r1 = r4
            com.waze.reports_v2.b.ah r1 = (com.waze.reports_v2.b.ah) r1
            com.waze.reports_v2.b.ad r1 = r1.g()
            com.waze.reports_v2.b.ad r2 = com.waze.reports_v2.b.ad.f34020d
            if (r1 != r2) goto L44
        L24:
            com.waze.reports_v2.c.dp r4 = r3.f34847a
            boolean r0 = r4.g()
            if (r0 == 0) goto L3d
            boolean r4 = r4.c()
            if (r4 == 0) goto L3d
            com.waze.reports_v2.b.q r4 = com.waze.reports_v2.b.q.f34119i
            java.util.List r0 = h.a.i.h()
            com.waze.ui.w.b.av r3 = r3.h(r4, r0)
            return r3
        L3d:
            com.waze.reports_v2.b.ad r4 = com.waze.reports_v2.b.ad.f34020d
            com.waze.ui.w.b.av r3 = r3.i(r4)
            return r3
        L44:
            if (r0 == 0) goto L55
            com.waze.reports_v2.b.ag r4 = (com.waze.reports_v2.b.ag) r4
            com.waze.reports_v2.b.q r0 = r4.g()
            java.util.List r4 = r4.h()
            com.waze.ui.w.b.av r3 = r3.h(r0, r4)
            return r3
        L55:
            boolean r0 = r4 instanceof com.waze.reports_v2.b.ah
            if (r0 == 0) goto L64
            com.waze.reports_v2.b.ah r4 = (com.waze.reports_v2.b.ah) r4
            com.waze.reports_v2.b.ad r4 = r4.g()
            com.waze.ui.w.b.av r3 = r3.i(r4)
            return r3
        L64:
            h.i r3 = new h.i
            r3.<init>()
            throw r3
        L6a:
            h.i r3 = new h.i
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.bd.f(com.waze.bm.a.a.ad):com.waze.ui.w.b.av");
    }
}
