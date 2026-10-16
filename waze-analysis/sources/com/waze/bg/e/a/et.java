package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class et extends com.google.v.du<et, es> implements com.google.v.fj {
    private static final et DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<et> PARSER;

    static {
        et etVar = new et();
        DEFAULT_INSTANCE = etVar;
        com.google.v.du.registerDefaultInstance(et.class, etVar);
    }

    private et() {
    }

    public static et getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static es newBuilder() {
        return (es) DEFAULT_INSTANCE.createBuilder();
    }

    public static et parseDelimitedFrom(InputStream inputStream) {
        return (et) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static et parseFrom(com.google.v.v vVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<et> parser() {
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
            return new et();
        }
        if (iOrdinal == 4) {
            return new es(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<et> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (et.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static es newBuilder(et etVar) {
        return (es) DEFAULT_INSTANCE.createBuilder(etVar);
    }

    public static et parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (et) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static et parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static et parseFrom(com.google.v.z zVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static et parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static et parseFrom(InputStream inputStream) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static et parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static et parseFrom(ByteBuffer byteBuffer) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static et parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static et parseFrom(byte[] bArr) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static et parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (et) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
