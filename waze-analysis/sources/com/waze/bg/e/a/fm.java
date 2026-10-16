package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fm extends com.google.v.du<fm, fl> implements com.google.v.fj {
    private static final fm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fm> PARSER;

    static {
        fm fmVar = new fm();
        DEFAULT_INSTANCE = fmVar;
        com.google.v.du.registerDefaultInstance(fm.class, fmVar);
    }

    private fm() {
    }

    public static fm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fl newBuilder() {
        return (fl) DEFAULT_INSTANCE.createBuilder();
    }

    public static fm parseDelimitedFrom(InputStream inputStream) {
        return (fm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fm parseFrom(com.google.v.v vVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fm> parser() {
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
            return new fm();
        }
        if (iOrdinal == 4) {
            return new fl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fl newBuilder(fm fmVar) {
        return (fl) DEFAULT_INSTANCE.createBuilder(fmVar);
    }

    public static fm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fm parseFrom(com.google.v.z zVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fm parseFrom(InputStream inputStream) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fm parseFrom(ByteBuffer byteBuffer) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fm parseFrom(byte[] bArr) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
