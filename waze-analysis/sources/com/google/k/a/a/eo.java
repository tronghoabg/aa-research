package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eo extends com.google.v.du<eo, eh> implements com.google.v.fj {
    public static final int CONVEYS_ATTRIBUTION_TO_FIELD_NUMBER = 2;
    private static final eo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<eo> PARSER = null;
    public static final int REGIONAL_POLYGON_ADJUSTMENT_FIELD_NUMBER = 4;
    public static final int REGIONAL_POLYGON_COMPOSING_CLAIMS_FIELD_NUMBER = 3;
    public static final int REGION_SPECIFIC_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<jj> regionSpecificName_ = emptyProtobufList();
    private String conveysAttributionTo_ = "";
    private com.google.v.eo<em> regionalPolygonComposingClaims_ = emptyProtobufList();
    private com.google.v.eo<ej> regionalPolygonAdjustment_ = emptyProtobufList();

    static {
        eo eoVar = new eo();
        DEFAULT_INSTANCE = eoVar;
        com.google.v.du.registerDefaultInstance(eo.class, eoVar);
    }

    private eo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegionSpecificName(Iterable<? extends jj> iterable) {
        ensureRegionSpecificNameIsMutable();
        com.google.v.c.addAll(iterable, this.regionSpecificName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegionalPolygonAdjustment(Iterable<? extends ej> iterable) {
        ensureRegionalPolygonAdjustmentIsMutable();
        com.google.v.c.addAll(iterable, this.regionalPolygonAdjustment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegionalPolygonComposingClaims(Iterable<? extends em> iterable) {
        ensureRegionalPolygonComposingClaimsIsMutable();
        com.google.v.c.addAll(iterable, this.regionalPolygonComposingClaims_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionSpecificName(int i2, jj jjVar) {
        Objects.requireNonNull(jjVar);
        ensureRegionSpecificNameIsMutable();
        this.regionSpecificName_.add(i2, jjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionalPolygonAdjustment(int i2, ej ejVar) {
        Objects.requireNonNull(ejVar);
        ensureRegionalPolygonAdjustmentIsMutable();
        this.regionalPolygonAdjustment_.add(i2, ejVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionalPolygonComposingClaims(int i2, em emVar) {
        Objects.requireNonNull(emVar);
        ensureRegionalPolygonComposingClaimsIsMutable();
        this.regionalPolygonComposingClaims_.add(i2, emVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConveysAttributionTo() {
        this.bitField0_ &= -2;
        this.conveysAttributionTo_ = getDefaultInstance().getConveysAttributionTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionSpecificName() {
        this.regionSpecificName_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionalPolygonAdjustment() {
        this.regionalPolygonAdjustment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionalPolygonComposingClaims() {
        this.regionalPolygonComposingClaims_ = emptyProtobufList();
    }

    private void ensureRegionSpecificNameIsMutable() {
        com.google.v.eo<jj> eoVar = this.regionSpecificName_;
        if (eoVar.c()) {
            return;
        }
        this.regionSpecificName_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRegionalPolygonAdjustmentIsMutable() {
        com.google.v.eo<ej> eoVar = this.regionalPolygonAdjustment_;
        if (eoVar.c()) {
            return;
        }
        this.regionalPolygonAdjustment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRegionalPolygonComposingClaimsIsMutable() {
        com.google.v.eo<em> eoVar = this.regionalPolygonComposingClaims_;
        if (eoVar.c()) {
            return;
        }
        this.regionalPolygonComposingClaims_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static eo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eh newBuilder() {
        return (eh) DEFAULT_INSTANCE.createBuilder();
    }

    public static eo parseDelimitedFrom(InputStream inputStream) {
        return (eo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eo parseFrom(com.google.v.v vVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegionSpecificName(int i2) {
        ensureRegionSpecificNameIsMutable();
        this.regionSpecificName_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegionalPolygonAdjustment(int i2) {
        ensureRegionalPolygonAdjustmentIsMutable();
        this.regionalPolygonAdjustment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegionalPolygonComposingClaims(int i2) {
        ensureRegionalPolygonComposingClaimsIsMutable();
        this.regionalPolygonComposingClaims_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConveysAttributionTo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.conveysAttributionTo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConveysAttributionToBytes(com.google.v.v vVar) {
        this.conveysAttributionTo_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionSpecificName(int i2, jj jjVar) {
        Objects.requireNonNull(jjVar);
        ensureRegionSpecificNameIsMutable();
        this.regionSpecificName_.set(i2, jjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionalPolygonAdjustment(int i2, ej ejVar) {
        Objects.requireNonNull(ejVar);
        ensureRegionalPolygonAdjustmentIsMutable();
        this.regionalPolygonAdjustment_.set(i2, ejVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionalPolygonComposingClaims(int i2, em emVar) {
        Objects.requireNonNull(emVar);
        ensureRegionalPolygonComposingClaimsIsMutable();
        this.regionalPolygonComposingClaims_.set(i2, emVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0003\u0001Л\u0002ဈ\u0000\u0003Л\u0004Л", new Object[]{"bitField0_", "regionSpecificName_", jj.class, "conveysAttributionTo_", "regionalPolygonComposingClaims_", em.class, "regionalPolygonAdjustment_", ej.class});
            case 3:
                return new eo();
            case 4:
                return new eh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<eo> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (eo.class) {
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

    public String getConveysAttributionTo() {
        return this.conveysAttributionTo_;
    }

    public com.google.v.v getConveysAttributionToBytes() {
        return com.google.v.v.s(this.conveysAttributionTo_);
    }

    public jj getRegionSpecificName(int i2) {
        return this.regionSpecificName_.get(i2);
    }

    public int getRegionSpecificNameCount() {
        return this.regionSpecificName_.size();
    }

    public List<jj> getRegionSpecificNameList() {
        return this.regionSpecificName_;
    }

    public jk getRegionSpecificNameOrBuilder(int i2) {
        return this.regionSpecificName_.get(i2);
    }

    public List<? extends jk> getRegionSpecificNameOrBuilderList() {
        return this.regionSpecificName_;
    }

    public ej getRegionalPolygonAdjustment(int i2) {
        return this.regionalPolygonAdjustment_.get(i2);
    }

    public int getRegionalPolygonAdjustmentCount() {
        return this.regionalPolygonAdjustment_.size();
    }

    public List<ej> getRegionalPolygonAdjustmentList() {
        return this.regionalPolygonAdjustment_;
    }

    public ek getRegionalPolygonAdjustmentOrBuilder(int i2) {
        return this.regionalPolygonAdjustment_.get(i2);
    }

    public List<? extends ek> getRegionalPolygonAdjustmentOrBuilderList() {
        return this.regionalPolygonAdjustment_;
    }

    public em getRegionalPolygonComposingClaims(int i2) {
        return this.regionalPolygonComposingClaims_.get(i2);
    }

    public int getRegionalPolygonComposingClaimsCount() {
        return this.regionalPolygonComposingClaims_.size();
    }

    public List<em> getRegionalPolygonComposingClaimsList() {
        return this.regionalPolygonComposingClaims_;
    }

    public en getRegionalPolygonComposingClaimsOrBuilder(int i2) {
        return this.regionalPolygonComposingClaims_.get(i2);
    }

    public List<? extends en> getRegionalPolygonComposingClaimsOrBuilderList() {
        return this.regionalPolygonComposingClaims_;
    }

    public boolean hasConveysAttributionTo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static eh newBuilder(eo eoVar) {
        return (eh) DEFAULT_INSTANCE.createBuilder(eoVar);
    }

    public static eo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eo parseFrom(com.google.v.z zVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionSpecificName(jj jjVar) {
        Objects.requireNonNull(jjVar);
        ensureRegionSpecificNameIsMutable();
        this.regionSpecificName_.add(jjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionalPolygonAdjustment(ej ejVar) {
        Objects.requireNonNull(ejVar);
        ensureRegionalPolygonAdjustmentIsMutable();
        this.regionalPolygonAdjustment_.add(ejVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegionalPolygonComposingClaims(em emVar) {
        Objects.requireNonNull(emVar);
        ensureRegionalPolygonComposingClaimsIsMutable();
        this.regionalPolygonComposingClaims_.add(emVar);
    }

    public static eo parseFrom(InputStream inputStream) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eo parseFrom(ByteBuffer byteBuffer) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eo parseFrom(byte[] bArr) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
