package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ge extends com.google.v.du<ge, gd> implements com.google.v.fj {
    private static final ge DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ge> PARSER;

    static {
        ge geVar = new ge();
        DEFAULT_INSTANCE = geVar;
        com.google.v.du.registerDefaultInstance(ge.class, geVar);
    }

    private ge() {
    }

    public static ge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gd newBuilder() {
        return (gd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ge parseDelimitedFrom(InputStream inputStream) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(com.google.v.v vVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ge> parser() {
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
            return new ge();
        }
        if (iOrdinal == 4) {
            return new gd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ge> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ge.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static gd newBuilder(ge geVar) {
        return (gd) DEFAULT_INSTANCE.createBuilder(geVar);
    }

    public static ge parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ge parseFrom(com.google.v.z zVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ge parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ge parseFrom(InputStream inputStream) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(ByteBuffer byteBuffer) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ge parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ge parseFrom(byte[] bArr) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ge parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
