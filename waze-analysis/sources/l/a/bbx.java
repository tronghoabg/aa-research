package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbx implements com.google.v.eg {
    SCREEN_NAME_UNSPECIFIED(0),
    GENERAL_SETTINGS(1),
    VOICE_SETTINGS(2),
    WAZE_VOICE_SETTINGS(3),
    CAR_ICON_SETTINGS(4),
    VEHICLE_TYPE_SETTINGS(5),
    PRIVACY_SETTINGS(6),
    GAS_TYPE_SETTINGS(7),
    REPORTS_SETTINGS(8),
    NAVIGATION_SETTINGS(9),
    PLANNED_DRIVE_SETTINGS(10),
    TRIP_SUGGESTIONS_SETTINGS(11),
    ACCOUNT_AND_LOGIN_SETTINGS(12),
    SPEEDOMETER_SETTINGS(13),
    MAIN_SETTINGS(14),
    NAVIGATION_HISTORY_SETTINGS(15),
    EV_PROFILE_SETTINGS(16),
    EV_CONNECTORS_SETTINGS(17),
    GAS_STATIONS_SETTINGS(18),
    GOOGLE_ASSISTANT_SETTINGS(19),
    QUICK_GAS_SETTINGS(20),
    QUICK_NAVIGATION_SETTINGS(21),
    QUICK_SOUND_SETTINGS(22),
    EV_NETWORKS_SETTINGS(23),
    LICENSE_PLATE_SETTINGS(24),
    PREFERRED_STATION_SETTINGS(25),
    SIRI_SHORTCUTS_SETTINGS(26),
    VEHICLE_DETAILS_SETTINGS(27),
    CAMERAS_SETTINGS(28),
    PERSONALIZED_SETTINGS(29),
    PERSONALIZED_NAVIGATION_SETTINGS(30),
    MAP_DISPLAY_SETTINGS(31),
    TRAFFIC_LIGHTS_SETTINGS(32),
    PERMANENT_HAZARDS_SETTINGS(33),
    HOY_NO_CIRCULA_SETTINGS(34),
    UNRECOGNIZED(-1);

    private final int L;

    bbx(int i2) {
        this.L = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.L;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.L);
    }
}
