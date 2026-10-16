package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class AlerterController$Alerter$Subtype {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ AlerterController$Alerter$Subtype[] $VALUES;
    private final AlerterController$Alerter$Type ofType;
    private final int valueInAlerter;
    public static final AlerterController$Alerter$Subtype UNSPECIFIED = new AlerterController$Alerter$Subtype("UNSPECIFIED", 0, AlerterController$Alerter$Type.UNSPECIFIED, -1);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD", 1, AlerterController$Alerter$Type.HAZARD, 0);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_SHOULDER = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_SHOULDER", 2, AlerterController$Alerter$Type.HAZARD, 1);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_WEATHER = new AlerterController$Alerter$Subtype("HAZARD_TYPE_WEATHER", 3, AlerterController$Alerter$Type.HAZARD, 2);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_OBJECT = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_OBJECT", 4, AlerterController$Alerter$Type.HAZARD, 3);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_POT_HOLE = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_POT_HOLE", 5, AlerterController$Alerter$Type.HAZARD, 4);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_ROAD_KILL = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_ROAD_KILL", 6, AlerterController$Alerter$Type.HAZARD, 5);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_SHOULDER_CAR_STOPPED = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_SHOULDER_CAR_STOPPED", 7, AlerterController$Alerter$Type.HAZARD, 6);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_SHOULDER_ANIMALS = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_SHOULDER_ANIMALS", 8, AlerterController$Alerter$Type.HAZARD, 7);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_SHOULDER_MISSING_SIGN = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_SHOULDER_MISSING_SIGN", 9, AlerterController$Alerter$Type.HAZARD, 8);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_WEATHER_FREEZING_RAIN = new AlerterController$Alerter$Subtype("HAZARD_TYPE_WEATHER_FREEZING_RAIN", 10, AlerterController$Alerter$Type.HAZARD, 18);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_LANE_CLOSED = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_LANE_CLOSED", 11, AlerterController$Alerter$Type.HAZARD, 19);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_OIL = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_OIL", 12, AlerterController$Alerter$Type.HAZARD, 20);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_CONSTRUCTION = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_CONSTRUCTION", 13, AlerterController$Alerter$Type.HAZARD, 22);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_CAR_STOPPED = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_CAR_STOPPED", 14, AlerterController$Alerter$Type.HAZARD, 23);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT = new AlerterController$Alerter$Subtype("HAZARD_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT", 15, AlerterController$Alerter$Type.HAZARD, 24);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("HAZARD_TYPE_DEFAULT", 16, AlerterController$Alerter$Type.HAZARD, 25);
    public static final AlerterController$Alerter$Subtype HAZARD_TYPE_EMERGENCY_VEHICLE = new AlerterController$Alerter$Subtype("HAZARD_TYPE_EMERGENCY_VEHICLE", 17, AlerterController$Alerter$Type.HAZARD, 28);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_FOG = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_FOG", 18, AlerterController$Alerter$Type.BAD_WEATHER, 9);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_HAIL = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_HAIL", 19, AlerterController$Alerter$Type.BAD_WEATHER, 10);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_HEAVY_RAIN = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_HEAVY_RAIN", 20, AlerterController$Alerter$Type.BAD_WEATHER, 11);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_HEAVY_SNOW = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_HEAVY_SNOW", 21, AlerterController$Alerter$Type.BAD_WEATHER, 12);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_FLOOD = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_FLOOD", 22, AlerterController$Alerter$Type.BAD_WEATHER, 13);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_MONSOON = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_MONSOON", 23, AlerterController$Alerter$Type.BAD_WEATHER, 14);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_TORNADO = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_TORNADO", 24, AlerterController$Alerter$Type.BAD_WEATHER, 15);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_HEAT_WAVE = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_HEAT_WAVE", 25, AlerterController$Alerter$Type.BAD_WEATHER, 16);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_HURRICANE = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_HURRICANE", 26, AlerterController$Alerter$Type.BAD_WEATHER, 17);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_ON_ROAD_ICE = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_ON_ROAD_ICE", 27, AlerterController$Alerter$Type.BAD_WEATHER, 21);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_DEFAULT", 28, AlerterController$Alerter$Type.BAD_WEATHER, 26);
    public static final AlerterController$Alerter$Subtype BAD_WEATHER_TYPE_SLIPPERY_ROAD = new AlerterController$Alerter$Subtype("BAD_WEATHER_TYPE_SLIPPERY_ROAD", 29, AlerterController$Alerter$Type.BAD_WEATHER, 27);
    public static final AlerterController$Alerter$Subtype BLOCKED_LANE_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("BLOCKED_LANE_TYPE_DEFAULT", 30, AlerterController$Alerter$Type.BLOCKED_LANE, 0);
    public static final AlerterController$Alerter$Subtype BLOCKED_LANE_TYPE_LEFT = new AlerterController$Alerter$Subtype("BLOCKED_LANE_TYPE_LEFT", 31, AlerterController$Alerter$Type.BLOCKED_LANE, 1);
    public static final AlerterController$Alerter$Subtype BLOCKED_LANE_TYPE_CENTER = new AlerterController$Alerter$Subtype("BLOCKED_LANE_TYPE_CENTER", 32, AlerterController$Alerter$Type.BLOCKED_LANE, 2);
    public static final AlerterController$Alerter$Subtype BLOCKED_LANE_TYPE_RIGHT = new AlerterController$Alerter$Subtype("BLOCKED_LANE_TYPE_RIGHT", 33, AlerterController$Alerter$Type.BLOCKED_LANE, 3);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_SPEED_BUMP = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_SPEED_BUMP", 34, AlerterController$Alerter$Type.PERMANENT_HAZARD, 0);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_TOPES = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_TOPES", 35, AlerterController$Alerter$Type.PERMANENT_HAZARD, 1);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_TOLL_BOOTH = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_TOLL_BOOTH", 36, AlerterController$Alerter$Type.PERMANENT_HAZARD, 2);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_DANGEROUS_CURVE = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_DANGEROUS_CURVE", 37, AlerterController$Alerter$Type.PERMANENT_HAZARD, 3);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_FORK = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_FORK", 38, AlerterController$Alerter$Type.PERMANENT_HAZARD, 4);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_LANES_MERGING = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_LANES_MERGING", 39, AlerterController$Alerter$Type.PERMANENT_HAZARD, 5);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_INTERSECTION = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_INTERSECTION", 40, AlerterController$Alerter$Type.PERMANENT_HAZARD, 6);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_SCHOOL_ZONE = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_SCHOOL_ZONE", 41, AlerterController$Alerter$Type.PERMANENT_HAZARD, 7);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_LEFT_LANE_ENDING = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_LEFT_LANE_ENDING", 42, AlerterController$Alerter$Type.PERMANENT_HAZARD, 8);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_RIGHT_LANE_ENDING = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_RIGHT_LANE_ENDING", 43, AlerterController$Alerter$Type.PERMANENT_HAZARD, 9);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_RAISED_CROSSWALK = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_RAISED_CROSSWALK", 44, AlerterController$Alerter$Type.PERMANENT_HAZARD, 10);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_HIGHWAY_CROSSWALK = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_HIGHWAY_CROSSWALK", 45, AlerterController$Alerter$Type.PERMANENT_HAZARD, 11);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_LEFT_SHOULDER_ENDING = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_LEFT_SHOULDER_ENDING", 46, AlerterController$Alerter$Type.PERMANENT_HAZARD, 12);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_RIGHT_SHOULDER_ENDING = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_RIGHT_SHOULDER_ENDING", 47, AlerterController$Alerter$Type.PERMANENT_HAZARD, 13);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_BOTH_SHOULDER_ENDING = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_BOTH_SHOULDER_ENDING", 48, AlerterController$Alerter$Type.PERMANENT_HAZARD, 14);
    public static final AlerterController$Alerter$Subtype PERMANENT_HAZARD_TYPE_NARROW_BRIDGE = new AlerterController$Alerter$Subtype("PERMANENT_HAZARD_TYPE_NARROW_BRIDGE", 49, AlerterController$Alerter$Type.PERMANENT_HAZARD, 15);
    public static final AlerterController$Alerter$Subtype SPEED_LIMIT_DECREASE_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("SPEED_LIMIT_DECREASE_TYPE_DEFAULT", 50, AlerterController$Alerter$Type.SPEED_LIMIT_DECREASE, 1);
    public static final AlerterController$Alerter$Subtype PERSONAL_SAFETY_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("PERSONAL_SAFETY_TYPE_DEFAULT", 51, AlerterController$Alerter$Type.PERSONAL_SAFETY, 1);
    public static final AlerterController$Alerter$Subtype CLOSURE_TYPE_HAZARD = new AlerterController$Alerter$Subtype("CLOSURE_TYPE_HAZARD", 52, AlerterController$Alerter$Type.CLOSURE, 0);
    public static final AlerterController$Alerter$Subtype CLOSURE_TYPE_CONSTRUCTION = new AlerterController$Alerter$Subtype("CLOSURE_TYPE_CONSTRUCTION", 53, AlerterController$Alerter$Type.CLOSURE, 1);
    public static final AlerterController$Alerter$Subtype CLOSURE_TYPE_EVENT = new AlerterController$Alerter$Subtype("CLOSURE_TYPE_EVENT", 54, AlerterController$Alerter$Type.CLOSURE, 2);
    public static final AlerterController$Alerter$Subtype CLOSURE_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("CLOSURE_TYPE_DEFAULT", 55, AlerterController$Alerter$Type.CLOSURE, 3);
    public static final AlerterController$Alerter$Subtype SOS_TYPE_GENERAL_ASSISTANCE = new AlerterController$Alerter$Subtype("SOS_TYPE_GENERAL_ASSISTANCE", 56, AlerterController$Alerter$Type.SOS, 4);
    public static final AlerterController$Alerter$Subtype SOS_TYPE_EMPTY_TANK = new AlerterController$Alerter$Subtype("SOS_TYPE_EMPTY_TANK", 57, AlerterController$Alerter$Type.SOS, 1);
    public static final AlerterController$Alerter$Subtype SOS_TYPE_FLAT_TIRE = new AlerterController$Alerter$Subtype("SOS_TYPE_FLAT_TIRE", 58, AlerterController$Alerter$Type.SOS, 0);
    public static final AlerterController$Alerter$Subtype SOS_TYPE_BATTERY_ISSUE = new AlerterController$Alerter$Subtype("SOS_TYPE_BATTERY_ISSUE", 59, AlerterController$Alerter$Type.SOS, 5);
    public static final AlerterController$Alerter$Subtype SOS_TYPE_MEDICAL_ISSUE = new AlerterController$Alerter$Subtype("SOS_TYPE_MEDICAL_ISSUE", 60, AlerterController$Alerter$Type.SOS, 2);
    public static final AlerterController$Alerter$Subtype GUARDIAN_SHORT = new AlerterController$Alerter$Subtype("GUARDIAN_SHORT", 61, AlerterController$Alerter$Type.GUARDIAN, 0);
    public static final AlerterController$Alerter$Subtype GUARDIAN_LONG = new AlerterController$Alerter$Subtype("GUARDIAN_LONG", 62, AlerterController$Alerter$Type.GUARDIAN, 1);
    public static final AlerterController$Alerter$Subtype JAM_TYPE_MODERATE_TRAFFIC = new AlerterController$Alerter$Subtype("JAM_TYPE_MODERATE_TRAFFIC", 63, AlerterController$Alerter$Type.TRAFFIC_JAM, 0);
    public static final AlerterController$Alerter$Subtype JAM_TYPE_HEAVY_TRAFFIC = new AlerterController$Alerter$Subtype("JAM_TYPE_HEAVY_TRAFFIC", 64, AlerterController$Alerter$Type.TRAFFIC_JAM, 1);
    public static final AlerterController$Alerter$Subtype JAM_TYPE_STAND_STILL_TRAFFIC = new AlerterController$Alerter$Subtype("JAM_TYPE_STAND_STILL_TRAFFIC", 65, AlerterController$Alerter$Type.TRAFFIC_JAM, 2);
    public static final AlerterController$Alerter$Subtype JAM_TYPE_LIGHT_TRAFFIC = new AlerterController$Alerter$Subtype("JAM_TYPE_LIGHT_TRAFFIC", 66, AlerterController$Alerter$Type.TRAFFIC_JAM, 3);
    public static final AlerterController$Alerter$Subtype JAM_TYPE_CLOSED_ROAD = new AlerterController$Alerter$Subtype("JAM_TYPE_CLOSED_ROAD", 67, AlerterController$Alerter$Type.TRAFFIC_JAM, 5);
    public static final AlerterController$Alerter$Subtype JAM_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("JAM_TYPE_DEFAULT", 68, AlerterController$Alerter$Type.TRAFFIC_JAM, 6);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_UNKNOWN = new AlerterController$Alerter$Subtype("CAMERA_TYPE_UNKNOWN", 69, AlerterController$Alerter$Type.CAMERA, -1);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_SPEED = new AlerterController$Alerter$Subtype("CAMERA_TYPE_SPEED", 70, AlerterController$Alerter$Type.CAMERA, 0);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_REDLIGHT = new AlerterController$Alerter$Subtype("CAMERA_TYPE_REDLIGHT", 71, AlerterController$Alerter$Type.CAMERA, 1);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_DUMMY = new AlerterController$Alerter$Subtype("CAMERA_TYPE_DUMMY", 72, AlerterController$Alerter$Type.CAMERA, 2);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_RAILROAD = new AlerterController$Alerter$Subtype("CAMERA_TYPE_RAILROAD", 73, AlerterController$Alerter$Type.CAMERA, 3);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_HOV_LANE = new AlerterController$Alerter$Subtype("CAMERA_TYPE_HOV_LANE", 74, AlerterController$Alerter$Type.CAMERA, 4);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_HOV_LANE_BUS = new AlerterController$Alerter$Subtype("CAMERA_TYPE_HOV_LANE_BUS", 75, AlerterController$Alerter$Type.CAMERA, 5);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_HOV_LANE_CARPOOL = new AlerterController$Alerter$Subtype("CAMERA_TYPE_HOV_LANE_CARPOOL", 76, AlerterController$Alerter$Type.CAMERA, 6);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_RED_LIGHT_AND_SPEED = new AlerterController$Alerter$Subtype("CAMERA_TYPE_RED_LIGHT_AND_SPEED", 77, AlerterController$Alerter$Type.CAMERA, 7);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_ROAD_SAFETY_PHONE = new AlerterController$Alerter$Subtype("CAMERA_TYPE_ROAD_SAFETY_PHONE", 78, AlerterController$Alerter$Type.CAMERA, 8);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_ROAD_SAFETY_SEAT_BELT = new AlerterController$Alerter$Subtype("CAMERA_TYPE_ROAD_SAFETY_SEAT_BELT", 79, AlerterController$Alerter$Type.CAMERA, 9);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_ROAD_SAFETY_DISTANCE_BETWEEN_VEHICLES = new AlerterController$Alerter$Subtype("CAMERA_TYPE_ROAD_SAFETY_DISTANCE_BETWEEN_VEHICLES", 80, AlerterController$Alerter$Type.CAMERA, 10);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_ROAD_SAFETY_STOP_SIGN = new AlerterController$Alerter$Subtype("CAMERA_TYPE_ROAD_SAFETY_STOP_SIGN", 81, AlerterController$Alerter$Type.CAMERA, 11);
    public static final AlerterController$Alerter$Subtype CAMERA_TYPE_ROAD_SAFETY_NOISE = new AlerterController$Alerter$Subtype("CAMERA_TYPE_ROAD_SAFETY_NOISE", 82, AlerterController$Alerter$Type.CAMERA, 12);
    public static final AlerterController$Alerter$Subtype ACCIDENT_TYPE_MINOR = new AlerterController$Alerter$Subtype("ACCIDENT_TYPE_MINOR", 83, AlerterController$Alerter$Type.ACCIDENT, 0);
    public static final AlerterController$Alerter$Subtype ACCIDENT_TYPE_MAJOR = new AlerterController$Alerter$Subtype("ACCIDENT_TYPE_MAJOR", 84, AlerterController$Alerter$Type.ACCIDENT, 1);
    public static final AlerterController$Alerter$Subtype ACCIDENT_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("ACCIDENT_TYPE_DEFAULT", 85, AlerterController$Alerter$Type.ACCIDENT, 2);
    public static final AlerterController$Alerter$Subtype ACCIDENT_TYPE_PILE_UP = new AlerterController$Alerter$Subtype("ACCIDENT_TYPE_PILE_UP", 86, AlerterController$Alerter$Type.ACCIDENT, 3);
    public static final AlerterController$Alerter$Subtype POLICE_TYPE_VISIBLE = new AlerterController$Alerter$Subtype("POLICE_TYPE_VISIBLE", 87, AlerterController$Alerter$Type.POLICE, 0);
    public static final AlerterController$Alerter$Subtype POLICE_TYPE_HIDDEN = new AlerterController$Alerter$Subtype("POLICE_TYPE_HIDDEN", 88, AlerterController$Alerter$Type.POLICE, 1);
    public static final AlerterController$Alerter$Subtype POLICE_TYPE_MOBILE_CAMERA = new AlerterController$Alerter$Subtype("POLICE_TYPE_MOBILE_CAMERA", 89, AlerterController$Alerter$Type.POLICE, 2);
    public static final AlerterController$Alerter$Subtype MID_DRIVE_TOAST_TYPE_GENERAL = new AlerterController$Alerter$Subtype("MID_DRIVE_TOAST_TYPE_GENERAL", 90, AlerterController$Alerter$Type.MID_DRIVE_TOAST, 0);
    public static final AlerterController$Alerter$Subtype MID_DRIVE_TOAST_TYPE_THANK_YOU = new AlerterController$Alerter$Subtype("MID_DRIVE_TOAST_TYPE_THANK_YOU", 91, AlerterController$Alerter$Type.MID_DRIVE_TOAST, 1);
    public static final AlerterController$Alerter$Subtype MISC_HEADLIGHTS_REMINDER = new AlerterController$Alerter$Subtype("MISC_HEADLIGHTS_REMINDER", 92, AlerterController$Alerter$Type.OTHER, 0);
    public static final AlerterController$Alerter$Subtype ECO_TYPE_DEFAULT = new AlerterController$Alerter$Subtype("ECO_TYPE_DEFAULT", 93, AlerterController$Alerter$Type.ECO, 0);
    public static final AlerterController$Alerter$Subtype DANGER_ZONE_TYPE_NORMAL = new AlerterController$Alerter$Subtype("DANGER_ZONE_TYPE_NORMAL", 94, AlerterController$Alerter$Type.DANGER_ZONE, 0);
    public static final AlerterController$Alerter$Subtype DANGER_ZONE_TYPE_ISRAEL = new AlerterController$Alerter$Subtype("DANGER_ZONE_TYPE_ISRAEL", 95, AlerterController$Alerter$Type.DANGER_ZONE, 1);

    private static final /* synthetic */ AlerterController$Alerter$Subtype[] $values() {
        return new AlerterController$Alerter$Subtype[]{UNSPECIFIED, HAZARD_TYPE_ON_ROAD, HAZARD_TYPE_ON_SHOULDER, HAZARD_TYPE_WEATHER, HAZARD_TYPE_ON_ROAD_OBJECT, HAZARD_TYPE_ON_ROAD_POT_HOLE, HAZARD_TYPE_ON_ROAD_ROAD_KILL, HAZARD_TYPE_ON_SHOULDER_CAR_STOPPED, HAZARD_TYPE_ON_SHOULDER_ANIMALS, HAZARD_TYPE_ON_SHOULDER_MISSING_SIGN, HAZARD_TYPE_WEATHER_FREEZING_RAIN, HAZARD_TYPE_ON_ROAD_LANE_CLOSED, HAZARD_TYPE_ON_ROAD_OIL, HAZARD_TYPE_ON_ROAD_CONSTRUCTION, HAZARD_TYPE_ON_ROAD_CAR_STOPPED, HAZARD_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT, HAZARD_TYPE_DEFAULT, HAZARD_TYPE_EMERGENCY_VEHICLE, BAD_WEATHER_TYPE_FOG, BAD_WEATHER_TYPE_HAIL, BAD_WEATHER_TYPE_HEAVY_RAIN, BAD_WEATHER_TYPE_HEAVY_SNOW, BAD_WEATHER_TYPE_FLOOD, BAD_WEATHER_TYPE_MONSOON, BAD_WEATHER_TYPE_TORNADO, BAD_WEATHER_TYPE_HEAT_WAVE, BAD_WEATHER_TYPE_HURRICANE, BAD_WEATHER_TYPE_ON_ROAD_ICE, BAD_WEATHER_TYPE_DEFAULT, BAD_WEATHER_TYPE_SLIPPERY_ROAD, BLOCKED_LANE_TYPE_DEFAULT, BLOCKED_LANE_TYPE_LEFT, BLOCKED_LANE_TYPE_CENTER, BLOCKED_LANE_TYPE_RIGHT, PERMANENT_HAZARD_TYPE_SPEED_BUMP, PERMANENT_HAZARD_TYPE_TOPES, PERMANENT_HAZARD_TYPE_TOLL_BOOTH, PERMANENT_HAZARD_TYPE_DANGEROUS_CURVE, PERMANENT_HAZARD_TYPE_FORK, PERMANENT_HAZARD_TYPE_LANES_MERGING, PERMANENT_HAZARD_TYPE_INTERSECTION, PERMANENT_HAZARD_TYPE_SCHOOL_ZONE, PERMANENT_HAZARD_TYPE_LEFT_LANE_ENDING, PERMANENT_HAZARD_TYPE_RIGHT_LANE_ENDING, PERMANENT_HAZARD_TYPE_RAISED_CROSSWALK, PERMANENT_HAZARD_TYPE_HIGHWAY_CROSSWALK, PERMANENT_HAZARD_TYPE_LEFT_SHOULDER_ENDING, PERMANENT_HAZARD_TYPE_RIGHT_SHOULDER_ENDING, PERMANENT_HAZARD_TYPE_BOTH_SHOULDER_ENDING, PERMANENT_HAZARD_TYPE_NARROW_BRIDGE, SPEED_LIMIT_DECREASE_TYPE_DEFAULT, PERSONAL_SAFETY_TYPE_DEFAULT, CLOSURE_TYPE_HAZARD, CLOSURE_TYPE_CONSTRUCTION, CLOSURE_TYPE_EVENT, CLOSURE_TYPE_DEFAULT, SOS_TYPE_GENERAL_ASSISTANCE, SOS_TYPE_EMPTY_TANK, SOS_TYPE_FLAT_TIRE, SOS_TYPE_BATTERY_ISSUE, SOS_TYPE_MEDICAL_ISSUE, GUARDIAN_SHORT, GUARDIAN_LONG, JAM_TYPE_MODERATE_TRAFFIC, JAM_TYPE_HEAVY_TRAFFIC, JAM_TYPE_STAND_STILL_TRAFFIC, JAM_TYPE_LIGHT_TRAFFIC, JAM_TYPE_CLOSED_ROAD, JAM_TYPE_DEFAULT, CAMERA_TYPE_UNKNOWN, CAMERA_TYPE_SPEED, CAMERA_TYPE_REDLIGHT, CAMERA_TYPE_DUMMY, CAMERA_TYPE_RAILROAD, CAMERA_TYPE_HOV_LANE, CAMERA_TYPE_HOV_LANE_BUS, CAMERA_TYPE_HOV_LANE_CARPOOL, CAMERA_TYPE_RED_LIGHT_AND_SPEED, CAMERA_TYPE_ROAD_SAFETY_PHONE, CAMERA_TYPE_ROAD_SAFETY_SEAT_BELT, CAMERA_TYPE_ROAD_SAFETY_DISTANCE_BETWEEN_VEHICLES, CAMERA_TYPE_ROAD_SAFETY_STOP_SIGN, CAMERA_TYPE_ROAD_SAFETY_NOISE, ACCIDENT_TYPE_MINOR, ACCIDENT_TYPE_MAJOR, ACCIDENT_TYPE_DEFAULT, ACCIDENT_TYPE_PILE_UP, POLICE_TYPE_VISIBLE, POLICE_TYPE_HIDDEN, POLICE_TYPE_MOBILE_CAMERA, MID_DRIVE_TOAST_TYPE_GENERAL, MID_DRIVE_TOAST_TYPE_THANK_YOU, MISC_HEADLIGHTS_REMINDER, ECO_TYPE_DEFAULT, DANGER_ZONE_TYPE_NORMAL, DANGER_ZONE_TYPE_ISRAEL};
    }

    static {
        AlerterController$Alerter$Subtype[] alerterController$Alerter$SubtypeArr$values = $values();
        $VALUES = alerterController$Alerter$SubtypeArr$values;
        $ENTRIES = h.d.b.a(alerterController$Alerter$SubtypeArr$values);
    }

    private AlerterController$Alerter$Subtype(String str, int i2, AlerterController$Alerter$Type alerterController$Alerter$Type, int i3) {
        this.ofType = alerterController$Alerter$Type;
        this.valueInAlerter = i3;
    }

    public static h.d.a<AlerterController$Alerter$Subtype> getEntries() {
        return $ENTRIES;
    }

    public static AlerterController$Alerter$Subtype valueOf(String str) {
        return (AlerterController$Alerter$Subtype) Enum.valueOf(AlerterController$Alerter$Subtype.class, str);
    }

    public static AlerterController$Alerter$Subtype[] values() {
        return (AlerterController$Alerter$Subtype[]) $VALUES.clone();
    }

    public final AlerterController$Alerter$Type getOfType() {
        return this.ofType;
    }

    public final int getValueInAlerter() {
        return this.valueInAlerter;
    }
}
