package com.waze.jni.protos.navigate;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.PolylineGeometry;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventOnRoute extends du<EventOnRoute, Builder> implements EventOnRouteOrBuilder {
    public static final int ALERTID_FIELD_NUMBER = 1;
    public static final int ALERTSUBTYPE_FIELD_NUMBER = 3;
    public static final int ALERTTYPE_FIELD_NUMBER = 2;
    private static final EventOnRoute DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 11;
    public static final int GEOMETRY_FIELD_NUMBER = 19;
    public static final int ISMAJOREVENT_FIELD_NUMBER = 10;
    public static final int ISPARTIALLANECLOSURE_FIELD_NUMBER = 23;
    public static final int JAMID_FIELD_NUMBER = 22;
    public static final int LOCATION_FIELD_NUMBER = 18;
    private static volatile fo<EventOnRoute> PARSER = null;
    public static final int POSEND_FIELD_NUMBER = 7;
    public static final int POSSTART_FIELD_NUMBER = 6;
    public static final int RATIOONROADEND_FIELD_NUMBER = 9;
    public static final int RATIOONROADSTART_FIELD_NUMBER = 8;
    public static final int ROADINFOSEVERITY_FIELD_NUMBER = 5;
    private long alertId_;
    private int alertSubType_;
    private int alertType_;
    private int bitField0_;
    private int duration_;
    private PolylineGeometry geometry_;
    private boolean isMajorEvent_;
    private boolean isPartialLaneClosure_;
    private long jamId_;
    private Position.IntPosition location_;
    private Position.IntPosition posEnd_;
    private Position.IntPosition posStart_;
    private double ratioOnRoadEnd_;
    private double ratioOnRoadStart_;
    private int roadInfoSeverity_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.EventOnRoute$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public enum AlertSubType implements eg {
        NO_SUBTYPE(0),
        POLICE_VISIBLE(1),
        POLICE_HIDING(2),
        ACCIDENT_MINOR(3),
        ACCIDENT_MAJOR(4),
        JAM_MODERATE_TRAFFIC(5),
        JAM_HEAVY_TRAFFIC(6),
        JAM_STAND_STILL_TRAFFIC(7),
        JAM_LIGHT_TRAFFIC(8),
        HAZARD_ON_ROAD(9),
        HAZARD_ON_SHOULDER(10),
        HAZARD_WEATHER(11),
        HAZARD_ON_ROAD_OBJECT(12),
        HAZARD_ON_ROAD_POT_HOLE(13),
        HAZARD_ON_ROAD_ROAD_KILL(14),
        HAZARD_ON_SHOULDER_CAR_STOPPED(15),
        HAZARD_ON_SHOULDER_ANIMALS(16),
        HAZARD_ON_SHOULDER_MISSING_SIGN(17),
        HAZARD_WEATHER_FOG(18),
        HAZARD_WEATHER_HAIL(19),
        HAZARD_WEATHER_HEAVY_RAIN(20),
        HAZARD_WEATHER_HEAVY_SNOW(21),
        HAZARD_WEATHER_FLOOD(22),
        HAZARD_WEATHER_MONSOON(23),
        HAZARD_WEATHER_TORNADO(24),
        HAZARD_WEATHER_HEAT_WAVE(25),
        HAZARD_WEATHER_HURRICANE(26),
        HAZARD_WEATHER_FREEZING_RAIN(27),
        HAZARD_ON_ROAD_LANE_CLOSED(28),
        HAZARD_ON_ROAD_OIL(29),
        HAZARD_ON_ROAD_ICE(30),
        HAZARD_ON_ROAD_CONSTRUCTION(31),
        HAZARD_ON_ROAD_CAR_STOPPED(32),
        HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT(33),
        ROAD_CLOSED_HAZARD(34),
        ROAD_CLOSED_CONSTRUCTION(35),
        ROAD_CLOSED_EVENT(36),
        PARKED_ON(37),
        PARKED_OFF(38),
        SOS_FLAT_TIRE(1601),
        SOS_NO_FUEL(1602),
        SOS_MEDICAL_HELP(1603),
        SOS_MECHANICAL_PROBLEM(1604),
        SOS_OTHER(1605),
        SOS_BATTERY_ISSUE(1606),
        UNRECOGNIZED(-1);

        public static final int ACCIDENT_MAJOR_VALUE = 4;
        public static final int ACCIDENT_MINOR_VALUE = 3;
        public static final int HAZARD_ON_ROAD_CAR_STOPPED_VALUE = 32;
        public static final int HAZARD_ON_ROAD_CONSTRUCTION_VALUE = 31;
        public static final int HAZARD_ON_ROAD_ICE_VALUE = 30;
        public static final int HAZARD_ON_ROAD_LANE_CLOSED_VALUE = 28;
        public static final int HAZARD_ON_ROAD_OBJECT_VALUE = 12;
        public static final int HAZARD_ON_ROAD_OIL_VALUE = 29;
        public static final int HAZARD_ON_ROAD_POT_HOLE_VALUE = 13;
        public static final int HAZARD_ON_ROAD_ROAD_KILL_VALUE = 14;
        public static final int HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT_VALUE = 33;
        public static final int HAZARD_ON_ROAD_VALUE = 9;
        public static final int HAZARD_ON_SHOULDER_ANIMALS_VALUE = 16;
        public static final int HAZARD_ON_SHOULDER_CAR_STOPPED_VALUE = 15;
        public static final int HAZARD_ON_SHOULDER_MISSING_SIGN_VALUE = 17;
        public static final int HAZARD_ON_SHOULDER_VALUE = 10;
        public static final int HAZARD_WEATHER_FLOOD_VALUE = 22;
        public static final int HAZARD_WEATHER_FOG_VALUE = 18;
        public static final int HAZARD_WEATHER_FREEZING_RAIN_VALUE = 27;
        public static final int HAZARD_WEATHER_HAIL_VALUE = 19;
        public static final int HAZARD_WEATHER_HEAT_WAVE_VALUE = 25;
        public static final int HAZARD_WEATHER_HEAVY_RAIN_VALUE = 20;
        public static final int HAZARD_WEATHER_HEAVY_SNOW_VALUE = 21;
        public static final int HAZARD_WEATHER_HURRICANE_VALUE = 26;
        public static final int HAZARD_WEATHER_MONSOON_VALUE = 23;
        public static final int HAZARD_WEATHER_TORNADO_VALUE = 24;
        public static final int HAZARD_WEATHER_VALUE = 11;
        public static final int JAM_HEAVY_TRAFFIC_VALUE = 6;
        public static final int JAM_LIGHT_TRAFFIC_VALUE = 8;
        public static final int JAM_MODERATE_TRAFFIC_VALUE = 5;
        public static final int JAM_STAND_STILL_TRAFFIC_VALUE = 7;
        public static final int NO_SUBTYPE_VALUE = 0;
        public static final int PARKED_OFF_VALUE = 38;
        public static final int PARKED_ON_VALUE = 37;
        public static final int POLICE_HIDING_VALUE = 2;
        public static final int POLICE_VISIBLE_VALUE = 1;
        public static final int ROAD_CLOSED_CONSTRUCTION_VALUE = 35;
        public static final int ROAD_CLOSED_EVENT_VALUE = 36;
        public static final int ROAD_CLOSED_HAZARD_VALUE = 34;
        public static final int SOS_BATTERY_ISSUE_VALUE = 1606;
        public static final int SOS_FLAT_TIRE_VALUE = 1601;
        public static final int SOS_MECHANICAL_PROBLEM_VALUE = 1604;
        public static final int SOS_MEDICAL_HELP_VALUE = 1603;
        public static final int SOS_NO_FUEL_VALUE = 1602;
        public static final int SOS_OTHER_VALUE = 1605;
        private static final eh<AlertSubType> internalValueMap = new eh<AlertSubType>() { // from class: com.waze.jni.protos.navigate.EventOnRoute.AlertSubType.1
            @Override // com.google.v.eh
            public AlertSubType findValueByNumber(int i2) {
                return AlertSubType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AlertSubTypeVerifier implements ei {
            static final ei INSTANCE = new AlertSubTypeVerifier();

            private AlertSubTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AlertSubType.forNumber(i2) != null;
            }
        }

        AlertSubType(int i2) {
            this.value = i2;
        }

        public static AlertSubType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return NO_SUBTYPE;
                case 1:
                    return POLICE_VISIBLE;
                case 2:
                    return POLICE_HIDING;
                case 3:
                    return ACCIDENT_MINOR;
                case 4:
                    return ACCIDENT_MAJOR;
                case 5:
                    return JAM_MODERATE_TRAFFIC;
                case 6:
                    return JAM_HEAVY_TRAFFIC;
                case 7:
                    return JAM_STAND_STILL_TRAFFIC;
                case 8:
                    return JAM_LIGHT_TRAFFIC;
                case 9:
                    return HAZARD_ON_ROAD;
                case 10:
                    return HAZARD_ON_SHOULDER;
                case 11:
                    return HAZARD_WEATHER;
                case 12:
                    return HAZARD_ON_ROAD_OBJECT;
                case 13:
                    return HAZARD_ON_ROAD_POT_HOLE;
                case 14:
                    return HAZARD_ON_ROAD_ROAD_KILL;
                case 15:
                    return HAZARD_ON_SHOULDER_CAR_STOPPED;
                case 16:
                    return HAZARD_ON_SHOULDER_ANIMALS;
                case 17:
                    return HAZARD_ON_SHOULDER_MISSING_SIGN;
                case 18:
                    return HAZARD_WEATHER_FOG;
                case 19:
                    return HAZARD_WEATHER_HAIL;
                case 20:
                    return HAZARD_WEATHER_HEAVY_RAIN;
                case 21:
                    return HAZARD_WEATHER_HEAVY_SNOW;
                case 22:
                    return HAZARD_WEATHER_FLOOD;
                case 23:
                    return HAZARD_WEATHER_MONSOON;
                case 24:
                    return HAZARD_WEATHER_TORNADO;
                case 25:
                    return HAZARD_WEATHER_HEAT_WAVE;
                case 26:
                    return HAZARD_WEATHER_HURRICANE;
                case 27:
                    return HAZARD_WEATHER_FREEZING_RAIN;
                case 28:
                    return HAZARD_ON_ROAD_LANE_CLOSED;
                case 29:
                    return HAZARD_ON_ROAD_OIL;
                case 30:
                    return HAZARD_ON_ROAD_ICE;
                case 31:
                    return HAZARD_ON_ROAD_CONSTRUCTION;
                case 32:
                    return HAZARD_ON_ROAD_CAR_STOPPED;
                case 33:
                    return HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT;
                case 34:
                    return ROAD_CLOSED_HAZARD;
                case 35:
                    return ROAD_CLOSED_CONSTRUCTION;
                case 36:
                    return ROAD_CLOSED_EVENT;
                case 37:
                    return PARKED_ON;
                case 38:
                    return PARKED_OFF;
                default:
                    switch (i2) {
                        case 1601:
                            return SOS_FLAT_TIRE;
                        case 1602:
                            return SOS_NO_FUEL;
                        case 1603:
                            return SOS_MEDICAL_HELP;
                        case 1604:
                            return SOS_MECHANICAL_PROBLEM;
                        case 1605:
                            return SOS_OTHER;
                        case 1606:
                            return SOS_BATTERY_ISSUE;
                        default:
                            return null;
                    }
            }
        }

        public static eh<AlertSubType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AlertSubTypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public enum AlertType implements eg {
        CHIT_CHAT(0),
        POLICE(1),
        ACCIDENT(2),
        JAM(3),
        TRAFFIC_INFO(4),
        HAZARD(5),
        MISC(6),
        CONSTRUCTION(7),
        PARKING(8),
        DYNAMIC(9),
        CAMERA(10),
        PARKED(11),
        ROAD_CLOSED(12),
        UNKNOWN(13),
        SYSTEM_ROAD_CLOSED(14),
        SOS(15),
        UNRECOGNIZED(-1);

        public static final int ACCIDENT_VALUE = 2;
        public static final int CAMERA_VALUE = 10;
        public static final int CHIT_CHAT_VALUE = 0;
        public static final int CONSTRUCTION_VALUE = 7;
        public static final int DYNAMIC_VALUE = 9;
        public static final int HAZARD_VALUE = 5;
        public static final int JAM_VALUE = 3;
        public static final int MISC_VALUE = 6;
        public static final int PARKED_VALUE = 11;
        public static final int PARKING_VALUE = 8;
        public static final int POLICE_VALUE = 1;
        public static final int ROAD_CLOSED_VALUE = 12;
        public static final int SOS_VALUE = 15;
        public static final int SYSTEM_ROAD_CLOSED_VALUE = 14;
        public static final int TRAFFIC_INFO_VALUE = 4;
        public static final int UNKNOWN_VALUE = 13;
        private static final eh<AlertType> internalValueMap = new eh<AlertType>() { // from class: com.waze.jni.protos.navigate.EventOnRoute.AlertType.1
            @Override // com.google.v.eh
            public AlertType findValueByNumber(int i2) {
                return AlertType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AlertTypeVerifier implements ei {
            static final ei INSTANCE = new AlertTypeVerifier();

            private AlertTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AlertType.forNumber(i2) != null;
            }
        }

        AlertType(int i2) {
            this.value = i2;
        }

        public static AlertType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return CHIT_CHAT;
                case 1:
                    return POLICE;
                case 2:
                    return ACCIDENT;
                case 3:
                    return JAM;
                case 4:
                    return TRAFFIC_INFO;
                case 5:
                    return HAZARD;
                case 6:
                    return MISC;
                case 7:
                    return CONSTRUCTION;
                case 8:
                    return PARKING;
                case 9:
                    return DYNAMIC;
                case 10:
                    return CAMERA;
                case 11:
                    return PARKED;
                case 12:
                    return ROAD_CLOSED;
                case 13:
                    return UNKNOWN;
                case 14:
                    return SYSTEM_ROAD_CLOSED;
                case 15:
                    return SOS;
                default:
                    return null;
            }
        }

        public static eh<AlertType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AlertTypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        EventOnRoute eventOnRoute = new EventOnRoute();
        DEFAULT_INSTANCE = eventOnRoute;
        du.registerDefaultInstance(EventOnRoute.class, eventOnRoute);
    }

    private EventOnRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.bitField0_ &= -2;
        this.alertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertSubType() {
        this.alertSubType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.bitField0_ &= -129;
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometry_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMajorEvent() {
        this.bitField0_ &= -65;
        this.isMajorEvent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPartialLaneClosure() {
        this.bitField0_ &= -2049;
        this.isPartialLaneClosure_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamId() {
        this.bitField0_ &= -1025;
        this.jamId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosEnd() {
        this.posEnd_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosStart() {
        this.posStart_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRatioOnRoadEnd() {
        this.bitField0_ &= -33;
        this.ratioOnRoadEnd_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRatioOnRoadStart() {
        this.bitField0_ &= -17;
        this.ratioOnRoadStart_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadInfoSeverity() {
        this.bitField0_ &= -3;
        this.roadInfoSeverity_ = 0;
    }

    public static EventOnRoute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometry(PolylineGeometry polylineGeometry) {
        Objects.requireNonNull(polylineGeometry);
        PolylineGeometry polylineGeometry2 = this.geometry_;
        if (polylineGeometry2 != null && polylineGeometry2 != PolylineGeometry.getDefaultInstance()) {
            PolylineGeometry.Builder builderNewBuilder = PolylineGeometry.newBuilder(polylineGeometry2);
            builderNewBuilder.mergeFrom((PolylineGeometry.Builder) polylineGeometry);
            polylineGeometry = builderNewBuilder.buildPartial();
        }
        this.geometry_ = polylineGeometry;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.location_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.location_ = intPosition;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosEnd(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.posEnd_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.posEnd_ = intPosition;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosStart(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.posStart_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.posStart_ = intPosition;
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventOnRoute parseDelimitedFrom(InputStream inputStream) {
        return (EventOnRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventOnRoute parseFrom(v vVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EventOnRoute> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(long j2) {
        this.bitField0_ |= 1;
        this.alertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSubType(AlertSubType alertSubType) {
        this.alertSubType_ = alertSubType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSubTypeValue(int i2) {
        this.alertSubType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(AlertType alertType) {
        this.alertType_ = alertType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertTypeValue(int i2) {
        this.alertType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i2) {
        this.bitField0_ |= 128;
        this.duration_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometry(PolylineGeometry polylineGeometry) {
        Objects.requireNonNull(polylineGeometry);
        this.geometry_ = polylineGeometry;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMajorEvent(boolean z) {
        this.bitField0_ |= 64;
        this.isMajorEvent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPartialLaneClosure(boolean z) {
        this.bitField0_ |= 2048;
        this.isPartialLaneClosure_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamId(long j2) {
        this.bitField0_ |= 1024;
        this.jamId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.location_ = intPosition;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosEnd(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.posEnd_ = intPosition;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosStart(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.posStart_ = intPosition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRatioOnRoadEnd(double d2) {
        this.bitField0_ |= 32;
        this.ratioOnRoadEnd_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRatioOnRoadStart(double d2) {
        this.bitField0_ |= 16;
        this.ratioOnRoadStart_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadInfoSeverity(int i2) {
        this.bitField0_ |= 2;
        this.roadInfoSeverity_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0000\u0000\u0001ဂ\u0000\u0002\f\u0003\f\u0005င\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bက\u0004\tက\u0005\nဇ\u0006\u000bင\u0007\u0012ဉ\b\u0013ဉ\t\u0016ဂ\n\u0017ဇ\u000b", new Object[]{"bitField0_", "alertId_", "alertType_", "alertSubType_", "roadInfoSeverity_", "posStart_", "posEnd_", "ratioOnRoadStart_", "ratioOnRoadEnd_", "isMajorEvent_", "duration_", "location_", "geometry_", "jamId_", "isPartialLaneClosure_"});
        }
        if (iOrdinal == 3) {
            return new EventOnRoute();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<EventOnRoute> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EventOnRoute.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public long getAlertId() {
        return this.alertId_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public AlertSubType getAlertSubType() {
        AlertSubType alertSubTypeForNumber = AlertSubType.forNumber(this.alertSubType_);
        return alertSubTypeForNumber == null ? AlertSubType.UNRECOGNIZED : alertSubTypeForNumber;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public int getAlertSubTypeValue() {
        return this.alertSubType_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public AlertType getAlertType() {
        AlertType alertTypeForNumber = AlertType.forNumber(this.alertType_);
        return alertTypeForNumber == null ? AlertType.UNRECOGNIZED : alertTypeForNumber;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public int getAlertTypeValue() {
        return this.alertType_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public PolylineGeometry getGeometry() {
        PolylineGeometry polylineGeometry = this.geometry_;
        return polylineGeometry == null ? PolylineGeometry.getDefaultInstance() : polylineGeometry;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean getIsMajorEvent() {
        return this.isMajorEvent_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean getIsPartialLaneClosure() {
        return this.isPartialLaneClosure_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public long getJamId() {
        return this.jamId_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public Position.IntPosition getLocation() {
        Position.IntPosition intPosition = this.location_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    @Deprecated
    public Position.IntPosition getPosEnd() {
        Position.IntPosition intPosition = this.posEnd_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    @Deprecated
    public Position.IntPosition getPosStart() {
        Position.IntPosition intPosition = this.posStart_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public double getRatioOnRoadEnd() {
        return this.ratioOnRoadEnd_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public double getRatioOnRoadStart() {
        return this.ratioOnRoadStart_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public int getRoadInfoSeverity() {
        return this.roadInfoSeverity_;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasDuration() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasGeometry() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasIsMajorEvent() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasIsPartialLaneClosure() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasJamId() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasLocation() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    @Deprecated
    public boolean hasPosEnd() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    @Deprecated
    public boolean hasPosStart() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasRatioOnRoadEnd() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasRatioOnRoadStart() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
    public boolean hasRoadInfoSeverity() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(EventOnRoute eventOnRoute) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(eventOnRoute);
    }

    public static EventOnRoute parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EventOnRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EventOnRoute parseFrom(v vVar, de deVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EventOnRoute parseFrom(z zVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EventOnRoute parseFrom(z zVar, de deVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static EventOnRoute parseFrom(InputStream inputStream) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EventOnRoute parseFrom(InputStream inputStream, de deVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EventOnRoute parseFrom(ByteBuffer byteBuffer) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EventOnRoute parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EventOnRoute, Builder> implements EventOnRouteOrBuilder {
        private Builder() {
            super(EventOnRoute.DEFAULT_INSTANCE);
        }

        public Builder clearAlertId() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearAlertId();
            return this;
        }

        public Builder clearAlertSubType() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearAlertSubType();
            return this;
        }

        public Builder clearAlertType() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearAlertType();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearDuration();
            return this;
        }

        public Builder clearGeometry() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearGeometry();
            return this;
        }

        public Builder clearIsMajorEvent() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearIsMajorEvent();
            return this;
        }

        public Builder clearIsPartialLaneClosure() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearIsPartialLaneClosure();
            return this;
        }

        public Builder clearJamId() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearJamId();
            return this;
        }

        public Builder clearLocation() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearLocation();
            return this;
        }

        @Deprecated
        public Builder clearPosEnd() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearPosEnd();
            return this;
        }

        @Deprecated
        public Builder clearPosStart() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearPosStart();
            return this;
        }

        public Builder clearRatioOnRoadEnd() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearRatioOnRoadEnd();
            return this;
        }

        public Builder clearRatioOnRoadStart() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearRatioOnRoadStart();
            return this;
        }

        public Builder clearRoadInfoSeverity() {
            copyOnWrite();
            ((EventOnRoute) this.instance).clearRoadInfoSeverity();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public long getAlertId() {
            return ((EventOnRoute) this.instance).getAlertId();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public AlertSubType getAlertSubType() {
            return ((EventOnRoute) this.instance).getAlertSubType();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public int getAlertSubTypeValue() {
            return ((EventOnRoute) this.instance).getAlertSubTypeValue();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public AlertType getAlertType() {
            return ((EventOnRoute) this.instance).getAlertType();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public int getAlertTypeValue() {
            return ((EventOnRoute) this.instance).getAlertTypeValue();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public int getDuration() {
            return ((EventOnRoute) this.instance).getDuration();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public PolylineGeometry getGeometry() {
            return ((EventOnRoute) this.instance).getGeometry();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean getIsMajorEvent() {
            return ((EventOnRoute) this.instance).getIsMajorEvent();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean getIsPartialLaneClosure() {
            return ((EventOnRoute) this.instance).getIsPartialLaneClosure();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public long getJamId() {
            return ((EventOnRoute) this.instance).getJamId();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public Position.IntPosition getLocation() {
            return ((EventOnRoute) this.instance).getLocation();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        @Deprecated
        public Position.IntPosition getPosEnd() {
            return ((EventOnRoute) this.instance).getPosEnd();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        @Deprecated
        public Position.IntPosition getPosStart() {
            return ((EventOnRoute) this.instance).getPosStart();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public double getRatioOnRoadEnd() {
            return ((EventOnRoute) this.instance).getRatioOnRoadEnd();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public double getRatioOnRoadStart() {
            return ((EventOnRoute) this.instance).getRatioOnRoadStart();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public int getRoadInfoSeverity() {
            return ((EventOnRoute) this.instance).getRoadInfoSeverity();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasAlertId() {
            return ((EventOnRoute) this.instance).hasAlertId();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasDuration() {
            return ((EventOnRoute) this.instance).hasDuration();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasGeometry() {
            return ((EventOnRoute) this.instance).hasGeometry();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasIsMajorEvent() {
            return ((EventOnRoute) this.instance).hasIsMajorEvent();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasIsPartialLaneClosure() {
            return ((EventOnRoute) this.instance).hasIsPartialLaneClosure();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasJamId() {
            return ((EventOnRoute) this.instance).hasJamId();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasLocation() {
            return ((EventOnRoute) this.instance).hasLocation();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        @Deprecated
        public boolean hasPosEnd() {
            return ((EventOnRoute) this.instance).hasPosEnd();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        @Deprecated
        public boolean hasPosStart() {
            return ((EventOnRoute) this.instance).hasPosStart();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasRatioOnRoadEnd() {
            return ((EventOnRoute) this.instance).hasRatioOnRoadEnd();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasRatioOnRoadStart() {
            return ((EventOnRoute) this.instance).hasRatioOnRoadStart();
        }

        @Override // com.waze.jni.protos.navigate.EventOnRouteOrBuilder
        public boolean hasRoadInfoSeverity() {
            return ((EventOnRoute) this.instance).hasRoadInfoSeverity();
        }

        public Builder mergeGeometry(PolylineGeometry polylineGeometry) {
            copyOnWrite();
            ((EventOnRoute) this.instance).mergeGeometry(polylineGeometry);
            return this;
        }

        public Builder mergeLocation(Position.IntPosition intPosition) {
            copyOnWrite();
            ((EventOnRoute) this.instance).mergeLocation(intPosition);
            return this;
        }

        @Deprecated
        public Builder mergePosEnd(Position.IntPosition intPosition) {
            copyOnWrite();
            ((EventOnRoute) this.instance).mergePosEnd(intPosition);
            return this;
        }

        @Deprecated
        public Builder mergePosStart(Position.IntPosition intPosition) {
            copyOnWrite();
            ((EventOnRoute) this.instance).mergePosStart(intPosition);
            return this;
        }

        public Builder setAlertId(long j2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setAlertId(j2);
            return this;
        }

        public Builder setAlertSubType(AlertSubType alertSubType) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setAlertSubType(alertSubType);
            return this;
        }

        public Builder setAlertSubTypeValue(int i2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setAlertSubTypeValue(i2);
            return this;
        }

        public Builder setAlertType(AlertType alertType) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setAlertType(alertType);
            return this;
        }

        public Builder setAlertTypeValue(int i2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setAlertTypeValue(i2);
            return this;
        }

        public Builder setDuration(int i2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setDuration(i2);
            return this;
        }

        public Builder setGeometry(PolylineGeometry.Builder builder) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setGeometry(builder.build());
            return this;
        }

        public Builder setIsMajorEvent(boolean z) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setIsMajorEvent(z);
            return this;
        }

        public Builder setIsPartialLaneClosure(boolean z) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setIsPartialLaneClosure(z);
            return this;
        }

        public Builder setJamId(long j2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setJamId(j2);
            return this;
        }

        public Builder setLocation(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setLocation(builder.build());
            return this;
        }

        @Deprecated
        public Builder setPosEnd(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setPosEnd(builder.build());
            return this;
        }

        @Deprecated
        public Builder setPosStart(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setPosStart(builder.build());
            return this;
        }

        public Builder setRatioOnRoadEnd(double d2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setRatioOnRoadEnd(d2);
            return this;
        }

        public Builder setRatioOnRoadStart(double d2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setRatioOnRoadStart(d2);
            return this;
        }

        public Builder setRoadInfoSeverity(int i2) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setRoadInfoSeverity(i2);
            return this;
        }

        public Builder setGeometry(PolylineGeometry polylineGeometry) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setGeometry(polylineGeometry);
            return this;
        }

        public Builder setLocation(Position.IntPosition intPosition) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setLocation(intPosition);
            return this;
        }

        @Deprecated
        public Builder setPosEnd(Position.IntPosition intPosition) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setPosEnd(intPosition);
            return this;
        }

        @Deprecated
        public Builder setPosStart(Position.IntPosition intPosition) {
            copyOnWrite();
            ((EventOnRoute) this.instance).setPosStart(intPosition);
            return this;
        }
    }

    public static EventOnRoute parseFrom(byte[] bArr) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EventOnRoute parseFrom(byte[] bArr, de deVar) {
        return (EventOnRoute) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
