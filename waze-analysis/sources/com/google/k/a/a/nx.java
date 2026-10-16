package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nx extends com.google.v.du<nx, nw> implements com.google.v.fj {
    private static final nx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nx> PARSER;

    static {
        nx nxVar = new nx();
        DEFAULT_INSTANCE = nxVar;
        com.google.v.du.registerDefaultInstance(nx.class, nxVar);
    }

    private nx() {
    }

    public static nx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nw newBuilder() {
        return (nw) DEFAULT_INSTANCE.createBuilder();
    }

    public static nx parseDelimitedFrom(InputStream inputStream) {
        return (nx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nx parseFrom(com.google.v.v vVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nx> parser() {
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
            return new nx();
        }
        if (iOrdinal == 4) {
            return new nw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static nw newBuilder(nx nxVar) {
        return (nw) DEFAULT_INSTANCE.createBuilder(nxVar);
    }

    public static nx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nx parseFrom(com.google.v.z zVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nx parseFrom(InputStream inputStream) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nx parseFrom(ByteBuffer byteBuffer) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nx parseFrom(byte[] bArr) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
