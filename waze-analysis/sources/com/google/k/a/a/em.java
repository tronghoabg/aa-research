package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class em extends com.google.v.du<em, el> implements en {
    private static final em DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<em> PARSER = null;
    public static final int REGION_CODE_FIELD_NUMBER = 1;
    public static final int REGION_EXCLUDED_CLAIMS_FIELD_NUMBER = 3;
    public static final int REGION_INCLUDED_CLAIMS_FIELD_NUMBER = 2;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String regionCode_ = "";
    private com.google.v.eo<com.google.k.a.a.b.bw> regionIncludedClaims_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.b.bw> regionExcludedClaims_ = emptyProtobufList();

    static {
        em emVar = new em();
        DEFAULT_INSTANCE = emVar;
        com.google.v.du.registerDefaultInstance(em.class, emVar);
    }

    private em() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegionExcludedClaims(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureRegionExcludedClaimsIsMutable();
        com.google.v.c.addAll(iterable, this.regionExcludedClaims_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegionIncludedClaims(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureRegionIncludedClaimsIsMutable();
        com.google.v.c.addAll(iterable, this.regionIncludedClaims_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionExcludedClaims(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRegionExcludedClaimsIsMutable();
        this.regionExcludedClaims_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionIncludedClaims(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRegionIncludedClaimsIsMutable();
        this.regionIncludedClaims_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionCode() {
        this.bitField0_ &= -2;
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionExcludedClaims() {
        this.regionExcludedClaims_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionIncludedClaims() {
        this.regionIncludedClaims_ = emptyProtobufList();
    }

    private void ensureRegionExcludedClaimsIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.regionExcludedClaims_;
        if (eoVar.c()) {
            return;
        }
        this.regionExcludedClaims_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRegionIncludedClaimsIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.regionIncludedClaims_;
        if (eoVar.c()) {
            return;
        }
        this.regionIncludedClaims_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static em getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static el newBuilder() {
        return (el) DEFAULT_INSTANCE.createBuilder();
    }

    public static em parseDelimitedFrom(InputStream inputStream) {
        return (em) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static em parseFrom(com.google.v.v vVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<em> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegionExcludedClaims(int i2) {
        ensureRegionExcludedClaimsIsMutable();
        this.regionExcludedClaims_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegionIncludedClaims(int i2) {
        ensureRegionIncludedClaimsIsMutable();
        this.regionIncludedClaims_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCodeBytes(com.google.v.v vVar) {
        this.regionCode_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionExcludedClaims(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRegionExcludedClaimsIsMutable();
        this.regionExcludedClaims_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionIncludedClaims(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRegionIncludedClaimsIsMutable();
        this.regionIncludedClaims_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001ဈ\u0000\u0002Л\u0003Л", new Object[]{"bitField0_", "regionCode_", "regionIncludedClaims_", com.google.k.a.a.b.bw.class, "regionExcludedClaims_", com.google.k.a.a.b.bw.class});
            case 3:
                return new em();
            case 4:
                return new el(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<em> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (em.class) {
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

    public String getRegionCode() {
        return this.regionCode_;
    }

    public com.google.v.v getRegionCodeBytes() {
        return com.google.v.v.s(this.regionCode_);
    }

    public com.google.k.a.a.b.bw getRegionExcludedClaims(int i2) {
        return this.regionExcludedClaims_.get(i2);
    }

    public int getRegionExcludedClaimsCount() {
        return this.regionExcludedClaims_.size();
    }

    public List<com.google.k.a.a.b.bw> getRegionExcludedClaimsList() {
        return this.regionExcludedClaims_;
    }

    public com.google.k.a.a.b.bx getRegionExcludedClaimsOrBuilder(int i2) {
        return this.regionExcludedClaims_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getRegionExcludedClaimsOrBuilderList() {
        return this.regionExcludedClaims_;
    }

    public com.google.k.a.a.b.bw getRegionIncludedClaims(int i2) {
        return this.regionIncludedClaims_.get(i2);
    }

    public int getRegionIncludedClaimsCount() {
        return this.regionIncludedClaims_.size();
    }

    public List<com.google.k.a.a.b.bw> getRegionIncludedClaimsList() {
        return this.regionIncludedClaims_;
    }

    public com.google.k.a.a.b.bx getRegionIncludedClaimsOrBuilder(int i2) {
        return this.regionIncludedClaims_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getRegionIncludedClaimsOrBuilderList() {
        return this.regionIncludedClaims_;
    }

    public boolean hasRegionCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static el newBuilder(em emVar) {
        return (el) DEFAULT_INSTANCE.createBuilder(emVar);
    }

    public static em parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (em) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static em parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static em parseFrom(com.google.v.z zVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static em parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionExcludedClaims(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRegionExcludedClaimsIsMutable();
        this.regionExcludedClaims_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionIncludedClaims(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRegionIncludedClaimsIsMutable();
        this.regionIncludedClaims_.add(bwVar);
    }

    public static em parseFrom(InputStream inputStream) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static em parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static em parseFrom(ByteBuffer byteBuffer) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static em parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static em parseFrom(byte[] bArr) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static em parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
