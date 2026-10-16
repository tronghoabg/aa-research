package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class li extends com.google.v.du<li, lh> implements lj {
    private static final li DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<li> PARSER = null;
    public static final int SLOPE_VALUE_FIELD_NUMBER = 2;
    public static final int START_POINT_FRACTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private float slopeValue_;
    private float startPointFraction_;

    static {
        li liVar = new li();
        DEFAULT_INSTANCE = liVar;
        com.google.v.du.registerDefaultInstance(li.class, liVar);
    }

    private li() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlopeValue() {
        this.bitField0_ &= -3;
        this.slopeValue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartPointFraction() {
        this.bitField0_ &= -2;
        this.startPointFraction_ = 0.0f;
    }

    public static li getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lh newBuilder() {
        return (lh) DEFAULT_INSTANCE.createBuilder();
    }

    public static li parseDelimitedFrom(InputStream inputStream) {
        return (li) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static li parseFrom(com.google.v.v vVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<li> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlopeValue(float f2) {
        this.bitField0_ |= 2;
        this.slopeValue_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartPointFraction(float f2) {
        this.bitField0_ |= 1;
        this.startPointFraction_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "startPointFraction_", "slopeValue_"});
        }
        if (iOrdinal == 3) {
            return new li();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<li> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (li.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getSlopeValue() {
        return this.slopeValue_;
    }

    public float getStartPointFraction() {
        return this.startPointFraction_;
    }

    public boolean hasSlopeValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStartPointFraction() {
        return (this.bitField0_ & 1) != 0;
    }

    public static lh newBuilder(li liVar) {
        return (lh) DEFAULT_INSTANCE.createBuilder(liVar);
    }

    public static li parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (li) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static li parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static li parseFrom(com.google.v.z zVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static li parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static li parseFrom(InputStream inputStream) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static li parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static li parseFrom(ByteBuffer byteBuffer) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static li parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static li parseFrom(byte[] bArr) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static li parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (li) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
