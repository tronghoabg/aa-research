package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp extends du<bp, bo> implements fj {
    private static final bp DEFAULT_INSTANCE;
    private static volatile fo<bp> PARSER;

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        du.registerDefaultInstance(bp.class, bpVar);
    }

    private bp() {
    }

    public static bp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bo newBuilder() {
        return (bo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bp parseDelimitedFrom(InputStream inputStream) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(com.google.v.v vVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
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
            return new bp();
        }
        if (iOrdinal == 4) {
            return new bo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bo newBuilder(bp bpVar) {
        return (bo) DEFAULT_INSTANCE.createBuilder(bpVar);
    }

    public static bp parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(com.google.v.v vVar, de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bp parseFrom(com.google.v.z zVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bp parseFrom(com.google.v.z zVar, de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bp parseFrom(InputStream inputStream) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(InputStream inputStream, de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(ByteBuffer byteBuffer) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bp parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bp parseFrom(byte[] bArr) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bp parseFrom(byte[] bArr, de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
