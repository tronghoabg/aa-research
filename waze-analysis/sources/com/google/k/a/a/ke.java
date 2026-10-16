package com.google.k.a.a;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ke implements com.google.v.eg {
    CAUSE_CATEGORY_UNSPECIFIED(0),
    ROAD_OBSTRUCTION(1),
    CRASH(17),
    CRISIS(2),
    WEATHER(33),
    FLOODING(DisplayStrings.DS_REPORT_MENU_V2_CRASH_DEFAULT_LABEL),
    CYCLONE(DisplayStrings.DS_REPORT_MENU_V2_CRASH_PILE_UP_LABEL),
    TYPHOON(DisplayStrings.DS_REPORT_MENU_V2_CRASH_MAJOR_LABEL),
    HURRICANE(DisplayStrings.DS_REPORT_MENU_V2_CRASH_MINOR_LABEL),
    TORNADO(DisplayStrings.DS_REPORT_MENU_V2_HAZARD_REPORT_TITLE),
    FIRE(34),
    GEOPHYSICAL_EVENT(35),
    EARTHQUAKE(DisplayStrings.DS_REPORT_INCAR_CLOSURE_REPORT_SECONDARY_BUTTON),
    LANDSLIDE(DisplayStrings.DS_REPORT_MENU_V2_CLOSURE_REPORT_AHEAD_TITLE),
    AVALANCHE(DisplayStrings.DS_REPORT_MENU_V2_CLOSURE_REPORT_BEHIND_TITLE),
    TSUNAMI(DisplayStrings.DS_REPORT_MENU_V2_CLOSURE_REPORT_REPORTED_TITLE),
    STRUCTURAL_FAILURE(36),
    DAM_FAILURE(DisplayStrings.DS_REPORT_MENU_V2_MAP_ISSUE_INCORRECT_JUNCTION_LABEL),
    PLANNED_EVENT(3),
    SPORTS_EVENT(DisplayStrings.DS_RAW_GPS_IS_ON),
    ROUTE_SPORTS_EVENT(12305),
    PARADE(DisplayStrings.DS_RECALCULATING_ROUTE___),
    CONSTRUCTION(DisplayStrings.DS_REC),
    DEMONSTRATION(DisplayStrings.DS_REFRESHING_MAP_TILES),
    SEASONAL_CLOSURE(4);

    private final int A;

    ke(int i2) {
        this.A = i2;
    }

    public static ke a(int i2) {
        if (i2 == 0) {
            return CAUSE_CATEGORY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ROAD_OBSTRUCTION;
        }
        if (i2 == 2) {
            return CRISIS;
        }
        if (i2 == 3) {
            return PLANNED_EVENT;
        }
        if (i2 == 4) {
            return SEASONAL_CLOSURE;
        }
        if (i2 == 17) {
            return CRASH;
        }
        if (i2 == 577) {
            return DAM_FAILURE;
        }
        if (i2 == 12305) {
            return ROUTE_SPORTS_EVENT;
        }
        switch (i2) {
            case 33:
                return WEATHER;
            case 34:
                return FIRE;
            case 35:
                return GEOPHYSICAL_EVENT;
            case 36:
                return STRUCTURAL_FAILURE;
            default:
                switch (i2) {
                    case DisplayStrings.DS_REPORT_MENU_V2_CRASH_DEFAULT_LABEL /* 529 */:
                        return FLOODING;
                    case DisplayStrings.DS_REPORT_MENU_V2_CRASH_PILE_UP_LABEL /* 530 */:
                        return CYCLONE;
                    case DisplayStrings.DS_REPORT_MENU_V2_CRASH_MAJOR_LABEL /* 531 */:
                        return TYPHOON;
                    case DisplayStrings.DS_REPORT_MENU_V2_CRASH_MINOR_LABEL /* 532 */:
                        return HURRICANE;
                    case DisplayStrings.DS_REPORT_MENU_V2_HAZARD_REPORT_TITLE /* 533 */:
                        return TORNADO;
                    default:
                        switch (i2) {
                            case DisplayStrings.DS_REPORT_INCAR_CLOSURE_REPORT_SECONDARY_BUTTON /* 561 */:
                                return EARTHQUAKE;
                            case DisplayStrings.DS_REPORT_MENU_V2_CLOSURE_REPORT_AHEAD_TITLE /* 562 */:
                                return LANDSLIDE;
                            case DisplayStrings.DS_REPORT_MENU_V2_CLOSURE_REPORT_BEHIND_TITLE /* 563 */:
                                return AVALANCHE;
                            case DisplayStrings.DS_REPORT_MENU_V2_CLOSURE_REPORT_REPORTED_TITLE /* 564 */:
                                return TSUNAMI;
                            default:
                                switch (i2) {
                                    case DisplayStrings.DS_RAW_GPS_IS_ON /* 769 */:
                                        return SPORTS_EVENT;
                                    case DisplayStrings.DS_RECALCULATING_ROUTE___ /* 770 */:
                                        return PARADE;
                                    case DisplayStrings.DS_REC /* 771 */:
                                        return CONSTRUCTION;
                                    case DisplayStrings.DS_REFRESHING_MAP_TILES /* 772 */:
                                        return DEMONSTRATION;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
