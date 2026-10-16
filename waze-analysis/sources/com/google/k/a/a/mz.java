package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mz extends com.google.v.du<mz, my> implements com.google.v.fj {
    private static final mz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<mz> PARSER;

    static {
        mz mzVar = new mz();
        DEFAULT_INSTANCE = mzVar;
        com.google.v.du.registerDefaultInstance(mz.class, mzVar);
    }

    private mz() {
    }

    public static mz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static my newBuilder() {
        return (my) DEFAULT_INSTANCE.createBuilder();
    }

    public static mz parseDelimitedFrom(InputStream inputStream) {
        return (mz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mz parseFrom(com.google.v.v vVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mz> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new mz();
        }
        if (iOrdinal == 4) {
            return new my(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static my newBuilder(mz mzVar) {
        return (my) DEFAULT_INSTANCE.createBuilder(mzVar);
    }

    public static mz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mz parseFrom(com.google.v.z zVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mz parseFrom(InputStream inputStream) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mz parseFrom(ByteBuffer byteBuffer) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mz parseFrom(byte[] bArr) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
