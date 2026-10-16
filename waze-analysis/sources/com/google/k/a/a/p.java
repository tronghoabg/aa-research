package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends com.google.v.du<p, m> implements q {
    private static final p DEFAULT_INSTANCE;
    public static final int DIFFUSE_COLOR_FIELD_NUMBER = 3;
    public static final int IS_SMOOTH_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<p> PARSER = null;
    public static final int SHININESS_FIELD_NUMBER = 4;
    public static final int TRANSPARENCY_FIELD_NUMBER = 5;
    private int bitField0_;
    private o diffuseColor_;
    private boolean isSmooth_;
    private String name_ = "";
    private float shininess_;
    private float transparency_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.v.du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiffuseColor() {
        this.diffuseColor_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSmooth() {
        this.bitField0_ &= -17;
        this.isSmooth_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShininess() {
        this.bitField0_ &= -5;
        this.shininess_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransparency() {
        this.bitField0_ &= -9;
        this.transparency_ = 0.0f;
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDiffuseColor(o oVar) {
        Objects.requireNonNull(oVar);
        o oVar2 = this.diffuseColor_;
        if (oVar2 != null && oVar2 != o.getDefaultInstance()) {
            n nVarNewBuilder = o.newBuilder(oVar2);
            nVarNewBuilder.mergeFrom((n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.diffuseColor_ = oVar;
        this.bitField0_ |= 2;
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiffuseColor(o oVar) {
        Objects.requireNonNull(oVar);
        this.diffuseColor_ = oVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSmooth(boolean z) {
        this.bitField0_ |= 16;
        this.isSmooth_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShininess(float f2) {
        this.bitField0_ |= 4;
        this.shininess_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransparency(float f2) {
        this.bitField0_ |= 8;
        this.transparency_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဉ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "name_", "diffuseColor_", "shininess_", "transparency_", "isSmooth_"});
        }
        if (iOrdinal == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new m(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getDiffuseColor() {
        o oVar = this.diffuseColor_;
        return oVar == null ? o.getDefaultInstance() : oVar;
    }

    public boolean getIsSmooth() {
        return this.isSmooth_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public float getShininess() {
        return this.shininess_;
    }

    public float getTransparency() {
        return this.transparency_;
    }

    public boolean hasDiffuseColor() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsSmooth() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShininess() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTransparency() {
        return (this.bitField0_ & 8) != 0;
    }

    public static m newBuilder(p pVar) {
        return (m) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
