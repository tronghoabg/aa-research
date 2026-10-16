package i.b.l;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class si extends com.google.v.du<si, sh> implements sj {
    public static final int CLIENTID_FIELD_NUMBER = 3;
    public static final int CROSSTIMESECONDSWITHOUTREALTIME_FIELD_NUMBER = 16;
    public static final int CROSSTIMESECONDS_FIELD_NUMBER = 6;
    private static final si DEFAULT_INSTANCE;
    public static final int DESTNAMEOBSOLETE_FIELD_NUMBER = 9;
    public static final int DETOURINFO_FIELD_NUMBER = 12;
    public static final int DIRECTION_FIELD_NUMBER = 19;
    public static final int EXITNUMBER_FIELD_NUMBER = 8;
    public static final int FROMNODEX_FIELD_NUMBER = 18;
    public static final int FROMNODEY_FIELD_NUMBER = 17;
    public static final int FROMNODE_FIELD_NUMBER = 4;
    public static final int INSTRUCTION_FIELD_NUMBER = 7;
    public static final int LANDMARK_FIELD_NUMBER = 20;
    public static final int LANESET_FIELD_NUMBER = 13;
    public static final int LANETYPE_FIELD_NUMBER = 11;
    public static final int LANE_FIELD_NUMBER = 10;
    public static final int LENGTHMETERS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<si> PARSER = null;
    public static final int ROADSIGN_FIELD_NUMBER = 14;
    public static final int SERVERSEGMENTID_FIELD_NUMBER = 15;
    public static final int TILEID_FIELD_NUMBER = 1;
    public static final int TILETIMESTAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private int clientId_;
    private int crosstimeSecondsWithoutRealtime_;
    private int crosstimeSeconds_;
    private int destNameObsolete_;
    private qz detourInfo_;
    private boolean direction_;
    private int exitNumber_;
    private double fromNodeX_;
    private double fromNodeY_;
    private int fromNode_;
    private int instruction_;
    private com.google.v.eo<com.waze.ak.an> landmark_ = emptyProtobufList();
    private i.a.a.o laneSet_;
    private int laneType_;
    private int lane_;
    private int lengthMeters_;
    private i.a.a.w roadSign_;
    private int serverSegmentId_;
    private int tileId_;
    private int tileTimestamp_;

    static {
        si siVar = new si();
        DEFAULT_INSTANCE = siVar;
        com.google.v.du.registerDefaultInstance(si.class, siVar);
    }

    private si() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLandmark(Iterable<? extends com.waze.ak.an> iterable) {
        ensureLandmarkIsMutable();
        com.google.v.c.addAll(iterable, this.landmark_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandmark(int i2, com.waze.ak.an anVar) {
        Objects.requireNonNull(anVar);
        ensureLandmarkIsMutable();
        this.landmark_.add(i2, anVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.bitField0_ &= -5;
        this.clientId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrosstimeSeconds() {
        this.bitField0_ &= -513;
        this.crosstimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrosstimeSecondsWithoutRealtime() {
        this.bitField0_ &= -1025;
        this.crosstimeSecondsWithoutRealtime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestNameObsolete() {
        this.bitField0_ &= -8193;
        this.destNameObsolete_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourInfo() {
        this.detourInfo_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.bitField0_ &= -129;
        this.direction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitNumber() {
        this.bitField0_ &= -4097;
        this.exitNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -17;
        this.fromNode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNodeX() {
        this.bitField0_ &= -33;
        this.fromNodeX_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNodeY() {
        this.bitField0_ &= -65;
        this.fromNodeY_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.bitField0_ &= -2049;
        this.instruction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandmark() {
        this.landmark_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLane() {
        this.bitField0_ &= -16385;
        this.lane_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneSet() {
        this.laneSet_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneType() {
        this.bitField0_ &= -32769;
        this.laneType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -257;
        this.lengthMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadSign() {
        this.roadSign_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSegmentId() {
        this.bitField0_ &= -9;
        this.serverSegmentId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -2;
        this.tileId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileTimestamp() {
        this.bitField0_ &= -3;
        this.tileTimestamp_ = 0;
    }

    private void ensureLandmarkIsMutable() {
        com.google.v.eo<com.waze.ak.an> eoVar = this.landmark_;
        if (eoVar.c()) {
            return;
        }
        this.landmark_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static si getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetourInfo(qz qzVar) {
        Objects.requireNonNull(qzVar);
        qz qzVar2 = this.detourInfo_;
        if (qzVar2 != null && qzVar2 != qz.getDefaultInstance()) {
            qy qyVarNewBuilder = qz.newBuilder(qzVar2);
            qyVarNewBuilder.mergeFrom((qy) qzVar);
            qzVar = qyVarNewBuilder.buildPartial();
        }
        this.detourInfo_ = qzVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLaneSet(i.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        i.a.a.o oVar2 = this.laneSet_;
        if (oVar2 != null && oVar2 != i.a.a.o.getDefaultInstance()) {
            i.a.a.n nVarNewBuilder = i.a.a.o.newBuilder(oVar2);
            nVarNewBuilder.mergeFrom((i.a.a.n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.laneSet_ = oVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadSign(i.a.a.w wVar) {
        Objects.requireNonNull(wVar);
        i.a.a.w wVar2 = this.roadSign_;
        if (wVar2 != null && wVar2 != i.a.a.w.getDefaultInstance()) {
            i.a.a.v vVarNewBuilder = i.a.a.w.newBuilder(wVar2);
            vVarNewBuilder.mergeFrom((i.a.a.v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.roadSign_ = wVar;
        this.bitField0_ |= 262144;
    }

    public static sh newBuilder() {
        return (sh) DEFAULT_INSTANCE.createBuilder();
    }

    public static si parseDelimitedFrom(InputStream inputStream) {
        return (si) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static si parseFrom(com.google.v.v vVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<si> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLandmark(int i2) {
        ensureLandmarkIsMutable();
        this.landmark_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(int i2) {
        this.bitField0_ |= 4;
        this.clientId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrosstimeSeconds(int i2) {
        this.bitField0_ |= 512;
        this.crosstimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrosstimeSecondsWithoutRealtime(int i2) {
        this.bitField0_ |= 1024;
        this.crosstimeSecondsWithoutRealtime_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestNameObsolete(int i2) {
        this.bitField0_ |= 8192;
        this.destNameObsolete_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourInfo(qz qzVar) {
        Objects.requireNonNull(qzVar);
        this.detourInfo_ = qzVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirection(boolean z) {
        this.bitField0_ |= 128;
        this.direction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitNumber(int i2) {
        this.bitField0_ |= 4096;
        this.exitNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(int i2) {
        this.bitField0_ |= 16;
        this.fromNode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNodeX(double d2) {
        this.bitField0_ |= 32;
        this.fromNodeX_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNodeY(double d2) {
        this.bitField0_ |= 64;
        this.fromNodeY_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(int i2) {
        this.bitField0_ |= 2048;
        this.instruction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandmark(int i2, com.waze.ak.an anVar) {
        Objects.requireNonNull(anVar);
        ensureLandmarkIsMutable();
        this.landmark_.set(i2, anVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLane(int i2) {
        this.bitField0_ |= 16384;
        this.lane_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneSet(i.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        this.laneSet_ = oVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneType(int i2) {
        this.bitField0_ |= 32768;
        this.laneType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(int i2) {
        this.bitField0_ |= 256;
        this.lengthMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadSign(i.a.a.w wVar) {
        Objects.requireNonNull(wVar);
        this.roadSign_ = wVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSegmentId(int i2) {
        this.bitField0_ |= 8;
        this.serverSegmentId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(int i2) {
        this.bitField0_ |= 1;
        this.tileId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileTimestamp(int i2) {
        this.bitField0_ |= 2;
        this.tileTimestamp_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0004\u0005င\b\u0006င\t\u0007င\u000b\bင\f\tင\r\nင\u000e\u000bင\u000f\fဉ\u0010\rဉ\u0011\u000eဉ\u0012\u000fင\u0003\u0010င\n\u0011က\u0006\u0012က\u0005\u0013ဇ\u0007\u0014\u001b", new Object[]{"bitField0_", "tileId_", "tileTimestamp_", "clientId_", "fromNode_", "lengthMeters_", "crosstimeSeconds_", "instruction_", "exitNumber_", "destNameObsolete_", "lane_", "laneType_", "detourInfo_", "laneSet_", "roadSign_", "serverSegmentId_", "crosstimeSecondsWithoutRealtime_", "fromNodeY_", "fromNodeX_", "direction_", "landmark_", com.waze.ak.an.class});
        }
        if (iOrdinal == 3) {
            return new si();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<si> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (si.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getClientId() {
        return this.clientId_;
    }

    public int getCrosstimeSeconds() {
        return this.crosstimeSeconds_;
    }

    public int getCrosstimeSecondsWithoutRealtime() {
        return this.crosstimeSecondsWithoutRealtime_;
    }

    public int getDestNameObsolete() {
        return this.destNameObsolete_;
    }

    public qz getDetourInfo() {
        qz qzVar = this.detourInfo_;
        return qzVar == null ? qz.getDefaultInstance() : qzVar;
    }

    public boolean getDirection() {
        return this.direction_;
    }

    public int getExitNumber() {
        return this.exitNumber_;
    }

    public int getFromNode() {
        return this.fromNode_;
    }

    public double getFromNodeX() {
        return this.fromNodeX_;
    }

    public double getFromNodeY() {
        return this.fromNodeY_;
    }

    public int getInstruction() {
        return this.instruction_;
    }

    public com.waze.ak.an getLandmark(int i2) {
        return this.landmark_.get(i2);
    }

    public int getLandmarkCount() {
        return this.landmark_.size();
    }

    public List<com.waze.ak.an> getLandmarkList() {
        return this.landmark_;
    }

    public com.waze.ak.ao getLandmarkOrBuilder(int i2) {
        return this.landmark_.get(i2);
    }

    public List<? extends com.waze.ak.ao> getLandmarkOrBuilderList() {
        return this.landmark_;
    }

    public int getLane() {
        return this.lane_;
    }

    public i.a.a.o getLaneSet() {
        i.a.a.o oVar = this.laneSet_;
        return oVar == null ? i.a.a.o.getDefaultInstance() : oVar;
    }

    public int getLaneType() {
        return this.laneType_;
    }

    public int getLengthMeters() {
        return this.lengthMeters_;
    }

    public i.a.a.w getRoadSign() {
        i.a.a.w wVar = this.roadSign_;
        return wVar == null ? i.a.a.w.getDefaultInstance() : wVar;
    }

    public int getServerSegmentId() {
        return this.serverSegmentId_;
    }

    public int getTileId() {
        return this.tileId_;
    }

    public int getTileTimestamp() {
        return this.tileTimestamp_;
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCrosstimeSeconds() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCrosstimeSecondsWithoutRealtime() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDestNameObsolete() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasDetourInfo() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasDirection() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasExitNumber() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFromNodeX() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFromNodeY() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasInstruction() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasLane() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasLaneSet() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasLaneType() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasLengthMeters() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRoadSign() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasServerSegmentId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTileTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    public static sh newBuilder(si siVar) {
        return (sh) DEFAULT_INSTANCE.createBuilder(siVar);
    }

    public static si parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (si) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static si parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static si parseFrom(com.google.v.z zVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static si parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLandmark(com.waze.ak.an anVar) {
        Objects.requireNonNull(anVar);
        ensureLandmarkIsMutable();
        this.landmark_.add(anVar);
    }

    public static si parseFrom(InputStream inputStream) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static si parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static si parseFrom(ByteBuffer byteBuffer) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static si parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static si parseFrom(byte[] bArr) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static si parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (si) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
