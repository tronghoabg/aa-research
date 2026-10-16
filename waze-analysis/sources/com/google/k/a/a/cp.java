package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cp extends com.google.v.du<cp, cn> implements com.google.v.fj {
    private static final cp DEFAULT_INSTANCE;
    public static final int DIMENSION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cp> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private float dimension_;
    private int unit_;

    static {
        cp cpVar = new cp();
        DEFAULT_INSTANCE = cpVar;
        com.google.v.du.registerDefaultInstance(cp.class, cpVar);
    }

    private cp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimension() {
        this.bitField0_ &= -2;
        this.dimension_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.bitField0_ &= -3;
        this.unit_ = 0;
    }

    public static cp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cn newBuilder() {
        return (cn) DEFAULT_INSTANCE.createBuilder();
    }

    public static cp parseDelimitedFrom(InputStream inputStream) {
        return (cp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cp parseFrom(com.google.v.v vVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimension(float f2) {
        this.bitField0_ |= 1;
        this.dimension_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(co coVar) {
        this.unit_ = coVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "dimension_", "unit_", h.f11879h});
        }
        if (iOrdinal == 3) {
            return new cp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getDimension() {
        return this.dimension_;
    }

    public co getUnit() {
        co coVarA = co.a(this.unit_);
        return coVarA == null ? co.UNIT_UNKNOWN : coVarA;
    }

    public boolean hasDimension() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cn newBuilder(cp cpVar) {
        return (cn) DEFAULT_INSTANCE.createBuilder(cpVar);
    }

    public static cp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cp parseFrom(com.google.v.z zVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cp parseFrom(InputStream inputStream) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cp parseFrom(ByteBuffer byteBuffer) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cp parseFrom(byte[] bArr) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
