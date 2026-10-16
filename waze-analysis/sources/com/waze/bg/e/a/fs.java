package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fs extends com.google.v.du<fs, fr> implements com.google.v.fj {
    private static final fs DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fs> PARSER;

    static {
        fs fsVar = new fs();
        DEFAULT_INSTANCE = fsVar;
        com.google.v.du.registerDefaultInstance(fs.class, fsVar);
    }

    private fs() {
    }

    public static fs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fr newBuilder() {
        return (fr) DEFAULT_INSTANCE.createBuilder();
    }

    public static fs parseDelimitedFrom(InputStream inputStream) {
        return (fs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fs parseFrom(com.google.v.v vVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fs> parser() {
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
            return new fs();
        }
        if (iOrdinal == 4) {
            return new fr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fr newBuilder(fs fsVar) {
        return (fr) DEFAULT_INSTANCE.createBuilder(fsVar);
    }

    public static fs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fs parseFrom(com.google.v.z zVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fs parseFrom(InputStream inputStream) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fs parseFrom(ByteBuffer byteBuffer) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fs parseFrom(byte[] bArr) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
