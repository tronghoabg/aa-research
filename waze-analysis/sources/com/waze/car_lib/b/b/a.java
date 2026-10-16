package com.waze.car_lib.b.b;

import android.os.Parcelable;
import com.waze.R;
import com.waze.reports_v2.b.at;
import com.waze.reports_v2.c.dp;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f19010a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.alerters.a f19011b;

    /* renamed from: c, reason: collision with root package name */
    private final dp f19012c;

    public a(com.waze.shared_infra.o.a aVar, com.waze.alerters.a aVar2, dp dpVar) {
        x.f(aVar, "stringProvider");
        x.f(aVar2, "alerterConfig");
        x.f(dpVar, "reportingDataProvider");
        this.f19010a = aVar;
        this.f19011b = aVar2;
        this.f19012c = dpVar;
    }

    public final com.waze.car_lib.b.a.b a(at atVar) {
        x.f(atVar, "subType");
        Parcelable.Creator<at> creator = at.CREATOR;
        switch (atVar.ordinal()) {
            case 0:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_TRAFFIC_DEFAULT_LABEL, new Object[0]), R.drawable.icon_report_traffic_vector);
            case 1:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_TRAFFIC_STANDSTILL_LABEL, new Object[0]), R.drawable.icon_report_traffic_standstill_vector);
            case 2:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_POLICE_DEFAULT_LABEL, new Object[0]), R.drawable.icon_report_police_vector);
            case 3:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_POLICE_HIDDEN_LABEL, new Object[0]), R.drawable.icon_report_police_hidden_vector);
            case 4:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_POLICE_MOBILE_CAMERA_LABEL, new Object[0]), R.drawable.icon_report_police_mobile_camera_vector);
            case 5:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_REPORT_OTHER_SIDE, new Object[0]), true != this.f19012c.e() ? R.drawable.icon_report_police_other_side_rht_vector : R.drawable.icon_report_police_other_side_lht_vector);
            case 6:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_CRASH_DEFAULT_LABEL, new Object[0]), R.drawable.icon_report_accident_vector);
            case 7:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_CRASH_PILE_UP_LABEL, new Object[0]), R.drawable.icon_report_accident_major_vector);
            case 8:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_REPORT_OTHER_SIDE, new Object[0]), true != this.f19012c.e() ? R.drawable.icon_report_accident_other_side_rht_vector : R.drawable.icon_report_accident_other_side_lht_vector);
            case 9:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_DEFAULT_LABEL, new Object[0]), R.drawable.icon_report_hazard_vector);
            case 10:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_BROKEN_TRAFFIC_LIGHT_LABEL, new Object[0]), R.drawable.icon_report_hazard_broken_light_vector);
            case 11:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_POTHOLE_LABEL, new Object[0]), R.drawable.icon_report_hazard_pothole_vector);
            case 12:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_OBJECT_LABEL, new Object[0]), R.drawable.icon_report_hazard_object_vector);
            case 13:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_VEHICLE_STOPPED_LABEL, new Object[0]), R.drawable.icon_report_hazard_vehicle_stopped_vector);
            case 14:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_CONSTRUCTION_LABEL, new Object[0]), R.drawable.icon_report_hazard_construction_vector);
            case 15:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_BAD_WEATHER_LABEL, new Object[0]), R.drawable.icon_report_weather_vector);
            case 16:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_FLOOD_LABEL, new Object[0]), R.drawable.icon_report_hazard_weather_flood_vector);
            case 17:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_SLIPPERY_ROAD_LABEL, new Object[0]), R.drawable.icon_report_hazard_weather_slippery_road_vector);
            case 18:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_UNPLOWED_ROAD_LABEL, new Object[0]), R.drawable.icon_report_hazard_weather_unplowed_road_vector);
            case 19:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_ICY_ROAD_LABEL, new Object[0]), R.drawable.icon_report_hazard_weather_ice_vector);
            case 20:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_FOG_LABEL, new Object[0]), R.drawable.icon_report_hazard_weather_fog_vector);
            case 21:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_BLOCKED_LANE_DEFAULT_LABEL, new Object[0]), true != this.f19011b.a() ? R.drawable.icon_report_blocked_lane_vector : R.drawable.icon_report_blocked_lane_vector_with_lane);
            case 22:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_BLOCKED_LANE_LEFT_LABEL, new Object[0]), true != this.f19011b.a() ? R.drawable.icon_report_blocked_lane_left_vector : R.drawable.icon_report_blocked_lane_left_vector_with_lane);
            case 23:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_BLOCKED_LANE_CENTER_LABEL, new Object[0]), true != this.f19011b.a() ? R.drawable.icon_report_blocked_lane_center_vector : R.drawable.icon_report_blocked_lane_center_vector_with_lane);
            case 24:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_BLOCKED_LANE_RIGHT_LABEL, new Object[0]), true != this.f19011b.a() ? R.drawable.icon_report_blocked_lane_right_vector : R.drawable.icon_report_blocked_lane_right_vector_with_lane);
            case 25:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_WEATHER_HAIL_LABEL, new Object[0]), R.drawable.icon_hazard_weather_hail);
            case 26:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_ANIMALS_LABEL, new Object[0]), R.drawable.icon_report_hazard_animals);
            case 27:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_MISSING_SIGN_LABEL, new Object[0]), R.drawable.icon_report_hazard_missingsign);
            case 28:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_ROADKILL_LABEL, new Object[0]), R.drawable.icon_report_hazard_roadkill);
            case 29:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HAZARD_SHOULDER_VEHICLE_STOPPED_LABEL, new Object[0]), R.drawable.icon_report_hazard_vehicle_stopped_vector);
            case 30:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_CRASH_MAJOR_LABEL, new Object[0]), R.drawable.icon_report_accident_major_vector);
            case 31:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_CRASH_MINOR_LABEL, new Object[0]), R.drawable.icon_report_accident_minor_vector);
            case 32:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_MODERATE_TRAFFIC_LABEL, new Object[0]), R.drawable.icon_report_traffic_moderate);
            case 33:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL, new Object[0]), R.drawable.icon_report_traffic_heavy);
            case 34:
                return null;
            case 35:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_GENERAL_MAP_ISSUE, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 36:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_GENERAL_WRONG_TURN, new Object[0]), R.drawable.car_report_menu_mapissue_incorrect_turn);
            case 37:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_GENERAL_WRONG_ADDRESS, new Object[0]), R.drawable.car_report_menu_mapissue_incorrect_address);
            case 38:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_GENERAL_WRONG_ROUTE, new Object[0]), R.drawable.car_report_menu_mapissue_incorrect_route);
            case 39:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_GENERAL_NO_ROUNDABOUT, new Object[0]), R.drawable.car_report_menu_mapissue_missing_roundabout);
            case 40:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_GENERAL_NO_ROAD, new Object[0]), R.drawable.car_report_menu_mapissue_missing_road);
            case 41:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_TURN_NOT_ALLOWED, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 42:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_INCORRECT_JUNCTION, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 43:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_MISSING_BRIDGE_OVERPASS, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 44:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_WRONG_DRIVING_DIRECTIONS, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 45:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_MISSING_EXIT, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 46:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_MISPLACED_GAS_STATION, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 47:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_MISSING_LANDMARK, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 48:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.AAOS_UGC_REPORTS_BLOCKED_ROAD, new Object[0]), R.drawable.car_report_menu_mapissue_general_problem);
            case 49:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_PERSONAL_SAFETY_REPORT_LABEL, new Object[0]), true != this.f19011b.b() ? R.drawable.icon_alerter_personal_safety_b : R.drawable.icon_alerter_personal_safety_a);
            case 50:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_ANIMAL_DEFAULT_LABEL, new Object[0]), R.drawable.icon_report_animal_vector);
            case 51:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_ANIMAL_IN_LANE_LABEL, new Object[0]), R.drawable.icon_report_animal_in_lane_vector);
            case 52:
                return new com.waze.car_lib.b.a.b(atVar.name(), this.f19010a.c(R.string.REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL, new Object[0]), R.drawable.icon_report_animal_on_shoulder_vector);
            default:
                throw new i();
        }
    }
}
