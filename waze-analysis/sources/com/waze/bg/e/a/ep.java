package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ep extends com.google.v.du<ep, eo> implements com.google.v.fj {
    private static final ep DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ep> PARSER;

    static {
        ep epVar = new ep();
        DEFAULT_INSTANCE = epVar;
        com.google.v.du.registerDefaultInstance(ep.class, epVar);
    }

    private ep() {
    }

    public static ep getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eo newBuilder() {
        return (eo) DEFAULT_INSTANCE.createBuilder();
    }

    public static ep parseDelimitedFrom(InputStream inputStream) {
        return (ep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ep parseFrom(com.google.v.v vVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ep> parser() {
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
            return new ep();
        }
        if (iOrdinal == 4) {
            return new eo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ep> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ep.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static eo newBuilder(ep epVar) {
        return (eo) DEFAULT_INSTANCE.createBuilder(epVar);
    }

    public static ep parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ep parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ep parseFrom(com.google.v.z zVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ep parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ep parseFrom(InputStream inputStream) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ep parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ep parseFrom(ByteBuffer byteBuffer) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ep parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ep parseFrom(byte[] bArr) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ep parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
