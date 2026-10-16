package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cv extends com.google.v.du<cv, cu> implements cw {
    private static final cv DEFAULT_INSTANCE;
    public static final int IS_FREE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<cv> PARSER = null;
    public static final int PERIODICITY_SECONDS_FIELD_NUMBER = 5;
    public static final int PRICE_FIELD_NUMBER = 4;
    public static final int RANGE_END_SECONDS_FIELD_NUMBER = 2;
    public static final int RANGE_START_SECONDS_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isFree_;
    private int periodicitySeconds_;
    private int rangeEndSeconds_;
    private int rangeStartSeconds_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.i.s> price_ = emptyProtobufList();

    static {
        cv cvVar = new cv();
        DEFAULT_INSTANCE = cvVar;
        com.google.v.du.registerDefaultInstance(cv.class, cvVar);
    }

    private cv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPrice(Iterable<? extends com.google.i.s> iterable) {
        ensurePriceIsMutable();
        com.google.v.c.addAll(iterable, this.price_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPrice(int i2, com.google.i.s sVar) {
        Objects.requireNonNull(sVar);
        ensurePriceIsMutable();
        this.price_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFree() {
        this.bitField0_ &= -5;
        this.isFree_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodicitySeconds() {
        this.bitField0_ &= -9;
        this.periodicitySeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRangeEndSeconds() {
        this.bitField0_ &= -3;
        this.rangeEndSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRangeStartSeconds() {
        this.bitField0_ &= -2;
        this.rangeStartSeconds_ = 0;
    }

    private void ensurePriceIsMutable() {
        com.google.v.eo<com.google.i.s> eoVar = this.price_;
        if (eoVar.c()) {
            return;
        }
        this.price_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cu newBuilder() {
        return (cu) DEFAULT_INSTANCE.createBuilder();
    }

    public static cv parseDelimitedFrom(InputStream inputStream) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(com.google.v.v vVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePrice(int i2) {
        ensurePriceIsMutable();
        this.price_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFree(boolean z) {
        this.bitField0_ |= 4;
        this.isFree_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodicitySeconds(int i2) {
        this.bitField0_ |= 8;
        this.periodicitySeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(int i2, com.google.i.s sVar) {
        Objects.requireNonNull(sVar);
        ensurePriceIsMutable();
        this.price_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRangeEndSeconds(int i2) {
        this.bitField0_ |= 2;
        this.rangeEndSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRangeStartSeconds(int i2) {
        this.bitField0_ |= 1;
        this.rangeStartSeconds_ = i2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004Л\u0005င\u0003", new Object[]{"bitField0_", "rangeStartSeconds_", "rangeEndSeconds_", "isFree_", "price_", com.google.i.s.class, "periodicitySeconds_"});
            case 3:
                return new cv();
            case 4:
                return new cu(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<cv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cv.class) {
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

    public boolean getIsFree() {
        return this.isFree_;
    }

    public int getPeriodicitySeconds() {
        return this.periodicitySeconds_;
    }

    public com.google.i.s getPrice(int i2) {
        return this.price_.get(i2);
    }

    public int getPriceCount() {
        return this.price_.size();
    }

    public List<com.google.i.s> getPriceList() {
        return this.price_;
    }

    public com.google.i.t getPriceOrBuilder(int i2) {
        return this.price_.get(i2);
    }

    public List<? extends com.google.i.t> getPriceOrBuilderList() {
        return this.price_;
    }

    public int getRangeEndSeconds() {
        return this.rangeEndSeconds_;
    }

    public int getRangeStartSeconds() {
        return this.rangeStartSeconds_;
    }

    public boolean hasIsFree() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPeriodicitySeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRangeEndSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRangeStartSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cu newBuilder(cv cvVar) {
        return (cu) DEFAULT_INSTANCE.createBuilder(cvVar);
    }

    public static cv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cv parseFrom(com.google.v.z zVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPrice(com.google.i.s sVar) {
        Objects.requireNonNull(sVar);
        ensurePriceIsMutable();
        this.price_.add(sVar);
    }

    public static cv parseFrom(InputStream inputStream) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(ByteBuffer byteBuffer) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cv parseFrom(byte[] bArr) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
