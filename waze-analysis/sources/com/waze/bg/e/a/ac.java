package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends com.google.v.du<ac, ab> implements com.google.v.fj {
    private static final ac DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ac> PARSER;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        com.google.v.du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ab newBuilder() {
        return (ab) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ac> parser() {
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
            return new ac();
        }
        if (iOrdinal == 4) {
            return new ab(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ab newBuilder(ac acVar) {
        return (ab) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
