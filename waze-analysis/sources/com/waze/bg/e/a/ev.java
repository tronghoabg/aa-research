package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ev extends com.google.v.du<ev, eu> implements com.google.v.fj {
    private static final ev DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ev> PARSER;

    static {
        ev evVar = new ev();
        DEFAULT_INSTANCE = evVar;
        com.google.v.du.registerDefaultInstance(ev.class, evVar);
    }

    private ev() {
    }

    public static ev getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eu newBuilder() {
        return (eu) DEFAULT_INSTANCE.createBuilder();
    }

    public static ev parseDelimitedFrom(InputStream inputStream) {
        return (ev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ev parseFrom(com.google.v.v vVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ev> parser() {
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
            return new ev();
        }
        if (iOrdinal == 4) {
            return new eu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ev> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ev.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static eu newBuilder(ev evVar) {
        return (eu) DEFAULT_INSTANCE.createBuilder(evVar);
    }

    public static ev parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ev parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ev parseFrom(com.google.v.z zVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ev parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ev parseFrom(InputStream inputStream) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ev parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ev parseFrom(ByteBuffer byteBuffer) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ev parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ev parseFrom(byte[] bArr) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ev parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
