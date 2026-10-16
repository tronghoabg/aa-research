package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends du<s, r> implements fj {
    private static final s DEFAULT_INSTANCE;
    public static final int DIRECT_WRITE_RECORD_IDS_FIELD_NUMBER = 5;
    public static final int LG_INTERNAL_WRITER_ID_FIELD_NUMBER = 3;
    private static volatile fo<s> PARSER = null;
    public static final int PROVENANCE_ONLY_ADDITION_FIELD_NUMBER = 4;
    public static final int TRIANGULATION_KEY_FIELD_NUMBER = 2;
    public static final int WEAK_DATA_FIELD_NUMBER = 1;
    private int bitField0_;
    private long lgInternalWriterId_;
    private boolean provenanceOnlyAddition_;
    private boolean weakData_;
    private eo<String> triangulationKey_ = emptyProtobufList();
    private eo<String> directWriteRecordIds_ = emptyProtobufList();

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDirectWriteRecordIds(Iterable<String> iterable) {
        ensureDirectWriteRecordIdsIsMutable();
        com.google.v.c.addAll(iterable, this.directWriteRecordIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTriangulationKey(Iterable<String> iterable) {
        ensureTriangulationKeyIsMutable();
        com.google.v.c.addAll(iterable, this.triangulationKey_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDirectWriteRecordIds(String str) {
        Objects.requireNonNull(str);
        ensureDirectWriteRecordIdsIsMutable();
        this.directWriteRecordIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDirectWriteRecordIdsBytes(com.google.v.v vVar) {
        ensureDirectWriteRecordIdsIsMutable();
        this.directWriteRecordIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriangulationKey(String str) {
        Objects.requireNonNull(str);
        ensureTriangulationKeyIsMutable();
        this.triangulationKey_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriangulationKeyBytes(com.google.v.v vVar) {
        ensureTriangulationKeyIsMutable();
        this.triangulationKey_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirectWriteRecordIds() {
        this.directWriteRecordIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLgInternalWriterId() {
        this.bitField0_ &= -3;
        this.lgInternalWriterId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvenanceOnlyAddition() {
        this.bitField0_ &= -5;
        this.provenanceOnlyAddition_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriangulationKey() {
        this.triangulationKey_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeakData() {
        this.bitField0_ &= -2;
        this.weakData_ = false;
    }

    private void ensureDirectWriteRecordIdsIsMutable() {
        eo<String> eoVar = this.directWriteRecordIds_;
        if (eoVar.c()) {
            return;
        }
        this.directWriteRecordIds_ = du.mutableCopy(eoVar);
    }

    private void ensureTriangulationKeyIsMutable() {
        eo<String> eoVar = this.triangulationKey_;
        if (eoVar.c()) {
            return;
        }
        this.triangulationKey_ = du.mutableCopy(eoVar);
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectWriteRecordIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureDirectWriteRecordIdsIsMutable();
        this.directWriteRecordIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLgInternalWriterId(long j2) {
        this.bitField0_ |= 2;
        this.lgInternalWriterId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvenanceOnlyAddition(boolean z) {
        this.bitField0_ |= 4;
        this.provenanceOnlyAddition_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriangulationKey(int i2, String str) {
        Objects.requireNonNull(str);
        ensureTriangulationKeyIsMutable();
        this.triangulationKey_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeakData(boolean z) {
        this.bitField0_ |= 1;
        this.weakData_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002\u001a\u0003ဃ\u0001\u0004ဇ\u0002\u0005\u001a", new Object[]{"bitField0_", "weakData_", "triangulationKey_", "lgInternalWriterId_", "provenanceOnlyAddition_", "directWriteRecordIds_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDirectWriteRecordIds(int i2) {
        return this.directWriteRecordIds_.get(i2);
    }

    public com.google.v.v getDirectWriteRecordIdsBytes(int i2) {
        return com.google.v.v.s(this.directWriteRecordIds_.get(i2));
    }

    public int getDirectWriteRecordIdsCount() {
        return this.directWriteRecordIds_.size();
    }

    public List<String> getDirectWriteRecordIdsList() {
        return this.directWriteRecordIds_;
    }

    public long getLgInternalWriterId() {
        return this.lgInternalWriterId_;
    }

    public boolean getProvenanceOnlyAddition() {
        return this.provenanceOnlyAddition_;
    }

    public String getTriangulationKey(int i2) {
        return this.triangulationKey_.get(i2);
    }

    public com.google.v.v getTriangulationKeyBytes(int i2) {
        return com.google.v.v.s(this.triangulationKey_.get(i2));
    }

    public int getTriangulationKeyCount() {
        return this.triangulationKey_.size();
    }

    public List<String> getTriangulationKeyList() {
        return this.triangulationKey_;
    }

    public boolean getWeakData() {
        return this.weakData_;
    }

    public boolean hasLgInternalWriterId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProvenanceOnlyAddition() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWeakData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
