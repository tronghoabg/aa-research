package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.en;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends dq<k, h> implements l {
    public static final int ACCESS_REQUIRED_FIELD_NUMBER = 14;
    public static final int ACCESS_REQUIRED_INT_FIELD_NUMBER = 20;
    public static final int AUTHORING_TIMESTAMP_FIELD_NUMBER = 8;
    public static final int CREATOR_FIELD_NUMBER = 1;
    public static final int DATASET_FIELD_NUMBER = 5;
    private static final k DEFAULT_INSTANCE;
    public static final int EXTRACTION_PATTERN_FIELD_NUMBER = 7;
    public static final int EXTRACTION_TIMESTAMP_FIELD_NUMBER = 9;
    public static final int FREEBASE_ATTRIBUTION_FIELD_NUMBER = 4;
    public static final int IS_SUPPORTING_DATA_FIELD_NUMBER = 13;
    public static final int LG_METADATA_FIELD_NUMBER = 19;
    private static volatile fo<k> PARSER = null;
    public static final int POLICY_METADATA_FIELD_NUMBER = 21;
    public static final int PROCESS_FIELD_NUMBER = 3;
    public static final int PROVENANCE_EXTENSION_FIELD_NUMBER = 12;
    public static final int RANKING_TOKEN_FIELD_NUMBER = 17;
    public static final int REQUIRES_TRIANGULATION_FIELD_NUMBER = 16;
    public static final int RESTRICTIONS_FIELD_NUMBER = 6;
    public static final int SOURCE_CATEGORY_FIELD_NUMBER = 10;
    public static final int SOURCE_CONTENT_REFERENCE_FIELD_NUMBER = 22;
    public static final int SOURCE_DOC_ID_FIELD_NUMBER = 11;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int SPII_CERTIFICATION_FIELD_NUMBER = 18;
    private static final el<i> restrictions_converter_ = new c(1);
    private static final el<j> sourceCategory_converter_ = new c(0);
    private int accessRequiredInt_;
    private int accessRequired_;
    private int bitField0_;
    private boolean isSupportingData_;
    private s lgMetadata_;
    private ab policyMetadata_;
    private com.google.w.n.a.b provenanceExtension_;
    private boolean requiresTriangulation_;
    private com.google.w.k.m sourceContentReference_;
    private ao spiiCertification_;
    private byte memoizedIsInitialized = 2;
    private String creator_ = "";
    private String source_ = "";
    private String process_ = "";
    private String rankingToken_ = "";
    private String dataset_ = "";
    private ek restrictions_ = emptyIntList();
    private ek sourceCategory_ = emptyIntList();
    private en sourceDocId_ = emptyLongList();
    private String freebaseAttribution_ = "";
    private com.google.v.v extractionPattern_ = com.google.v.v.f13054a;
    private long authoringTimestamp_ = -1;
    private long extractionTimestamp_ = -1;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestrictions(Iterable<? extends i> iterable) {
        ensureRestrictionsIsMutable();
        Iterator<? extends i> it = iterable.iterator();
        while (it.hasNext()) {
            this.restrictions_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceCategory(Iterable<? extends j> iterable) {
        ensureSourceCategoryIsMutable();
        Iterator<? extends j> it = iterable.iterator();
        while (it.hasNext()) {
            this.sourceCategory_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceDocId(Iterable<? extends Long> iterable) {
        ensureSourceDocIdIsMutable();
        com.google.v.c.addAll(iterable, this.sourceDocId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictions(i iVar) {
        Objects.requireNonNull(iVar);
        ensureRestrictionsIsMutable();
        this.restrictions_.i(iVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceCategory(j jVar) {
        Objects.requireNonNull(jVar);
        ensureSourceCategoryIsMutable();
        this.sourceCategory_.i(jVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceDocId(long j2) {
        ensureSourceDocIdIsMutable();
        this.sourceDocId_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessRequired() {
        this.bitField0_ &= -129;
        this.accessRequired_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessRequiredInt() {
        this.bitField0_ &= -257;
        this.accessRequiredInt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthoringTimestamp() {
        this.bitField0_ &= -16385;
        this.authoringTimestamp_ = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreator() {
        this.bitField0_ &= -2;
        this.creator_ = getDefaultInstance().getCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataset() {
        this.bitField0_ &= -17;
        this.dataset_ = getDefaultInstance().getDataset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtractionPattern() {
        this.bitField0_ &= -8193;
        this.extractionPattern_ = getDefaultInstance().getExtractionPattern();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtractionTimestamp() {
        this.bitField0_ &= -32769;
        this.extractionTimestamp_ = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreebaseAttribution() {
        this.bitField0_ &= -4097;
        this.freebaseAttribution_ = getDefaultInstance().getFreebaseAttribution();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupportingData() {
        this.bitField0_ &= -33;
        this.isSupportingData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLgMetadata() {
        this.lgMetadata_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolicyMetadata() {
        this.policyMetadata_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcess() {
        this.bitField0_ &= -5;
        this.process_ = getDefaultInstance().getProcess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvenanceExtension() {
        this.provenanceExtension_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankingToken() {
        this.bitField0_ &= -9;
        this.rankingToken_ = getDefaultInstance().getRankingToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiresTriangulation() {
        this.bitField0_ &= -65;
        this.requiresTriangulation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictions() {
        this.restrictions_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -3;
        this.source_ = getDefaultInstance().getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceCategory() {
        this.sourceCategory_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContentReference() {
        this.sourceContentReference_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceDocId() {
        this.sourceDocId_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpiiCertification() {
        this.spiiCertification_ = null;
        this.bitField0_ &= -513;
    }

    private void ensureRestrictionsIsMutable() {
        ek ekVar = this.restrictions_;
        if (ekVar.c()) {
            return;
        }
        this.restrictions_ = du.mutableCopy(ekVar);
    }

    private void ensureSourceCategoryIsMutable() {
        ek ekVar = this.sourceCategory_;
        if (ekVar.c()) {
            return;
        }
        this.sourceCategory_ = du.mutableCopy(ekVar);
    }

    private void ensureSourceDocIdIsMutable() {
        en enVar = this.sourceDocId_;
        if (enVar.c()) {
            return;
        }
        this.sourceDocId_ = du.mutableCopy(enVar);
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLgMetadata(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.lgMetadata_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder(sVar2);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.lgMetadata_ = sVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolicyMetadata(ab abVar) {
        Objects.requireNonNull(abVar);
        ab abVar2 = this.policyMetadata_;
        if (abVar2 != null && abVar2 != ab.getDefaultInstance()) {
            z zVarNewBuilder = ab.newBuilder(abVar2);
            zVarNewBuilder.mergeFrom((z) abVar);
            abVar = zVarNewBuilder.buildPartial();
        }
        this.policyMetadata_ = abVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProvenanceExtension(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.provenanceExtension_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.provenanceExtension_ = bVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContentReference(com.google.w.k.m mVar) {
        Objects.requireNonNull(mVar);
        com.google.w.k.m mVar2 = this.sourceContentReference_;
        if (mVar2 != null && mVar2 != com.google.w.k.m.getDefaultInstance()) {
            com.google.w.k.l lVarNewBuilder = com.google.w.k.m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((com.google.w.k.l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.sourceContentReference_ = mVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpiiCertification(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.spiiCertification_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            am amVarNewBuilder = ao.newBuilder(aoVar2);
            amVarNewBuilder.mergeFrom((am) aoVar);
            aoVar = amVarNewBuilder.buildPartial();
        }
        this.spiiCertification_ = aoVar;
        this.bitField0_ |= 512;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessRequired(e eVar) {
        this.accessRequired_ = eVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessRequiredInt(int i2) {
        this.bitField0_ |= 256;
        this.accessRequiredInt_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthoringTimestamp(long j2) {
        this.bitField0_ |= 16384;
        this.authoringTimestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreator(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.creator_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatorBytes(com.google.v.v vVar) {
        this.creator_ = vVar.u();
        this.bitField0_ |= 1;
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
    public void setExtractionPattern(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 8192;
        this.extractionPattern_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtractionTimestamp(long j2) {
        this.bitField0_ |= 32768;
        this.extractionTimestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreebaseAttribution(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.freebaseAttribution_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreebaseAttributionBytes(com.google.v.v vVar) {
        this.freebaseAttribution_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupportingData(boolean z) {
        this.bitField0_ |= 32;
        this.isSupportingData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLgMetadata(s sVar) {
        Objects.requireNonNull(sVar);
        this.lgMetadata_ = sVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolicyMetadata(ab abVar) {
        Objects.requireNonNull(abVar);
        this.policyMetadata_ = abVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcess(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.process_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessBytes(com.google.v.v vVar) {
        this.process_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvenanceExtension(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.provenanceExtension_ = bVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankingToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.rankingToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankingTokenBytes(com.google.v.v vVar) {
        this.rankingToken_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiresTriangulation(boolean z) {
        this.bitField0_ |= 64;
        this.requiresTriangulation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictions(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureRestrictionsIsMutable();
        this.restrictions_.e(i2, iVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.source_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceBytes(com.google.v.v vVar) {
        this.source_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceCategory(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureSourceCategoryIsMutable();
        this.sourceCategory_.e(i2, jVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContentReference(com.google.w.k.m mVar) {
        Objects.requireNonNull(mVar);
        this.sourceContentReference_ = mVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceDocId(int i2, long j2) {
        ensureSourceDocIdIsMutable();
        this.sourceDocId_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpiiCertification(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.spiiCertification_ = aoVar;
        this.bitField0_ |= 512;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0003\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\f\u0005ဈ\u0004\u0006ࠞ\u0007ည\r\bဂ\u000e\tဂ\u000f\nࠞ\u000b\u0014\fᐉ\u0010\rဇ\u0005\u000e᠌\u0007\u0010ဇ\u0006\u0011ဈ\u0003\u0012ဉ\t\u0013ဉ\n\u0014င\b\u0015ဉ\u000b\u0016ဉ\u0011", new Object[]{"bitField0_", "creator_", "source_", "process_", "freebaseAttribution_", "dataset_", "restrictions_", d.f13493c, "extractionPattern_", "authoringTimestamp_", "extractionTimestamp_", "sourceCategory_", d.f13494d, "sourceDocId_", "provenanceExtension_", "isSupportingData_", "accessRequired_", d.f13491a, "requiresTriangulation_", "rankingToken_", "spiiCertification_", "lgMetadata_", "accessRequiredInt_", "policyMetadata_", "sourceContentReference_"});
            case 3:
                return new k();
            case 4:
                return new h(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<k> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (k.class) {
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

    public e getAccessRequired() {
        e eVarA = e.a(this.accessRequired_);
        return eVarA == null ? e.ACCESS_REQUIREMENT_UNSPECIFIED : eVarA;
    }

    public int getAccessRequiredInt() {
        return this.accessRequiredInt_;
    }

    @Deprecated
    public long getAuthoringTimestamp() {
        return this.authoringTimestamp_;
    }

    public String getCreator() {
        return this.creator_;
    }

    public com.google.v.v getCreatorBytes() {
        return com.google.v.v.s(this.creator_);
    }

    public String getDataset() {
        return this.dataset_;
    }

    public com.google.v.v getDatasetBytes() {
        return com.google.v.v.s(this.dataset_);
    }

    @Deprecated
    public com.google.v.v getExtractionPattern() {
        return this.extractionPattern_;
    }

    @Deprecated
    public long getExtractionTimestamp() {
        return this.extractionTimestamp_;
    }

    @Deprecated
    public String getFreebaseAttribution() {
        return this.freebaseAttribution_;
    }

    @Deprecated
    public com.google.v.v getFreebaseAttributionBytes() {
        return com.google.v.v.s(this.freebaseAttribution_);
    }

    public boolean getIsSupportingData() {
        return this.isSupportingData_;
    }

    public s getLgMetadata() {
        s sVar = this.lgMetadata_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public ab getPolicyMetadata() {
        ab abVar = this.policyMetadata_;
        return abVar == null ? ab.getDefaultInstance() : abVar;
    }

    public String getProcess() {
        return this.process_;
    }

    public com.google.v.v getProcessBytes() {
        return com.google.v.v.s(this.process_);
    }

    @Deprecated
    public com.google.w.n.a.b getProvenanceExtension() {
        com.google.w.n.a.b bVar = this.provenanceExtension_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public String getRankingToken() {
        return this.rankingToken_;
    }

    public com.google.v.v getRankingTokenBytes() {
        return com.google.v.v.s(this.rankingToken_);
    }

    public boolean getRequiresTriangulation() {
        return this.requiresTriangulation_;
    }

    public i getRestrictions(int i2) {
        i iVarA = i.a(this.restrictions_.d(i2));
        return iVarA == null ? i.REQUIRES_CITATION : iVarA;
    }

    public int getRestrictionsCount() {
        return this.restrictions_.size();
    }

    public List<i> getRestrictionsList() {
        return new em(this.restrictions_, restrictions_converter_);
    }

    public String getSource() {
        return this.source_;
    }

    public com.google.v.v getSourceBytes() {
        return com.google.v.v.s(this.source_);
    }

    public j getSourceCategory(int i2) {
        j jVarA = j.a(this.sourceCategory_.d(i2));
        return jVarA == null ? j.THIRD_PARTY : jVarA;
    }

    public int getSourceCategoryCount() {
        return this.sourceCategory_.size();
    }

    public List<j> getSourceCategoryList() {
        return new em(this.sourceCategory_, sourceCategory_converter_);
    }

    public com.google.w.k.m getSourceContentReference() {
        com.google.w.k.m mVar = this.sourceContentReference_;
        return mVar == null ? com.google.w.k.m.getDefaultInstance() : mVar;
    }

    public long getSourceDocId(int i2) {
        return this.sourceDocId_.a(i2);
    }

    public int getSourceDocIdCount() {
        return this.sourceDocId_.size();
    }

    public List<Long> getSourceDocIdList() {
        return this.sourceDocId_;
    }

    public ao getSpiiCertification() {
        ao aoVar = this.spiiCertification_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public boolean hasAccessRequired() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasAccessRequiredInt() {
        return (this.bitField0_ & 256) != 0;
    }

    @Deprecated
    public boolean hasAuthoringTimestamp() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasCreator() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDataset() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasExtractionPattern() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Deprecated
    public boolean hasExtractionTimestamp() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Deprecated
    public boolean hasFreebaseAttribution() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasIsSupportingData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLgMetadata() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPolicyMetadata() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasProcess() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasProvenanceExtension() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasRankingToken() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRequiresTriangulation() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSourceContentReference() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasSpiiCertification() {
        return (this.bitField0_ & 512) != 0;
    }

    public static h newBuilder(k kVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
