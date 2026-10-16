package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fo extends com.google.v.du<fo, fn> implements com.google.v.fj {
    private static final fo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fo> PARSER;

    static {
        fo foVar = new fo();
        DEFAULT_INSTANCE = foVar;
        com.google.v.du.registerDefaultInstance(fo.class, foVar);
    }

    private fo() {
    }

    public static fo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fn newBuilder() {
        return (fn) DEFAULT_INSTANCE.createBuilder();
    }

    public static fo parseDelimitedFrom(InputStream inputStream) {
        return (fo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fo parseFrom(com.google.v.v vVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fo> parser() {
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
            return new fo();
        }
        if (iOrdinal == 4) {
            return new fn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fn newBuilder(fo foVar) {
        return (fn) DEFAULT_INSTANCE.createBuilder(foVar);
    }

    public static fo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fo parseFrom(com.google.v.z zVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fo parseFrom(InputStream inputStream) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fo parseFrom(ByteBuffer byteBuffer) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fo parseFrom(byte[] bArr) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
