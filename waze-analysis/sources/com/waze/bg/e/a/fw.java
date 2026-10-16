package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fw extends com.google.v.du<fw, fv> implements com.google.v.fj {
    private static final fw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fw> PARSER;

    static {
        fw fwVar = new fw();
        DEFAULT_INSTANCE = fwVar;
        com.google.v.du.registerDefaultInstance(fw.class, fwVar);
    }

    private fw() {
    }

    public static fw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fv newBuilder() {
        return (fv) DEFAULT_INSTANCE.createBuilder();
    }

    public static fw parseDelimitedFrom(InputStream inputStream) {
        return (fw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fw parseFrom(com.google.v.v vVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fw> parser() {
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
            return new fw();
        }
        if (iOrdinal == 4) {
            return new fv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fv newBuilder(fw fwVar) {
        return (fv) DEFAULT_INSTANCE.createBuilder(fwVar);
    }

    public static fw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fw parseFrom(com.google.v.z zVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fw parseFrom(InputStream inputStream) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fw parseFrom(ByteBuffer byteBuffer) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fw parseFrom(byte[] bArr) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
