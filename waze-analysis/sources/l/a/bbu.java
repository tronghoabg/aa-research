package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbu implements com.google.v.eg {
    BUTTON_UNSPECIFIED(0),
    GENERAL_SETTINGS(1),
    MAP_DISPLAY_SETTINGS(2),
    VOICE_SETTINGS(3),
    NAVIGATION_SETTINGS(5),
    CAR_DETAILS_SETTINGS(6),
    SUBSCRIPTIONS_SETTINGS(7),
    ALERTS_AND_REPORTS_SETTINGS(8),
    GAS_STATIONS_SETTINGS(9),
    SPEEDOMETER_SETTINGS(10),
    CARPOOL_SETTINGS_SETTINGS(11),
    MUSIC_SETTINGS(12),
    NOTIFICATIONS_SETTINGS(13),
    PLANNED_DRIVE_SETTINGS(14),
    REMINDERS_SETTINGS(15),
    ACCOUNT_AND_LOGIN_SETTINGS(16),
    PRIVACY_SETTINGS(17),
    ABOUT_SETTINGS(18),
    SPREAD_THE_WORD_SETTINGS(19),
    BECOME_AN_EDITOR_SETTINGS(20),
    UNRECOGNIZED(-1);

    private final int w;

    bbu(int i2) {
        this.w = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
