package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dn extends com.google.v.du<dn, dm> implements com.google.v.fj {
    private static final dn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dn> PARSER;

    static {
        dn dnVar = new dn();
        DEFAULT_INSTANCE = dnVar;
        com.google.v.du.registerDefaultInstance(dn.class, dnVar);
    }

    private dn() {
    }

    public static dn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dm newBuilder() {
        return (dm) DEFAULT_INSTANCE.createBuilder();
    }

    public static dn parseDelimitedFrom(InputStream inputStream) {
        return (dn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dn parseFrom(com.google.v.v vVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dn> parser() {
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
            return new dn();
        }
        if (iOrdinal == 4) {
            return new dm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static dm newBuilder(dn dnVar) {
        return (dm) DEFAULT_INSTANCE.createBuilder(dnVar);
    }

    public static dn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dn parseFrom(com.google.v.z zVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dn parseFrom(InputStream inputStream) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dn parseFrom(ByteBuffer byteBuffer) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dn parseFrom(byte[] bArr) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
