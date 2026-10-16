package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bln extends com.google.v.du<bln, blm> implements com.google.v.fj {
    public static final int AFFECTED_BY_CLOSURES_FIELD_NUMBER = 2;
    public static final int AFFECTED_BY_POLYGON_EVENT_FIELD_NUMBER = 5;
    public static final int CLOSURES_SEGMENT_IDS_FIELD_NUMBER = 4;
    private static final bln DEFAULT_INSTANCE;
    public static final int NUMBER_OF_CLOSURES_PINS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bln> PARSER = null;
    public static final int TRIP_OVERVIEW_ROUTES_FIELD_NUMBER = 1;
    private boolean affectedByClosures_;
    private boolean affectedByPolygonEvent_;
    private int bitField0_;
    private long numberOfClosuresPins_;
    private int closuresSegmentIdsMemoizedSerializedSize = -1;
    private com.google.v.eo<blg> tripOverviewRoutes_ = emptyProtobufList();
    private com.google.v.en closuresSegmentIds_ = emptyLongList();

    static {
        bln blnVar = new bln();
        DEFAULT_INSTANCE = blnVar;
        com.google.v.du.registerDefaultInstance(bln.class, blnVar);
    }

    private bln() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClosuresSegmentIds(Iterable<? extends Long> iterable) {
        ensureClosuresSegmentIdsIsMutable();
        com.google.v.c.addAll(iterable, this.closuresSegmentIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTripOverviewRoutes(Iterable<? extends blg> iterable) {
        ensureTripOverviewRoutesIsMutable();
        com.google.v.c.addAll(iterable, this.tripOverviewRoutes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClosuresSegmentIds(long j2) {
        ensureClosuresSegmentIdsIsMutable();
        this.closuresSegmentIds_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTripOverviewRoutes(int i2, blg blgVar) {
        Objects.requireNonNull(blgVar);
        ensureTripOverviewRoutesIsMutable();
        this.tripOverviewRoutes_.add(i2, blgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedByClosures() {
        this.bitField0_ &= -2;
        this.affectedByClosures_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedByPolygonEvent() {
        this.bitField0_ &= -5;
        this.affectedByPolygonEvent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosuresSegmentIds() {
        this.closuresSegmentIds_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberOfClosuresPins() {
        this.bitField0_ &= -3;
        this.numberOfClosuresPins_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewRoutes() {
        this.tripOverviewRoutes_ = emptyProtobufList();
    }

    private void ensureClosuresSegmentIdsIsMutable() {
        com.google.v.en enVar = this.closuresSegmentIds_;
        if (enVar.c()) {
            return;
        }
        this.closuresSegmentIds_ = com.google.v.du.mutableCopy(enVar);
    }

    private void ensureTripOverviewRoutesIsMutable() {
        com.google.v.eo<blg> eoVar = this.tripOverviewRoutes_;
        if (eoVar.c()) {
            return;
        }
        this.tripOverviewRoutes_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bln getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static blm newBuilder() {
        return (blm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bln parseDelimitedFrom(InputStream inputStream) {
        return (bln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bln parseFrom(com.google.v.v vVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bln> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTripOverviewRoutes(int i2) {
        ensureTripOverviewRoutesIsMutable();
        this.tripOverviewRoutes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedByClosures(boolean z) {
        this.bitField0_ |= 1;
        this.affectedByClosures_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedByPolygonEvent(boolean z) {
        this.bitField0_ |= 4;
        this.affectedByPolygonEvent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosuresSegmentIds(int i2, long j2) {
        ensureClosuresSegmentIdsIsMutable();
        this.closuresSegmentIds_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberOfClosuresPins(long j2) {
        this.bitField0_ |= 2;
        this.numberOfClosuresPins_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewRoutes(int i2, blg blgVar) {
        Objects.requireNonNull(blgVar);
        ensureTripOverviewRoutesIsMutable();
        this.tripOverviewRoutes_.set(i2, blgVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဂ\u0001\u0004%\u0005ဇ\u0002", new Object[]{"bitField0_", "tripOverviewRoutes_", blg.class, "affectedByClosures_", "numberOfClosuresPins_", "closuresSegmentIds_", "affectedByPolygonEvent_"});
        }
        if (iOrdinal == 3) {
            return new bln();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new blm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bln> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bln.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAffectedByClosures() {
        return this.affectedByClosures_;
    }

    public boolean getAffectedByPolygonEvent() {
        return this.affectedByPolygonEvent_;
    }

    public long getClosuresSegmentIds(int i2) {
        return this.closuresSegmentIds_.a(i2);
    }

    public int getClosuresSegmentIdsCount() {
        return this.closuresSegmentIds_.size();
    }

    public List<Long> getClosuresSegmentIdsList() {
        return this.closuresSegmentIds_;
    }

    public long getNumberOfClosuresPins() {
        return this.numberOfClosuresPins_;
    }

    public blg getTripOverviewRoutes(int i2) {
        return this.tripOverviewRoutes_.get(i2);
    }

    public int getTripOverviewRoutesCount() {
        return this.tripOverviewRoutes_.size();
    }

    public List<blg> getTripOverviewRoutesList() {
        return this.tripOverviewRoutes_;
    }

    public blh getTripOverviewRoutesOrBuilder(int i2) {
        return this.tripOverviewRoutes_.get(i2);
    }

    public List<? extends blh> getTripOverviewRoutesOrBuilderList() {
        return this.tripOverviewRoutes_;
    }

    public boolean hasAffectedByClosures() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAffectedByPolygonEvent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNumberOfClosuresPins() {
        return (this.bitField0_ & 2) != 0;
    }

    public static blm newBuilder(bln blnVar) {
        return (blm) DEFAULT_INSTANCE.createBuilder(blnVar);
    }

    public static bln parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bln parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bln parseFrom(com.google.v.z zVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bln parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTripOverviewRoutes(blg blgVar) {
        Objects.requireNonNull(blgVar);
        ensureTripOverviewRoutesIsMutable();
        this.tripOverviewRoutes_.add(blgVar);
    }

    public static bln parseFrom(InputStream inputStream) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bln parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bln parseFrom(ByteBuffer byteBuffer) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bln parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bln parseFrom(byte[] bArr) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bln parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
