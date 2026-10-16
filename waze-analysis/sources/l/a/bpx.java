package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpx extends com.google.v.du<bpx, bpv> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int ANNOUNCEMENT_CHUNKS_FIELD_NUMBER = 8;
    public static final int ANNOUNCEMENT_DISTANCE_METERS_ACTUAL_FIELD_NUMBER = 5;
    public static final int ANNOUNCEMENT_DISTANCE_METERS_PLAYED_FIELD_NUMBER = 6;
    public static final int ANNOUNCEMENT_ID_FIELD_NUMBER = 3;
    public static final int CURRENT_SPEED_KMH_FIELD_NUMBER = 7;
    private static final bpx DEFAULT_INSTANCE;
    public static final int ESTIMATED_DURATION_MS_FIELD_NUMBER = 10;
    public static final int IS_LOCAL_ANNOUNCEMENT_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<bpx> PARSER = null;
    public static final int ROUTE_SEGMENT_INDEX_FIELD_NUMBER = 2;
    public static final int VOICE_INSTRUCTIONS_MODE_FIELD_NUMBER = 4;
    private String alternativeRouteUuid_ = "";
    private com.google.v.eo<ep> announcementChunks_ = emptyProtobufList();
    private long announcementDistanceMetersActual_;
    private long announcementDistanceMetersPlayed_;
    private long announcementId_;
    private int bitField0_;
    private long currentSpeedKmh_;
    private long estimatedDurationMs_;
    private boolean isLocalAnnouncement_;
    private long routeSegmentIndex_;
    private int voiceInstructionsMode_;

    static {
        bpx bpxVar = new bpx();
        DEFAULT_INSTANCE = bpxVar;
        com.google.v.du.registerDefaultInstance(bpx.class, bpxVar);
    }

    private bpx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnnouncementChunks(Iterable<? extends ep> iterable) {
        ensureAnnouncementChunksIsMutable();
        com.google.v.c.addAll(iterable, this.announcementChunks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnouncementChunks(int i2, ep epVar) {
        Objects.requireNonNull(epVar);
        ensureAnnouncementChunksIsMutable();
        this.announcementChunks_.add(i2, epVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementChunks() {
        this.announcementChunks_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementDistanceMetersActual() {
        this.bitField0_ &= -5;
        this.announcementDistanceMetersActual_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementDistanceMetersPlayed() {
        this.bitField0_ &= -9;
        this.announcementDistanceMetersPlayed_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncementId() {
        this.bitField0_ &= -3;
        this.announcementId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentSpeedKmh() {
        this.bitField0_ &= -17;
        this.currentSpeedKmh_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEstimatedDurationMs() {
        this.bitField0_ &= -65;
        this.estimatedDurationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLocalAnnouncement() {
        this.bitField0_ &= -33;
        this.isLocalAnnouncement_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteSegmentIndex() {
        this.bitField0_ &= -2;
        this.routeSegmentIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructionsMode() {
        this.voiceInstructionsMode_ = 0;
    }

    private void ensureAnnouncementChunksIsMutable() {
        com.google.v.eo<ep> eoVar = this.announcementChunks_;
        if (eoVar.c()) {
            return;
        }
        this.announcementChunks_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bpx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bpv newBuilder() {
        return (bpv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpx parseDelimitedFrom(InputStream inputStream) {
        return (bpx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpx parseFrom(com.google.v.v vVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnnouncementChunks(int i2) {
        ensureAnnouncementChunksIsMutable();
        this.announcementChunks_.remove(i2);
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
    public void setAnnouncementChunks(int i2, ep epVar) {
        Objects.requireNonNull(epVar);
        ensureAnnouncementChunksIsMutable();
        this.announcementChunks_.set(i2, epVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementDistanceMetersActual(long j2) {
        this.bitField0_ |= 4;
        this.announcementDistanceMetersActual_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementDistanceMetersPlayed(long j2) {
        this.bitField0_ |= 8;
        this.announcementDistanceMetersPlayed_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnouncementId(long j2) {
        this.bitField0_ |= 2;
        this.announcementId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSpeedKmh(long j2) {
        this.bitField0_ |= 16;
        this.currentSpeedKmh_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEstimatedDurationMs(long j2) {
        this.bitField0_ |= 64;
        this.estimatedDurationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLocalAnnouncement(boolean z) {
        this.bitField0_ |= 32;
        this.isLocalAnnouncement_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteSegmentIndex(long j2) {
        this.bitField0_ |= 1;
        this.routeSegmentIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsMode(bpw bpwVar) {
        this.voiceInstructionsMode_ = bpwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsModeValue(int i2) {
        this.voiceInstructionsMode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ဂ\u0001\u0004\f\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\b\u001b\tဇ\u0005\nဂ\u0006", new Object[]{"bitField0_", "alternativeRouteUuid_", "routeSegmentIndex_", "announcementId_", "voiceInstructionsMode_", "announcementDistanceMetersActual_", "announcementDistanceMetersPlayed_", "currentSpeedKmh_", "announcementChunks_", ep.class, "isLocalAnnouncement_", "estimatedDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new bpx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpx.class) {
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

    public ep getAnnouncementChunks(int i2) {
        return this.announcementChunks_.get(i2);
    }

    public int getAnnouncementChunksCount() {
        return this.announcementChunks_.size();
    }

    public List<ep> getAnnouncementChunksList() {
        return this.announcementChunks_;
    }

    public eq getAnnouncementChunksOrBuilder(int i2) {
        return this.announcementChunks_.get(i2);
    }

    public List<? extends eq> getAnnouncementChunksOrBuilderList() {
        return this.announcementChunks_;
    }

    public long getAnnouncementDistanceMetersActual() {
        return this.announcementDistanceMetersActual_;
    }

    public long getAnnouncementDistanceMetersPlayed() {
        return this.announcementDistanceMetersPlayed_;
    }

    public long getAnnouncementId() {
        return this.announcementId_;
    }

    public long getCurrentSpeedKmh() {
        return this.currentSpeedKmh_;
    }

    public long getEstimatedDurationMs() {
        return this.estimatedDurationMs_;
    }

    public boolean getIsLocalAnnouncement() {
        return this.isLocalAnnouncement_;
    }

    public long getRouteSegmentIndex() {
        return this.routeSegmentIndex_;
    }

    public bpw getVoiceInstructionsMode() {
        int i2 = this.voiceInstructionsMode_;
        bpw bpwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bpw.SMART : bpw.BRIEF : bpw.FULL : bpw.INSTRUCTION_MODE_UNSPECIFIED;
        return bpwVar == null ? bpw.UNRECOGNIZED : bpwVar;
    }

    public int getVoiceInstructionsModeValue() {
        return this.voiceInstructionsMode_;
    }

    public boolean hasAnnouncementDistanceMetersActual() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAnnouncementDistanceMetersPlayed() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAnnouncementId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCurrentSpeedKmh() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEstimatedDurationMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIsLocalAnnouncement() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRouteSegmentIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bpv newBuilder(bpx bpxVar) {
        return (bpv) DEFAULT_INSTANCE.createBuilder(bpxVar);
    }

    public static bpx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpx parseFrom(com.google.v.z zVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnouncementChunks(ep epVar) {
        Objects.requireNonNull(epVar);
        ensureAnnouncementChunksIsMutable();
        this.announcementChunks_.add(epVar);
    }

    public static bpx parseFrom(InputStream inputStream) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpx parseFrom(ByteBuffer byteBuffer) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpx parseFrom(byte[] bArr) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
