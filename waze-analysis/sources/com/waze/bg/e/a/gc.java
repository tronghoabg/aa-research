package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gc extends com.google.v.du<gc, gb> implements com.google.v.fj {
    private static final gc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gc> PARSER;

    static {
        gc gcVar = new gc();
        DEFAULT_INSTANCE = gcVar;
        com.google.v.du.registerDefaultInstance(gc.class, gcVar);
    }

    private gc() {
    }

    public static gc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gb newBuilder() {
        return (gb) DEFAULT_INSTANCE.createBuilder();
    }

    public static gc parseDelimitedFrom(InputStream inputStream) {
        return (gc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gc parseFrom(com.google.v.v vVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gc> parser() {
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
            return new gc();
        }
        if (iOrdinal == 4) {
            return new gb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static gb newBuilder(gc gcVar) {
        return (gb) DEFAULT_INSTANCE.createBuilder(gcVar);
    }

    public static gc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gc parseFrom(com.google.v.z zVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gc parseFrom(InputStream inputStream) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gc parseFrom(ByteBuffer byteBuffer) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gc parseFrom(byte[] bArr) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
