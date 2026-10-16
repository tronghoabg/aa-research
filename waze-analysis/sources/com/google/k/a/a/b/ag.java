package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag extends com.google.v.du<ag, af> implements com.google.v.fj {
    private static final ag DEFAULT_INSTANCE;
    public static final int FEATURE_ID_LEFT_FIELD_NUMBER = 3;
    public static final int FEATURE_ID_RIGHT_FIELD_NUMBER = 4;
    public static final int LOGICAL_BORDER_FIELD_NUMBER = 6;
    public static final int OVERRIDE_STATUS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ag> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private bw featureIdLeft_;
    private bw featureIdRight_;
    private int type_;
    private byte memoizedIsInitialized = 2;
    private int status_ = 1;
    private com.google.v.eo<ai> overrideStatus_ = emptyProtobufList();
    private com.google.v.eo<bw> logicalBorder_ = emptyProtobufList();

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        com.google.v.du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogicalBorder(Iterable<? extends bw> iterable) {
        ensureLogicalBorderIsMutable();
        com.google.v.c.addAll(iterable, this.logicalBorder_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOverrideStatus(Iterable<? extends ai> iterable) {
        ensureOverrideStatusIsMutable();
        com.google.v.c.addAll(iterable, this.overrideStatus_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogicalBorder(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureLogicalBorderIsMutable();
        this.logicalBorder_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOverrideStatus(int i2, ai aiVar) {
        Objects.requireNonNull(aiVar);
        ensureOverrideStatusIsMutable();
        this.overrideStatus_.add(i2, aiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureIdLeft() {
        this.featureIdLeft_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureIdRight() {
        this.featureIdRight_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalBorder() {
        this.logicalBorder_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverrideStatus() {
        this.overrideStatus_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -3;
        this.status_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureLogicalBorderIsMutable() {
        com.google.v.eo<bw> eoVar = this.logicalBorder_;
        if (eoVar.c()) {
            return;
        }
        this.logicalBorder_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureOverrideStatusIsMutable() {
        com.google.v.eo<ai> eoVar = this.overrideStatus_;
        if (eoVar.c()) {
            return;
        }
        this.overrideStatus_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureIdLeft(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.featureIdLeft_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureIdLeft_ = bwVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureIdRight(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.featureIdRight_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureIdRight_ = bwVar;
        this.bitField0_ |= 8;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogicalBorder(int i2) {
        ensureLogicalBorderIsMutable();
        this.logicalBorder_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOverrideStatus(int i2) {
        ensureOverrideStatusIsMutable();
        this.overrideStatus_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureIdLeft(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureIdLeft_ = bwVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureIdRight(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureIdRight_ = bwVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalBorder(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureLogicalBorderIsMutable();
        this.logicalBorder_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverrideStatus(int i2, ai aiVar) {
        Objects.requireNonNull(aiVar);
        ensureOverrideStatusIsMutable();
        this.overrideStatus_.set(i2, aiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ae aeVar) {
        this.status_ = aeVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i2) {
        this.bitField0_ |= 1;
        this.type_ = i2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0004\u0001ᔄ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005\u001b\u0006Л", new Object[]{"bitField0_", "type_", "status_", c.f11202f, "featureIdLeft_", "featureIdRight_", "overrideStatus_", ai.class, "logicalBorder_", bw.class});
            case 3:
                return new ag();
            case 4:
                return new af(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ag> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ag.class) {
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

    public bw getFeatureIdLeft() {
        bw bwVar = this.featureIdLeft_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getFeatureIdRight() {
        bw bwVar = this.featureIdRight_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getLogicalBorder(int i2) {
        return this.logicalBorder_.get(i2);
    }

    public int getLogicalBorderCount() {
        return this.logicalBorder_.size();
    }

    public List<bw> getLogicalBorderList() {
        return this.logicalBorder_;
    }

    public bx getLogicalBorderOrBuilder(int i2) {
        return this.logicalBorder_.get(i2);
    }

    public List<? extends bx> getLogicalBorderOrBuilderList() {
        return this.logicalBorder_;
    }

    public ai getOverrideStatus(int i2) {
        return this.overrideStatus_.get(i2);
    }

    public int getOverrideStatusCount() {
        return this.overrideStatus_.size();
    }

    public List<ai> getOverrideStatusList() {
        return this.overrideStatus_;
    }

    public aj getOverrideStatusOrBuilder(int i2) {
        return this.overrideStatus_.get(i2);
    }

    public List<? extends aj> getOverrideStatusOrBuilderList() {
        return this.overrideStatus_;
    }

    public ae getStatus() {
        ae aeVarA = ae.a(this.status_);
        return aeVarA == null ? ae.STATUS_NORMAL : aeVarA;
    }

    public int getType() {
        return this.type_;
    }

    public boolean hasFeatureIdLeft() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFeatureIdRight() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogicalBorder(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureLogicalBorderIsMutable();
        this.logicalBorder_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOverrideStatus(ai aiVar) {
        Objects.requireNonNull(aiVar);
        ensureOverrideStatusIsMutable();
        this.overrideStatus_.add(aiVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
