package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ax extends du<ax, aw> implements fj {
    private static final ax DEFAULT_INSTANCE;
    private static volatile fo<ax> PARSER;

    static {
        ax axVar = new ax();
        DEFAULT_INSTANCE = axVar;
        du.registerDefaultInstance(ax.class, axVar);
    }

    private ax() {
    }

    public static ax getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aw newBuilder() {
        return (aw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ax parseDelimitedFrom(InputStream inputStream) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(com.google.v.v vVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ax> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ax();
        }
        if (iOrdinal == 4) {
            return new aw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ax> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ax.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aw newBuilder(ax axVar) {
        return (aw) DEFAULT_INSTANCE.createBuilder(axVar);
    }

    public static ax parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(com.google.v.v vVar, de deVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ax parseFrom(com.google.v.z zVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ax parseFrom(com.google.v.z zVar, de deVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ax parseFrom(InputStream inputStream) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(InputStream inputStream, de deVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(ByteBuffer byteBuffer) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ax parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ax parseFrom(byte[] bArr) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ax parseFrom(byte[] bArr, de deVar) {
        return (ax) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
