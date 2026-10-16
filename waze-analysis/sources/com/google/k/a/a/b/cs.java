package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cs extends com.google.v.du<cs, cr> implements com.google.v.fj {
    private static final cs DEFAULT_INSTANCE;
    public static final int INTERSECTION_GROUP_FIELD_NUMBER = 3;
    public static final int OUT_SEGMENT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<cs> PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 1;
    public static final int TOLL_CLUSTER_FIELD_NUMBER = 5;
    private int bitField0_;
    private bw intersectionGroup_;
    private bw tollCluster_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> segment_ = emptyProtobufList();
    private com.google.v.eo<bw> outSegment_ = emptyProtobufList();

    static {
        cs csVar = new cs();
        DEFAULT_INSTANCE = csVar;
        com.google.v.du.registerDefaultInstance(cs.class, csVar);
    }

    private cs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOutSegment(Iterable<? extends bw> iterable) {
        ensureOutSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.outSegment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegment(Iterable<? extends bw> iterable) {
        ensureSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.segment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOutSegment(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureOutSegmentIsMutable();
        this.outSegment_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegment(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSegmentIsMutable();
        this.segment_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersectionGroup() {
        this.intersectionGroup_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutSegment() {
        this.outSegment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollCluster() {
        this.tollCluster_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureOutSegmentIsMutable() {
        com.google.v.eo<bw> eoVar = this.outSegment_;
        if (eoVar.c()) {
            return;
        }
        this.outSegment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSegmentIsMutable() {
        com.google.v.eo<bw> eoVar = this.segment_;
        if (eoVar.c()) {
            return;
        }
        this.segment_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntersectionGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.intersectionGroup_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.intersectionGroup_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollCluster(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.tollCluster_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.tollCluster_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static cr newBuilder() {
        return (cr) DEFAULT_INSTANCE.createBuilder();
    }

    public static cs parseDelimitedFrom(InputStream inputStream) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(com.google.v.v vVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOutSegment(int i2) {
        ensureOutSegmentIsMutable();
        this.outSegment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegment(int i2) {
        ensureSegmentIsMutable();
        this.segment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersectionGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.intersectionGroup_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutSegment(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureOutSegmentIsMutable();
        this.outSegment_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSegmentIsMutable();
        this.segment_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollCluster(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.tollCluster_ = bwVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0004\u0001Л\u0002Л\u0003ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"bitField0_", "segment_", bw.class, "outSegment_", bw.class, "intersectionGroup_", "tollCluster_"});
            case 3:
                return new cs();
            case 4:
                return new cr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<cs> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cs.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public bw getIntersectionGroup() {
        bw bwVar = this.intersectionGroup_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getOutSegment(int i2) {
        return this.outSegment_.get(i2);
    }

    public int getOutSegmentCount() {
        return this.outSegment_.size();
    }

    public List<bw> getOutSegmentList() {
        return this.outSegment_;
    }

    public bx getOutSegmentOrBuilder(int i2) {
        return this.outSegment_.get(i2);
    }

    public List<? extends bx> getOutSegmentOrBuilderList() {
        return this.outSegment_;
    }

    public bw getSegment(int i2) {
        return this.segment_.get(i2);
    }

    public int getSegmentCount() {
        return this.segment_.size();
    }

    public List<bw> getSegmentList() {
        return this.segment_;
    }

    public bx getSegmentOrBuilder(int i2) {
        return this.segment_.get(i2);
    }

    public List<? extends bx> getSegmentOrBuilderList() {
        return this.segment_;
    }

    public bw getTollCluster() {
        bw bwVar = this.tollCluster_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public boolean hasIntersectionGroup() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTollCluster() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cr newBuilder(cs csVar) {
        return (cr) DEFAULT_INSTANCE.createBuilder(csVar);
    }

    public static cs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cs parseFrom(com.google.v.z zVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOutSegment(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureOutSegmentIsMutable();
        this.outSegment_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegment(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSegmentIsMutable();
        this.segment_.add(bwVar);
    }

    public static cs parseFrom(InputStream inputStream) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(ByteBuffer byteBuffer) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cs parseFrom(byte[] bArr) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
