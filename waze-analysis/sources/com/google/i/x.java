package com.google.i;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.en;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x extends dq<x, u> implements y {
    public static final int BOOL_VALUE_FIELD_NUMBER = 5;
    public static final int CITATION_FIELD_NUMBER = 19;
    public static final int COMPOUND_VALUE_FIELD_NUMBER = 9;
    private static final x DEFAULT_INSTANCE;
    public static final int DELETION_PROVENANCE_FIELD_NUMBER = 22;
    public static final int DISPLAY_LANG_FIELD_NUMBER = 12;
    public static final int DISPLAY_VALUE_FIELD_NUMBER = 11;
    public static final int EXPECTED_PROTO_FIELD_NUMBER = 14;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 7;
    public static final int ID_VALUE_FIELD_NUMBER = 3;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int INT_VALUE_FIELD_NUMBER = 6;
    public static final int LANG_FIELD_NUMBER = 8;
    public static final int LAT_LONG_VALUE_FIELD_NUMBER = 16;
    public static final int MEASUREMENT_VALUE_FIELD_NUMBER = 17;
    public static final int NESTED_STRUCT_FIELD_NUMBER = 23;
    private static volatile fo<x> PARSER = null;
    public static final int PROVENANCE_FIELD_NUMBER = 15;
    public static final int RAW_VALUE_FIELD_NUMBER = 13;
    public static final int STRING_VALUE_FIELD_NUMBER = 4;
    public static final int SUBGRAPH_ID_FIELD_NUMBER = 21;
    public static final int TIMESTAMP_FIELD_NUMBER = 10;
    public static final int TIMESTAMP_USEC_FIELD_NUMBER = 18;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean boolValue_;
    private b citation_;
    private s compoundValue_;
    private double floatValue_;
    private d idValue_;
    private long index_;
    private long intValue_;
    private f latLongValue_;
    private k measurementValue_;
    private m nestedStruct_;
    private long timestampUsec_;
    private int type_;
    private byte memoizedIsInitialized = 2;
    private String stringValue_ = "";
    private String lang_ = "";
    private String timestamp_ = "";
    private String displayValue_ = "";
    private String displayLang_ = "";
    private com.google.v.v rawValue_ = com.google.v.v.f13054a;
    private String expectedProto_ = "";
    private eo<com.google.z.b.a.a.k> provenance_ = emptyProtobufList();
    private eo<com.google.z.b.a.a.k> deletionProvenance_ = emptyProtobufList();
    private en subgraphId_ = emptyLongList();

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeletionProvenance(Iterable<? extends com.google.z.b.a.a.k> iterable) {
        ensureDeletionProvenanceIsMutable();
        com.google.v.c.addAll(iterable, this.deletionProvenance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvenance(Iterable<? extends com.google.z.b.a.a.k> iterable) {
        ensureProvenanceIsMutable();
        com.google.v.c.addAll(iterable, this.provenance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubgraphId(Iterable<? extends Long> iterable) {
        ensureSubgraphIdIsMutable();
        com.google.v.c.addAll(iterable, this.subgraphId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeletionProvenance(int i2, com.google.z.b.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvenance(int i2, com.google.z.b.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        ensureProvenanceIsMutable();
        this.provenance_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubgraphId(long j2) {
        ensureSubgraphIdIsMutable();
        this.subgraphId_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        this.bitField0_ &= -9;
        this.boolValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCitation() {
        this.citation_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompoundValue() {
        this.compoundValue_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletionProvenance() {
        this.deletionProvenance_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayLang() {
        this.bitField0_ &= -2049;
        this.displayLang_ = getDefaultInstance().getDisplayLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayValue() {
        this.bitField0_ &= -1025;
        this.displayValue_ = getDefaultInstance().getDisplayValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedProto() {
        this.bitField0_ &= -16385;
        this.expectedProto_ = getDefaultInstance().getExpectedProto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatValue() {
        this.bitField0_ &= -33;
        this.floatValue_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdValue() {
        this.idValue_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -32769;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        this.bitField0_ &= -17;
        this.intValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLang() {
        this.bitField0_ &= -65;
        this.lang_ = getDefaultInstance().getLang();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatLongValue() {
        this.latLongValue_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasurementValue() {
        this.measurementValue_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestedStruct() {
        this.nestedStruct_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvenance() {
        this.provenance_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawValue() {
        this.bitField0_ &= -4097;
        this.rawValue_ = getDefaultInstance().getRawValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -5;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubgraphId() {
        this.subgraphId_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.bitField0_ &= -257;
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampUsec() {
        this.bitField0_ &= -513;
        this.timestampUsec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureDeletionProvenanceIsMutable() {
        eo<com.google.z.b.a.a.k> eoVar = this.deletionProvenance_;
        if (eoVar.c()) {
            return;
        }
        this.deletionProvenance_ = du.mutableCopy(eoVar);
    }

    private void ensureProvenanceIsMutable() {
        eo<com.google.z.b.a.a.k> eoVar = this.provenance_;
        if (eoVar.c()) {
            return;
        }
        this.provenance_ = du.mutableCopy(eoVar);
    }

    private void ensureSubgraphIdIsMutable() {
        en enVar = this.subgraphId_;
        if (enVar.c()) {
            return;
        }
        this.subgraphId_ = du.mutableCopy(enVar);
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCitation(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.citation_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.citation_ = bVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCompoundValue(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.compoundValue_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder(sVar2);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.compoundValue_ = sVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdValue(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.idValue_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.idValue_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatLongValue(f fVar) {
        Objects.requireNonNull(fVar);
        f fVar2 = this.latLongValue_;
        if (fVar2 != null && fVar2 != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder(fVar2);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.latLongValue_ = fVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMeasurementValue(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.measurementValue_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            g gVarNewBuilder = k.newBuilder(kVar2);
            gVarNewBuilder.mergeFrom((g) kVar);
            kVar = gVarNewBuilder.buildPartial();
        }
        this.measurementValue_ = kVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNestedStruct(m mVar) {
        Objects.requireNonNull(mVar);
        m mVar2 = this.nestedStruct_;
        if (mVar2 != null && mVar2 != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.nestedStruct_ = mVar;
        this.bitField0_ |= 8192;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
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
    public void setBoolValue(boolean z) {
        this.bitField0_ |= 8;
        this.boolValue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCitation(b bVar) {
        Objects.requireNonNull(bVar);
        this.citation_ = bVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompoundValue(s sVar) {
        Objects.requireNonNull(sVar);
        this.compoundValue_ = sVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletionProvenance(int i2, com.google.z.b.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.displayLang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayLangBytes(com.google.v.v vVar) {
        this.displayLang_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.displayValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayValueBytes(com.google.v.v vVar) {
        this.displayValue_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedProto(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.expectedProto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedProtoBytes(com.google.v.v vVar) {
        this.expectedProto_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatValue(double d2) {
        this.bitField0_ |= 32;
        this.floatValue_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdValue(d dVar) {
        Objects.requireNonNull(dVar);
        this.idValue_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 32768;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(long j2) {
        this.bitField0_ |= 16;
        this.intValue_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLang(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.lang_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLangBytes(com.google.v.v vVar) {
        this.lang_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatLongValue(f fVar) {
        Objects.requireNonNull(fVar);
        this.latLongValue_ = fVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasurementValue(k kVar) {
        Objects.requireNonNull(kVar);
        this.measurementValue_ = kVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNestedStruct(m mVar) {
        Objects.requireNonNull(mVar);
        this.nestedStruct_ = mVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvenance(int i2, com.google.z.b.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        ensureProvenanceIsMutable();
        this.provenance_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 4096;
        this.rawValue_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.stringValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.v.v vVar) {
        this.stringValue_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubgraphId(int i2, long j2) {
        ensureSubgraphIdIsMutable();
        this.subgraphId_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.timestamp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampBytes(com.google.v.v vVar) {
        this.timestamp_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampUsec(long j2) {
        this.bitField0_ |= 512;
        this.timestampUsec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(w wVar) {
        this.type_ = wVar.getNumber();
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u0006\u0001ဃ\u000f\u0002᠌\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007က\u0005\bဈ\u0006\tᐉ\u0007\nဈ\b\u000bဈ\n\fဈ\u000b\rည\f\u000eဈ\u000e\u000fЛ\u0010ဉ\u0010\u0011ᐉ\u0011\u0012ဂ\t\u0013ဉ\u0012\u0015\u0015\u0016Л\u0017ᐉ\r", new Object[]{"bitField0_", "index_", "type_", v.f11069a, "idValue_", "stringValue_", "boolValue_", "intValue_", "floatValue_", "lang_", "compoundValue_", "timestamp_", "displayValue_", "displayLang_", "rawValue_", "expectedProto_", "provenance_", com.google.z.b.a.a.k.class, "latLongValue_", "measurementValue_", "timestampUsec_", "citation_", "subgraphId_", "deletionProvenance_", com.google.z.b.a.a.k.class, "nestedStruct_"});
            case 3:
                return new x();
            case 4:
                return new u(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<x> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (x.class) {
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

    public boolean getBoolValue() {
        return this.boolValue_;
    }

    @Deprecated
    public b getCitation() {
        b bVar = this.citation_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public s getCompoundValue() {
        s sVar = this.compoundValue_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public com.google.z.b.a.a.k getDeletionProvenance(int i2) {
        return this.deletionProvenance_.get(i2);
    }

    public int getDeletionProvenanceCount() {
        return this.deletionProvenance_.size();
    }

    public List<com.google.z.b.a.a.k> getDeletionProvenanceList() {
        return this.deletionProvenance_;
    }

    public com.google.z.b.a.a.l getDeletionProvenanceOrBuilder(int i2) {
        return this.deletionProvenance_.get(i2);
    }

    public List<? extends com.google.z.b.a.a.l> getDeletionProvenanceOrBuilderList() {
        return this.deletionProvenance_;
    }

    public String getDisplayLang() {
        return this.displayLang_;
    }

    public com.google.v.v getDisplayLangBytes() {
        return com.google.v.v.s(this.displayLang_);
    }

    public String getDisplayValue() {
        return this.displayValue_;
    }

    public com.google.v.v getDisplayValueBytes() {
        return com.google.v.v.s(this.displayValue_);
    }

    public String getExpectedProto() {
        return this.expectedProto_;
    }

    public com.google.v.v getExpectedProtoBytes() {
        return com.google.v.v.s(this.expectedProto_);
    }

    public double getFloatValue() {
        return this.floatValue_;
    }

    public d getIdValue() {
        d dVar = this.idValue_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    @Deprecated
    public long getIndex() {
        return this.index_;
    }

    public long getIntValue() {
        return this.intValue_;
    }

    public String getLang() {
        return this.lang_;
    }

    public com.google.v.v getLangBytes() {
        return com.google.v.v.s(this.lang_);
    }

    @Deprecated
    public f getLatLongValue() {
        f fVar = this.latLongValue_;
        return fVar == null ? f.getDefaultInstance() : fVar;
    }

    @Deprecated
    public k getMeasurementValue() {
        k kVar = this.measurementValue_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public m getNestedStruct() {
        m mVar = this.nestedStruct_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public com.google.z.b.a.a.k getProvenance(int i2) {
        return this.provenance_.get(i2);
    }

    public int getProvenanceCount() {
        return this.provenance_.size();
    }

    public List<com.google.z.b.a.a.k> getProvenanceList() {
        return this.provenance_;
    }

    public com.google.z.b.a.a.l getProvenanceOrBuilder(int i2) {
        return this.provenance_.get(i2);
    }

    public List<? extends com.google.z.b.a.a.l> getProvenanceOrBuilderList() {
        return this.provenance_;
    }

    public com.google.v.v getRawValue() {
        return this.rawValue_;
    }

    public String getStringValue() {
        return this.stringValue_;
    }

    public com.google.v.v getStringValueBytes() {
        return com.google.v.v.s(this.stringValue_);
    }

    @Deprecated
    public long getSubgraphId(int i2) {
        return this.subgraphId_.a(i2);
    }

    @Deprecated
    public int getSubgraphIdCount() {
        return this.subgraphId_.size();
    }

    @Deprecated
    public List<Long> getSubgraphIdList() {
        return this.subgraphId_;
    }

    @Deprecated
    public String getTimestamp() {
        return this.timestamp_;
    }

    @Deprecated
    public com.google.v.v getTimestampBytes() {
        return com.google.v.v.s(this.timestamp_);
    }

    public long getTimestampUsec() {
        return this.timestampUsec_;
    }

    public w getType() {
        w wVarA = w.a(this.type_);
        return wVarA == null ? w.TYPE_NULL : wVarA;
    }

    public boolean hasBoolValue() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasCitation() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasCompoundValue() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDisplayLang() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasDisplayValue() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasExpectedProto() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasFloatValue() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIdValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasIndex() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasIntValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasLang() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasLatLongValue() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Deprecated
    public boolean hasMeasurementValue() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasNestedStruct() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasRawValue() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasStringValue() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasTimestamp() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimestampUsec() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static u newBuilder(x xVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeletionProvenance(com.google.z.b.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        ensureDeletionProvenanceIsMutable();
        this.deletionProvenance_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvenance(com.google.z.b.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        ensureProvenanceIsMutable();
        this.provenance_.add(kVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
