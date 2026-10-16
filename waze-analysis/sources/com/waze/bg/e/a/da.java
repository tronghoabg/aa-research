package com.waze.bg.e.a;

import i.b.l.ra;
import i.b.l.rd;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class da extends com.google.v.du<da, cy> implements dd {
    public static final int ALERT_DETAILS_FIELD_NUMBER = 9;
    public static final int CURRENT_ROUTE_LENGTH_FROM_SPLIT_TO_MERGE_METERS_FIELD_NUMBER = 5;
    public static final int CURRENT_ROUTE_TIME_FROM_SPLIT_TO_MERGE_SECONDS_FIELD_NUMBER = 6;
    private static final da DEFAULT_INSTANCE;
    public static final int DETOUR_LENGTH_METERS_FIELD_NUMBER = 3;
    public static final int DETOUR_TIME_SECONDS_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 10;
    private static volatile com.google.v.fo<da> PARSER = null;
    public static final int SEGMENTS_FIELD_NUMBER = 2;
    public static final int SPLIT_SEGMENT_INDEX_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 7;
    private com.waze.bg.a.ej alertDetails_;
    private int bitField0_;
    private long currentRouteLengthFromSplitToMergeMeters_;
    private long currentRouteTimeFromSplitToMergeSeconds_;
    private long detourLengthMeters_;
    private long detourTimeSeconds_;
    private long id_;
    private rd label_;
    private com.google.v.eo<cf> segments_ = emptyProtobufList();
    private int splitSegmentIndex_;
    private int type_;

    static {
        da daVar = new da();
        DEFAULT_INSTANCE = daVar;
        com.google.v.du.registerDefaultInstance(da.class, daVar);
    }

    private da() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegments(Iterable<? extends cf> iterable) {
        ensureSegmentsIsMutable();
        com.google.v.c.addAll(iterable, this.segments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(int i2, cf cfVar) {
        Objects.requireNonNull(cfVar);
        ensureSegmentsIsMutable();
        this.segments_.add(i2, cfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteLengthFromSplitToMergeMeters() {
        this.bitField0_ &= -9;
        this.currentRouteLengthFromSplitToMergeMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteTimeFromSplitToMergeSeconds() {
        this.bitField0_ &= -17;
        this.currentRouteTimeFromSplitToMergeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourLengthMeters() {
        this.bitField0_ &= -3;
        this.detourLengthMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourTimeSeconds() {
        this.bitField0_ &= -5;
        this.detourTimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        this.segments_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSplitSegmentIndex() {
        this.bitField0_ &= -65;
        this.splitSegmentIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -33;
        this.type_ = 0;
    }

    private void ensureSegmentsIsMutable() {
        com.google.v.eo<cf> eoVar = this.segments_;
        if (eoVar.c()) {
            return;
        }
        this.segments_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static da getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        com.waze.bg.a.ej ejVar2 = this.alertDetails_;
        if (ejVar2 != null && ejVar2 != com.waze.bg.a.ej.getDefaultInstance()) {
            com.waze.bg.a.dk dkVarNewBuilder = com.waze.bg.a.ej.newBuilder(ejVar2);
            dkVarNewBuilder.mergeFrom((com.waze.bg.a.dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(rd rdVar) {
        Objects.requireNonNull(rdVar);
        rd rdVar2 = this.label_;
        if (rdVar2 != null && rdVar2 != rd.getDefaultInstance()) {
            ra raVarNewBuilder = rd.newBuilder(rdVar2);
            raVarNewBuilder.mergeFrom((ra) rdVar);
            rdVar = raVarNewBuilder.buildPartial();
        }
        this.label_ = rdVar;
        this.bitField0_ |= 256;
    }

    public static cy newBuilder() {
        return (cy) DEFAULT_INSTANCE.createBuilder();
    }

    public static da parseDelimitedFrom(InputStream inputStream) {
        return (da) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static da parseFrom(com.google.v.v vVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<da> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegments(int i2) {
        ensureSegmentsIsMutable();
        this.segments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteLengthFromSplitToMergeMeters(long j2) {
        this.bitField0_ |= 8;
        this.currentRouteLengthFromSplitToMergeMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteTimeFromSplitToMergeSeconds(long j2) {
        this.bitField0_ |= 16;
        this.currentRouteTimeFromSplitToMergeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourLengthMeters(long j2) {
        this.bitField0_ |= 2;
        this.detourLengthMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourTimeSeconds(long j2) {
        this.bitField0_ |= 4;
        this.detourTimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(rd rdVar) {
        Objects.requireNonNull(rdVar);
        this.label_ = rdVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(int i2, cf cfVar) {
        Objects.requireNonNull(cfVar);
        ensureSegmentsIsMutable();
        this.segments_.set(i2, cfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSplitSegmentIndex(int i2) {
        this.bitField0_ |= 64;
        this.splitSegmentIndex_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(cz czVar) {
        this.type_ = czVar.getNumber();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007᠌\u0005\bင\u0006\tဉ\u0007\nဉ\b", new Object[]{"bitField0_", "id_", "segments_", cf.class, "detourLengthMeters_", "detourTimeSeconds_", "currentRouteLengthFromSplitToMergeMeters_", "currentRouteTimeFromSplitToMergeSeconds_", "type_", ci.f16637c, "splitSegmentIndex_", "alertDetails_", "label_"});
        }
        if (iOrdinal == 3) {
            return new da();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<da> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (da.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public com.waze.bg.a.ej getAlertDetails() {
        com.waze.bg.a.ej ejVar = this.alertDetails_;
        return ejVar == null ? com.waze.bg.a.ej.getDefaultInstance() : ejVar;
    }

    public long getCurrentRouteLengthFromSplitToMergeMeters() {
        return this.currentRouteLengthFromSplitToMergeMeters_;
    }

    public long getCurrentRouteTimeFromSplitToMergeSeconds() {
        return this.currentRouteTimeFromSplitToMergeSeconds_;
    }

    public long getDetourLengthMeters() {
        return this.detourLengthMeters_;
    }

    public long getDetourTimeSeconds() {
        return this.detourTimeSeconds_;
    }

    public long getId() {
        return this.id_;
    }

    public rd getLabel() {
        rd rdVar = this.label_;
        return rdVar == null ? rd.getDefaultInstance() : rdVar;
    }

    public cf getSegments(int i2) {
        return this.segments_.get(i2);
    }

    public int getSegmentsCount() {
        return this.segments_.size();
    }

    public List<cf> getSegmentsList() {
        return this.segments_;
    }

    public cg getSegmentsOrBuilder(int i2) {
        return this.segments_.get(i2);
    }

    public List<? extends cg> getSegmentsOrBuilderList() {
        return this.segments_;
    }

    public int getSplitSegmentIndex() {
        return this.splitSegmentIndex_;
    }

    public cz getType() {
        cz czVarA = cz.a(this.type_);
        return czVarA == null ? cz.DETOUR_TYPE_UNSPECIFIED : czVarA;
    }

    @Deprecated
    public boolean hasAlertDetails() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCurrentRouteLengthFromSplitToMergeMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCurrentRouteTimeFromSplitToMergeSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDetourLengthMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDetourTimeSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasSplitSegmentIndex() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 32) != 0;
    }

    public static cy newBuilder(da daVar) {
        return (cy) DEFAULT_INSTANCE.createBuilder(daVar);
    }

    public static da parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (da) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static da parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static da parseFrom(com.google.v.z zVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static da parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(cf cfVar) {
        Objects.requireNonNull(cfVar);
        ensureSegmentsIsMutable();
        this.segments_.add(cfVar);
    }

    public static da parseFrom(InputStream inputStream) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static da parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static da parseFrom(ByteBuffer byteBuffer) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static da parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static da parseFrom(byte[] bArr) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static da parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
