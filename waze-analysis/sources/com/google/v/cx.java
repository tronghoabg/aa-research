package com.google.v;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cx extends du<cx, ct> implements cy {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final cx DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile fo<cx> PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private eo<cv> name_ = emptyProtobufList();
    private String identifierValue_ = "";
    private v stringValue_ = v.f13054a;
    private String aggregateValue_ = "";

    static {
        cx cxVar = new cx();
        DEFAULT_INSTANCE = cxVar;
        du.registerDefaultInstance(cx.class, cxVar);
    }

    private cx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllName(Iterable<? extends cv> iterable) {
        ensureNameIsMutable();
        c.addAll(iterable, this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(int i2, cv cvVar) {
        Objects.requireNonNull(cvVar);
        ensureNameIsMutable();
        this.name_.add(i2, cvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregateValue() {
        this.bitField0_ &= -33;
        this.aggregateValue_ = getDefaultInstance().getAggregateValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -9;
        this.doubleValue_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifierValue() {
        this.bitField0_ &= -2;
        this.identifierValue_ = getDefaultInstance().getIdentifierValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNegativeIntValue() {
        this.bitField0_ &= -5;
        this.negativeIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositiveIntValue() {
        this.bitField0_ &= -3;
        this.positiveIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -17;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    private void ensureNameIsMutable() {
        eo<cv> eoVar = this.name_;
        if (eoVar.c()) {
            return;
        }
        this.name_ = du.mutableCopy(eoVar);
    }

    public static cx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cx parseDelimitedFrom(InputStream inputStream) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(v vVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeName(int i2) {
        ensureNameIsMutable();
        this.name_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.aggregateValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValueBytes(v vVar) {
        this.aggregateValue_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d2) {
        this.bitField0_ |= 8;
        this.doubleValue_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.identifierValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValueBytes(v vVar) {
        this.identifierValue_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i2, cv cvVar) {
        Objects.requireNonNull(cvVar);
        ensureNameIsMutable();
        this.name_.set(i2, cvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNegativeIntValue(long j2) {
        this.bitField0_ |= 4;
        this.negativeIntValue_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositiveIntValue(long j2) {
        this.bitField0_ |= 2;
        this.positiveIntValue_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 16;
        this.stringValue_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", cv.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 3:
                return new cx();
            case 4:
                return new ct(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<cx> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cx.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getAggregateValue() {
        return this.aggregateValue_;
    }

    public v getAggregateValueBytes() {
        return v.s(this.aggregateValue_);
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public String getIdentifierValue() {
        return this.identifierValue_;
    }

    public v getIdentifierValueBytes() {
        return v.s(this.identifierValue_);
    }

    public cv getName(int i2) {
        return this.name_.get(i2);
    }

    public int getNameCount() {
        return this.name_.size();
    }

    public List<cv> getNameList() {
        return this.name_;
    }

    public cw getNameOrBuilder(int i2) {
        return this.name_.get(i2);
    }

    public List<? extends cw> getNameOrBuilderList() {
        return this.name_;
    }

    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    public v getStringValue() {
        return this.stringValue_;
    }

    public boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public static ct newBuilder(cx cxVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cxVar);
    }

    public static cx parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(v vVar, de deVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cx parseFrom(z zVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cx parseFrom(z zVar, de deVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(cv cvVar) {
        Objects.requireNonNull(cvVar);
        ensureNameIsMutable();
        this.name_.add(cvVar);
    }

    public static cx parseFrom(InputStream inputStream) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(InputStream inputStream, de deVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(ByteBuffer byteBuffer) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cx parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cx parseFrom(byte[] bArr) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cx parseFrom(byte[] bArr, de deVar) {
        return (cx) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
