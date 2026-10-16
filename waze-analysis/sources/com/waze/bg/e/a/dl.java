package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dl extends com.google.v.du<dl, dk> implements com.google.v.fj {
    private static final dl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dl> PARSER;

    static {
        dl dlVar = new dl();
        DEFAULT_INSTANCE = dlVar;
        com.google.v.du.registerDefaultInstance(dl.class, dlVar);
    }

    private dl() {
    }

    public static dl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dk newBuilder() {
        return (dk) DEFAULT_INSTANCE.createBuilder();
    }

    public static dl parseDelimitedFrom(InputStream inputStream) {
        return (dl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dl parseFrom(com.google.v.v vVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dl> parser() {
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
            return new dl();
        }
        if (iOrdinal == 4) {
            return new dk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static dk newBuilder(dl dlVar) {
        return (dk) DEFAULT_INSTANCE.createBuilder(dlVar);
    }

    public static dl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dl parseFrom(com.google.v.z zVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dl parseFrom(InputStream inputStream) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dl parseFrom(ByteBuffer byteBuffer) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dl parseFrom(byte[] bArr) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
