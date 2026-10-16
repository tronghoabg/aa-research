package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bj extends com.google.v.du<bj, bi> implements fj {
    private static final bj DEFAULT_INSTANCE;
    private static volatile fo<bj> PARSER;

    static {
        bj bjVar = new bj();
        DEFAULT_INSTANCE = bjVar;
        com.google.v.du.registerDefaultInstance(bj.class, bjVar);
    }

    private bj() {
    }

    public static bj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bi newBuilder() {
        return (bi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bj parseDelimitedFrom(InputStream inputStream) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(com.google.v.v vVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new bj();
        }
        if (iOrdinal == 4) {
            return new bi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bi newBuilder(bj bjVar) {
        return (bi) DEFAULT_INSTANCE.createBuilder(bjVar);
    }

    public static bj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bj parseFrom(com.google.v.z zVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bj parseFrom(InputStream inputStream) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(ByteBuffer byteBuffer) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bj parseFrom(byte[] bArr) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
