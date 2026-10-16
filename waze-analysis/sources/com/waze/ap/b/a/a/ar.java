package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ar extends com.google.v.du<ar, aq> implements fj {
    private static final ar DEFAULT_INSTANCE;
    public static final int MIN_DISTANCE_METERS_FIELD_NUMBER = 1;
    public static final int MIN_SECONDS_FIELD_NUMBER = 2;
    private static volatile fo<ar> PARSER;
    private int bitField0_;
    private int minDistanceMeters_;
    private int minSeconds_;

    static {
        ar arVar = new ar();
        DEFAULT_INSTANCE = arVar;
        com.google.v.du.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinDistanceMeters() {
        this.bitField0_ &= -2;
        this.minDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinSeconds() {
        this.bitField0_ &= -3;
        this.minSeconds_ = 0;
    }

    public static ar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aq newBuilder() {
        return (aq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ar parseDelimitedFrom(InputStream inputStream) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(com.google.v.v vVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinDistanceMeters(int i2) {
        this.bitField0_ |= 1;
        this.minDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinSeconds(int i2) {
        this.bitField0_ |= 2;
        this.minSeconds_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "minDistanceMeters_", "minSeconds_"});
        }
        if (iOrdinal == 3) {
            return new ar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getMinDistanceMeters() {
        return this.minDistanceMeters_;
    }

    public int getMinSeconds() {
        return this.minSeconds_;
    }

    public boolean hasMinDistanceMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMinSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aq newBuilder(ar arVar) {
        return (aq) DEFAULT_INSTANCE.createBuilder(arVar);
    }

    public static ar parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ar parseFrom(com.google.v.z zVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ar parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ar parseFrom(InputStream inputStream) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(ByteBuffer byteBuffer) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ar parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ar parseFrom(byte[] bArr) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ar parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
