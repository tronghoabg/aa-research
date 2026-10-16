package com.google.w.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fo;
import com.google.z.b.a.a.am;
import com.google.z.b.a.a.ao;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends du<t, p> implements u {
    public static final int ACCESS_REQUIRED_FIELD_NUMBER = 8;
    public static final int CREATOR_FIELD_NUMBER = 10;
    public static final int DATASET_MID_FIELD_NUMBER = 5;
    private static final t DEFAULT_INSTANCE;
    public static final int IS_SUPPORTING_DATA_FIELD_NUMBER = 7;
    public static final int LG_METADATA_FIELD_NUMBER = 11;
    private static volatile fo<t> PARSER = null;
    public static final int POLICY_METADATA_FIELD_NUMBER = 12;
    public static final int PROCESS_FIELD_NUMBER = 1;
    public static final int RESTRICTIONS_FIELD_NUMBER = 6;
    public static final int SOURCE_CATEGORY_FIELD_NUMBER = 4;
    public static final int SOURCE_CONTENT_REFERENCE_FIELD_NUMBER = 13;
    public static final int SOURCE_DOC_ID_FIELD_NUMBER = 3;
    public static final int SOURCE_URL_FIELD_NUMBER = 2;
    public static final int SPII_CERTIFICATION_FIELD_NUMBER = 9;
    private static final el<q> restrictions_converter_ = new o();
    private int accessRequired_;
    private int bitField0_;
    private long datasetMid_;
    private boolean isSupportingData_;
    private com.google.z.b.a.a.s lgMetadata_;
    private com.google.z.b.a.a.ab policyMetadata_;
    private m sourceContentReference_;
    private long sourceDocId_;
    private ao spiiCertification_;
    private String process_ = "";
    private String sourceUrl_ = "";
    private int sourceCategory_ = 1;
    private ek restrictions_ = emptyIntList();
    private String creator_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestrictions(Iterable<? extends q> iterable) {
        ensureRestrictionsIsMutable();
        Iterator<? extends q> it = iterable.iterator();
        while (it.hasNext()) {
            this.restrictions_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictions(q qVar) {
        Objects.requireNonNull(qVar);
        ensureRestrictionsIsMutable();
        this.restrictions_.i(qVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessRequired() {
        this.bitField0_ &= -65;
        this.accessRequired_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreator() {
        this.bitField0_ &= -257;
        this.creator_ = getDefaultInstance().getCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatasetMid() {
        this.bitField0_ &= -17;
        this.datasetMid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupportingData() {
        this.bitField0_ &= -33;
        this.isSupportingData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLgMetadata() {
        this.lgMetadata_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolicyMetadata() {
        this.policyMetadata_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcess() {
        this.bitField0_ &= -2;
        this.process_ = getDefaultInstance().getProcess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictions() {
        this.restrictions_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceCategory() {
        this.bitField0_ &= -9;
        this.sourceCategory_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContentReference() {
        this.sourceContentReference_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceDocId() {
        this.bitField0_ &= -5;
        this.sourceDocId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceUrl() {
        this.bitField0_ &= -3;
        this.sourceUrl_ = getDefaultInstance().getSourceUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpiiCertification() {
        this.spiiCertification_ = null;
        this.bitField0_ &= -129;
    }

    private void ensureRestrictionsIsMutable() {
        ek ekVar = this.restrictions_;
        if (ekVar.c()) {
            return;
        }
        this.restrictions_ = du.mutableCopy(ekVar);
    }

    public static t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLgMetadata(com.google.z.b.a.a.s sVar) {
        Objects.requireNonNull(sVar);
        com.google.z.b.a.a.s sVar2 = this.lgMetadata_;
        if (sVar2 != null && sVar2 != com.google.z.b.a.a.s.getDefaultInstance()) {
            com.google.z.b.a.a.r rVarNewBuilder = com.google.z.b.a.a.s.newBuilder(sVar2);
            rVarNewBuilder.mergeFrom((com.google.z.b.a.a.r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.lgMetadata_ = sVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolicyMetadata(com.google.z.b.a.a.ab abVar) {
        Objects.requireNonNull(abVar);
        com.google.z.b.a.a.ab abVar2 = this.policyMetadata_;
        if (abVar2 != null && abVar2 != com.google.z.b.a.a.ab.getDefaultInstance()) {
            com.google.z.b.a.a.z zVarNewBuilder = com.google.z.b.a.a.ab.newBuilder(abVar2);
            zVarNewBuilder.mergeFrom((com.google.z.b.a.a.z) abVar);
            abVar = zVarNewBuilder.buildPartial();
        }
        this.policyMetadata_ = abVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContentReference(m mVar) {
        Objects.requireNonNull(mVar);
        m mVar2 = this.sourceContentReference_;
        if (mVar2 != null && mVar2 != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.sourceContentReference_ = mVar;
        this.bitField0_ |= 2048;
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
        this.bitField0_ |= 128;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static t parseDelimitedFrom(InputStream inputStream) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(com.google.v.v vVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<t> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessRequired(int i2) {
        this.bitField0_ |= 64;
        this.accessRequired_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreator(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.creator_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatorBytes(com.google.v.v vVar) {
        this.creator_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatasetMid(long j2) {
        this.bitField0_ |= 16;
        this.datasetMid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupportingData(boolean z) {
        this.bitField0_ |= 32;
        this.isSupportingData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLgMetadata(com.google.z.b.a.a.s sVar) {
        Objects.requireNonNull(sVar);
        this.lgMetadata_ = sVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolicyMetadata(com.google.z.b.a.a.ab abVar) {
        Objects.requireNonNull(abVar);
        this.policyMetadata_ = abVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcess(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.process_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessBytes(com.google.v.v vVar) {
        this.process_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictions(int i2, q qVar) {
        Objects.requireNonNull(qVar);
        ensureRestrictionsIsMutable();
        this.restrictions_.e(i2, qVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceCategory(s sVar) {
        this.sourceCategory_ = sVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContentReference(m mVar) {
        Objects.requireNonNull(mVar);
        this.sourceContentReference_ = mVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceDocId(long j2) {
        this.bitField0_ |= 4;
        this.sourceDocId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.sourceUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceUrlBytes(com.google.v.v vVar) {
        this.sourceUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpiiCertification(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.spiiCertification_ = aoVar;
        this.bitField0_ |= 128;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဃ\u0004\u0006ࠞ\u0007ဇ\u0005\bင\u0006\tဉ\u0007\nဈ\b\u000bဉ\t\fဉ\n\rဉ\u000b", new Object[]{"bitField0_", "process_", "sourceUrl_", "sourceDocId_", "sourceCategory_", r.f13263a, "datasetMid_", "restrictions_", r.f13264b, "isSupportingData_", "accessRequired_", "spiiCertification_", "creator_", "lgMetadata_", "policyMetadata_", "sourceContentReference_"});
        }
        if (iOrdinal == 3) {
            return new t();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<t> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (t.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAccessRequired() {
        return this.accessRequired_;
    }

    public String getCreator() {
        return this.creator_;
    }

    public com.google.v.v getCreatorBytes() {
        return com.google.v.v.s(this.creator_);
    }

    public long getDatasetMid() {
        return this.datasetMid_;
    }

    public boolean getIsSupportingData() {
        return this.isSupportingData_;
    }

    public com.google.z.b.a.a.s getLgMetadata() {
        com.google.z.b.a.a.s sVar = this.lgMetadata_;
        return sVar == null ? com.google.z.b.a.a.s.getDefaultInstance() : sVar;
    }

    public com.google.z.b.a.a.ab getPolicyMetadata() {
        com.google.z.b.a.a.ab abVar = this.policyMetadata_;
        return abVar == null ? com.google.z.b.a.a.ab.getDefaultInstance() : abVar;
    }

    public String getProcess() {
        return this.process_;
    }

    public com.google.v.v getProcessBytes() {
        return com.google.v.v.s(this.process_);
    }

    public q getRestrictions(int i2) {
        q qVarA = q.a(this.restrictions_.d(i2));
        return qVarA == null ? q.REQUIRES_CITATION : qVarA;
    }

    public int getRestrictionsCount() {
        return this.restrictions_.size();
    }

    public List<q> getRestrictionsList() {
        return new em(this.restrictions_, restrictions_converter_);
    }

    public s getSourceCategory() {
        s sVarA = s.a(this.sourceCategory_);
        return sVarA == null ? s.THIRD_PARTY : sVarA;
    }

    public m getSourceContentReference() {
        m mVar = this.sourceContentReference_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public long getSourceDocId() {
        return this.sourceDocId_;
    }

    public String getSourceUrl() {
        return this.sourceUrl_;
    }

    public com.google.v.v getSourceUrlBytes() {
        return com.google.v.v.s(this.sourceUrl_);
    }

    public ao getSpiiCertification() {
        ao aoVar = this.spiiCertification_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public boolean hasAccessRequired() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCreator() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDatasetMid() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsSupportingData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLgMetadata() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasPolicyMetadata() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasProcess() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSourceCategory() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSourceContentReference() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSourceDocId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSourceUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSpiiCertification() {
        return (this.bitField0_ & 128) != 0;
    }

    public static p newBuilder(t tVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(tVar);
    }

    public static t parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(com.google.v.v vVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static t parseFrom(com.google.v.z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(com.google.v.z zVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static t parseFrom(InputStream inputStream) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(InputStream inputStream, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(ByteBuffer byteBuffer) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static t parseFrom(byte[] bArr) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t parseFrom(byte[] bArr, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
