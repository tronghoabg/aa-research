package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mf extends com.google.v.du<mf, me> implements mg {
    private static final mf DEFAULT_INSTANCE;
    public static final int DURATION_BASED_RATE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mf> PARSER = null;
    public static final int TAX_INCLUDED_FIELD_NUMBER = 4;
    public static final int VALID_END_WITHIN_FIELD_NUMBER = 3;
    public static final int VALID_START_WITHIN_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean taxIncluded_;
    private com.google.k.a.a.b.kj validEndWithin_;
    private com.google.k.a.a.b.kj validStartWithin_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<cv> durationBasedRate_ = emptyProtobufList();

    static {
        mf mfVar = new mf();
        DEFAULT_INSTANCE = mfVar;
        com.google.v.du.registerDefaultInstance(mf.class, mfVar);
    }

    private mf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDurationBasedRate(Iterable<? extends cv> iterable) {
        ensureDurationBasedRateIsMutable();
        com.google.v.c.addAll(iterable, this.durationBasedRate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDurationBasedRate(int i2, cv cvVar) {
        Objects.requireNonNull(cvVar);
        ensureDurationBasedRateIsMutable();
        this.durationBasedRate_.add(i2, cvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationBasedRate() {
        this.durationBasedRate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaxIncluded() {
        this.bitField0_ &= -5;
        this.taxIncluded_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidEndWithin() {
        this.validEndWithin_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidStartWithin() {
        this.validStartWithin_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureDurationBasedRateIsMutable() {
        com.google.v.eo<cv> eoVar = this.durationBasedRate_;
        if (eoVar.c()) {
            return;
        }
        this.durationBasedRate_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static mf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidEndWithin(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        com.google.k.a.a.b.kj kjVar2 = this.validEndWithin_;
        if (kjVar2 != null && kjVar2 != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.validEndWithin_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidStartWithin(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        com.google.k.a.a.b.kj kjVar2 = this.validStartWithin_;
        if (kjVar2 != null && kjVar2 != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.validStartWithin_ = kjVar;
        this.bitField0_ |= 1;
    }

    public static me newBuilder() {
        return (me) DEFAULT_INSTANCE.createBuilder();
    }

    public static mf parseDelimitedFrom(InputStream inputStream) {
        return (mf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mf parseFrom(com.google.v.v vVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDurationBasedRate(int i2) {
        ensureDurationBasedRateIsMutable();
        this.durationBasedRate_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationBasedRate(int i2, cv cvVar) {
        Objects.requireNonNull(cvVar);
        ensureDurationBasedRateIsMutable();
        this.durationBasedRate_.set(i2, cvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaxIncluded(boolean z) {
        this.bitField0_ |= 4;
        this.taxIncluded_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidEndWithin(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.validEndWithin_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidStartWithin(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.validStartWithin_ = kjVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "durationBasedRate_", cv.class, "validStartWithin_", "validEndWithin_", "taxIncluded_"});
            case 3:
                return new mf();
            case 4:
                return new me(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<mf> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (mf.class) {
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

    public cv getDurationBasedRate(int i2) {
        return this.durationBasedRate_.get(i2);
    }

    public int getDurationBasedRateCount() {
        return this.durationBasedRate_.size();
    }

    public List<cv> getDurationBasedRateList() {
        return this.durationBasedRate_;
    }

    public cw getDurationBasedRateOrBuilder(int i2) {
        return this.durationBasedRate_.get(i2);
    }

    public List<? extends cw> getDurationBasedRateOrBuilderList() {
        return this.durationBasedRate_;
    }

    public boolean getTaxIncluded() {
        return this.taxIncluded_;
    }

    public com.google.k.a.a.b.kj getValidEndWithin() {
        com.google.k.a.a.b.kj kjVar = this.validEndWithin_;
        return kjVar == null ? com.google.k.a.a.b.kj.getDefaultInstance() : kjVar;
    }

    public com.google.k.a.a.b.kj getValidStartWithin() {
        com.google.k.a.a.b.kj kjVar = this.validStartWithin_;
        return kjVar == null ? com.google.k.a.a.b.kj.getDefaultInstance() : kjVar;
    }

    public boolean hasTaxIncluded() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasValidEndWithin() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValidStartWithin() {
        return (this.bitField0_ & 1) != 0;
    }

    public static me newBuilder(mf mfVar) {
        return (me) DEFAULT_INSTANCE.createBuilder(mfVar);
    }

    public static mf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mf parseFrom(com.google.v.z zVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDurationBasedRate(cv cvVar) {
        Objects.requireNonNull(cvVar);
        ensureDurationBasedRateIsMutable();
        this.durationBasedRate_.add(cvVar);
    }

    public static mf parseFrom(InputStream inputStream) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mf parseFrom(ByteBuffer byteBuffer) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mf parseFrom(byte[] bArr) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
