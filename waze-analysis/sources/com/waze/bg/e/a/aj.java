package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj extends com.google.v.du<aj, ai> implements com.google.v.fj {
    private static final aj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aj> PARSER;

    static {
        aj ajVar = new aj();
        DEFAULT_INSTANCE = ajVar;
        com.google.v.du.registerDefaultInstance(aj.class, ajVar);
    }

    private aj() {
    }

    public static aj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ai newBuilder() {
        return (ai) DEFAULT_INSTANCE.createBuilder();
    }

    public static aj parseDelimitedFrom(InputStream inputStream) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(com.google.v.v vVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aj> parser() {
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
            return new aj();
        }
        if (iOrdinal == 4) {
            return new ai(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ai newBuilder(aj ajVar) {
        return (ai) DEFAULT_INSTANCE.createBuilder(ajVar);
    }

    public static aj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aj parseFrom(com.google.v.z zVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aj parseFrom(InputStream inputStream) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(ByteBuffer byteBuffer) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aj parseFrom(byte[] bArr) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
