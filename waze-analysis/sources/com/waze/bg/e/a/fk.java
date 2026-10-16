package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fk extends com.google.v.du<fk, fj> implements com.google.v.fj {
    private static final fk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fk> PARSER;

    static {
        fk fkVar = new fk();
        DEFAULT_INSTANCE = fkVar;
        com.google.v.du.registerDefaultInstance(fk.class, fkVar);
    }

    private fk() {
    }

    public static fk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fj newBuilder() {
        return (fj) DEFAULT_INSTANCE.createBuilder();
    }

    public static fk parseDelimitedFrom(InputStream inputStream) {
        return (fk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fk parseFrom(com.google.v.v vVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fk> parser() {
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
            return new fk();
        }
        if (iOrdinal == 4) {
            return new fj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fj newBuilder(fk fkVar) {
        return (fj) DEFAULT_INSTANCE.createBuilder(fkVar);
    }

    public static fk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fk parseFrom(com.google.v.z zVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fk parseFrom(InputStream inputStream) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fk parseFrom(ByteBuffer byteBuffer) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fk parseFrom(byte[] bArr) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
