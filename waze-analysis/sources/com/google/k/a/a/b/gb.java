package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gb extends com.google.v.du<gb, fz> implements gc {
    private static final gb DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 500;
    public static final int OTHER_FEATURE_COUNTRY_CODE_FIELD_NUMBER = 4;
    public static final int OTHER_FEATURE_ID_FIELD_NUMBER = 2;
    public static final int OTHER_FEATURE_NAME_FIELD_NUMBER = 6;
    public static final int OTHER_FEATURE_TERRITORIAL_ADMINISTRATOR_FIELD_NUMBER = 8;
    public static final int OTHER_FEATURE_TYPE_FIELD_NUMBER = 3;
    public static final int OVERLAP_FRACTION_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<gb> PARSER = null;
    public static final int RELATION_FIELD_NUMBER = 1;
    public static final int RELATION_IS_REVERSED_FIELD_NUMBER = 7;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 16;
    private int bitField0_;
    private ce metadata_;
    private bw otherFeatureId_;
    private int otherFeatureType_;
    private float overlapFraction_;
    private boolean relationIsReversed_;
    private com.google.w.n.a.b temporaryData_;
    private byte memoizedIsInitialized = 2;
    private int relation_ = 1;
    private String otherFeatureCountryCode_ = "";
    private String otherFeatureTerritorialAdministrator_ = "";
    private com.google.v.eo<eh> otherFeatureName_ = emptyProtobufList();

    static {
        gb gbVar = new gb();
        DEFAULT_INSTANCE = gbVar;
        com.google.v.du.registerDefaultInstance(gb.class, gbVar);
    }

    private gb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOtherFeatureName(Iterable<? extends eh> iterable) {
        ensureOtherFeatureNameIsMutable();
        com.google.v.c.addAll(iterable, this.otherFeatureName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOtherFeatureName(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureOtherFeatureNameIsMutable();
        this.otherFeatureName_.add(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherFeatureCountryCode() {
        this.bitField0_ &= -9;
        this.otherFeatureCountryCode_ = getDefaultInstance().getOtherFeatureCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherFeatureId() {
        this.otherFeatureId_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherFeatureName() {
        this.otherFeatureName_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherFeatureTerritorialAdministrator() {
        this.bitField0_ &= -17;
        this.otherFeatureTerritorialAdministrator_ = getDefaultInstance().getOtherFeatureTerritorialAdministrator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherFeatureType() {
        this.bitField0_ &= -5;
        this.otherFeatureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverlapFraction() {
        this.bitField0_ &= -33;
        this.overlapFraction_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelation() {
        this.bitField0_ &= -2;
        this.relation_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelationIsReversed() {
        this.bitField0_ &= -65;
        this.relationIsReversed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -129;
    }

    private void ensureOtherFeatureNameIsMutable() {
        com.google.v.eo<eh> eoVar = this.otherFeatureName_;
        if (eoVar.c()) {
            return;
        }
        this.otherFeatureName_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOtherFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.otherFeatureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.otherFeatureId_ = bwVar;
        this.bitField0_ |= 2;
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
        this.bitField0_ |= 128;
    }

    public static fz newBuilder() {
        return (fz) DEFAULT_INSTANCE.createBuilder();
    }

    public static gb parseDelimitedFrom(InputStream inputStream) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(com.google.v.v vVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOtherFeatureName(int i2) {
        ensureOtherFeatureNameIsMutable();
        this.otherFeatureName_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.otherFeatureCountryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureCountryCodeBytes(com.google.v.v vVar) {
        this.otherFeatureCountryCode_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.otherFeatureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureName(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureOtherFeatureNameIsMutable();
        this.otherFeatureName_.set(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureTerritorialAdministrator(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.otherFeatureTerritorialAdministrator_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureTerritorialAdministratorBytes(com.google.v.v vVar) {
        this.otherFeatureTerritorialAdministrator_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherFeatureType(int i2) {
        this.bitField0_ |= 4;
        this.otherFeatureType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverlapFraction(float f2) {
        this.bitField0_ |= 32;
        this.overlapFraction_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelation(ga gaVar) {
        this.relation_ = gaVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelationIsReversed(boolean z) {
        this.bitField0_ |= 64;
        this.relationIsReversed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 128;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001Ǵ\n\u0000\u0001\u0004\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ခ\u0005\u0006Л\u0007ဇ\u0006\bဈ\u0004\u0010ᐉ\u0007Ǵဉ\b", new Object[]{"bitField0_", "relation_", dq.f11277i, "otherFeatureId_", "otherFeatureType_", "otherFeatureCountryCode_", "overlapFraction_", "otherFeatureName_", eh.class, "relationIsReversed_", "otherFeatureTerritorialAdministrator_", "temporaryData_", "metadata_"});
            case 3:
                return new gb();
            case 4:
                return new fz(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gb> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gb.class) {
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

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public String getOtherFeatureCountryCode() {
        return this.otherFeatureCountryCode_;
    }

    public com.google.v.v getOtherFeatureCountryCodeBytes() {
        return com.google.v.v.s(this.otherFeatureCountryCode_);
    }

    public bw getOtherFeatureId() {
        bw bwVar = this.otherFeatureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public eh getOtherFeatureName(int i2) {
        return this.otherFeatureName_.get(i2);
    }

    public int getOtherFeatureNameCount() {
        return this.otherFeatureName_.size();
    }

    public List<eh> getOtherFeatureNameList() {
        return this.otherFeatureName_;
    }

    public ei getOtherFeatureNameOrBuilder(int i2) {
        return this.otherFeatureName_.get(i2);
    }

    public List<? extends ei> getOtherFeatureNameOrBuilderList() {
        return this.otherFeatureName_;
    }

    public String getOtherFeatureTerritorialAdministrator() {
        return this.otherFeatureTerritorialAdministrator_;
    }

    public com.google.v.v getOtherFeatureTerritorialAdministratorBytes() {
        return com.google.v.v.s(this.otherFeatureTerritorialAdministrator_);
    }

    public int getOtherFeatureType() {
        return this.otherFeatureType_;
    }

    @Deprecated
    public float getOverlapFraction() {
        return this.overlapFraction_;
    }

    public ga getRelation() {
        ga gaVarA = ga.a(this.relation_);
        return gaVarA == null ? ga.RELATION_OVERLAPS : gaVarA;
    }

    public boolean getRelationIsReversed() {
        return this.relationIsReversed_;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasOtherFeatureCountryCode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOtherFeatureId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOtherFeatureTerritorialAdministrator() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOtherFeatureType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasOverlapFraction() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRelation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRelationIsReversed() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 128) != 0;
    }

    public static fz newBuilder(gb gbVar) {
        return (fz) DEFAULT_INSTANCE.createBuilder(gbVar);
    }

    public static gb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gb parseFrom(com.google.v.z zVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOtherFeatureName(eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureOtherFeatureNameIsMutable();
        this.otherFeatureName_.add(ehVar);
    }

    public static gb parseFrom(InputStream inputStream) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(ByteBuffer byteBuffer) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gb parseFrom(byte[] bArr) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
