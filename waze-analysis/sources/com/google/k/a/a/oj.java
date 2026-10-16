package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class oj extends com.google.v.du<oj, oi> implements com.google.v.fj {
    private static final oj DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<oj> PARSER;
    private int bitField0_;
    private float level_;

    static {
        oj ojVar = new oj();
        DEFAULT_INSTANCE = ojVar;
        com.google.v.du.registerDefaultInstance(oj.class, ojVar);
    }

    private oj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.bitField0_ &= -2;
        this.level_ = 0.0f;
    }

    public static oj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oi newBuilder() {
        return (oi) DEFAULT_INSTANCE.createBuilder();
    }

    public static oj parseDelimitedFrom(InputStream inputStream) {
        return (oj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oj parseFrom(com.google.v.v vVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(float f2) {
        this.bitField0_ |= 1;
        this.level_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "level_"});
        }
        if (iOrdinal == 3) {
            return new oj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getLevel() {
        return this.level_;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static oi newBuilder(oj ojVar) {
        return (oi) DEFAULT_INSTANCE.createBuilder(ojVar);
    }

    public static oj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oj parseFrom(com.google.v.z zVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oj parseFrom(InputStream inputStream) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oj parseFrom(ByteBuffer byteBuffer) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oj parseFrom(byte[] bArr) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
