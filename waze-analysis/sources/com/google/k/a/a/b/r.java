package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends com.google.v.du<r, q> implements com.google.v.fj {
    private static final r DEFAULT_INSTANCE;
    public static final int NUMBER_FIELD_NUMBER = 1;
    public static final int PARAMETER_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<r> PARSER = null;
    public static final int PREFIX_FIELD_NUMBER = 4;
    public static final int SAME_PARITY_FIELD_NUMBER = 3;
    public static final int SUFFIX_FIELD_NUMBER = 5;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 15;
    private int bitField0_;
    private com.google.w.n.a.b temporaryData_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.ek number_ = emptyIntList();
    private com.google.v.ej parameter_ = emptyFloatList();
    private boolean sameParity_ = true;
    private String prefix_ = "";
    private String suffix_ = "";

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.v.du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNumber(Iterable<? extends Integer> iterable) {
        ensureNumberIsMutable();
        com.google.v.c.addAll(iterable, this.number_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParameter(Iterable<? extends Float> iterable) {
        ensureParameterIsMutable();
        com.google.v.c.addAll(iterable, this.parameter_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNumber(int i2) {
        ensureNumberIsMutable();
        this.number_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParameter(float f2) {
        ensureParameterIsMutable();
        this.parameter_.i(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParameter() {
        this.parameter_ = emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrefix() {
        this.bitField0_ &= -3;
        this.prefix_ = getDefaultInstance().getPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSameParity() {
        this.bitField0_ &= -2;
        this.sameParity_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuffix() {
        this.bitField0_ &= -5;
        this.suffix_ = getDefaultInstance().getSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -9;
    }

    private void ensureNumberIsMutable() {
        com.google.v.ek ekVar = this.number_;
        if (ekVar.c()) {
            return;
        }
        this.number_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureParameterIsMutable() {
        com.google.v.ej ejVar = this.parameter_;
        if (ejVar.c()) {
            return;
        }
        this.parameter_ = com.google.v.du.mutableCopy(ejVar);
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.temporaryData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.temporaryData_ = bVar;
        this.bitField0_ |= 8;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i2, int i3) {
        ensureNumberIsMutable();
        this.number_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameter(int i2, float f2) {
        ensureParameterIsMutable();
        this.parameter_.e(i2, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.prefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefixBytes(com.google.v.v vVar) {
        this.prefix_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSameParity(boolean z) {
        this.bitField0_ |= 1;
        this.sameParity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuffix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.suffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuffixBytes(com.google.v.v vVar) {
        this.suffix_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 8;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"bitField0_", "number_", "parameter_", "sameParity_", "prefix_", "suffix_", "temporaryData_"});
            case 3:
                return new r();
            case 4:
                return new q(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<r> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (r.class) {
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

    public int getNumber(int i2) {
        return this.number_.d(i2);
    }

    public int getNumberCount() {
        return this.number_.size();
    }

    public List<Integer> getNumberList() {
        return this.number_;
    }

    public float getParameter(int i2) {
        return this.parameter_.d(i2);
    }

    public int getParameterCount() {
        return this.parameter_.size();
    }

    public List<Float> getParameterList() {
        return this.parameter_;
    }

    public String getPrefix() {
        return this.prefix_;
    }

    public com.google.v.v getPrefixBytes() {
        return com.google.v.v.s(this.prefix_);
    }

    public boolean getSameParity() {
        return this.sameParity_;
    }

    public String getSuffix() {
        return this.suffix_;
    }

    public com.google.v.v getSuffixBytes() {
        return com.google.v.v.s(this.suffix_);
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean hasPrefix() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSameParity() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSuffix() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 8) != 0;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (r) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
