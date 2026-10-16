package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class AlerterController$Alerter$Type {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ AlerterController$Alerter$Type[] $VALUES;
    private final long valueForStats;
    public static final AlerterController$Alerter$Type UNSPECIFIED = new AlerterController$Alerter$Type("UNSPECIFIED", 0, -1);
    public static final AlerterController$Alerter$Type CHITCHAT = new AlerterController$Alerter$Type("CHITCHAT", 1, 0);
    public static final AlerterController$Alerter$Type POLICE = new AlerterController$Alerter$Type("POLICE", 2, 1);
    public static final AlerterController$Alerter$Type ACCIDENT = new AlerterController$Alerter$Type("ACCIDENT", 3, 2);
    public static final AlerterController$Alerter$Type TRAFFIC_JAM = new AlerterController$Alerter$Type("TRAFFIC_JAM", 4, 3);
    public static final AlerterController$Alerter$Type TRAFFIC_INFO = new AlerterController$Alerter$Type("TRAFFIC_INFO", 5, 4);
    public static final AlerterController$Alerter$Type HAZARD = new AlerterController$Alerter$Type("HAZARD", 6, 5);
    public static final AlerterController$Alerter$Type OTHER = new AlerterController$Alerter$Type("OTHER", 7, 6);
    public static final AlerterController$Alerter$Type CONSTRUCTION = new AlerterController$Alerter$Type("CONSTRUCTION", 8, 7);
    public static final AlerterController$Alerter$Type PARKING = new AlerterController$Alerter$Type("PARKING", 9, 8);
    public static final AlerterController$Alerter$Type DYNAMIC = new AlerterController$Alerter$Type("DYNAMIC", 10, 9);
    public static final AlerterController$Alerter$Type CAMERA = new AlerterController$Alerter$Type("CAMERA", 11, 10);
    public static final AlerterController$Alerter$Type PARKED = new AlerterController$Alerter$Type("PARKED", 12, 11);
    public static final AlerterController$Alerter$Type CLOSURE = new AlerterController$Alerter$Type("CLOSURE", 13, 12);
    public static final AlerterController$Alerter$Type SOS = new AlerterController$Alerter$Type("SOS", 14, 15);
    public static final AlerterController$Alerter$Type REROUTE = new AlerterController$Alerter$Type("REROUTE", 15, 16);
    public static final AlerterController$Alerter$Type GUARDIAN = new AlerterController$Alerter$Type("GUARDIAN", 16, 17);
    public static final AlerterController$Alerter$Type ECO = new AlerterController$Alerter$Type("ECO", 17, 18);
    public static final AlerterController$Alerter$Type BLOCKED_LANE = new AlerterController$Alerter$Type("BLOCKED_LANE", 18, 19);
    public static final AlerterController$Alerter$Type BAD_WEATHER = new AlerterController$Alerter$Type("BAD_WEATHER", 19, 20);
    public static final AlerterController$Alerter$Type PERMANENT_HAZARD = new AlerterController$Alerter$Type("PERMANENT_HAZARD", 20, 21);
    public static final AlerterController$Alerter$Type SPEED_LIMIT_DECREASE = new AlerterController$Alerter$Type("SPEED_LIMIT_DECREASE", 21, 22);
    public static final AlerterController$Alerter$Type TURN_CLOSURE = new AlerterController$Alerter$Type("TURN_CLOSURE", 22, 23);
    public static final AlerterController$Alerter$Type PERSONAL_SAFETY = new AlerterController$Alerter$Type("PERSONAL_SAFETY", 23, 24);
    public static final AlerterController$Alerter$Type DANGER_ZONE = new AlerterController$Alerter$Type("DANGER_ZONE", 24, 25);
    public static final AlerterController$Alerter$Type ANIMAL = new AlerterController$Alerter$Type("ANIMAL", 25, 26);
    public static final AlerterController$Alerter$Type NO_NETWORK = new AlerterController$Alerter$Type("NO_NETWORK", 26, 27);
    public static final AlerterController$Alerter$Type MID_DRIVE_TOAST = new AlerterController$Alerter$Type("MID_DRIVE_TOAST", 27, 28);
    public static final AlerterController$Alerter$Type CONVERSATION_FEEDBACK = new AlerterController$Alerter$Type("CONVERSATION_FEEDBACK", 28, 29);
    public static final AlerterController$Alerter$Type WAZE_TO_GOAL = new AlerterController$Alerter$Type("WAZE_TO_GOAL", 29, 30);
    public static final AlerterController$Alerter$Type GPS_ISSUE = new AlerterController$Alerter$Type("GPS_ISSUE", 30, 31);

    private static final /* synthetic */ AlerterController$Alerter$Type[] $values() {
        return new AlerterController$Alerter$Type[]{UNSPECIFIED, CHITCHAT, POLICE, ACCIDENT, TRAFFIC_JAM, TRAFFIC_INFO, HAZARD, OTHER, CONSTRUCTION, PARKING, DYNAMIC, CAMERA, PARKED, CLOSURE, SOS, REROUTE, GUARDIAN, ECO, BLOCKED_LANE, BAD_WEATHER, PERMANENT_HAZARD, SPEED_LIMIT_DECREASE, TURN_CLOSURE, PERSONAL_SAFETY, DANGER_ZONE, ANIMAL, NO_NETWORK, MID_DRIVE_TOAST, CONVERSATION_FEEDBACK, WAZE_TO_GOAL, GPS_ISSUE};
    }

    static {
        AlerterController$Alerter$Type[] alerterController$Alerter$TypeArr$values = $values();
        $VALUES = alerterController$Alerter$TypeArr$values;
        $ENTRIES = h.d.b.a(alerterController$Alerter$TypeArr$values);
    }

    private AlerterController$Alerter$Type(String str, int i2, long j2) {
        this.valueForStats = j2;
    }

    public static h.d.a<AlerterController$Alerter$Type> getEntries() {
        return $ENTRIES;
    }

    public static AlerterController$Alerter$Type valueOf(String str) {
        return (AlerterController$Alerter$Type) Enum.valueOf(AlerterController$Alerter$Type.class, str);
    }

    public static AlerterController$Alerter$Type[] values() {
        return (AlerterController$Alerter$Type[]) $VALUES.clone();
    }

    public final long getValueForStats() {
        return this.valueForStats;
    }
}
