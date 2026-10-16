package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brz extends com.google.v.du<brz, bro> implements com.google.v.fj {
    public static final int ALERTER_SUBTYPE_FIELD_NUMBER = 9;
    public static final int ALERT_ID_FIELD_NUMBER = 3;
    public static final int ALERT_SUBTYPE_INT_FIELD_NUMBER = 11;
    public static final int ALERT_TYPE_FIELD_NUMBER = 8;
    public static final int ALERT_TYPE_INT_FIELD_NUMBER = 10;
    private static final brz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<brz> PARSER = null;
    public static final int QUESTION_TITLE_TYPE_FIELD_NUMBER = 4;
    public static final int SUGGESTED_ANSWERS_FIELD_NUMBER = 7;
    public static final int SUGGESTED_UGC_SUBTYPES_FIELD_NUMBER = 6;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 1;
    public static final int WAZE_ASKS_QUESTION_TYPE_FIELD_NUMBER = 2;
    private static final com.google.v.el<boa> suggestedUgcSubtypes_converter_ = new ve(20);
    private long alertId_;
    private long alertSubtypeInt_;
    private long alertTypeInt_;
    private int alertType_;
    private int alerterSubtype_;
    private int bitField0_;
    private int questionTitleType_;
    private int suggestedUgcSubtypesMemoizedSerializedSize;
    private int wazeAsksQuestionType_;
    private String ugcContextId_ = "";
    private com.google.v.ek suggestedUgcSubtypes_ = emptyIntList();
    private com.google.v.eo<brt> suggestedAnswers_ = emptyProtobufList();

    static {
        brz brzVar = new brz();
        DEFAULT_INSTANCE = brzVar;
        com.google.v.du.registerDefaultInstance(brz.class, brzVar);
    }

    private brz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedAnswers(Iterable<? extends brt> iterable) {
        ensureSuggestedAnswersIsMutable();
        com.google.v.c.addAll(iterable, this.suggestedAnswers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedUgcSubtypes(Iterable<? extends boa> iterable) {
        ensureSuggestedUgcSubtypesIsMutable();
        Iterator<? extends boa> it = iterable.iterator();
        while (it.hasNext()) {
            this.suggestedUgcSubtypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedUgcSubtypesValue(Iterable<Integer> iterable) {
        ensureSuggestedUgcSubtypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.suggestedUgcSubtypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedAnswers(int i2, brt brtVar) {
        Objects.requireNonNull(brtVar);
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.add(i2, brtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedUgcSubtypes(boa boaVar) {
        Objects.requireNonNull(boaVar);
        ensureSuggestedUgcSubtypesIsMutable();
        this.suggestedUgcSubtypes_.i(boaVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedUgcSubtypesValue(int i2) {
        ensureSuggestedUgcSubtypesIsMutable();
        this.suggestedUgcSubtypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.alertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertSubtypeInt() {
        this.bitField0_ &= -5;
        this.alertSubtypeInt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertTypeInt() {
        this.bitField0_ &= -3;
        this.alertTypeInt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterSubtype() {
        this.bitField0_ &= -2;
        this.alerterSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionTitleType() {
        this.questionTitleType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedAnswers() {
        this.suggestedAnswers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedUgcSubtypes() {
        this.suggestedUgcSubtypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeAsksQuestionType() {
        this.wazeAsksQuestionType_ = 0;
    }

    private void ensureSuggestedAnswersIsMutable() {
        com.google.v.eo<brt> eoVar = this.suggestedAnswers_;
        if (eoVar.c()) {
            return;
        }
        this.suggestedAnswers_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSuggestedUgcSubtypesIsMutable() {
        com.google.v.ek ekVar = this.suggestedUgcSubtypes_;
        if (ekVar.c()) {
            return;
        }
        this.suggestedUgcSubtypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static brz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bro newBuilder() {
        return (bro) DEFAULT_INSTANCE.createBuilder();
    }

    public static brz parseDelimitedFrom(InputStream inputStream) {
        return (brz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brz parseFrom(com.google.v.v vVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<brz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSuggestedAnswers(int i2) {
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(long j2) {
        this.alertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSubtypeInt(long j2) {
        this.bitField0_ |= 4;
        this.alertSubtypeInt_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(de deVar) {
        this.alertType_ = deVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertTypeInt(long j2) {
        this.bitField0_ |= 2;
        this.alertTypeInt_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertTypeValue(int i2) {
        this.alertType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterSubtype(dd ddVar) {
        this.alerterSubtype_ = ddVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterSubtypeValue(int i2) {
        this.bitField0_ |= 1;
        this.alerterSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionTitleType(brp brpVar) {
        this.questionTitleType_ = brpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionTitleTypeValue(int i2) {
        this.questionTitleType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAnswers(int i2, brt brtVar) {
        Objects.requireNonNull(brtVar);
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.set(i2, brtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedUgcSubtypes(int i2, boa boaVar) {
        Objects.requireNonNull(boaVar);
        ensureSuggestedUgcSubtypesIsMutable();
        this.suggestedUgcSubtypes_.e(i2, boaVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedUgcSubtypesValue(int i2, int i3) {
        ensureSuggestedUgcSubtypesIsMutable();
        this.suggestedUgcSubtypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAsksQuestionType(bry bryVar) {
        this.wazeAsksQuestionType_ = bryVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeAsksQuestionTypeValue(int i2) {
        this.wazeAsksQuestionType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\f\u0006,\u0007\u001b\b\f\tဌ\u0000\nဂ\u0001\u000bဂ\u0002", new Object[]{"bitField0_", "ugcContextId_", "wazeAsksQuestionType_", "alertId_", "questionTitleType_", "suggestedUgcSubtypes_", "suggestedAnswers_", brt.class, "alertType_", "alerterSubtype_", "alertTypeInt_", "alertSubtypeInt_"});
        }
        if (iOrdinal == 3) {
            return new brz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bro(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<brz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (brz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAlertId() {
        return this.alertId_;
    }

    public long getAlertSubtypeInt() {
        return this.alertSubtypeInt_;
    }

    @Deprecated
    public de getAlertType() {
        de deVarA = de.a(this.alertType_);
        return deVarA == null ? de.UNRECOGNIZED : deVarA;
    }

    public long getAlertTypeInt() {
        return this.alertTypeInt_;
    }

    @Deprecated
    public int getAlertTypeValue() {
        return this.alertType_;
    }

    @Deprecated
    public dd getAlerterSubtype() {
        dd ddVar;
        switch (this.alerterSubtype_) {
            case 0:
                ddVar = dd.ALERTER_SUBTYPE_UNSPECIFIED;
                break;
            case 1:
                ddVar = dd.BAD_WEATHER_DEFAULT;
                break;
            case 2:
                ddVar = dd.BAD_WEATHER_FLOOD;
                break;
            case 3:
                ddVar = dd.BAD_WEATHER_FOG;
                break;
            case 4:
                ddVar = dd.BAD_WEATHER_FREEZING_RAIN;
                break;
            case 5:
                ddVar = dd.BAD_WEATHER_HAIL;
                break;
            case 6:
                ddVar = dd.BAD_WEATHER_HEAT_WAVE;
                break;
            case 7:
                ddVar = dd.BAD_WEATHER_HEAVY_RAIN;
                break;
            case 8:
                ddVar = dd.BAD_WEATHER_HEAVY_SNOW;
                break;
            case 9:
                ddVar = dd.BAD_WEATHER_HURRICANE;
                break;
            case 10:
                ddVar = dd.BAD_WEATHER_ICY_ROAD;
                break;
            case 11:
                ddVar = dd.BAD_WEATHER_MONSOON;
                break;
            case 12:
                ddVar = dd.BAD_WEATHER_SLIPPERY_ROAD;
                break;
            case 13:
                ddVar = dd.BAD_WEATHER_TORNADO;
                break;
            case 14:
                ddVar = dd.BAD_WEATHER_UNPLOWED_ROAD;
                break;
            case 15:
                ddVar = dd.BLOCKED_LANE_DEFAULT;
                break;
            case 16:
                ddVar = dd.BLOCKED_LANE_CENTER;
                break;
            case 17:
                ddVar = dd.BLOCKED_LANE_LEFT;
                break;
            case 18:
                ddVar = dd.BLOCKED_LANE_RIGHT;
                break;
            case 19:
                ddVar = dd.CRASH_DEFAULT;
                break;
            case 20:
                ddVar = dd.CRASH_MAJOR;
                break;
            case 21:
                ddVar = dd.CRASH_MINOR;
                break;
            case 22:
                ddVar = dd.CRASH_PILE_UP;
                break;
            case 23:
                ddVar = dd.GUARDIAN_LONG;
                break;
            case 24:
                ddVar = dd.GUARDIAN_SHORT;
                break;
            case 25:
                ddVar = dd.HAZARD_DEFAULT;
                break;
            case 26:
                ddVar = dd.HAZARD_ANIMALS;
                break;
            case 27:
                ddVar = dd.HAZARD_BROKEN_TRAFFIC_LIGHT;
                break;
            case 28:
                ddVar = dd.HAZARD_CONSTRUCTION;
                break;
            case 29:
                ddVar = dd.HAZARD_MISSING_SIGN;
                break;
            case 30:
                ddVar = dd.HAZARD_OBJECT_ON_ROAD;
                break;
            case 31:
                ddVar = dd.HAZARD_OIL;
                break;
            case 32:
                ddVar = dd.HAZARD_ON_ROAD;
                break;
            case 33:
                ddVar = dd.HAZARD_POTHOLE;
                break;
            case 34:
                ddVar = dd.HAZARD_ROAD_KILL;
                break;
            case 35:
                ddVar = dd.HAZARD_SHOULDER;
                break;
            case 36:
                ddVar = dd.HAZARD_SHOULDER_VEHICLE_STOPPED;
                break;
            case 37:
                ddVar = dd.HAZARD_VEHICLE_STOPPED;
                break;
            case 38:
                ddVar = dd.HAZARD_WEATHER;
                break;
            case 39:
                ddVar = dd.MISC_HEADLIGHTS_REMINDER;
                break;
            case 40:
                ddVar = dd.POLICE_DEFAULT;
                break;
            case 41:
                ddVar = dd.POLICE_HIDDEN;
                break;
            case 42:
                ddVar = dd.POLICE_VISIBLE;
                break;
            case 43:
                ddVar = dd.ROAD_CLOSED_DEFAULT;
                break;
            case 44:
                ddVar = dd.ROAD_CLOSED_CONSTRUCTION;
                break;
            case 45:
                ddVar = dd.ROAD_CLOSED_EVENT;
                break;
            case 46:
                ddVar = dd.ROAD_CLOSED_HAZARD;
                break;
            case 47:
                ddVar = dd.SOS_BATTERY_ISSUE;
                break;
            case 48:
                ddVar = dd.SOS_FLAT_TIRE;
                break;
            case 49:
                ddVar = dd.SOS_MECHANICAL_PROBLEM;
                break;
            case 50:
                ddVar = dd.SOS_MEDICAL_HELP;
                break;
            case 51:
                ddVar = dd.SOS_NO_FUEL;
                break;
            case 52:
                ddVar = dd.SOS_OTHER;
                break;
            case 53:
                ddVar = dd.TRAFFIC_DEFAULT;
                break;
            case 54:
                ddVar = dd.TRAFFIC_HEAVY;
                break;
            case 55:
                ddVar = dd.TRAFFIC_LIGHT;
                break;
            case 56:
                ddVar = dd.TRAFFIC_MODERATE;
                break;
            case 57:
                ddVar = dd.TRAFFIC_STANDSTILL;
                break;
            case 58:
                ddVar = dd.SPEED_LIMIT_DECREASE_DEFAULT;
                break;
            case 59:
                ddVar = dd.PERSONAL_SAFETY_DEFAULT;
                break;
            case 60:
                ddVar = dd.CAMERA_DUMMY_DEFAULT;
                break;
            case 61:
                ddVar = dd.CAMERA_HOV_LANE;
                break;
            case 62:
                ddVar = dd.CAMERA_BUS_LANE;
                break;
            case 63:
                ddVar = dd.CAMERA_CARPOOL_LANE;
                break;
            case 64:
                ddVar = dd.CAMERA_RAILROAD;
                break;
            case 65:
                ddVar = dd.CAMERA_RED_LIGHT;
                break;
            case 66:
                ddVar = dd.CAMERA_LOW_EMISSION_ZONE;
                break;
            case 67:
                ddVar = dd.CAMERA_ULTRA_LOW_EMISSION_ZONE;
                break;
            case 68:
                ddVar = dd.CAMERA_CITY_HISTORICAL_CENTER;
                break;
            case 69:
                ddVar = dd.CAMERA_CLEAN_AIR_ZONE;
                break;
            case 70:
                ddVar = dd.CAMERA_NATIONAL_PARK;
                break;
            case 71:
                ddVar = dd.CAMERA_CONGESTION_CHARGE_ZONE;
                break;
            case 72:
                ddVar = dd.CAMERA_LIMITED_TRAFFIC_ZONE;
                break;
            case 73:
                ddVar = dd.CAMERA_PHONE_ENFORCEMENT;
                break;
            case 74:
                ddVar = dd.CAMERA_SEATBELT_ENFORCEMENT;
                break;
            case 75:
                ddVar = dd.CAMERA_DISTANCE_BETWEEN_VEHICLES_ENFORCEMENT;
                break;
            case 76:
                ddVar = dd.CAMERA_STOP_SIGN_ENFORCEMENT;
                break;
            case 77:
                ddVar = dd.CAMERA_ROAD_SAFETY_ENFORCEMENT_NOISE_ENFORCEMENT;
                break;
            case 78:
                ddVar = dd.CAMERA_SPEED_DEFAULT;
                break;
            case 79:
                ddVar = dd.SCHOOL_ZONE_DEFAULT;
                break;
            case 80:
                ddVar = dd.POLICE_MOBILE_CAMERA;
                break;
            default:
                ddVar = null;
                break;
        }
        return ddVar == null ? dd.UNRECOGNIZED : ddVar;
    }

    @Deprecated
    public int getAlerterSubtypeValue() {
        return this.alerterSubtype_;
    }

    public brp getQuestionTitleType() {
        brp brpVar;
        switch (this.questionTitleType_) {
            case 0:
                brpVar = brp.QUESTION_TITLE_TYPE_UNSPECIFIED;
                break;
            case 1:
                brpVar = brp.ENRICH_ALERT_WHAT_DO_YOU_SEE;
                break;
            case 2:
                brpVar = brp.ENRICH_CONSTRUCTION_ALERT_ARE_LANES_BLOCKED;
                break;
            case 3:
                brpVar = brp.FEEDBACK_ALERT_IS_THIS_ALERT_HELPFUL;
                break;
            case 4:
                brpVar = brp.MULTI_CAR_ON_SHOULDER_PEOPLE_AROUND;
                break;
            case 5:
                brpVar = brp.MULTI_CAR_ON_SHOULDER_CLOSE_TO_LANE;
                break;
            case 6:
                brpVar = brp.MULTI_CAR_ON_SHOULDER_CLEARLY_MARKED;
                break;
            default:
                brpVar = null;
                break;
        }
        return brpVar == null ? brp.UNRECOGNIZED : brpVar;
    }

    public int getQuestionTitleTypeValue() {
        return this.questionTitleType_;
    }

    public brt getSuggestedAnswers(int i2) {
        return this.suggestedAnswers_.get(i2);
    }

    public int getSuggestedAnswersCount() {
        return this.suggestedAnswers_.size();
    }

    public List<brt> getSuggestedAnswersList() {
        return this.suggestedAnswers_;
    }

    public bru getSuggestedAnswersOrBuilder(int i2) {
        return this.suggestedAnswers_.get(i2);
    }

    public List<? extends bru> getSuggestedAnswersOrBuilderList() {
        return this.suggestedAnswers_;
    }

    public boa getSuggestedUgcSubtypes(int i2) {
        boa boaVarA = boa.a(this.suggestedUgcSubtypes_.d(i2));
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getSuggestedUgcSubtypesCount() {
        return this.suggestedUgcSubtypes_.size();
    }

    public List<boa> getSuggestedUgcSubtypesList() {
        return new com.google.v.em(this.suggestedUgcSubtypes_, suggestedUgcSubtypes_converter_);
    }

    public int getSuggestedUgcSubtypesValue(int i2) {
        return this.suggestedUgcSubtypes_.d(i2);
    }

    public List<Integer> getSuggestedUgcSubtypesValueList() {
        return this.suggestedUgcSubtypes_;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public bry getWazeAsksQuestionType() {
        int i2 = this.wazeAsksQuestionType_;
        bry bryVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bry.MULTI_ASK : bry.FEEDBACK_ALERT : bry.ENRICH_ALERT : bry.QUESTION_TYPE_UNSPECIFIED;
        return bryVar == null ? bry.UNRECOGNIZED : bryVar;
    }

    public int getWazeAsksQuestionTypeValue() {
        return this.wazeAsksQuestionType_;
    }

    public boolean hasAlertSubtypeInt() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAlertTypeInt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasAlerterSubtype() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bro newBuilder(brz brzVar) {
        return (bro) DEFAULT_INSTANCE.createBuilder(brzVar);
    }

    public static brz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static brz parseFrom(com.google.v.z zVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static brz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedAnswers(brt brtVar) {
        Objects.requireNonNull(brtVar);
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.add(brtVar);
    }

    public static brz parseFrom(InputStream inputStream) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brz parseFrom(ByteBuffer byteBuffer) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static brz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static brz parseFrom(byte[] bArr) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static brz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (brz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
