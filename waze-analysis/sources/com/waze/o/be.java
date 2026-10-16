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
public final class be extends du<be, bd> implements fj {
    private static final be DEFAULT_INSTANCE;
    private static volatile fo<be> PARSER;

    static {
        be beVar = new be();
        DEFAULT_INSTANCE = beVar;
        du.registerDefaultInstance(be.class, beVar);
    }

    private be() {
    }

    public static be getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bd newBuilder() {
        return (bd) DEFAULT_INSTANCE.createBuilder();
    }

    public static be parseDelimitedFrom(InputStream inputStream) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(com.google.v.v vVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<be> parser() {
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
            return new be();
        }
        if (iOrdinal == 4) {
            return new bd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<be> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (be.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bd newBuilder(be beVar) {
        return (bd) DEFAULT_INSTANCE.createBuilder(beVar);
    }

    public static be parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(com.google.v.v vVar, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static be parseFrom(com.google.v.z zVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static be parseFrom(com.google.v.z zVar, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static be parseFrom(InputStream inputStream) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(InputStream inputStream, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(ByteBuffer byteBuffer) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static be parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static be parseFrom(byte[] bArr) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static be parseFrom(byte[] bArr, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
