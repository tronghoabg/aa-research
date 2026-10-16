package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al extends com.google.v.du<al, ak> implements com.google.v.fj {
    private static final al DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<al> PARSER;

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        com.google.v.du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
    }

    public static al parseDelimitedFrom(InputStream inputStream) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(com.google.v.v vVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<al> parser() {
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
            return new al();
        }
        if (iOrdinal == 4) {
            return new ak(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<al> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (al.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ak newBuilder(al alVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(alVar);
    }

    public static al parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static al parseFrom(com.google.v.z zVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static al parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static al parseFrom(InputStream inputStream) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(ByteBuffer byteBuffer) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static al parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static al parseFrom(byte[] bArr) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static al parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (al) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
