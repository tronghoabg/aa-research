package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avs extends com.google.v.du<avs, avp> implements com.google.v.fj {
    public static final int ALERT_REASON_FIELD_NUMBER = 12;
    private static final avs DEFAULT_INSTANCE;
    public static final int HAS_TOLL_FIELD_NUMBER = 8;
    public static final int IGNORE_REASON_FIELD_NUMBER = 2;
    public static final int METERS_FROM_NEXT_TURN_FIELD_NUMBER = 5;
    public static final int METERS_TO_DECISION_POINT_FIELD_NUMBER = 6;
    public static final int MINUTES_SAVED_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<avs> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 3;
    public static final int SECONDS_FROM_NEXT_TURN_FIELD_NUMBER = 9;
    public static final int SECONDS_TO_DECISION_POINT_FIELD_NUMBER = 10;
    public static final int SUGGESTED_ALTERNATE_ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int TIME_SINCE_RECEIVED_SECONDS_FIELD_NUMBER = 4;
    private int alertReason_;
    private int bitField0_;
    private boolean hasToll_;
    private int ignoreReason_;
    private long metersFromNextTurn_;
    private long metersToDecisionPoint_;
    private long minutesSaved_;
    private int result_;
    private long secondsFromNextTurn_;
    private long secondsToDecisionPoint_;
    private String suggestedAlternateRouteUuid_ = "";
    private long timeSinceReceivedSeconds_;

    static {
        avs avsVar = new avs();
        DEFAULT_INSTANCE = avsVar;
        com.google.v.du.registerDefaultInstance(avs.class, avsVar);
    }

    private avs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertReason() {
        this.bitField0_ &= -129;
        this.alertReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasToll() {
        this.bitField0_ &= -17;
        this.hasToll_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnoreReason() {
        this.ignoreReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetersFromNextTurn() {
        this.bitField0_ &= -3;
        this.metersFromNextTurn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetersToDecisionPoint() {
        this.bitField0_ &= -5;
        this.metersToDecisionPoint_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinutesSaved() {
        this.bitField0_ &= -9;
        this.minutesSaved_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsFromNextTurn() {
        this.bitField0_ &= -33;
        this.secondsFromNextTurn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsToDecisionPoint() {
        this.bitField0_ &= -65;
        this.secondsToDecisionPoint_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedAlternateRouteUuid() {
        this.suggestedAlternateRouteUuid_ = getDefaultInstance().getSuggestedAlternateRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSinceReceivedSeconds() {
        this.bitField0_ &= -2;
        this.timeSinceReceivedSeconds_ = 0L;
    }

    public static avs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avp newBuilder() {
        return (avp) DEFAULT_INSTANCE.createBuilder();
    }

    public static avs parseDelimitedFrom(InputStream inputStream) {
        return (avs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avs parseFrom(com.google.v.v vVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertReason(de deVar) {
        this.alertReason_ = deVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertReasonValue(int i2) {
        this.bitField0_ |= 128;
        this.alertReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasToll(boolean z) {
        this.bitField0_ |= 16;
        this.hasToll_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnoreReason(avq avqVar) {
        this.ignoreReason_ = avqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnoreReasonValue(int i2) {
        this.ignoreReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetersFromNextTurn(long j2) {
        this.bitField0_ |= 2;
        this.metersFromNextTurn_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetersToDecisionPoint(long j2) {
        this.bitField0_ |= 4;
        this.metersToDecisionPoint_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinutesSaved(long j2) {
        this.bitField0_ |= 8;
        this.minutesSaved_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(avr avrVar) {
        this.result_ = avrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultValue(int i2) {
        this.result_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsFromNextTurn(long j2) {
        this.bitField0_ |= 32;
        this.secondsFromNextTurn_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsToDecisionPoint(long j2) {
        this.bitField0_ |= 64;
        this.secondsToDecisionPoint_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAlternateRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.suggestedAlternateRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAlternateRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.suggestedAlternateRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSinceReceivedSeconds(long j2) {
        this.bitField0_ |= 1;
        this.timeSinceReceivedSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004ဂ\u0000\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဇ\u0004\tဂ\u0005\nဂ\u0006\fဌ\u0007", new Object[]{"bitField0_", "suggestedAlternateRouteUuid_", "ignoreReason_", "result_", "timeSinceReceivedSeconds_", "metersFromNextTurn_", "metersToDecisionPoint_", "minutesSaved_", "hasToll_", "secondsFromNextTurn_", "secondsToDecisionPoint_", "alertReason_"});
        }
        if (iOrdinal == 3) {
            return new avs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public de getAlertReason() {
        de deVarA = de.a(this.alertReason_);
        return deVarA == null ? de.UNRECOGNIZED : deVarA;
    }

    public int getAlertReasonValue() {
        return this.alertReason_;
    }

    public boolean getHasToll() {
        return this.hasToll_;
    }

    public avq getIgnoreReason() {
        avq avqVar;
        switch (this.ignoreReason_) {
            case 0:
                avqVar = avq.IGNORE_REASON_UNSPECIFIED;
                break;
            case 1:
                avqVar = avq.CLOSE_TO_SHOWN_REASSURANCE_DETOUR;
                break;
            case 2:
                avqVar = avq.CLOSE_TO_SPLIT_POINT;
                break;
            case 3:
                avqVar = avq.EXPLICIT;
                break;
            case 4:
                avqVar = avq.INVALID_CASE;
                break;
            case 5:
                avqVar = avq.NO_SPLIT_POINT;
                break;
            case 6:
                avqVar = avq.PREVIOUS_REROUTE_NOT_RESOLVED;
                break;
            case 7:
                avqVar = avq.RECENT_USER_DECLINE;
                break;
            case 8:
                avqVar = avq.TIMEOUT;
                break;
            case 9:
                avqVar = avq.ACCEPTED_FRESHER_SUGGESTION;
                break;
            case 10:
                avqVar = avq.CARPLAY_IN_DASHBOARD_MODE;
                break;
            default:
                avqVar = null;
                break;
        }
        return avqVar == null ? avq.UNRECOGNIZED : avqVar;
    }

    public int getIgnoreReasonValue() {
        return this.ignoreReason_;
    }

    public long getMetersFromNextTurn() {
        return this.metersFromNextTurn_;
    }

    public long getMetersToDecisionPoint() {
        return this.metersToDecisionPoint_;
    }

    public long getMinutesSaved() {
        return this.minutesSaved_;
    }

    public avr getResult() {
        int i2 = this.result_;
        avr avrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : avr.SILENT : avr.IGNORED : avr.DISPLAYED_ALERTER_ONLY : avr.DISPLAYED : avr.RESULT_UNSPECIFIED;
        return avrVar == null ? avr.UNRECOGNIZED : avrVar;
    }

    public int getResultValue() {
        return this.result_;
    }

    public long getSecondsFromNextTurn() {
        return this.secondsFromNextTurn_;
    }

    public long getSecondsToDecisionPoint() {
        return this.secondsToDecisionPoint_;
    }

    public String getSuggestedAlternateRouteUuid() {
        return this.suggestedAlternateRouteUuid_;
    }

    public com.google.v.v getSuggestedAlternateRouteUuidBytes() {
        return com.google.v.v.s(this.suggestedAlternateRouteUuid_);
    }

    public long getTimeSinceReceivedSeconds() {
        return this.timeSinceReceivedSeconds_;
    }

    public boolean hasAlertReason() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasHasToll() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMetersFromNextTurn() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetersToDecisionPoint() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMinutesSaved() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSecondsFromNextTurn() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSecondsToDecisionPoint() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTimeSinceReceivedSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static avp newBuilder(avs avsVar) {
        return (avp) DEFAULT_INSTANCE.createBuilder(avsVar);
    }

    public static avs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avs parseFrom(com.google.v.z zVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avs parseFrom(InputStream inputStream) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avs parseFrom(ByteBuffer byteBuffer) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avs parseFrom(byte[] bArr) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
