package i.c.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum m implements eg {
    AVOID_PRIMARIES(1),
    AVOID_TRAILS(2),
    AVOID_LONG_TRAILS(3),
    PREFER_SAME_STREET(4),
    IGNORE_REALTIME_INFO(5),
    ALLOW_UNKNOWN_DIRECTIONS(6),
    ALLOW_NEAR_BY_SOURCE(7),
    ALLOW_NEAR_BY_TARGET(8),
    IGNORE_SEGMENT_INFO(9),
    AVOID_TOLL_ROADS(10),
    IGNORE_PENALTIES(11),
    PREFER_UNKNOWN_DIRECTIONS(12),
    AVOID_DANGER_ZONES(13),
    PREFER_LESS_SEGMENTS(14),
    IGNORE_HISTORIC_INFO(15),
    USE_EXTENDED_INSTRUCTIONS(16),
    PREFER_SHORTER_DISTANCES(20),
    USE_LANE_DATA(21),
    AVOID_PRIVATE_ROADS(22),
    AVOID_TOLLS_IN_ALTERNATIVES(23),
    ALLOW_TOLLS_IN_ALTERNATIVES(24),
    PREFER_ALT_COMMON_ROUTES(26),
    USE_RATE_FOR_LONG_DRIVE(29),
    ALLOW_BLOCKED_ROUTES(30),
    USE_LAST_DIRECTION_ON_START(31),
    ALLOW_UTURNS(32),
    REMOVE_SMALL_DETOURS(33),
    AVOID_DANGEROUS_TURNS(34),
    ALLOW_MAX_ALTERNATIVES(37),
    AVOID_RESTRICTED_AREA(38),
    PENALIZE_SWITCH_TO_TOLL_ROAD(39),
    USE_CROSSROADS(40),
    RETAIN_RESULTS(41),
    AVOID_FERRIES(42),
    ORIGIN_IN_DANGER_ZONE(44),
    DESTINATION_IN_DANGER_ZONE(45),
    AVOID_COUNTRY_SWITCH(46),
    REORDER_SMALLEST_COST(48),
    REORDER_TOLL_NO_TOLL(49),
    REORDER_FASTER_AND_SHORTER(50),
    REORDER_FASTER(51),
    REORDER_MUCH_SHORTER(52),
    ADD_HOV_ROUTES(53),
    FILTER_OUT_BLOCKED_FREQUENT_ROUTES(56),
    FILTER_OUT_INVALID_FREQUENT_ROUTES(57),
    INDICATE_PREFERRED_STOPPING_POINTS_ALONG_ROUTE(58),
    FILTER_OUT_LOOPY_FREQUENT_ROUTES(59),
    FILTER_OUT_PARKING_FREQUENT_ROUTES(60),
    OPTIMIZE_XL_ROUTE(61),
    ADD_HOV_INSTRUCTIONS(62),
    AGGREGATE_SEGMENTS(63),
    WAZIFY_XL_ROUTE(64),
    DISABLE_LONG_ROUTE_PENALTY(65),
    USE_DEBUG_SPEEDS(66),
    USE_PETA_IN_ROUTE_CALCULATION(67),
    USE_PETA_IN_ALT_ROUTE_CALCULATION(68),
    USE_TOLL_PRICES(69),
    PLACE_ENCOURAGEMENT_AS_SECOND(70),
    FIX_REVERSE_ROUTE(71),
    USE_FASTER_RUNNING_TIME(72),
    COMPUTE_DUE_TO_RESULTS(73),
    GENERATE_TRAVERSED_TILE_IDS(74),
    DENSE_GEOM_AT_ROUTE_EXTREMITIES(75),
    ALLOW_INNER_NODES_NAVIGATION(76),
    GENERATE_LANE_GUIDANCE(77),
    CLIENT_INSTRUCTION_LANE_GUIDANCE_SEPARATION(78),
    DISABLE_FORWARD_TO_FUTURE(79),
    USE_PETA(80),
    ENABLE_FORECAST_RESPONSE(81),
    GENERATE_ROAD_SIGNS(82),
    USE_FUTURE_CLOSURES(83),
    REORDER_HEURISTICS_MARK(84),
    DESTINATION_IS_AN_END_POINT(85),
    TO_VERTEX_IS_TO_NODE_OF_TO_SEGMENT(86),
    USE_HUBCAP(87),
    USE_EXPERIMENTAL_SPEED_INFORMATION(88),
    EMIT_RESPONSE_EVENT(90),
    FORWARD_FUTURE_REQUESTS_AFTER_X_MINUTES(91),
    DEBUG_LIMIT_TO_ROUTE(92),
    USE_TOLL_PRICES_FOR_ASTAR(94),
    IGNORE_PREFERRED_ROUTES(108),
    OVERRIDE_ABR_SCORES(109);

    private final int aF;

    m(int i2) {
        this.aF = i2;
    }

    public static m a(int i2) {
        switch (i2) {
            case 1:
                return AVOID_PRIMARIES;
            case 2:
                return AVOID_TRAILS;
            case 3:
                return AVOID_LONG_TRAILS;
            case 4:
                return PREFER_SAME_STREET;
            case 5:
                return IGNORE_REALTIME_INFO;
            case 6:
                return ALLOW_UNKNOWN_DIRECTIONS;
            case 7:
                return ALLOW_NEAR_BY_SOURCE;
            case 8:
                return ALLOW_NEAR_BY_TARGET;
            case 9:
                return IGNORE_SEGMENT_INFO;
            case 10:
                return AVOID_TOLL_ROADS;
            case 11:
                return IGNORE_PENALTIES;
            case 12:
                return PREFER_UNKNOWN_DIRECTIONS;
            case 13:
                return AVOID_DANGER_ZONES;
            case 14:
                return PREFER_LESS_SEGMENTS;
            case 15:
                return IGNORE_HISTORIC_INFO;
            case 16:
                return USE_EXTENDED_INSTRUCTIONS;
            case 17:
            case 18:
            case 19:
            case 25:
            case 27:
            case 28:
            case 35:
            case 36:
            case 43:
            case 47:
            case 54:
            case 55:
            case 89:
            case 93:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            default:
                return null;
            case 20:
                return PREFER_SHORTER_DISTANCES;
            case 21:
                return USE_LANE_DATA;
            case 22:
                return AVOID_PRIVATE_ROADS;
            case 23:
                return AVOID_TOLLS_IN_ALTERNATIVES;
            case 24:
                return ALLOW_TOLLS_IN_ALTERNATIVES;
            case 26:
                return PREFER_ALT_COMMON_ROUTES;
            case 29:
                return USE_RATE_FOR_LONG_DRIVE;
            case 30:
                return ALLOW_BLOCKED_ROUTES;
            case 31:
                return USE_LAST_DIRECTION_ON_START;
            case 32:
                return ALLOW_UTURNS;
            case 33:
                return REMOVE_SMALL_DETOURS;
            case 34:
                return AVOID_DANGEROUS_TURNS;
            case 37:
                return ALLOW_MAX_ALTERNATIVES;
            case 38:
                return AVOID_RESTRICTED_AREA;
            case 39:
                return PENALIZE_SWITCH_TO_TOLL_ROAD;
            case 40:
                return USE_CROSSROADS;
            case 41:
                return RETAIN_RESULTS;
            case 42:
                return AVOID_FERRIES;
            case 44:
                return ORIGIN_IN_DANGER_ZONE;
            case 45:
                return DESTINATION_IN_DANGER_ZONE;
            case 46:
                return AVOID_COUNTRY_SWITCH;
            case 48:
                return REORDER_SMALLEST_COST;
            case 49:
                return REORDER_TOLL_NO_TOLL;
            case 50:
                return REORDER_FASTER_AND_SHORTER;
            case 51:
                return REORDER_FASTER;
            case 52:
                return REORDER_MUCH_SHORTER;
            case 53:
                return ADD_HOV_ROUTES;
            case 56:
                return FILTER_OUT_BLOCKED_FREQUENT_ROUTES;
            case 57:
                return FILTER_OUT_INVALID_FREQUENT_ROUTES;
            case 58:
                return INDICATE_PREFERRED_STOPPING_POINTS_ALONG_ROUTE;
            case 59:
                return FILTER_OUT_LOOPY_FREQUENT_ROUTES;
            case 60:
                return FILTER_OUT_PARKING_FREQUENT_ROUTES;
            case 61:
                return OPTIMIZE_XL_ROUTE;
            case 62:
                return ADD_HOV_INSTRUCTIONS;
            case 63:
                return AGGREGATE_SEGMENTS;
            case 64:
                return WAZIFY_XL_ROUTE;
            case 65:
                return DISABLE_LONG_ROUTE_PENALTY;
            case 66:
                return USE_DEBUG_SPEEDS;
            case 67:
                return USE_PETA_IN_ROUTE_CALCULATION;
            case 68:
                return USE_PETA_IN_ALT_ROUTE_CALCULATION;
            case 69:
                return USE_TOLL_PRICES;
            case 70:
                return PLACE_ENCOURAGEMENT_AS_SECOND;
            case 71:
                return FIX_REVERSE_ROUTE;
            case 72:
                return USE_FASTER_RUNNING_TIME;
            case 73:
                return COMPUTE_DUE_TO_RESULTS;
            case 74:
                return GENERATE_TRAVERSED_TILE_IDS;
            case 75:
                return DENSE_GEOM_AT_ROUTE_EXTREMITIES;
            case 76:
                return ALLOW_INNER_NODES_NAVIGATION;
            case 77:
                return GENERATE_LANE_GUIDANCE;
            case 78:
                return CLIENT_INSTRUCTION_LANE_GUIDANCE_SEPARATION;
            case 79:
                return DISABLE_FORWARD_TO_FUTURE;
            case 80:
                return USE_PETA;
            case 81:
                return ENABLE_FORECAST_RESPONSE;
            case 82:
                return GENERATE_ROAD_SIGNS;
            case 83:
                return USE_FUTURE_CLOSURES;
            case 84:
                return REORDER_HEURISTICS_MARK;
            case 85:
                return DESTINATION_IS_AN_END_POINT;
            case 86:
                return TO_VERTEX_IS_TO_NODE_OF_TO_SEGMENT;
            case 87:
                return USE_HUBCAP;
            case 88:
                return USE_EXPERIMENTAL_SPEED_INFORMATION;
            case 90:
                return EMIT_RESPONSE_EVENT;
            case 91:
                return FORWARD_FUTURE_REQUESTS_AFTER_X_MINUTES;
            case 92:
                return DEBUG_LIMIT_TO_ROUTE;
            case 94:
                return USE_TOLL_PRICES_FOR_ASTAR;
            case 108:
                return IGNORE_PREFERRED_ROUTES;
            case 109:
                return OVERRIDE_ABR_SCORES;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.aF;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aF);
    }
}
