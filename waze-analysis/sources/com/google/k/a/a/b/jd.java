package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jd extends com.google.v.du<jd, jc> implements je {
    public static final int ATTRIBUTION_URL_FIELD_NUMBER = 12;
    public static final int COLLECTION_DATE_FIELD_NUMBER = 10;
    public static final int COOKIE_FIELD_NUMBER = 3;
    public static final int DATASET_FIELD_NUMBER = 6;
    private static final jd DEFAULT_INSTANCE;
    public static final int GAIA_ID_FIELD_NUMBER = 9;
    public static final int IMPERSONATION_USER_FIELD_NUMBER = 15;
    public static final int LAYER_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 18502900;
    public static final int OGR_FID_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<jd> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int RAW_DATA_FIELD_NUMBER = 2;
    public static final int RELEASE_FIELD_NUMBER = 5;
    public static final int SOURCE_ID_FIELD_NUMBER = 1;
    public static final int STREAM_ID_FIELD_NUMBER = 16;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 11;
    public static final int USER_FIELD_NUMBER = 14;
    public static final com.google.v.ds<com.google.w.n.a.b, jd> messageSetExtension;
    private int bitField0_;
    private au collectionDate_;
    private long gaiaId_;
    private kz impersonationUser_;
    private long ogrFid_;
    private bw sourceId_;
    private com.google.w.n.a.b temporaryData_;
    private kz user_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<fr> rawData_ = emptyProtobufList();
    private String cookie_ = "";
    private int provider_ = 4369;
    private String release_ = "";
    private String dataset_ = "";
    private String layer_ = "";
    private com.google.v.eo<kt> attributionUrl_ = emptyProtobufList();
    private String streamId_ = "";

    static {
        jd jdVar = new jd();
        DEFAULT_INSTANCE = jdVar;
        com.google.v.du.registerDefaultInstance(jd.class, jdVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, jd.class);
    }

    private jd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributionUrl(Iterable<? extends kt> iterable) {
        ensureAttributionUrlIsMutable();
        com.google.v.c.addAll(iterable, this.attributionUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRawData(Iterable<? extends fr> iterable) {
        ensureRawDataIsMutable();
        com.google.v.c.addAll(iterable, this.rawData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributionUrl(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.add(i2, ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRawData(int i2, fr frVar) {
        Objects.requireNonNull(frVar);
        ensureRawDataIsMutable();
        this.rawData_.add(i2, frVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributionUrl() {
        this.attributionUrl_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionDate() {
        this.collectionDate_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCookie() {
        this.bitField0_ &= -3;
        this.cookie_ = getDefaultInstance().getCookie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataset() {
        this.bitField0_ &= -17;
        this.dataset_ = getDefaultInstance().getDataset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaiaId() {
        this.bitField0_ &= -129;
        this.gaiaId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpersonationUser() {
        this.impersonationUser_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayer() {
        this.bitField0_ &= -33;
        this.layer_ = getDefaultInstance().getLayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgrFid() {
        this.bitField0_ &= -65;
        this.ogrFid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -5;
        this.provider_ = 4369;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawData() {
        this.rawData_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelease() {
        this.bitField0_ &= -9;
        this.release_ = getDefaultInstance().getRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceId() {
        this.sourceId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamId() {
        this.bitField0_ &= -4097;
        this.streamId_ = getDefaultInstance().getStreamId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        this.user_ = null;
        this.bitField0_ &= -257;
    }

    private void ensureAttributionUrlIsMutable() {
        com.google.v.eo<kt> eoVar = this.attributionUrl_;
        if (eoVar.c()) {
            return;
        }
        this.attributionUrl_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRawDataIsMutable() {
        com.google.v.eo<fr> eoVar = this.rawData_;
        if (eoVar.c()) {
            return;
        }
        this.rawData_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCollectionDate(au auVar) {
        Objects.requireNonNull(auVar);
        au auVar2 = this.collectionDate_;
        if (auVar2 != null && auVar2 != au.getDefaultInstance()) {
            as asVarNewBuilder = au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.collectionDate_ = auVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImpersonationUser(kz kzVar) {
        Objects.requireNonNull(kzVar);
        kz kzVar2 = this.impersonationUser_;
        if (kzVar2 != null && kzVar2 != kz.getDefaultInstance()) {
            ky kyVarNewBuilder = kz.newBuilder(kzVar2);
            kyVarNewBuilder.mergeFrom((ky) kzVar);
            kzVar = kyVarNewBuilder.buildPartial();
        }
        this.impersonationUser_ = kzVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.sourceId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.sourceId_ = bwVar;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUser(kz kzVar) {
        Objects.requireNonNull(kzVar);
        kz kzVar2 = this.user_;
        if (kzVar2 != null && kzVar2 != kz.getDefaultInstance()) {
            ky kyVarNewBuilder = kz.newBuilder(kzVar2);
            kyVarNewBuilder.mergeFrom((ky) kzVar);
            kzVar = kyVarNewBuilder.buildPartial();
        }
        this.user_ = kzVar;
        this.bitField0_ |= 256;
    }

    public static jc newBuilder() {
        return (jc) DEFAULT_INSTANCE.createBuilder();
    }

    public static jd parseDelimitedFrom(InputStream inputStream) {
        return (jd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jd parseFrom(com.google.v.v vVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributionUrl(int i2) {
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRawData(int i2) {
        ensureRawDataIsMutable();
        this.rawData_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributionUrl(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.set(i2, ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionDate(au auVar) {
        Objects.requireNonNull(auVar);
        this.collectionDate_ = auVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCookie(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.cookie_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCookieBytes(com.google.v.v vVar) {
        this.cookie_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataset(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.dataset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatasetBytes(com.google.v.v vVar) {
        this.dataset_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaiaId(long j2) {
        this.bitField0_ |= 128;
        this.gaiaId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpersonationUser(kz kzVar) {
        Objects.requireNonNull(kzVar);
        this.impersonationUser_ = kzVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.layer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayerBytes(com.google.v.v vVar) {
        this.layer_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgrFid(long j2) {
        this.bitField0_ |= 64;
        this.ogrFid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(int i2) {
        this.bitField0_ |= 4;
        this.provider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawData(int i2, fr frVar) {
        Objects.requireNonNull(frVar);
        ensureRawDataIsMutable();
        this.rawData_.set(i2, frVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelease(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.release_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseBytes(com.google.v.v vVar) {
        this.release_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.sourceId_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.streamId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamIdBytes(com.google.v.v vVar) {
        this.streamId_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUser(kz kzVar) {
        Objects.requireNonNull(kzVar);
        this.user_ = kzVar;
        this.bitField0_ |= 256;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\u0004\u0001ᐉ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဂ\u0006\tဂ\u0007\nဉ\n\u000bᐉ\u000b\fЛ\u000eဉ\b\u000fဉ\t\u0010ဈ\f", new Object[]{"bitField0_", "sourceId_", "rawData_", fr.class, "cookie_", "provider_", "release_", "dataset_", "layer_", "ogrFid_", "gaiaId_", "collectionDate_", "temporaryData_", "attributionUrl_", kt.class, "user_", "impersonationUser_", "streamId_"});
            case 3:
                return new jd();
            case 4:
                return new jc(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jd> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jd.class) {
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

    public au getCollectionDate() {
        au auVar = this.collectionDate_;
        return auVar == null ? au.getDefaultInstance() : auVar;
    }

    public String getCookie() {
        return this.cookie_;
    }

    public com.google.v.v getCookieBytes() {
        return com.google.v.v.s(this.cookie_);
    }

    public String getDataset() {
        return this.dataset_;
    }

    public com.google.v.v getDatasetBytes() {
        return com.google.v.v.s(this.dataset_);
    }

    @Deprecated
    public long getGaiaId() {
        return this.gaiaId_;
    }

    public kz getImpersonationUser() {
        kz kzVar = this.impersonationUser_;
        return kzVar == null ? kz.getDefaultInstance() : kzVar;
    }

    public String getLayer() {
        return this.layer_;
    }

    public com.google.v.v getLayerBytes() {
        return com.google.v.v.s(this.layer_);
    }

    public long getOgrFid() {
        return this.ogrFid_;
    }

    public int getProvider() {
        return this.provider_;
    }

    public fr getRawData(int i2) {
        return this.rawData_.get(i2);
    }

    public int getRawDataCount() {
        return this.rawData_.size();
    }

    public List<fr> getRawDataList() {
        return this.rawData_;
    }

    public fs getRawDataOrBuilder(int i2) {
        return this.rawData_.get(i2);
    }

    public List<? extends fs> getRawDataOrBuilderList() {
        return this.rawData_;
    }

    public String getRelease() {
        return this.release_;
    }

    public com.google.v.v getReleaseBytes() {
        return com.google.v.v.s(this.release_);
    }

    public bw getSourceId() {
        bw bwVar = this.sourceId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public String getStreamId() {
        return this.streamId_;
    }

    public com.google.v.v getStreamIdBytes() {
        return com.google.v.v.s(this.streamId_);
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public kz getUser() {
        kz kzVar = this.user_;
        return kzVar == null ? kz.getDefaultInstance() : kzVar;
    }

    public boolean hasCollectionDate() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCookie() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDataset() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasGaiaId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasImpersonationUser() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasLayer() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOgrFid() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRelease() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSourceId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStreamId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasUser() {
        return (this.bitField0_ & 256) != 0;
    }

    public static jc newBuilder(jd jdVar) {
        return (jc) DEFAULT_INSTANCE.createBuilder(jdVar);
    }

    public static jd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jd parseFrom(com.google.v.z zVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributionUrl(kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureAttributionUrlIsMutable();
        this.attributionUrl_.add(ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRawData(fr frVar) {
        Objects.requireNonNull(frVar);
        ensureRawDataIsMutable();
        this.rawData_.add(frVar);
    }

    public static jd parseFrom(InputStream inputStream) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jd parseFrom(ByteBuffer byteBuffer) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jd parseFrom(byte[] bArr) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
