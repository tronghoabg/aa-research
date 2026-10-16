package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class js extends com.google.v.du<js, jo> implements com.google.v.fj {
    private static final js DEFAULT_INSTANCE;
    public static final int IS_VARIABLE_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<js> PARSER = null;
    public static final int RELATED_SIGNPOSTS_FIELD_NUMBER = 3;
    public static final int SEGMENT_FIELD_NUMBER = 1;
    public static final int TRAVEL_PATTERN_RESTRICTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isVariable_;
    private com.google.k.a.a.b.ce metadata_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> segment_ = emptyProtobufList();
    private com.google.v.eo<jq> travelPatternRestrictions_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.b.bw> relatedSignposts_ = emptyProtobufList();

    static {
        js jsVar = new js();
        DEFAULT_INSTANCE = jsVar;
        com.google.v.du.registerDefaultInstance(js.class, jsVar);
    }

    private js() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelatedSignposts(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureRelatedSignpostsIsMutable();
        com.google.v.c.addAll(iterable, this.relatedSignposts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegment(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.segment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTravelPatternRestrictions(Iterable<? extends jq> iterable) {
        ensureTravelPatternRestrictionsIsMutable();
        com.google.v.c.addAll(iterable, this.travelPatternRestrictions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedSignposts(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedSignpostsIsMutable();
        this.relatedSignposts_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSegmentIsMutable();
        this.segment_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTravelPatternRestrictions(int i2, jq jqVar) {
        Objects.requireNonNull(jqVar);
        ensureTravelPatternRestrictionsIsMutable();
        this.travelPatternRestrictions_.add(i2, jqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVariable() {
        this.bitField0_ &= -2;
        this.isVariable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedSignposts() {
        this.relatedSignposts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelPatternRestrictions() {
        this.travelPatternRestrictions_ = emptyProtobufList();
    }

    private void ensureRelatedSignpostsIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.relatedSignposts_;
        if (eoVar.c()) {
            return;
        }
        this.relatedSignposts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSegmentIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.segment_;
        if (eoVar.c()) {
            return;
        }
        this.segment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTravelPatternRestrictionsIsMutable() {
        com.google.v.eo<jq> eoVar = this.travelPatternRestrictions_;
        if (eoVar.c()) {
            return;
        }
        this.travelPatternRestrictions_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static js getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(com.google.k.a.a.b.ce ceVar) {
        Objects.requireNonNull(ceVar);
        com.google.k.a.a.b.ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != com.google.k.a.a.b.ce.getDefaultInstance()) {
            com.google.k.a.a.b.cd cdVarNewBuilder = com.google.k.a.a.b.ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((com.google.k.a.a.b.cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 2;
    }

    public static jo newBuilder() {
        return (jo) DEFAULT_INSTANCE.createBuilder();
    }

    public static js parseDelimitedFrom(InputStream inputStream) {
        return (js) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static js parseFrom(com.google.v.v vVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<js> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelatedSignposts(int i2) {
        ensureRelatedSignpostsIsMutable();
        this.relatedSignposts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegment(int i2) {
        ensureSegmentIsMutable();
        this.segment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTravelPatternRestrictions(int i2) {
        ensureTravelPatternRestrictionsIsMutable();
        this.travelPatternRestrictions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVariable(boolean z) {
        this.bitField0_ |= 1;
        this.isVariable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(com.google.k.a.a.b.ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedSignposts(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedSignpostsIsMutable();
        this.relatedSignposts_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSegmentIsMutable();
        this.segment_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelPatternRestrictions(int i2, jq jqVar) {
        Objects.requireNonNull(jqVar);
        ensureTravelPatternRestrictionsIsMutable();
        this.travelPatternRestrictions_.set(i2, jqVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001Ǵ\u0005\u0000\u0003\u0002\u0001Л\u0002\u001b\u0003Л\u0004ဇ\u0000Ǵဉ\u0001", new Object[]{"bitField0_", "segment_", com.google.k.a.a.b.bw.class, "travelPatternRestrictions_", jq.class, "relatedSignposts_", com.google.k.a.a.b.bw.class, "isVariable_", "metadata_"});
            case 3:
                return new js();
            case 4:
                return new jo(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<js> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (js.class) {
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

    public boolean getIsVariable() {
        return this.isVariable_;
    }

    public com.google.k.a.a.b.ce getMetadata() {
        com.google.k.a.a.b.ce ceVar = this.metadata_;
        return ceVar == null ? com.google.k.a.a.b.ce.getDefaultInstance() : ceVar;
    }

    public com.google.k.a.a.b.bw getRelatedSignposts(int i2) {
        return this.relatedSignposts_.get(i2);
    }

    public int getRelatedSignpostsCount() {
        return this.relatedSignposts_.size();
    }

    public List<com.google.k.a.a.b.bw> getRelatedSignpostsList() {
        return this.relatedSignposts_;
    }

    public com.google.k.a.a.b.bx getRelatedSignpostsOrBuilder(int i2) {
        return this.relatedSignposts_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getRelatedSignpostsOrBuilderList() {
        return this.relatedSignposts_;
    }

    public com.google.k.a.a.b.bw getSegment(int i2) {
        return this.segment_.get(i2);
    }

    public int getSegmentCount() {
        return this.segment_.size();
    }

    public List<com.google.k.a.a.b.bw> getSegmentList() {
        return this.segment_;
    }

    public com.google.k.a.a.b.bx getSegmentOrBuilder(int i2) {
        return this.segment_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getSegmentOrBuilderList() {
        return this.segment_;
    }

    public jq getTravelPatternRestrictions(int i2) {
        return this.travelPatternRestrictions_.get(i2);
    }

    public int getTravelPatternRestrictionsCount() {
        return this.travelPatternRestrictions_.size();
    }

    public List<jq> getTravelPatternRestrictionsList() {
        return this.travelPatternRestrictions_;
    }

    public jr getTravelPatternRestrictionsOrBuilder(int i2) {
        return this.travelPatternRestrictions_.get(i2);
    }

    public List<? extends jr> getTravelPatternRestrictionsOrBuilderList() {
        return this.travelPatternRestrictions_;
    }

    public boolean hasIsVariable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static jo newBuilder(js jsVar) {
        return (jo) DEFAULT_INSTANCE.createBuilder(jsVar);
    }

    public static js parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (js) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static js parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static js parseFrom(com.google.v.z zVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static js parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedSignposts(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedSignpostsIsMutable();
        this.relatedSignposts_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSegmentIsMutable();
        this.segment_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTravelPatternRestrictions(jq jqVar) {
        Objects.requireNonNull(jqVar);
        ensureTravelPatternRestrictionsIsMutable();
        this.travelPatternRestrictions_.add(jqVar);
    }

    public static js parseFrom(InputStream inputStream) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static js parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static js parseFrom(ByteBuffer byteBuffer) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static js parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static js parseFrom(byte[] bArr) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static js parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
