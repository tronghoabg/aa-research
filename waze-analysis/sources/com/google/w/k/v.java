package com.google.w.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.gm;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends du<v, n> implements ac {
    private static final v DEFAULT_INSTANCE;
    public static final int IS_NEGATION_FIELD_NUMBER = 19;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 75852567;
    public static final int OBJ_FIELD_NUMBER = 17;
    private static volatile fo<v> PARSER = null;
    public static final int PRED_FIELD_NUMBER = 2;
    public static final int PROVENANCE_FIELD_NUMBER = 16;
    public static final int QUALIFIER_SETS_FIELD_NUMBER = 20;
    public static final int SUB_FIELD_NUMBER = 1;
    public static final ds<com.google.w.n.a.b, v> messageSetExtension;
    private int bitField0_;
    private boolean isNegation_;
    private aa obj_;
    private String sub_ = "";
    private String pred_ = "";
    private eo<t> provenance_ = emptyProtobufList();
    private eo<j> qualifierSets_ = emptyProtobufList();

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        du.registerDefaultInstance(v.class, vVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, v.class);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvenance(Iterable<? extends t> iterable) {
        ensureProvenanceIsMutable();
        com.google.v.c.addAll(iterable, this.provenance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQualifierSets(Iterable<? extends j> iterable) {
        ensureQualifierSetsIsMutable();
        com.google.v.c.addAll(iterable, this.qualifierSets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvenance(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureProvenanceIsMutable();
        this.provenance_.add(i2, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifierSets(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.add(i2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNegation() {
        this.bitField0_ &= -9;
        this.isNegation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObj() {
        this.obj_ = null;
        this.bitField0_ &= -5;
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
    public void clearSub() {
        this.bitField0_ &= -2;
        this.sub_ = getDefaultInstance().getSub();
    }

    private void ensureProvenanceIsMutable() {
        eo<t> eoVar = this.provenance_;
        if (eoVar.c()) {
            return;
        }
        this.provenance_ = du.mutableCopy(eoVar);
    }

    private void ensureQualifierSetsIsMutable() {
        eo<j> eoVar = this.qualifierSets_;
        if (eoVar.c()) {
            return;
        }
        this.qualifierSets_ = du.mutableCopy(eoVar);
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeObj(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.obj_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            w wVarNewBuilder = aa.newBuilder(aaVar2);
            wVarNewBuilder.mergeFrom((w) aaVar);
            aaVar = wVarNewBuilder.buildPartial();
        }
        this.obj_ = aaVar;
        this.bitField0_ |= 4;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setIsNegation(boolean z) {
        this.bitField0_ |= 8;
        this.isNegation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObj(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.obj_ = aaVar;
        this.bitField0_ |= 4;
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
    public void setProvenance(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureProvenanceIsMutable();
        this.provenance_.set(i2, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualifierSets(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.set(i2, jVar);
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0014\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0010\u001b\u0011ဉ\u0002\u0013ဇ\u0003\u0014\u001b", new Object[]{"bitField0_", "sub_", "pred_", "provenance_", t.class, "obj_", "isNegation_", "qualifierSets_", j.class});
        }
        if (iOrdinal == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsNegation() {
        return this.isNegation_;
    }

    public aa getObj() {
        aa aaVar = this.obj_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public String getPred() {
        return this.pred_;
    }

    public com.google.v.v getPredBytes() {
        return com.google.v.v.s(this.pred_);
    }

    public t getProvenance(int i2) {
        return this.provenance_.get(i2);
    }

    public int getProvenanceCount() {
        return this.provenance_.size();
    }

    public List<t> getProvenanceList() {
        return this.provenance_;
    }

    public u getProvenanceOrBuilder(int i2) {
        return this.provenance_.get(i2);
    }

    public List<? extends u> getProvenanceOrBuilderList() {
        return this.provenance_;
    }

    public j getQualifierSets(int i2) {
        return this.qualifierSets_.get(i2);
    }

    public int getQualifierSetsCount() {
        return this.qualifierSets_.size();
    }

    public List<j> getQualifierSetsList() {
        return this.qualifierSets_;
    }

    public k getQualifierSetsOrBuilder(int i2) {
        return this.qualifierSets_.get(i2);
    }

    public List<? extends k> getQualifierSetsOrBuilderList() {
        return this.qualifierSets_;
    }

    public String getSub() {
        return this.sub_;
    }

    public com.google.v.v getSubBytes() {
        return com.google.v.v.s(this.sub_);
    }

    public boolean hasIsNegation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasObj() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPred() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSub() {
        return (this.bitField0_ & 1) != 0;
    }

    public static n newBuilder(v vVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(com.google.v.z zVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(com.google.v.z zVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvenance(t tVar) {
        Objects.requireNonNull(tVar);
        ensureProvenanceIsMutable();
        this.provenance_.add(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualifierSets(j jVar) {
        Objects.requireNonNull(jVar);
        ensureQualifierSetsIsMutable();
        this.qualifierSets_.add(jVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
