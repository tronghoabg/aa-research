package com.waze.bg.e.a;

import i.b.l.ra;
import i.b.l.rd;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bf extends com.google.v.du<bf, be> implements com.google.v.fj {
    public static final int CURRENT_ROUTE_TIME_FROM_SPLIT_TO_MERGE_SECONDS_FIELD_NUMBER = 2;
    private static final bf DEFAULT_INSTANCE;
    public static final int DETOUR_TIME_SECONDS_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bf> PARSER;
    private int bitField0_;
    private long currentRouteTimeFromSplitToMergeSeconds_;
    private long detourTimeSeconds_;
    private long id_;
    private rd label_;

    static {
        bf bfVar = new bf();
        DEFAULT_INSTANCE = bfVar;
        com.google.v.du.registerDefaultInstance(bf.class, bfVar);
    }

    private bf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteTimeFromSplitToMergeSeconds() {
        this.bitField0_ &= -3;
        this.currentRouteTimeFromSplitToMergeSeconds_ = 0L;
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
        this.bitField0_ &= -9;
    }

    public static bf getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 8;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bf parseDelimitedFrom(InputStream inputStream) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(com.google.v.v vVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteTimeFromSplitToMergeSeconds(long j2) {
        this.bitField0_ |= 2;
        this.currentRouteTimeFromSplitToMergeSeconds_ = j2;
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
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "id_", "currentRouteTimeFromSplitToMergeSeconds_", "detourTimeSeconds_", "label_"});
        }
        if (iOrdinal == 3) {
            return new bf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCurrentRouteTimeFromSplitToMergeSeconds() {
        return this.currentRouteTimeFromSplitToMergeSeconds_;
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

    public boolean hasCurrentRouteTimeFromSplitToMergeSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDetourTimeSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 8) != 0;
    }

    public static be newBuilder(bf bfVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bfVar);
    }

    public static bf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bf parseFrom(com.google.v.z zVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bf parseFrom(InputStream inputStream) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(ByteBuffer byteBuffer) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bf parseFrom(byte[] bArr) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
