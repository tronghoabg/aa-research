package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.google.v.du<p, o> implements com.google.v.fj {
    private static final p DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<p> PARSER;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.v.du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<p> parser() {
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
            return new p();
        }
        if (iOrdinal == 4) {
            return new o(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static o newBuilder(p pVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (p) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
