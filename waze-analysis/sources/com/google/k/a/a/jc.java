package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jc extends com.google.v.du<jc, jb> implements jd {
    public static final int AGGREGATOR_ID_FIELD_NUMBER = 6;
    public static final int AVAILABLE_TIME_FIELD_NUMBER = 3;
    public static final int CUISINES_FIELD_NUMBER = 5;
    private static final jc DEFAULT_INSTANCE;
    public static final int NAME_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jc> PARSER = null;
    public static final int SECTION_FIELD_NUMBER = 4;
    public static final int SOURCE_URL_FIELD_NUMBER = 2;
    private static final com.google.v.el<hb> cuisines_converter_ = new fn(9);
    private long aggregatorId_;
    private com.google.k.a.a.b.kj availableTime_;
    private int bitField0_;
    private com.google.k.a.a.b.kw sourceUrl_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<iz> nameInfo_ = emptyProtobufList();
    private com.google.v.eo<jf> section_ = emptyProtobufList();
    private com.google.v.ek cuisines_ = emptyIntList();

    static {
        jc jcVar = new jc();
        DEFAULT_INSTANCE = jcVar;
        com.google.v.du.registerDefaultInstance(jc.class, jcVar);
    }

    private jc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCuisines(Iterable<? extends hb> iterable) {
        ensureCuisinesIsMutable();
        Iterator<? extends hb> it = iterable.iterator();
        while (it.hasNext()) {
            this.cuisines_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNameInfo(Iterable<? extends iz> iterable) {
        ensureNameInfoIsMutable();
        com.google.v.c.addAll(iterable, this.nameInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSection(Iterable<? extends jf> iterable) {
        ensureSectionIsMutable();
        com.google.v.c.addAll(iterable, this.section_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCuisines(hb hbVar) {
        Objects.requireNonNull(hbVar);
        ensureCuisinesIsMutable();
        this.cuisines_.i(hbVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSection(int i2, jf jfVar) {
        Objects.requireNonNull(jfVar);
        ensureSectionIsMutable();
        this.section_.add(i2, jfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregatorId() {
        this.bitField0_ &= -5;
        this.aggregatorId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableTime() {
        this.availableTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCuisines() {
        this.cuisines_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameInfo() {
        this.nameInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSection() {
        this.section_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceUrl() {
        this.sourceUrl_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureCuisinesIsMutable() {
        com.google.v.ek ekVar = this.cuisines_;
        if (ekVar.c()) {
            return;
        }
        this.cuisines_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureNameInfoIsMutable() {
        com.google.v.eo<iz> eoVar = this.nameInfo_;
        if (eoVar.c()) {
            return;
        }
        this.nameInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSectionIsMutable() {
        com.google.v.eo<jf> eoVar = this.section_;
        if (eoVar.c()) {
            return;
        }
        this.section_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailableTime(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        com.google.k.a.a.b.kj kjVar2 = this.availableTime_;
        if (kjVar2 != null && kjVar2 != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.availableTime_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceUrl(com.google.k.a.a.b.kw kwVar) {
        Objects.requireNonNull(kwVar);
        com.google.k.a.a.b.kw kwVar2 = this.sourceUrl_;
        if (kwVar2 != null && kwVar2 != com.google.k.a.a.b.kw.getDefaultInstance()) {
            com.google.k.a.a.b.kv kvVarNewBuilder = com.google.k.a.a.b.kw.newBuilder(kwVar2);
            kvVarNewBuilder.mergeFrom((com.google.k.a.a.b.kv) kwVar);
            kwVar = kvVarNewBuilder.buildPartial();
        }
        this.sourceUrl_ = kwVar;
        this.bitField0_ |= 1;
    }

    public static jb newBuilder() {
        return (jb) DEFAULT_INSTANCE.createBuilder();
    }

    public static jc parseDelimitedFrom(InputStream inputStream) {
        return (jc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jc parseFrom(com.google.v.v vVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNameInfo(int i2) {
        ensureNameInfoIsMutable();
        this.nameInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSection(int i2) {
        ensureSectionIsMutable();
        this.section_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregatorId(long j2) {
        this.bitField0_ |= 4;
        this.aggregatorId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableTime(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.availableTime_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCuisines(int i2, hb hbVar) {
        Objects.requireNonNull(hbVar);
        ensureCuisinesIsMutable();
        this.cuisines_.e(i2, hbVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.set(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSection(int i2, jf jfVar) {
        Objects.requireNonNull(jfVar);
        ensureSectionIsMutable();
        this.section_.set(i2, jfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceUrl(com.google.k.a.a.b.kw kwVar) {
        Objects.requireNonNull(kwVar);
        this.sourceUrl_ = kwVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0002\u0001\u001b\u0002ᐉ\u0000\u0003ဉ\u0001\u0004Л\u0005ࠞ\u0006ဃ\u0002", new Object[]{"bitField0_", "nameInfo_", iz.class, "sourceUrl_", "availableTime_", "section_", jf.class, "cuisines_", ha.f11884a, "aggregatorId_"});
            case 3:
                return new jc();
            case 4:
                return new jb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jc> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jc.class) {
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

    public long getAggregatorId() {
        return this.aggregatorId_;
    }

    public com.google.k.a.a.b.kj getAvailableTime() {
        com.google.k.a.a.b.kj kjVar = this.availableTime_;
        return kjVar == null ? com.google.k.a.a.b.kj.getDefaultInstance() : kjVar;
    }

    public hb getCuisines(int i2) {
        hb hbVarA = hb.a(this.cuisines_.d(i2));
        return hbVarA == null ? hb.CUISINE_UNDEFINED : hbVarA;
    }

    public int getCuisinesCount() {
        return this.cuisines_.size();
    }

    public List<hb> getCuisinesList() {
        return new com.google.v.em(this.cuisines_, cuisines_converter_);
    }

    public iz getNameInfo(int i2) {
        return this.nameInfo_.get(i2);
    }

    public int getNameInfoCount() {
        return this.nameInfo_.size();
    }

    public List<iz> getNameInfoList() {
        return this.nameInfo_;
    }

    public ja getNameInfoOrBuilder(int i2) {
        return this.nameInfo_.get(i2);
    }

    public List<? extends ja> getNameInfoOrBuilderList() {
        return this.nameInfo_;
    }

    public jf getSection(int i2) {
        return this.section_.get(i2);
    }

    public int getSectionCount() {
        return this.section_.size();
    }

    public List<jf> getSectionList() {
        return this.section_;
    }

    public jg getSectionOrBuilder(int i2) {
        return this.section_.get(i2);
    }

    public List<? extends jg> getSectionOrBuilderList() {
        return this.section_;
    }

    public com.google.k.a.a.b.kw getSourceUrl() {
        com.google.k.a.a.b.kw kwVar = this.sourceUrl_;
        return kwVar == null ? com.google.k.a.a.b.kw.getDefaultInstance() : kwVar;
    }

    public boolean hasAggregatorId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAvailableTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSourceUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jb newBuilder(jc jcVar) {
        return (jb) DEFAULT_INSTANCE.createBuilder(jcVar);
    }

    public static jc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jc parseFrom(com.google.v.z zVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSection(jf jfVar) {
        Objects.requireNonNull(jfVar);
        ensureSectionIsMutable();
        this.section_.add(jfVar);
    }

    public static jc parseFrom(InputStream inputStream) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jc parseFrom(ByteBuffer byteBuffer) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jc parseFrom(byte[] bArr) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
