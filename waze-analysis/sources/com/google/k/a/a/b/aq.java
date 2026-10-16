package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends com.google.v.du<aq, ap> implements com.google.v.fj {
    public static final int ATTRIBUTION_URL_FIELD_NUMBER = 14;
    public static final int COPYRIGHT_OWNER_FIELD_NUMBER = 2;
    public static final int COPYRIGHT_YEAR_FIELD_NUMBER = 3;
    private static final aq DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    public static final int IMPORTER_BUILD_INFO_FIELD_NUMBER = 9;
    public static final int IMPORTER_BUILD_TARGET_FIELD_NUMBER = 10;
    public static final int IMPORTER_CLIENT_INFO_FIELD_NUMBER = 11;
    public static final int IMPORTER_MPM_VERSION_FIELD_NUMBER = 15;
    public static final int IMPORTER_TIMESTAMP_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<aq> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 7;
    public static final int RAW_METADATA_FIELD_NUMBER = 6;
    public static final int RELEASE_DATE_FIELD_NUMBER = 4;
    public static final int RELEASE_FIELD_NUMBER = 13;
    public static final int SOURCE_DATASET_FIELD_NUMBER = 12;
    private int bitField0_;
    private int copyrightYear_;
    private au releaseDate_;
    private byte memoizedIsInitialized = 2;
    private String description_ = "";
    private String copyrightOwner_ = "";
    private String release_ = "";
    private com.google.v.eo<fv> rawMetadata_ = emptyProtobufList();
    private int provider_ = 4369;
    private String importerTimestamp_ = "";
    private String importerBuildInfo_ = "";
    private String importerBuildTarget_ = "";
    private String importerClientInfo_ = "";
    private String sourceDataset_ = "";
    private com.google.v.eo<kt> attributionUrl_ = emptyProtobufList();
    private String importerMpmVersion_ = "";

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        com.google.v.du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributionUrl(Iterable<? extends kt> iterable) {
        ensureAttributionUrlIsMutable();
        com.google.v.c.addAll(iterable, this.attributionUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRawMetadata(Iterable<? extends fv> iterable) {
        ensureRawMetadataIsMutable();
        com.google.v.c.addAll(iterable, this.rawMetadata_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributionUrl(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.add(i2, ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRawMetadata(int i2, fv fvVar) {
        Objects.requireNonNull(fvVar);
        ensureRawMetadataIsMutable();
        this.rawMetadata_.add(i2, fvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributionUrl() {
        this.attributionUrl_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrightOwner() {
        this.bitField0_ &= -3;
        this.copyrightOwner_ = getDefaultInstance().getCopyrightOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrightYear() {
        this.bitField0_ &= -5;
        this.copyrightYear_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -2;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImporterBuildInfo() {
        this.bitField0_ &= -129;
        this.importerBuildInfo_ = getDefaultInstance().getImporterBuildInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImporterBuildTarget() {
        this.bitField0_ &= -257;
        this.importerBuildTarget_ = getDefaultInstance().getImporterBuildTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImporterClientInfo() {
        this.bitField0_ &= -513;
        this.importerClientInfo_ = getDefaultInstance().getImporterClientInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImporterMpmVersion() {
        this.bitField0_ &= -2049;
        this.importerMpmVersion_ = getDefaultInstance().getImporterMpmVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImporterTimestamp() {
        this.bitField0_ &= -65;
        this.importerTimestamp_ = getDefaultInstance().getImporterTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -33;
        this.provider_ = 4369;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawMetadata() {
        this.rawMetadata_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelease() {
        this.bitField0_ &= -17;
        this.release_ = getDefaultInstance().getRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReleaseDate() {
        this.releaseDate_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceDataset() {
        this.bitField0_ &= -1025;
        this.sourceDataset_ = getDefaultInstance().getSourceDataset();
    }

    private void ensureAttributionUrlIsMutable() {
        com.google.v.eo<kt> eoVar = this.attributionUrl_;
        if (eoVar.c()) {
            return;
        }
        this.attributionUrl_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRawMetadataIsMutable() {
        com.google.v.eo<fv> eoVar = this.rawMetadata_;
        if (eoVar.c()) {
            return;
        }
        this.rawMetadata_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReleaseDate(au auVar) {
        Objects.requireNonNull(auVar);
        au auVar2 = this.releaseDate_;
        if (auVar2 != null && auVar2 != au.getDefaultInstance()) {
            as asVarNewBuilder = au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.releaseDate_ = auVar;
        this.bitField0_ |= 8;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(com.google.v.v vVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributionUrl(int i2) {
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRawMetadata(int i2) {
        ensureRawMetadataIsMutable();
        this.rawMetadata_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionUrl(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.set(i2, ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrightOwner(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.copyrightOwner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrightOwnerBytes(com.google.v.v vVar) {
        this.copyrightOwner_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrightYear(int i2) {
        this.bitField0_ |= 4;
        this.copyrightYear_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterBuildInfo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.importerBuildInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterBuildInfoBytes(com.google.v.v vVar) {
        this.importerBuildInfo_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterBuildTarget(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.importerBuildTarget_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterBuildTargetBytes(com.google.v.v vVar) {
        this.importerBuildTarget_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterClientInfo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.importerClientInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterClientInfoBytes(com.google.v.v vVar) {
        this.importerClientInfo_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterMpmVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.importerMpmVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterMpmVersionBytes(com.google.v.v vVar) {
        this.importerMpmVersion_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterTimestamp(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.importerTimestamp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImporterTimestampBytes(com.google.v.v vVar) {
        this.importerTimestamp_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(ar arVar) {
        this.provider_ = arVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawMetadata(int i2, fv fvVar) {
        Objects.requireNonNull(fvVar);
        ensureRawMetadataIsMutable();
        this.rawMetadata_.set(i2, fvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelease(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.release_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseBytes(com.google.v.v vVar) {
        this.release_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseDate(au auVar) {
        Objects.requireNonNull(auVar);
        this.releaseDate_ = auVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceDataset(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.sourceDataset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceDatasetBytes(com.google.v.v vVar) {
        this.sourceDataset_ = vVar.u();
        this.bitField0_ |= 1024;
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
                ar arVar = ar.PROVIDER_ANY;
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဉ\u0003\u0006Л\u0007᠌\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n\rဈ\u0004\u000eЛ\u000fဈ\u000b", new Object[]{"bitField0_", "description_", "copyrightOwner_", "copyrightYear_", "releaseDate_", "rawMetadata_", fv.class, "provider_", c.f11204h, "importerTimestamp_", "importerBuildInfo_", "importerBuildTarget_", "importerClientInfo_", "sourceDataset_", "release_", "attributionUrl_", kt.class, "importerMpmVersion_"});
            case 3:
                return new aq();
            case 4:
                return new ap(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<aq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (aq.class) {
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

    public kt getAttributionUrl(int i2) {
        return this.attributionUrl_.get(i2);
    }

    public int getAttributionUrlCount() {
        return this.attributionUrl_.size();
    }

    public List<kt> getAttributionUrlList() {
        return this.attributionUrl_;
    }

    public ku getAttributionUrlOrBuilder(int i2) {
        return this.attributionUrl_.get(i2);
    }

    public List<? extends ku> getAttributionUrlOrBuilderList() {
        return this.attributionUrl_;
    }

    public String getCopyrightOwner() {
        return this.copyrightOwner_;
    }

    public com.google.v.v getCopyrightOwnerBytes() {
        return com.google.v.v.s(this.copyrightOwner_);
    }

    public int getCopyrightYear() {
        return this.copyrightYear_;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public String getImporterBuildInfo() {
        return this.importerBuildInfo_;
    }

    public com.google.v.v getImporterBuildInfoBytes() {
        return com.google.v.v.s(this.importerBuildInfo_);
    }

    public String getImporterBuildTarget() {
        return this.importerBuildTarget_;
    }

    public com.google.v.v getImporterBuildTargetBytes() {
        return com.google.v.v.s(this.importerBuildTarget_);
    }

    public String getImporterClientInfo() {
        return this.importerClientInfo_;
    }

    public com.google.v.v getImporterClientInfoBytes() {
        return com.google.v.v.s(this.importerClientInfo_);
    }

    public String getImporterMpmVersion() {
        return this.importerMpmVersion_;
    }

    public com.google.v.v getImporterMpmVersionBytes() {
        return com.google.v.v.s(this.importerMpmVersion_);
    }

    public String getImporterTimestamp() {
        return this.importerTimestamp_;
    }

    public com.google.v.v getImporterTimestampBytes() {
        return com.google.v.v.s(this.importerTimestamp_);
    }

    public ar getProvider() {
        ar arVarA = ar.a(this.provider_);
        return arVarA == null ? ar.PROVIDER_UNKNOWN : arVarA;
    }

    public fv getRawMetadata(int i2) {
        return this.rawMetadata_.get(i2);
    }

    public int getRawMetadataCount() {
        return this.rawMetadata_.size();
    }

    public List<fv> getRawMetadataList() {
        return this.rawMetadata_;
    }

    public fw getRawMetadataOrBuilder(int i2) {
        return this.rawMetadata_.get(i2);
    }

    public List<? extends fw> getRawMetadataOrBuilderList() {
        return this.rawMetadata_;
    }

    public String getRelease() {
        return this.release_;
    }

    public com.google.v.v getReleaseBytes() {
        return com.google.v.v.s(this.release_);
    }

    public au getReleaseDate() {
        au auVar = this.releaseDate_;
        return auVar == null ? au.getDefaultInstance() : auVar;
    }

    public String getSourceDataset() {
        return this.sourceDataset_;
    }

    public com.google.v.v getSourceDatasetBytes() {
        return com.google.v.v.s(this.sourceDataset_);
    }

    public boolean hasCopyrightOwner() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCopyrightYear() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasImporterBuildInfo() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasImporterBuildTarget() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasImporterClientInfo() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasImporterMpmVersion() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasImporterTimestamp() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRelease() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasReleaseDate() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSourceDataset() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(com.google.v.z zVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributionUrl(kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.add(ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRawMetadata(fv fvVar) {
        Objects.requireNonNull(fvVar);
        ensureRawMetadataIsMutable();
        this.rawMetadata_.add(fvVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
