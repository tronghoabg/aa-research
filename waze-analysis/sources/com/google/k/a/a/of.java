package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class of extends com.google.v.du<of, oe> implements com.google.v.fj {
    private static final of DEFAULT_INSTANCE;
    public static final int MAX_OCCUPANCY_FIELD_NUMBER = 2;
    public static final int MIN_OCCUPANCY_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<of> PARSER;
    private int bitField0_;
    private int maxOccupancy_;
    private int minOccupancy_;

    static {
        of ofVar = new of();
        DEFAULT_INSTANCE = ofVar;
        com.google.v.du.registerDefaultInstance(of.class, ofVar);
    }

    private of() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxOccupancy() {
        this.bitField0_ &= -3;
        this.maxOccupancy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinOccupancy() {
        this.bitField0_ &= -2;
        this.minOccupancy_ = 0;
    }

    public static of getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oe newBuilder() {
        return (oe) DEFAULT_INSTANCE.createBuilder();
    }

    public static of parseDelimitedFrom(InputStream inputStream) {
        return (of) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static of parseFrom(com.google.v.v vVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<of> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxOccupancy(int i2) {
        this.bitField0_ |= 2;
        this.maxOccupancy_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinOccupancy(int i2) {
        this.bitField0_ |= 1;
        this.minOccupancy_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "minOccupancy_", "maxOccupancy_"});
        }
        if (iOrdinal == 3) {
            return new of();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<of> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (of.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getMaxOccupancy() {
        return this.maxOccupancy_;
    }

    public int getMinOccupancy() {
        return this.minOccupancy_;
    }

    public boolean hasMaxOccupancy() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMinOccupancy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static oe newBuilder(of ofVar) {
        return (oe) DEFAULT_INSTANCE.createBuilder(ofVar);
    }

    public static of parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (of) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static of parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static of parseFrom(com.google.v.z zVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static of parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static of parseFrom(InputStream inputStream) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static of parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static of parseFrom(ByteBuffer byteBuffer) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static of parseFrom(byte[] bArr) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static of parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (of) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
