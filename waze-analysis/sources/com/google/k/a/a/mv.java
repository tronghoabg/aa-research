package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mv extends com.google.v.du<mv, mu> implements mw {
    private static final mv DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mv> PARSER = null;
    public static final int POSE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int index_;
    private com.google.v.eo<gx> pose_ = emptyProtobufList();

    static {
        mv mvVar = new mv();
        DEFAULT_INSTANCE = mvVar;
        com.google.v.du.registerDefaultInstance(mv.class, mvVar);
    }

    private mv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPose(Iterable<? extends gx> iterable) {
        ensurePoseIsMutable();
        com.google.v.c.addAll(iterable, this.pose_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPose(int i2, gx gxVar) {
        Objects.requireNonNull(gxVar);
        ensurePoseIsMutable();
        this.pose_.add(i2, gxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPose() {
        this.pose_ = emptyProtobufList();
    }

    private void ensurePoseIsMutable() {
        com.google.v.eo<gx> eoVar = this.pose_;
        if (eoVar.c()) {
            return;
        }
        this.pose_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static mv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static mu newBuilder() {
        return (mu) DEFAULT_INSTANCE.createBuilder();
    }

    public static mv parseDelimitedFrom(InputStream inputStream) {
        return (mv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mv parseFrom(com.google.v.v vVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePose(int i2) {
        ensurePoseIsMutable();
        this.pose_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 1;
        this.index_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPose(int i2, gx gxVar) {
        Objects.requireNonNull(gxVar);
        ensurePoseIsMutable();
        this.pose_.set(i2, gxVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"bitField0_", "index_", "pose_", gx.class});
        }
        if (iOrdinal == 3) {
            return new mv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getIndex() {
        return this.index_;
    }

    public gx getPose(int i2) {
        return this.pose_.get(i2);
    }

    public int getPoseCount() {
        return this.pose_.size();
    }

    public List<gx> getPoseList() {
        return this.pose_;
    }

    public gy getPoseOrBuilder(int i2) {
        return this.pose_.get(i2);
    }

    public List<? extends gy> getPoseOrBuilderList() {
        return this.pose_;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mu newBuilder(mv mvVar) {
        return (mu) DEFAULT_INSTANCE.createBuilder(mvVar);
    }

    public static mv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mv parseFrom(com.google.v.z zVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPose(gx gxVar) {
        Objects.requireNonNull(gxVar);
        ensurePoseIsMutable();
        this.pose_.add(gxVar);
    }

    public static mv parseFrom(InputStream inputStream) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mv parseFrom(ByteBuffer byteBuffer) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mv parseFrom(byte[] bArr) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
