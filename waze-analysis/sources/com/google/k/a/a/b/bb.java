package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb extends com.google.v.du<bb, ba> implements com.google.v.fj {
    public static final int BLEND_ORDER_FIELD_NUMBER = 5;
    public static final int DATA_LEVEL_FIELD_NUMBER = 1;
    public static final int DATA_MAXLEVEL_FIELD_NUMBER = 2;
    private static final bb DEFAULT_INSTANCE;
    public static final int ELEVATION_DATA_FIELD_NUMBER = 6;
    public static final int FULL_CHILD_DATA_AVAILABLE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bb> PARSER = null;
    public static final int PARTIAL_CHILD_DATA_AVAILABLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int blendOrder_;
    private int dataLevel_;
    private int dataMaxlevel_;
    private com.google.w.n.a.b elevationData_;
    private boolean fullChildDataAvailable_;
    private byte memoizedIsInitialized = 2;
    private boolean partialChildDataAvailable_;

    static {
        bb bbVar = new bb();
        DEFAULT_INSTANCE = bbVar;
        com.google.v.du.registerDefaultInstance(bb.class, bbVar);
    }

    private bb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlendOrder() {
        this.bitField0_ &= -17;
        this.blendOrder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataLevel() {
        this.bitField0_ &= -2;
        this.dataLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataMaxlevel() {
        this.bitField0_ &= -3;
        this.dataMaxlevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElevationData() {
        this.elevationData_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullChildDataAvailable() {
        this.bitField0_ &= -9;
        this.fullChildDataAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartialChildDataAvailable() {
        this.bitField0_ &= -5;
        this.partialChildDataAvailable_ = false;
    }

    public static bb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElevationData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.elevationData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.elevationData_ = bVar;
        this.bitField0_ |= 32;
    }

    public static ba newBuilder() {
        return (ba) DEFAULT_INSTANCE.createBuilder();
    }

    public static bb parseDelimitedFrom(InputStream inputStream) {
        return (bb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bb parseFrom(com.google.v.v vVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlendOrder(int i2) {
        this.bitField0_ |= 16;
        this.blendOrder_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataLevel(int i2) {
        this.bitField0_ |= 1;
        this.dataLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataMaxlevel(int i2) {
        this.bitField0_ |= 2;
        this.dataMaxlevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElevationData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.elevationData_ = bVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullChildDataAvailable(boolean z) {
        this.bitField0_ |= 8;
        this.fullChildDataAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartialChildDataAvailable(boolean z) {
        this.bitField0_ |= 4;
        this.partialChildDataAvailable_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "dataLevel_", "dataMaxlevel_", "partialChildDataAvailable_", "fullChildDataAvailable_", "blendOrder_", "elevationData_"});
            case 3:
                return new bb();
            case 4:
                return new ba(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<bb> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bb.class) {
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

    public int getBlendOrder() {
        return this.blendOrder_;
    }

    public int getDataLevel() {
        return this.dataLevel_;
    }

    public int getDataMaxlevel() {
        return this.dataMaxlevel_;
    }

    public com.google.w.n.a.b getElevationData() {
        com.google.w.n.a.b bVar = this.elevationData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean getFullChildDataAvailable() {
        return this.fullChildDataAvailable_;
    }

    public boolean getPartialChildDataAvailable() {
        return this.partialChildDataAvailable_;
    }

    public boolean hasBlendOrder() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDataLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDataMaxlevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasElevationData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFullChildDataAvailable() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPartialChildDataAvailable() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ba newBuilder(bb bbVar) {
        return (ba) DEFAULT_INSTANCE.createBuilder(bbVar);
    }

    public static bb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bb parseFrom(com.google.v.z zVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bb parseFrom(InputStream inputStream) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bb parseFrom(ByteBuffer byteBuffer) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bb parseFrom(byte[] bArr) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
