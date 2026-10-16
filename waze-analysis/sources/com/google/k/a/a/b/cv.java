package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cv extends com.google.v.du<cv, ct> implements com.google.v.fj {
    public static final int CHILD_GROUP_FIELD_NUMBER = 3;
    private static final cv DEFAULT_INSTANCE;
    public static final int GROUP_TYPE_FIELD_NUMBER = 2;
    public static final int INTERSECTION_FIELD_NUMBER = 1;
    public static final int PARENT_GROUP_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<cv> PARSER;
    private int bitField0_;
    private bw parentGroup_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> intersection_ = emptyProtobufList();
    private int groupType_ = 1;
    private com.google.v.eo<bw> childGroup_ = emptyProtobufList();

    static {
        cv cvVar = new cv();
        DEFAULT_INSTANCE = cvVar;
        com.google.v.du.registerDefaultInstance(cv.class, cvVar);
    }

    private cv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildGroup(Iterable<? extends bw> iterable) {
        ensureChildGroupIsMutable();
        com.google.v.c.addAll(iterable, this.childGroup_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIntersection(Iterable<? extends bw> iterable) {
        ensureIntersectionIsMutable();
        com.google.v.c.addAll(iterable, this.intersection_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildGroup(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureChildGroupIsMutable();
        this.childGroup_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIntersection(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIntersectionIsMutable();
        this.intersection_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildGroup() {
        this.childGroup_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupType() {
        this.bitField0_ &= -2;
        this.groupType_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersection() {
        this.intersection_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentGroup() {
        this.parentGroup_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureChildGroupIsMutable() {
        com.google.v.eo<bw> eoVar = this.childGroup_;
        if (eoVar.c()) {
            return;
        }
        this.childGroup_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureIntersectionIsMutable() {
        com.google.v.eo<bw> eoVar = this.intersection_;
        if (eoVar.c()) {
            return;
        }
        this.intersection_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParentGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.parentGroup_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.parentGroup_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cv parseDelimitedFrom(InputStream inputStream) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(com.google.v.v vVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildGroup(int i2) {
        ensureChildGroupIsMutable();
        this.childGroup_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIntersection(int i2) {
        ensureIntersectionIsMutable();
        this.intersection_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildGroup(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureChildGroupIsMutable();
        this.childGroup_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupType(cu cuVar) {
        this.groupType_ = cuVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersection(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIntersectionIsMutable();
        this.intersection_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.parentGroup_ = bwVar;
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0003\u0001Л\u0002᠌\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"bitField0_", "intersection_", bw.class, "groupType_", c.q, "childGroup_", bw.class, "parentGroup_"});
            case 3:
                return new cv();
            case 4:
                return new ct(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<cv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cv.class) {
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

    public bw getChildGroup(int i2) {
        return this.childGroup_.get(i2);
    }

    public int getChildGroupCount() {
        return this.childGroup_.size();
    }

    public List<bw> getChildGroupList() {
        return this.childGroup_;
    }

    public bx getChildGroupOrBuilder(int i2) {
        return this.childGroup_.get(i2);
    }

    public List<? extends bx> getChildGroupOrBuilderList() {
        return this.childGroup_;
    }

    public cu getGroupType() {
        cu cuVarA = cu.a(this.groupType_);
        return cuVarA == null ? cu.GROUP_ARTIFACT : cuVarA;
    }

    public bw getIntersection(int i2) {
        return this.intersection_.get(i2);
    }

    public int getIntersectionCount() {
        return this.intersection_.size();
    }

    public List<bw> getIntersectionList() {
        return this.intersection_;
    }

    public bx getIntersectionOrBuilder(int i2) {
        return this.intersection_.get(i2);
    }

    public List<? extends bx> getIntersectionOrBuilderList() {
        return this.intersection_;
    }

    public bw getParentGroup() {
        bw bwVar = this.parentGroup_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public boolean hasGroupType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasParentGroup() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ct newBuilder(cv cvVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cvVar);
    }

    public static cv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cv parseFrom(com.google.v.z zVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureChildGroupIsMutable();
        this.childGroup_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIntersection(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIntersectionIsMutable();
        this.intersection_.add(bwVar);
    }

    public static cv parseFrom(InputStream inputStream) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(ByteBuffer byteBuffer) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cv parseFrom(byte[] bArr) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
