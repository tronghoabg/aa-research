package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fq extends com.google.v.du<fq, fp> implements com.google.v.fj {
    private static final fq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fq> PARSER;

    static {
        fq fqVar = new fq();
        DEFAULT_INSTANCE = fqVar;
        com.google.v.du.registerDefaultInstance(fq.class, fqVar);
    }

    private fq() {
    }

    public static fq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fp newBuilder() {
        return (fp) DEFAULT_INSTANCE.createBuilder();
    }

    public static fq parseDelimitedFrom(InputStream inputStream) {
        return (fq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fq parseFrom(com.google.v.v vVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fq> parser() {
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
            return new fq();
        }
        if (iOrdinal == 4) {
            return new fp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fp newBuilder(fq fqVar) {
        return (fp) DEFAULT_INSTANCE.createBuilder(fqVar);
    }

    public static fq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fq parseFrom(com.google.v.z zVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fq parseFrom(InputStream inputStream) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fq parseFrom(ByteBuffer byteBuffer) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fq parseFrom(byte[] bArr) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
