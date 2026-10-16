package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum yyh implements defpackage.abpb {
    UNKNOWN_EVENT_TYPE(0),
    DEVICE_CONNECTED(1),
    DEVICE_DISCONNECTED(2),
    FACET_CHANGED(3),
    VOICE_SEARCH(4),
    FACET_NAVIGATION_START(5),
    FACET_NAVIGATION_END(6),
    FACET_PHONE_START(7),
    FACET_PHONE_END(8),
    FACET_MUSIC_START(9),
    FACET_MUSIC_END(10),
    FACET_OEM_START(11),
    FACET_OEM_END(12),
    FACET_HOME_START(13),
    FACET_HOME_END(14),
    VOICE_SEARCH_START(15),
    VOICE_SEARCH_END(16),
    FRX_START(17),
    FRX_STATE_CHANGE(18),
    FRX_END(19),
    SSL_HANDSHAKE(20),
    TOUCH_EVENT(21),
    AUDIO_FOCUS_REQUEST(22),
    COMPANION_START(23),
    COMPANION_TOGGLE_KNOWN_CARS(24),
    CARMENU_LATENCY(25),
    MEDIA(26),
    FIRST_ACTIVITY_LAUNCH(27),
    USB_CONNECTED(28),
    TIMEOUT_EVENT(29),
    BIND_TIMEOUT_EVENT(30),
    COMPANION_INCOMPATIBLE_DEVICE(31),
    COMPANION_PARKING_SHOWN(32),
    COMPANION_PARKING_TAP(33),
    CONNECT_CAR_INFO(34),
    COMPONENT_INTERACTION_EVENT(35),
    UI(36),
    NON_UI(37),
    COMPONENT_CONNECTION_EVENT(38),
    ASSISTANT(39),
    PROJECTION_ERROR(41),
    WIFI_LATENCY(42),
    PASSENGER_MODE(43),
    RFCOMM_CONNECT(44),
    WIRELESS_START(45),
    USER_SWITCH(46),
    BLUETOOTH_METADATA(47),
    WIFI_SOCKET_CONNECT(48),
    CONNECT_CAR_UI_INFO(49),
    WIRELESS_SCAN(50),
    CONNECTIVITY_INFO(51),
    UPDATE_CAR_UI_INFO(52),
    PROJECTION_STATS(53),
    AUDIO_STATS(54),
    LAUNCHER_STATE(55),
    WIFI_OUT_OF_BOUND_FREQUENCY(56),
    OUT_OF_CAR_LIFECYCLE_ERROR(57),
    CAR_CLIENT_CONNECTION(58),
    CONNECTIVITY_STATE(59),
    GEARHEAD_CAR_SERVICE_CONNECTION(60),
    GEARHEAD_CAR_SERVICE_DELEGATE_SELECTION(61),
    CAR_STARTUP_SERVICE_PROCESS(62),
    GEARHEAD_CAR_SERVICE_DELEGATE_INFO(63),
    BT_PROFILE_CONNECT(64),
    CONNECT_SECONDARY_DISPLAY(65),
    AUDIO_SINK_CONFIGURATION(66),
    CALENDAR_EVENT_LIST_SNAPSHOT(67),
    BT_FSM_STATE_CHANGE(68),
    TROUBLESHOOTER_EVENT(69),
    AUDIO_CHANNEL_SWITCHING_EVENT(70),
    LOCAL_DB_CAR_INFO(71),
    BUFFER_POOL_EVENT(72),
    AUDIO_VIDEO_SYNC(73),
    MEDIA_STATS(74);

    public final int aw;

    yyh(int i) {
        this.aw = i;
    }

    public static defpackage.yyh b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT_TYPE;
            case 1:
                return DEVICE_CONNECTED;
            case 2:
                return DEVICE_DISCONNECTED;
            case 3:
                return FACET_CHANGED;
            case 4:
                return VOICE_SEARCH;
            case 5:
                return FACET_NAVIGATION_START;
            case 6:
                return FACET_NAVIGATION_END;
            case 7:
                return FACET_PHONE_START;
            case 8:
                return FACET_PHONE_END;
            case 9:
                return FACET_MUSIC_START;
            case 10:
                return FACET_MUSIC_END;
            case 11:
                return FACET_OEM_START;
            case 12:
                return FACET_OEM_END;
            case 13:
                return FACET_HOME_START;
            case 14:
                return FACET_HOME_END;
            case 15:
                return VOICE_SEARCH_START;
            case 16:
                return VOICE_SEARCH_END;
            case 17:
                return FRX_START;
            case 18:
                return FRX_STATE_CHANGE;
            case 19:
                return FRX_END;
            case 20:
                return SSL_HANDSHAKE;
            case 21:
                return TOUCH_EVENT;
            case 22:
                return AUDIO_FOCUS_REQUEST;
            case 23:
                return COMPANION_START;
            case 24:
                return COMPANION_TOGGLE_KNOWN_CARS;
            case 25:
                return CARMENU_LATENCY;
            case 26:
                return MEDIA;
            case 27:
                return FIRST_ACTIVITY_LAUNCH;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return USB_CONNECTED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return TIMEOUT_EVENT;
            case 30:
                return BIND_TIMEOUT_EVENT;
            case 31:
                return COMPANION_INCOMPATIBLE_DEVICE;
            case 32:
                return COMPANION_PARKING_SHOWN;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return COMPANION_PARKING_TAP;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return CONNECT_CAR_INFO;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return COMPONENT_INTERACTION_EVENT;
            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                return UI;
            case 37:
                return NON_UI;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return COMPONENT_CONNECTION_EVENT;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                return ASSISTANT;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            default:
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return PROJECTION_ERROR;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return WIFI_LATENCY;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return PASSENGER_MODE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return RFCOMM_CONNECT;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return WIRELESS_START;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return USER_SWITCH;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return BLUETOOTH_METADATA;
            case 48:
                return WIFI_SOCKET_CONNECT;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return CONNECT_CAR_UI_INFO;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return WIRELESS_SCAN;
            case 51:
                return CONNECTIVITY_INFO;
            case 52:
                return UPDATE_CAR_UI_INFO;
            case 53:
                return PROJECTION_STATS;
            case 54:
                return AUDIO_STATS;
            case 55:
                return LAUNCHER_STATE;
            case 56:
                return WIFI_OUT_OF_BOUND_FREQUENCY;
            case 57:
                return OUT_OF_CAR_LIFECYCLE_ERROR;
            case 58:
                return CAR_CLIENT_CONNECTION;
            case 59:
                return CONNECTIVITY_STATE;
            case 60:
                return GEARHEAD_CAR_SERVICE_CONNECTION;
            case 61:
                return GEARHEAD_CAR_SERVICE_DELEGATE_SELECTION;
            case 62:
                return CAR_STARTUP_SERVICE_PROCESS;
            case 63:
                return GEARHEAD_CAR_SERVICE_DELEGATE_INFO;
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                return BT_PROFILE_CONNECT;
            case 65:
                return CONNECT_SECONDARY_DISPLAY;
            case 66:
                return AUDIO_SINK_CONFIGURATION;
            case 67:
                return CALENDAR_EVENT_LIST_SNAPSHOT;
            case 68:
                return BT_FSM_STATE_CHANGE;
            case 69:
                return TROUBLESHOOTER_EVENT;
            case 70:
                return AUDIO_CHANNEL_SWITCHING_EVENT;
            case 71:
                return LOCAL_DB_CAR_INFO;
            case 72:
                return BUFFER_POOL_EVENT;
            case 73:
                return AUDIO_VIDEO_SYNC;
            case 74:
                return MEDIA_STATS;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.aw;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.aw);
    }
}
