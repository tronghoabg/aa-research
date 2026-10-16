package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ki extends com.google.v.du<ki, kh> implements kj {
    private static final ki DEFAULT_INSTANCE;
    public static final int FROM_SEGMENT_FIELD_NUMBER = 1;
    public static final int INTERSECTION_GROUP_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ki> PARSER = null;
    public static final int TO_SEGMENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.k.a.a.b.bw intersectionGroup_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> fromSegment_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.b.bw> toSegment_ = emptyProtobufList();

    static {
        ki kiVar = new ki();
        DEFAULT_INSTANCE = kiVar;
        com.google.v.du.registerDefaultInstance(ki.class, kiVar);
    }

    private ki() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFromSegment(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureFromSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.fromSegment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllToSegment(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureToSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.toSegment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFromSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureFromSegmentIsMutable();
        this.fromSegment_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureToSegmentIsMutable();
        this.toSegment_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSegment() {
        this.fromSegment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersectionGroup() {
        this.intersectionGroup_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToSegment() {
        this.toSegment_ = emptyProtobufList();
    }

    private void ensureFromSegmentIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.fromSegment_;
        if (eoVar.c()) {
            return;
        }
        this.fromSegment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureToSegmentIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.toSegment_;
        if (eoVar.c()) {
            return;
        }
        this.toSegment_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ki getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntersectionGroup(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.intersectionGroup_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.intersectionGroup_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static kh newBuilder() {
        return (kh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ki parseDelimitedFrom(InputStream inputStream) {
        return (ki) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ki parseFrom(com.google.v.v vVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ki> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromSegment(int i2) {
        ensureFromSegmentIsMutable();
        this.fromSegment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeToSegment(int i2) {
        ensureToSegmentIsMutable();
        this.toSegment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureFromSegmentIsMutable();
        this.fromSegment_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersectionGroup(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.intersectionGroup_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureToSegmentIsMutable();
        this.toSegment_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0003\u0001Л\u0002Л\u0003ᐉ\u0000", new Object[]{"bitField0_", "fromSegment_", com.google.k.a.a.b.bw.class, "toSegment_", com.google.k.a.a.b.bw.class, "intersectionGroup_"});
            case 3:
                return new ki();
            case 4:
                return new kh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ki> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ki.class) {
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

    public com.google.k.a.a.b.bw getFromSegment(int i2) {
        return this.fromSegment_.get(i2);
    }

    public int getFromSegmentCount() {
        return this.fromSegment_.size();
    }

    public List<com.google.k.a.a.b.bw> getFromSegmentList() {
        return this.fromSegment_;
    }

    public com.google.k.a.a.b.bx getFromSegmentOrBuilder(int i2) {
        return this.fromSegment_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getFromSegmentOrBuilderList() {
        return this.fromSegment_;
    }

    public com.google.k.a.a.b.bw getIntersectionGroup() {
        com.google.k.a.a.b.bw bwVar = this.intersectionGroup_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.b.bw getToSegment(int i2) {
        return this.toSegment_.get(i2);
    }

    public int getToSegmentCount() {
        return this.toSegment_.size();
    }

    public List<com.google.k.a.a.b.bw> getToSegmentList() {
        return this.toSegment_;
    }

    public com.google.k.a.a.b.bx getToSegmentOrBuilder(int i2) {
        return this.toSegment_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getToSegmentOrBuilderList() {
        return this.toSegment_;
    }

    public boolean hasIntersectionGroup() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kh newBuilder(ki kiVar) {
        return (kh) DEFAULT_INSTANCE.createBuilder(kiVar);
    }

    public static ki parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ki) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ki parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ki parseFrom(com.google.v.z zVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ki parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFromSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureFromSegmentIsMutable();
        this.fromSegment_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureToSegmentIsMutable();
        this.toSegment_.add(bwVar);
    }

    public static ki parseFrom(InputStream inputStream) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ki parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ki parseFrom(ByteBuffer byteBuffer) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ki parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ki parseFrom(byte[] bArr) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ki parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
