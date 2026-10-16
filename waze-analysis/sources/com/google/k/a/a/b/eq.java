package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eq extends com.google.v.du<eq, eo> implements com.google.v.fj {
    public static final int ANGLE_DEGREES_FIELD_NUMBER = 6;
    public static final int CROSSING_TYPE_FIELD_NUMBER = 1;
    public static final int CROSS_ANYWHERE_FIELD_NUMBER = 5;
    private static final eq DEFAULT_INSTANCE;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<eq> PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private double angleDegrees_;
    private int bitField0_;
    private boolean crossAnywhere_;
    private float offset_;
    private float width_;
    private byte memoizedIsInitialized = 2;
    private int crossingType_ = 1;
    private com.google.v.eo<gk> restriction_ = emptyProtobufList();

    static {
        eq eqVar = new eq();
        DEFAULT_INSTANCE = eqVar;
        com.google.v.du.registerDefaultInstance(eq.class, eqVar);
    }

    private eq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestriction(Iterable<? extends gk> iterable) {
        ensureRestrictionIsMutable();
        com.google.v.c.addAll(iterable, this.restriction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(int i2, gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(i2, gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngleDegrees() {
        this.bitField0_ &= -17;
        this.angleDegrees_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossAnywhere() {
        this.bitField0_ &= -9;
        this.crossAnywhere_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossingType() {
        this.bitField0_ &= -2;
        this.crossingType_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.bitField0_ &= -3;
        this.offset_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.bitField0_ &= -5;
        this.width_ = 0.0f;
    }

    private void ensureRestrictionIsMutable() {
        com.google.v.eo<gk> eoVar = this.restriction_;
        if (eoVar.c()) {
            return;
        }
        this.restriction_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static eq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eo newBuilder() {
        return (eo) DEFAULT_INSTANCE.createBuilder();
    }

    public static eq parseDelimitedFrom(InputStream inputStream) {
        return (eq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eq parseFrom(com.google.v.v vVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRestriction(int i2) {
        ensureRestrictionIsMutable();
        this.restriction_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleDegrees(double d2) {
        this.bitField0_ |= 16;
        this.angleDegrees_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossAnywhere(boolean z) {
        this.bitField0_ |= 8;
        this.crossAnywhere_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossingType(ep epVar) {
        this.crossingType_ = epVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(float f2) {
        this.bitField0_ |= 2;
        this.offset_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(int i2, gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.set(i2, gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(float f2) {
        this.bitField0_ |= 4;
        this.width_ = f2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001᠌\u0000\u0002Л\u0003ခ\u0001\u0004ခ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"bitField0_", "crossingType_", dq.f11272d, "restriction_", gk.class, "offset_", "width_", "crossAnywhere_", "angleDegrees_"});
            case 3:
                return new eq();
            case 4:
                return new eo(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<eq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (eq.class) {
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

    public double getAngleDegrees() {
        return this.angleDegrees_;
    }

    public boolean getCrossAnywhere() {
        return this.crossAnywhere_;
    }

    public ep getCrossingType() {
        ep epVarA = ep.a(this.crossingType_);
        return epVarA == null ? ep.CROSSABLE : epVarA;
    }

    public float getOffset() {
        return this.offset_;
    }

    public gk getRestriction(int i2) {
        return this.restriction_.get(i2);
    }

    public int getRestrictionCount() {
        return this.restriction_.size();
    }

    public List<gk> getRestrictionList() {
        return this.restriction_;
    }

    public gl getRestrictionOrBuilder(int i2) {
        return this.restriction_.get(i2);
    }

    public List<? extends gl> getRestrictionOrBuilderList() {
        return this.restriction_;
    }

    public float getWidth() {
        return this.width_;
    }

    public boolean hasAngleDegrees() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCrossAnywhere() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCrossingType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWidth() {
        return (this.bitField0_ & 4) != 0;
    }

    public static eo newBuilder(eq eqVar) {
        return (eo) DEFAULT_INSTANCE.createBuilder(eqVar);
    }

    public static eq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eq parseFrom(com.google.v.z zVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(gkVar);
    }

    public static eq parseFrom(InputStream inputStream) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eq parseFrom(ByteBuffer byteBuffer) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eq parseFrom(byte[] bArr) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
