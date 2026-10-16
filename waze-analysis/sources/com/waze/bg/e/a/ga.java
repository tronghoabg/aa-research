package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ga extends com.google.v.du<ga, fz> implements com.google.v.fj {
    private static final ga DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ga> PARSER;

    static {
        ga gaVar = new ga();
        DEFAULT_INSTANCE = gaVar;
        com.google.v.du.registerDefaultInstance(ga.class, gaVar);
    }

    private ga() {
    }

    public static ga getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fz newBuilder() {
        return (fz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ga parseDelimitedFrom(InputStream inputStream) {
        return (ga) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ga parseFrom(com.google.v.v vVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ga> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ga();
        }
        if (iOrdinal == 4) {
            return new fz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ga> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ga.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fz newBuilder(ga gaVar) {
        return (fz) DEFAULT_INSTANCE.createBuilder(gaVar);
    }

    public static ga parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ga) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ga parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ga parseFrom(com.google.v.z zVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ga parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ga parseFrom(InputStream inputStream) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ga parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ga parseFrom(ByteBuffer byteBuffer) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ga parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ga parseFrom(byte[] bArr) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ga parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ga) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
