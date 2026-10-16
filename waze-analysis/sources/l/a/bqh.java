package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqh extends com.google.v.du<bqh, bqg> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int AND_THEN_INSTRUCTION_FIELD_NUMBER = 4;
    public static final int AND_THEN_PHRASE_FIELD_NUMBER = 14;
    public static final int ANNOUNCEMENT_DISTANCE_FIELD_NUMBER = 6;
    public static final int ANNOUNCEMENT_DISTANCE_METERS_ACTUAL_FIELD_NUMBER = 16;
    public static final int ANNOUNCEMENT_PARAMS_FIELD_NUMBER = 11;
    public static final int ANNOUNCEMENT_TYPE_FIELD_NUMBER = 7;
    public static final int CURRENT_SPEED_KMH_FIELD_NUMBER = 10;
    private static final bqh DEFAULT_INSTANCE;
    public static final int DISTANCE_PHRASE_FIELD_NUMBER = 12;
    public static final int GROUP_CROSS_TIME_SECONDS_FIELD_NUMBER = 8;
    public static final int GROUP_LENGTH_METERS_FIELD_NUMBER = 9;
    public static final int INSTRUCTION_FIELD_NUMBER = 3;
    public static final int INSTRUCTION_PHRASE_FIELD_NUMBER = 13;
    public static final int INSTRUCTION_SEGMENT_INDEX_FIELD_NUMBER = 15;
    private static volatile com.google.v.fo<bqh> PARSER = null;
    public static final int ROUTE_SEGMENT_ID_FIELD_NUMBER = 2;
    public static final int VOICE_INSTRUCTIONS_MODE_FIELD_NUMBER = 5;
    private ej andThenInstruction_;
    private long announcementDistanceMetersActual_;
    private es announcementDistance_;
    private eu announcementParams_;
    private int bitField0_;
    private int currentSpeedKmh_;
    private int groupCrossTimeSeconds_;
    private int groupLengthMeters_;
    private long instructionSegmentIndex_;
    private aev instruction_;
    private int routeSegmentId_;
    private String alternativeRouteUuid_ = "";
    private String voiceInstructionsMode_ = "";
    private String announcementType_ = "";
    private String distancePhrase_ = "";
    private String instructionPhrase_ = "";
    private String andThenPhrase_ = "";

    static {
        bqh bqhVar = new bqh();
        DEFAULT_INSTANCE = bqhVar;
        com.google.v.du.registerDefaultInstance(bqh.class, bqhVar);
    }

    private bqh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndThenInstruction() {
        this.andThenInstruction_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndThenPhrase() {
        this.andThenPhrase_ = getDefaultInstance().getAndThenPhrase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementDistance() {
        this.announcementDistance_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementDistanceMetersActual() {
        this.bitField0_ &= -513;
        this.announcementDistanceMetersActual_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementParams() {
        this.announcementParams_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementType() {
        this.announcementType_ = getDefaultInstance().getAnnouncementType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentSpeedKmh() {
        this.bitField0_ &= -65;
        this.currentSpeedKmh_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistancePhrase() {
        this.distancePhrase_ = getDefaultInstance().getDistancePhrase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupCrossTimeSeconds() {
        this.bitField0_ &= -17;
        this.groupCrossTimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupLengthMeters() {
        this.bitField0_ &= -33;
        this.groupLengthMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instruction_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionPhrase() {
        this.instructionPhrase_ = getDefaultInstance().getInstructionPhrase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionSegmentIndex() {
        this.bitField0_ &= -257;
        this.instructionSegmentIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteSegmentId() {
        this.bitField0_ &= -2;
        this.routeSegmentId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructionsMode() {
        this.voiceInstructionsMode_ = getDefaultInstance().getVoiceInstructionsMode();
    }

    public static bqh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndThenInstruction(ej ejVar) {
        Objects.requireNonNull(ejVar);
        ej ejVar2 = this.andThenInstruction_;
        if (ejVar2 != null && ejVar2 != ej.getDefaultInstance()) {
            ei eiVarNewBuilder = ej.newBuilder(ejVar2);
            eiVarNewBuilder.mergeFrom((ei) ejVar);
            ejVar = eiVarNewBuilder.buildPartial();
        }
        this.andThenInstruction_ = ejVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnnouncementDistance(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.announcementDistance_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.announcementDistance_ = esVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnnouncementParams(eu euVar) {
        Objects.requireNonNull(euVar);
        eu euVar2 = this.announcementParams_;
        if (euVar2 != null && euVar2 != eu.getDefaultInstance()) {
            et etVarNewBuilder = eu.newBuilder(euVar2);
            etVarNewBuilder.mergeFrom((et) euVar);
            euVar = etVarNewBuilder.buildPartial();
        }
        this.announcementParams_ = euVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstruction(aev aevVar) {
        Objects.requireNonNull(aevVar);
        aev aevVar2 = this.instruction_;
        if (aevVar2 != null && aevVar2 != aev.getDefaultInstance()) {
            aeu aeuVarNewBuilder = aev.newBuilder(aevVar2);
            aeuVarNewBuilder.mergeFrom((aeu) aevVar);
            aevVar = aeuVarNewBuilder.buildPartial();
        }
        this.instruction_ = aevVar;
        this.bitField0_ |= 2;
    }

    public static bqg newBuilder() {
        return (bqg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqh parseDelimitedFrom(InputStream inputStream) {
        return (bqh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqh parseFrom(com.google.v.v vVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndThenInstruction(ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.andThenInstruction_ = ejVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndThenPhrase(String str) {
        Objects.requireNonNull(str);
        this.andThenPhrase_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndThenPhraseBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.andThenPhrase_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementDistance(es esVar) {
        Objects.requireNonNull(esVar);
        this.announcementDistance_ = esVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementDistanceMetersActual(long j2) {
        this.bitField0_ |= 512;
        this.announcementDistanceMetersActual_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementParams(eu euVar) {
        Objects.requireNonNull(euVar);
        this.announcementParams_ = euVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementType(String str) {
        Objects.requireNonNull(str);
        this.announcementType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.announcementType_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSpeedKmh(int i2) {
        this.bitField0_ |= 64;
        this.currentSpeedKmh_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistancePhrase(String str) {
        Objects.requireNonNull(str);
        this.distancePhrase_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistancePhraseBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.distancePhrase_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupCrossTimeSeconds(int i2) {
        this.bitField0_ |= 16;
        this.groupCrossTimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupLengthMeters(int i2) {
        this.bitField0_ |= 32;
        this.groupLengthMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(aev aevVar) {
        Objects.requireNonNull(aevVar);
        this.instruction_ = aevVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionPhrase(String str) {
        Objects.requireNonNull(str);
        this.instructionPhrase_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionPhraseBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.instructionPhrase_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionSegmentIndex(long j2) {
        this.bitField0_ |= 256;
        this.instructionSegmentIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteSegmentId(int i2) {
        this.bitField0_ |= 1;
        this.routeSegmentId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsMode(String str) {
        Objects.requireNonNull(str);
        this.voiceInstructionsMode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsModeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.voiceInstructionsMode_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002င\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006ဉ\u0003\u0007Ȉ\bင\u0004\tင\u0005\nင\u0006\u000bဉ\u0007\fȈ\rȈ\u000eȈ\u000fဂ\b\u0010ဂ\t", new Object[]{"bitField0_", "alternativeRouteUuid_", "routeSegmentId_", "instruction_", "andThenInstruction_", "voiceInstructionsMode_", "announcementDistance_", "announcementType_", "groupCrossTimeSeconds_", "groupLengthMeters_", "currentSpeedKmh_", "announcementParams_", "distancePhrase_", "instructionPhrase_", "andThenPhrase_", "instructionSegmentIndex_", "announcementDistanceMetersActual_"});
        }
        if (iOrdinal == 3) {
            return new bqh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public ej getAndThenInstruction() {
        ej ejVar = this.andThenInstruction_;
        return ejVar == null ? ej.getDefaultInstance() : ejVar;
    }

    public String getAndThenPhrase() {
        return this.andThenPhrase_;
    }

    public com.google.v.v getAndThenPhraseBytes() {
        return com.google.v.v.s(this.andThenPhrase_);
    }

    public es getAnnouncementDistance() {
        es esVar = this.announcementDistance_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public long getAnnouncementDistanceMetersActual() {
        return this.announcementDistanceMetersActual_;
    }

    public eu getAnnouncementParams() {
        eu euVar = this.announcementParams_;
        return euVar == null ? eu.getDefaultInstance() : euVar;
    }

    public String getAnnouncementType() {
        return this.announcementType_;
    }

    public com.google.v.v getAnnouncementTypeBytes() {
        return com.google.v.v.s(this.announcementType_);
    }

    public int getCurrentSpeedKmh() {
        return this.currentSpeedKmh_;
    }

    public String getDistancePhrase() {
        return this.distancePhrase_;
    }

    public com.google.v.v getDistancePhraseBytes() {
        return com.google.v.v.s(this.distancePhrase_);
    }

    public int getGroupCrossTimeSeconds() {
        return this.groupCrossTimeSeconds_;
    }

    public int getGroupLengthMeters() {
        return this.groupLengthMeters_;
    }

    public aev getInstruction() {
        aev aevVar = this.instruction_;
        return aevVar == null ? aev.getDefaultInstance() : aevVar;
    }

    public String getInstructionPhrase() {
        return this.instructionPhrase_;
    }

    public com.google.v.v getInstructionPhraseBytes() {
        return com.google.v.v.s(this.instructionPhrase_);
    }

    public long getInstructionSegmentIndex() {
        return this.instructionSegmentIndex_;
    }

    public int getRouteSegmentId() {
        return this.routeSegmentId_;
    }

    public String getVoiceInstructionsMode() {
        return this.voiceInstructionsMode_;
    }

    public com.google.v.v getVoiceInstructionsModeBytes() {
        return com.google.v.v.s(this.voiceInstructionsMode_);
    }

    public boolean hasAndThenInstruction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAnnouncementDistance() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAnnouncementDistanceMetersActual() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAnnouncementParams() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCurrentSpeedKmh() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasGroupCrossTimeSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasGroupLengthMeters() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasInstruction() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInstructionSegmentIndex() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRouteSegmentId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bqg newBuilder(bqh bqhVar) {
        return (bqg) DEFAULT_INSTANCE.createBuilder(bqhVar);
    }

    public static bqh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqh parseFrom(com.google.v.z zVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqh parseFrom(InputStream inputStream) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqh parseFrom(ByteBuffer byteBuffer) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqh parseFrom(byte[] bArr) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
