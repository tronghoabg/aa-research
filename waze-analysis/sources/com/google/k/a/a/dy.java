package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dy extends com.google.v.du<dy, dw> implements com.google.v.fj {
    public static final int BULK_UPDATABLE_FIELD_NUMBER = 3;
    public static final int CORE_VERSION_TOKEN_FIELD_NUMBER = 5;
    private static final dy DEFAULT_INSTANCE;
    public static final int FEATURE_REPLACEMENT_INFO_FIELD_NUMBER = 7;
    public static final int FIELD_METADATA_FIELD_NUMBER = 6;
    public static final int FORWARDINGS_FIELD_NUMBER = 4;
    public static final int HISTORY_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<dy> PARSER = null;
    public static final int VERSION_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private int bulkUpdatable_;
    private com.google.v.v coreVersionToken_;
    private dr featureReplacementInfo_;
    private dn fieldMetadata_;
    private dt forwardings_;
    private dv history_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.v versionToken_;

    static {
        dy dyVar = new dy();
        DEFAULT_INSTANCE = dyVar;
        com.google.v.du.registerDefaultInstance(dy.class, dyVar);
    }

    private dy() {
        com.google.v.v vVar = com.google.v.v.f13054a;
        this.versionToken_ = vVar;
        this.coreVersionToken_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBulkUpdatable() {
        this.bitField0_ &= -9;
        this.bulkUpdatable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoreVersionToken() {
        this.bitField0_ &= -3;
        this.coreVersionToken_ = getDefaultInstance().getCoreVersionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureReplacementInfo() {
        this.featureReplacementInfo_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldMetadata() {
        this.fieldMetadata_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForwardings() {
        this.forwardings_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionToken() {
        this.bitField0_ &= -2;
        this.versionToken_ = getDefaultInstance().getVersionToken();
    }

    public static dy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureReplacementInfo(dr drVar) {
        Objects.requireNonNull(drVar);
        dr drVar2 = this.featureReplacementInfo_;
        if (drVar2 != null && drVar2 != dr.getDefaultInstance()) {
            dq dqVarNewBuilder = dr.newBuilder(drVar2);
            dqVarNewBuilder.mergeFrom((dq) drVar);
            drVar = dqVarNewBuilder.buildPartial();
        }
        this.featureReplacementInfo_ = drVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFieldMetadata(dn dnVar) {
        Objects.requireNonNull(dnVar);
        dn dnVar2 = this.fieldMetadata_;
        if (dnVar2 != null && dnVar2 != dn.getDefaultInstance()) {
            dj djVarNewBuilder = dn.newBuilder(dnVar2);
            djVarNewBuilder.mergeFrom((dj) dnVar);
            dnVar = djVarNewBuilder.buildPartial();
        }
        this.fieldMetadata_ = dnVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeForwardings(dt dtVar) {
        Objects.requireNonNull(dtVar);
        dt dtVar2 = this.forwardings_;
        if (dtVar2 != null && dtVar2 != dt.getDefaultInstance()) {
            ds dsVarNewBuilder = dt.newBuilder(dtVar2);
            dsVarNewBuilder.mergeFrom((ds) dtVar);
            dtVar = dsVarNewBuilder.buildPartial();
        }
        this.forwardings_ = dtVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHistory(dv dvVar) {
        Objects.requireNonNull(dvVar);
        dv dvVar2 = this.history_;
        if (dvVar2 != null && dvVar2 != dv.getDefaultInstance()) {
            du duVarNewBuilder = dv.newBuilder(dvVar2);
            duVarNewBuilder.mergeFrom((du) dvVar);
            dvVar = duVarNewBuilder.buildPartial();
        }
        this.history_ = dvVar;
        this.bitField0_ |= 4;
    }

    public static dw newBuilder() {
        return (dw) DEFAULT_INSTANCE.createBuilder();
    }

    public static dy parseDelimitedFrom(InputStream inputStream) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(com.google.v.v vVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBulkUpdatable(dx dxVar) {
        this.bulkUpdatable_ = dxVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoreVersionToken(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.coreVersionToken_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureReplacementInfo(dr drVar) {
        Objects.requireNonNull(drVar);
        this.featureReplacementInfo_ = drVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldMetadata(dn dnVar) {
        Objects.requireNonNull(dnVar);
        this.fieldMetadata_ = dnVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForwardings(dt dtVar) {
        Objects.requireNonNull(dtVar);
        this.forwardings_ = dtVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(dv dvVar) {
        Objects.requireNonNull(dvVar);
        this.history_ = dvVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionToken(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.versionToken_ = vVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ည\u0000\u0002ဉ\u0002\u0003᠌\u0003\u0004ᐉ\u0004\u0005ည\u0001\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"bitField0_", "versionToken_", "history_", "bulkUpdatable_", h.f11880i, "forwardings_", "coreVersionToken_", "fieldMetadata_", "featureReplacementInfo_"});
            case 3:
                return new dy();
            case 4:
                return new dw(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dy> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dy.class) {
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

    public dx getBulkUpdatable() {
        dx dxVarA = dx.a(this.bulkUpdatable_);
        return dxVarA == null ? dx.NOT_BULK_UPDATABLE : dxVarA;
    }

    public com.google.v.v getCoreVersionToken() {
        return this.coreVersionToken_;
    }

    public dr getFeatureReplacementInfo() {
        dr drVar = this.featureReplacementInfo_;
        return drVar == null ? dr.getDefaultInstance() : drVar;
    }

    public dn getFieldMetadata() {
        dn dnVar = this.fieldMetadata_;
        return dnVar == null ? dn.getDefaultInstance() : dnVar;
    }

    public dt getForwardings() {
        dt dtVar = this.forwardings_;
        return dtVar == null ? dt.getDefaultInstance() : dtVar;
    }

    public dv getHistory() {
        dv dvVar = this.history_;
        return dvVar == null ? dv.getDefaultInstance() : dvVar;
    }

    public com.google.v.v getVersionToken() {
        return this.versionToken_;
    }

    public boolean hasBulkUpdatable() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCoreVersionToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFeatureReplacementInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFieldMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasForwardings() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHistory() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVersionToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dw newBuilder(dy dyVar) {
        return (dw) DEFAULT_INSTANCE.createBuilder(dyVar);
    }

    public static dy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dy parseFrom(com.google.v.z zVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dy parseFrom(InputStream inputStream) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(ByteBuffer byteBuffer) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dy parseFrom(byte[] bArr) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
