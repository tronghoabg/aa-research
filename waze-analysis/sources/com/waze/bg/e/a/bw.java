package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw extends com.google.v.du<bw, bv> implements com.google.v.fj {
    private static final bw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bw> PARSER;

    static {
        bw bwVar = new bw();
        DEFAULT_INSTANCE = bwVar;
        com.google.v.du.registerDefaultInstance(bw.class, bwVar);
    }

    private bw() {
    }

    public static bw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bw parseDelimitedFrom(InputStream inputStream) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(com.google.v.v vVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bw> parser() {
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
            return new bw();
        }
        if (iOrdinal == 4) {
            return new bv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bv newBuilder(bw bwVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bwVar);
    }

    public static bw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bw parseFrom(com.google.v.z zVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bw parseFrom(InputStream inputStream) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(ByteBuffer byteBuffer) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bw parseFrom(byte[] bArr) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
