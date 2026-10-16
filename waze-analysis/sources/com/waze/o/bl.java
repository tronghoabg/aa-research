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
public final class bl extends du<bl, bk> implements fj {
    private static final bl DEFAULT_INSTANCE;
    private static volatile fo<bl> PARSER;

    static {
        bl blVar = new bl();
        DEFAULT_INSTANCE = blVar;
        du.registerDefaultInstance(bl.class, blVar);
    }

    private bl() {
    }

    public static bl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bk newBuilder() {
        return (bk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bl parseDelimitedFrom(InputStream inputStream) {
        return (bl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bl parseFrom(com.google.v.v vVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bl> parser() {
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
            return new bl();
        }
        if (iOrdinal == 4) {
            return new bk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bk newBuilder(bl blVar) {
        return (bk) DEFAULT_INSTANCE.createBuilder(blVar);
    }

    public static bl parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bl parseFrom(com.google.v.v vVar, de deVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bl parseFrom(com.google.v.z zVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bl parseFrom(com.google.v.z zVar, de deVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bl parseFrom(InputStream inputStream) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bl parseFrom(InputStream inputStream, de deVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bl parseFrom(ByteBuffer byteBuffer) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bl parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bl parseFrom(byte[] bArr) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bl parseFrom(byte[] bArr, de deVar) {
        return (bl) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
