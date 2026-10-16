package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ev extends com.google.v.du<ev, eu> implements ew {
    private static final ev DEFAULT_INSTANCE;
    public static final int FROM_LANE_ID_FIELD_NUMBER = 5;
    public static final int FROM_LANE_NUMBER_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ev> PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 1;
    public static final int TO_LANE_ID_FIELD_NUMBER = 4;
    public static final int TO_LANE_NUMBER_FIELD_NUMBER = 2;
    private int bitField0_;
    private long fromLaneId_;
    private int fromLaneNumber_;
    private byte memoizedIsInitialized = 2;
    private com.google.k.a.a.b.bw segment_;
    private long toLaneId_;
    private int toLaneNumber_;

    static {
        ev evVar = new ev();
        DEFAULT_INSTANCE = evVar;
        com.google.v.du.registerDefaultInstance(ev.class, evVar);
    }

    private ev() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromLaneId() {
        this.bitField0_ &= -17;
        this.fromLaneId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromLaneNumber() {
        this.bitField0_ &= -5;
        this.fromLaneNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToLaneId() {
        this.bitField0_ &= -9;
        this.toLaneId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToLaneNumber() {
        this.bitField0_ &= -3;
        this.toLaneNumber_ = 0;
    }

    public static ev getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.segment_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.segment_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static eu newBuilder() {
        return (eu) DEFAULT_INSTANCE.createBuilder();
    }

    public static ev parseDelimitedFrom(InputStream inputStream) {
        return (ev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ev parseFrom(com.google.v.v vVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ev> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromLaneId(long j2) {
        this.bitField0_ |= 16;
        this.fromLaneId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromLaneNumber(int i2) {
        this.bitField0_ |= 4;
        this.fromLaneNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.segment_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToLaneId(long j2) {
        this.bitField0_ |= 8;
        this.toLaneId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToLaneNumber(int i2) {
        this.bitField0_ |= 2;
        this.toLaneNumber_ = i2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"bitField0_", "segment_", "toLaneNumber_", "fromLaneNumber_", "toLaneId_", "fromLaneId_"});
            case 3:
                return new ev();
            case 4:
                return new eu(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ev> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ev.class) {
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

    public long getFromLaneId() {
        return this.fromLaneId_;
    }

    public int getFromLaneNumber() {
        return this.fromLaneNumber_;
    }

    public com.google.k.a.a.b.bw getSegment() {
        com.google.k.a.a.b.bw bwVar = this.segment_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public long getToLaneId() {
        return this.toLaneId_;
    }

    public int getToLaneNumber() {
        return this.toLaneNumber_;
    }

    public boolean hasFromLaneId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFromLaneNumber() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSegment() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToLaneId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasToLaneNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public static eu newBuilder(ev evVar) {
        return (eu) DEFAULT_INSTANCE.createBuilder(evVar);
    }

    public static ev parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ev parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ev parseFrom(com.google.v.z zVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ev parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ev parseFrom(InputStream inputStream) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ev parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ev parseFrom(ByteBuffer byteBuffer) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ev parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ev parseFrom(byte[] bArr) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ev parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
