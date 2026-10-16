package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fv extends com.google.v.du<fv, ft> implements com.google.v.fj {
    public static final int BORDER_SEGMENT_FIELD_NUMBER = 1;
    private static final fv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fv> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int VIEWER_REGION_CODE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int status_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> borderSegment_ = emptyProtobufList();
    private com.google.v.eo<String> viewerRegionCode_ = emptyProtobufList();

    static {
        fv fvVar = new fv();
        DEFAULT_INSTANCE = fvVar;
        com.google.v.du.registerDefaultInstance(fv.class, fvVar);
    }

    private fv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBorderSegment(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureBorderSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.borderSegment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViewerRegionCode(Iterable<String> iterable) {
        ensureViewerRegionCodeIsMutable();
        com.google.v.c.addAll(iterable, this.viewerRegionCode_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBorderSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureBorderSegmentIsMutable();
        this.borderSegment_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViewerRegionCode(String str) {
        Objects.requireNonNull(str);
        ensureViewerRegionCodeIsMutable();
        this.viewerRegionCode_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViewerRegionCodeBytes(com.google.v.v vVar) {
        ensureViewerRegionCodeIsMutable();
        this.viewerRegionCode_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderSegment() {
        this.borderSegment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewerRegionCode() {
        this.viewerRegionCode_ = emptyProtobufList();
    }

    private void ensureBorderSegmentIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.borderSegment_;
        if (eoVar.c()) {
            return;
        }
        this.borderSegment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureViewerRegionCodeIsMutable() {
        com.google.v.eo<String> eoVar = this.viewerRegionCode_;
        if (eoVar.c()) {
            return;
        }
        this.viewerRegionCode_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ft newBuilder() {
        return (ft) DEFAULT_INSTANCE.createBuilder();
    }

    public static fv parseDelimitedFrom(InputStream inputStream) {
        return (fv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fv parseFrom(com.google.v.v vVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBorderSegment(int i2) {
        ensureBorderSegmentIsMutable();
        this.borderSegment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderSegment(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureBorderSegmentIsMutable();
        this.borderSegment_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(fu fuVar) {
        this.status_ = fuVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewerRegionCode(int i2, String str) {
        Objects.requireNonNull(str);
        ensureViewerRegionCodeIsMutable();
        this.viewerRegionCode_.set(i2, str);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002᠌\u0000\u0003\u001a", new Object[]{"bitField0_", "borderSegment_", com.google.k.a.a.b.bw.class, "status_", h.q, "viewerRegionCode_"});
            case 3:
                return new fv();
            case 4:
                return new ft(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fv.class) {
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

    public com.google.k.a.a.b.bw getBorderSegment(int i2) {
        return this.borderSegment_.get(i2);
    }

    public int getBorderSegmentCount() {
        return this.borderSegment_.size();
    }

    public List<com.google.k.a.a.b.bw> getBorderSegmentList() {
        return this.borderSegment_;
    }

    public com.google.k.a.a.b.bx getBorderSegmentOrBuilder(int i2) {
        return this.borderSegment_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getBorderSegmentOrBuilderList() {
        return this.borderSegment_;
    }

    public fu getStatus() {
        fu fuVarA = fu.a(this.status_);
        return fuVarA == null ? fu.STATUS_UNSPECIFIED : fuVarA;
    }

    public String getViewerRegionCode(int i2) {
        return this.viewerRegionCode_.get(i2);
    }

    public com.google.v.v getViewerRegionCodeBytes(int i2) {
        return com.google.v.v.s(this.viewerRegionCode_.get(i2));
    }

    public int getViewerRegionCodeCount() {
        return this.viewerRegionCode_.size();
    }

    public List<String> getViewerRegionCodeList() {
        return this.viewerRegionCode_;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ft newBuilder(fv fvVar) {
        return (ft) DEFAULT_INSTANCE.createBuilder(fvVar);
    }

    public static fv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fv parseFrom(com.google.v.z zVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBorderSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureBorderSegmentIsMutable();
        this.borderSegment_.add(bwVar);
    }

    public static fv parseFrom(InputStream inputStream) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fv parseFrom(ByteBuffer byteBuffer) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fv parseFrom(byte[] bArr) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
