package com.google.z.b.a.a;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.en;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.gm;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends dq<m, a> implements n {
    private static final m DEFAULT_INSTANCE;
    public static final int DELETED_ON_FIELD_NUMBER = 10;
    public static final int DELETION_PROVENANCE_FIELD_NUMBER = 13;
    public static final int EDGE_WEIGHT_FIELD_NUMBER = 18;
    public static final int EXPECTED_PROTO_FIELD_NUMBER = 12;
    public static final int FORWARD_ORDER_FIELD_NUMBER = 8;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 43918061;
    public static final int OBJ_FIELD_NUMBER = 3;
    public static final int OBJ_TYPE_FIELD_NUMBER = 5;
    private static volatile fo<m> PARSER = null;
    public static final int PRED_FIELD_NUMBER = 2;
    public static final int PROVENANCE_FIELD_NUMBER = 11;
    public static final int QUALIFIER_SETS_FIELD_NUMBER = 17;
    public static final int REVERSE_ORDER_FIELD_NUMBER = 9;
    public static final int SUBGRAPH_ID_FIELD_NUMBER = 15;
    public static final int SUB_FIELD_NUMBER = 1;
    public static final int TEXT_LANG_FIELD_NUMBER = 6;
    public static final int TIMESTAMP_FIELD_NUMBER = 7;
    public static final ds<com.google.w.n.a.b, m> messageSetExtension;
    private int bitField0_;
    private long deletedOn_;
    private double edgeWeight_;
    private long forwardOrder_;
    private int objType_;
    private long reverseOrder_;
    private byte memoizedIsInitialized = 2;
    private String sub_ = "";
    private String pred_ = "";
    private String obj_ = "";
    private String textLang_ = "en";
    private long timestamp_ = -1;
    private eo<k> provenance_ = emptyProtobufList();
    private String expectedProto_ = "";
    private eo<k> deletionProvenance_ = emptyProtobufList();
    private en subgraphId_ = emptyLongList();
    private eo<com.google.w.k.j> qualifierSets_ = emptyProtobufList();

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, m.class);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeletionProvenance(Iterable<? extends k> iterable) {
        ensureDeletionProvenanceIsMutable();
        com.google.v.c.addAll(iterable, this.deletionProvenance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvenance(Iterable<? extends k> iterable) {
        ensureProvenanceIsMutable();
        com.google.v.c.addAll(iterable, this.provenance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQualifierSets(Iterable<? extends com.google.w.k.j> iterable) {
        ensureQualifierSetsIsMutable();
        com.google.v.c.addAll(iterable, this.qualifierSets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubgraphId(Iterable<? extends Long> iterable) {
        ensureSubgraphIdIsMutable();
        com.google.v.c.addAll(iterable, this.subgraphId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeletionProvenance(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvenance(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureProvenanceIsMutable();
        this.provenance_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifierSets(int i2, com.google.w.k.j jVar) {
        Objects.requireNonNull(jVar);
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.add(i2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubgraphId(long j2) {
        ensureSubgraphIdIsMutable();
        this.subgraphId_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedOn() {
        this.bitField0_ &= -257;
        this.deletedOn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletionProvenance() {
        this.deletionProvenance_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdgeWeight() {
        this.bitField0_ &= -1025;
        this.edgeWeight_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedProto() {
        this.bitField0_ &= -513;
        this.expectedProto_ = getDefaultInstance().getExpectedProto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForwardOrder() {
        this.bitField0_ &= -65;
        this.forwardOrder_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObj() {
        this.bitField0_ &= -5;
        this.obj_ = getDefaultInstance().getObj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjType() {
        this.bitField0_ &= -9;
        this.objType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPred() {
        this.bitField0_ &= -3;
        this.pred_ = getDefaultInstance().getPred();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvenance() {
        this.provenance_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualifierSets() {
        this.qualifierSets_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReverseOrder() {
        this.bitField0_ &= -129;
        this.reverseOrder_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSub() {
        this.bitField0_ &= -2;
        this.sub_ = getDefaultInstance().getSub();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubgraphId() {
        this.subgraphId_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextLang() {
        this.bitField0_ &= -17;
        this.textLang_ = getDefaultInstance().getTextLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.bitField0_ &= -33;
        this.timestamp_ = -1L;
    }

    private void ensureDeletionProvenanceIsMutable() {
        eo<k> eoVar = this.deletionProvenance_;
        if (eoVar.c()) {
            return;
        }
        this.deletionProvenance_ = du.mutableCopy(eoVar);
    }

    private void ensureProvenanceIsMutable() {
        eo<k> eoVar = this.provenance_;
        if (eoVar.c()) {
            return;
        }
        this.provenance_ = du.mutableCopy(eoVar);
    }

    private void ensureQualifierSetsIsMutable() {
        eo<com.google.w.k.j> eoVar = this.qualifierSets_;
        if (eoVar.c()) {
            return;
        }
        this.qualifierSets_ = du.mutableCopy(eoVar);
    }

    private void ensureSubgraphIdIsMutable() {
        en enVar = this.subgraphId_;
        if (enVar.c()) {
            return;
        }
        this.subgraphId_ = du.mutableCopy(enVar);
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeletionProvenance(int i2) {
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProvenance(int i2) {
        ensureProvenanceIsMutable();
        this.provenance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQualifierSets(int i2) {
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedOn(long j2) {
        this.bitField0_ |= 256;
        this.deletedOn_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletionProvenance(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdgeWeight(double d2) {
        this.bitField0_ |= 1024;
        this.edgeWeight_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedProto(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.expectedProto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedProtoBytes(com.google.v.v vVar) {
        this.expectedProto_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForwardOrder(long j2) {
        this.bitField0_ |= 64;
        this.forwardOrder_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObj(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.obj_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjBytes(com.google.v.v vVar) {
        this.obj_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjType(b bVar) {
        this.objType_ = bVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPred(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.pred_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredBytes(com.google.v.v vVar) {
        this.pred_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvenance(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureProvenanceIsMutable();
        this.provenance_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualifierSets(int i2, com.google.w.k.j jVar) {
        Objects.requireNonNull(jVar);
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.set(i2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseOrder(long j2) {
        this.bitField0_ |= 128;
        this.reverseOrder_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSub(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.sub_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubBytes(com.google.v.v vVar) {
        this.sub_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubgraphId(int i2, long j2) {
        ensureSubgraphIdIsMutable();
        this.subgraphId_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.textLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextLangBytes(com.google.v.v vVar) {
        this.textLang_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.bitField0_ |= 32;
        this.timestamp_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u0012\u000f\u0000\u0004\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bЛ\fဈ\t\rЛ\u000f\u0015\u0011\u001b\u0012က\n", new Object[]{"bitField0_", "sub_", "pred_", "obj_", "objType_", d.f13492b, "textLang_", "timestamp_", "forwardOrder_", "reverseOrder_", "deletedOn_", "provenance_", k.class, "expectedProto_", "deletionProvenance_", k.class, "subgraphId_", "qualifierSets_", com.google.w.k.j.class, "edgeWeight_"});
            case 3:
                return new m();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<m> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (m.class) {
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

    public long getDeletedOn() {
        return this.deletedOn_;
    }

    public k getDeletionProvenance(int i2) {
        return this.deletionProvenance_.get(i2);
    }

    public int getDeletionProvenanceCount() {
        return this.deletionProvenance_.size();
    }

    public List<k> getDeletionProvenanceList() {
        return this.deletionProvenance_;
    }

    public l getDeletionProvenanceOrBuilder(int i2) {
        return this.deletionProvenance_.get(i2);
    }

    public List<? extends l> getDeletionProvenanceOrBuilderList() {
        return this.deletionProvenance_;
    }

    public double getEdgeWeight() {
        return this.edgeWeight_;
    }

    public String getExpectedProto() {
        return this.expectedProto_;
    }

    public com.google.v.v getExpectedProtoBytes() {
        return com.google.v.v.s(this.expectedProto_);
    }

    public long getForwardOrder() {
        return this.forwardOrder_;
    }

    public String getObj() {
        return this.obj_;
    }

    public com.google.v.v getObjBytes() {
        return com.google.v.v.s(this.obj_);
    }

    public b getObjType() {
        b bVarA = b.a(this.objType_);
        return bVarA == null ? b.ID : bVarA;
    }

    public String getPred() {
        return this.pred_;
    }

    public com.google.v.v getPredBytes() {
        return com.google.v.v.s(this.pred_);
    }

    public k getProvenance(int i2) {
        return this.provenance_.get(i2);
    }

    public int getProvenanceCount() {
        return this.provenance_.size();
    }

    public List<k> getProvenanceList() {
        return this.provenance_;
    }

    public l getProvenanceOrBuilder(int i2) {
        return this.provenance_.get(i2);
    }

    public List<? extends l> getProvenanceOrBuilderList() {
        return this.provenance_;
    }

    public com.google.w.k.j getQualifierSets(int i2) {
        return this.qualifierSets_.get(i2);
    }

    public int getQualifierSetsCount() {
        return this.qualifierSets_.size();
    }

    public List<com.google.w.k.j> getQualifierSetsList() {
        return this.qualifierSets_;
    }

    public com.google.w.k.k getQualifierSetsOrBuilder(int i2) {
        return this.qualifierSets_.get(i2);
    }

    public List<? extends com.google.w.k.k> getQualifierSetsOrBuilderList() {
        return this.qualifierSets_;
    }

    public long getReverseOrder() {
        return this.reverseOrder_;
    }

    public String getSub() {
        return this.sub_;
    }

    public com.google.v.v getSubBytes() {
        return com.google.v.v.s(this.sub_);
    }

    public long getSubgraphId(int i2) {
        return this.subgraphId_.a(i2);
    }

    public int getSubgraphIdCount() {
        return this.subgraphId_.size();
    }

    public List<Long> getSubgraphIdList() {
        return this.subgraphId_;
    }

    public String getTextLang() {
        return this.textLang_;
    }

    public com.google.v.v getTextLangBytes() {
        return com.google.v.v.s(this.textLang_);
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasDeletedOn() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasEdgeWeight() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasExpectedProto() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasForwardOrder() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasObj() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasObjType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPred() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReverseOrder() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSub() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTextLang() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(m mVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeletionProvenance(k kVar) {
        Objects.requireNonNull(kVar);
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvenance(k kVar) {
        Objects.requireNonNull(kVar);
        ensureProvenanceIsMutable();
        this.provenance_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifierSets(com.google.w.k.j jVar) {
        Objects.requireNonNull(jVar);
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.add(jVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
