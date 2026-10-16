package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fy extends com.google.v.du<fy, fx> implements com.google.v.fj {
    private static final fy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fy> PARSER;

    static {
        fy fyVar = new fy();
        DEFAULT_INSTANCE = fyVar;
        com.google.v.du.registerDefaultInstance(fy.class, fyVar);
    }

    private fy() {
    }

    public static fy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fx newBuilder() {
        return (fx) DEFAULT_INSTANCE.createBuilder();
    }

    public static fy parseDelimitedFrom(InputStream inputStream) {
        return (fy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fy parseFrom(com.google.v.v vVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fy> parser() {
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
            return new fy();
        }
        if (iOrdinal == 4) {
            return new fx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fx newBuilder(fy fyVar) {
        return (fx) DEFAULT_INSTANCE.createBuilder(fyVar);
    }

    public static fy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fy parseFrom(com.google.v.z zVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fy parseFrom(InputStream inputStream) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fy parseFrom(ByteBuffer byteBuffer) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fy parseFrom(byte[] bArr) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
