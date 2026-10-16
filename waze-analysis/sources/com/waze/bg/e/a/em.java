package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class em extends com.google.v.du<em, el> implements com.google.v.fj {
    private static final em DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<em> PARSER;

    static {
        em emVar = new em();
        DEFAULT_INSTANCE = emVar;
        com.google.v.du.registerDefaultInstance(em.class, emVar);
    }

    private em() {
    }

    public static em getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static el newBuilder() {
        return (el) DEFAULT_INSTANCE.createBuilder();
    }

    public static em parseDelimitedFrom(InputStream inputStream) {
        return (em) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static em parseFrom(com.google.v.v vVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<em> parser() {
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
            return new em();
        }
        if (iOrdinal == 4) {
            return new el(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<em> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (em.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static el newBuilder(em emVar) {
        return (el) DEFAULT_INSTANCE.createBuilder(emVar);
    }

    public static em parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (em) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static em parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static em parseFrom(com.google.v.z zVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static em parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static em parseFrom(InputStream inputStream) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static em parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static em parseFrom(ByteBuffer byteBuffer) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static em parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static em parseFrom(byte[] bArr) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static em parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
