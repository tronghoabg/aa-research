package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class rg extends com.google.v.du<rg, qw> implements com.google.v.fj {
    public static final int ARRIVAL_TYPE_FIELD_NUMBER = 3;
    private static final rg DEFAULT_INSTANCE;
    public static final int DESTINATION_REPORTING_QUESTION_TITLE_FIELD_NUMBER = 6;
    public static final int DESTINATION_REPORTING_QUESTION_TYPE_FIELD_NUMBER = 5;
    public static final int DESTINATION_REPORTING_SESSION_ID_FIELD_NUMBER = 1;
    public static final int DESTINATION_TYPE_FIELD_NUMBER = 2;
    public static final int DISTANCE_TO_DESTINATION_METERS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<rg> PARSER = null;
    public static final int SUGGESTED_ANSWERS_FIELD_NUMBER = 7;
    private int arrivalType_;
    private int bitField0_;
    private int destinationReportingQuestionTitle_;
    private int destinationReportingQuestionType_;
    private int destinationType_;
    private long distanceToDestinationMeters_;
    private String destinationReportingSessionId_ = "";
    private com.google.v.eo<qz> suggestedAnswers_ = emptyProtobufList();

    static {
        rg rgVar = new rg();
        DEFAULT_INSTANCE = rgVar;
        com.google.v.du.registerDefaultInstance(rg.class, rgVar);
    }

    private rg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedAnswers(Iterable<? extends qz> iterable) {
        ensureSuggestedAnswersIsMutable();
        com.google.v.c.addAll(iterable, this.suggestedAnswers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedAnswers(int i2, qz qzVar) {
        Objects.requireNonNull(qzVar);
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.add(i2, qzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrivalType() {
        this.arrivalType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationReportingQuestionTitle() {
        this.destinationReportingQuestionTitle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationReportingQuestionType() {
        this.destinationReportingQuestionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationReportingSessionId() {
        this.destinationReportingSessionId_ = getDefaultInstance().getDestinationReportingSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationType() {
        this.destinationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToDestinationMeters() {
        this.bitField0_ &= -2;
        this.distanceToDestinationMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedAnswers() {
        this.suggestedAnswers_ = emptyProtobufList();
    }

    private void ensureSuggestedAnswersIsMutable() {
        com.google.v.eo<qz> eoVar = this.suggestedAnswers_;
        if (eoVar.c()) {
            return;
        }
        this.suggestedAnswers_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static rg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qw newBuilder() {
        return (qw) DEFAULT_INSTANCE.createBuilder();
    }

    public static rg parseDelimitedFrom(InputStream inputStream) {
        return (rg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rg parseFrom(com.google.v.v vVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSuggestedAnswers(int i2) {
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrivalType(rb rbVar) {
        this.arrivalType_ = rbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrivalTypeValue(int i2) {
        this.arrivalType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingQuestionTitle(rd rdVar) {
        this.destinationReportingQuestionTitle_ = rdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingQuestionTitleValue(int i2) {
        this.destinationReportingQuestionTitle_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingQuestionType(re reVar) {
        this.destinationReportingQuestionType_ = reVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingQuestionTypeValue(int i2) {
        this.destinationReportingQuestionType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingSessionId(String str) {
        Objects.requireNonNull(str);
        this.destinationReportingSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingSessionIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.destinationReportingSessionId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationType(rc rcVar) {
        this.destinationType_ = rcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationTypeValue(int i2) {
        this.destinationType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToDestinationMeters(long j2) {
        this.bitField0_ |= 1;
        this.distanceToDestinationMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAnswers(int i2, qz qzVar) {
        Objects.requireNonNull(qzVar);
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.set(i2, qzVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\f\u0004ဂ\u0000\u0005\f\u0006\f\u0007\u001b", new Object[]{"bitField0_", "destinationReportingSessionId_", "destinationType_", "arrivalType_", "distanceToDestinationMeters_", "destinationReportingQuestionType_", "destinationReportingQuestionTitle_", "suggestedAnswers_", qz.class});
        }
        if (iOrdinal == 3) {
            return new rg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rb getArrivalType() {
        int i2 = this.arrivalType_;
        rb rbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : rb.PRE_ARRIVAL : rb.POST_ARRIVAL : rb.DESTINATION_REPORTING_ARRIVAL_TYPE_UNSPECIFIED;
        return rbVar == null ? rb.UNRECOGNIZED : rbVar;
    }

    public int getArrivalTypeValue() {
        return this.arrivalType_;
    }

    public rd getDestinationReportingQuestionTitle() {
        int i2 = this.destinationReportingQuestionTitle_;
        rd rdVar = i2 != 0 ? i2 != 1 ? null : rd.ARE_PARKING_SPOTS_AVAILABLE : rd.DESTINATION_REPORTING_QUESTION_TITLE_UNSPECIFIED;
        return rdVar == null ? rd.UNRECOGNIZED : rdVar;
    }

    public int getDestinationReportingQuestionTitleValue() {
        return this.destinationReportingQuestionTitle_;
    }

    public re getDestinationReportingQuestionType() {
        int i2 = this.destinationReportingQuestionType_;
        re reVar = i2 != 0 ? i2 != 1 ? null : re.END_OF_DRIVE_REPORTING : re.DESTINATION_REPORTING_QUESTION_TYPE_UNSPECIFIED;
        return reVar == null ? re.UNRECOGNIZED : reVar;
    }

    public int getDestinationReportingQuestionTypeValue() {
        return this.destinationReportingQuestionType_;
    }

    public String getDestinationReportingSessionId() {
        return this.destinationReportingSessionId_;
    }

    public com.google.v.v getDestinationReportingSessionIdBytes() {
        return com.google.v.v.s(this.destinationReportingSessionId_);
    }

    public rc getDestinationType() {
        int i2 = this.destinationType_;
        rc rcVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : rc.OTHER : rc.WORK : rc.HOME : rc.DESTINATION_REPORTING_NAVIGATION_DESTINATION_TYPE_UNSPECIFIED;
        return rcVar == null ? rc.UNRECOGNIZED : rcVar;
    }

    public int getDestinationTypeValue() {
        return this.destinationType_;
    }

    public long getDistanceToDestinationMeters() {
        return this.distanceToDestinationMeters_;
    }

    public qz getSuggestedAnswers(int i2) {
        return this.suggestedAnswers_.get(i2);
    }

    public int getSuggestedAnswersCount() {
        return this.suggestedAnswers_.size();
    }

    public List<qz> getSuggestedAnswersList() {
        return this.suggestedAnswers_;
    }

    public ra getSuggestedAnswersOrBuilder(int i2) {
        return this.suggestedAnswers_.get(i2);
    }

    public List<? extends ra> getSuggestedAnswersOrBuilderList() {
        return this.suggestedAnswers_;
    }

    public boolean hasDistanceToDestinationMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qw newBuilder(rg rgVar) {
        return (qw) DEFAULT_INSTANCE.createBuilder(rgVar);
    }

    public static rg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rg parseFrom(com.google.v.z zVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedAnswers(qz qzVar) {
        Objects.requireNonNull(qzVar);
        ensureSuggestedAnswersIsMutable();
        this.suggestedAnswers_.add(qzVar);
    }

    public static rg parseFrom(InputStream inputStream) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rg parseFrom(ByteBuffer byteBuffer) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rg parseFrom(byte[] bArr) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
