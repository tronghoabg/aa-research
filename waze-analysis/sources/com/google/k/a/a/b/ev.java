package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ev extends com.google.v.du<ev, eu> implements com.google.v.fj {
    public static final int CAPITAL_FIELD_NUMBER = 2;
    public static final int CLAIM_FIELD_NUMBER = 5;
    private static final ev DEFAULT_INSTANCE;
    public static final int GROSS_DOMESTIC_PRODUCT_USD_MILLIONS_FIELD_NUMBER = 3;
    public static final int LITERACY_PERCENT_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ev> PARSER = null;
    public static final int POPULATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private bw capital_;
    private double grossDomesticProductUsdMillions_;
    private float literacyPercent_;
    private long population_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> claim_ = emptyProtobufList();

    static {
        ev evVar = new ev();
        DEFAULT_INSTANCE = evVar;
        com.google.v.du.registerDefaultInstance(ev.class, evVar);
    }

    private ev() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClaim(Iterable<? extends bw> iterable) {
        ensureClaimIsMutable();
        com.google.v.c.addAll(iterable, this.claim_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClaim(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureClaimIsMutable();
        this.claim_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCapital() {
        this.capital_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClaim() {
        this.claim_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGrossDomesticProductUsdMillions() {
        this.bitField0_ &= -5;
        this.grossDomesticProductUsdMillions_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiteracyPercent() {
        this.bitField0_ &= -9;
        this.literacyPercent_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopulation() {
        this.bitField0_ &= -2;
        this.population_ = 0L;
    }

    private void ensureClaimIsMutable() {
        com.google.v.eo<bw> eoVar = this.claim_;
        if (eoVar.c()) {
            return;
        }
        this.claim_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ev getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCapital(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.capital_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.capital_ = bwVar;
        this.bitField0_ |= 2;
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
    public void removeClaim(int i2) {
        ensureClaimIsMutable();
        this.claim_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCapital(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.capital_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClaim(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureClaimIsMutable();
        this.claim_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrossDomesticProductUsdMillions(double d2) {
        this.bitField0_ |= 4;
        this.grossDomesticProductUsdMillions_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiteracyPercent(float f2) {
        this.bitField0_ |= 8;
        this.literacyPercent_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopulation(long j2) {
        this.bitField0_ |= 1;
        this.population_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဂ\u0000\u0002ᐉ\u0001\u0003က\u0002\u0004ခ\u0003\u0005Л", new Object[]{"bitField0_", "population_", "capital_", "grossDomesticProductUsdMillions_", "literacyPercent_", "claim_", bw.class});
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

    @Deprecated
    public bw getCapital() {
        bw bwVar = this.capital_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getClaim(int i2) {
        return this.claim_.get(i2);
    }

    public int getClaimCount() {
        return this.claim_.size();
    }

    public List<bw> getClaimList() {
        return this.claim_;
    }

    public bx getClaimOrBuilder(int i2) {
        return this.claim_.get(i2);
    }

    public List<? extends bx> getClaimOrBuilderList() {
        return this.claim_;
    }

    @Deprecated
    public double getGrossDomesticProductUsdMillions() {
        return this.grossDomesticProductUsdMillions_;
    }

    @Deprecated
    public float getLiteracyPercent() {
        return this.literacyPercent_;
    }

    @Deprecated
    public long getPopulation() {
        return this.population_;
    }

    @Deprecated
    public boolean hasCapital() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasGrossDomesticProductUsdMillions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasLiteracyPercent() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasPopulation() {
        return (this.bitField0_ & 1) != 0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void addClaim(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureClaimIsMutable();
        this.claim_.add(bwVar);
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
