package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nc extends com.google.v.du<nc, nb> implements com.google.v.fj {
    private static final nc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nc> PARSER;

    static {
        nc ncVar = new nc();
        DEFAULT_INSTANCE = ncVar;
        com.google.v.du.registerDefaultInstance(nc.class, ncVar);
    }

    private nc() {
    }

    public static nc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nb newBuilder() {
        return (nb) DEFAULT_INSTANCE.createBuilder();
    }

    public static nc parseDelimitedFrom(InputStream inputStream) {
        return (nc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nc parseFrom(com.google.v.v vVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nc> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new nc();
        }
        if (iOrdinal == 4) {
            return new nb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static nb newBuilder(nc ncVar) {
        return (nb) DEFAULT_INSTANCE.createBuilder(ncVar);
    }

    public static nc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nc parseFrom(com.google.v.z zVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nc parseFrom(InputStream inputStream) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nc parseFrom(ByteBuffer byteBuffer) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nc parseFrom(byte[] bArr) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
