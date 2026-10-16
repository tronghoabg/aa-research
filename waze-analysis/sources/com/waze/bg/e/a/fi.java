package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fi extends com.google.v.du<fi, fh> implements com.google.v.fj {
    private static final fi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fi> PARSER;

    static {
        fi fiVar = new fi();
        DEFAULT_INSTANCE = fiVar;
        com.google.v.du.registerDefaultInstance(fi.class, fiVar);
    }

    private fi() {
    }

    public static fi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fh newBuilder() {
        return (fh) DEFAULT_INSTANCE.createBuilder();
    }

    public static fi parseDelimitedFrom(InputStream inputStream) {
        return (fi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fi parseFrom(com.google.v.v vVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fi> parser() {
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
            return new fi();
        }
        if (iOrdinal == 4) {
            return new fh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fh newBuilder(fi fiVar) {
        return (fh) DEFAULT_INSTANCE.createBuilder(fiVar);
    }

    public static fi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fi parseFrom(com.google.v.z zVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fi parseFrom(InputStream inputStream) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fi parseFrom(ByteBuffer byteBuffer) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fi parseFrom(byte[] bArr) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
