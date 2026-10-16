package com.waze.copilot;

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
public final class y extends du<y, x> implements fj {
    private static final y DEFAULT_INSTANCE;
    private static volatile fo<y> PARSER;

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        du.registerDefaultInstance(y.class, yVar);
    }

    private y() {
    }

    public static y getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static y parseDelimitedFrom(InputStream inputStream) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(com.google.v.v vVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<y> parser() {
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
            return new y();
        }
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<y> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (y.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static x newBuilder(y yVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(yVar);
    }

    public static y parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(com.google.v.v vVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static y parseFrom(com.google.v.z zVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static y parseFrom(com.google.v.z zVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static y parseFrom(InputStream inputStream) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(InputStream inputStream, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(ByteBuffer byteBuffer) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static y parseFrom(byte[] bArr) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y parseFrom(byte[] bArr, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
